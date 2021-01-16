package com.learn.effective_java.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Serializable subclass of nonserializable stateful class
public class Foo extends AbstractFoo implements Serializable {

	private static final long serialVersionUID = 7085056423517261362L;

	private void readObject(ObjectInputStream s) throws ClassNotFoundException, IOException {
		s.defaultReadObject();

		// Manually deserialize and initialize superclass state
		int x = s.readInt();
		int y = s.readInt();

		initialize(x, y);
	}

	private void writeObject(ObjectOutputStream s) throws IOException {
		s.defaultWriteObject();

		// Manually serialize superclass state
		s.writeInt(getX());
		s.writeInt(getY());
	}

	// constructor doesn't use the fancy mechanism
	public Foo(int x, int y) {
		super(x, y);
	}

}

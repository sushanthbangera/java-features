package com.learn.effective_java.serialization;

import java.util.concurrent.atomic.AtomicReference;

// Nonserializable stateful class allowing serializable subclasses
public abstract class AbstractFoo {

	private int x;

	private int y;

	private enum State {
		NEW, INITIALIZING, INITIALIZED
	};

	private final AtomicReference<State> init = new AtomicReference<State>(State.NEW);

	public AbstractFoo(int x, int y) {
		initialize(x, y);
	}
	
	// This constructor and the following method allow subclass's readObject 
	// method to initialize our state
	public AbstractFoo() {
	}

	protected final void initialize(int x, int y) {
		if(!init.compareAndSet(State.NEW, State.INITIALIZING)) {
			throw new IllegalStateException("Already initialized");
		}
		this.x = x;
		this.y = y;
		
		// Do anything esle the original constructor did
		init.set(State.INITIALIZED);
	}
	
	// These methods provided access to internal state so it can
	// be manually serialized by subclass's writeobject method.
	protected final int getX() {
		checkInit();
		return x;
	}
	
	protected final int getY() {
		checkInit();
		return y;
	}
	
	private void checkInit() {
		if (init.get() != State.INITIALIZED) {
			throw new IllegalStateException("Uninitialized");
		}
	}
	
	// Rest of the implementation continues
	
}

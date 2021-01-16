package com.learn.streams;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.learn.streams.Person.Gender;

public class StreamsGroupBy {

	private static DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<Person>();
		try {
			persons.add(new Person(1, "Yashwant", dateFormat.parse("11/02/1982"), Gender.MALE));
			persons.add(new Person(2, "Mahesh", dateFormat.parse("01/08/1981"), Gender.MALE));
			persons.add(new Person(3, "Vinay", dateFormat.parse("01/08/1981"), Gender.MALE));
			persons.add(new Person(4, "Dinesh", dateFormat.parse("01/08/1981"), Gender.MALE));
			persons.add(new Person(5, "Kapil", dateFormat.parse("01/02/1989"), Gender.MALE));
			persons.add(new Person(6, "Ganesh", dateFormat.parse("11/02/1982"), Gender.MALE));
			persons.add(new Person(7, "Nita", dateFormat.parse("01/08/1981"), Gender.FEMALE));
			persons.add(new Person(8, "Pallavi", dateFormat.parse("04/25/1987"), Gender.FEMALE));
			persons.add(new Person(9, "Mayuri", dateFormat.parse("01/08/1981"), Gender.FEMALE));
			persons.add(new Person(10, "Divya", dateFormat.parse("01/08/1981"), Gender.FEMALE));

		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		// Group by gender
		Map<Person.Gender, Long> genderCount = persons.stream()
				.collect(Collectors.groupingBy(p -> p.getGender(), Collectors.counting()));
		
		System.out.println(genderCount);
		
		//group by birthdate
		
		Map<Object, Long> birthDateTally = persons.stream()
				.collect(Collectors.groupingBy(p -> dateFormat.format(p.getBirthDate()), Collectors.counting()));
		System.out.println(birthDateTally);
	}
}

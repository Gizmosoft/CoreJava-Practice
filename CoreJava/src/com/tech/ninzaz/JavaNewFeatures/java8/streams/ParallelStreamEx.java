package com.tech.ninzaz.JavaNewFeatures.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.tech.ninzaz.JavaNewFeatures.model.Student;

public class ParallelStreamEx {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		list.add(new Student(100, "LG"));
		list.add(new Student(90, "RG"));
		list.add(new Student(110, "PG"));
		list.add(new Student(120, "KG"));
		list.add(new Student(80, "RG"));
		list.add(new Student(70, "AG"));
	
		Stream<Student> stuStream= list.parallelStream();
		stuStream.forEach(n->doProcess(n));
		
	}

	private static void doProcess(Student n) {
		
		System.out.println(n.toString());
	}

}

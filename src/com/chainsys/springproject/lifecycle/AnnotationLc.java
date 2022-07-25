package com.chainsys.springproject.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
// not run from java9 and higher versions
public class AnnotationLc {
	public AnnotationLc() {
		System.out.println("AnnotationLc object created" + hashCode());
	}

	@PostConstruct
	public void start() {
		System.out.println("Started AnnotationLc");
	}

	@PreDestroy
	public void stop() {
		System.out.println("Stoped AnnotationLc");
	}

	public void print() {
		System.out.println("print AnnotationLc");
	}
}

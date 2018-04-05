package com.emc.test;

import com.emc.entities.Event;
import com.emc.entities.Organizer;

public class Test {
	public static void main(String[] args) {
		Organizer organizer = new Organizer();
		organizer.setId(123l);
		organizer.setName("Applica inc.");
		
		System.out.println(organizer);
		System.out.println(organizer.getName());
		
		Event event = new Event(4542l,"Iphone 100 Launch", "Grand Launch");
		System.out.println(event.getDescription());
		
	}
}

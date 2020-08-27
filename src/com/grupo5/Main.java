package com.grupo5;

import com.grupo5.Country.Country;
import com.grupo5.Hospital.Hospital;
import com.grupo5.University.University;

public class Main {

    public static void main(String[] args) {
	// write your code here
        University u = new University();
        u.setName("de San Carlos de Guatemala");
        u.addSchool("Ingenieria", 53545, true, 34340);

    System.out.println(u.toString());
        new Hospital();
        new Country();
    }
}

package com.tafron;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PatientDetails {
    String name() throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(in);

        System.out.println("Enter Patient Name");
        String name = buf.readLine();
        return name;
    }


    String age() throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(in);

        System.out.println("Enter Patient Age");
        String age = buf.readLine();
        return age;
    }

    String gender() throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(in);

        System.out.println("Enter Patient Gender");
        String gender = buf.readLine();
        return gender;
    }


    String weight() throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(in);

        System.out.println("Enter Patient Weight");
        String weight = buf.readLine();
        return weight;
    }
}

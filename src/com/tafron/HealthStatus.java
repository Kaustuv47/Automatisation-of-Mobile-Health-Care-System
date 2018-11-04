package com.tafron;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HealthStatus {

    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader buf = new BufferedReader(in);

    String BloodPressure() throws IOException {
       //  Systolic pressure (mm Hg)	Diastolic pressure (mm Hg)
        System.out.println("****----------------------------------------*****");
        System.out.println("Enter Blood Pressure in form Systolic/Diastolic");
        System.out.println("****----------------------------------------*****");
        System.out.print("-- >  ");
        String bp = buf.readLine();
        String[] bpsd = bp.split("/");

        Integer sys = Integer.parseInt(bpsd[0]);
        Integer dia = Integer.parseInt(bpsd[1]);

        if (sys >= 50 && sys <=90 && dia >= 33 && dia <= 60){
            System.out.println("    ==> Low Blood Pressure  :-( <==");
            bp = "Blood Pressure :- "+bp+" Systolic/Diastolic "+"\t"+"---- (Low Blood Pressure)";
        }
        else if (sys >= 140 && sys <=210 && dia >= 90 && dia <= 120){
            System.out.println("    ==> High Blood Pressure :-( <==");
            bp = "Blood Pressure :- "+bp+" Systolic/Diastolic "+"\t"+"---- (High Blood Pressure)";
        }
        else if (sys >= 110 && sys <=130 && dia >= 75 && dia <= 85){
            System.out.println("    ==> Normal Blood Pressure  :-) <==");
            bp = "Blood Pressure :- "+bp+" Systolic/Diastolic "+"\t"+"---- (Normal Blood Pressure)";
        }
        else {
            System.out.println("================================================");
            System.out.println("**** Abnormal Condition : Consult To Doctor ****");
            System.out.println("================================================");
            bp = bp+"  ----  Abnormality Present!";
        }
       return bp;
    }

    String Sugar() throws IOException {

        System.out.println("****--------------------------------------------------------*****");
        System.out.println("Enter Blood Sugar Level in format 'Pre-Meal/Post-Meal' mg/dl Unit");
        System.out.println("****--------------------------------------------------------*****");
        System.out.print("-- >  ");
        String sc = buf.readLine();

        String[] bpsd = sc.split("/");

        Integer pre = Integer.parseInt(bpsd[0]);
        Integer post = Integer.parseInt(bpsd[1]);

        if (pre >= 70 && pre <= 99 && post <= 140){
            System.out.println("    ==> Normal Sugar Level :-) <==");
            sc = "Sugar :- "+sc+" pre-meal/post-meal "+"\t"+"---- (Normal Sugar Level)";
        }
        else if (pre >= 100 && pre <= 125 && post >= 140 && post <= 199){
            System.out.println("    ==> Pre-diabetes Found! :-( <==");
            sc = "Sugar :- "+sc+" pre-meal/post-meal "+"\t"+"---- (Pre - Diabetes diagnosed)";
        }
        else if (pre >= 126 && post >= 200){
            System.out.println("    ==> Diabetes Found! :-( <==");
            sc = "Sugar :- "+sc+" pre-meal/post-meal "+"\t"+"---- (Diabetes present)";
        }
        else {
            System.out.println("===============================================");
            System.out.println("**** Abnormality Found : Consult To Doctor ****");
            System.out.println("===============================================");
            sc = sc+"  ----  Abnormality Present!";
        }
        return sc;
    }

    String PulseRate() throws IOException {

        System.out.println("****--------------------------------------------*****");
        System.out.println("Enter Heart Rate in Beats per Minute");
        System.out.println("**** Recommended Condition for Measuring is Rest ****");
        System.out.println("****--------------------------------------------*****");
        System.out.print("-- >  ");
        String hb = buf.readLine();

        Integer ihb = Integer.parseInt(hb);

        if (ihb >= 60 && ihb <= 80){
            System.out.println("    ==> Perfect And Normal :-) <==");
            hb = "Heart Beat Rate :- "+hb+"  per minute"+"\t"+"---- (Normal Heart Rate)";
        }
        else {
            System.out.println("===============================================");
            System.out.println("**** Abnormality Found : Consult To Doctor ****");
            System.out.println("===============================================");
            hb = hb+" ----  Abnormality Present";
        }
        return hb;
    }
}

package com.tafron;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(in);

        System.out.println("=======================================");
        System.out.println("Automation of Mobile Health Care System");
        System.out.println("=======================================");
        System.out.println("  *******    Enter Choice    *******");
        System.out.println("");

        int wl = 1;
        while (wl != 0){

            System.out.println("*-------------------------------------*");
            System.out.println("Press 1:  Enter Patient Details");
            System.out.println("Press 2:  Display Patient Details");
            System.out.println("Press 0:  To Exit");
            System.out.println("*-------------------------------------*");

            String ch = buf.readLine();
            int choice = Integer.parseInt(ch);
            switch (choice) {
                case 1: {
                    System.out.println("Enter Patient ID");
                    String id = buf.readLine();
                    id = id + ".txt";

                    File file = new File(id);

                    FileWriter fw = new FileWriter(file);

                    PatientDetails pd = new PatientDetails();

                    String data = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
                    data = "Last Checkup Date & Time:- "+data;
                    fw.write(data+"\n"+"=============================================\n");

                    data = pd.name();
                    data = "Name :- "+data;
                    fw.write(data);
                    fw.write("\n");

                    data = pd.age();
                    data = "Age :- "+data;
                    fw.write(data);
                    fw.write("\n");

                    data = pd.gender();
                    data = "Gender :- "+data;
                    fw.write(data);
                    fw.write("\n");

                    data = pd.weight();
                    data = "Weight :- "+data;
                    fw.write(data);
                    fw.write("\n");

                    System.out.println("-------------------------------");
                    System.out.println("Enter Patients Health Condition");
                    System.out.println("-------------------------------");

                    HealthStatus hs = new HealthStatus();

                    data = hs.BloodPressure();
                    fw.write(data);
                    fw.write("\n");

                    data = hs.PulseRate();
                    fw.write(data);
                    fw.write("\n");

                    data = hs.Sugar();
                    fw.write(data);
                    fw.write("\n=============================================");

                    fw.close();

                    System.out.println("------------------------------------");
                    System.out.println("-- System Successfully Saved Data --");
                    System.out.println("------------------------------------");
                    break;
                }

                case 2:{
                    System.out.println("Enter Patient ID");
                    String id = buf.readLine();
                    id = id + ".txt";

                    BufferedReader br = new BufferedReader(new FileReader(id));

                    StringBuffer sb = new StringBuffer();
                    String line = null;

                    while((line = br.readLine())!=null){

                        sb.append(line).append("\n");
                    }
                    System.out.println(sb);
                    break;
                }

                case 0:{
                    wl = 0;
                    break;
                }

                default: {
                    System.out.println("**--**  Wrong Input Try Again **--**");
                    break;
                }
            }
        }

    }
}

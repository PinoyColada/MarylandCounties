package com.maryland;
/*
Author:Ryan Hatamosa
11/14/2020

 */

import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        HashMap<String, String> marylandCounties = new HashMap<>();
        // information about the counties. All information was gathered from Wikipedia
        String info1 = "Garrett County is the westernmost county of the U.S. state of Maryland. As of the 2010 census, the population was 30,097, making it the third-least populous county in Maryland." +
                " Its county seat is Oakland. The county was named for John Work Garrett, president of the Baltimore and Ohio Railroad.";
        String info2 = "Allegany County is located in the northwestern part of the U.S. state of Maryland. As of the 2010 census, the population was 75,087. " +
                "Its county seat is Cumberland. The name Allegany may come from a local Lenape word, welhik hane or oolikhanna, which means 'best flowing river of the hills' or 'beautiful stream'";
        String info3 = "Washington County is located in the western part of the U.S. state of Maryland. As of the 2010 census, the population was 147,430. Its county seat is Hagerstown. " +
                "Washington County was the first county in the United States to be named for the Revolutionary War general George Washington.";
        String info4 = "Frederick County is located in the northern part of the U.S. state of Maryland. As of the 2010 U.S. Census, the population was 240,336. The county seat is Frederick." +
                " Frederick County is included in the Washington-Arlington-Alexandria, DC-VA-MD-WV Metropolitan Statistical Area.";
        String info5 = "Carroll County is a county located in the U.S. state of Maryland. As of the 2010 census, the population was 167,134. Its county seat is Westminster.";
        String info6 = "Montgomery County is the most populous county in the U.S. state of Maryland, located adjacent to Washington, D.C. " +
                "As of the 2010 census, the county's population was 971,777, increasing by 8.1% to an estimated 1,050,688 in 2019.";
        String info7 = "Howard County is located in the central part of the U.S. state of Maryland. As of the 2010 census, the population was 287,085. Its county seat is Ellicott City.";
        String info8 = "Prince George's County is a county located in the U.S. state of Maryland, bordering the eastern portion of Washington, D.C. As of the 2010 U.S. Census, " +
                "the population was 863,420, making it the second-most populous county in Maryland, behind Montgomery County. Its county seat is Upper Marlboro";
        String info9 = "Charles County is a county in south central Maryland. As of the 2010 census, the population was 146,551." +
                " The county seat is La Plata. The county was named for Charles Calvert, third Baron Baltimore.";
        String info10 = "St. Mary's County, established in 1637, is a county located in the U.S. state of Maryland. " +
                "As of the 2010 census, the population was 105,151. Its county seat is Leonardtown. The name is in honor of Mary, the mother of Jesus.";
        String info11 = "Calvert County is located in the U.S. state of Maryland. As of the 2010 census, the population was 88,737. Its county seat is Prince Frederick." +
                " The county's name is derived from the family name of the Barons of Baltimore, the proprietors of the English Colony of Maryland";
        String info12 = "Anne Arundel County, also notated as AA or A.A. County, is a county located in the U.S. state of Maryland." +
                " As of the 2010 United States Census, its population was 537,656, a population increase of just under 10% since 2000. Its county seat is Annapolis, which is also the capital of the state.";
        String info13 = "Baltimore County is the third-most populous county located in the U.S. state of Maryland and is part of the Baltimore metropolitan area and Baltimore-Washington metropolitan area." +
                " Baltimore County is part of the Northeast megalopolis, which stretches from Virginia northward to Boston.";
        String info14 = "Harford County is a county in the U.S. state of Maryland. As of the 2010 census, the population was 244,826. Its county seat is Bel Air.";
        String info15 = "Cecil County is a county located in the U.S. state of Maryland at the northeastern corner of the state, bordering both Pennsylvania and Delaware." +
                " As of the 2010 census, the population was 101,108. The county seat is Elkton.";
        String info16 = "Kent County is a county located in the U.S. state of Maryland. As of the 2010 census, its population was 20,197, making it the least populous county in Maryland. Its county seat is Chestertown." +
                " The county was named for the county of Kent in England. The county is located on Maryland's Eastern Shore.";
        String info17 = "Queen Anne's County is a county located in the U.S. state of Maryland. As of the 2010 census, the population was 47,798. Its county seat and most populous municipality is Centreville." +
                " The census-designated place of Stevensville is the county's most populous place.";
        String info18 = "Talbot County is a county located in the heart of the Eastern Shore of Maryland in the U.S. state of Maryland. As of the 2010 census, the population was 37,782. Its county seat is Easton.";
        String info19 = "Caroline County is a rural county located in the U.S. state of Maryland on its Eastern Shore. As of the 2010 census, the population was 33,066. Its county seat is Denton.";
        String info20 = "Dorchester County is a county located in the U.S. state of Maryland. At the 2010 census, the population was 32,618. Its county seat is Cambridge." +
                " The county was formed in 1669 and named for the Earl of Dorset, a family friend of the Calverts. ";
        String info21 = "Wicomico County is a county located in the southeastern part of the U.S. state of Maryland, on the Delmarva Peninsula. " +
                "As of the 2010 census, the population was 98,733. The county seat is Salisbury.";
        String info22 = "Somerset County is the southernmost county in the U.S. state of Maryland." +
                "As of the 2010 census, the population was 26,470. making it the second-least populous county in Maryland. The county seat is Princess Anne.";
        String info23 = "Worcester County is the easternmost county of the U.S. state of Maryland. As of the 2010 census, the population was 51,454. Its county seat is Snow Hill." +
                " It is the only county of Maryland that borders the Atlantic Ocean, and the only county bordering both Delaware and Virginia.";
        // setting information to each corresponding county
        marylandCounties.put("Garrett",info1);
        marylandCounties.put("Allegany",info2);
        marylandCounties.put("Washington",info3);
        marylandCounties.put("Frederick",info4);
        marylandCounties.put("Carroll",info5);
        marylandCounties.put("Montgomery",info6);
        marylandCounties.put("Howard",info7);
        marylandCounties.put("Prince George's",info8);
        marylandCounties.put("Charles",info9);
        marylandCounties.put("St. Mary's",info10);
        marylandCounties.put("Calvert",info11);
        marylandCounties.put("Anne Arundel",info12);
        marylandCounties.put("Baltimore",info13);
        marylandCounties.put("Harford",info14);
        marylandCounties.put("Cecil",info15);
        marylandCounties.put("Kent",info16);
        marylandCounties.put("Queen Anne's",info17);
        marylandCounties.put("Talbot",info18);
        marylandCounties.put("Caroline",info19);
        marylandCounties.put("Dorchester",info20);
        marylandCounties.put("Wicomico",info21);
        marylandCounties.put("Somerset",info22);
        marylandCounties.put("Worcester",info23);

        System.out.println("Welcome to the Maryland County Database!");
        System.out.println("In this program, you will be able to learn a brief description of each county in Maryland.");


        System.out.println("-----------------------------------------");
        for (String i : marylandCounties.keySet()) {
            System.out.println(i);
        }
        System.out.println("-----------------------------------------");

        System.out.println("From the list above of counties in Maryland," +
                " Please enter a county you would like to know about: ");

        Scanner input = new Scanner(System.in);

        String selectedCounty = input.nextLine();

        // if the user did not enter a valid county, ask user until valid input is entered
        while(true){
            if (!marylandCounties.containsKey(selectedCounty)){
                System.out.println("Invalid input! Please enter a Maryland county");
                selectedCounty = input.next();
            } else {
                break;
            }
        }
        // output description of county
        System.out.println(marylandCounties.get(selectedCounty));


        // asks user if they want rerun code again
        System.out.println("Would you like to rerun the program?");
        String yesOrNo = input.next().toUpperCase();
        while(true){
            if (yesOrNo.equals("YES") || yesOrNo.equals("Y") ){
                Main.main(args);
            } else if (yesOrNo.equals("NO") || yesOrNo.equals("N")) {
                System.out.println("Program is now terminating...");
                System.exit(0);
            } else {
                System.out.println("You did not enter the right input. Please enter 'Yes' or 'No'");
                yesOrNo = input.next().toUpperCase();
            }
        }


















    }
}

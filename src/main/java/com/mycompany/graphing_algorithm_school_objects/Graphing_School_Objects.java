/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graphing_algorithm_school_objects;

import java.util.ArrayList;

/**
 *
 * @author stmar
 */


public class Graphing_School_Objects
{
    
    
    
    
    
    public static void main(String[] args)
    {
        School_Object FirstSchool = new School_Object("Houston University", "Adult", 1000, "Public");
        School_Object SecondSchool = new School_Object("Howard School of Hard Knocks", "Child", 250, "Private");
        School_Object ThirdSchool = new School_Object("Twin Sisters College", "Adult", 45, "Private");
        School_Object FourthSchool = new School_Object("RedHat Hackers", "Child", 450, "Public");
        School_Object FifthSchool = new School_Object("Diplomatic Windows Users", "Adult", 300, "Public");
        School_Object SixthSchool = new School_Object("Operating Whiskey drinkers", "Child", 701, "Private");
        School_Object SeventhSchool = new School_Object("Distinguished Gentlemen", "Child", 800, "Public");
        
        ArrayList<School_Object> List_of_Schools = new ArrayList<School_Object>();
        
        List_of_Schools.add(FirstSchool);
        List_of_Schools.add(SecondSchool);
        List_of_Schools.add(ThirdSchool);
        List_of_Schools.add(FourthSchool);
        List_of_Schools.add(FifthSchool);
        List_of_Schools.add(SixthSchool);
        List_of_Schools.add(SeventhSchool);
        
        
        
        for (School_Object schools : List_of_Schools)
        {
            System.out.print(schools.toString());
            System.out.println();
            System.out.println();
        }
        
        List_of_Schools.sort(new Enrollment_Size_Comparator()); //couldn't sort by integer :( an integer cannot be dereferenced
        
        System.out.print("################################################################Sorted List###########################################################");
        System.out.println();
        System.out.println();
        
         for (School_Object schools : List_of_Schools)
        {
            System.out.print(schools.toString());
            System.out.println();
            System.out.println();
        }
        
    }
    
}

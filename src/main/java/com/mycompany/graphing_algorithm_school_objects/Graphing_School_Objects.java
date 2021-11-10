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
           
        System.out.print("################################################################Add to Tree###########################################################");
        System.out.println();
        System.out.println();
        
        Static_NodeClass maybeTree = new Static_NodeClass();
        
        for (School_Object schools : List_of_Schools)
        {
            maybeTree.add(schools);
        }
        
        System.out.print("################################################################Traverse the tree ###########################################################");
        System.out.println();
        System.out.println();
        
        maybeTree.traverseLevelOrder();
        
        
        //List_of_Schools.sort(new Enrollment_Size_Comparator());
        
       /* 
        System.out.print("################################################################Sorted List###########################################################");
        System.out.println();
        System.out.println();
        
         for (int counter = 0; counter <= List_of_Schools.size(); counter++)
        {
            
           
            System.out.print(List_of_Schools.get(counter));     
            System.out.println();
            System.out.println();
            
        }
        
         
        System.out.print("################################################################Add to Tree###########################################################");
        System.out.println();
        System.out.println();
        
        //descending order tree 
        /*
        Static_NodeClass maybeTree = new Static_NodeClass();
        
        for (School_Object schools : List_of_Schools)
        {
            maybeTree.add(schools);
        }
        */
    }
    
}

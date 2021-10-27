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
public class Graph_School_Objects
{
    
   
    ArrayList<Integer> Enrollment_Storage = new ArrayList<Integer>();
    public Graph_School_Objects (ArrayList<School_Object> Generic)
    {
        
        
       
        for (School_Object SomeSchool: Generic)
            {
                Enrollment_Storage.add(SomeSchool.getEnrollment_Size()); 
            }

        
    }
   
    void addEdge(int endpoint1, int endpoint2)
    {
        Enrollment_Storage.get(endpoint2);
        Enrollment_Storage.add(endpoint1);
        Enrollment_Storage.get(endpoint1);
        Enrollment_Storage.add(endpoint2);
        
    }
    
}

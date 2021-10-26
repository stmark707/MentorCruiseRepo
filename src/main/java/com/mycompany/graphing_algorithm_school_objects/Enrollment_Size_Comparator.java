/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graphing_algorithm_school_objects;

import java.util.Comparator;

/**
 *
 * @author stmar
 */
public class Enrollment_Size_Comparator implements Comparator<School_Object>
{ 
    //sorted in descending order

    @Override
    public int compare(School_Object School_one, School_Object School_two)
    {
       return School_two.getEnrollment_Size()- School_one.getEnrollment_Size();
    }
    
}

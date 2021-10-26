/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graphing_algorithm_school_objects;

/**
 *
 * @author stmar
 */
public class School_Object
{
    public String School_name;
    public String Student_Type;
    public int Enrollment_Size;
    public String School_classification;
    
    public School_Object(String name, String student_type, int enrollment_size, String school_classification)
    {
        this.School_name = name;
        
        if (student_type == "Adult" || student_type == "adult")
        {
            this.Student_Type = "Adult";
        }
        else
        {
            this.Student_Type = "Child";
        }
        
        if ( enrollment_size <=1000 || enrollment_size >=0)
        {
            this.Enrollment_Size = enrollment_size;
        }
        else
        {
            this.Enrollment_Size = 1;
        }
        
        if (school_classification == "Private" || school_classification == "private")
        {
            this.School_classification = school_classification;
        }
        else
        {
            this.School_classification = "Public";
        }
        
    }
}

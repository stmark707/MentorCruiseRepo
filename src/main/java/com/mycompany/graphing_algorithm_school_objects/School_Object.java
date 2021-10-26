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

    public String getSchool_name()
    {
        return School_name;
    }

    public void setSchool_name(String School_name)
    {
        this.School_name = School_name;
    }

    public String getStudent_Type()
    {
        return Student_Type;
    }

    public void setStudent_Type(String Student_Type)
    {
        
         if (Student_Type == "Adult" ||Student_Type == "adult")
        {
             this.Student_Type = Student_Type;
        }
        else
        {
             this.Student_Type = "Child";
        }
    }

    public int getEnrollment_Size()
    {
        return Enrollment_Size;
    }

    public void setEnrollment_Size(int Enrollment_Size)
    {
        
         if ( Enrollment_Size <=1000 || Enrollment_Size >=0)
        {
            this.Enrollment_Size = Enrollment_Size;
        }
        else
        {
            this.Enrollment_Size = 1;
        }
    }

    public String getSchool_classification()
    {
        return School_classification;
    }

    public void setSchool_classification(String School_classification)
    {
        this.School_classification = School_classification;
        if (School_classification == "Private" || School_classification == "private")
        {
            this.School_classification = School_classification;
        }
        else
        {
            this.School_classification = "Public";
        }
         }
        
        @Override
    public String toString()
    
   {                                            
      return String.format("Below are the following characteristic of the school: %nSchool Name: %s%nSchool Student Type: %s%nSchool Classification type:"
              + " %s%nSchool Enrollment Size: %d", getSchool_name(), getStudent_Type(), getSchool_classification(), getEnrollment_Size());                                     
   }
    
    
    
}

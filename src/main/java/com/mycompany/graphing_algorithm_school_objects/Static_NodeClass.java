/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graphing_algorithm_school_objects;

import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.Tree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author stmar
 */
public class Static_NodeClass
{
    Node Root;
    //May have to add static unsure at this time
    
    
    
    public static class Node{
        School_Object FirstSchool = new School_Object("Random University", "Adult", 1000, "Public");
        
        Node Left;
        Node Right;
        
        Node (School_Object FirstSchool)
        {
            this.FirstSchool = FirstSchool;
            Right = null;
            Left = null;
        }
        
    }
    
    
   
    private Node addRecursive(Node current, School_Object FirstSchool)
    {
        if (current == null)
        {
            return new Node(FirstSchool);
        }
        if (FirstSchool.getEnrollment_Size() < current.FirstSchool.getEnrollment_Size())
        {
            current.Left = addRecursive(current.Left, FirstSchool);
            System.out.println("This object is going to the left");
        }
        else if (FirstSchool.getEnrollment_Size() > current.FirstSchool.getEnrollment_Size())
        {
            current.Right = addRecursive(current.Right, FirstSchool);
            System.out.println("This object is going to the Right");
        }
        else
        {
            return current;
        }
        
        return current;
    }
    
    public void add(School_Object FirstSchool)
    {
        this.Root = addRecursive(Root, FirstSchool);
    }
    
   
    
    
    
    
}
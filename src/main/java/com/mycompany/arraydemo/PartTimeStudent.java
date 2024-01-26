/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraydemo;

/**
 *
 * @author ekech
 */
public class PartTimeStudent extends Student{
    private int NumberOfCourses;

    public int getNumberOfCourses() {
        return NumberOfCourses;
    }

    public void setNumberOfCourses(int NumberOfCourses) {
        this.NumberOfCourses = NumberOfCourses;
    }

    public PartTimeStudent(int NumberOfCourses, int sID, String sName) {
        super(sID, sName);
        this.NumberOfCourses = NumberOfCourses;
    }
    
    
}

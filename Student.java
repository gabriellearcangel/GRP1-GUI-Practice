package com.mycompany.student;

public class Student {
//attributes
private String studentNumber;
private String studentName;
private float milestone1;
private float milestone2;
private float terminal;
private float finalGrade;

// Maximum points
private static final float MAX_M1 = 25.0f;
private static final float MAX_M2 = 40.0f;
private static final float MAX_TERMINAL = 35.0f;

//getter and setter methods
//getter methods
public String getStudentNumber() {
return studentNumber;
}

public String getStudentName() {
return studentName;
}

public String getMS1() {
return String.valueOf(milestone1);
}

public String getMS2() {
return String.valueOf(milestone2);
}

public String getTerminal() {
return String.valueOf(terminal);
}

public String getFinalGrade() {
return String.valueOf(finalGrade);
}

//setter methods
public void setStudentNumber(String studNumber) {
studentNumber = studNumber;
}

public void setStudentName(String studName) {
studentName = studName;
}

public void setMS1(float m1) {
    milestone1 = m1;
}   

public void setMS2(float m2) {
    milestone2 = m2;
}

public void setTerminal(float t) {
    terminal = t;
}

//methods
public void computeGrade() {
    finalGrade = (milestone1 + milestone2 + terminal); 
    }
}


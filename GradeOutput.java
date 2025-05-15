package com.mycompany.student;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.SpringLayout;


public class GradeOutput extends JFrame {
// Declare private variables for the Swing components
private JLabel lblStudentName, lblStudentNo, lblMS1, lblMS2, lblTerminal, lblFinalGrade;
private JTextField txtStudentName, txtStudentNo, txtMS1, txtMS2, txtTerminal, txtFinalGrade;
private JButton closeButton;


public GradeOutput(Student stud) {
// Set up the frame
super("Grade Output");
setSize(500, 300);


// Compute Average
stud.computeGrade();


// Create the components
// Create labels
lblStudentName = new JLabel("Student Name:");
lblStudentNo = new JLabel("Student No:");
lblMS1 = new JLabel("Milestone 1:");
lblMS2 = new JLabel("Milestone 2:");
lblTerminal = new JLabel("TA: ");
lblFinalGrade = new JLabel("Final Grade:");

// Create Student Name textfield
txtStudentName = new JTextField(30);
txtStudentName.setEnabled(false);
txtStudentName.setText(stud.getStudentName());

// Create Student Number textfield
txtStudentNo = new JTextField(30);
txtStudentNo.setEnabled(false);
txtStudentNo.setText(stud.getStudentNumber());

// Create Quiz 1 textfield
txtMS1 = new JTextField(10);
txtMS1.setEnabled(false);
txtMS1.setText(stud.getMS1());

// Create Quiz 2 textfield
txtMS2 = new JTextField(10);
txtMS2.setEnabled(false);
txtMS2.setText(stud.getMS2());

// Create Quiz 3 textfield
txtTerminal = new JTextField(10);
txtTerminal.setEnabled(false);
txtTerminal.setText(stud.getTerminal());

// Create Average Grade textfield
txtFinalGrade = new JTextField(10);
txtFinalGrade.setEnabled(false);
txtFinalGrade.setText(stud.getFinalGrade());

// Create Close button
closeButton = new JButton("Close");

// Define the panel to hold the components
JPanel panel = new JPanel();
SpringLayout layout = new SpringLayout();
panel.setSize(300, 300);
panel.setLayout(layout);

// Add the components to the frame
panel.add(lblStudentName);
panel.add(txtStudentName);
panel.add(lblStudentNo);
panel.add(txtStudentNo);
panel.add(lblMS1);
panel.add(txtMS1);
panel.add(lblMS2);
panel.add(txtMS2);
panel.add(lblTerminal);
panel.add(txtTerminal);
panel.add(lblFinalGrade);
panel.add(txtFinalGrade);
panel.add(closeButton);

// Put constraint on components
// Set label position: left
layout.putConstraint(SpringLayout.WEST, lblStudentName, 6, SpringLayout.WEST, panel);
layout.putConstraint(SpringLayout.WEST, lblStudentNo, 6, SpringLayout.WEST, panel);
layout.putConstraint(SpringLayout.WEST, lblMS1, 6, SpringLayout.WEST, panel);
layout.putConstraint(SpringLayout.WEST, lblMS2, 6, SpringLayout.WEST, panel);
layout.putConstraint(SpringLayout.WEST, lblTerminal, 6, SpringLayout.WEST, panel);
layout.putConstraint(SpringLayout.WEST, lblFinalGrade, 6, SpringLayout.WEST, panel);

// Set label and textfield position: top and bottom
layout.putConstraint(SpringLayout.NORTH, lblStudentName, 6, SpringLayout.NORTH, panel);
layout.putConstraint(SpringLayout.NORTH, txtStudentName, 6, SpringLayout.NORTH, panel);
layout.putConstraint(SpringLayout.NORTH, lblStudentNo, 20, SpringLayout.SOUTH, lblStudentName);
layout.putConstraint(SpringLayout.NORTH, txtStudentNo, 6, SpringLayout.SOUTH, txtStudentName);
layout.putConstraint(SpringLayout.NORTH, lblMS1, 15, SpringLayout.SOUTH, lblStudentNo);
layout.putConstraint(SpringLayout.NORTH, txtMS1, 6, SpringLayout.SOUTH, txtStudentNo);
layout.putConstraint(SpringLayout.NORTH, lblMS2, 15, SpringLayout.SOUTH, lblMS1);
layout.putConstraint(SpringLayout.NORTH, txtMS2, 6, SpringLayout.SOUTH, txtMS1);
layout.putConstraint(SpringLayout.NORTH, lblTerminal, 15, SpringLayout.SOUTH, lblMS2);
layout.putConstraint(SpringLayout.NORTH, txtTerminal, 6, SpringLayout.SOUTH, txtMS2);
layout.putConstraint(SpringLayout.NORTH, lblFinalGrade, 15, SpringLayout.SOUTH, lblTerminal);
layout.putConstraint(SpringLayout.NORTH, txtFinalGrade, 6, SpringLayout.SOUTH, txtTerminal);

// Set textfield position: right
layout.putConstraint(SpringLayout.WEST, txtStudentName, 6, SpringLayout.EAST, lblStudentName);
layout.putConstraint(SpringLayout.WEST, txtStudentNo, 24, SpringLayout.EAST, lblStudentNo);
layout.putConstraint(SpringLayout.WEST, txtMS1, 51, SpringLayout.EAST, lblMS1);
layout.putConstraint(SpringLayout.WEST, txtMS2, 51, SpringLayout.EAST, lblMS2);
layout.putConstraint(SpringLayout.WEST, txtTerminal, 105, SpringLayout.EAST, lblTerminal);
layout.putConstraint(SpringLayout.WEST, txtFinalGrade, 58, SpringLayout.EAST, lblFinalGrade);

// Set button position
layout.putConstraint(SpringLayout.NORTH, closeButton, 6, SpringLayout.SOUTH, txtFinalGrade);
layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, closeButton, 0, SpringLayout.HORIZONTAL_CENTER, panel);


//Add panel to frame
add(panel);


// Add an ActionListener to the button
closeButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
dispose();
}
});
}
}
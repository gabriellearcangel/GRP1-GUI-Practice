package com.mycompany.student;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.SpringLayout;


public class MilestoneCalculator extends JFrame {
// Declare private variables for the Swing components
private JLabel lblStudentName, lblStudentNo, lblMS1, lblMS2, lblTerminal;
private JTextField txtStudentName, txtStudentNo, txtMS1, txtMS2, txtTerminal;
private JButton calculateButton;


public MilestoneCalculator() {
// Set up the frame
super("Milestone Calculator");
setSize(600, 400);


// Create the components
// Create labels and textfields
lblStudentName = new JLabel("Student Name:");
txtStudentName = new JTextField(30);
lblStudentNo = new JLabel("Student No:");
txtStudentNo = new JTextField(30);
lblMS1 = new JLabel("Milestone 1:");
txtMS1 = new JTextField(10);
lblMS2 = new JLabel("Milestone 2:");
txtMS2 = new JTextField(10);
lblTerminal = new JLabel("TA:");
txtTerminal = new JTextField(10);
calculateButton = new JButton("Calculate");

// Define the panel to hold the components
JPanel panel = new JPanel();
SpringLayout layout = new SpringLayout();
panel.setSize(500, 500);
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
panel.add(calculateButton);

// Put constraint on components
// Set label position: left
layout.putConstraint(SpringLayout.WEST, lblStudentName, 6, SpringLayout.WEST, panel);
layout.putConstraint(SpringLayout.WEST, lblStudentNo, 6, SpringLayout.WEST, panel);
layout.putConstraint(SpringLayout.WEST, lblMS1, 6, SpringLayout.WEST, panel);
layout.putConstraint(SpringLayout.WEST, lblMS2, 6, SpringLayout.WEST, panel);
layout.putConstraint(SpringLayout.WEST, lblTerminal, 6, SpringLayout.WEST, panel);

// Set label and textfield position: top and bottom
layout.putConstraint(SpringLayout.NORTH, lblStudentName, 6, SpringLayout.NORTH, panel);
layout.putConstraint(SpringLayout.NORTH, txtStudentName, 6, SpringLayout.NORTH, panel);
layout.putConstraint(SpringLayout.NORTH, lblStudentNo, 20, SpringLayout.SOUTH, lblStudentName);
layout.putConstraint(SpringLayout.NORTH, txtStudentNo, 6, SpringLayout.SOUTH, txtStudentName);
layout.putConstraint(SpringLayout.NORTH, lblMS1, 20, SpringLayout.SOUTH, lblStudentNo);
layout.putConstraint(SpringLayout.NORTH, txtMS1, 8, SpringLayout.SOUTH, txtStudentNo);
layout.putConstraint(SpringLayout.NORTH, lblMS2, 20, SpringLayout.SOUTH, lblMS1);
layout.putConstraint(SpringLayout.NORTH, txtMS2, 8, SpringLayout.SOUTH, txtMS1);
layout.putConstraint(SpringLayout.NORTH, lblTerminal, 20, SpringLayout.SOUTH, lblMS2);
layout.putConstraint(SpringLayout.NORTH, txtTerminal, 8, SpringLayout.SOUTH, txtMS2);

// Set textfield position: right
layout.putConstraint(SpringLayout.WEST, txtStudentName, 6, SpringLayout.EAST, lblStudentName);
layout.putConstraint(SpringLayout.WEST, txtStudentNo, 24, SpringLayout.EAST, lblStudentNo);
layout.putConstraint(SpringLayout.WEST, txtMS1, 51, SpringLayout.EAST, lblMS1);
layout.putConstraint(SpringLayout.WEST, txtMS2, 51, SpringLayout.EAST, lblMS2);
layout.putConstraint(SpringLayout.WEST, txtTerminal, 107, SpringLayout.EAST, lblTerminal);

// Set button position
layout.putConstraint(SpringLayout.NORTH, calculateButton, 6, SpringLayout.SOUTH, txtTerminal);
layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, calculateButton, 0, SpringLayout.HORIZONTAL_CENTER, panel);


//Add panel to frame
add(panel);


// Add an ActionListener to the button
calculateButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
try {
Student stud = new Student();

stud.setStudentName(txtStudentName.getText());
stud.setStudentNumber(txtStudentNo.getText());

float ms1 = Float.parseFloat(txtMS1.getText());
float ms2 = Float.parseFloat(txtMS2.getText());
float terminal = Float.parseFloat(txtTerminal.getText());

if (ms1 < 0 || ms1 > 25 || ms2 < 0 || ms2 > 40 || terminal < 0 || terminal > 35) {
    throw new IllegalArgumentException("Scores invalid.");
}

stud.setMS1(ms1);
stud.setMS2(ms2);
stud.setTerminal(terminal);
stud.computeGrade();


// Instantiate and call GradeOutput class
GradeOutput output = new GradeOutput(stud);
output.setVisible(true);
} catch (IllegalArgumentException ex) {
    JOptionPane.showMessageDialog(null, ex.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
}
}
});
}
}
package za.ac.cput.Entity;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Abdul Quddoos Sunge
 * @studnr 216118905
 */

public class Registration implements ActionListener {


    // JFrame

    private final JFrame frame;

    private final JButton saveBtn, clearBtn, exitBtn;

    private final Panel northPanel, southPanel, eastPanel, westPanel,centPanel;

    private final JLabel studNumberLbl, courseNameLbl, courseCodeLbl, regIdLbl,picLbl, headerLbl, studNumberErrorLbl, courseNameErrorLbl, courseCodeErrorLbl;


    private final JTextField studNumberTxtField, courseNameTxtField, courseCodeTxtField, regIdTxtField;


    private Color green;

    private final ButtonGroup btnGroupWifi = new ButtonGroup();
    private final ButtonGroup btnGroupDevice = new ButtonGroup();

    FileReader filer = null;
    FileWriter filew = null;
    BufferedReader bufferedr = null;
    BufferedWriter bufferedw = null;




    public Registration() {

        //SET COMBO BOX VARIABLE
        final String[] chooseProgram = {"APPLICATIONS DEVELOPMENT", "COMMUNICATION NETWORKS", "MULTIMEDIA TECHNOLOGY"};



        frame = new JFrame("Register Here!");

        //CREATE PANELS
        northPanel = new Panel();
        eastPanel = new Panel();
        southPanel = new Panel();
        westPanel = new Panel();
        centPanel = new Panel();


        studNumberLbl = new JLabel("Student Number: ", JLabel.RIGHT);
        courseNameLbl = new JLabel("Course Name: ", JLabel.RIGHT);
        courseCodeLbl = new JLabel("Course Code: ", JLabel.RIGHT);
        regIdLbl = new JLabel("Reg ID: ", JLabel.RIGHT);


        //CREATING TEXTFIELDS FOR STUDENT NUMBER, COURSE NAME AND CODE & REG ID

        studNumberTxtField = new JTextField();
        courseNameTxtField = new JTextField();
        courseCodeTxtField = new JTextField();
        regIdTxtField = new JTextField();



        //CREATING BOTTOM BUTTONS
        saveBtn = new JButton("Save");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");

        //LABEL ERRORS
        studNumberErrorLbl = new JLabel("*your student number is required");
        courseNameErrorLbl = new JLabel("*enter Course Name");
        courseCodeErrorLbl = new JLabel("*your last name is required");
        studNumberErrorLbl.setForeground(Color.red);
        courseNameErrorLbl.setForeground(Color.red);
        courseCodeErrorLbl.setForeground(Color.red);
        studNumberErrorLbl.setVisible(false);
        courseNameErrorLbl.setVisible(false);
        courseCodeErrorLbl.setVisible(false);

        //ADDING HEADING
        picLbl = new JLabel(new ImageIcon("reg.png"));
        headerLbl = new JLabel(" Registration");
        headerLbl.setForeground(Color.WHITE);

    }

    public void InputArea(){

        //SET PANEL FLOW/GRIDLAYOUTS & COLORS
        northPanel.setLayout(new FlowLayout());
        eastPanel.setLayout(new GridLayout(6, 1));
        southPanel.setLayout(new GridLayout(1, 1));
        westPanel.setLayout(new GridLayout(6, 1));


        //SETTING NORTH PANEL
        northPanel.add(picLbl);
        northPanel.add(headerLbl);


        //SETTING EAST PANELS
        eastPanel.add(courseNameErrorLbl);
        eastPanel.add(courseCodeErrorLbl);
        eastPanel.add(courseNameErrorLbl);

        //SETTING SOUTH PANEL
        southPanel.add(saveBtn);
        southPanel.add(clearBtn);
        southPanel.add(exitBtn);

        //SETTING WEST PANEL
        westPanel.add(studNumberLbl);
        westPanel.add(courseNameLbl);
        westPanel.add(courseCodeLbl);
        westPanel.add(regIdLbl);



        centPanel.setLayout(null);
        centPanel.setSize(400, 700);

        //ADDING PANEL TO FRAME WITH EACH SECTION
        frame.add(northPanel, BorderLayout.NORTH);
        frame.add(eastPanel, BorderLayout.EAST);
        frame.add(southPanel, BorderLayout.SOUTH);
        frame.add(westPanel, BorderLayout.WEST);
        frame.add(centPanel, BorderLayout.CENTER);
        frame.setVisible(true);

        frame.setSize(950, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        //X AXIS, Y AXIS, WIDTH, HEIGHT.
        centPanel.add(studNumberTxtField);
        studNumberTxtField.setBounds(10, 10, 400, 25);
        centPanel.add(courseNameTxtField);
        courseNameTxtField.setBounds(10, 40, 400, 25);
        centPanel.add(courseCodeTxtField);
        courseCodeTxtField.setBounds(10, 69, 400, 25);
        centPanel.add(regIdTxtField);
        regIdTxtField.setBounds(10, 105, 400, 25);


        //ADDING COLOR TO PANEL

        northPanel.setBackground(Color.DARK_GRAY);
        green = new Color(30, 190, 250);
        westPanel.setBackground(green);
        centPanel.setBackground(green);
        eastPanel.setBackground(green);
        southPanel.setBackground(green);



        //ACTION LISTENERS
        saveBtn.addActionListener(this);
        clearBtn.addActionListener(this);
        exitBtn.addActionListener(this);

    }


    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == saveBtn) {
            String studnum = studNumberLbl.getText() +" " + studNumberTxtField.getText();
            String name = courseNameLbl.getText()+ " " + courseNameTxtField.getText();
            String surname = courseCodeLbl.getText()+ " " + courseCodeTxtField.getText();
            String regId = courseCodeLbl.getText()+ " " + courseCodeTxtField.getText();


            //IF STUDENT NUMBER AND NAME TEXTFIELD MISSING
            if (studNumberTxtField.getText().isEmpty() && courseNameTxtField.getText().isEmpty()) {
                courseNameErrorLbl.setVisible(true);
                courseNameErrorLbl.setVisible(true);
            }

            //IF NAME AND SURNAME TEXTFIELD IS MISSING
            else if (courseNameTxtField.getText().isEmpty() && courseCodeTxtField.getText().isEmpty()) {
                courseNameErrorLbl.setVisible(true);
                courseCodeErrorLbl.setVisible(true);
            }
            else if (studNumberTxtField.getText().isEmpty() && courseCodeTxtField.getText().isEmpty()) {
                courseNameErrorLbl.setVisible(true);
                courseCodeErrorLbl.setVisible(true);
            }
            // IF SINGLE TEXTFIELD MISSING
            else if (studNumberTxtField.getText().isEmpty()) {
                courseNameErrorLbl.setVisible(true);
            }

            else if (courseNameTxtField.getText().isEmpty()) {
                courseNameErrorLbl.setVisible(true);
            }

            else if (courseCodeTxtField.getText().isEmpty()) {
                courseCodeErrorLbl.setVisible(true);

                //IF ALL TEXT MISSING
            } else if (studNumberTxtField.getText().isEmpty() && courseNameTxtField.getText().isEmpty() && courseCodeTxtField.getText().isEmpty()) {
                courseNameErrorLbl.setVisible(true);
                courseNameErrorLbl.setVisible(true);
                courseCodeErrorLbl.setVisible(true);
            } else {

                //INPUT IN TEXT FILE
                try {
                    FileWriter writeEvent = new FileWriter("registration.txt", true);
                    writeEvent.append(studnum);
                    writeEvent.append("\n");
                    writeEvent.append(name);
                    writeEvent.append("\n");
                    writeEvent.append(surname);
                    writeEvent.append("\n");
                    writeEvent.append(regId);
                    writeEvent.append("\n");
                    writeEvent.append("\n");
                    writeEvent.close();
                    JOptionPane.showMessageDialog(null, "Your Information Has Been Submitted!");

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error! No Data Captured");
                }
            }

        } else if (e.getSource() == clearBtn) {
            studNumberTxtField.setText("");
            courseNameTxtField.setText("");
            courseCodeTxtField.setText("");
            regIdTxtField.setText("");
            studNumberErrorLbl.setVisible(false);
            courseNameErrorLbl.setVisible(false);
            courseCodeErrorLbl.setVisible(false);

        } else if (e.getSource() == exitBtn) {
            System.exit(0);
        }


    }

    public static void main(String[] args) {

        new Registration().InputArea();

    }


}

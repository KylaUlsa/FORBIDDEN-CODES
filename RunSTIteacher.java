package runstiteacher;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.util.Vector;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;

public class runSTIteacher extends JFrame{
    
    String usersFilePath = "C:\\Users\\Kyla Ulsa\\Desktop\\TP_OOP\\reg.txt";
    JFrame j = new JFrame("STI DASMARINAS REGISTRATION");

    JScrollPane t;
    JOptionPane pn = new JOptionPane();
    JLabel sti = new JLabel("STI DASMARINAS");
    
    JLabel firstName = new JLabel("First Name");
    JLabel middleName = new JLabel("Middle Name");
    JLabel lastName = new JLabel("Last Name");
    JLabel userName = new JLabel("Username");
    JLabel tID = new JLabel("Teacher ID");
    
    JTextField ffirstName = new JTextField("First Name");
    JTextField flastName = new JTextField("Last Name");
    JTextField fmiddleName = new JTextField("Middle Name");
    JTextField fuserName = new JTextField("Username");
    JTextField ftID = new JTextField("Teacher ID");
    
    
    JButton signup = new JButton();
    JButton clear = new JButton();
    JButton already1 = new JButton();
    
    JCheckBox cb = new JCheckBox();
    
    FlowLayout fl = new FlowLayout();
    
    Font font = new Font("",Font.BOLD, 12);
    Font font1 = new Font("",Font.ITALIC, 10);
    Font font2 = new Font("",Font.PLAIN, 20);
    Font f3 = new Font("",Font.ITALIC, 10);
    
    JTextArea out = new JTextArea();
    JPasswordField pass = new JPasswordField();
    JPasswordField pass1 = new JPasswordField();
    
//REGISTERED

       
    public runSTIteacher(){//dito siya nakalagay 
        
        
        sti.setBounds(160,10,250,50);
        sti.setFont(font2);
        j.add(sti);
        
        j.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));   
        j.setBounds(250,200,500,400);
        j.setLayout(null);
        j.setVisible(true);
        j.setResizable(false);
        
//LABEL*********************************************************************


        firstName.setBounds(20,45,75,50);
        middleName.setBounds(20,45,75,110);
        lastName.setBounds(20,48,75,170);
        userName.setBounds(20,49,75,230);
        tID.setBounds(20,50,75,290);
        
        firstName.setFont(font);
        middleName.setFont(font);
        lastName.setFont(font);
        userName.setFont(font);
        tID.setFont(font);
        
        j.add(firstName);
        j.add(middleName);
        j.add(lastName);
        j.add(userName);
        j.add(tID);

//TEXT FIELD************************************************************************

            ffirstName.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent event){
                if(ffirstName.getText().equals("First Name")){
                    ffirstName.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent event){
                if(ffirstName.getText().equals("")){
                    ffirstName.setText("First Name");
                }
            }
        });
        //middlename
            fmiddleName.addFocusListener(new FocusListener(){ 
            @Override
            public void focusGained(FocusEvent event){
                if(fmiddleName.getText().equals("Middle Name")){
                    fmiddleName.setText("");
            }
            }
            @Override
            public void focusLost(FocusEvent event){
                if(fmiddleName.getText().equals("")){
                    fmiddleName.setText("Middle Name");
                }
            }
        }); 
            //lastname
            flastName.addFocusListener(new FocusListener(){
                @Override
                public void focusGained(FocusEvent event){
                    if(flastName.getText().equals("Last Name")){
                    flastName.setText("");
            }
            }
            @Override
            public void focusLost(FocusEvent event){
                if(flastName.getText().equals("")){
                    flastName.setText("Last Name");
                }
            }
        });
            fuserName.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent event){
                if(fuserName.getText().equals("Username")){
                    fuserName.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent event){
                if(fuserName.getText().equals("")){
                    fuserName.setText("Username");
                }
            }
        });
        ftID.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent event){
                if(ftID.getText().equals("Teacher ID")){
                    ftID.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent event){
                if(ftID.getText().equals("")){
                    ftID.setText("Teacher ID");
                    
                }
            }
        });       
        
        ffirstName.setBounds(110,60, 290,25);
        fmiddleName.setBounds(110,90, 290,25);
        flastName.setBounds(110,120, 290,25);
        fuserName.setBounds(110,150, 290,25);
        ftID.setBounds(110,180, 290,25);
        
        ffirstName.setFont(font1);
        fmiddleName.setFont(font1);
        flastName.setFont(font1);
        fuserName.setFont(font1);
        ftID.setFont(font1);

        
        ffirstName.setBackground(Color.WHITE);
        fmiddleName.setBackground(Color.WHITE);
        flastName.setBackground(Color.WHITE);
        fuserName.setBackground(Color.WHITE);
        ftID.setBackground(Color.WHITE);
   
        
        j.add(ffirstName);
        j.add(fmiddleName);
        j.add(flastName);
        j.add(fuserName);
        j.add(ftID);
        
        String kyla = "C:\\Users\\Kyla Ulsa\\Desktop\\TP_OOP";
        File file = new File(kyla);
        
        
        
//CHECKBOXXXXXXXXXXXXXXXX
        cb = new JCheckBox("Already have an account?");
        cb.setFocusable(true);
        cb.setBounds(150,260,180,30);
        cb.setVisible(true);
        cb.setSelected(false);
        j.add(cb);
        
        cb.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent c){
                if(cb.isSelected()){
                    ffirstName.setEditable(false);
                    fmiddleName.setEditable(false);
                    flastName.setEditable(false);
                    fuserName.setEditable(false);
                    ftID.setEditable(false);
                    
                }
                else{
                    ffirstName.setEditable(true);
                    fmiddleName.setEditable(true);
                    flastName.setEditable(true);
                    fuserName.setEditable(true);
                    ftID.setEditable(true);
                }
            }
        });
        
        
        

//OUTPUTTTTTTTTTTTTTTTTTTT*****************************************


out.setVisible(true);
out.setBounds(50,20,380,200);
out.setEditable(false);
out.setBorder(BorderFactory.createLineBorder(Color.gray));



//BUTTONS***********************************************************************

//signup
        signup = new JButton();
        signup.setText("Sign Up");
        signup.setBounds(140,220,100,30);
        
        signup.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        signup.setEnabled(true);
        signup.setVisible(true);
        signup.addActionListener(new action1());
        j.add(signup);
        
//clear button       
        clear = new JButton();
        clear.setText("Clear");
        clear.setBounds(250,220,100,30);
        clear.setVisible(true);
        clear.addActionListener(new action2());
        
        clear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        j.add(clear);
//sign in button

        already1 = new JButton();
        already1.setText("Sign In");
        already1.setBounds(195,300,100,30);
        already1.setVisible(true);
        already1.addActionListener(new action3());
        j.add(already1);
        already1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        already1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent a){
                if(cb.isSelected()){
                    signup.setEnabled(false);
                }
            }
        });
        
//PASSWORDDDDDDDDDDDDDDDDDDDDDDDDDDDDD
    }
   
//SIGN UP TOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
//******************************************
//******************************************
//******************************************    
  
    class action1 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            
            File file = new File(kyla);
            String str = JOptionPane.showInputDialog("Create Password",null);
            String str1 = JOptionPane.showInputDialog("Password",null);

            
            //String st = 
            if(str!= str1){
                dispose();
                
                
            }
            if(str.equals(str1)){
                

                
                JOptionPane.showMessageDialog(null, "Registration Successful");
                
                
                JCheckBox s = new JCheckBox();
                
                Font fn = new Font("",Font.ITALIC, 10); 
                Font fn1 = new Font("",Font.BOLD, 10);
                
                JFrame jj = new JFrame("Hello, Teacher!");
                
                jj.setBackground(Color.GRAY);
                jj.setBounds(250,200,800,350);
                jj.setLayout(null);
                jj.setVisible(true);
                jj.setResizable(true);
                jj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                
                JTextField serge = new JTextField();
                
                Font S = new Font("",Font.BOLD,12);
                Font Ss = new Font("",Font.BOLD,18);
                JLabel sched1 = new JLabel("STI DASMARINAS DASHBOARD");
                sched1.setFont(Ss);
                sched1.setVisible(true);
                sched1.setBounds(10,0,300,50);     
                jj.add(sched1);  
                
                JCheckBox cb1 = new JCheckBox();
                cb1.setFocusable(true);
                cb1.setBounds(100,50,0,0);
                cb1.setVisible(true);
                cb1.setSelected(false);

                
                String [][] data = {
                {"OOP","INHERITANCE","DONE"},
                {"OOP","ABSTRACT","DONE"}
           
                };
                String[] column =  {"COURSE","TOPIC","DONE"};
                
                JTable table1 = new JTable(data,column);
                table1.setFont(S);
                table1.setBounds(30,80,430,200);
                table1.setBackground(Color.white);
                table1.setEnabled(false);
                table1.setVisible(true);    
                t = new JScrollPane(table1);

                
                jj.add(table1);
                table1.add(cb1);
                
                JScrollPane t = new JScrollPane(table1);
                t.setEnabled(true);
                t.setBounds(15,90,450,200);
                jj.add(t); 

                    jj.add(t);
                    table1.add(cb1);
                    

                    JTextField course = new JTextField("Course");
                    JTextField topic = new JTextField("Topic");
               
                
                    course.setBounds(480,100,160,25);
                    topic.setBounds(480,140,160,25);
                    topic.setBounds(480,150,160,25);
                
                    jj.add(course);
                    jj.add(topic);  


                        JButton bt4 = new JButton("Delete All");
                        bt4.setVisible(true);
                        bt4.setBounds(480,230,120,25);
                        jj.add(bt4);
                        
                        //bt4.addActionListener(new ActionListener(){
                            //@Override
                            //public void actionPerformed(ActionEvent i){
                           //     String c1 = course.getText();
                             //   String top = course.getText();
                               // if(course.getText() || topic.getText()){
                               //     table1.append(cl);
                                //}
                            //}
                            
                        //});
                        
                        
                        //DefaultTableModel t = (DefaultTableModel) table1.getModel();
                        //String Course = t.setValueAt
                

                
                    
                    //JScrollPane t = new JScrollPane(table1);
                    //t.setEnabled(true);
                    //t.setBounds(15,90,450,200);
                    //jj.add(t);
                    
                    
                    JCheckBox cb2 = new JCheckBox("Edit course");
                       cb2.setFocusable(true);
                       cb2.setBounds(480,260,120,25);
                       cb2.setVisible(true);
                       cb2.setSelected(false);
                       jj.add(cb2);
                       
        
                       cb2.addActionListener(new ActionListener(){
                            @Override
                            public void actionPerformed(ActionEvent c){
                            if(cb2.isSelected()){
                                table1.setEnabled(true);
                            }
                            else{
                                table1.setEnabled(false);
                                //t.setEnabled(false);
                            }
                            }
                        });
                                       


//CLASSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS BUTTONNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
                JButton bt1 = new JButton();
                bt1.setText("Class");
                bt1.setBounds(670,40,95,25);
                bt1.setVisible(true);
                jj.add(bt1);
                bt1.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent p){
                       
                       Font font4 = new Font("",Font.BOLD,15);
                       

                       
                       JFrame subjects = new JFrame("Class Subjects");

                       subjects.setVisible(true);   
                       subjects.setBounds(250,200,500,350);
                       subjects.setLayout(null);
                       subjects.setVisible(true);
                       subjects.setResizable(false);

                       JTextArea co = new JTextArea("*add notes here");
                       co.setVisible(true);
                       co.setBounds(290,180,170,100);
                       co.setBorder(BorderFactory.createLineBorder(Color.gray));
                       subjects.add(co);

                       
                       co.addFocusListener(new FocusListener(){
                            @Override
                            public void focusGained(FocusEvent event){
                                if(co.getText().equals("*add notes here")){
                                    co.setText("");
                        
                        }
                    }
                            @Override
                            public void focusLost(FocusEvent event){
                            if(co.getText().equals("")){
                                co.setText("*add notes here");   
                            }
                        }
                    });
                       
                      
                       
                       String [][] data = {
                           {"OOP","COMLAB 3","7:00 - 8:30"},
                           {"DATA STRUCTURE","COMLAB3","10:00 - 11:30"},
                           {"PHYSICAL EDUCATION","GROUND FLOOR","12:00 - 1:00"}
                           
                       };
                       String[] column =  {"SUBJECT","ROOM","CLASS TIME"};

                       JTable table = new JTable(data,column);
                       table.setBounds(30,50,500,150);
                       table.setBackground(Color.LIGHT_GRAY);
                       table.setEnabled(false);
                       table.setVisible(true);
                       subjects.add(table);
                                                   
                       JScrollPane t1 = new JScrollPane(table);
                       t1.setEnabled(true);
                       t1.setBounds(15,10,450,150);
                       subjects.add(t1);
                       
                       JCheckBox cb1 = new JCheckBox("Edit schedule");
                       cb1.setFocusable(true);
                       cb1.setBounds(100,170,150,25);
                       cb1.setVisible(true);
                       cb1.setSelected(false);
                       subjects.add(cb1);
                       
        
                       cb1.addActionListener(new ActionListener(){
                            @Override
                            public void actionPerformed(ActionEvent c){
                            if(cb1.isSelected()){
                                table.setEnabled(true);
                            }
                            else{
                                table.setEnabled(false);
                            }
                            }
                        });

                       JButton back = new JButton("Back to Dashboard");
                       back.setVisible(true);
                       back.setBounds(50,260,150,30);
                       subjects.add(back);
                       
                       back.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent l){
                            subjects.dispose();
    
                       }
                   
                });
                   } 
                });
                
//PROFILEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!!!!!!!!!!!!!!!!!!!!
                  JButton bt2 = new JButton();
                        bt2.setText("Profile");
                        bt2.setBounds(670,70,95,25);
                        bt2.setVisible(true);
                        jj.add(bt2); 
                        
                        bt2.addActionListener(new ActionListener(){
                            @Override
                            public void actionPerformed(ActionEvent p){
                            Font o = new Font("",Font.BOLD,12);
                            
                            JFrame prof = new JFrame("TEACHER ACCOUNT INFORMATION"); 
                            prof.setBounds(250,200,500,350);
                            prof.setLayout(null);
                            prof.setVisible(true);
                            prof.setResizable(false);
                       

                            
                            JButton back = new JButton("Back to Dashboard");
                            back.setVisible(true);
                            back.setBounds(50,240,150,30);
                       
                            back.addActionListener(new ActionListener(){
                            @Override
                                public void actionPerformed(ActionEvent l){
                                    prof.dispose();

                       }
                   
                });

                       String first = ffirstName.getText();
                       String second = fmiddleName.getText();
                       String third = flastName.getText();
                       String user = fuserName.getText();
                       String id = ftID.getText();
                       
                       
                       out.setFont(o);
                       out.append("\n  FIRST NAME                           :                     " + first);
                       out.append("\n                         ");
                       out.append("\n  MIDDLE NAME                       :                   " + second);
                       out.append("\n                         ");
                       out.append("\n  LAST NAME                           :                    " + third);
                       out.append("\n                         ");
                       out.append("\n  USERNAME                           :                     " + user);
                       out.append("\n                         ");
                       out.append("\n  TEACHER SCHOOL ID                           " + id);

                       
                       prof.add(out);
                       prof.add(back);
                       
                       
                       
                       
                            JButton del = new JButton ("Delete All");
                            del.setVisible(true);
                            del.setBounds(240,240,100,30);
                            prof.add(del);
                            
                            del.addActionListener(new ActionListener(){
                               @Override
                               public void actionPerformed(ActionEvent o){
                                   
                                   String delf = "";
                                   String delm = "";
                                   String dell = "";
                                   String delu = "";
                                   String delt = "";
                                           
                                   if(del.isSelected()){
                                        ffirstName.setText("");
                                        fmiddleName.setText("")
                                        flastName.setText("");
                                        fuserName.setText("");
                                        ftID.setText("");
                                        out.setEnabled(true);
                                       
                                   }
                               }
                            });

                       

                    }
                });
                        
                
                serge.setText("Search...");
                serge.setFont(fn);
                serge.setBounds(50,50, 290,25);
                jj.add(serge);
 
                JButton bt = new JButton();
                bt.setText("Search");
                bt.setBounds(350,50,95,25);
                bt.setVisible(true);
                jj.add(bt);
                bt.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed (ActionEvent d){
                        JOptionPane.showMessageDialog(null,"di ko na keri sir");
                   }
                });
//LOGOUTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                   
                JButton bt3 = new JButton();
                bt3.setText("Logout");
                bt3.setBackground(Color.LIGHT_GRAY);
                bt3.setBounds(670,230,95,25);
                bt3.setVisible(true);
                jj.add(bt3); 
                
                bt3.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent l){
                       int lout = JOptionPane.showConfirmDialog(jj,"Log out your account?", "STI DASMARINAS",JOptionPane.YES_OPTION,JOptionPane.QUESTION_MESSAGE);
                       if(lout==JOptionPane.YES_OPTION){
                            j.dispose();
                            System.exit(0);
                       }
                   }
                });

                jj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            else{
                JFrame cancel = new JFrame();
                JOptionPane.showMessageDialog(cancel, "Please enter your password!","Wrong password", JOptionPane.YES_NO_CANCEL_OPTION);
                    }
        }
//******************************************   LOGIN TOOOOO OKERLSSSSSSSSSSSSSSSSSSSSSSSSSS
//************  2nd  ***********************   LOGIN TOOOOO OKERLSSSSSSSSSSSSSSSSSSSSSSSSSS
//******************************************   LOGIN TOOOOO OKERLSSSSSSSSSSSSSSSSSSSSSSSSSS
//******************************************   LOGIN TOOOOO OKERLSSSSSSSSSSSSSSSSSSSSSSSSSS
        }
    	class action2 implements ActionListener {
 	@Override
	public void actionPerformed(ActionEvent e){
		ffirstName.setText("");
		flastName.setText("");
		fmiddleName.setText("");
                fuserName.setText("");
                ftID.setText("");
	}
	}

//******************************************
//******************************************
//******************************************
        class action3 implements ActionListener{
            @Override
            
            public void actionPerformed (ActionEvent e){

                
                JFrame fr = new JFrame("Login");
                Font f = new Font("",Font.BOLD,12);
                Font f1 = new Font("",Font.ITALIC,12);
                
                fr.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));   
                fr.setBounds(250,200,500,350);
                fr.setLayout(null);
                fr.setVisible(true);
                fr.setResizable(false);
                fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //***************************************************    
                JLabel login = new JLabel("Username");
                JLabel pss = new JLabel("Password");
                JLabel id = new JLabel("Teacher ID");
                
                login.setFont(f);
                login.setBounds(200,10,100,100);
                login.setVisible(true);
                
                pss.setFont(f);
                pss.setBounds(200,67,100,100);
                pss.setVisible(true);
                
                id.setFont(f);
                id.setBounds(200,125,100,100);
                id.setVisible(true);
                
                fr.add(login);
                fr.add(pss);
                fr.add(id);
            //****************************************************    
                JTextField fl = new JTextField();
                JTextField fl1 = new JTextField();
                JTextField fl2 = new JTextField();
                
                fl.setText("Username");
                fl.setVisible(true);
                fl.setBounds(100,75, 290,25);
                fl.setFont(f1);

                fl1.setText("Password");
                fl1.setVisible(true);
                fl1.setBounds(100,130, 290,25);
                fl1.setFont(f1);
                
                fl2.setText("e.g (01234hello)");
                fl2.setVisible(true);
                fl2.setBounds(100,190, 290,25);
                fl2.setFont(f1);
                
                
                fr.add(fl);
                fr.add(fl1);
                fr.add(fl2);
            //***************************************************    
                JButton log = new JButton("Login");
                log.setBounds(195,250,100,30);
                log.setFont(f);
                log.setVisible(true);
                
                fr.add(log);
                
                log.addActionListener(new ActionListener(){ 
                    @Override
                    public void actionPerformed(ActionEvent e){
                        JOptionPane.showMessageDialog(null,"You are logged in!");
                JCheckBox s = new JCheckBox();
                
                Font fn = new Font("",Font.ITALIC, 10); 
                Font fn1 = new Font("",Font.BOLD, 10);
                
                JFrame jj = new JFrame("Hello, Teacher!");
                
                jj.setBackground(Color.GRAY);
                jj.setBounds(250,200,800,350);
                jj.setLayout(null);
                jj.setVisible(true);
                jj.setResizable(true);
                jj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                
                JTextField serge = new JTextField();
                
                Font S = new Font("",Font.BOLD,12);
                Font Ss = new Font("",Font.BOLD,18);
                JLabel sched1 = new JLabel("STI DASMARINAS DASHBOARD");
                sched1.setFont(Ss);
                sched1.setVisible(true);
                sched1.setBounds(10,0,300,50);     
                jj.add(sched1);  
                
                JCheckBox cb1 = new JCheckBox();
                cb1.setFocusable(true);
                cb1.setBounds(100,50,0,0);
                cb1.setVisible(true);
                cb1.setSelected(false);



                    
                String [][] data = {
                {"OOP","INHERITANCE","DONE"},
                {"OOP","ABSTRACT","DONE"}
           
                };
                String[] column =  {"COURSE","TOPIC","DONE"};
                
                JTable table1 = new JTable(data,column);
                table1.setFont(S);
                table1.setBounds(30,80,430,200);
                table1.setBackground(Color.white);
                table1.setEnabled(false);
                table1.setVisible(true);    
                t = new JScrollPane(table1);

                jj.add(table1);
                table1.add(cb1);
                
                JScrollPane t = new JScrollPane(table1);
                t.setEnabled(true);
                t.setBounds(15,90,450,200);
                jj.add(t);   

                JTextField course = new JTextField("Course");
                JTextField topic = new JTextField("Topic");
                JTextField status = new JTextField("Topic");
               
                
                course.setBounds(480,100,160,25);
                topic.setBounds(480,140,160,25);
                topic.setBounds(480,150,160,25);
                
                jj.add(course);
                jj.add(topic);  
                jj.add(status);


                    JButton bt4 = new JButton("Delete All");
                    bt4.setVisible(true);
                    bt4.setBounds(480,230,120,25);
                    jj.add(bt4);
                

                
                    

                    
                    
                    JCheckBox cb2 = new JCheckBox("Edit course");
                       cb2.setFocusable(true);
                       cb2.setBounds(480,260,120,25);
                       cb2.setVisible(true);
                       cb2.setSelected(false);
                       jj.add(cb2);
                       
        
                       cb2.addActionListener(new ActionListener(){
                            @Override
                            public void actionPerformed(ActionEvent c){
                            if(cb2.isSelected()){
                                table1.setEnabled(true);
                            }
                            else{
                                table1.setEnabled(false);
                                //t.setEnabled(false);
                            }
                            }
                        });
                                       

 
                
                serge.setText("Search...");
                serge.setFont(fn);
                serge.setBounds(50,50, 290,25);
                jj.add(serge);
 
                JButton bt = new JButton();
                bt.setText("Search");
                bt.setBounds(350,50,95,25);
                bt.setVisible(true);
                jj.add(bt);
                bt.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed (ActionEvent d){
                        JOptionPane.showMessageDialog(null,"di ko na keri sir");
                   }
                });

//ADD COURSEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
                //Font ct = new Font("",Font.ITALIC,10);

                         
//CLASSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS BUTTONNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
                JButton bt1 = new JButton();
                bt1.setText("Class");
                bt1.setBounds(670,40,95,25);
                bt1.setVisible(true);
                jj.add(bt1);
                bt1.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent p){
                       
                       Font font4 = new Font("",Font.BOLD,15);
                       

                       
                       JFrame subjects = new JFrame("Class Subjects");

                       subjects.setVisible(true);   
                       subjects.setBounds(250,200,500,350);
                       subjects.setLayout(null);
                       subjects.setVisible(true);
                       subjects.setResizable(false);

                       JTextArea co = new JTextArea("*add notes here");
                       co.setVisible(true);
                       co.setBounds(290,180,170,100);
                       co.setBorder(BorderFactory.createLineBorder(Color.gray));
                       subjects.add(co);

                       
                       co.addFocusListener(new FocusListener(){
                            @Override
                            public void focusGained(FocusEvent event){
                                if(co.getText().equals("*add notes here")){
                                    co.setText("");
                        
                        }
                    }
                            @Override
                            public void focusLost(FocusEvent event){
                            if(co.getText().equals("")){
                                co.setText("*add notes here");   
                            }
                        }
                    });
                       
                      
                       
                       String [][] data = {
                           {"OOP","COMLAB 3","7:00 - 8:30"},
                           {"DATA STRUCTURE","COMLAB3","10:00 - 11:30"},
                           {"PHYSICAL EDUCATION","GROUND FLOOR","12:00 - 1:00"}
                           
                       };
                       String[] column =  {"SUBJECT","ROOM","CLASS TIME"};

                       JTable table = new JTable(data,column);
                       table.setBounds(30,50,500,150);
                       table.setBackground(Color.LIGHT_GRAY);
                       table.setEnabled(false);
                       table.setVisible(true);
                       subjects.add(table);
                                                   
                       JScrollPane t1 = new JScrollPane(table);
                       t1.setEnabled(true);
                       t1.setBounds(15,10,450,150);
                       subjects.add(t1);
                       
                       JCheckBox cb1 = new JCheckBox("Edit schedule");
                       cb1.setFocusable(true);
                       cb1.setBounds(100,170,150,25);
                       cb1.setVisible(true);
                       cb1.setSelected(false);
                       subjects.add(cb1);
                       
                       
                       
                       
                       cb1.addActionListener(new ActionListener(){
                            @Override
                            public void actionPerformed(ActionEvent c){
                            if(cb1.isSelected()){
                                table.setEnabled(true);
                            }
                            else{
                                table.setEnabled(false);
                            }
                            }
                        });

                       JButton back = new JButton("Back to Dashboard");
                       back.setVisible(true);
                       back.setBounds(50,260,150,30);
                       subjects.add(back);
                       
                       back.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent l){
                            subjects.dispose();
    
                       }
                   
                });
                   } 
                });
//PROFILEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!!!!!!!!!!!!!!!!!!!!
                  JButton bt2 = new JButton();
                        bt2.setText("Profile");
                        bt2.setBounds(670,70,95,25);
                        bt2.setVisible(true);
                        jj.add(bt2); 
                        
                        bt2.addActionListener(new ActionListener(){
                            @Override
                            public void actionPerformed(ActionEvent p){
                            Font o = new Font("",Font.BOLD,12);

                            JFrame prof = new JFrame("TEACHER ACCOUNT INFORMATION"); 
                            prof.setBounds(250,200,500,350);
                            prof.setLayout(null);
                            prof.setVisible(true);
                            prof.setResizable(false);
                       
                            JButton back = new JButton("Back to Dashboard");
                            back.setVisible(true);
                            back.setBounds(50,240,150,30);
                       
                            back.addActionListener(new ActionListener(){
                            @Override
                                public void actionPerformed(ActionEvent l){
                                    prof.dispose();

                       }
                   
                });

                       String first = ffirstName.getText();
                       String second = fmiddleName.getText();
                       String third = flastName.getText();
                       String user = fuserName.getText();
                       String id = ftID.getText();
                       
                       out.setFont(o);
                       out.append("\n  FIRST NAME                           :                     " + first);
                       out.append("\n                         ");
                       out.append("\n  MIDDLE NAME                       :                   " + second);
                       out.append("\n                         ");
                       out.append("\n  LAST NAME                           :                    " + third);
                       out.append("\n                         ");
                       out.append("\n  USERNAME                           :                     " + user);
                       out.append("\n                         ");
                       out.append("\n  TEACHER SCHOOL ID                           " + id);

                       
                       prof.add(out);
                       prof.add(back);

                    }
                });
//LOGOUTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                   
                JButton bt3 = new JButton();
                bt3.setText("Logout");
                bt3.setBackground(Color.LIGHT_GRAY);
                bt3.setBounds(670,230,95,25);
                bt3.setVisible(true);
                jj.add(bt3); 
                
                bt3.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent l){
                       int lout = JOptionPane.showConfirmDialog(jj,"Log out your account?", "STI DASMARINAS",JOptionPane.YES_OPTION,JOptionPane.QUESTION_MESSAGE);
                       if(lout==JOptionPane.YES_OPTION){
                            j.dispose();
                            System.exit(0);
                       }
                   }
                });

                jj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
                   
                });
                
 //***************************************FOCUSSSSSSSS*******************************************************     
 
                fl.addFocusListener(new FocusListener(){
                @Override
                    public void focusGained(FocusEvent event){
                        if(fl.getText().equals("Username")){
                            fl.setText("");
                            
                    }
                }
                @Override
                public void focusLost(FocusEvent event){
                    if(fl.getText().equals("")){
                        fl.setText("Username");
                        
                }
            }
        });//******************************************************************************************************
                fl1.addFocusListener(new FocusListener(){
                @Override
                public void focusGained(FocusEvent event){
                    if(fl1.getText().equals("Password")){
                        fl1.setText("");
                        
                }
            }
                @Override
                public void focusLost(FocusEvent event){
                    if(fl1.getText().equals("")){
                        fl1.setText("Password");
                        
                }
            }
        });//***********************************************************************************************************
                fl2.addFocusListener(new FocusListener(){
                @Override
                public void focusGained(FocusEvent event){
                    if(fl2.getText().equals("e.g (01234hello)")){
                        fl2.setText("");
                        
                }
            }
                @Override
                public void focusLost(FocusEvent event){
                    if(fl2.getText().equals("")){
                        fl2.setText("e.g (01234hello)");   
                }
            }
        });//**************************************************           }
            }        
            }
        String kyla = "C:\\Users\\Kyla Ulsa\\Desktop\\TP_OOP";
        public void reg(){
            
                String first = ffirstName.getText().trim();
                String middle = fmiddleName.getText().trim();
                String last = flastName.getText().trim();
                String user = ffirstName.getText().trim();
                String id = ffirstName.getText().trim();
                
                String ps = String.valueOf(pass.getPassword()).trim();
                String ps1 = String.valueOf(pass.getPassword()).trim();

                 try {
                    FileWriter fw = new FileWriter(kyla);
                    if(first.equals("First Name") || middle.equals("Middle Name") 
                            || last.equals("Last Name")|| user.equals("Username")
                            || id.equals("Teacher ID")|| ps.equals("Password")
                            || ps1.equals("Re-Enter Password")){
                        
                        JOptionPane.showMessageDialog(null,"Invalid");
                    }
                    else{
                        FileWriter fw1 = new FileWriter(kyla, true);
                            if(ps.equals(ps1)){
                        }
                    }
      
                }
                catch (Exception e) {
                    e.getStackTrace();
                }
                 
                }

                public static void main(String[] args) throws IOException {
                    runSTIteacher ru = new runSTIteacher();
                    


                    
                }
}



                    
            
    



        
    



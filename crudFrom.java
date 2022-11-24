import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;

class crudForm extends JFrame implements ActionListener {
// class crudForm extends JFrame {
    JFrame f, fshow;

    JLabel title, leno, lrno, lfname, lmname, llname, lgender, ldob, lemail, lmobile, lcity, lstate, lcountry, lhobbies, lpassword;
    JTextField teno, trno, tfname, tmname, tlname, tdob, temail, tmobile;
    JRadioButton tmale, tfemale;
    JComboBox tcity, tstate, tcountry, thobbies;
    JPasswordField tpassword;
    JButton btnsearch, btnsubmit, btnclear, btnshow, btnupdate, btndelete;

    crudForm(){
        f = new JFrame("Sign Up");

        title = new JLabel("Sign Up");
        
        leno = new JLabel("Enrollnment No");
        lrno = new JLabel("Rollno");
        lfname = new JLabel("First Name");
        lmname = new JLabel("Middle Name");
        llname = new JLabel("Last Name");
        lgender = new JLabel("Gender");
        ldob = new JLabel("Date of Birth");
        lemail = new JLabel("Email Address");
        lmobile = new JLabel("Mobile");
        lcity = new JLabel("City");
        lstate = new JLabel("State");
        lcountry = new JLabel("Country");
        lhobbies = new JLabel("Hobbies");
        lpassword = new JLabel("Password");


        title.setFont(new Font("arial", Font.PLAIN, 24));
        leno.setFont(new Font("arial", Font.PLAIN, 14));
        lrno.setFont(new Font("arial", Font.PLAIN, 14));
        lfname.setFont(new Font("arial", Font.PLAIN, 14));
        lmname.setFont(new Font("arial", Font.PLAIN, 14));
        llname.setFont(new Font("arial", Font.PLAIN, 14));
        lgender.setFont(new Font("arial", Font.PLAIN, 14));
        ldob.setFont(new Font("arial", Font.PLAIN, 14));
        lemail.setFont(new Font("arial", Font.PLAIN, 14));
        lmobile.setFont(new Font("arial", Font.PLAIN, 14));
        lcity.setFont(new Font("arial", Font.PLAIN, 14));
        lstate.setFont(new Font("arial", Font.PLAIN, 14));
        lcountry.setFont(new Font("arial", Font.PLAIN, 14));
        lhobbies.setFont(new Font("arial", Font.PLAIN, 14));
        lpassword.setFont(new Font("arial", Font.PLAIN, 14));

        title.setBounds(350, 20, 100, 50);

        leno.setBounds(150, 80, 100, 50);
        lrno.setBounds(150, 120, 100, 50);
        lfname.setBounds(150, 160, 100, 50);
        lmname.setBounds(150, 200, 100, 50);
        llname.setBounds(150, 240, 100, 50);
        lgender.setBounds(150, 280, 100, 50);
        ldob.setBounds(150, 320, 100, 50);
        lemail.setBounds(150, 360, 100, 50);
        lmobile.setBounds(150, 400, 100, 50);
        lcity.setBounds(150, 440, 100, 50);
        lstate.setBounds(150, 480, 100, 50);
        lcountry.setBounds(150, 520, 100, 50);
        lhobbies.setBounds(150, 560, 100, 50);
        lpassword.setBounds(150, 600, 100, 50);
        

        f.add(title);
        f.add(leno);
        f.add(lrno);
        f.add(lfname);
        f.add(lmname);
        f.add(llname);
        f.add(lgender);
        f.add(ldob);
        f.add(lemail);
        f.add(lmobile);
        f.add(lcity);
        f.add(lstate);
        f.add(lcountry);
        f.add(lhobbies);
        f.add(lpassword);

        teno = new JTextField();
        trno = new JTextField();
        tfname = new JTextField();
        tmname = new JTextField();
        tlname = new JTextField();

        tmale = new JRadioButton("Male");
        tfemale = new JRadioButton("Female");
        ButtonGroup group = new ButtonGroup();
        group.add(tmale);
        group.add(tfemale);
        
        tdob = new JTextField();
        temail = new JTextField();
        tmobile = new JTextField();

        String city[] = {"Junagadh", "Rajkot", "Porbander", "Surat", "Ahemdabad"};
        tcity = new JComboBox(city);

        String state[] = {"Andhra Pradesh", "Maharastra", "Goa", "Rajeshthan", "Gujart"};
        tstate = new JComboBox(state);

        String country[] = {"India", "Aus", "U.S.A", "England", "Newzealand"};
        tcountry = new JComboBox(country);

        String hobbies[] = {"Cricket", "Hockey", "Football", "Chess", "Basket ball"};
        thobbies = new JComboBox(hobbies);

        tpassword = new JPasswordField();


        teno.setBounds(400, 90, 200, 25);
        trno.setBounds(400, 130, 200, 25);
        tfname.setBounds(400, 170, 200, 25);
        tmname.setBounds(400, 210, 200, 25);
        tlname.setBounds(400, 250, 200, 25);

        tmale.setBounds(400, 290, 80, 25);
        tfemale.setBounds(500, 290, 80, 25);

        tdob.setBounds(400, 330, 200, 25);
        temail.setBounds(400, 370, 200, 25);
        tmobile.setBounds(400, 410, 200, 25);

        tcity.setBounds(400, 450, 200, 25);
        tstate.setBounds(400, 490, 200, 25);
        tcountry.setBounds(400, 530, 200, 25);
        thobbies.setBounds(400, 570, 200, 25);

        tpassword.setBounds(400, 610, 200, 20);


        f.add(teno);
        f.add(trno);
        f.add(tfname);
        f.add(tmname);
        f.add(tlname);

        f.add(tmale);
        f.add(tfemale);

        f.add(tdob);
        f.add(temail);
        f.add(tmobile);

        f.add(tcity);
        f.add(tstate);
        f.add(tcountry);
        f.add(thobbies);

        f.add(tpassword);



        btnsearch = new JButton("Search");
        btnsubmit = new JButton("Submit");
        btnclear = new JButton("Clear");
        btnshow = new JButton("Show");
        btnupdate = new JButton("Update");
        btndelete = new JButton("Delete");

        btnsearch.setBounds(640, 85, 100, 30);
        btnsearch.addActionListener(this);

        btnsubmit.setBounds(80, 680, 100, 30);
        btnsubmit.addActionListener(this);
        
        btnclear.setBounds(210, 680, 100, 30);
        btnclear.addActionListener(this);

        btnshow.setBounds(340, 680, 100, 30);
        btnshow.addActionListener(this);

        btnupdate.setBounds(470, 680, 100, 30);
        btnupdate.addActionListener(this);

        btndelete.setBounds(600, 680, 100, 30);
        btndelete.addActionListener(this);


        f.add(btnsearch);
        f.add(btnsubmit);
        f.add(btnclear);
        f.add(btnshow);
        f.add(btnupdate);
        f.add(btndelete);


        f.setSize(800, 800);
        f.setLocation(550, 150);
        f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void actionPerformed(ActionEvent e) {
        // Submit Button Click Event
        if(e.getSource() == btnsubmit){
            String gender = "";
            if(tmale.isSelected()){ gender = "Male"; }
            else if(tfemale.isSelected()){ gender = "Female"; }
            else{ gender = ""; }

            if (teno.getText().equals("") || trno.getText().equals("") || tfname.getText().equals("") || tmname.getText().equals("") || tlname.getText().equals("") || gender == "" || tdob.getText().equals("") || temail.getText().equals("") || tmobile.getText().equals("") ){
                JOptionPane.showMessageDialog(f, "Please, Enter The Values into fileds.");
            }
            else{               
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudjava", "root", "");
                    String insertquery = "INSERT INTO `students` VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement p = conn.prepareStatement(insertquery);
                    // p.setString(1, teno.getText());
                    p.setString(1, teno.getText());
                    p.setString(2, trno.getText());
                    p.setString(3, tfname.getText());
                    p.setString(4, tmname.getText());
                    p.setString(5, tlname.getText());
                    p.setString(6, gender.toString());
                    p.setString(7, tdob.getText());
                    p.setString(8, temail.getText());
                    p.setString(9, tmobile.getText());
                    p.setString(10, tcity.getSelectedItem().toString());
                    p.setString(11, tstate.getSelectedItem().toString());
                    p.setString(12, tcountry.getSelectedItem().toString());
                    p.setString(13, thobbies.getSelectedItem().toString());

                    p.setString(14, tpassword.getText());
                    int result = p.executeUpdate();
                    if(result > 0){
                        JOptionPane.showMessageDialog(f, "Insert Success");
                    }
                    else{
                        JOptionPane.showMessageDialog(f, "Insert Failed");
                    }
                    conn.close();
                }
                catch(Exception ex){
                    System.out.println(ex);
                }
            }
        }

        // Clear Button Click Event
        else if(e.getSource() == btnclear){
            teno.setText("");
            trno.setText("");
            tfname.setText("");
            tmname.setText("");
            tlname.setText("");
            tmale.setSelected(false);;
            tfemale.setSelected(false);;
            tdob.setText("");
            temail.setText("");
            tmobile.setText("");
            tpassword.setText("");
        }

        // Show Records Button Click Event
        else if (e.getSource() == btnshow){
            fshow = new JFrame("Show Records");
            // DefaultTableModel model = new DefaultTableModel();
            // model.addColumn("Id");
            // model.addColumn("Username");
            // model.addColumn("Password");
            // JTable table = new JTable(model);
            // try{

            //     Class.forName("com.mysql.jdbc.Driver");
            //     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudjava", "root", "");
            //     String featchquery = "select * from students";
            //     Statement st = conn.createStatement();
            //     // PreparedStatement pstm = conn.prepareStatement(featchquery);
            //     // ResultSet rs = pstm.executeQuery();
            //     ResultSet rs = st.executeQuery(featchquery);
            //     while(rs.next())
            //     {
            //         String ffname = rs.getString("fname");
            //         String fmname = rs.getString("mname");
            //         String flanme = rs.getString("lname");
            //         tfname.setText(ffname);
            //         tmname.setText(fmname);
            //         tlname.setText(flanme);
            //         model.addRow(new Object[] {rs.getString("fname"), rs.getString("mname"), rs.getString("lname")});
            //     }
            //     conn.close();
            // }
            // catch(Exception ex){
            //     System.out.println(ex);
            // }

            // JScrollPane pg = new JScrollPane(table);
            // fshow.add(table);


            String[][] data = {};

            String[] columnNames = { "ENo", "Roll No", "Fullname", "gender", "dob", "email", "mobile", "city", "state", "country", "hobbies" };

            JTable j = new JTable(data, columnNames);
            j.setBounds(0, 0, 800, 500);

            JScrollPane sp = new JScrollPane(j);
            fshow.add(sp);
            fshow.add(j);

            fshow.setSize(800, 500);
            fshow.setLocation(550, 300);
            fshow.setResizable(false);
            fshow.setLayout(null);
            fshow.setVisible(true);
            // fshow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }


        // Search Records Button Click Event
        else if (e.getSource() == btnsearch){
            if (teno.getText().equals("")){
                JOptionPane.showMessageDialog(f, "Please enter a Enrollnment Number");
            }
            else{
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudjava", "root", "");
                    String featchquery = "select * from students where eno = '"+teno.getText()+"'";
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(featchquery);
                    if(rs.next())
                    {
                        trno.setText(rs.getString("rno"));
                        tfname.setText(rs.getString("fname"));
                        tmname.setText(rs.getString("mname"));
                        tlname.setText(rs.getString("lname"));

                        String checkgender = rs.getString("gender");
                        if(checkgender.equals("Male")){
                            tmale.setSelected(true);
                        }
                        else if(checkgender.equals("Female")){
                            tfemale.setSelected(true);
                        }

                        tdob.setText(rs.getString("dob"));
                        temail.setText(rs.getString("email"));
                        tmobile.setText(rs.getString("mobile"));
                        tpassword.setText(rs.getString("password"));
                    }
                    else{
                        JOptionPane.showMessageDialog(f,"Sorry, This Record is not found.");
                    }
                    conn.close();
                }
                catch(Exception ex){
                    System.out.println(ex);
                }
            }
        }


        // Update record button click event
        else if(e.getSource() == btnupdate){
            String gender = "";
            if(tmale.isSelected()){ gender = "Male"; }
            else if(tfemale.isSelected()){ gender = "Female"; }
            else{ gender = ""; }

            if (teno.getText().equals("") || trno.getText().equals("") || tfname.getText().equals("") || tmname.getText().equals("") || tlname.getText().equals("") || gender == "" || tdob.getText().equals("") || temail.getText().equals("") || tmobile.getText().equals("") ){
                JOptionPane.showMessageDialog(f, "Please, Enter The Values into fileds.");
            }
            else{
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudjava", "root", "");
                    String updatequery = "UPDATE `students` SET `rno`='"+trno.getText()+"', `fname`='"+tfname.getText()+"', `mname`='"+tmname.getText()+"',`lname`='"+tlname.getText()+"',`gender`='"+gender+"',`dob`='"+tdob.getText()+"',`email`='"+temail.getText()+"',`mobile`='"+tmobile.getText()+"',`city`='"+tcity.getSelectedItem().toString()+"',`state`='"+tstate.getSelectedItem().toString()+"',`country`='"+tcountry.getSelectedItem().toString()+"',`hobbies`='"+tcountry.getSelectedItem().toString()+"',`password`='"+tpassword.getText()+"' WHERE eno='"+teno.getText()+"'";
                    PreparedStatement p = conn.prepareStatement(updatequery);
                    int result = p.executeUpdate();
                    if(result > 0){
                        JOptionPane.showMessageDialog(f, "Update Success");
                    }
                    else{
                        JOptionPane.showMessageDialog(f, "Update Failed");
                    }
                    conn.close();
                }
                catch(Exception ex){
                    System.out.println(ex);
                }
            }
        }

        // Delete Record button Click event
        else if(e.getSource() == btndelete){
            if (teno.getText().equals("")){
                JOptionPane.showMessageDialog(f, "Please enter a Enrollnment Number");
            }
            else{
                int confirmresult = JOptionPane.showConfirmDialog(f,"Are You Sure This Record is Delete?", "Delete Record", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(confirmresult == JOptionPane.YES_OPTION){
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudjava", "root", "");
                        String insertquery = "DELETE FROM `students` WHERE eno='"+teno.getText()+"'";
                        PreparedStatement p = conn.prepareStatement(insertquery);
                        int result = p.executeUpdate();
                        if(result > 0){
                            JOptionPane.showMessageDialog(f, "Record Delete Successfully.");
                        }
                        else{
                            JOptionPane.showMessageDialog(f, "Sorry, This Record Not Deleted.");
                        }
                        conn.close();
                    }
                    catch(Exception ex){
                        System.out.println(ex);
                    }
                }
            }
        }
    }


    public static void main(String[] args){
        new crudForm();
    }
}

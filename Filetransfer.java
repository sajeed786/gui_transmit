/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filetransfer;

import static filetransfer.Filetransfer.fc;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import student.Student;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.lang.NullPointerException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.net.*;
import java.util.Scanner;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTextField;

/**
 *
 * @author Sajeed
 */
public class Filetransfer extends javax.swing.JFrame {

    /**
     * Creates new form Filetransfer
     */
    DatagramSocket Socket;
    InetAddress IPAddress;
    byte[] incomingData = new byte[1024];
    FileInputStream f;
    Scanner sc;
    private Timer timer;
int delay=0;
    public Filetransfer() {
        initComponents();
        
    }
    static int fc = 0;
    
    public void update(int k) {
        fc = k;
    }
       int count = 0;
    int perc = 0;
    
    String a="0";

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        progress = new javax.swing.JProgressBar();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jfilename = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jdelay = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jtextdelay = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(75, 75));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        progress.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.ipadx = 510;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 10, 0, 10);
        getContentPane().add(progress, gridBagConstraints);

        jButton2.setText("Stop");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 3, 27, 0);
        getContentPane().add(jButton2, gridBagConstraints);

        jButton3.setText("Resume");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 7, 27, 0);
        getContentPane().add(jButton3, gridBagConstraints);

        jLabel1.setText("Enter the name with the exact path of the file you want to transfer or browse:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 10, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 380;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 32, 0, 0);
        getContentPane().add(jfilename, gridBagConstraints);

        jLabel2.setText("Please select the time duration for which you want a packet to be transferred");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.ipadx = 148;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 10, 0, 10);
        getContentPane().add(jLabel2, gridBagConstraints);

        jdelay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1000", "2000", "3000", "5000" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 10, 0, 0);
        getContentPane().add(jdelay, gridBagConstraints);

        jButton4.setText("Pause");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 36, 27, 0);
        getContentPane().add(jButton4, gridBagConstraints);

        jButton5.setText("Browse...");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 0);
        getContentPane().add(jButton5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 59;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 27, 0, 0);
        getContentPane().add(jtextdelay, gridBagConstraints);

        jButton6.setText("Enter");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new java.awt.GridBagConstraints());

        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JFileChooser fchoice = new JFileChooser();
        fchoice.showOpenDialog(null);
        File f = fchoice.getSelectedFile();
        String filename = f.getAbsolutePath();
        jfilename.setText(filename);
        Filetransfer ft = new Filetransfer();
        int fcount = 0;
        try {

            InputStream ist = new BufferedInputStream(new FileInputStream(jfilename.getText()));
            byte[] c = new byte[1024];
            int count = 0;
            int readChars;
            boolean empty = true;
            while ((readChars = ist.read(c)) != -1) {
                empty = false;
                for (int i = 0; i < readChars; ++i) {
                    if (c[i] == '\n') {
                        count += 1;
                    }
                }
            }
            count += 1;
            fcount = (count == 0 && !empty) ? 1 : count;

        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        } catch (IOException i) {
            i.printStackTrace();
        }
        ft.update(fcount);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        count = 0;
        progress.setValue(0);
        timer.stop();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        timer.restart();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        timer.stop();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jtextdelay.setText(jdelay.getSelectedItem().toString());
       // this.delay=Integer.parseInt(jtextdelay.getText());
       a=jtextdelay.getText();
        //Filetransfer obj=new Filetransfer(time);
        //obj.updatedelay();
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            f=new FileInputStream(jfilename.getText());
            sc=new Scanner(f);
            Socket=new DatagramSocket();
            IPAddress=InetAddress.getByName("127.0.0.1");
        }
        catch(UnknownHostException u)
        {
            u.printStackTrace();
        }
        catch(SocketException e)
        {
            e.printStackTrace();
        }
        catch(FileNotFoundException f)
        {
            f.printStackTrace();
        }
 if (timer != null && timer.isRunning()) {
            return;
         }
System.out.println(a);
         timer = new Timer(Integer.parseInt(a), new TimerListener());        
timer.setRepeats(true);
        timer.start();
    }//GEN-LAST:event_jButton1ActionPerformed
private class TimerListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
            try {
                  System.out.println(a);
                if (sc.hasNext() == true) {
                    float s1=sc.nextFloat();
                    float s2=sc.nextFloat();
                    float s3=sc.nextFloat();
                    float s4=sc.nextFloat();
                    float s5=sc.nextFloat();
                    float s6=sc.nextFloat();
                    float s7=sc.nextFloat();
                    float s8=sc.nextFloat();
                    float s9=sc.nextFloat();
                    float s10=sc.nextFloat();
                    float s11=sc.nextFloat();
                    float s12=sc.nextFloat();
                    float s13=sc.nextFloat();
                    float s14=sc.nextFloat();
                    float s15=sc.nextFloat();
                    float s16=sc.nextFloat();
                    float s17=sc.nextFloat();
                    float s18=sc.nextFloat();
                    float s19=sc.nextFloat();
                    Student student = new Student(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19);

                    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

                    ObjectOutputStream os = new ObjectOutputStream(outputStream);

                    os.writeObject(student);

                    byte[] data = outputStream.toByteArray();

                    DatagramPacket sendPacket = new DatagramPacket(data, data.length, IPAddress, 9876);

                    Socket.send(sendPacket);
                    count += 1;
                    perc = (int) ((count * 100) / fc);
                    progress.setValue(perc);

                    System.out.println("Message sent from client :" + student);
                } else {
                    System.exit(0);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }
   //static Filetransfer obj = new Filetransfer();
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings({"CallToPrintStackTrace", "Convert2Lambda"})
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Filetransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Filetransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Filetransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Filetransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Filetransfer().setVisible(true);
                }
            });
        } 
        catch (NullPointerException n) 
        {
            n.printStackTrace();
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JComboBox<String> jdelay;
    private javax.swing.JTextField jfilename;
    public javax.swing.JTextField jtextdelay;
    private javax.swing.JProgressBar progress;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package effectivepattern;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
            
/**
 *
 * @author owner
 */
public class PTM extends javax.swing.JFrame {
String  arr[]=new String[200];
             String  arr1[]=new String[200];
int count[]=new int[200];
           String  arr2[]=new String[200];             
                       String[] arr5=new String[200];
    int k=0;
            
    /**
     * Creates new form PTM
     */
    public PTM() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        t2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 204));

        jButton1.setText("Paragraph");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Term");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("PTM");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("PDM");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        t2.setColumns(20);
        t2.setRows(5);
        jScrollPane1.setViewportView(t2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(82, 82, 82)
                        .addComponent(jButton2)
                        .addGap(105, 105, 105)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(71, 71, 71))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() { 
                new PDM(arr5,k).setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       String dp[][];
        Scanner fip1 = null;
        try {
            String file1="G:\\stock\\Effectivepattern\\Datasets\\new3.txt";
             String file2="G:\\stock\\Effectivepattern\\Datasets\\new4.txt";
            String file3="G:\\stock\\Effectivepattern\\Datasets\\new5.txt";
            
             fip1 = new Scanner(new File("G:\\stock\\Effectivepattern\\Datasets\\new2.txt")); //file here from which you want to remove the stop words
            FileOutputStream out=new FileOutputStream(file1);
            
            FileOutputStream out1=new FileOutputStream(file2);
            FileOutputStream out2=new FileOutputStream(file3);
          
            int i=1;
            PrintStream p=new PrintStream(out);
             PrintStream p1=new PrintStream(out1);
              PrintStream p2=new PrintStream(out2);
            t2.append("dp1\n");
            t2.append("---------------------------------------------------------\n");
             while(fip1.hasNext())
            {
                
                String s1=fip1.next();
                if(s1.endsWith("mm"))
                {
                    i++;
                    t2.append(s1.replace("mm", " ")+"\n\n");
                    t2.append("dp"+i+"\n");
                    p2.print(s1);
                   p.print(s1.replace("mm"," ")+"\t");
                   p.println();
                   p1.println(s1);
                   
                    t2.append("---------------------------------------------------------\n");
                    
                    
                    
                }
                else{
                    p.print(s1+"\t");
                    t2.append(s1+"\n");
                    p1.println(s1);
                
                }
            }
  
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PTM.class.getName()).log(Level.SEVERE, null, ex);
        }
 
      
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            int i=0,j=0,k=0,flag=1,c=0;
            Scanner fip1 = new Scanner(new File("G:\\stock\\Effectivepattern\\Datasets\\new4.txt")); //file here from which you want to remove the stop words
            Scanner fip2 = new Scanner(new File("G:\\stock\\Effectivepattern\\Datasets\\new2.txt")); //file here from which you want to remove the stop words
String  arr[]=new String[200];
             String  arr1[]=new String[200];             
           
             while(fip1.hasNext())
            {
                flag=1;
                
          //      j=0;
          
                String s1=fip1.next();
          System.out.println("========="+s1);
                arr1[k]=s1;
                k++;
                if(i==0)
                {
                    arr[i]=s1;
              //      System.out.println("arr=>"+arr[i]);
                    i++;//1 
                }
                else
                {
                    
                     for(j=0;j<i;j++)
                     {
                         if(arr[j].contentEquals(s1))
                         {
                             flag=0;
                             
                          }
                     }
                if(flag==1)
                {
                    
                arr[i]=s1;
                 
            //    System.out.println("****"+arr[i]);
                i++;
                
                }  
                
                }
                
            }
            i=0;
         while(arr[i]!=null)
         {
            c=0; 
            j=0;
            while(arr1[j]!=null)
            {
                String s2=arr1[j];
                if(s2.contentEquals(arr[i]))
                c++;
                j++;
            }
            count[i]=c;
            i++;
         }
         
         try
         {
             j=0;
            for(i=0;i<arr.length;i++)
            {
                
               if(count[i]>4)
               {
                   System.out.println(" \t------------------------- "+ arr[i]);//arr1=>contents of new4 repeated arr=>all contents wihout repeatation.
                   arr2[j]=arr[i];
                   j++;
               }
                 System.out.println(" \t------------------------- "+ arr[i]);//arr1=>contents of new4 repeated arr=>all contents wihout repeatation.
                 
            }
         }
         catch(Exception e){e.printStackTrace();}
            i=0;
            int x=0;
            int l=0;
            j=0;
            //String arr2[]=new String[200];
            t2.setText("");
           
            
            try{
                j=0;
                while(arr2[j]!=null)
                {
                    i=0;
                
         
                
                      System.out.println(arr2[j]);
                     fip2 = new Scanner(new File("G:\\stock\\Effectivepattern\\Datasets\\new2.txt"));
                    c=1;
                   x++;
                   while(fip2.hasNext())
                   {
                String s1=fip2.next();
                if(s1.endsWith("mm"))
                {
                    if(s1.replace("mm", " ").equals(arr2[j]))
                    {
                        t2.append("\n dp"+c+"========>t"+x+" ->"+arr2[j]);
                    //    System.out.println("\n dp"+c+"==========>t"+x+" ->"+arr1[i]);
               
                     }

                    c++;
                      
                }
                else if(s1.equals(arr2[j]))
                {
                    
                    t2.append("\n dp"+c+"==========>t"+x+" ->"+arr2[j]);
                  //  System.out.println("\n dp"+c+"==========>t"+x+" ->"+arr1[i]);
                }
            }
            
          
                 
           j++;
                }  
            }
            catch(Exception e){
            e.printStackTrace();}
            
            
            
            /*
            try{
            while(arr1[i]!=null)
            {
                j=0;
                while(arr2[j]!=null)
                {
                 if(arr2[j].equals(arr1[i]))
                 {
                     System.out.println(arr2[j]);
                     fip2 = new Scanner(new File("G:\\stock\\Effectivepattern\\Datasets\\new2.txt"));
                    c=1;
                   x++;
                   while(fip2.hasNext())
                   {
                String s1=fip2.next();
                if(s1.endsWith("mm"))
                {
                    if(s1.replace("mm", " ").equals(arr1[i]))
                    {
                        t2.append("\n dp"+c+"========>t"+x+" ->"+arr1[i]);
                    //    System.out.println("\n dp"+c+"==========>t"+x+" ->"+arr1[i]);
               
                     }

                    c++;
                      
                }
                else if(s1.equals(arr1[i]))
                {
                    
                    t2.append("\n dp"+c+"==========>t"+x+" ->"+arr1[i]);
                  //  System.out.println("\n dp"+c+"==========>t"+x+" ->"+arr1[i]);
                }
            }
            
            i++;
                 }
                 j++;
                }
            }  
            }
            catch(Exception e){
            e.printStackTrace();}
            
            /*try{
            while(!arr1[i].equals(null))
            {
                j=0;
                while(!arr[j].equals(null))
                {
                 if(arr[j].equals(arr1[i]))
                 {
                if(count[i]>4)
                {
                    fip2 = new Scanner(new File("G:\\stock\\Effectivepattern\\Datasets\\new2.txt"));
                    c=1;
                   x++;
                   while(fip2.hasNext())
                   {
                String s1=fip2.next();
                if(s1.endsWith("mm"))
                {
                    if(s1.replace("mm", " ").equals(arr1[i]))
                    {
                        t2.append("\n dp"+c+"========>t"+x+" ->"+arr1[i]);
                        System.out.println("\n dp"+c+"==========>t"+x+" ->"+arr1[i]);
               
                     }

                    c++;
                      
                }
                else if(s1.equals(arr1[i]))
                {
                    
                    t2.append("\n dp"+c+"==========>t"+x+" ->"+arr1[i]);
                    System.out.println("\n dp"+c+"==========>t"+x+" ->"+arr1[i]);
                }
            }
            }
            i++;
                 }
                }
            }  
            }
            catch(Exception e){
            System.out.println("exception=>"+e);}
            
            */
        }
        catch(Exception e){}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try
        {
            
            t2.setText("");
                     Scanner fip2 = new Scanner(new File("G:\\stock\\Effectivepattern\\Datasets\\new2.txt"));
                     int j=0;
                     int dp=1;
                     t2.append("dp1=> \n");
            String[] arr3=new String[200];
                     int[] arr4=new int[200];
            j=0;
           int i=0;
                     while(fip2.hasNext())
            {
                
                String s1=fip2.next();
                 arr3[j]=s1;
                // System.out.println(arr3[j]);
               j++;
                 
            }
                     j=0;
                     int flag=1;
                     k=0;
                     while(arr3[j]!=null)
                     {
                         int len=arr3[j].length();
                         
                         while(!arr3[i].endsWith("mm"))
                         {
                             k=0;
                             while(arr2[k]!=null)
                             {
                                  
                                if(arr2[k].equals(arr3[i]) ){
                                
                                arr4[k]=1;
                                }
                              
                          //     System.out.println("\t\t\t"+arr3[i]+"\n");
                              //  System.out.println("arr3"+arr3[i]);
                              k++;
                                  
                             }
                             i++;
                             
                             
                         }
                         k=0;
                         while(arr2[k]!=null)
                         {
                             if(arr3[i].replaceAll("mm", " ").equals(arr2[k])){
                                  arr4[k]=1;
                             
                             }
                  //            System.out.println("\t\t\t"+arr3[i]+"\n");
                  
                             k++;
                         }
                        if(dp==1)
                        arr5[dp-1]="";
                         if(arr3[i+1]!=null)
                         {  
                              int p=0;
                         while(p<20)
                         { 
                             if(arr4[p]==1)
                             {
                                 t2.append("\t\t t"+(p+1)+"\n");
                                 
                        
                         
                                 arr5[dp-1]=arr5[dp-1]+(p+1)+" "+"!"+" ";
                             }
                         p++;
                         }
                         p=0;
                         while(p<200)
                         {
                             arr4[p]=0;
                             p++;
                         } 
              
                         dp++;
                              t2.append("\ndp"+dp+"=>\n");
                              
                                arr5[dp-1]="";
                    //         System.out.println("\t\t\tt"+arr3[i+1]+"\n");
                              
                         }
                         else{
                                 int p=0;
                         while(p<20)
                         {
                             if(arr4[p]==1) 
                             {
                                 t2.append("\t\t t"+(p+1)+"\n");
                                   arr5[dp-1]=arr5[dp-1]+(p+1)+" "+"!"+" ";
                             }
                         p++;
                         }
                         p=0;
                         while(p<200)
                         {
                             arr4[p]=0;
                             p++;
                         } 
                         
                         }
                         j=i+1;
                         i++;
                       // j=j+i;
                         
                        // System.out.println("j=>"+arr3[j]);
                         
                     }
                     int p=0;
             while(arr5[p]!=null)
             {
                 System.out.println(arr5[p]);
                 p++;
             }
             k=0;
             while(arr2[k]!=null)
             {
              k++;
             }
             System.out.println("k=>"+k);
        }
        catch(Exception e){}
        
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PTM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PTM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PTM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PTM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PTM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea t2;
    // End of variables declaration//GEN-END:variables
}

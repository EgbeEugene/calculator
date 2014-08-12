/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
    
   
import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import javax.swing.JTextField;

/**
 *
 * @author Larry_Lite
 */
public class GpaFrame extends JFrame
{

  private JButton num1, num2, num3, num4, num5, num6;
  private JButton gradeA, gradeBplus, gradeB, gradeCplus, gradeC, gradeDplus,
    gradeD, gradeF, gradeX;
  private JButton clear, calculate;
  private JTextField textDisplay;
  private JPanel panelLow, panelMid, panelTop;
  
  public GpaFrame(){
    
  super( "GPA Calc_LiteEdition" );
  setLayout( new FlowLayout() );
 
  num1 = new JButton("1");
  num2 = new JButton("2");
  num3 = new JButton("3");
  num4 = new JButton("4");
  num5 = new JButton("5");
  num6 = new JButton("6");
  
  panelLow = new JPanel();
  panelTop = new JPanel();
  panelMid = new JPanel();
 
  textDisplay = new JTextField( 24 );
  
  add(textDisplay);
  
  panelMid.add(num1);
  panelMid.add(num2);
  panelMid.add(num3);
  panelLow.add(num4);
  panelLow.add(num5);
  panelLow.add(num6);
  
  add(panelLow);
  add(panelMid);
  add(panelTop);
 
  
 clear = new JButton("Clear");
   calculate = new JButton("Calculate");
  gradeA = new JButton("A");
  gradeBplus = new JButton("B+");
  gradeB = new JButton("B");
  gradeCplus = new JButton("C+");
  gradeC = new JButton("C");
  gradeDplus = new JButton("D+");
  gradeD = new JButton("D");
  gradeF = new JButton("F");
  gradeX = new JButton("X");
  
 panelMid.add(gradeA);  panelMid.add(gradeBplus);
 panelMid.add(gradeB); panelLow.add(gradeCplus); panelLow.add(gradeC);
  panelLow.add(gradeDplus); panelTop.add(gradeD); panelTop.add(gradeF); 
  panelTop.add(gradeX); 
  add(clear); add(calculate);
 
  ButtonHandler handler = new ButtonHandler();
  num1.addActionListener( new ButtonHandler());
  num2.addActionListener(handler);
  num3.addActionListener(handler);
  num4.addActionListener( handler);
  num5.addActionListener( handler);
  num6.addActionListener( handler );
  gradeA.addActionListener( handler);
  gradeBplus.addActionListener(handler);
  gradeB.addActionListener(handler);
  gradeCplus.addActionListener(handler);
  gradeC.addActionListener(handler);
  gradeDplus.addActionListener(handler);
  gradeD.addActionListener(handler);
  gradeF.addActionListener(handler);
  calculate.addActionListener(handler);
  clear.addActionListener(handler);
  }
          
  
  
  private class ButtonHandler implements ActionListener
  {
      public void actionPerformed(ActionEvent event)        
      {
          int creditSum = 1, c1=1,c2=2,c3=3,c4=4,c5=5,c6=6 ;
          double gradeSum = 0.00, g1,g2,g3,g4,g5,g6,g7,g8; 
          
              if(event.getSource() == num1){
                 
                  textDisplay.setText(event.getActionCommand());
              creditSum +=c1 ; 
              }
              else if(event.getSource() == num2){
                  textDisplay.setText(event.getActionCommand());
             
              creditSum += c2;
              }
              else if(event.getSource() == num3){
                  textDisplay.setText(event.getActionCommand());
             
              creditSum += c3;
              }
              else if(event.getSource() == num4){
                  textDisplay.setText(event.getActionCommand());
                  
              creditSum += c4;
              }
              else if(event.getSource() == num5){
                  textDisplay.setText(event.getActionCommand());
                
              creditSum += c5;
              }
              else if(event.getSource() == num6){
                  textDisplay.setText(event.getActionCommand());
               
              creditSum += c6;
              }
          
              else if(event.getSource() == gradeA){
                  textDisplay.setText(event.getActionCommand());
                  g1 = 4.0;
              gradeSum += g1;
              }
              else if(event.getSource() == gradeBplus){
                  textDisplay.setText(event.getActionCommand());
                  g2 = 3.5;
                  gradeSum += g2;
              }
              else if(event.getSource() == gradeB){
                  textDisplay.setText(event.getActionCommand());
                  g3 = 3.0;
              gradeSum += g3;
              }
              else if(event.getSource() == gradeCplus){
                  textDisplay.setText(event.getActionCommand());
                  g4 = 2.5;
              gradeSum += g4;
              }
              else if(event.getSource() == gradeC){
                  textDisplay.setText(event.getActionCommand());
                  g5 = 2.0;
              gradeSum += g5;
              }
              else if(event.getSource() == gradeDplus){
                  textDisplay.setText(event.getActionCommand());
                  g6 = 1.5;
              gradeSum += g6;
              }
              else if(event.getSource() == gradeD){
                  textDisplay.setText(event.getActionCommand());
                  g7 = 1.0;
              gradeSum += g7;
              }
              else if(event.getSource() == gradeF){
                  textDisplay.setText(event.getActionCommand());
                  g8 = 0.0;
              gradeSum += g8;
              } 
           if(event.getSource() == calculate){
                 
              String string = String.format("Your Gpa is %.2f",   calc(creditSum, gradeSum));
          JOptionPane.showMessageDialog(GpaFrame.this,string );
          }
          else if(event.getSource() == clear)
          {   creditSum = 0;
              gradeSum = 0.00;
              textDisplay.setText("");
              JOptionPane.showMessageDialog(GpaFrame.this,"Resetting... Press OK to continue ");
          }
         calc(creditSum, gradeSum);    
          }// action method Ends Here
      public double calc(int x, double y)
      {
          double gpa = 0.00;
          gpa += y / x;
          return gpa;
      }
      
      }//Private ahndler class Ends Here
  
      }// Frame class Ends Here
   
  



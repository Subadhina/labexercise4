/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.Scanner;

/**
 *
 * @author ELCOT
 */
public class moneyconvert {
 //   public static void main(String[] args) {
    
        double dollar,rupees,yen,euro;
        Scanner obj=new Scanner(System.in);
        public double dollortorupee()
        {
            
          System.out.println("Enter the dollar");
          dollar=obj.nextDouble();
          rupees=dollar*74.85;
            return rupees;
        
        }
        public double rupeetodollar()
        {
            System.out.println("Enter the rupee");
            rupees=obj.nextDouble();
            dollar=rupees*0.013;
            return dollar;
        }
        public double yentorupee()
        {
            
          System.out.println("Enter the yen");
          yen=obj.nextDouble();
          rupees=yen*0.70;
            return rupees;
        
        }
        public double rupeetoyen()
        {
            System.out.println("Enter the rupees");
            rupees=obj.nextDouble();
            yen=rupees*1.42;
            return yen;
        }
         public double eurotorupee()
        {
            
          System.out.println("Enter the euro");
          euro=obj.nextDouble();
          rupees=euro*88.65;
            return rupees;
        
        }
        public double rupeetoeuro()
        {
            System.out.println("Enter the rupees");
            rupees=obj.nextDouble();
            euro=rupees*0.011;
            return euro;
        }

        

        
}

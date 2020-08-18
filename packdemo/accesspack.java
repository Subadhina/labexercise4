/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packdemo;
import pack1.*;
import pack1.sub.fourthpack;
import pack1.sub1.thirdpack;

/**
 *
 * @author ELCOT
 */
public class accesspack {
    public static void main(String[] args) { 
        firstpack s=new firstpack();
        s.display();
        secondpack p=new secondpack();
        p.display();
        thirdpack p3=new thirdpack();
        p3.display();
        fourthpack p2=new  fourthpack();
        p2.display();
       moneyconvert s3=new moneyconvert();
       System.out.println("The value of dollar in rupees: RS."+s3.dollortorupee());
       System.out.println("The value of yen in rupees: Rs."+s3.yentorupee());
       System.out.println("The value of euro in rupees: Rs."+s3.eurotorupee());
       System.out.println("VICE VERSA=======================");
       System.out.println("The value of rupees in dollar: "+s3.rupeetodollar()+"dollar");
       System.out.println("The value of rupees in yen: "+s3.rupeetoyen()+"yen");
       System.out.println("The value of rupees in euro: "+s3.rupeetoeuro()+"euro");
       
    
    }
    
    
}

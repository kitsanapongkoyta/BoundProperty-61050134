/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bound_property;
import java.util.Scanner;
/**
 *
 * @author kitsa
 */
public class Bound_property {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyBean mySource = new MyBean();
        listener1 listener1 = new listener1();
        listener2 listener2 = new listener2();
        mySource.addPropertyChangeListener(listener1);
        mySource.addPropertyChangeListener(listener2);
        
        while(true){
            System.out.print("live result : "+" ");
            String rs = sc.nextLine();
            mySource.setRESULT(rs);
            
           if(rs.equals(""))
           { System.exit(0); }
        }
    }
    
}

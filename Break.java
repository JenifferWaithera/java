/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgbreak;

/**
 *
 * @author Waithera
 */
public class Break {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=5;
        
        loopA:
        if(i<20){
            if(i==10)
                break loopA;   //labelled break statement(loopA)
            
            System.out.println("i=" +i);
            i++;
        }
        System.out.println("not in loop");
    }
    
}

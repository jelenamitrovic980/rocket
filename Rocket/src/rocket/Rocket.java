/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rocket;

/**
 *
 * @author jelena mitrović
 */
public class Rocket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] x = {1,2,3,4,5,6,7,8,9,10}; // This is a array.
        
        for(int i=0; i<x.length; i++){ // This is a for loop, which goes to lenght.
            System.out.println("Rocket go "+x[i]+" ");
        }
        String [] y = {"This","is","a","Rocket!"};
        
        for(int i=0; i<y.length;i++){
            System.out.print(y[i]+"\t");
                    }
        
    }
    
}

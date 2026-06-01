/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rotate;

/**
 *
 * @author hp
 */
public class Rotate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] queue = {1,2,3,4,5};
        int last = queue[queue.length-1];
        for(int i = queue.length-1;i>0;i--){
            queue[i]=queue[i-1];
            
        }
        queue[0]=last;
        System.out.println("array after rotation:");
        for(int num :queue){
            System.out.print(num+"");
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unique;

/**
 *
 * @author hp
 */
public class Unique {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String str = "programming";
       for(int i=0;i<str.length();i++){
           int count = 1;
           for (int j=i+1;j<str.length();j++){
               if(str.charAt(i)==str.charAt(j)){
                   count++;
               }
           }Boolean alreadyPrinted = false;
           for(int k=0;k<i;k++){
               if(str.charAt(i)==str.charAt(k)){
                   alreadyPrinted = true;
                   break;
               }
           }if(!alreadyPrinted){
           System.out.println(str.charAt(i)+"="+count);
       }
       }
    }
    
}

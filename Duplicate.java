/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duplicate;

/**
 *
 * @author hp
 */
public class Duplicate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "banana";
        for(int i=0;i<str.length();i++){
            int count = 1;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)== str.charAt(j)){
                    count++;
                }
            }boolean alreadyprinted = false;
        for(int k=0;k<i;k++){
            if(str.charAt(i)==str.charAt(k)){
                alreadyprinted = true;
                break;
        } 
            }if(count>1&&!alreadyprinted){
                System.out.println(str.charAt(i)+"="+count);
            }
        }
    }
    
}

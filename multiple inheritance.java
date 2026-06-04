interface AA {
   void showA();
 }
interface BB extends AA{
     void showB();
 }
interface CC extends AA {
    void showC();
} 
class DD implements BB,CC{
    public void showA(){
    System.out.println("A");
    
}
    public void showB(){
    System.out.println("B");
}
    public void showC(){
    System.out.println("C");
}
    
}
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       DD obj = new DD();
       obj.showA();
       obj.showB();
       obj.showB();
       
    }
    
}


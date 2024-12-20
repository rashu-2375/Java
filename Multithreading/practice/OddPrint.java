

public class OddPrint implements Runnable{
    public OddEven obj;
    
    public OddPrint(OddEven obj){
        this.obj = obj;}
    
    public void run() {      
        obj.printOdd();
    } 
}

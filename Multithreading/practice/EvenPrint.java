

public class EvenPrint implements Runnable{
    public OddEven obj;
    public EvenPrint(OddEven obj){
        this.obj = obj;
    }
    
    public void run() {
        obj.printEven();
    } 
}
    


    


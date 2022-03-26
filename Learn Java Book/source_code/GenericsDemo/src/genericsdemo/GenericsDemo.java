package genericsdemo;
public class GenericsDemo {
    
    public static void main(String[] args) {

        MyGenericsClass g = new MyGenericsClass();
        
        g.setMyVar(6);
        g.printValue();
    }    
}

class MyGenericsClass{
    
    private Integer myVar;
    
    void setMyVar (Integer i){
        myVar = i;
    }
    
    void printValue(){
        System.out.println("The value of myVar is " + myVar);
    }    
}

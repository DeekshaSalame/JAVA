
class Num {
    
    protected int number;

    // Constructor
    public Num(int number) {
        this.number = number;
    }


    public void showNum() {
        System.out.println("Number: " + number);
    }
}
class HexNum extends Num {

    // Constructor
    public HexNum(int number) {
        super(number);
    }

    
    
    public void showNum() {
        
        System.out.println("Hexadecimal: " + Integer.toHexString(number).toUpperCase());
        System.out.println("Octal: " + Integer.toOctalString(number));
    }
}


public class NumDemo {
    public static void main(String[] args) {
        
        Num num = new Num(42);
        System.out.println("Base class method:");
        num.showNum();

        
        HexNum hexNum = new HexNum(42);
        System.out.println("\nDerived class method:");
        hexNum.showNum();
    }
}

    


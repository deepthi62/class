package Abstraction;

public class Testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            HDFC h = new HDFC();
            h.createPPF();
            h.getkyc();
            h.createacc();
            
           System.out.println("**************************"); 
           RBI r = new HDFC();
           r.createacc();
           r.getkyc();
           r.createPPF();
	}

}

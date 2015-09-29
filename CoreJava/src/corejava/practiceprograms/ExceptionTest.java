package corejava.practiceprograms;

public class ExceptionTest {

	public static void main(String[] args)
    { 
       /* System.exit(0);  // is it necessary? And when it must be called? 
        System.out.println("hello world");*/
		
		try{
			int i=1;
			int j=0;
			int c=i/j;
			return;
		}catch(Exception e){
			System.out.println("1111");
			return;
		}
		finally{
			System.out.println("tetet");
			return;
		}
		
		
    }      

}

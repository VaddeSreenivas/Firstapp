
public class Finallyexple {
	
	public static void main(String[] args) {
		
		try {
			
			System.exit(0);
		}catch(Exception e) {
			
			System.err.println();
		}
		finally {
			
			System.out.println("HIII iam final");
		}
	}

}

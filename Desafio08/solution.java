import java.io.IOException;
import java.util.Scanner;

class JumpingFrog{
	int P, N;
	
	int Winner(int first, int second){
		if (first>second){
			if (first-second <= P)
				return 0;
			else 
				return 1;
		}
		else{
			if (second-first <= P)
				return 0;
			else 
				return 1;
		}
	}
}
    
public class Main {

    public static void main(String[] args) throws IOException {
 
      Scanner sc=new Scanner(System.in);
  		JumpingFrog jf= new JumpingFrog();
  		
  		int i, Store[], WinOrNot = 0;;
  		
  		jf.P = sc.nextInt();
  		jf.N = sc.nextInt();
  		
  		Store = new int [jf.N];
  		
  		Store[0] = sc.nextInt();
  		for (i=1; i<jf.N; i++){
  			Store[i] = sc.nextInt();
  			if (WinOrNot == 0)
  				WinOrNot = jf.Winner(Store[i-1], Store[i]);
  		}
  		
  		if (WinOrNot == 0)
  			System.out.println("YOU WIN");
  		else
  			System.out.println("GAME OVER");
  		
  		System.exit(0);
 
 }
}

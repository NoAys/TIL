
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		double score[] = new double[a]; 
		double avg, max = 0,sum = 0;
		
		for(int i=0;i<score.length;i++) {
			score[i] = sc.nextInt(); 
			
			if(score[i]>max) 
				max = score[i]; 
		}
		
		for(int i=0;i<score.length;i++) {
			score[i] = (score[i]/max)*100;
			sum += score[i];
		}
		sc.close();
		
		avg = sum / a;
		
		System.out.println(avg);
	}
}

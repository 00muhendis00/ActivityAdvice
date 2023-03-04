package Project;
import java.util.Scanner;
public class ActivityAdvice {
	public static void main(String[] args) {
		int temperature;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Sıcaklık kaç derece? ");
		temperature = input.nextInt();
		
		if(temperature <= 5) {
			System.out.print("Ski at the ski resort");
		}
		else if((temperature >=5) && (temperature <15)) {
			System.out.print("Drink hot chocolate at the home");
		}
		else if((temperature >=15) && (temperature < 25)) {
			System.out.print("Go out with your friends");
		}
		else if(temperature >=25) {
			System.out.print("Sunbathe on the beach");
		}
		else {
			System.out.print("Hatalı Giriş");
		}
	}
}

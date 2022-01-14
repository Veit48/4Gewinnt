import java.util.Scanner;

public class Bedingungen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int alter = sc.nextInt();
		System.out.println("Bitte geben Sie ihr Alter ein:");
		
		if(alter <= 14) {
			System.out.println("Viel Spaß beim Tretroller fahren! ^^"); 
			}
		else {
			if (alter >= 21)
				System.out.println("Alles");
			else {
				if (alter >= 20) 
					System.out.println("A");
				else {
					if (alter >= 18) {
						System.out.println("A1");
					System.out.println("A");
					System.out.println("B");
					System.out.println("C");
					System.out.println("C1");
					System.out.println("T");
					}
					else {
						if (alter >= 17)
							System.out.println("B");
						else { 
							if (alter >= 16)
								System.out.println("G");
						}
					}
				}
			}
			
			
		}
		
	}

}

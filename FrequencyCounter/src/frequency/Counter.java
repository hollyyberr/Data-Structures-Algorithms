package frequency;

import java.util.Scanner;

public class Counter {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a word(all lowercase letters): ");
		String input = scan.nextLine();
		int length = input.length();
		int [] word = new int [length];
		char string[] = input.toCharArray();
		
		//nested for loop
		for(int i = 0; i <input.length(); i++) {  
			word[i] = 1;  
			for(int j = i+1; j < input.length(); j++) {  
				if(string[i] == string[j]) {  
					word[i]++;  

					//Set string[j] to 0 to avoid printing visited character  
					string[j] = '0';  
				}  
			}  
		}  

		//Displays the each character and their corresponding frequency  
		System.out.println("Characters and their corresponding frequencies");  
		for(int x = 0; x <word.length; x++) {  
			if(string[x] != ' ' && string[x] != '0')  
				System.out.println(string[x] + "-" + word[x]);  
		}  

	}
}

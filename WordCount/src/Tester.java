public class Tester {

	public static void main(String[] args) {

		String string = "Monmouth University is located in Monmouth county that is a county in central New Jersey";

		WordList word = new WordList(string);

		System.out.println("Word count:");
		word.display();

	}

}
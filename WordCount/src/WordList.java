import java.util.StringTokenizer;

public class WordList {

	protected Word head;
	String str;
	WordList(String s) {
		str = s;
		head = null;
		}
	private void addFirst(Word word) {
		//step 1: add new node to the list
		//v.next=head;
		word.setNext(head);

		//step 2: reset head
		head = word;

		//System.out.println(head);

	}

	private void calculateFreq(){
		StringTokenizer token = new StringTokenizer(str);
		Boolean updated = false;
		String words;
		

		while(token.hasMoreElements()) {
			Word temp = head;

			words = token.nextToken();

			//set updated to false for each letter in the array
			updated = false;

			while (temp != null) {
				//found the letter, update freq
				if(words.equals(temp.getWord())) {
					temp.update();
					updated = true;
					break;
				}

				temp = temp.getNext();	
			}

			//not found
			if(!updated) {
				addFirst(new Word(words));
			}
		}

	}

	void display(){
		//calculate number frequencies
		calculateFreq();

		//display num-freq
		Word temp = head;
		while(temp != null) {
			temp.display();
			temp = temp.getNext();
		}


	}

}

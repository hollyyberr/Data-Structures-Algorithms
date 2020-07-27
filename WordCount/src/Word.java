public class Word {
	
private String s;
private int freq;
private Word next;

Word(String str){
	s=str;
	freq = 1;
	next = null;
}
	
public void update() {
	freq++;
}

public void setNext(Word n) {
	next = n;
}

public Word getNext() {
	return next;
}

public String getWord() {
	return s;
}
	
public void display() {

	System.out.println(s + ": " + freq);
}

}

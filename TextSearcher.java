import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class TextSearcher {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner searchWord = new Scanner(System.in);
		System.out.println("Input the word you want to search for: ");
		String word = searchWord.next();
		Scanner searchFile = new Scanner(System.in);
		System.out.println("Input the file you want to search: ");
		String file = searchFile.next();
		Scanner scan = new Scanner(new File(file));

		while(scan.hasNextLine()){
		    String s = scan.nextLine();
		    if(s.indexOf(word) != -1){
		        System.out.println(s);
		    }
		}
	}
}


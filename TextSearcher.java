import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class TextSearcher {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("filename.txt"));

		while(scan.hasNextLine()){
		    String s = scan.nextLine();
		    if(s.indexOf("word") != -1){
		        System.out.println(s);
		    }
		}
	}
}


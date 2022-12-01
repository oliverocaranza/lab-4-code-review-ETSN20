import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class TextSearcher {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.println("Input here in the form 'Search <word> <file>': ");
		String input1 = input.next();
		String[] inputs = input1.split(" ");
		
		if (inputs.length == 3 && inputs[0].equals("Search")) {
			Scanner file = new Scanner(new File(inputs[2]));
			while(file.hasNextLine()){
			    String line = file.nextLine();
			    if(line.contains(inputs[1])){
			        System.out.println(line);
			    }
			}
		}
		else {
			System.out.println("Inpust must be in the requested form.");
		}
	}
}


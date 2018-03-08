package reader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";

		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(textFile);
		} catch (FileNotFoundException e) {
			System.out.println("Sorry, File not found");
			e.printStackTrace();
		}
		br = new BufferedReader(fr);
		String text = "";
		try {
			while((text = br.readLine())!=null){

				System.out.println(text);
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
		finally{
			try {
				if(fr!=null){
					fr.close();
				}
			} catch (IOException e){
				e.printStackTrace();
			}
		}


	}

}

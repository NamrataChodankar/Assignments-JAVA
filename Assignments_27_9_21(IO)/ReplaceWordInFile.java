package Assignment_27_9_21;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReplaceWordInFile {
	static void modifyFile(String filePath, String oldString, String newString)
    {
        File fileToBeModified = new File(filePath);
        String oldContent = "";
        BufferedReader reader = null;
        FileWriter writer = null;
        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));
            String line = reader.readLine();
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();         
                line = reader.readLine();
            }             
            String newContent = oldContent.replaceAll(oldString, newString);
            writer = new FileWriter(fileToBeModified);
            writer.write(newContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
            	reader.close();                 
                writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }
     
    public static void main(String[] args)
    {
    	 System.out.println("Enter Folder path:");
		  try (Scanner sc = new Scanner(System.in)) {
			String path=sc.next();
			System.out.println("enter the word to be replaced:");
			String oldString=sc.next();
			System.out.println("enter the new word to be replaced with old word :");
			String newString=sc.next();
        modifyFile(path, oldString, newString);
        System.out.println("File modified!!!!!");
    }

	}

}
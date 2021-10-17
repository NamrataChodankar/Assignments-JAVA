/*
 * 4. Count number of files in a given folder
Ask end user to enter folder path on console and count number of files in that folder.
 */

package Assignment_27_9_21;

import java.io.File;
import java.util.Scanner;

public class FolderFileCount {
	  public static void main(String args[]){
		  System.out.println("Enter Folder path:");
		  try (Scanner sc = new Scanner(System.in)) {
			String folder=sc.next();
			File f=new File(folder);
			int fileCount=f.list().length;
			System.out.println("File Count:"+fileCount);
			
		}
	  }
	}
	


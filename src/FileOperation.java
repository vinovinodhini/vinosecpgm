import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileOperation {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\vino\\vinopgmm\\winslet.xlsr");
		boolean createNewFile = f.createNewFile();
		System.out.println(createNewFile);
				
		
		}
		
	}








/*
 * 	5	File f=new File("C:\\vino\\vinopgm");
//to create a new folder
boolean folder1 = f.mkdir();
System.out.println(folder1);

	4	//create new file
				


	3	//canread and write and exits		
		File f=new File("C:\\vino\\vinopgm\\winslet.xlsr");
				//check read or not
				boolean canRead = f.canRead();
				System.out.println(canRead);
				//check write or not
				boolean canWrite = f.canWrite();
				System.out.println(canWrite);
				//exits or not
				boolean exists = f.exists();
				System.out.println(exists);
		

	2	//file and directory is available or not		
		File f=new File("C:\\vino\\vinopgm");
				//given location file is or not
				boolean file = f.isFile();
				System.out.println(file);
				//given location is directory or folder or not
				boolean directory = f.isDirectory();
				System.out.println(directory);
		

		
	1	//print all the file without location
		File f=new File("C:\\vino");
		String[] list = f.list();
		for (String string : list) {
			System.out.println(string);
			
		}
		//print all files with that location
		File[] listFiles = f.listFiles();
		for (File file : listFiles) {
			System.out.println(file);
*/


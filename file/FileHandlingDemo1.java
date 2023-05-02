package file;
import java.io.*;

public class FileHandlingDemo1 {

	public static void main(String[] args) throws IOException {
	
		String s="An Apple a day keeps doctor away";
		char c[]=s.toCharArray();
		File folder=new File("/home/sivanesh/Desktop/java/File-Handling");
		System.out.println("1:"+folder.mkdir());
		String filename[]=folder.list();
		System.out.println("2:"+folder.isDirectory());
		
		File f=new File(folder,"document.txt");
		System.out.println("3:"+f.isFile());
		System.out.println("4:"+f.exists());
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("5:"+f.isFile());
		System.out.println("6:"+f.exists());
		
		try {
			FileWriter fw=new FileWriter(f,true);
			fw.write(c);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("7:"+folder.length());
		
	FileReader fr=new FileReader(f);
	int i=fr.read();
		
		while(i!=-1) {
			System.out.print((char)i);
			i=fr.read();
		}
		
		
		
	}

}

import java.io.*;
public class FileReaderEx {
	
		public static void main(String[] args) {
			FileReader fin = null;
			
			try {
				fin = new FileReader("c:\\temp\\phone.txt");
				int c;
				while((c = fin.read())!=-1) {
					System.out.print((char)c);
				}
				
				fin.close();
				
			}catch(IOException e) {
				System.out.print("����¿���");
			}
		}

	}



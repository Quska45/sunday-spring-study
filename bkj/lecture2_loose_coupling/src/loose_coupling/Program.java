package loose_coupling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/loose_coupling/setting.txt");
		Scanner scan = new Scanner(fis);
		
		String className = scan.nextLine();
		scan.close();
		fis.close();

		Class clazz = Class.forName(className);
		A a = new A();
		X x = (X) clazz.newInstance();
		a.setX(x);
		
		a.print();
	}

}

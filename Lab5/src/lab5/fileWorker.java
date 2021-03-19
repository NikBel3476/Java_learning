package lab5;

import java.io.*;


public class fileWorker {
	
	private static String readFile(String fileName) {
		File f = new File(fileName);
		String str = "";
		if (f.isFile()) {
			int letter;
			try {
				FileReader FR = new FileReader(f);
				while ((letter = FR.read()) != -1) {
					str += (char)letter;
				}
				FR.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		return str;
	}
	
	private static void writeFile(String str, String fileName) {
		try {
			File f = new File(fileName);
			FileWriter fw = new FileWriter(f, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.printf(str);
			pw.close();
			System.out.println("file has written");
		} catch(IOException e) {
			System.out.println("ошибка открытия потока " + e);
			System.exit(1);
		}
	}
	
	private static String strTransform(String str) {
		String[] Words = str.split(" ");
		String resultString = "";
		for (int i = 0; i < Words.length; i++) {
			if (i % 2 == 0) {
				resultString += Words[i].toLowerCase() + " ";
			} else {
				resultString += Words[i].toUpperCase() + " ";
			}
		}
		// удаляем пробел в конце
		resultString = resultString.substring(0, resultString.length() - 1);
		return resultString;
	}
	
	
	public static void main(String[] args) {
		writeFile(strTransform(readFile("originString.txt")), "result.txt");
	}
}

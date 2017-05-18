package org.vipinmalik.io;

import java.io.File;
import java.io.IOException;
import java.io.Console;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;

class FileIOTest {
	public static void main (String[] args) {
		
		FileIOTest thisOb = new FileIOTest();

		File docsDir = thisOb.createDocDir("N:/Projects/Java/docstore/io");

		File newFile;

		if (args.length > 0 && args[0].equalsIgnoreCase("all")) {

			newFile = thisOb.createFileWithCreateNewFile(docsDir);
			
			newFile = thisOb.createFileWithPrintWriter(docsDir);

			newFile = thisOb.createFileWithFileWriter(docsDir);

			newFile = thisOb.createFileWithBufferedWriter(docsDir);

			thisOb.readFileWithFileReader(newFile);
		}
	}

	/**
	*  creates a directory to keep all the generated files
	**/
	public File createDocDir(String docDirName) {
		if (docDirName.length() == 0) {
			Console c = System.console();
			docDirName = c.readLine("%s", "Enter docs directory name : ");
		}

		File docsDir = new File(docDirName);

		docsDir.mkdir();

		return docsDir;
	}

	/**
	* creates a new file using creteNewFile function of File object
	**/
	public File createFileWithCreateNewFile(File docsDir) {
		Console c = System.console();
		String fileName = c.readLine("%s", "Enter new File name : ");

		File myFile = new File(docsDir, fileName);

		Boolean newFile = true;

		try {
			newFile = myFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Is New File : " + newFile);

		return myFile;
	}

	/**
	* creates a new file using PrintWriter object and writes few lines into the file
	**/
	public File createFileWithPrintWriter(File docsDir) {
		Console c = System.console();
		String fileName = c.readLine("%s", "Enter a new file name : ");

		File myFile = new File(docsDir, fileName);

		try {
			PrintWriter pw = new PrintWriter(myFile);

			for (Integer i = 0 ; i < 10; i++) {
				pw.println("This is line number : " + i);
			}

			pw.flush();

			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return myFile;
	}

	/**
	* create and write to a file using simple FileWriter
	**/
	public File createFileWithFileWriter(File docsDir) {
		Console c = System.console();
		String fileName = c.readLine("%s", "Enter file name : ");

		File myFile = new File(docsDir, fileName);

		try {
			FileWriter fw = new FileWriter(myFile);

			for (Integer i = 0; i < 10; i++) {
				fw.write("This is line number : " + i + "\n");
			}

			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return myFile;
	}

	/**
	* create and write to a file using BufferedWriter
	**/
	public File createFileWithBufferedWriter(File docsDir) {
		Console c = System.console();
		String fileName = c.readLine("%s", "Enter file name : ");

		File myFile = new File(docsDir, fileName);

		try {
			PrintWriter pw = new PrintWriter(myFile);

			BufferedWriter bw = new BufferedWriter(pw);

			for (Integer i = 0; i < 10; i++) {
				bw.write("This is line number : " + i);
				bw.newLine();
			}

			bw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return myFile;
	}

	public void readFileWithFileReader (File file) {
		try {
			FileReader fr = new FileReader(file);

			char[] in = new char[100];

			fr.read(in);
			
			for (char c : in) {
				System.out.println(c);
			}

			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
package org.vipinmalik.io;

import java.io.File;
import java.io.IOException;
import java.io.Console;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class FileIOTest {
	public static void main (String[] args) {
		try {
			Console c = System.console();

			FileIOTest thisOb = new FileIOTest();

			File docsDir = thisOb.createDocDir(c,"N:/Projects/Java/docstore/io");

			thisOb.createFileWithFileWriter(c, docsDir);

			if (args.length > 0 && args[0].equalsIgnoreCase("all")) {

				thisOb.createFileWithCreateNewFile(c, docsDir);
				
				thisOb.createFileWithPrintWriter(c, docsDir);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	*  creates a directory to keep all the generated files
	**/
	public File createDocDir(Console c, String docDirName) {
		if (docDirName.length() == 0) {
			docDirName = c.readLine("%s", "Enter docs directory name : ");
		}

		File docsDir = new File(docDirName);

		docsDir.mkdir();

		return docsDir;
	}

	/**
	* creates a new file using creteNewFile function of File object
	**/
	public File createFileWithCreateNewFile(Console c, File docsDir) {
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
	public File createFileWithPrintWriter(Console c, File docsDir) {
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

	public File createFileWithFileWriter(Console c, File docsDir) {
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

}
package com.cg.lambdaexpressions;

/*class Filefilter to return all subdirectories of a given directory
 *  using listFiles(FileFilter) & isDirectory method
 */

import java.io.File;
import java.io.FileFilter;

public class Filefilter {

	public static void main(String[] args) {

		File dir = new File("C:\\Users\\gjohari\\Downloads");

		File[] files = dir.listFiles(File::isDirectory);

		for (File f : files) {

			System.out.println(f);
		}
	}

}

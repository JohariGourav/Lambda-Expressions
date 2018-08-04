//class FilesByExtension to get all files in a directory by the Given Extension

package com.cg.lambdaexpressions;

import java.io.File;

public class FilesByExtension {

	public static void main(String[] args) {

		File dir = new File("C:\\Users\\gjohari\\Documents");
		String extension = ".java";
		File[] files = dir.listFiles((d, name) -> name.endsWith(extension));

		for (File f : files) {

			System.out.println(f);
		}

	}

}

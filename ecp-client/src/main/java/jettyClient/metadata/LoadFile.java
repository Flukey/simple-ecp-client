/* ***************************************************************************
 * Copyright 2012 Carolina Lindqvist
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * ***************************************************************************/

package jettyClient.metadata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoadFile {

	/**
	 * Read data from a file to a String.
	 * 
	 * @param pathname
	 * @return
	 */
	public static String read(String pathname) {

		File file = new File(pathname);
		FileInputStream fos = null;
		Scanner scanner = null;
		String text = "";

		try {
			fos = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			System.out.println("File " + pathname + " not found.");
			return "";
		}

		scanner = new Scanner(fos);

		while (scanner.hasNextLine())
			text += scanner.nextLine();

		return text;
	}

}

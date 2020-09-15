package io.github.MorganeFt.Seance08;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.BufferedReader;
import java.io.IOException;

public class Flows {

	public static void main(String[] args) throws IOException {

		Path filePath = Path.of("src/main/resources/io/github/MorganeFt/Seance8/NameList.txt");

		// Reading using InputStream
		try {
			InputStream inFile = Files.newInputStream(filePath);
			while (true) {
				int read = inFile.read();
				if (read == -1) {
					break;
				}
				System.out.print(read + " ");
			}

			inFile.close();
			System.out.println();

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Reading using BufferedReader
		try {
			BufferedReader inRead = Files.newBufferedReader(filePath, Charset.forName("UTF-8"));
			while (true) {
				String read2 = inRead.readLine();
				if (read2 == null) {
					break;
				}
				System.out.print(read2 + " ");
			}

			inRead.close();
			System.out.println();

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Reading a path not in the directory
		Path filePathAway = Path.of("C:\\Users\\morgane.fiot\\Documents\\Perso\\Musique.txt");

		String readString = Files.readString(filePathAway);
		System.out.println(readString);
	}
}

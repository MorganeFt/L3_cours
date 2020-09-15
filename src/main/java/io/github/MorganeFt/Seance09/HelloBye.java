package io.github.MorganeFt.Seance09;

import java.io.IOException;
import java.util.*;
import java.net.URI;
import java.nio.file.*;

public class HelloBye {

	public static void main(String[] args) throws IOException {
		Path myPath = Path.of("C:\\Users\\morgane.fiot\\Documents\\JAVA\\Exercices\\Seance9");
		Path test1Path = Path.of("test1");
		Path test2Path = Path.of("test2\\asubfolder");
		helloBye(test1Path);
		helloBye(test2Path);

		Map<String, String> env = new HashMap<>();
		env.put("create", "true");
		Path zipPath = myPath.resolve("zipfile.zip");
		if (!Files.exists(zipPath)) {
			URI zipfilePath = URI.create("jar:" + zipPath.toUri());
			try (FileSystem fs = FileSystems.newFileSystem(zipfilePath, env)) {
				Path myZipPath = fs.getPath("");
				helloBye(myZipPath);
			}
		}
	}

	public static void helloBye(Path myPath) throws IOException {
		Path helloPath = myPath.resolve("hello.txt");
		Files.writeString(helloPath, "Hello, world");

		Path subfolderPath = myPath.resolve("subfolder");
		if (!Files.exists(subfolderPath)) {
			Files.createDirectory(subfolderPath);
		}

		Path byePath = myPath.resolve("subfolder\\bye.txt");
		Files.writeString(byePath, "Bye bye!");
	}
}

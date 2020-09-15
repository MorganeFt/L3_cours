package io.github.MorganeFt.Seance09;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EasyMapMain {

	public static void main(String[] args) throws IOException {
		EasyMapImpl miageList = new EasyMapImpl();

		Path filePath = Path.of("src/main/resources/io/github/MorganeFt/Seance9");
		Path namePath = filePath.resolve("NameList.txt");
		BufferedReader listRead = Files.newBufferedReader(namePath);
		String firstName;

		try {
			while ((firstName = listRead.readLine()) != null) {
				miageList.put(firstName, new Person(firstName, listRead.readLine()));
			}
			listRead.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		listRead.close();

		System.out.println("After ordered :");
		List<Person> listMiageOrd = miageList.listOrdered();
		listMiageOrd.forEach(value -> System.out.println(value.toString()));

		Path newDirectory = filePath.resolve("newDirectory");
		if (!Files.exists(newDirectory)) {
			Files.createDirectories(newDirectory);
		}

		Path newFileListPath = newDirectory.resolve("newFileList.txt");
		Files.deleteIfExists(newFileListPath);
		Files.createFile(newFileListPath);
		Files.writeString(newFileListPath, listMiageOrd.toString());

		Path newFileCopyPath = newDirectory.resolve("newFileCopy.txt");
		Files.deleteIfExists(newFileCopyPath);
		Files.copy(namePath, newFileCopyPath);

		Map<String, String> env = new HashMap<>();
		env.put("create", "true");
		Path zipPath = filePath.resolve("zipfile.zip");
		Files.deleteIfExists(zipPath);
		URI zipfilePath = URI.create("jar:" + zipPath.toUri());
		try (FileSystem fs = FileSystems.newFileSystem(zipfilePath, env)) {
			Path myZipPath = fs.getPath("");
			Path dirZipPath = myZipPath.resolve("newDirectory");
			Files.createDirectories(dirZipPath);

			Path newFileListZipPath = dirZipPath.resolve("newFileListZip.txt");
			Files.copy(newFileListPath, newFileListZipPath);

			Path newFileCopyZipPath = dirZipPath.resolve("newFileCopyZip.txt");
			Files.copy(newFileCopyPath, newFileCopyZipPath);
		}
	}
}

package util;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler implements HandlesFiles {
    private String directory;

    public FileHandler(String directory) {
        this.directory = directory;
    }

    @Override
    public List<String> slurp(String filename) {
        Path filePath = Paths.get(this.directory, filename);
        try {
            return Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.println("Source does not exist!");
            return new ArrayList<>();
        }
    }

    @Override
    public void spit(String filename, List<String> contents) {
        Path filePath = Paths.get(this.directory, filename);
        try {
            Files.write(filePath, contents);
        } catch (IOException e) {
            System.out.println("Destination does not exist!");
        }
    }

    @Override
    public void spit(String filename, List<String> contents, boolean append) {
        Path filePath = Paths.get(this.directory, filename);
        try {
            if (append) {
                Files.write(filePath, contents, StandardOpenOption.APPEND);
            } else {
                Files.write(filePath, contents);
            }
        } catch (IOException e) {
            System.out.println("Destination does not exist!");
        }
    }
}
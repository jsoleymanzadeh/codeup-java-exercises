package util;

import java.util.List;

public interface HandlesFiles {
    List<String> slurp(String filename);

    void spit(String filename, List<String> contents);

    void spit(String filename, List<String> contents, boolean append);
}
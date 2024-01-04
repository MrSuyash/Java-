package classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    private static final String FILE_NAME = "todolist.txt";

    public static void saveTasks(List<String> tasks) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (String task : tasks) {
                writer.println(task);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> loadTasks() {
        List<String> tasks = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            File file = new File(FILE_NAME);
            if (!file.exists()) {
                file.createNewFile();
            }

            String line;
            while ((line = reader.readLine()) != null) {
                tasks.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tasks;
    }

    public static void deleteTasks() {
        try {
            File file = new File(FILE_NAME);
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

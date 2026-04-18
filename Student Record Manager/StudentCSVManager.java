import java.io.*;
import java.util.*;

public class StudentCSVManager {

    static String fileName = "Students.csv";

    public static void main(String[] args) {

        try {
            System.out.println("Initial Data:");
            displayFile();

            // CREATE → Add 3 new rows (marks4 & marks5 = 0)
            addStudents();
            System.out.println("\nAfter Adding Students:");
            displayFile();

            // UPDATE → Update marks
            updateMarks();
            System.out.println("\nAfter Updating Marks:");
            displayFile();

            // UPDATE → Calculate percentage
            calculatePercentage();
            System.out.println("\nAfter Calculating Percentage:");
            displayFile();

            // DELETE → Remove a row
            deleteStudent("102");
            System.out.println("\nAfter Deleting Student with ID 102:");
            displayFile();

            // EXCEPTION DEMO
            System.out.println("\n--- Exception Demonstration ---");
            readWrongFile(); // will throw IOException

        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }

    // READ
    public static void displayFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

    // CREATE
    public static void addStudents() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));

        bw.newLine();
        bw.write("103,Ravi,CS,60,65,70,0,0,0");
        bw.newLine();
        bw.write("104,Simran,IT,75,80,78,0,0,0");
        bw.newLine();
        bw.write("105,Karan,ENTC,55,60,58,0,0,0");

        bw.close();
    }

    // UPDATE marks
    public static void updateMarks() throws IOException {
        List<String> lines = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        String line;
        lines.add(br.readLine()); // header

        while ((line = br.readLine()) != null) {

            if (line.trim().isEmpty()) continue;

            String[] data = line.split(",");

            // Update marks4 & marks5 randomly
            data[6] = String.valueOf(70 + new Random().nextInt(20));
            data[7] = String.valueOf(70 + new Random().nextInt(20));

            lines.add(String.join(",", data));
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        for (String l : lines) {
            bw.write(l + "\n");
        }
        bw.close();
    }

    // CALCULATE percentage
    public static void calculatePercentage() throws IOException {
        List<String> lines = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        String line;
        lines.add(br.readLine()); // header

        while ((line = br.readLine()) != null) {

            if (line.trim().isEmpty()) continue;

            String[] data = line.split(",");

            double total = 0;
            for (int i = 3; i <= 7; i++) {
                total += Double.parseDouble(data[i]);
            }

            double percentage = total / 5;
            data[8] = String.format("%.2f", percentage);

            lines.add(String.join(",", data));
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        for (String l : lines) {
            bw.write(l + "\n");
        }
        bw.close();
    }

    // DELETE
    public static void deleteStudent(String id) throws IOException {
        List<String> lines = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        String line;
        lines.add(br.readLine()); // header

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if (!data[0].equals(id)) {
                lines.add(line);
            }
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        for (String l : lines) {
            bw.write(l + "\n");
        }
        bw.close();
    }

    // EXCEPTION DEMO
    public static void readWrongFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("WrongFile.csv"));
        br.readLine();
        br.close();
    }
}
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Doctor example
        Doctor doc = new Doctor("Dr. Smith", 10, "Cardiology");
        doc.work(); // overridden method
        doc.work(8, "City Hospital"); // overloaded method
        Integer[] patientIDs = {101, 102, 103};
        doc.printPatients(patientIDs); // wrapper class
        String[] docSkills = {"Surgery", "Diagnosis"};
        doc.printSkills(docSkills); // array parameter

        ArrayList<String> docProjects = new ArrayList<>();
        docProjects.add("Heart Surgery");
        docProjects.add("Medical Research");
        doc.printProjects(docProjects); // ArrayList parameter

        System.out.println(doc.toString()); // Object class

        System.out.println();
    }
}
import java.util.ArrayList;

public class Occupation {
    protected String name;
    protected int yearsEducation;
    public Occupation(String name, int yearsEducation) {
        this.name = name;
        this.yearsEducation = yearsEducation;
    }
    //array parameter
    public void printSkills(String[] skills) {
        System.out.println(name + "'s skills:");
        for (String skill : skills) {
            System.out.println("- " + skill);
        }
    }

    //ArrayList parameter
    public void printProjects(ArrayList<String> projects) {
        System.out.println(name + "'s projects:");
        for (String project : projects) {
            System.out.println("- " + project);
        }
    }

    // Overloaded methods
    public void work() {
        System.out.println(name + " is working.");
    }

    public void work(int hours) {
        System.out.println(name + " worked for " + hours + " hours.");
    }

    // Using Object class
    @Override
    public String toString() {
        return "name= " + name + ", Years of Education= " + yearsEducation;
    }
}


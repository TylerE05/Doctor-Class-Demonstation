import java.util.ArrayList;

public class Doctor extends Occupation {
    private String specialty;

    public Doctor(String name, int yearsEducation, String specialty) {
        super(name, yearsEducation);
        this.specialty = specialty;
    }

    // Overridden method
    @Override
    public void work() {
        System.out.println(name + " is treating patients in the field of " + specialty + ".");
    }

    // Using wrapper class (Integer)
    public void printPatients(Integer[] patientIDs) {
        System.out.println(name + "'s patients IDs:");
        for (Integer id : patientIDs) {
            System.out.println("- Patient #" + id);
        }
    }

    // Overloaded method
    public void work(int hours, String location) {
        System.out.println(name + " worked " + hours + " hours at " + location + ".");
    }
}
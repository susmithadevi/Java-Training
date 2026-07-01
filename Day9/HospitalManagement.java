
package Day9;

class HospitalPerson {

    String name;

    HospitalPerson(String name) {
        this.name = name;
    }

    void showRole() {
        System.out.println("Hospital Person");
    }
}

class Doctor extends HospitalPerson {

    Doctor(String name) {
        super(name);
    }

    void showRole() {
        System.out.println(name + " is a Doctor");
    }
}

class Nurse extends HospitalPerson {

    Nurse(String name) {
        super(name);
    }

    void showRole() {
        System.out.println(name + " is a Nurse");
    }
}

class Patient extends HospitalPerson {

    Patient(String name) {
        super(name);
    }

    void showRole() {
        System.out.println(name + " is a Patient");
    }
}

public class HospitalManagement {

    public static void main(String[] args) {

        HospitalPerson people[] = {
            new Doctor("Kumar"),
            new Nurse("Priya"),
            new Patient("Susi")
        };

        for (HospitalPerson p : people) {
            p.showRole();
        }
    }
}

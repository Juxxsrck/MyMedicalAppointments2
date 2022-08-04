import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Justine Pulido", "Radiologo");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);

        User user = new Doctor("Justine", "justine@email.com");
        user.showDataUser();

        User userPa = new Patient("Justine Patient", "justine@email.com");
        userPa.showDataUser();

        User user1 = new User("Justine", "justine@email.com") {
            @Override
            public void showDataUser() {
                System.out.println("\n\nDoctor\n");
                System.out.println("Hospital: Cruz Verde");
                System.out.println("Departamento: Geriatría");
            }
        };

        user1.showDataUser();
        /*for (model.Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }*/

        /*System.out.println(myDoctor.getAvailableAppointments());

        System.out.println();
        System.out.println();
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");

        System.out.println(patient);


         */


    }


}

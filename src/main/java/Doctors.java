import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eugene on 14.02.17.
 */
public class Doctors {

    class MedicalStaff {
    }

    class Doctor extends MedicalStaff {
    }

    class HeadDoctor extends Doctor {
    }
    class SubDoctor extends Doctor {
    }

    class Nurse extends MedicalStaff {
    }

    public static void main(String[] args) {


//        List<? extends Doctor> list1 = new ArrayList<MedicalStaff>(); // error
        List<? extends Doctor> list2 = new ArrayList<Doctor>();
        List<? extends Doctor> list3 = new ArrayList<HeadDoctor>();
        List<? extends Doctor> list4 = new ArrayList<SubDoctor>();
        Doctor doctor = (HeadDoctor) list2.get(0);
    }
}

package exercises;

public class CallDoctor {

	public static void main(String[] args) {
		// Calls doctors
		Doctor doctor = new Doctor();
		GeneralPractitioner generalPractitioner = new GeneralPractitioner();
		Surgeon surgeon = new Surgeon();
		doctor.doMedicine();
		surgeon.doMedicine();
		generalPractitioner.doMedicine();
	}

}

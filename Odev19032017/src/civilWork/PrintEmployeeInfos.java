package civilWork;

public class PrintEmployeeInfos {

	// Overloading Functions
	public void printInfo(Pupil pupil) {

		System.out.println("---with single input parameter---");
		System.out.println(pupil.getName());
		System.out.println(pupil.getTcid());
	}

	public void printInfo(Pupil pupil, Engineer engineer) {
		System.out.println("---with two input parameter---");
		System.out.println(pupil.getName());
		System.out.println(pupil.getTcid());
		System.out.println("----");
		System.out.println(engineer.getName());
		System.out.println(engineer.getTcid());

	}

	public void printInfo(Pupil pupil, Engineer engineer, Chief chief) {
		System.out.println("---with three input parameter---");
		System.out.println(pupil.getName());
		System.out.println(pupil.getTcid());
		System.out.println("----");
		System.out.println(engineer.getName());
		System.out.println(engineer.getTcid());
		System.out.println("----");
		System.out.println(chief.getName());
		System.out.println(chief.getTcid());
	}

	public void printInfo(Pupil pupil, Engineer engineer, Chief chief, Foreman foreman) {
		System.out.println("---with four input parameter---");
		System.out.println(pupil.getName());
		System.out.println(pupil.getTcid());
		System.out.println("----");
		System.out.println(engineer.getName());
		System.out.println(engineer.getTcid());
		System.out.println("----");
		System.out.println(chief.getName());
		System.out.println(chief.getTcid());
		System.out.println("----");
		System.out.println(foreman.getName());
		System.out.println(foreman.getTcid());
	}

	public void printInfo(Pupil[] arrayOfPupil) {
		System.out.println("---with array input parameter---");

		for (int i = 0; i < arrayOfPupil.length; i++) {
			System.out.println(arrayOfPupil[i].getName());
			System.out.println(arrayOfPupil[i].getTcid());

		}
		System.out.println("*******");
	}

}

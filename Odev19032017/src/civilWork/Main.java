package civilWork;

public class Main {

	public static void main(String[] args) {
		
		Pupil pupil = new Pupil();
		pupil.setName("ali");
		pupil.setTcid(123);
		
		Engineer engineer = new Engineer();
		engineer.setTcid(234);
		engineer.setName("veli");
		
		Chief chief = new Chief();
		chief.setName("hasan");
		chief.setTcid(345);
		
		Foreman foreman = new Foreman();
		foreman.setName("mehmet");
		foreman.setTcid(456);
		
		Pupil[] arrayOfPupil = new Pupil[3];
		
		Pupil pupilSecond = new Pupil();
		pupilSecond.setName("asd");
		pupilSecond.setTcid(567);
		
		Pupil pupilThird = new Pupil();
		pupilThird.setName("ert");
		pupilThird.setTcid(678);
		
		arrayOfPupil[0] = pupil;
		arrayOfPupil[1] = pupilSecond;
		arrayOfPupil[2] = pupilThird;
		
		PrintEmployeeInfos printEmployeeInfos = new PrintEmployeeInfos();
		
		printEmployeeInfos.printInfo(pupil);
		printEmployeeInfos.printInfo(pupil, engineer);
		printEmployeeInfos.printInfo(pupil, engineer, chief);
		printEmployeeInfos.printInfo(pupil, engineer, chief, foreman);
		printEmployeeInfos.printInfo(arrayOfPupil);
		
		
		
	}
}

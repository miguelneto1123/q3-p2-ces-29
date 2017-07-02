package exe03;

public class MVCPatternDemo {
	public static void main(String[] args) {

		// fetch student record based on his roll no from the database
		Student model = retriveStudentFromDatabase();

		// Create a view : to write student details on console
		StudentView view = new StudentView();

		Controller controller = ControllerFactory.buildController(model, view);

		controller.updateView();

		// update model data
		controller.setName("John");

		controller.updateView();

		// fetch professor record based on his roll no from the database
		Professor pModel = retriveProfessorFromDatabase();

		// Create a view : to write student details on console
		ProfessorView pView = new ProfessorView();

		controller = ControllerFactory.buildController(pModel, pView);

		controller.updateView();

		// update model data
		controller.setName("George");
		controller.setRollNo("234");

		controller.updateView();
	}

	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}

	private static Professor retriveProfessorFromDatabase() {
		Professor professor = new Professor();
		professor.setName("Michael");
		professor.setRollNo("195");
		return professor;
	}

}

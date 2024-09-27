package tp1.E3;




public class tp1E3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Estudiante[] vEstudiantes = new Estudiante[2];
		Profesor[] vProfesor = new Profesor[3];

		
		Estudiante e1 = new Estudiante("Ima", "Azpi", "ima@gmail.com", 1, "trenque");
		Estudiante e2 = new Estudiante("Val", "Rojas", "vv@gmail.com", 2, "LP");
		vEstudiantes[0]= e1;
		vEstudiantes[1]= e2;
		

		Profesor p1 = new Profesor("Ima", "Azpi", "ima@gmail.com", "Matematica II", "Unlp");
		
		
		
		
		for(Estudiante est: vEstudiantes) {
			
			System.out.println(est.tusDatos());
		}
		



	}
}
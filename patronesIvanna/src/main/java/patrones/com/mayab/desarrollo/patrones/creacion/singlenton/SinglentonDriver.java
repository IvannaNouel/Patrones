package patrones.com.mayab.desarrollo.patrones.creacion.singlenton;

public class SinglentonDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coordinador coor1= new Coordinador("nombre1", "escuala1");
		Coordinador coor2= new Coordinador("nombre2", "escuala2");
		Coordinador coor3= new Coordinador("nombre3", "escuala3");

		coor1.agregarClase("lun4pm", "clase1");
		coor2.agregarClase("lun4pm", "clase2");
		coor3.agregarClase("lun4pm", "clase3");
		
		SingletonSchedule.getInstance().print();

	}

}

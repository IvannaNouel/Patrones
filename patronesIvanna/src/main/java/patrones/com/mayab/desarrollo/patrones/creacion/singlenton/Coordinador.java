package patrones.com.mayab.desarrollo.patrones.creacion.singlenton;

public class Coordinador {

	public String name;
	public String escuela;
	
	public  Coordinador(String n , String e) {
		this.name= n;
		this.escuela=e;
	}
	public void agregarClase(String h, String n)
	{
		SingletonSchedule.getInstance().agregarClase(h, n);
	}
}

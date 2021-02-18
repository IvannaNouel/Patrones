package patrones.com.mayab.desarrollo.patrones.creacion.singlenton;
import java.util.HashMap;
import java.util.Map;

//un profesor da clases e 3 escuelas, los coordinadores de las escuelas tienen que acceder a la misma instancia para poder garantizar que estan viendo el mismo horario
//van a asignar una clase cada uno de ellos
public class SingletonSchedule {
	
	//lun-4pm: ClaseA
	//lun-5pm: ClaseB
	//...
	
	private HashMap<String, String>schedule = new HashMap<String, String>();
	
	private static SingletonSchedule instance;
	
	private SingletonSchedule() {
		
		
	}
	public static SingletonSchedule getInstance() {
		
		if (instance == null) 
			instance = new SingletonSchedule();
			
			
		return instance;
		
	}
	public void agregarClase(String hora, String clase) {
		// TODO Auto-generated method stub
		schedule.put(hora, clase);
	}
public void print() {
	for(Map.Entry me: schedule.entrySet()) {
		System.out.println("key: "+me.getKey()+ "& value:" + me.getValue());
	}
	

}
}

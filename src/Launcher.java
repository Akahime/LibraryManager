import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Launcher {

	public static void updateCards(){
		 Date actuelle = new Date();
		 DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		 String dat = dateFormat.format(actuelle);
		 System.out.println(dat);
		
	}
	
	public static void main(String[] args) throws ParseException{
		// TODO Auto-generated method stub		
		
		updateCards();
	}

}

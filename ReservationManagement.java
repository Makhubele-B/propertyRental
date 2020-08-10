import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;

public class ReservationManagement {

	private String fileName = "changeFile.txt";
	private FileReader fileInput;
	
	private RentalHouse ranch;
	private RentalHouse studio;
	private RentalHouse cottage;
	private ArrayList rentalPortfolio;
	
	public ReservationManagement(){
		
		try {
		fileInput = new FileReader(fileName);
			//complete
		}
		catch(IOException e){
			//complete
		}
		
	}

}
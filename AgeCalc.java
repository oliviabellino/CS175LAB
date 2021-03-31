import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;


public class AgeCalculation {

	public static void main(String[] args) {
		
	
		String birthdaydate = JOptionPane.showInputDialog("Enter your birthday (MM/DD/YYYY):");
		LocalDate bday = LocalDate.parse(birthdaydate, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
		
		
		String todaydate = JOptionPane.showInputDialog("Enter today's date (MM/DD/YYYY):");	
		LocalDate today = LocalDate.parse(todaydate, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
		
		
		Period is = Period.between(bday, today);	
		JOptionPane.showMessageDialog(null, "You are " + is.getYears() + " years and " + is.getMonths() + " month(s) old.");

	}

}
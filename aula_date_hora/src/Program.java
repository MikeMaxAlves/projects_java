import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date01 = LocalDate.now();
		LocalDateTime date02 = LocalDateTime.now();
		Instant date03 = Instant.now(); // data hora GMT HORARIO DE LONDRES.
		
		System.out.println(date01);
		System.out.println(date02);
		System.out.println(date03);
	}

}

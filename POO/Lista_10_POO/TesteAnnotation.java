import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class TesteAnnotation {
	public static void main(String[] args) {
		Usuario usuario = new Usuario("Ana", "414.116.576-83", LocalDate.of(1996, Month.DECEMBER, 9));
		
		System.out.println(validador(usuario));
	}

	public static <T> boolean validador(T objeto) {
		Class<?> classe = objeto.getClass();

		for (Field field : classe.getDeclaredFields()) {
			if (field.isAnnotationPresent(IdadeMinima.class)) {
				IdadeMinima idadeMinima = field.getAnnotation(IdadeMinima.class);
				
				field.setAccessible(true);
				
				try {
					LocalDate dataNascimento = (LocalDate) field.get(objeto);
					
					return Period.between(dataNascimento, LocalDate.now()).getYears() >= idadeMinima.valor();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}			

		return false;
	}
}


import java.util.ArrayList;
import java.util.List;

public class BancoDeDadosFake {
	
private static List<Contato> banco;
	
	private BancoDeDadosFake(){
		
	}
	
	public static List<Contato> getInstance(){
		if(banco==null){
			banco = new ArrayList<Contato>();
		}
		return banco;
	}

}

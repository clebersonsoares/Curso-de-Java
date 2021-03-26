package application;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TrabalhandoDatas {

	public static void main(String[] args) {
		Date data = new Date(1);
		System.out.println(data);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("----------------------");
		System.out.println(sdf.format(data));

	}

}

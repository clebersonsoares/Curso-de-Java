
public class ManipulacaoTextos {

	public static void main(String[] args) {
		String text = "abcde FGHIJ ABC abc DEFG ";
		System.out.println("-"+text.toLowerCase()+"-");
		System.out.println("-"+text.toUpperCase()+"-");
		System.out.println("-"+text.trim()+"-");
		System.out.println(text.substring(3));
		System.out.println(text.replace("a","%"));
		System.out.println(text.replace("ABC","XYZ"));
		System.out.println(text.indexOf("F"));
		System.out.println(text.lastIndexOf("c"));
		
		String a = "Banana Maça Maracujá Abacati";
		String[] array = a.split(" ");
		for(int i = 0; i < array.length;i++) {
			System.out.println(array[i]);
		}
		
	}

}

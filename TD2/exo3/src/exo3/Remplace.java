package exo3;

public class Remplace {
	
	public static String remplaceLettre(String str, String sousch1, String sousch2) {

		StringBuilder stringBuilder = new StringBuilder(str);
		int index = stringBuilder.indexOf(sousch1);

		while (index != -1) {
			stringBuilder.replace(index, index + sousch1.length(), sousch2);

			index = stringBuilder.indexOf(sousch1, index + sousch2.length());
		}

		return stringBuilder.toString();
	}

	public static void main(String[] args) {
		String str = "Hello world, world!";
		String result1 = remplaceLettre(str, "world", "java");
		System.out.println(result1);
		String result2 = remplaceLettre(str, "Hello", "Hi");
		System.out.println(result2);

	}

}

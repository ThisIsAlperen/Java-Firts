

public class StringsAndSuch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat1 = new Cat();
		cat1.name = "Lavas";
		cat1.age = 1;
		
		Cat cat2 = new Cat();
		cat2.name = "Hardal";
		cat2.age = 4;
		
	}
	
	private static void PrintName(String name) {
		if(name == "Alperen") {
			System.out.println("This guy is awesome");
		}
		else {
			System.out.println("I don`t know this guy");
		}
	}
	
	private static void reverse(String name) {
		String y = "";
		for(int i = name.length()-1; i>=0;i--) {			
			y = y + name.charAt(i);
		}
		System.out.println(y);
	}

}

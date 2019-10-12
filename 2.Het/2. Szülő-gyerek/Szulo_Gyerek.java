class Szulo {
	void szulometodus() {
		System.out.println("Szulo vagyok!");
	}
}

class Gyerek extends Szulo {
	void gyerekmetodus() {
		System.out.println("Gyerek vagyok!");
	}
}

class Szulo_Gyerek {
	public static void main(String[] args) {
	Szulo valaki = new Gyerek();
	
	valaki.szulometodus();
	//valaki.gyerekmetodus();
	}
}

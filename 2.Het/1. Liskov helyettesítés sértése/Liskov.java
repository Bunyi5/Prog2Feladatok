public class Liskov {
	
	static class Macska {}
	
	static class Program {
		void fgv (Macska macska) {}
	}
	
	static class SzőrösMacska extends Macska {
		public void szőrös() {}
	}
	
	static class Perzsa extends SzőrösMacska {}
	static class Szfinx extends Macska {}

	public static void main(String[] args) {
		Program program = new Program();
		Macska macska = new Macska();
		program.fgv(macska);
		
		Perzsa perzsa = new Perzsa();
		program.fgv(perzsa);
		
		Szfinx szfinx = new Szfinx();
		program.fgv(szfinx);
	}
}


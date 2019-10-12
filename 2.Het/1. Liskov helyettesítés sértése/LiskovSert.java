public class LiskovSert {
	
	static class Macska {
		public void sz�r�s() {}
	}
	
	static class Program {
		void fgv (Macska macska) {
			macska.sz�r�s();
		}
	}
	
	static class Perzsa extends Macska {}
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

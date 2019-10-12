public class JavaBBP {
	
	public JavaBBP(int d) {
		
		long delta = System.currentTimeMillis();
		
		double HexPi = 0.0;
		
		double S1 = Sj(d, 1);
		double S4 = Sj(d, 4);
		double S5 = Sj(d, 5);
		double S6 = Sj(d, 6);
		
		HexPi = 4.0*S1 - 2.0*S4 - S5 - S6;
		
		HexPi = HexPi - Math.floor(HexPi);
		
		int jegy = (int)Math.floor(16.0*HexPi);
		
		System.out.println(jegy);
		delta = System.currentTimeMillis() - delta;
		System.out.println(delta/1000.0);
		
	}

	public double Sj(int d, int j) {
		
		double Sj = 0.0;
		
		for (int k = 0; k <= d; k++)
			Sj += (double)n16modk(d-k, 8*k + j) / (double)(8*k + j);
		
		return Sj - Math.floor(Sj);
	}
	
	public long n16modk(int n, int k) {
		
		int t = 1;
		while(t <=n)
			t *= 2;
		
		long r = 1;
		
		while(true) {
			
			if(n >= t) {
				r = (16*r) % k;
				n = n - t;
			}
			
			t = t/2;
			
			if(t < 1)
				break;
			
			r = (r*r) % k;
		}
		
		return r;
	}
	
	
	public static void main(String[] args) {
		new JavaBBP(1000000);
	}
}

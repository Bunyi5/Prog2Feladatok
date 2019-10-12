public class BBP {
	String HexaJegyek;
	
	public BBP(int d) {
		
		double HexPi = 0.0;
		
		double S1 = Sj(d, 1);
		double S4 = Sj(d, 4);
		double S5 = Sj(d, 5);
		double S6 = Sj(d, 6);
		
		HexPi = 4.0*S1 - 2.0*S4 - S5 - S6;
		
		HexPi = HexPi - Math.floor(HexPi);
		
		StringBuffer sb = new StringBuffer();
	        
	    Character hexaJegyek[] = {'A', 'B', 'C', 'D', 'E', 'F'};
	        
	        while(HexPi != 0.0) {
	            
	            int jegy = (int)Math.floor(16.0d*HexPi);
	            
	            
	            if(jegy<10) {
	                sb.append(jegy);
	            }
	            else {
	                sb.append(hexaJegyek[jegy-10]);
	            }
	            
	            
	            HexPi = (16.0d*HexPi) - Math.floor(16.0d*HexPi);
	            
	        }
	        
	        HexaJegyek = sb.toString();
		
	}
	
	
	
	
	public String toString() {
		return HexaJegyek;
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
		System.out.println(new BBP(1000000));
	}
}

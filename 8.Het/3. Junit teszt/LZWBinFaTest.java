package Het8;

import org.junit.jupiter.api.Test;

class LZWBinFaTest {
	LZWBinFa binfa = new LZWBinFa();

	@Test
	void test() {
		for (char c : "011000010110001001100011".toCharArray())
			binfa.egyBitFeldolg(c);
		
		org.junit.Assert.assertEquals(4, binfa.getMelyseg(), 0.0);
		org.junit.Assert.assertEquals(3, binfa.getAtlag(), 0.001);
		org.junit.Assert.assertEquals(0.81649, binfa.getSzoras(), 0.0001);
	}

}

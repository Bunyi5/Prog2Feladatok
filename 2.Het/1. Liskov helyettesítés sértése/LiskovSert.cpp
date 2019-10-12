class Macska {
public:
	virtual void szoros() {};
};

class Program {
public:
	void fgv(Macska& macska) {
		macska.szoros();
	}
};

class Perzsa : public Macska {};
class Szfinx : public Macska {};

int main(int argc, char** argv) {
	Program program;
	Macska macska;
	program.fgv(macska);
	
	Perzsa perzsa;
	program.fgv(perzsa);
	
	Szfinx szfinx;
	program.fgv(szfinx);
}
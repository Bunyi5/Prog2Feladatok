#include <iostream>
#include <algorithm>

using namespace std;

class program{
private:
	int a;
	int* b;
	
public:
	program(int elem1, int& elem2) : a(elem1), b(new int){      //konstruktor 2 paraméterrel
		cout << "\tLefutott a default konstruktor!" << endl;
		*b = elem2;
	}

	program(const program &adott){      //másoló konstruktor
		cout << "\tLefutott a másoló konstruktor!" << endl;
		a = adott.a;
		b = new int;
		*b = *adott.b;
	}

	program& operator= (program &adott){        //másoló értékadás
		cout << "\tMásoló értékadás történt!" << endl;
		a = adott.a;
		*b = *adott.b;
		return *this;
	}

	program(program && adott){      //mozgató konstruktor
		cout << "\tLefutott a mozgató konstruktor!" << endl;
		a = 0;
		b = nullptr;
		*this = move(adott);
		
	}

	program& operator= (program && adott){      //mozgató értékadás
		cout << "\tMozgató értékadás történt!" << endl;
		swap(b,adott.b);
		swap(a,adott.a);
		
		return *this;
	}

	void Print(){
		if(b!=NULL)                                      
			cout << "Az a értéke: " << a << ", A b értéke " << *b << ", és b " << b << "-re mutat\n" << endl;
		else
			cout << "Az a értéke: " << a << ", A b értéke " << b << "\n" << endl;
	}

	~program(){     //destruktor
		cout << "\tLefutott a destruktor!" << endl;
		delete b;
	}
};

int main(){
	
    int Nyolc = 8;
    int Kilenc = 9;

    cout << "Alap létrehozása 10, Nyolc értékekkel:" << endl;
    program Alap(10, Nyolc);
    cout << "Alap ertekei:" << endl;
    Alap.Print();

    cout << "\n\n----------Másoló konstruktor----------" << endl;
    cout << "Alap_masolat létrehozása Alap alapjan:" << endl;
    program Alap_masolat(Alap);
    cout << "Alap ertekei:" << endl;
    Alap.Print();
    cout << "Alap_masolat értékei" << endl;
    Alap_masolat.Print();

    cout << "\n\nUj1 létrehozása 20, Kilenc értékekkel:" << endl;
    program Uj1(20, Kilenc);
    cout << "Uj1 ertekei:" << endl;
    Uj1.Print();

    cout << "\n\n----------Másoló értékadás----------" << endl;
    cout << "Alap_masolat = Uj1:" << endl;
    Alap_masolat = Uj1;
    cout << "Uj1 ertekei:" << endl;
    Uj1.Print();
    cout << "Alap_masolat ertekei:" << endl;
    Alap_masolat.Print();

    cout << "\n\n----------Mozgató konstruktor és értékadás----------" << endl;
    cout << "Uj2 létrehozása mozgató konstruktorral:" << endl;
    program Uj2(move(Alap));
    cout << "Alap ertekei:" << endl;
    Alap.Print();
    cout << "Uj2 ertekei:" << endl;
    Uj2.Print();

      cout << "\n\nProgram vége:" << endl;



    return 0;
}

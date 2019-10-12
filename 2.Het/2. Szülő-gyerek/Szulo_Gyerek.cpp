#include <iostream>

class Szulo {
public:
	void szulometodus() {
		std::cout << "Szulo vagyok!" << std::endl;
	}
};

class Gyerek : public Szulo {
public:
	void gyerekmetodus() {
		std::cout << "Gyerek vagyok!" << std::endl;
	}
};

int main() {
	Szulo* valaki = new Gyerek();

	valaki->szulometodus();
	valaki->gyerekmetodus();
}
#include <iostream>
#include <tgmath.h>
#include <cstdlib>

using namespace std;

class PolarGenerator {
private:
	bool nincsTarolt;
	double tarolt;

public:
	PolarGenerator() {
		nincsTarolt = true;
		tarolt = 0.0;
	}


	double kovetkezo() {
		if (nincsTarolt) {
			double u1, u2, v1, v2, w;

			do {
				u1 = rand() / (RAND_MAX + 1.0);
				u2 = rand() / (RAND_MAX + 1.0);

				v1 = 2 * u1 - 1;
				v2 = 2 * u2 - 1;

				w = v1 * v1 + v2 * v2;
			} while (w > 1);

			double r = sqrt((-2 * log(w)) / w);
			tarolt = r * v2;
			nincsTarolt = !nincsTarolt;

			return r * v1;
		}
		else {
			nincsTarolt = !nincsTarolt;
			return tarolt;
		}
	}
};


int main(int argc, char** argv) {
	PolarGenerator g;

	for (int i = 0; i < 10; ++i)
		cout << g.kovetkezo() << endl;

	return 0;
}
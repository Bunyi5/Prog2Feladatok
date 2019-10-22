#include <iostream>
#include <vector>
#include <boost/filesystem.hpp>

using namespace std;
using namespace boost::filesystem;

int main(int argc, char *argv[])
{
	path p("SrcZip");
	if(!exists(p) || !is_directory(p)) {
		cout << p << " is not a path" << endl;
		return 1;
	}
	
	int i=0;
	recursive_directory_iterator begin(p), end;
	vector<directory_entry> v(begin, end);
	for(auto& f:v) {
		if(path(f).has_extension()) {
			cout << "	-" <<path(f).filename()<< endl;
			i++;
		} else {
			cout << f <<  endl;
		}
	}
	cout << "Összes fájl:" << i << endl;
}

//g++ JdkClass.cpp -o JdkClass -std=c++11 -lboost_system -lboost_filesystem 

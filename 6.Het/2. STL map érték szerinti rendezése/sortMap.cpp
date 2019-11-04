#include <iostream> 
#include <map>
#include <set>
#include <functional>

using namespace std;

int main() { 

    map<string, int> Map;

    Map.insert(pair<string, int>("a", 55));
    Map.insert(pair<string, int>("b", 21));
    Map.insert(pair<string, int>("c", 98));
    Map.insert(pair<string, int>("d", 62));
    Map.insert(pair<string, int>("e", 120));
    Map.insert(pair<string, int>("f", 34));
    Map.insert(pair<string, int>("g", 42));
    Map.insert(pair<string, int>("h", 29));
    Map.insert(pair<string, int>("i", 27));
    Map.insert(pair<string, int>("j", 87));

    typedef function<bool(pair<string, int>, pair<string, int>)> Hasonlito;

    Hasonlito hasonlit =
            [](pair<string, int> elso ,std::pair<string, int> masodik)
            {
                return elso.second < masodik.second;
            };
            
    set<pair<string, int>, Hasonlito> sortedMap(Map.begin(), Map.end(), hasonlit);

    for (pair<string, int> elem : Map)
        cout << elem.first << " :: " << elem.second << endl;

    cout << "-----" << endl;

    for (pair<string, int> elem : sortedMap)
        cout << elem.first << " :: " << elem.second << endl;
}
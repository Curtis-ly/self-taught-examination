#if !defined(STUDENT_H)
#define STUDENT_H

#include <iostream>
#include <string>
#include <vector>
#include <iomanip>
#include <fstream>

using namespace std;

class Student {

private:
	string code;
	string name;
	double score;

public:
	void setCode(string c){code = c;}
	void setName(string n){name = n;}
	void setScore(double s){score = s;}
	string getCode(){return code;}
	string getName(){return name;}
	double getScore(){return score;}
	void set(vector<Student>&);
	void display(vector<Student>&);
	void read();
};

#endif
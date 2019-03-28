#include "student.h"

void Student::display(vector<Student> &s) {
	cout<<"学号"<<setw(12)<<"姓名"<<setw(12)<<"成绩"<<endl;
	for(int i = 0; i < s.size(); i++) {
		cout<<s[i].getCode()<<setw(12)<<s[i].getName()<<setw(12)<<s[i].getScore()<<endl;
	}
}

void Student::set(vector<Student> &s) {
	Student stu;
	string code;
	string name;
	double score;

	while(1) {
		cout<<"学号：";
		cin>>code;
		if(code == "0") {
			//学号是0表示结束，写入文件
			ofstream wst("stu.txt");
			if(!wst) {
				cout<<"建立文件出错";
				return;
			}
			for(int i = 0; i < s.size(); i++) {
				wst<<s[i].getCode()<<" "<<s[i].getName()<<" "<<s[i].getScore()<<" ";
			}
			wst.close();
			cout<<"一共写入"<<s.size()<<"个学生信息"<<endl;
			return;
		}
		stu.setCode(code);
		cout<<"姓名：";
		cin>>name;
		stu.setName(name);
		cout<<"成绩：";
		cin>>score;
		stu.setScore(score);
		
		s.push_back(stu);
	}
}

void Student::read() {
	string code;
	string name;
	double score;

	ifstream rst("stu.txt");
	if(!rst) {
		cout<<"读取文件出错";
		return;
	}

	cout<<"学号"<<setw(12)<<"姓名"<<setw(12)<<"成绩"<<endl;
	while(1) {
		rst>>code>>name>>score;
		if(rst.eof()) {
			rst.close();
			return;
		}
		cout<<code<<setw(12)<<name<<setw(12)<<score<<endl;	
	}
}


int main() {
	vector<Student> s;
	Student stu;
	stu.set(s);
	cout<<"显示向量数组信息如下"<<endl;
	stu.display(s);
	cout<<"存入文件内的信息如下"<<endl;
	stu.read();
	return 0;
}
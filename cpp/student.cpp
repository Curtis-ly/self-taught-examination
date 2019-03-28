#include "student.h"

void Student::display(vector<Student> &s) {
	cout<<"ѧ��"<<setw(12)<<"����"<<setw(12)<<"�ɼ�"<<endl;
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
		cout<<"ѧ�ţ�";
		cin>>code;
		if(code == "0") {
			//ѧ����0��ʾ������д���ļ�
			ofstream wst("stu.txt");
			if(!wst) {
				cout<<"�����ļ�����";
				return;
			}
			for(int i = 0; i < s.size(); i++) {
				wst<<s[i].getCode()<<" "<<s[i].getName()<<" "<<s[i].getScore()<<" ";
			}
			wst.close();
			cout<<"һ��д��"<<s.size()<<"��ѧ����Ϣ"<<endl;
			return;
		}
		stu.setCode(code);
		cout<<"������";
		cin>>name;
		stu.setName(name);
		cout<<"�ɼ���";
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
		cout<<"��ȡ�ļ�����";
		return;
	}

	cout<<"ѧ��"<<setw(12)<<"����"<<setw(12)<<"�ɼ�"<<endl;
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
	cout<<"��ʾ����������Ϣ����"<<endl;
	stu.display(s);
	cout<<"�����ļ��ڵ���Ϣ����"<<endl;
	stu.read();
	return 0;
}
#include<iostream>
#include<bits/stdc++.h>
#define MAX_SIZE 100
#include<stack>
using namespace std;

int current_size = -1;

int stack[MAX_SIZE] ;


bool isEmpty(){// kiem tra stack rong
	return(current_size == -1);
}
bool isFull(){//ktra stack da day hay chua
	return(current_size==MAX_SIZE);
}
void push(int data){//day them du lieu vao stack
	if(!isFull()){
//		current_size++;
		stack[current_size++] = data;
	}
	else{
		cout<<"Stack full";
	}
}
int top(){// peek(): lay phan tu top nhung ko xoa
	if(!isEmpty()){
		int data = stack[current_size];
	
		return data;
	}else{//rong
		cout<<"Stack is empty"<<endl;
		
	}
}
int pop(){//lay phan tu top va xoa khoi stack
	if(!isEmpty()){
		int data = stack[current_size];
		current_size--;
		return data;
	}else{
		cout<<"Stack is empty"<<endl;
	}
}
int main(){
	push(100);
	push(-255);
	push(-34);
	cout<<"top "<<top()<<endl;//lay phan tu vao sau cung =-34
	pop();// xoa bo phan tu ben phai cung
	cout<<"top "<<top()<<endl;//thi top se la -255
	while(!isEmpty()){
		data = pop();//xoa top
		cout<<data<<"<---";
	}
	cout<<endl;
	return 0;
}

#include<bits/stdc++.h>

using namespace std;

// Function to generate Special Triangle

int OK=true;

void Result(int A[], int n){

	for(int i=0; i<n; i++) {

		cout<<A[i]<<" ";

	}

	cout<<endl;

}

void Triangle(int A[] , int n) {

    // Base case

    if (n < 1)

        return;

    int temp[n - 1];

    for (int i = 0; i < n - 1; i++){

        int x = A[i] + A[i + 1];

        temp[i] = x;

    } 

    Triangle(temp , n-1);

    Result(A,n);

} 

void Triangle1(int A[] , int n){

	if(n<1) return;

	else {

		Result(A,n);

		int temp[n-1];

		for(int i=0; i<n-1; i++){

			int x = A[i]+A[i+1];

			temp[i]=x;

		}

		Triangle1(temp , n-1);			

	}

} 

int main(){

    int A[] = { 1, 2, 3, 4, 5, 6 };

    int n = sizeof(A) / sizeof(A[0]);         

    Triangle(A, n);

}

     


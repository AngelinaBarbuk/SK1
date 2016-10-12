#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <iostream>
#include <algorithm>
#include <math.h>

using namespace std;

long long M = pow(2, 32);
double a = 1664525., c = 1013904223.;
double razn(double x, long long mod)
{
	return x - mod*floor(x / mod);
}
int main()
{
	setlocale(LC_ALL, "Russian");
	cout <<" modul =" << M << endl;
	cout << "¬ведите длину последовательности\n";
	
	freopen("out.txt", "w", stdout);
	long long k;
	cin >> k;
	double xCur;
	xCur = 0;
	for (int i = 0; i < k; ++i)
	{
		xCur = razn(a*xCur + c, M);
		cout.precision(16);
		cout << xCur<<"  ";
	}
	return 0;
}
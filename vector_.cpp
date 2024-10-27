#include "vector.h"
Vector::Vector(int n) : n(n)
{
	if(n == 0)
		this->p = NULL;
	else 
	{
		this->p = new int[this->n];
		cin >> (*this);
	}
} 
Vector::Vector(const Vector& v) :n(v.n)
{
	this->p = NULL;
	this->p = new int[this->n];
	for (int i = 0; i <this->n; i++)
	{
		//*(this->p+i) = *(v.p + i);
		(*this)[i] = *(v.p + i);
	}
	cout << "copy" << endl; 
}
const Vector &Vector::operator=(const Vector &v) 
{
	// a = a;
	if (this != &v)
	{
		this->p = NULL;
		this->n = v.n;
		this->p = new int[this->n];
		for (int i = 0; i < this->n; i++)
		{
			(*this)[i] = *(v.p + i);
		}
		cout << "= " << endl;
		return *this;
	}
}
Vector::~Vector() 
{
	delete[] this->p; 
} 
istream& operator>>(istream& in, Vector& v)
{
	for (int i = 0; i < v.n; i++)
	{
		cout << "p[" << i << "] = ";
		//in >> *(v.p + i);
		in >> v[i];
		
	}
	return in;
}
ostream& operator<<(ostream& o, const Vector& v)
{
	for (int i = 0; i < v.n; i++)
	{
		o << *(v.p +i) << " ";
		// o << v[i] << " ";
	}
	return o;
}
int& Vector::operator[](const int& index)
{
	static int t = 0;
	if(index >=0 && index < this->n)
		return *(this->p + index);
	else 
		return t;
}




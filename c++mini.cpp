#include<stdio.h>
#include<conio.h>
#include<iostream>
#include<string.h>
#include<stdlib.h>
#define tr 7 //menu y

char ac[10][20];
char acb[10][20];

int mc=8;//menu count
int  m1x=30,m1y=tr+1;
int  m2x=45,m2y=tr+1;
int tw=7,value=80;

class convert
{
float inr,dollar,pound,euro;
float yen,kdinar,sriyal,yuan;
public:

	 setdollar(float dollar)
	 {
	  inr=dollar*80.0;
	  pound=dollar*0.80;
	  euro=dollar*0.92;
	  yuan=dollar*6.88;
	  yen=dollar*133.01;
	  kdinar=dollar*0.31;
	  sriyal=dollar*3.75;
	  this->dollar=dollar;
	 }

	 void setinr(float inr)
	 {
	  dollar=inr*0.0125;
	  setdollar(dollar);
	 }

	 void  seteuro(float euro)
	 {
	  dollar=euro*1.09;
	  setdollar(dollar);
	 }

	 void  setpound(float pound)
	 {
	 dollar=pound*1.25;
	 setdollar(dollar);
	 }

	 void setyen(float yen)
	 {
	  dollar=yen*0.0075;
	  setdollar(dollar);
	 }

	 void setyuan(float yuan)
	 {
	  dollar=yuan*0.15;
	  setdollar(dollar);
	 }

	  void setsriyal(float sriyal)
	 {
	  dollar=sriyal*0.27;
	  setdollar(dollar);
	 }

	 void setkdinar(float kdinar)
	 {
	  dollar=kdinar*3.26;
	  setdollar(dollar);
	 }

	 float getdollar()
	 {
	  return dollar;
	 }

	 float getpound()
	 {
	  return pound;
	 }

	 float geteuro()
	 {
	  return euro;
	 }

	 float getinr()
	 {
	  return inr;
	 }
	 float getyen()
	 {
	  return yen;
	 }
	 float getyuan()
	 {
	  return yuan;
	 }
	 float getsriyal()
	 {
	  return sriyal;
	 }

	 float getkdinar()
	 {
	  return kdinar;
	 }

   void setany(int mno,int cval)
   {
	switch(mno)
	{
	case 0:
		setinr(cval);
		break;
	case 1:
		setdollar(cval);
		break;
	case 2:
		setpound(cval);
		break;
	case 3:
		seteuro(cval);
		break;
	case 4:
		setyen(cval);
		break;
	case 5:
		setsriyal(cval);
		break;
	case 6:
		setyuan(cval);
		break;
	case 7:
		setkdinar(cval);
		break;
	}
   }

   void printans(float val)
   {
	int x,y;
	x=wherex();
	y=wherey();
	textbackground(CYAN);
	gotoxy(m2x-3,m2y-3);
	cprintf("%.2f   ",val);
	gotoxy(x,y);
   }

   float getany(int mno)
   {
	switch(mno)
	{
	case 0:
		 printans(getinr());break;
	case 1:
		  printans(getdollar());break;
	case 2:
		  printans(getpound());break;
	case 3:
		   printans(geteuro());break;
	case 4:
		   printans(getyen());break;
	case 5:
		   printans(getsriyal());break;
	case 6:
		  printans(getyuan());break;
	case 7:
		  printans(getkdinar());break;
	}

   }

};

int m1index=0,m2index=0;
convert conobj;

class menu
{
friend void main();
int x,y,i;
int cy,cx;
int oy,ox;
int mno;
public:

  menu(int x,int  y,int mcolor,int mbgcolor)
  {
  this->x=x;
  this->y=y;
  cx=ox=x;
  cy=oy=y;
  mno=0;

   textbackground(mbgcolor);
   textcolor(mcolor);

	gotoxy(x,y++);
	cprintf("INR     ");

	gotoxy(x,y++);
	cprintf("Dollor  ");

	gotoxy(x,y++);
	cprintf("Pound   ");

	gotoxy(x,y++);
	cprintf("Euro    ");

	gotoxy(x,y++);
	cprintf("Yen     ");

	gotoxy(x,y++);
	cprintf("S. Riyal");

	gotoxy(x,y++);
	cprintf("Yuan    ");

	gotoxy(x,y++);
	cprintf("K. dinar");

	textbackground(BLACK);
  }

void prt(int x,int y,int d)
{

int i,j;
i=wherex();
j=wherey();
gotoxy(x,y);
printf(" %d",d);
gotoxy(i,j);
}

void move(int i,int menutype)
{
	 if(i==80)
	 {
	 puttext(cx,cy,cx+tw,cy,ac[mno]);
	 gotoxy(cx,++cy);
	 mno++;

	 if(mno<=mc-1)
	 puttext(cx,cy,cx+tw,cy,acb[mno]);

	 }
	 if(i==72)
	 {
	 puttext(cx,cy,cx+tw,cy,ac[mno]);
	 gotoxy(cx,--cy);
	 mno--;

	 if(mno>=0)
	 puttext(cx,cy,cx+tw,cy,acb[mno]);

	 }
	 if(cy==m1y+mc)
	 {
	  cy=m1y;
	  puttext(cx,cy,cx+tw,cy,ac[mno]);
	  gotoxy(cx,cy);
	  mno=0;
	  puttext(cx,cy,cx+tw,cy,acb[mno]);
	 }
	 else if(cy==tr)
	 {
	  cy=m1y+mc-1;
	  puttext(cx,cy,cx+tw,cy,ac[mno]);
	  gotoxy(cx,cy);
	  mno=mc-1;
	  puttext(cx,cy,cx+tw,cy,acb[mno]);
	 }
	 if(menutype==1)
	 {
	  m1index=mno;
	 }

	 else if(menutype==2)
	 {
	  m2index=mno;
	 }
	  conobj.setany(m1index,value);
	  conobj.getany(m2index);
	  prt(1,20,m1index);
	  prt(1,21,m2index);
}

void mcopy(int m)
{
cx=ox;
cy=oy;

for(int i=0;i<mc;i++)
{
if(m==1)
gettext(cx,cy,cx+tw,cy,ac[i]);
if(m==2)
gettext(cx,cy,cx+tw,cy,acb[i]);
cy++;
}

for(i=0;i<mc;i++)
{
if(m==1)
puttext(cx,cy,cx+tw,cy,ac[i]);
if(m==2)
puttext(cx,cy,cx+tw,cy,acb[i]);
cy++;
}
}

};


void prtborder()
{
int x,y;
int i,j;
x=wherex();
y=wherex();

textbackground(GREEN);
textcolor(RED);
gotoxy(m1x+2,m1y-6);
cprintf("Currency Converter");

textbackground(GREEN);
textcolor(RED);
gotoxy(m1x+2,m1y-5);
cprintf("From  ====>>    To");

textbackground(BLUE);
textcolor(CYAN);
gotoxy(m1x-2,m1y-2);
cprintf("%c",218);//top left
for(i=0;i<25;i++)
cprintf("%c",196);//h line
cprintf("%c",191);//top right
for(j=0;j<10;j++)
{
gotoxy(m1x-2,m1y-1+j);
cprintf("%c",179);//v line
for(i=0;i<25;i++)
cprintf(" ");
cprintf("%c",179);//v line
}

gotoxy(m1x-2,m1y-1+j);
cprintf("%c",192);//bottom left
for(i=0;i<25;i++)
cprintf("%c",196);//h line
cprintf("%c",217);//bottom right

gotoxy(m1x+11,m1y-2);
cprintf("%c",194);//top t
for(i=1;i<11;i++)
{
gotoxy(m1x+11,m1y-2+i);
cprintf("%c",179);//bottom right
}
gotoxy(m1x+11,m1y-2+i);
cprintf("%c",193);//top t

gotoxy(x,y);
}

void getvalue()
{
int v;
int x,y;
char str[10];
x=wherex();
y=wherey();

textbackground(GREEN);
textcolor(RED);
gotoxy(m1x-2,m1y-3);
textbackground(CYAN);
textcolor(WHITE);
cprintf("        ");
gotoxy(m1x-2,m1y-3);
gets(str);
v=atoi(str);
value=v;

if(v==0)
getvalue();

gotoxy(x,y);
}

void main()
{
clrscr();

int i,cx,cy,j;
int fgcolor=RED;
int bgcolor=CYAN;
int mbgcolor=BLUE;

menu m11(m1x,m1y,fgcolor,mbgcolor);
menu m22(m2x,m2y,fgcolor,bgcolor);
m11.mcopy(1);
m22.mcopy(2);
clrscr();
prtborder();

menu m1(m1x,m1y,fgcolor,mbgcolor);
menu m2(m2x,m2y,fgcolor,mbgcolor);
gotoxy(m1x,m1y);
puttext(m1x,m1y,m1x+tw,m1y,acb[0]);

gotoxy(m1x,m1y);
getvalue();

while(1)
{
i=getch();

if(i=='C' ||i=='c')
getvalue();

if(i==0)
continue;
m1.move(i,1);

	if(i==27)
	break;

	if(i==9)
	{
	 gotoxy(m2x,m2.cy);
	 puttext(m2x,m2.cy,m2x+tw,m2.cy,acb[m2.mno]);

	  while(1)
	  {
		i=getch();

		if(i=='C'||i=='c')
		getvalue();

		if(i==0)
		continue;

		m2.move(i,2);
		if(i==27)
		break;
		if(i==9)
		{
		gotoxy(m1x,m1.cy);
		break;
		}
	  }
	}

}

getch();
}//main

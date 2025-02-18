
#include<stdio.h>
int main()
{
  /*int A,B;
  printf("Enter two numbers:");
  scanf("%d %d",&A,&B);
  printf("A+B:");
  printf("%d",A+B);
  printf("1");*/
int A,B;
scanf("%d %d",&A,&B);
printf("A+B:");
printf("%d",(A+B)*10+1);




   return 0;
}
#include<stdio.h>
int main()
{
    int a,b;
    scanf("%d %d",&a,&b);
    int d=a/b;
    int r=a%b;
    double f;
    f=(double)a/(double)b;
    printf("%d %d %.10f",d,r,f);
    return 0;


}
#include<stdio.h>
int main()
{
   int N,L,R;
   scanf("%d %d %d",&N,&L,&R);
   int ans=N>>R;
   ans=ans<<L;
   printf("\n%d",ans);
   return 0;
}
#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    if(n&1==1)
    {
        printf("odd");
    }
    else
    {
        printf("Even");
    }
    return 0;

}

#include<stdio.h>
int main()
{
    int a,b;
    scanf("%d %d",&a,&b);
    if(a>b)
    {
        printf("a greater than b");
    }
    if(a==b){printf("a is equal to b");}
    else
    {
        printf("a is less than b");
    }
    return 0;

}
#include<stdio.h>
int main()
{
    int a,b;
    scanf("%d %d",&a,&b);
    if(a==b){printf("a is equal to b");}
    else
    {
        if(a>b){printf("a is greater than b");}
        else
        {
            printf("a is less than b");
        }
    }
    return 0;
}
#include<stdio.h>
int main()
{
    int year;
    scanf("%d",&year);
    if(year%400==0||(year%4==0&&year%100!=0)){printf("leap year");}
    else {printf("not a leap year");}
    return 0;
}
#include<stdio.h>
int main()
{
   int a=5;
   if(a){printf("lemon");}
   else{printf("orange");}
    return 0;
}
#include<stdio.h>
int main()
{
  int a=150;
  if(a>100){printf("Greater then 100");}
  if(a<50){printf("less than 50");}
  else{printf("Between 50 and 100");}
    return 0;
}
#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d %d %d",&a,&b,&c);
  if(a<b&&b<c)
  {
      printf("True");
  }
  else
  {
      printf("False");
  }

    return 0;
}
#include<stdio.h>
int main()
{
    int x,y,dif;
    scanf("%d %d",&x,&y);
    dif=y-x;
    if(dif<0)
    {printf("we want to go to lower stairs.");
    if(dif>=-3){printf("use stairs");}
    else
    {
        printf("use elevator.");
    }}

    else
    {
        printf("want to go to upper stairs.");
        if(dif<=2){printf("use stairs.");}
        else
            {printf("use elevator.");}
    }
    return 0;
}
#include<stdio.h>
 int main()
 {
     int x,y;
     scanf("%d %d",&x,&y);
     if(x<y)
     {
         if(y-x <=2)
            printf("yes");
         else {printf("No");}

     }
     else{if(x-y<=3){printf("yes");}
     else {printf("NO");}}
     return 0;

 }
#include<stdio.h>
int main()
{
    int a,b,c;
    scanf("%d %d %d",&a,&b,&c);
    if(a>b)
    {
        if(a>c)
            printf("%d",a);
        else {printf("%d",c);}
    }
    else
    {
        if(b>c)
        {
            printf("%d",b);

        }
        else
        {
            printf("%d",c);
        }
    }
    return 0;
}
int main()
{
   int a,b,c;
   scanf("%d %d %d",&a,&b,&c);
   if(a<b)
   {
       if(c<a){printf("%d %d %d",c,a,b);}
       else if(a<c){printf("%d %d %d",a,c,b);}
       else if(c<b){printf("%d %d %d",a,b,c);}
       else {printf("nothing");}
   }
   else
   {//b<a
       if(c<b){printf("%d %d %d",c,b,a);}
       else if(b<c){printf("%d %d %d",b,c,a);}
       else if(c<a){printf("%d %d %d",b,a,c);}
       else
       {
           printf("nothing");
       }
   }
   return 0;}

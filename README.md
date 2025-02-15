
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


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
   #include<stdio.h>
int main()
{
    int w;
    scanf("%d",&w);

    if(w%2==0 && w!=2)
    {
        printf("Yes");
    }
    else
    {
        printf("no");
    }
    return 0;
}
#include<stdio.h>
int main()
{
   long long a,b,k;
   scanf("%ld %ld %ld",&a,&b,&k);
   if(k>=a+b){printf(" 0 0\n");}
   else if(k<=a){printf("%ld %ld\n",a-k,b);}
   else {printf("%ld %ld \n",k-a,b-(k-a));}

    return 0;
}
#include<stdio.h>
int main()
{
    int sum=0,n;
    scanf("%d",&n);
    for(int i=1;i<n;i++)
    {
        if(i%2==0)
        {sum+=i;

        }

    }
    printf("%d",sum);
    return 0;
}
#include<stdio.h>
int main()
{
    int i=0;
    while(1<2)
    {
        if(i>10)
        {
            break;
        }
        printf("%d\n",i);
        i++;
    }
    return 0;
}
#include<stdio.h>
int main()
{
    int i=0;
    printf("Loop started\n");
    while(0)
    {
        printf("%d\n",i);
        i++;
    }
    printf("loop finished\n");
    return 0;
}
#include<stdio.h>
int main()
{
 for(int i=1;i<=100;i++)
 {
     if(i%10>1)
     {
         continue;
     }
     printf("%d\n",i);
 }
 return 0;
}
#include<stdio.h>
int main()
{
    int tc=0,t,f,temp;
    while(1)
    {

        scanf("%d %d",&t,&f);
        if(t==0&&f==0)
        {
            break;
        }
        temp=t;
        t=f;
        f=temp;
        printf("case %d:%d %d",++tc,t,f);
    }

 return 0;
}
#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    long long sum=0;
    int max=-1000000;
    int min=1000000;

    for(int i=0;i<n;i++)
    {
        int x;
        scanf("%d",&x);
        sum=sum+x;
        if(x<min)
        {
            min=x;
        }
        if(x>max)
        {
            max=x;
        }
    }
printf("maximum:%d\n",max);
printf("minimum:%d\n",min);
printf("summation:%d",sum);
 return 0;
}
#include<stdio.h>
int main()
{
    int n,sum=0;
    scanf("%d",&n);
    while(n!=0)
    {
        int lastnum=n%10;
        n/=10;

        sum=sum+lastnum;

    }
    printf("%d",sum);
 return 0;
}
#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    int sum=0;
    while(n>0)
    {
        int lastdigit=n%10;
        n/=10;
        sum+=lastdigit;
    }
    printf("%d\n",sum);
 return 0;
}
#include<stdio.h>
int main()
{
   int t;
   scanf("%d",&t);
   while(t--){
   int x,p;
   scanf("%d %d",&x,&p);
   int a=p/100;
   if(p%100!=0)
   {
       a++;
   }
   if(x>=a)
   {
       printf("0\n");

   }
   else
   {
       int required=a-x;
       printf("%d\n",required);
   }}
 return 0;
}


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


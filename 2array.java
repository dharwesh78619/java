import java.util.*;
class 2array
{
public static void main(String args[])
{
int n,m;
int i;
int j;
int count=0;
int count1=0;
System.out.print("no of rows");
System.out.print("no of col");

Scanner s=new Scanner(System.in);
n=s.nextInt();
m=s.nextInt();

int a[][]=new int[n][m];

for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println("the elements are");


for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.println(a[i][j]);

}
}



}}











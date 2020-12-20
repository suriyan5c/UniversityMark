package UniversityMark;
import java.util.Scanner;
class UniversityMark
{
public static void main(String[] sibi)
{
Scanner scannerObj = new Scanner(System.in);
int total = 0;
int count = 1;
while(count<=5)
	{
	int mark = scannerObj.nextInt();
	total = total + mark;
	count++;
	}
System.out.println(total);
}
}

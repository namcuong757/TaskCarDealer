package CoreJava6;
import java.util.*;
public class CarDealer {
	int x1_today_sale = 0;
	int x1_month_sale = 0;
	int x3_today_sale = 0;
	int x3_month_sale = 0;
	int x5_today_sale = 0;
	int x5_month_sale = 0;
	final String model = "1.BMW X1 \n2.BMW X3 \n3.BMW X5";
	
	CarDealer()
	{
	}
	static void intro()
	{
		System.out.println("WELCOME TO CAR DEALER\n");
	}
	void sale()
	{
		int cont = 0;
		do
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("How many sale person are there?");
			int sales = scanner.nextInt();
			for(int i = 0; i < sales; i++)
			{
				int person = i + 1;
				System.out.println("-Sale Person" + person + "-");
				System.out.println("What model did you sale?");
				System.out.println(model);
				
				int choice = scanner.nextInt();
				switch(choice) 
				{
					case 1:
						System.out.println("How many sales are there?");
						int x1_sales = scanner.nextInt();
						x1_today_sale += x1_sales;
						break;
					case 2:
						System.out.println("How many sales are there?");
						int x3_sales = scanner.nextInt();
						x3_today_sale += x3_sales;
						break;
					case 3:
						System.out.println("How many sales are there?");
						int x5_sales = scanner.nextInt();
						x5_today_sale += x5_sales;
						break;
				}
			}
			x1_month_sale += x1_today_sale;
			x3_month_sale += x3_today_sale;
			x5_month_sale += x5_today_sale;
			System.out.println("Do you want to continue?\n1. Yes\n2. No");
			cont = scanner.nextInt();
		}while(cont != 2);
		
	}
	void report()
	{
		
		System.out.println("=====REPORT=====");
		System.out.println("-Model X1-");
		System.out.println("Total today sales: " + x1_today_sale);
		System.out.println("Total month sales: " + x1_month_sale);
		System.out.println("-Model X3-");
		System.out.println("Total today sales: " + x3_today_sale);
		System.out.println("Total month sales: " + x3_month_sale);
		System.out.println("-Model X5-");
		System.out.println("Total today sales: " + x5_today_sale);
		System.out.println("Total month sales: " + x5_month_sale);
	}
	public static void main(String[] args)
	{
		intro();
		CarDealer dealer = new CarDealer();
		dealer.sale();
		dealer.report();
	}
}

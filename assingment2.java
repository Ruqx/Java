import java.util.Scanner;

class Fraud_voting_system{
	int i= 0;
	int a=0;
	int b=0;
	int c=0;
	int d=0;
	
	void tocastvote() {
		Scanner scanner = new Scanner(System.in);
		i++;
		System.out.println("Enter A or B or C or D to give your vote:");
		String ans2 = scanner.nextLine();
		System.out.println("Your vote has been casted to:" +ans2);
		while (true){
			if(i%3==0 || i%7==0){
				c=c+1;
			} 
			else{
				switch (ans2) {
    				case "a":
        					a=a+1;
        					break;
    				case "b":
        					b=b+1;
        					break;
    				case "c":
        					c=c+1;
        					break;
    				case "d":
        					d=d+1;
        					break;
					default:
						System.out.println("Invalid Input");
				}
			}
		}
		System.out.println(a+b+c+d);
	}
	void toseeresult() {
		System.out.println("Enter A or B or C or D to see the result:");
		String ans3 =scanner.nextLine();
		System.out.println("The total number of votes of " +ans3+ " is:");
		switch (ans3){
			case "a":
				System.out.println(a);
				break;
			case "b":
				System.out.println(b);
				break;
			case "c":
				System.out.println(c);
				break;
			case "d":
				System.out.println(d);
				break;
			default:
				System.out.println("Invalid Input");
		}
	}
	void report(){
		System.out.println("the result of A is:"+a);
		System.out.println("the result of B is:"+b);
		System.out.println("the result of C is:"+c);
		System.out.println("the result of D is:"+d);
	}
	void exit(){
		System.out.println("You have exited teh program.");
	}

	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);	
		while (true){
			
			Fraud_voting_system obj= new Fraud_voting_system();
			System.out.println("To cast vote press 1");
			System.out.println("To see the result of any candidate press 2");
			System.out.println("To see the comprehensive report press 3");
			System.out.println("To exit press 4");
			int ans =scanner.nextInt();

			switch (ans){
			case 1:
				obj.tocastvote();
				System.out.println("to continue press y. to exit press n");
				ans= scanner.nextLine();
				break;
			case 2:
				obj.toseeresult();
				System.out.println("to continue press y. to exit press n");
				ans= scanner.nextLine();
				break;
			case 3:
				obj.report();
				System.out.println("to continue press y. to exit press n");
				ans= scanner.nextLine();
				break;
			case 4:
				obj.exit(0);
				break;
			}
		}
	}
}
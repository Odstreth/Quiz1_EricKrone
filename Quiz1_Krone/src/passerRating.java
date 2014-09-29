import java.util.Scanner;


public class passerRating {
	
	public double a(double completions, double passingAttempts){
		double value = ((completions/passingAttempts) -.3)*5;
		return value;
	}
	
	public double b(double passingYards, double passingAttempts){
		double value =((passingYards/passingAttempts) -3)*.25; 
		return value;
	}
	
	public double c(double touchdownPasses, double passingAttempts){
		double value = (touchdownPasses/passingAttempts)*20;
		return value;
	}
	
	public double d(double interceptions, double passingAttempts){
		double value = 2.375 - (interceptions/passingAttempts)*25;
		return value;
	}
	
	public double minMax(double value){
		if (value <= 0){
			return 0;
		}
		else if (value >= 2.375){
			return 2.375;
		}
		else{
			return value;
		}
	}
	public double nflPasserRating(double passingAttempts, double completions, double passingYards, double touchdownPasses, double interceptions){
		double value = 100*((minMax(a(completions, passingAttempts)) + minMax(b(passingYards, passingAttempts)) + minMax(c(touchdownPasses, passingAttempts)) + minMax(d(interceptions, passingAttempts)))/6);
		return value;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of attempted passes: \n");
		double passingAttempts = input.nextDouble();
		System.out.println("Please enter the number of completions: \n");
		double completions = input.nextDouble();
		System.out.println("Please enter the number of passing yards: \n");
		double passingYards = input.nextDouble();
		System.out.println("Please enter the number of touchdown passes: \n");
		double touchdownPasses = input.nextDouble();
		System.out.println("Please enter the number of interceptions: \n");
		double interceptions = input.nextDouble();
		passerRating rating = new passerRating();
		System.out.println(rating.nflPasserRating(passingAttempts, completions, passingYards, touchdownPasses, interceptions));
	}
}

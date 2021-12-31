package snakeladder;
public class Snakeandlaadder {
	public static final int NoPlayCase=0;
	public static final int LadderCase=1;
	public static final int SnakeCase=2;
	public static void main(String[] args) {
		double position =0;
		double dicerollsCount=0;
		while (position<100) {
		double dicerolls= (Math.floor(Math.random()*6+1));
		dicerollsCount++;
		System.out.println("Number got by dice rolling "+dicerolls);
		int option = (int)Math.floor(Math.random()*3);
		switch (option) {
		case NoPlayCase:
			position= position + 0;
			break;
		case LadderCase:
			if (position+dicerolls <=100)
			position=position+ dicerolls;
			break;
		case SnakeCase:
			position=position- dicerolls;
			if (position<0) {
				position=0;
			break;
		    }
		
		    }
		System.out.println("Player moved to position: "+position);
		System.out.println("Dice rolled till win position is  "+dicerollsCount );
}		
}
}

package enumuration;

public class Before_Enumurations {
    private static final int DOG = 0;
    private static final int CAT = 1;
    private static final int FROG = 2;

    public static void main(String[] args) {
	int animal = DOG;

	switch (animal) {
	case DOG: {
	    System.out.println("It's a DOG!");
	    break;
	}
	case CAT: {
	    System.out.println("It's a CAT!");
	    break;
	}
	case FROG: {
	    System.out.println("It's a FROG!");
	    break;
	}
	default:
	    System.out.println("It isn't an animal");
	}
    }

}

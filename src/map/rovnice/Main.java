package map.rovnice;

public class Main {

    public static void main(String[] args)
    {
	    Linearna Prva;
	    Prva = new Linearna(2,4);
	    Linearna druha = new Linearna(5,7);
	    Prva.vypisRovnicu();
	    System.out.println(Prva);
	    Prva.vypisKorene();
    }
}

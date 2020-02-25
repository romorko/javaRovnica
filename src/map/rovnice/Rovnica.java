package map.rovnice;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract public class Rovnica
{
    protected float koefA;
    protected float koefB;

    abstract protected void vypisRovnicu();
    abstract protected float[] getKorene();
    abstract protected void vypisKorene();
    abstract public String toString();
    protected float getFloat(boolean ajNula, String sprava)
    {
        float cislo;
        Scanner sc= new Scanner(System.in);
        while(true)
        {
            try
            {
                System.out.println(sprava);
                cislo = sc.nextFloat();
                if (!ajNula && cislo==0)
                {
                    throw new Nula(cislo);
                }
                break;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Nebolo zadane cislo, skus znovu!");
                sc.nextLine();
            }
            catch (Nula e)
            {
                e.sprava();
            }
        }
        return cislo;
    }
}

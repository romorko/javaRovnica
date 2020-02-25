package map.rovnice;
import java.util.Scanner;

class Linearna extends Rovnica
{

    public static Scanner sc = new Scanner(System.in);

    public Linearna(float a, float b)
    {
        koefA=a;
        koefB=b;
    }

    public Linearna(float a)
    {
        this(a,a);
        //koefA=koefB=a;
    }

    public Linearna()
    {
        System.out.print("Zadaj koeficient a:");
        koefA= getFloat(false,"Zadaj koeficient A:");
        System.out.print("Zadaj koeficient b:");
        koefB= getFloat(true,"Zadaj koeficient B:");
    }

    @Override
    public void vypisRovnicu()
    {
        System.out.printf("%fx%+f = 0\n",koefA,koefB);
    }

    @Override
    public float[] getKorene()
    {
        float[] k=new float[1];
        try
        {
            k[0]=-koefB/koefA;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Zaregistrovan0 delenie nulou!");
            k[0]=0;
            return k;
        }
        return k;
    }

    @Override
    protected void vypisKorene()
    {
        System.out.printf("Koren je %.2f\n",getKorene()[0]);
    }

    @Override
    public String toString()
    {
        return  koefA+"x"+((koefB>0)?" + ":" ")+koefB+" = 0";
    }
}
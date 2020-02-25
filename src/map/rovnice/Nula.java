package map.rovnice;

public class Nula extends Exception
{
    float hodnota;
    public Nula(float c)
    {
        hodnota=c;
    }
    void sprava()
    {
        System.out.println("Nesmie to byt nula!");
    }
}

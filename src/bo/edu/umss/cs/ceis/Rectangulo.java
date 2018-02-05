package bo.edu.umss.cs.ceis;

public class Rectangulo {
    int base;
    int altura;
    public Rectangulo (int b, int a){
        base = b;
        altura = a;
    }

    private int getBase(){
        return base;
    }

    private int getAltura(){
        return altura;
    }
    public int area(){
        int are = getBase()*getAltura();
        return are;
    }

    public int perimetro(){
        int peri = 2*getBase() + 2*getAltura();
        return peri;
    }
}



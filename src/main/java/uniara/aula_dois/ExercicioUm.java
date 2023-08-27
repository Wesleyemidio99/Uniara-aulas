package uniara.aula_dois;

public class ExercicioUm {
    int a;
    int b;

    public ExercicioUm(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int soma(){
        return a+b;
    }

    public int sub(){
        return a-b;
    }

    public int mult(){
        return a*b;
    }

    public double div(){
        return a/b;
    }
}


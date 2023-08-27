package uniara.aula_dois;

public class ExercicioTres {
    String a;
    String b;
    String c;

    public ExercicioTres(String a, String b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public void concatenacaoA(){
        System.out.println(a+b+c);
    }

    public void concatenacaoB(){
        System.out.println(a+c+b);
    }

    public void concatenacaoC(){
        System.out.println(b+a+c);
    }
    public void concatenacaoD(){
        System.out.println(b+c+a);
    }
    public void concatenacaoE(){
        System.out.println(c+a+b);
    }
    public void concatenacaoF(){
        System.out.println(c+b+a);
    }
}

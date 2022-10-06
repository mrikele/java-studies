package q4;
import q4.implement.Walking;

public class Main{
public static void main (String[] args){
    Walking wk = new Walking();
    Navigator nv = new Navigator(wk);
    nv.setRota(wk);
    nv.buildRote(new RotaA(), new RotaB());



    }
}
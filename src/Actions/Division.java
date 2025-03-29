package Actions;

public class Division extends Calculacion {
    public Division(int firstEntry, int secondEntry){
        calc(firstEntry, secondEntry);
    }

    public Division() {

    }

    public void calc(int s1, int s2){
        result = s1 / s2;
    }
}

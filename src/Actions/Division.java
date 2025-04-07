package Actions;

public class Division extends Calculacion {
    public Division(float firstEntry, float secondEntry){
        calc(firstEntry, secondEntry);
    }

    public Division() {

    }

    public void calc(float s1, float s2){
        result = s1 / s2;
    }
}

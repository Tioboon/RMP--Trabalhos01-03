import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Trabalho1ExA1();
        Trabalho1ExA2();
        Trabalho1ExA3();
        Trabalho1ExA4();
        Trabalho1ExA5();
        Trabalho1ExA6();
        Trabalho1ExA7();
        Trabalho1ExA8();
        Trabalho1ExA9();
        Trabalho1ExA10();
        Trabalho1ExB1();
        Trabalho1ExB2();
        Trabalho1ExB3();
        Trabalho1ExB4();
        Trabalho1ExB5();
        Trabalho1ExC1();
        Trabalho1ExC2();

        System.out.println("\n ------------------------------------------------------- \n");

        Trabalho2ExA1();
        Trabalho2ExA2();
        Trabalho2ExA3();
        Trabalho2ExA4();
        Trabalho2ExA5();
        Trabalho2ExA6();
        Trabalho2ExA7();
        Trabalho2ExA8();
        Trabalho2ExA9();

        System.out.println("\n ------------------------------------------------------- \n");

        Trabalho3Ex1();
        Trabalho3Ex2();
        Trabalho3Ex4();
        Trabalho3Ex5();
        Trabalho3Ex6();
        Trabalho3Ex7();
    }

    public static void Trabalho1ExA1(){
        float result = 12/6f;
        String msg = ConcatenateMessage(1, "A", 1);
        System.out.println(msg + result);
    }

    public static void Trabalho1ExA2(){
        float result = 15/9f;
        String msg = ConcatenateMessage(1, "A", 2);
        System.out.println(msg + result);
    }

    public static void Trabalho1ExA3(){
        float result = 1;
        String msg = ConcatenateMessage(1, "A", 3);
        System.out.println(msg + result);
    }

    public static void Trabalho1ExA4(){
        float result = 22/7;
        String msg = ConcatenateMessage(1, "A", 4);
        System.out.println(msg + result);
    }

    public static void Trabalho1ExA5(){
        float result = 4/6f;
        String msg = ConcatenateMessage(1, "A", 5);
        System.out.println(msg + result);
    }

    public static void Trabalho1ExA6(){
        float b = -7f;
        float c = 12f;
        float delta = GetDelta(1, b, c);
        float[] result = GetSecondGradeResult(delta, b, c);
        String msg = ConcatenateMessage(1, "A", 5);
        System.out.println(msg + Arrays.toString(result));
    }

    public static void Trabalho1ExA7(){
        float b = 3f;
        float c = -4f;
        float delta = GetDelta(1, b, c);
        float[] result = GetSecondGradeResult(delta, b, c);
        String msg = ConcatenateMessage(1, "A", 7);
        System.out.println(msg + Arrays.toString(result));
    }

    public static void Trabalho1ExA8(){
        float b = 4f;
        float c = -12f;
        float delta = GetDelta(1, b, c);
        float[] result = GetSecondGradeResult(delta, b, c);
        String msg = ConcatenateMessage(1, "A", 8);
        System.out.println(msg + Arrays.toString(result));
    }

    public static void Trabalho1ExA9(){
        float a = 3f;
        float b = 1f;
        float c = 0;
        float delta = GetDelta(a, b, c);
        float[] result = GetSecondGradeResult(delta, b, c);
        String msg = ConcatenateMessage(1, "A", 9);
        System.out.println(msg + Arrays.toString(result));
    }

    public static void Trabalho1ExA10(){
        float a = 2f;
        float b = -18;
        float c = 40;
        float delta = GetDelta(a, b, c);
        float[] result = GetSecondGradeResult(delta, b, c);
        String msg = ConcatenateMessage(1, "A", 10);
        System.out.println(msg + Arrays.toString(result));
    }

    public static void Trabalho1ExB1(){
        float x = 7/-2f;
        float y = 7 - x;
        System.out.println("Trabalho 1, Exercício B 1; Resultado X: " + x + " Y: " + y);
    }

    public static void Trabalho1ExB2(){
        System.out.println("Trabalho 1, Exercício B 2; Resultado X: " + 3);
    }

    public static void Trabalho1ExB3(){
        System.out.println("Trabalho 1, Exercício B 3; Resultado X: " + 1 + " Y: : " + 1);
    }

    public static void Trabalho1ExB4(){
        float yA = -4f;
        float yB = 18;
        float yC = -40;
        float yDelta = GetDelta(yA, yB, yC);
        float[] yResult = GetSecondGradeResult(yDelta, yB, yC);
        System.out.println("Trabalho 1, Exercício B 4; Resultado de X e Y: " + Arrays.toString(yResult));
    }

    public static void Trabalho1ExB5(){
        System.out.println("Trabalho 1, Exercicio B 5; Essa função não tem solução, cheguei em 10 = 15, com 3 calculos diferentes.");
    }

    public static void Trabalho1ExC1(){
        float result = 396/11f;
        String msg = ConcatenateMessage(1, "C", 10);
        System.out.println(msg + result);
    }

    public static void Trabalho1ExC2(){
        Bounds newBounds = new Bounds(36, 20);
        var boundMsg = newBounds.GetValueMsg();
        String msg = ConcatenateMessage(1, "C", 10);
        System.out.println(msg + boundMsg);
    }

    //Trabalho 2
    public static void Trabalho2ExA1(){
        float result = -3;
        String msg = ConcatenateMessage(2, "A", 1);
        System.out.println(msg + "Menor que " + result);
    }

    public static void Trabalho2ExA2(){
        float result = -3;
        String msg = ConcatenateMessage(2, "A", 2);
        System.out.println(msg + "Maior ou igual a " + result);
    }

    public static void Trabalho2ExA3(){
        float result = 0;
        String msg = ConcatenateMessage(2, "A", 3);
        System.out.println(msg + "Menor ou igual a " + result);
    }

    public static void Trabalho2ExA4(){
        float result = 22;
        String msg = ConcatenateMessage(2, "A", 4);
        System.out.println(msg + "Maior que " + result);
    }

    public static void Trabalho2ExA5(){
        float result = 36;
        String msg = ConcatenateMessage(2, "A", 5);
        System.out.println(msg + "Menor que " + result + " E maior que 0");
    }

    public static void Trabalho2ExA6(){
        float result = 10;
        String msg = ConcatenateMessage(2, "A", 6);
        System.out.println(msg + "Maior que " + result + " E menor que 30");
    }

    public static void Trabalho2ExA7(){
        float result = 16;
        String msg = ConcatenateMessage(2, "A", 7);
        System.out.println(msg + "Menor ou igual a " + result + " E maior ou igual a 0");
    }

    public static void Trabalho2ExA8(){
        float result = 7;
        String msg = ConcatenateMessage(2, "A", 8);
        System.out.println(msg + "Menor ou igual a " + result + " E maior ou igual a 0");
    }

    public static void Trabalho2ExA9(){
        float delta = GetDelta(1, 7, 12);
        float[] result = GetSecondGradeResult(delta, 1, 7);
        float lower = ListHelper.GetMost(result, "HIGH");
        float higher = ListHelper.GetMost(result, "LOW");
        String msg = ConcatenateMessage(2, "A", 9);
        System.out.println(msg + "entre " + lower + " e " + higher);
    }

    public static void Trabalho3Ex1(){
        System.out.println("- Trabalho 3 - \n Exercicio: 1");
        List<List<Integer>> conjuntos = new ArrayList<>();
        conjuntos.add(ListHelper.CreateIntArray(1, 4, false, false));
        conjuntos.add(ListHelper.CreateIntArray(2, 5, false, false));
        conjuntos.add(ListHelper.CreateIntArray(1, 3, true, true));

        List<Integer> result2 = new ArrayList<Integer>(){};
        result2.addAll(conjuntos.get(0));
        result2.addAll(conjuntos.get(1));
        List<Integer> distinctResult2 = result2.stream().distinct().toList();

        System.out.println("A: " + distinctResult2);

        var result1 = ListHelper.GetIntersection(conjuntos.get(0), conjuntos.get(1));

        System.out.println("B: " + result1);

        System.out.println("C: " + conjuntos.get(2));

        System.out.println("D: " + new ArrayList<Integer>());

        List<Integer> result3 = new ArrayList<Integer>();
        result3.addAll(result2);
        result3.removeAll(conjuntos.get(1));

        System.out.println("E: " + result3);

        List<Integer> result4 = new ArrayList<Integer>(){};
        result4.addAll(conjuntos.get(1));
        result4.addAll(conjuntos.get(2));
        List<Integer> distinctResult4 = result4.stream().distinct().toList();

        System.out.println("F: " + distinctResult4);

        var result5 = ListHelper.GetIntersection(conjuntos.get(1), conjuntos.get(2));

        System.out.println("G: " + result5);
    }

    public static void Trabalho3Ex2(){
        System.out.println("\nExercicio: 2");
        List<List<Integer>> conjuntos = new ArrayList<>();
        conjuntos.add(ListHelper.CreateIntArray(1, 19, false, false));
        conjuntos.add(ListHelper.CreateIntArray(6, 24, false, false));
        conjuntos.add(ListHelper.CreateIntArray(11, 29, false, false));
        conjuntos.add(ListHelper.CreateIntArray(16, 34, false, false));

        var collection = ListHelper.GetIntersection(conjuntos.get(0), conjuntos.get(1));
        collection = ListHelper.GetIntersection(collection, conjuntos.get(2));
        collection = ListHelper.GetIntersection(collection, conjuntos.get(3));

        System.out.println("Resposta: " + collection);
    }

    public static void Trabalho3Ex4(){
        System.out.println("Exercicio: 4, Resposta: " + 55);
    }

    public static void Trabalho3Ex5() {
        System.out.println("Exercicio: 5, Resposta: " + 96);
    }

    public static void Trabalho3Ex6(){
        System.out.println("\nExercicio: 6");

        var total = 300;
        var a = 15;
        var b = 40;
        var c = 30;
        var ab = 40;
        var bc = 20;
        var ac = 60;
        var abc = 10;
        var faltantes = total - (a + b + c + ab + bc + ac + abc);
        System.out.println("A: " + faltantes);

        var votantes = total - faltantes;
        var naoVotaramC = votantes - (c+ bc + ac + abc);
        System.out.println("B: " + naoVotaramC);

        var naoVotaramCeB = naoVotaramC;
        naoVotaramCeB -=  (b + ab);
        System.out.println("C: " + naoVotaramCeB);

        var naoVotaramB = votantes - (b + bc + ab + abc);
        var naoVotaramA = votantes - (a + ab + ac + abc);
        System.out.println("Não votaram em A: " + naoVotaramA + " em B: " + naoVotaramB + " em C: " + naoVotaramC);
        System.out.println("D: Logo a marca B deveria ser removida, pois teve mais gente que não votou nela");
    }

    public static void Trabalho3Ex7() {
        System.out.println("\nExercicio: 7");
        var total = 500;
        var gostamDeAlgo = total - 120;
        var ab = 90;
        var ac = 90;
        var a = 210 - ab - ac;
        var bc = 70;
        var b = 230 - ab - bc;
        var c = 160 - ac - bc;
        System.out.println("A: " + 0);
        System.out.println("B: " + (a + b + c));
        System.out.println("C: " + (gostamDeAlgo - a - b - c));
    }

    public static float GetDelta(float a, float b, float c){
        return (float)(Math.pow(b, 2) - 4*a*c);
    }

    public static float[] GetSecondGradeResult(float delta, float b, float a){
        float raiz = (float)Math.sqrt(delta);
        return new float[]{
                (-b + raiz) / 2*a,
                (-b - raiz) / 2*a
        };
    }

    public static String ConcatenateMessage(int trabalho, String ex, int num){
       return "Trabalho " + trabalho + ", Exercício " + ex + " " + num + "; Resultado: ";
    }
}
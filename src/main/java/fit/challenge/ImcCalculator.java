package fit.challenge;

public class ImcCalculator {
    public static String calculate (double peso, double altura){
        String resultado = "";
        double calculoImc = (peso) / (altura*altura);

        if (calculoImc < 18.5){
            resultado = "Magreza";
        } else if (calculoImc >= 18.5 && calculoImc < 24.9){
            resultado = "Normal";
        } else if (calculoImc >= 24.9 && calculoImc <= 30.0){
            resultado = "Sobrepeso";
        } else if (calculoImc > 30.0 && calculoImc <= 39.9){
            resultado = "Obesidade";
        } else {
            resultado = "Obesidade Grave";
        }

        return resultado;
    }
}
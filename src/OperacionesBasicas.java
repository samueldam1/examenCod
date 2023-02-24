public class OperacionesBasicas {
    private static Float resultado;
    static final int SUMA = 1;
    static final int RESTA = 2;
    static final int MULTIPLICACION = 3;
    static final int DIVISION = 4;
    static final int RAIZ = 5;

    public static Float realizar(int device, Float num1, Float num2){

        switch (device){
            case SUMA:
                try{
                    resultado = num1 + num2;
                }catch (Exception e){
                    System.out.println("Error");
                }
                break;
            case RESTA:
                try{
                    resultado = num1 - num2;
                }catch (Exception e){
                    System.out.println("Error");
                }
                break;
            case MULTIPLICACION:
                try{
                    resultado = num1*num2;
                }catch (Exception e){
                    System.out.println("Error");
                }
                break;
            case DIVISION:
                try{
                    resultado = num1/num2;
                }catch (Exception e){
                    System.out.println("Error");
                }
                break;
            case RAIZ:
                try{
                    resultado= (float)
                            Math.pow(num1, 1.0 / num2);
                }catch(Exception e){
                    System.out.println("Error");
                }
                break;
        }
        return resultado;
    }
}
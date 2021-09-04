public class DrawCircle {


    public static void main(String[] args) {

        desenhaPinheiro(20);

        }

    private static void desenhaPinheiro(int basePinheiro){

        int linhasPinheiro = basePinheiro;



        for(int x = 0; x <= linhasPinheiro; x++){

            for(int z = basePinheiro; z > x; z-- ){

                System.out.print(" ");


            }

            System.out.print("X");

            for(int z = 0; z < (2*x); z++ ){

                System.out.print(" ");


            }
            System.out.print("X");

            System.out.println();

            if(x == basePinheiro){
                escreveUltimalinha(basePinheiro);
            }

        }


    }

    private static void escreveUltimalinha(int basePinheiro) {
        for(int x = 0; x < basePinheiro; x++){
            System.out.print(" X");
        }

    }


}


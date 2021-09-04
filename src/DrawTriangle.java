public class DrawTriangle {


    public static void main(String[] args) {

        desenhaTriangulo(20);

        }

    private static void desenhaTriangulo(int baseTriangulo){

        int linhasTriangulo = baseTriangulo;



        for(int x = 0; x <= linhasTriangulo; x++){

            for(int z = baseTriangulo; z > x; z-- ){

                System.out.print(" ");


            }

            System.out.print("X");

            for(int z = 0; z < (2*x); z++ ){

                System.out.print(" ");


            }
            System.out.print("X");

            System.out.println();

            if(x == baseTriangulo){
                escreveUltimalinha(baseTriangulo);
            }

        }


    }

    private static void escreveUltimalinha(int baseTriangulo) {
        for(int x = 0; x < baseTriangulo; x++){
            System.out.print(" X");
        }

    }


}


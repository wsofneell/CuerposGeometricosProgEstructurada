import java.util.Scanner;

public class MenuF {
    public static void main (String[] args) {
        Scanner lector = new Scanner (System.in);
        int cantidadLados;
        int i = 0;
        double areaL, areaT, volumen, area;
        double longitudLados, altura, anchura, diagonal;
        double PbaseMenor, PBaseMayor, AbaseMenor, ABaseMayor, base;
        double apotema, APiramide, generatriz, arista, numeroGrados;
        double radioMenor, RadioMayor, longMayor, longMenor, LongMayor_Mitad;

        for (i = 0; i < 3; i++) {
            System.out.println("Menu de opciones: ");
            System.out.println("1. Prisma");
            System.out.println("2. Cilindro");
            System.out.println("3. Piramide");
            System.out.println("4. Cono");
            System.out.println("5. Esfera");
            System.out.println("6. Zona esferica");
            System.out.println("7. Casquete esferico");
            System.out.println("8. Huso esferico y cuña esferica");
            System.out.println("9. Ortoedro");
            System.out.println("10. Tetaedro");
            System.out.println("11. Hexaedro");
            System.out.println("12. Octaedro");
            System.out.println("13. Dodecaedro");
            System.out.println("14. Icosaedro");
            System.out.println("15. Tronco de cono");
            System.out.println("16. Tronco de piramide");
            System.out.println("17. Salir");
            int opc = lector.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("1. Prisma");
                    System.out.println("Ingrese la cantida de lados: ");
                    cantidadLados = lector.nextInt();
                    System.out.println("Ingrese la longitud de lados: ");
                    longitudLados = lector.nextDouble();
                    System.out.println("Ingrese la altura: ");
                    altura = lector.nextDouble();
    
                    PbaseMenor = cantidadLados * longitudLados;
                    areaL = PbaseMenor * altura;
                    Double alfa = (Math.PI/180) * (380/cantidadLados);
                    apotema =  longitudLados / (2 * Math.tan((alfa)/2));
                    AbaseMenor = (PbaseMenor * apotema)/2;
                    areaT = areaL + 2 * AbaseMenor;  
                    volumen = AbaseMenor * altura; 
                
                    System.out.println("Area lateral: " + areaL );
                    System.out.println("Area total: " + areaT );
                    System.out.println("Volumen: " + volumen );
                    break;
                case 2:
                    System.out.println("2. Cilindro");
                    System.out.println("Ingrese el radio: ");
                    radioMenor = lector.nextDouble();
                    System.out.println("Ingrese la altura: ");
                    altura = lector.nextDouble();

                    PbaseMenor = (2* Math.PI) * radioMenor;
                    areaL = PbaseMenor * altura;
                    AbaseMenor = Math.PI * Math.pow(radioMenor, 2);
                    areaT = areaL + (2 * AbaseMenor);
                    volumen = AbaseMenor * altura;

                    System.out.println("Area lateral: " + areaL );
                    System.out.println("Area total: " + areaT );
                    System.out.println("Volumen: " + volumen );
                    break;
                case 3:
                    System.out.println("3. Piramide");
                    System.out.println("Ingrese la altura: ");
                    altura = lector.nextDouble();
                    System.out.println("Ingrese la longitud de lados: ");
                    longitudLados = lector.nextDouble();
                    System.out.println("Ingrese la anchura de los lados: ");
                    anchura = lector.nextDouble();

                    PbaseMenor = 2 * longitudLados + 2 * anchura;
                    apotema = longitudLados/2;
                    APiramide = Math.sqrt(Math.pow(altura, 2) + Math.pow(apotema, 2));
                    areaL = (PbaseMenor * APiramide)/2;
                    areaT = areaL + PbaseMenor;
                    AbaseMenor = longitudLados/2;
                    volumen = (AbaseMenor * altura)/3;

                    System.out.println("Area lateral: " + areaL );
                    System.out.println("Area total: " + areaT );
                    System.out.println("Volumen: " + volumen );              
                    break;
                case 4:
                    System.out.println("4. Cono");
                    System.out.println("Ingrese la altura: ");
                    altura = lector.nextDouble();
                    System.out.println("Ingrese el radio: ");
                    radioMenor = lector.nextDouble();

                    generatriz = Math.sqrt(Math.pow(altura, 2) + Math.pow(radioMenor, 2));
                    areaL = Math.PI * radioMenor * generatriz;
                    AbaseMenor = Math.PI * Math.pow(radioMenor, 2);
                    areaT = areaL + AbaseMenor;
                    volumen = (AbaseMenor + areaL) /3;

                    System.out.println("Area lateral: " + areaL );
                    System.out.println("Area total: " + areaT );
                    System.out.println("Volumen: " + volumen );                   
                    break;
                case 5:
                    System.out.println("5. Esfera");
                    System.out.println("Ingrese el radio: ");
                    radioMenor= lector.nextDouble();

                    area = 4 * Math.PI * Math.pow(radioMenor, 2);
                    volumen = (4/3) * Math.PI * Math.pow(area, 3);

                    System.out.println("Area: " + area);
                    System.out.println("Volumen: " + volumen);
                    break;
                case 6:
                    System.out.println("6. Zona esferica");
                    System.out.println("Ingrese el radio menor: ");
                    radioMenor = lector.nextDouble();
                    System.out.println("Ingrese la altura ");
                    altura = lector.nextDouble();
                    System.out.println("Ingrese el radio mayor: ");
                    RadioMayor = lector.nextDouble();

                    area = 2 * Math.PI *  RadioMayor * altura;
                    volumen = (Math.PI * altura * (Math.pow(altura, 2) + 3*Math.pow(radioMenor, 2) + 3*Math.pow(RadioMayor, 2)))/6;

                    System.out.println("Area: " + area);
                    System.out.println("Volumen: " + volumen);                 
                    break;
                case 7:
                    System.out.println("7. Casquete esferico");
                    System.out.println("Ingrese la altura ");
                    altura = lector.nextDouble();
                    System.out.println("Ingrese el radio mayor: ");
                    RadioMayor = lector.nextDouble();

                    area = 2 * Math.PI *  RadioMayor * altura;
                    volumen = (Math.PI * Math.pow(altura, 2) * (3 * RadioMayor - altura))/6;

                    System.out.println("Area: " + area);
                    System.out.println("Volumen: " + volumen);                
                    break;
                case 8:
                    System.out.println("8. Huso esferico y cuña esferica");
                    System.out.println("Ingrese el radio: ");
                    radioMenor = lector.nextDouble();
                    System.out.println("Ingrese el numero de grados: ");
                    numeroGrados = lector.nextDouble();

                    area = (4 * Math.PI * Math.pow(radioMenor, 2) * numeroGrados)/360;
                    volumen = ((4/3) * 4 * Math.pow(Math.PI, 3) * numeroGrados)/360;

                    System.out.println("Huso esferico:");
                    System.out.println("Area: " + area);
                    System.out.println(".....................");
                    System.out.println("Cuña esferica:");
                    System.out.println("Volumen: " + volumen);
                    break;
                case 9:
                    System.out.println("9. Ortoedro");
                    System.out.println("Ingrese la altura");
                    altura =  lector.nextDouble();
                    System.out.println("Ingrese la base: ");
                    base = lector.nextDouble();
                    System.out.println("Ingrese la arista: ");
                    arista = lector.nextDouble();

                    area = 2 * (arista * base + arista * altura + base * altura);
                    diagonal = Math.sqrt(Math.pow(arista, 2) + Math.pow(base, 2) + Math.pow(altura, 2));
                    volumen = arista * base * altura;

                    System.out.println("Area: " + area);
                    System.out.println("Diagonal: " + diagonal);
                    System.out.println("Volumen: " + volumen);
                    break;
                case 10:
                    System.out.println("10. Tetaedro");
                    System.out.println("Ingrese la arista: ");
                    arista = lector.nextDouble();

                    area = Math.pow(arista, 3) * Math.sqrt(3) ;
                    volumen = (Math.sqrt(2)/12) * arista;
                    altura = arista * (Math.sqrt(6)/3);

                    System.out.println("Area: " + area);
                    System.out.println("Volumen: " + volumen);
                    System.out.println("Altura: " + altura);     
                    break;
                case 11:
                    System.out.println("11. Hexaedro");
                    System.out.println("Ingrese la arista: ");
                    arista = lector.nextDouble();
            
                    area = 6 * Math.pow(arista, 2);
                    diagonal = arista * Math.sqrt(3);
                    volumen = Math.pow(arista, 3);
            
                    System.out.println("Area: " + area);
                    System.out.println("Diagonal: " + diagonal);
                    System.out.println("Volumen: " + volumen);     
                    break;
                case 12:
                    System.out.println("12. Octaedro");
                    System.out.println("Ingrese la arista: ");
                    arista = lector.nextDouble();
            
                    area = 2 * Math.pow(arista, 2) * Math.sqrt(3);
                    volumen = (Math.sqrt(2)/3) * Math.pow(arista, 3);
            
                    System.out.println("Area: " + area);
                    System.out.println("Volumen: " + volumen);  
                    break;
                case 13:
                    System.out.println("13. Dodecaedro");
                    System.out.println("Ingrese la arista: ");
                    arista = lector.nextDouble();

                    area = 3 * Math.pow(arista, 2) * Math.sqrt(25 + 10 + Math.sqrt(5));
                    volumen = (1/4) * (15 + 7 * Math.sqrt(5)) * Math.pow(arista, 3);
            
                    System.out.println("Area: " + area);
                    System.out.println("Volumen: " + volumen);
                    break;
                case 14:
                    System.out.println("14. Icosaedro");
                    System.out.println("Ingrese la arista: ");
                    arista = lector.nextDouble();

                    area = 5 * Math.pow(arista, 2) * Math.sqrt(3);
                    volumen = (5/12) * (3 + Math.sqrt(5)) * Math.pow(arista, 3);

                    System.out.println("Area: " + area);
                    System.out.println("Volumen: " + volumen);
                    break;
                case 15:
                    System.out.println("15. Tronco de cono");
                    System.out.println("Ingrese la altura: ");
                    altura = lector.nextDouble();

                    System.out.println("Ingrese el radio menor: ");
                    radioMenor = lector.nextDouble();

                    System.out.println(" Ingrese el Radio mayor: ");
                    RadioMayor = lector.nextDouble();

                    generatriz = Math.sqrt(Math.pow(altura, 2) + (Math.pow(RadioMayor - radioMenor, 2)));
                    ABaseMayor = Math.PI * Math.pow(RadioMayor, 2);
                    AbaseMenor = Math.PI * Math.pow(radioMenor, 2);
                    areaL = Math.PI * generatriz * (RadioMayor + radioMenor);
                    areaT = areaL + ABaseMayor + AbaseMenor;
                    volumen = (1/3) * Math.PI * altura * (Math.pow(RadioMayor, 2) + Math.pow(radioMenor, 2) + (RadioMayor * radioMenor));

                    System.out.println("Area lateral: " + areaL );
                    System.out.println("Area total: " + areaT );
                    System.out.println("Volumen: " + volumen );               
                    break;
                case 16:
                    System.out.println("16. Tronco de piramide");
                    System.out.println("Ingrese la longitd del lado mayor: ");
                    longMayor = lector.nextDouble();
                    System.out.println("Ingrese la longitud del lado menor: ");
                    longMenor = lector.nextDouble();
                    System.out.println("Ingrese la altura: ");
                    altura = lector.nextDouble();

                    LongMayor_Mitad = longMayor / 2;
                    APiramide = Math.sqrt(Math.pow(altura, 2) + Math.pow(LongMayor_Mitad, 2));
                    ABaseMayor = Math.pow(longMayor, 2);
                    AbaseMenor = Math.pow(longMenor, 2);
                    PBaseMayor = longMayor * 4;
                    PbaseMenor = longMenor * 4;
                    areaL = ((PBaseMayor + PbaseMenor)/2) * APiramide;
                    areaT = areaL + ABaseMayor + AbaseMenor;
                    volumen = ((1/3) * altura * (ABaseMayor + AbaseMenor + Math.sqrt(ABaseMayor * AbaseMenor)));

                    System.out.println("Area lateral: " + areaL );
                    System.out.println("Area total: " + areaT );
                    System.out.println("Volumen: " + volumen );               
                    break;
                case 17:
                    System.out.println("Saliendo de la App");
                    System.exit(0);
                    break;
            } // Switch
        }//for
    } // void main    
} // Class

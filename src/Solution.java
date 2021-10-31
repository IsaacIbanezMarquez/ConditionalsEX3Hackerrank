
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;


// ENUNCIADO:

/* Pel nou curs escolar l'institut on estàs vol saber si podrà comptar amb suficient espai per fer les classes presencials. Així en una aula determinada hi caben N alumnes, i en cada planta hi caben A aules. L'institut té un nombre P de plantes i un nombre M de matriculats.

En aquest cas, a diferència del problema anterior ara volem saber QUANTES PLANTES són necessàries en cas que en facin falta més, o quantes plantes sobren a l'institut per destinar-les a usos socials. (sempre depèn del nombre de matriculats totals)

Input Format

N alumnes per aula A aules per planta P plantes totals que té l'institut M matriculats totals a l'institut

Constraints

Totes les dades d'entrada han de ser superiors a 0.

Output Format

Si els alumnes hi caben s'imprimirà un missatge: "A l'institut sobren X plantes"

En cas contrari s'imprimirà: "Calen X plantes per acollir tots els alumnes matriculats"

Si hi ha alguna dada d'entrada que no sigui superior a 0: "Error dades introduïdes no vàlides"

Sample Input 0

30
5
8
1500
Sample Output 0

Calen 2 plantes per acollir tots els alumnes matriculats
Sample Input 1

30
5
8
1501
Sample Output 1

Calen 3 plantes per acollir tots els alumnes matriculats
Sample Input 2

20
5
9
1355
Sample Output 2

Calen 5 plantes per acollir tots els alumnes matriculats
Sample Input 3

20
5
9
1200
Sample Output 3

Calen 3 plantes per acollir tots els alumnes matriculats
Sample Input 4

-1
-1
-1
-1
Sample Output 4

Error dades introduides no valides

 */


public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int alumnes = sc.nextInt();
        int aulas = sc.nextInt();
        int plantas = sc.nextInt();
        int matriculas = sc.nextInt();

        int capacidadPlanta = alumnes * aulas;
        int capacidad = alumnes * aulas * plantas;

        int resultF = matriculas/capacidadPlanta;
        int resultF2 = matriculas % capacidadPlanta;
        if (resultF2 != 0) {resultF2 = 1;}
        int resultF3 = (resultF + resultF2) - plantas;

        int resultS = matriculas/capacidadPlanta;
        int resultS2 = matriculas % capacidadPlanta;
        if (resultS2 != 0) {resultF2 = 1;}
        int resultS3 = plantas - (resultS + resultF2);



        if (alumnes <=0 || aulas <=0 || plantas <=0 || matriculas <= 0)
        {
            System.out.println("Error dades introduides no valides");
        }

        else if (capacidad >= matriculas)
        {
            System.out.println("A l'institut sobren "+ resultS3 +" plantes");
        }
        else if (capacidad < matriculas)
        {
            System.out.println("Calen "+resultF3+" plantes per acollir tots els alumnes matriculats");
        }
    }

}

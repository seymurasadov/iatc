package adem;

import javax.xml.crypto.AlgorithmMethod;
import java.util.Scanner;

public class Main {

    public static  void main(String[] args){

        Scanner scan = new Scanner(System.in);


        Login login = new Login();

        login.username = "Adem";
        login.paswword = "Adem1997";
        login.gmail = "adem@gmail.com";


        Login login1 = new Login();
        login1.username = "Orxan";
        login1.paswword = "orxan1997";
        login1.gmail = "orxan@gmail.com";

        Login login2 = new Login();
        login2.username = "Adem";
        login2.paswword = "adem1997";
        login2.gmail = "adem@gmail";

        Login login3 = new Login();
        login3.username = "Seymur";
        login3.paswword = "Seymur1990";
        login3.gmail = "seymur@gmail.com";

        Login login4 = new Login();
        login4.username = "Behruz";
        login4.paswword = "Behruz1998";
        login4.gmail = "behruz@gmail.com";


        System.out.println("Xahi˛ edirik Ad˝n˝nz˝ daxil edin");
        String  username = scan.nextLine();

        System.out.println("Xahi˛ edirik parolunuzu daxil edin");
        String password = scan.nextLine();

        System.out.println("Xahi˛ edirik gmail nizi daxil edin");
        String gmail = scan.nextLine();



        if (login.gmail.equals(gmail)){
            System.out.println(login.username+"  bu adda istifadeci var");
        }
        else if(login1.gmail.equals(gmail)){

            System.out.println(login1.username+"  bu adda istifadeci var");
        }
        else if(login2.gmail.equals(gmail)){

            System.out.println(login2.username+"  bu adda istifadeci var");
        }
        else if(login3.gmail.equals(gmail)){

            System.out.println(login3.username+"  bu adda istifadeci var");
        }
        else if(login4.gmail.equals(gmail)){

            System.out.println(login4.username+"  bu adda istifadeci var");
        }else{
            System.out.println("bele istifadeci yoxdu");

        }

    }





}

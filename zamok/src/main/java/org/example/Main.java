package org.example;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    ArrayList<String> citizen = new ArrayList<>();
    public static void main(String[] args) {
        Main m = new Main();
        Scanner cs = new Scanner(System.in);
        while(true) {
            System.out.println("Выберите действие:");
            System.out.println("1) суд");
            System.out.println("2) работа с казной");
            System.out.println("3) бой с врагом");
            System.out.println("4) новый гражданин");
            System.out.println("5) таверна");
            int ch = cs.nextInt();
            if (ch == 1) {
                System.out.println("Введите имя человека, над которым будет проходить суд: ");
                String n = cs.nextLine();
                String name = cs.nextLine();
                System.out.println("выберите действие: ");
                System.out.println("1) казнить");
                System.out.println("2) помиловать");
                System.out.print("Введите действие, которое будет совершаться над человеком: ");
                int vibor = cs.nextInt();
                sudba(name,vibor);

            }
            if (ch == 2) {
                System.out.println("выберите действие: ");
                System.out.println("1) показать казну");
                System.out.println("2) пополнить казну");
                System.out.println("3) опустошить казну");
                int mo = cs.nextInt();
                kazna(mo);
            }
            if (ch == 3) {
                System.out.println("Введите число боеприпасов, которое будет выпущено в противника: ");
                System.out.println("введите число арбалетных болтов: ");
                int bolt = cs.nextInt();
                System.out.println("введите число пушечных шаров: ");
                int ball = cs.nextInt();
                System.out.println(m.at(bolt,ball));
            }
            if(ch == 4){
                System.out.println("Введите именя гражданина: ");
                String cit = cs.nextLine();
                m.Citizen(cit);
            }
            if(ch==5){
                System.out.println("Выберите алкоголь, который вы будете пить: ");
                String c = cs.nextLine();
                String cit = cs.nextLine();
                m.taverna(cit);
            }
            else{
                break;
            }
        }
    }

    public static void sudba(String Name, int vibor){

        if (vibor == 1){
            kazn(Name);
        }
        else if (vibor == 2){
            pomil(Name);
        }
        else{
            System.out.println("Такого варианта нет!");
            main(null);
        }
    }
    public static void kazn(String Name){
        System.out.println("Будет казнён человек с именем: "+Name);
        main(null);
    }
    public static void pomil(String Name){
        System.out.println("Будет помилован человек с именем: "+Name);
        main(null);
    }
    public static void kazna(int deystv){
        Scanner cs = new Scanner(System.in);
        double kazna = 10000;
        if (deystv == 1){
            System.out.println("Текущая казна: "+kazna);
            main(null);
        }
        else if (deystv == 2) {
            System.out.println("Выберите сумму, которая будет добавлена к казне: ");
            double dobb = cs.nextDouble();
            dob(kazna,dobb);
        }
        else if (deystv == 3) {
            System.out.println("Выберите сумму, которая будет вычтена из казны: ");
            int ud = cs.nextInt();
            ub(kazna,ud);
        }
        else {
            System.out.println("такого действия нет");
            main(null);
        }
    }
    public static void dob (double kazna, double dobb){
        double itog = kazna + dobb;
        System.out.println("Текущая казна: "+ itog);
        main(null);
    }
    public static void ub (double kazna, double ud){
        double itog = kazna - ud;
        System.out.println("Текущая казна: "+ itog);
        main(null);
    }
    public int at(int bolt, int balls){
        return bolt+balls;
    }
    public void Citizen(String name){
        citizen.add(name);
        main(null);
    }
    public void taverna(String alk){
        System.out.println("Держи своё "+alk);
        main(null);
    }
}




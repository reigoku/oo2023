public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        IsikukoodEE ee1 = new IsikukoodEE("aaa", "50001029996");
        System.out.println(ee1.getSugu());
        System.out.println(ee1.getKuupäev());
        System.out.println(ee1.getVanus());
        IsikukoodEE ee2 = new IsikukoodEE("bbb", "30303039914");
        System.out.println(ee2.getSugu());
        System.out.println(ee2.getKuupäev());
        System.out.println(ee2.getVanus());
        IsikukoodEE ee3 = new IsikukoodEE("ccc", "30303039816");
        System.out.println(ee3.getSugu());
        System.out.println(ee3.getKuupäev());
        System.out.println(ee3.getVanus());
        IsikukoodEE ee4 = new IsikukoodEE("ddd", "50701019992");
        System.out.println(ee4.getSugu());
        System.out.println(ee4.getKuupäev());
        System.out.println(ee4.getVanus());
        IsikukoodEE ee5 = new IsikukoodEE("eee", "40404049996");
        System.out.println(ee5.getSugu());
        System.out.println(ee5.getKuupäev());
        System.out.println(ee5.getVanus());
    }
}
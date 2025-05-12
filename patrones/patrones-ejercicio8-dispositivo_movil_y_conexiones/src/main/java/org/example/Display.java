package org.example;

public class Display {

    public String showBanner(String img){
        StringBuilder banner = new StringBuilder();
        banner.append("**********\n");
        banner.append("*  " + img + "  *\n");
        banner.append("**********\n");
        return banner.toString();
    }
}

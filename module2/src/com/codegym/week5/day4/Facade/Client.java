package com.codegym.week5.day4.Facade;

public class Client {
    public void share(String message) {
        SocialMediaFacade socialMediaFacade = new SocialMediaFacade(new Twitter(), new Facebook(), new Linkedln());
        socialMediaFacade.share(message);
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.share("This is post");
    }
}

package fr.sdds.bot;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Main {

    private static Main instance;

    public Main() throws LoginException {
        JDABuilder jdaBuilder = new JDABuilder();
        jdaBuilder.setToken("TOKEN");
        jdaBuilder.setActivity(Activity.listening("nm!"));
        jdaBuilder.addEventListeners(new Listener());
        jdaBuilder.build();
    }

    public static void main(String[] args) {
        try {
            instance = new Main();
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }

    public static Main getInstance() {
        return instance;
    }
}

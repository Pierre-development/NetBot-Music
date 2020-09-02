package fr.sdds.bot;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Main {

    private static Main instance;

    public Main() throws LoginException {
        JDABuilder jdaBuilder = new JDABuilder();
        jdaBuilder.setToken("NzUwNzA4MDQ2NTcyODE0Mzk4.X0-dWQ.4GR8_Ima_usP24bx4mzSs_vTuZg");
        jdaBuilder.setActivity(Activity.listening("de la musique sur NetHeberg"));
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

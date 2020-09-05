package fr.sdds.bot;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class Listener extends ListenerAdapter {

    private final CommandManager manager = new CommandManager();

    @Override
    public void onGuildMessageReceived(@Nonnull GuildMessageReceivedEvent event) {



        User user = event.getAuthor();

        Member member = event.getMember();


            event.getChannel().sendMessage("est Bg");

        if (user.isBot() || event.isWebhookMessage()) {
            return;
        }

        String prefix = "nm!";
        String raw = event.getMessage().getContentRaw();


        if (raw.startsWith(prefix)) {
            manager.handle(event);
        }
    }
}

package fr.sdds.bot.commands;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.internal.handle.GuildSetupController;

public class Ping implements ICommand {
    @Override
    public void handle(CommandContext ctx) {
        JDA jda = ctx.getJDA();






    }

    @Override
    public String getName() {
        return "ping";
    }
}

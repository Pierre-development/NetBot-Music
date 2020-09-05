package fr.sdds.bot.commands;

import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.*;

public class BG implements ICommand {
    @Override
    public void handle(CommandContext commandContext) {
        EmbedBuilder embedBuilder = new EmbedBuilder();


        embedBuilder.setThumbnail(commandContext.getAuthor().getAvatarUrl());
        embedBuilder.setColor(Color.GREEN);
        embedBuilder.addField(commandContext.getAuthor().getName(), "est bg", true);

        commandContext.getChannel().sendMessage(embedBuilder.build()).queue();
    }

    @Override
    public String getName() {
        return "bg";
    }
}

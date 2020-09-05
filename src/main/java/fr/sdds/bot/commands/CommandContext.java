package fr.sdds.bot.commands;


import me.duncte123.botcommons.commands.ICommandContext;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

import java.util.List;

public class CommandContext implements ICommandContext {

    private final GuildMessageReceivedEvent guildMessageReceivedEvent;
    private final List<String> args;

    public CommandContext(GuildMessageReceivedEvent guildMessageReceivedEvent, List<String> args) {
        this.guildMessageReceivedEvent = guildMessageReceivedEvent;
        this.args = args;
    }

    @Override
    public Guild getGuild() {
        return this.getEvent().getGuild();
    }

    @Override
    public GuildMessageReceivedEvent getEvent() {
        return this.guildMessageReceivedEvent;
    }

    public List<String> getArgs() {
        return args;
    }
}

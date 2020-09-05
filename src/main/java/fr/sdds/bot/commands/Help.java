package fr.sdds.bot.commands;

public class Help implements ICommand {
    @Override
    public void handle(CommandContext commandContext) {
        System.out.println("cmd send");
        commandContext.getChannel().sendMessage("test " + commandContext.getAuthor().getAsMention()).queue();
    }

    @Override
    public String getName() {
        return "help";
    }
}

package fr.sdds.bot.commands;

import fr.sdds.bot.commands.CommandContext;

import java.util.Arrays;
import java.util.List;

public interface ICommand {
    void handle(CommandContext commandContext);
    String getName();
   default List<String> getAliases() {
       return Arrays.asList();
   }
}

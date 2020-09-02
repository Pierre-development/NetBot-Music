package fr.sdds.bot;

import java.util.Arrays;
import java.util.List;

public interface ICommand {
    void handle();
    String getName();
   default List<String> getAliases() {
       return Arrays.asList();
   }
}

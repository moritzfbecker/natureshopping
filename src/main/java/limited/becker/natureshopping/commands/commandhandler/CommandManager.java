package limited.becker.natureshopping.commands.commandhandler;

import limited.becker.natureshopping.NatureShopping;
import limited.becker.natureshopping.commands.commandhandler.Command;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;

import java.util.HashMap;

public class CommandManager extends ListenerAdapter {

    private HashMap<String, Command> commands;

    public CommandManager() {
        commands = new HashMap<>();
    }

    public void registerGuildCommand(String commandName, String description, Command command, OptionData... optionData) {
        commands.put(commandName, command);
        NatureShopping.getJda().updateCommands().addCommands(Commands.slash(commandName.toLowerCase(), description).addOptions(optionData).setGuildOnly(true)).queue();
    }

    public void registerCommand(String commandName, String description, Command command, OptionData... optionData) {
        commands.put(commandName, command);
        if(optionData.length == 0) {
            NatureShopping.getJda().updateCommands().addCommands(Commands.slash(commandName.toLowerCase(), description)).queue();
        } else {
            NatureShopping.getJda().updateCommands().addCommands(Commands.slash(commandName.toLowerCase(), description).addOptions(optionData)).queue();
        }
    }

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        System.out.println("test1");
        commands.forEach((commandName, command) -> {
            System.out.println("test3");
            if(event.getName().equalsIgnoreCase(commandName)) command.onCommand(event);
        });
    }
}

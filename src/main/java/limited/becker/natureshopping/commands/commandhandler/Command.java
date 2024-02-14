package limited.becker.natureshopping.commands.commandhandler;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;

public interface Command {

    void onCommand(SlashCommandInteractionEvent event);

}

import net.dv8tion.jda.core.hooks.ListenerAdapter;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class BotListener extends ListenerAdapter {
	
	@Override
	public void onMessageReceived(MessageReceivedEvent e){

		if (e.getMessage().getRawContent().equalsIgnoreCase("ping")){
			e.getChannel().sendMessage(e.getAuthor().getAsMention()+" pong").queue();
//		} else {
//			e.getChannel().sendMessage(e.getAuthor().getAsMention()+"Sorry I don't understand").queue();
		}
		
	}
}

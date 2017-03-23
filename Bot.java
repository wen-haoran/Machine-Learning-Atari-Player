import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

import javax.security.auth.login.LoginException;

public class Bot {
	
	public static JDA jda;
	public static final String BOT_TOKEN = "Mjg0MDg0NjMwNzgzNjU1OTM2.C4_dnA.5cYohDiSXwlDyjSMAIYu2Oa_OLA";

	public static void main(String[] args) {
		try {
			jda = new JDABuilder(AccountType.BOT).addListener(new BotListener()).setToken(BOT_TOKEN).buildBlocking();
		} catch (LoginException | IllegalArgumentException | InterruptedException | RateLimitedException e) {
			e.printStackTrace();
		}	
	}
}

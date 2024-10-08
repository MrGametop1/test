package dk.gamingdanmark.test;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.mineacademy.fo.plugin.SimplePlugin;

import javax.mail.Message;

/**
 * PluginTemplate is a simple template you can use every time you make
 * a new plugin. This will save you time because you no longer have to
 * recreate the same skeleton and features each time.
 *
 * It uses Foundation for fast and efficient development process.
 */
public final class SuperTest extends SimplePlugin {

	/**
	* Automatically perform login ONCE when the plugin starts.
	*/
	@Override
	protected void onPluginStart() {

		/*
	 	* Dette er æbler
	 	*/
		int apples = 5;

		/*
		 * Dette her printer linjen ud
		 */
		System.out.println(1);
		System.out.println("knock, knock!"); // COMMENT
		System.out.println("Hej" + "hejsa");
		/*
		 * Super sej comment
		 */
		System.out.println("Hej" + 2 + 3 + (1-1));

		for (int testnumber = 1; testnumber < 20; testnumber++) {

			System.out.println("Test loop: " + testnumber);

		}

	}

	/**
	 * Automatically perform login when the plugin starts and each time it is reloaded.
	 */
	@Override
	protected void onReloadablesStart() {

		// You can check for necessary plugins and disable loading if they are missing
		//Valid.checkBoolean(HookManager.isVaultLoaded(), "You need to install Vault so that we can work with packets, offline player data, prefixes and groups.");

		// Uncomment to load variables
		// Variable.loadVariables();

		//
		// Add your own plugin parts to load automatically here
		// Please see @AutoRegister for parts you do not have to register manually
		//
	}

	@Override
	protected void onPluginPreReload() {

		// Close your database here if you use one
		//YourDatabase.getInstance().close();
	}

	/* ------------------------------------------------------------------------------- */
	/* Events */
	/* ------------------------------------------------------------------------------- */

	/**
	 * An example event that checks if the right clicked entity is a cow, and makes an explosion.
	 * You can write your events to your main class without having to register a listener.
	 *
	 * @param event
	 */
	@EventHandler
	public void onRightClick(final PlayerInteractEntityEvent event) {

		if (event.getRightClicked().getType() == EntityType.COW)
			event.getRightClicked().setFireTicks(20);

		if (event.getRightClicked().getType() == EntityType.CHICKEN) {
			event.getRightClicked().setFireTicks(3 * 20);


		/*
		 * Virker slet ikke, men hvorfor?
		 */
		if (event.getRightClicked().getType() == EntityType.CREEPER) {
			event.getRightClicked().setFireTicks(1); //Dosent print out
			System.out.println("test"); //Dosent print out

			for (int testnumber = 1; testnumber < 20; testnumber++) {

				System.out.println("Test loop: " + testnumber);
				//event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), testnumber);

			}
		}

			/*
			 * Understående while loop her, gav nogle heftige resultater.
			 */
			//while (event.getRightClicked().getFireTicks() > 0){
			//	event.getPlayer().sendMessage("FireTicks " + (event.getRightClicked().getFireTicks()));
			//}

			/*
			 * Understående linje giver logging data til consolen.
			 */
			//System.out.println(event.getRightClicked().getFireTicks());
			//event.getPlayer().sendMessage("Test");

		}

		/*
		 * Understående linje giver logging data til consolen.
		 */
		System.out.println(event.getRightClicked().getType());

		//player.sendMessage(event.getRightClicked().getType()); //Dette virker ikke hvorfor?


		//event.getRightClicked().getWorld().generateTree(event.getRightClicked().getLocation(), TreeType.BIRCH); //Virker ikke


		//if (event.getRightClicked().getType() == EntityType.CHICKEN)
		//	event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), apples);
	}

	/* ------------------------------------------------------------------------------- */
	/* Static */
	/* ------------------------------------------------------------------------------- */

	/**
	 * Return the instance of this plugin, which simply refers to a static
	 * field already created for you in SimplePlugin but casts it to your
	 * specific plugin instance for your convenience.
	 *
	 * @return
	 */
	public static SuperTest getInstance() {
		return (SuperTest) SimplePlugin.getInstance();
	}
}

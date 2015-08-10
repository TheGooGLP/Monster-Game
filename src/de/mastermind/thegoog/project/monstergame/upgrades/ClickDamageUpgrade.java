package de.mastermind.thegoog.project.monstergame.upgrades;

import de.mastermind.thegoog.project.monstergame.monsters.Player;
import de.mastermind.thegoog.project.monstergame.utils.Utils;

/**
 * 
 * @author Michael Zigldrum
 * @author Andreas Knipl
 *
 */

public class ClickDamageUpgrade {

	private long level = 0;
	private long price = 0;
	private long clickDamageUpgrade = 0;

	/**
	 * Initializes the Click-Damage-Upgrade
	 */
	protected ClickDamageUpgrade() {
		price = 0;
		clickDamageUpgrade = 50;
	}

	/**
	 * Returns Price for the Click-Damage-Upgrade
	 * 
	 * @return price
	 */
	protected long getPrice() {
		return this.price;
	}

	/**
	 * Returns additional click damage from next Upgrade-Level
	 * 
	 * @return passiveDamageUpgrade
	 */
	protected long getClickDamageUpgrade() {
		return this.clickDamageUpgrade;
	}

	/**
	 * Purchases the Click-Damage-Upgrade
	 */
	protected void purchaseUpgrade(Player player) {
		level++;

		long playerAccount = player.getMoney();
		long upgradeCosts = this.getPrice();

		Utils.setAccountUpdated(true);
		player.setAccount(playerAccount - upgradeCosts);

		Utils.setClickDamageUpdated(true);
		long clickDamage = player.getClickDamage();
		player.setClickDamage(clickDamage + this.clickDamageUpgrade);
		
		Scaling.updateClickDamageUpgrade(this);
	}
	
	/**
	 * Updates the Click-Damage-Upgrades price
	 */
	protected void updatePrice() {
		
	}
	
	/**
	 * Updates the Click-Damage-Upgrades value
	 */
	protected void updateClickDamageUpgrade() {
		
	}
}

package com.helmetcheck;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("example")
public interface HelmetCheckConfig extends Config
{
	@ConfigItem(
		keyName = "greeting",
		name = "Helmet Check!!!",
		description = "The message to show to the user when they login"
	)
	default String greeting()
	{
		return "Helmet Check!!";
	}
}

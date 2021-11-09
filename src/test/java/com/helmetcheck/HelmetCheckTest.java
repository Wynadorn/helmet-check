package com.helmetcheck;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class HelmetCheckTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(HelmetCheckPlugin.class);
		RuneLite.main(args);
	}
}
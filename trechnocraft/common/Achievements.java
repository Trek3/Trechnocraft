package mods.trechnocraft.common;

import cpw.mods.fml.common.registry.LanguageRegistry;
import mods.trechnocraft.common.models.ModelElephant;
import net.minecraft.stats.Achievement;

public class Achievements{

	public static Achievement elephant;

	public static void init(){
		initializeArchievements();
		nameArchievements("elephant","Elemental extracting");
		registerConditions();
		describeAchievements("elephant", "Kill an Elephant.");
	}

	private static void initializeArchievements(){
		elephant=new Achievement(2000,"elephant",-2,0,Trechnocraft.ivoryHorn,(Achievement)null).registerAchievement();
	}

	private static void nameArchievements(String achievement,String name){
		LanguageRegistry.instance().addStringLocalization("achievement." + achievement, "en_US", name);
	}
	private static void describeAchievements(String achievement,String desc){
		LanguageRegistry.instance().addStringLocalization("achievement." + achievement + ".desc", "en_US", desc);
	}
	private static void registerConditions(){

	}
}
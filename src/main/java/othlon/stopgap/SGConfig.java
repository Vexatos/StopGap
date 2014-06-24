package othlon.stopgap;

/**
 * Created by Jen on 20/05/14.
 */

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class SGConfig {

    //class members

    public static boolean canMakeOwnRedstone;

    public static boolean canMakeOwnGlowstone;

    public static boolean canCraftClayBlock;

    public static boolean canCraftClayBalls;

    public static boolean canPanFlint;

    public static boolean canSpinString;

    public static boolean canUnslabWood;

    public static boolean canUnslabCobble;

    public static boolean canUnslabStone;



    public static void configurating(File confile)
    {
        Configuration config = new Configuration(confile);



        config.load();

        canMakeOwnRedstone  = config.get("Do you want to be able to make"," your own redstone?",true,"").getBoolean(true);
        canMakeOwnGlowstone = config.get("Do you want to be able to make"," your own glowstone?",true,"").getBoolean(true);
        canCraftClayBlock   = config.get("Do you want to be able to make"," blocks of clay?",true,"").getBoolean(true);
        canCraftClayBalls   = config.get("Do you want to be able to make"," balls of clay from crafting a block of clay?",true,"").getBoolean(true);

        if(config.hasChanged())config.save();
    }

}

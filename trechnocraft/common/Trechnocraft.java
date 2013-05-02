package mods.trechnocraft.common;

import java.util.HashMap;
import java.util.Map;

import mods.trechnocraft.client.ClientProxyTrechnocraft;
import mods.trechnocraft.common.biome.ColdWoodBiome;
import mods.trechnocraft.common.biome.MoonBiome;
import mods.trechnocraft.common.biome.RedHotBiome;
import mods.trechnocraft.common.biome.SavanaBiome;
import mods.trechnocraft.common.blocks.BlockAmazzoniteOre;
import mods.trechnocraft.common.blocks.BlockBrass;
import mods.trechnocraft.common.blocks.BlockCarbonOre;
import mods.trechnocraft.common.blocks.BlockChestBlock;
import mods.trechnocraft.common.blocks.BlockCopperOre;
import mods.trechnocraft.common.blocks.BlockFoundry;
import mods.trechnocraft.common.blocks.BlockLeadOre;
import mods.trechnocraft.common.blocks.BlockNickelOre;
import mods.trechnocraft.common.blocks.BlockPewter;
import mods.trechnocraft.common.blocks.BlockRegolite;
import mods.trechnocraft.common.blocks.BlockTinOre;
import mods.trechnocraft.common.blocks.BlockTitaniumOre;
import mods.trechnocraft.common.blocks.BlockTungstenOre;
import mods.trechnocraft.common.blocks.BlockUraniumOre;
import mods.trechnocraft.common.blocks.BlockZincOre;
import mods.trechnocraft.common.entity.EntityElephant;
import mods.trechnocraft.common.entity.EntityTroll;
import mods.trechnocraft.common.gui.GuiChestBlock;
import mods.trechnocraft.common.blocks.BlockTecnezioOre;
import mods.trechnocraft.common.items.ItemAmazzonite;
import mods.trechnocraft.common.items.ItemBronzeAxe;
import mods.trechnocraft.common.items.ItemBronzeHoe;
import mods.trechnocraft.common.items.ItemBronzeIngot;
import mods.trechnocraft.common.items.ItemBronzePickaxe;
import mods.trechnocraft.common.items.ItemBronzeShovel;
import mods.trechnocraft.common.items.ItemBronzeSword;
import mods.trechnocraft.common.items.ItemCarbon;
import mods.trechnocraft.common.items.ItemCopperAxe;
import mods.trechnocraft.common.items.ItemCopperHoe;
import mods.trechnocraft.common.items.ItemCopperIngot;
import mods.trechnocraft.common.items.ItemCopperPickaxe;
import mods.trechnocraft.common.items.ItemCopperShovel;
import mods.trechnocraft.common.items.ItemCopperSword;
import mods.trechnocraft.common.items.ItemIvoryArmor;
import mods.trechnocraft.common.items.ItemIvoryBoots;
import mods.trechnocraft.common.items.ItemIvoryHelmet;
import mods.trechnocraft.common.items.ItemIvoryHorn;
import mods.trechnocraft.common.items.ItemIvoryLeggins;
import mods.trechnocraft.common.items.ItemLeadIngot;
import mods.trechnocraft.common.items.ItemNickelIngot;
import mods.trechnocraft.common.items.ItemSteelAxe;
import mods.trechnocraft.common.items.ItemSteelHoe;
import mods.trechnocraft.common.items.ItemSteelIngot;
import mods.trechnocraft.common.items.ItemSteelPickaxe;
import mods.trechnocraft.common.items.ItemSteelShovel;
import mods.trechnocraft.common.items.ItemSteelSword;
import mods.trechnocraft.common.items.ItemTecnezio;
import mods.trechnocraft.common.items.ItemTinAxe;
import mods.trechnocraft.common.items.ItemTinHoe;
import mods.trechnocraft.common.items.ItemTinIngot;
import mods.trechnocraft.common.items.ItemTinPickaxe;
import mods.trechnocraft.common.items.ItemTinShovel;
import mods.trechnocraft.common.items.ItemTinSword;
import mods.trechnocraft.common.items.ItemTitaniumAxe;
import mods.trechnocraft.common.items.ItemTitaniumHoe;
import mods.trechnocraft.common.items.ItemTitaniumIngot;
import mods.trechnocraft.common.items.ItemTitaniumPickaxe;
import mods.trechnocraft.common.items.ItemTitaniumShovel;
import mods.trechnocraft.common.items.ItemTitaniumSword;
import mods.trechnocraft.common.items.ItemTrechnocraftLogo;
import mods.trechnocraft.common.items.ItemTungstenIngot;
import mods.trechnocraft.common.items.ItemUraniumIngot;
import mods.trechnocraft.common.items.ItemZincIngot;
import mods.trechnocraft.common.models.ModelElephant;
import mods.trechnocraft.common.tileentity.TileEntityFoundry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.block.StepSound;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.*;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.BaseMod;
import net.minecraft.src.ModLoader;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenDesert;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.liquids.IBlockLiquid;

@Mod(modid = "Trechnocraft", name = "Trechnocraft", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Trechnocraft{
	@Instance("Trechnocraft")
	public static Trechnocraft instance;
	
	
	@SidedProxy(clientSide="mods.trechnocraft.client.ClientProxyTrechnocraft",serverSide="mods.trechnocraft.common.CommonProxyTrechnocraft")
	public static ClientProxyTrechnocraft proxy = new ClientProxyTrechnocraft();
	
	public BiomeGenBase trechnocraftBiome = new RedHotBiome(40);
	public BiomeGenBase trechnocraftBiome1 = new ColdWoodBiome(41);
	public BiomeGenBase trechnocraftBiome2 = (new SavanaBiome(42)).setColor(2552550).setBiomeName("Savana").setTemperatureRainfall(2.0F, 0.0F).setMinMaxHeight(0.1F, 0.2F);
	public BiomeGenBase trechnocraftBiome3 = new MoonBiome(44);
	
	public static CreativeTabs TrechnoTab = new CustomCreativeTabs("TrechnoTab");
	
	public static Block chestBlock;
	public static Block foundryBlock;
	public static Block foundryBlockActive;
	
	public static TrechnocaftGuiHandler guiHandler = new TrechnocaftGuiHandler();
	
	//materials
	public static EnumToolMaterial titanium = EnumHelper.addToolMaterial("Titanio", 2, 150, 9.0F, 6, 10);
	public static EnumToolMaterial bronze = EnumHelper.addToolMaterial("Bronzo", 2 , 120, 6.0F, 6, 6);
	public static EnumToolMaterial tin = EnumHelper.addToolMaterial("Stagno", 2 , 100, 5.0F, 6, 6);
	public static EnumToolMaterial copper = EnumHelper.addToolMaterial("Rame", 2 , 90, 4.0F, 6, 6);
	public static EnumToolMaterial steel = EnumHelper.addToolMaterial("Acciaio", 2 , 130, 7.5F, 6, 8);
	public static EnumToolMaterial ivory = EnumHelper.addToolMaterial("Avorio", 2 , 130, 6.5F, 6, 8);
	
	public static EnumArmorMaterial ivory1 = EnumHelper.addArmorMaterial("Avorio",50,new int[]{8,20,14,8},10);
	
	public static Material petroleum = new MaterialPetroleum(MaterialPetroleum.petroleumColor);
	

	
	//blocks
	public static Block titaniumOre;
	public static Block copperOre;
	public static Block tinOre;
	public static Block carbonOre;
	public static Block regolite;
	public static Block amazzoniteOre;
	public static Block tecnezioOre;
	public static Block uraniumOre;
	public static Block zincOre;
	public static Block tungstenOre;
	public static Block leadOre;
	public static Block nickelOre;
	public static Block pewter;
	public static Block brass;
	public static Block petroleumStill;
	public static Block petroleumFlowing;
	
	
	
	//items
	public static Item steelIngot;
	public static Item titaniumIngot;
	public static Item copperIngot;
	public static Item tinIngot;
	public static Item bronzeIngot;
	public static Item uraniumIngot;
	public static Item zincIngot;
	public static Item leadIngot;
	public static Item tungstenIngot;
	public static Item nickelIngot;
	public static Item ivoryHorn;
	public static Item carbon;
	public static Item amazzonite;
	public static Item tecnezio;
	public static Item trechnocraftLogo;
	
	
	public static Item ivoryHelmet;
	public static Item ivoryPlate;
	public static Item ivoryLeggins;
	public static Item ivoryBoots;

	//tool sets
	public static Item titaniumPickaxe;
	public static Item steelPickaxe;
	public static Item bronzePickaxe;
	public static Item tinPickaxe;
	public static Item copperPickaxe;
	public static Item titaniumAxe;
	public static Item steelAxe;
	public static Item bronzeAxe;
	public static Item tinAxe;
	public static Item copperAxe;
	public static Item titaniumShovel;
	public static Item steelShovel;
	public static Item bronzeShovel;
	public static Item tinShovel;
	public static Item copperShovel;
	public static Item titaniumHoe;
	public static Item steelHoe;
	public static Item bronzeHoe;
	public static Item tinHoe;
	public static Item copperHoe;
	public static Item titaniumSword;
	public static Item steelSword;
	public static Item bronzeSword;
	public static Item tinSword;
	public static Item copperSword;
	
	//step sounds
	public static final StepSound soundStoneFootstep = new StepSound("stone", 1.0F, 1.0F);
	
	static int titaniumOreID = 500;
	static int copperOreID = 501;
	static int tinOreID = 502;
	static int carbonOreID = 503;
	static int regoliteID = 504;
	static int amazzoniteOreID = 505;
	static int tecnezioOreID = 506; 
	static int uraniumOreID = 507; 
	static int zincOreID = 508; 
	static int leadOreID = 509; 
	static int nickelOreID = 510;
	static int tungstenOreID = 511; 
	static int pewterID = 512; 
	static int brassID = 513; 
	static int petroleumStillID = 514;
	static int petroleumFlowingID = 515;
	
	static int titaniumIngotID = 700;
	static int copperIngotID = 701;
	static int tinIngotID = 702;
	static int bronzeIngotID = 703;
	static int ivoryHornID = 705;
	static int carbonID = 706;
	static int steelIngotID = 707;
	static int amazzoniteID = 708;
	static int tecnezioID = 709;
	static int trechnocraftLogoID = 732;
	static int uraniumIngotID = 733;
	static int zincIngotID = 734;
	static int leadIngotID = 735;
	static int tungstenIngotID = 736;
	static int nickelIngotID = 737;
	
	
	static int ivoryHelmetID = 729;
	static int ivoryPlateID = 730;
	static int ivoryLegginsID = 731;
	static int ivoryBootsID = 728;
	
	static int titaniumPickaxeID = 708;
	static int steelPickaxeID = 726;
	static int bronzePickaxeID = 712;
	static int tinPickaxeID = 713;
	static int copperPickaxeID = 714;
	static int titaniumAxeID = 720;
	static int steelAxeID = 727;
	static int bronzeAxeID =721;
	static int tinAxeID = 722;
	static int copperAxeID = 723;
	static int titaniumShovelID = 738;
	static int steelShovelID = 739;
	static int bronzeShovelID =740;
	static int tinShovelID = 741;
	static int copperShovelID = 742;
	static int titaniumHoeID = 743;
	static int steelHoeID = 744;
	static int bronzeHoeID =745;
	static int tinHoeID = 746;
	static int copperHoeID = 747;
	static int titaniumSwordID = 748;
	static int steelSwordID = 749;
	static int bronzeSwordID =750;
	static int tinSwordID = 751;
	static int copperSwordID = 752;
	
	
	static int foundryBlockID = 710;
    static int foundryBlockActiveID = 711;
	
	
	@Init
	public void load(FMLInitializationEvent event){
		
		proxy.init();
		

		
		titaniumOre = new BlockTitaniumOre(titaniumOreID, Material.iron).setHardness(3.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("Titanio");
		copperOre = new BlockCopperOre(copperOreID, Material.iron).setHardness(2.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("Rame");
	    tinOre = new BlockTinOre(tinOreID, Material.iron).setHardness(1.5F).setStepSound(soundStoneFootstep).setUnlocalizedName("Stagno");
	    carbonOre = new BlockCarbonOre(carbonOreID, Material.iron).setHardness(2.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("Carbonio");
	    regolite = new BlockRegolite(regoliteID, Material.sand).setHardness(6F).setResistance(7.0F).setUnlocalizedName("Regolite");
	    amazzoniteOre = new BlockAmazzoniteOre(amazzoniteOreID, Material.iron).setHardness(1.5F).setUnlocalizedName("Amazzonite");
	    tecnezioOre = new BlockTecnezioOre(tecnezioOreID, Material.iron).setHardness(1.5F).setUnlocalizedName("Tecnezio");
	    uraniumOre = new BlockUraniumOre(uraniumOreID, Material.iron).setLightValue(0.5F).setHardness(1.5F).setUnlocalizedName("Uranio");
	    zincOre = new BlockZincOre(zincOreID, Material.iron).setHardness(1.5F).setUnlocalizedName("Zinco");
	    nickelOre = new BlockNickelOre(nickelOreID, Material.iron).setHardness(1.5F).setUnlocalizedName("Nichel");
	    tungstenOre = new BlockTungstenOre(tungstenOreID, Material.iron).setHardness(1.5F).setUnlocalizedName("Tungsteno");
	    leadOre = new BlockLeadOre(leadOreID, Material.iron).setHardness(1.5F).setUnlocalizedName("Piombo");
	    pewter = new BlockPewter(pewterID, Material.iron).setHardness(1.5F).setUnlocalizedName("Peltro");
	    brass = new BlockBrass(brassID, Material.iron).setHardness(1.5F).setUnlocalizedName("Ottone");
	    foundryBlock= new BlockFoundry(foundryBlockID, false).setUnlocalizedName("Fonderia");
	    foundryBlockActive= new BlockFoundry(foundryBlockActiveID, true).setUnlocalizedName("Fonderia");
	    petroleumStill = new BlockPetroleumStill(petroleumStillID).setUnlocalizedName("Petrolio");
	    petroleumFlowing = new BlockPetroleumFlowing(petroleumFlowingID).setUnlocalizedName("Petrolio");
	   
	    steelIngot = new ItemSteelIngot(steelIngotID).setUnlocalizedName("Acciaio");
	    titaniumIngot = new ItemTitaniumIngot(titaniumIngotID).setUnlocalizedName("LingottodiTitanio");
	    copperIngot = new ItemCopperIngot(copperIngotID).setUnlocalizedName("LingottodiRame");
	    tinIngot = new ItemTinIngot(tinIngotID).setUnlocalizedName("LingottodiStagno");
	    bronzeIngot = new ItemBronzeIngot(bronzeIngotID).setUnlocalizedName("LingottodiBronzo");
	    uraniumIngot = new ItemUraniumIngot(uraniumIngotID).setUnlocalizedName("LingottodiUranio");
	    zincIngot = new ItemZincIngot(zincIngotID).setUnlocalizedName("LingottodiZinco");
	    leadIngot = new ItemLeadIngot(leadIngotID).setUnlocalizedName("LingottodiPiombo");
	    tungstenIngot = new ItemTungstenIngot(tungstenIngotID).setUnlocalizedName("LingottodiTungsteno");
	    nickelIngot = new ItemNickelIngot(nickelIngotID).setUnlocalizedName("LingottodiNichel");
	    ivoryHorn = new ItemIvoryHorn(ivoryHornID).setUnlocalizedName("Corno d'Avorio");
	    carbon = new ItemCarbon(carbonID).setUnlocalizedName("CarbonioRaffinato");
	    amazzonite = new ItemAmazzonite(amazzoniteID).setUnlocalizedName("AmazzoniteRaffinata");
	    tecnezio = new ItemTecnezio(tecnezioID).setUnlocalizedName("TecnezioRaffinato");
	    trechnocraftLogo = new ItemTrechnocraftLogo(trechnocraftLogoID).setUnlocalizedName("Trechnocraft Logo");
	    
	    ivoryHelmet=new ItemIvoryArmor(ivoryHelmetID,ivory1,(proxy).addArmor("Avorio"),0).setUnlocalizedName("ElmodAvorio");
		ivoryPlate=new ItemIvoryArmor(ivoryPlateID,ivory1,proxy.addArmor("Avorio"),1).setUnlocalizedName("CorazzadAvorio");
		ivoryLeggins=new ItemIvoryArmor(ivoryLegginsID,ivory1,proxy.addArmor("Avorio"),2).setUnlocalizedName("GambalidAvorio");
		ivoryBoots=new ItemIvoryArmor(ivoryBootsID,ivory1,proxy.addArmor("Avorio"),3).setUnlocalizedName("StivalidAvorio");
	    
	    
	    titaniumPickaxe = new ItemTitaniumPickaxe(titaniumPickaxeID, titanium).setUnlocalizedName("PicconeTitanio");
	    steelPickaxe = new ItemSteelPickaxe(steelPickaxeID, steel).setUnlocalizedName("PicconeAcciaio");
	    bronzePickaxe = new ItemBronzePickaxe(bronzePickaxeID, bronze).setUnlocalizedName("PicconeBronzo");
	    tinPickaxe = new ItemTinPickaxe(tinPickaxeID, tin).setUnlocalizedName("PicconeStagno");
	    copperPickaxe = new ItemCopperPickaxe(copperPickaxeID, copper).setUnlocalizedName("PicconeRame");
	    titaniumAxe = new ItemTitaniumAxe(titaniumAxeID, titanium).setUnlocalizedName("AsciaTitanio");
	    steelAxe = new ItemSteelAxe(steelAxeID, steel).setUnlocalizedName("AsciaAcciaio");
	    bronzeAxe = new ItemBronzeAxe(bronzeAxeID, bronze).setUnlocalizedName("AsciaBronzo");
	    tinAxe = new ItemTinAxe(tinAxeID, tin).setUnlocalizedName("AsciaStagno");
	    copperAxe = new ItemCopperAxe(copperAxeID, copper).setUnlocalizedName("AsciaRame");
	    titaniumShovel = new ItemTitaniumShovel(titaniumShovelID, titanium).setUnlocalizedName("PalaTitanio");
	    steelShovel = new ItemSteelShovel(steelShovelID, steel).setUnlocalizedName("PalaAcciaio");
	    bronzeShovel = new ItemBronzeShovel(bronzeShovelID, bronze).setUnlocalizedName("PalaBronzo");
	    tinShovel = new ItemTinShovel(tinShovelID, tin).setUnlocalizedName("PalaStagno");
	    copperShovel = new ItemCopperShovel(copperShovelID, copper).setUnlocalizedName("PalaRame");
	    titaniumHoe = new ItemTitaniumHoe(titaniumHoeID, titanium).setUnlocalizedName("ZappaTitanio");
	    steelHoe = new ItemSteelHoe(steelHoeID, steel).setUnlocalizedName("ZappaAcciaio");
	    bronzeHoe = new ItemBronzeHoe(bronzeHoeID, bronze).setUnlocalizedName("ZappaBronzo");
	    tinHoe = new ItemTinHoe(tinHoeID, tin).setUnlocalizedName("ZappaStagno");
	    copperHoe = new ItemCopperHoe(copperHoeID, copper).setUnlocalizedName("ZappaRame");
	    titaniumSword = new ItemTitaniumSword(titaniumSwordID, titanium).setUnlocalizedName("SpadaTitanio");
	    steelSword = new ItemSteelSword(steelSwordID, steel).setUnlocalizedName("SpadaAcciaio");
	    bronzeSword = new ItemBronzeSword(bronzeSwordID, bronze).setUnlocalizedName("SpadaBronzo");
	    tinSword = new ItemTinSword(tinSwordID, tin).setUnlocalizedName("SpadaStagno");
	    copperSword = new ItemCopperSword(copperSwordID, copper).setUnlocalizedName("SpadaRame");

	    
	    chestBlock = new BlockChestBlock(499, Material.wood, null).setUnlocalizedName("Cesta");
	    
	    GameRegistry.addBiome(trechnocraftBiome);
	    GameRegistry.addBiome(trechnocraftBiome1);
	    GameRegistry.addBiome(trechnocraftBiome2);
	    GameRegistry.addBiome(trechnocraftBiome3);
	    
	    
		gameRegisters();
		languageRegisters();
		craftingRecipes();
		

		
		proxy.registerRenders();
		GameRegistry.addSmelting(titaniumOre.blockID, new ItemStack(Trechnocraft.titaniumIngot,1),0.5F);
		GameRegistry.addSmelting(copperOre.blockID, new ItemStack(Trechnocraft.copperIngot,1),0.5F);
		GameRegistry.addSmelting(tinOre.blockID, new ItemStack(Trechnocraft.tinIngot,1),0.5F);
		GameRegistry.addSmelting(amazzoniteOre.blockID, new ItemStack(Trechnocraft.amazzonite, 1), 0.5F);
		GameRegistry.addSmelting(Item.ingotIron.itemID, new ItemStack(Trechnocraft.steelIngot,1), 0.5F);
		GameRegistry.addSmelting(Trechnocraft.tinIngot.itemID, new ItemStack(Trechnocraft.bronzeIngot,1), 1.5F);
		GameRegistry.addSmelting(Trechnocraft.copperIngotID, new ItemStack(Trechnocraft.brass,1), 1.0F);
		
		
		GameRegistry.registerWorldGenerator(new WorldGeneratorTrechnocraft());
		GameRegistry.registerWorldGenerator(new WorldGeneratorStructures());
		
		
		GameRegistry.registerFuelHandler(new TrechnocraftFuelHandler());
		GameRegistry.registerTileEntity(TileEntityFoundry.class, "tileEntityFoundry");
		NetworkRegistry.instance().registerGuiHandler(this, guiHandler);
	
		EntityRegistry.registerGlobalEntityID(EntityElephant.class, "Elefante", EntityRegistry.findGlobalUniqueEntityId(),3515848,12102);
		EntityRegistry.registerGlobalEntityID(EntityTroll.class,"Troll",EntityRegistry.findGlobalUniqueEntityId(),16777215,9474208);	
		EntityRegistry.addSpawn(EntityElephant.class, 40, 6, 12, EnumCreatureType.creature, trechnocraftBiome2);
		EntityRegistry.addSpawn(EntityTroll.class, 50, 2, 5, EnumCreatureType.monster, trechnocraftBiome);

	}	
	private static void gameRegisters(){
		GameRegistry.registerBlock(titaniumOre, "Titanio");
		GameRegistry.registerBlock(copperOre, "Rame");
		GameRegistry.registerBlock(tinOre, "Stagno");
		GameRegistry.registerBlock(carbonOre, "Carbonio");
		GameRegistry.registerBlock(regolite, "Regolite");
		GameRegistry.registerBlock(amazzoniteOre, "Amazzonite");
		GameRegistry.registerBlock(tecnezioOre, "Tecnezio");
		GameRegistry.registerBlock(uraniumOre, "Uranio");
		GameRegistry.registerBlock(zincOre, "Zinco");
		GameRegistry.registerBlock(tungstenOre, "Tungsteno");
		GameRegistry.registerBlock(leadOre, "Piombo");
		GameRegistry.registerBlock(nickelOre, "Nichel");
		GameRegistry.registerBlock(pewter, "Peltro");
		GameRegistry.registerBlock(brass, "Ottone");
		GameRegistry.registerBlock(foundryBlock, "Fonderia");
		GameRegistry.registerBlock(petroleumStill, "PetrolioFermo");
		GameRegistry.registerBlock(petroleumFlowing, "PetrolioInMovimento");
		
		
		GameRegistry.registerItem(titaniumIngot, "Lingotto di Titanio");
		GameRegistry.registerItem(copperIngot, "Lingotto di Rame");
		GameRegistry.registerItem(tinIngot, "Lingotto di Stagno");
		GameRegistry.registerItem(bronzeIngot, "Lingotto di Bronzo");
		GameRegistry.registerItem(steelIngot, "Lingotto di Acciaio");
		GameRegistry.registerItem(uraniumIngot, "Lingotto di Uranio");
		GameRegistry.registerItem(zincIngot, "Lingotto di Zinco");
		GameRegistry.registerItem(leadIngot, "Lingotto di Piombo");
		GameRegistry.registerItem(tungstenIngot, "Lingotto di Tungsteno");
		GameRegistry.registerItem(nickelIngot, "Lingotto di Nichel");
		GameRegistry.registerItem(amazzonite, "Amazzonite Raffinata");
		GameRegistry.registerItem(tecnezio, "Tecnezio Raffinato");
	
		
		GameRegistry.registerItem(titaniumPickaxe, "Piccone di Titanio");
		GameRegistry.registerItem(steelPickaxe, "Piccone d'Acciaio");
		GameRegistry.registerItem(bronzePickaxe, "Piccone di Bronzo");
		GameRegistry.registerItem(tinPickaxe, "Piccone di Stagno");
		GameRegistry.registerItem(copperPickaxe, "Piccone di Rame");
		GameRegistry.registerItem(titaniumAxe, "Ascia di Titanio");
		GameRegistry.registerItem(steelAxe, "Ascia d'Acciaio");
		GameRegistry.registerItem(bronzeAxe, "Ascia di Bronzo");
		GameRegistry.registerItem(tinAxe, "Ascia di Stagno");
		GameRegistry.registerItem(copperAxe, "Ascia di Rame");
		GameRegistry.registerItem(titaniumShovel, "Pala di Titanio");
		GameRegistry.registerItem(steelShovel, "Pala d'Acciaio");
		GameRegistry.registerItem(bronzeShovel, "Pala di Bronzo");
		GameRegistry.registerItem(tinShovel, "Pala di Stagno");
		GameRegistry.registerItem(copperShovel, "Pala di Rame");
		GameRegistry.registerItem(titaniumHoe, "Zappa di Titanio");
		GameRegistry.registerItem(steelHoe, "Zappa d'Acciaio");
		GameRegistry.registerItem(bronzeHoe, "Zappa di Bronzo");
		GameRegistry.registerItem(tinHoe, "Zappa di Stagno");
		GameRegistry.registerItem(copperHoe, "Zappa di Rame");
		GameRegistry.registerItem(titaniumSword, "Spada di Titanio");
		GameRegistry.registerItem(steelSword, "Spada d'Acciaio");
		GameRegistry.registerItem(bronzeSword, "Spada di Bronzo");
		GameRegistry.registerItem(tinSword, "Spada di Stagno");
		GameRegistry.registerItem(copperSword, "Spada di Rame");
		
		GameRegistry.registerItem(ivoryPlate, "Corazza d'Avorio");
		GameRegistry.registerItem(ivoryHelmet, "Elmo d'Avorio");
		GameRegistry.registerItem(ivoryBoots, "Stivali d'Avorio");
		GameRegistry.registerItem(ivoryLeggins, "Gambali d'Avorio");
		
		GameRegistry.registerItem(carbon, "Grafite");
		GameRegistry.registerItem(ivoryHorn, "Corno d'Avorio");		
	}
	private static void languageRegisters(){
		LanguageRegistry.addName(titaniumOre, "Titanio");
		LanguageRegistry.addName(copperOre, "Rame");
		LanguageRegistry.addName(tinOre, "Stagno");
		LanguageRegistry.addName(carbonOre, "Carbonio");
		LanguageRegistry.addName(regolite, "Regolite");
		LanguageRegistry.addName(amazzoniteOre, "Amazzonite");
		LanguageRegistry.addName(tecnezioOre, "Tecnezio");
		LanguageRegistry.addName(uraniumOre, "Uranio");
		LanguageRegistry.addName(zincOre, "Zinco");
		LanguageRegistry.addName(tungstenOre, "Tungsteno");
		LanguageRegistry.addName(leadOre, "Piombo");
		LanguageRegistry.addName(nickelOre, "Nichel");
		LanguageRegistry.addName(pewter, "Peltro");
		LanguageRegistry.addName(brass, "Ottone");
		LanguageRegistry.addName(foundryBlock, "Fonderia");
		LanguageRegistry.addName(petroleumStill, "Petrolio Fermo");
		LanguageRegistry.addName(petroleumFlowing, "Petrolio in Movimento");
		
		LanguageRegistry.addName(titaniumIngot, "Lingotto di Titanio");
		LanguageRegistry.addName(copperIngot, "Lingotto di Rame");
		LanguageRegistry.addName(tinIngot, "Lingotto di Stagno");
		LanguageRegistry.addName(bronzeIngot, "Lingotto di Bronzo");
		LanguageRegistry.addName(steelIngot, "Lingotto di Acciaio");
		LanguageRegistry.addName(uraniumIngot, "Lingotto di Uranio");
		LanguageRegistry.addName(zincIngot, "Lingotto di Zinco");
		LanguageRegistry.addName(leadIngot, "Lingotto di Piombo");
		LanguageRegistry.addName(tungstenIngot, "Lingotto di Tungsteno");
		LanguageRegistry.addName(nickelIngot, "Lingotto di Nichel");
		LanguageRegistry.addName(amazzonite, "Amazzonite Raffinata");
		LanguageRegistry.addName(tecnezio, "Tecnezio Raffinato");
		
		LanguageRegistry.addName(titaniumPickaxe, "Piccone di Titanio");
		LanguageRegistry.addName(steelPickaxe, "Piccone d'Acciaio");
		LanguageRegistry.addName(bronzePickaxe, "Piccone di Bronzo");
		LanguageRegistry.addName(tinPickaxe, "Piccone di Stagno");
		LanguageRegistry.addName(copperPickaxe, "Piccone di Rame");
		LanguageRegistry.addName(titaniumAxe, "Ascia di Titanio");
		LanguageRegistry.addName(steelAxe, "Ascia d'Acciaio");
		LanguageRegistry.addName(bronzeAxe, "Ascia di Bronzo");
		LanguageRegistry.addName(tinAxe, "Ascia di Stagno");
		LanguageRegistry.addName(copperAxe, "Ascia di Rame");
		LanguageRegistry.addName(titaniumShovel, "Pala di Titanio");
		LanguageRegistry.addName(steelShovel, "Pala d'Acciaio");
		LanguageRegistry.addName(bronzeShovel, "Pala di Bronzo");
		LanguageRegistry.addName(tinShovel, "Pala di Stagno");
		LanguageRegistry.addName(copperShovel, "Pala di Rame");
		LanguageRegistry.addName(titaniumHoe, "Zappa di Titanio");
		LanguageRegistry.addName(steelHoe, "Zappa d'Acciaio");
		LanguageRegistry.addName(bronzeHoe, "Zappa di Bronzo");
		LanguageRegistry.addName(tinHoe, "Zappa di Stagno");
		LanguageRegistry.addName(copperHoe, "Zappa di Rame");
		LanguageRegistry.addName(titaniumSword, "Spada di Titanio");
		LanguageRegistry.addName(steelSword, "Spada d'Acciaio");
		LanguageRegistry.addName(bronzeSword, "Spada di Bronzo");
		LanguageRegistry.addName(tinSword, "Spada di Stagno");
		LanguageRegistry.addName(copperSword, "Spada di Rame");
		
		LanguageRegistry.addName(ivoryBoots, "Stivali d'Avorio");
		LanguageRegistry.addName(ivoryHelmet, "Elmo d'Avorio");
		LanguageRegistry.addName(ivoryLeggins, "Gambali d'Avorio");
		LanguageRegistry.addName(ivoryPlate, "Corazza d'Avorio");

		LanguageRegistry.addName(carbon, "Grafite");
		LanguageRegistry.addName(ivoryHorn, "Corno d'Avorio");
		
		
		
		
	}
	public void craftingRecipes(){
		GameRegistry.addRecipe(new ItemStack(Trechnocraft.titaniumPickaxe), new Object[]{
			"TTT"," S "," S ",
			'T', Trechnocraft.titaniumIngot,
			'S', Item.stick,
		});
		GameRegistry.addRecipe(new ItemStack(Trechnocraft.steelPickaxe), new Object[]{
			"sss"," S "," S ",
			's', Trechnocraft.steelIngot,
			'S', Item.stick,
		});
			GameRegistry.addRecipe(new ItemStack(Trechnocraft.bronzePickaxe), new Object[]{
				"BBB"," S "," S ",
				'B', Trechnocraft.bronzeIngot,
				'S', Item.stick,
			});
			GameRegistry.addRecipe(new ItemStack(Trechnocraft.tinPickaxe), new Object[]{
				"ttt"," S "," S ",
				't', Trechnocraft.tinIngot,
				'S', Item.stick,
			});
			GameRegistry.addRecipe(new ItemStack(Trechnocraft.copperPickaxe), new Object[]{
				"CCC"," S "," S ",
				'C', Trechnocraft.copperIngot,
				'S', Item.stick,
			});
			GameRegistry.addRecipe(new ItemStack(Trechnocraft.titaniumAxe), new Object[]{
				"TT ","TS "," S ",
				'T', Trechnocraft.titaniumIngot,
				'S', Item.stick,
			});
			GameRegistry.addRecipe(new ItemStack(Trechnocraft.steelAxe), new Object[]{
				"ss ","sS "," S ",
				's', Trechnocraft.steelIngot,
				'S', Item.stick,
			});
				GameRegistry.addRecipe(new ItemStack(Trechnocraft.bronzeAxe), new Object[]{
					"BB ","BS "," S ",
					'B', Trechnocraft.bronzeIngot,
					'S', Item.stick,
				});
				GameRegistry.addRecipe(new ItemStack(Trechnocraft.tinAxe), new Object[]{
					"tt ","tS "," S ",
					't', Trechnocraft.tinIngot,
					'S', Item.stick,
				});
				GameRegistry.addRecipe(new ItemStack(Trechnocraft.copperAxe), new Object[]{
					"CC ","CS "," S ",
					'C', Trechnocraft.copperIngot,
					'S', Item.stick,
				});
				GameRegistry.addRecipe(new ItemStack(Trechnocraft.ivoryHelmet), new Object[]{
					"   ","III","I I",
					'I', Trechnocraft.ivoryHorn,
					
				});
					GameRegistry.addRecipe(new ItemStack(Trechnocraft.ivoryBoots), new Object[]{
						"   ","I I","I I",
						'I', Trechnocraft.ivoryHorn,
						
					});
					GameRegistry.addRecipe(new ItemStack(Trechnocraft.ivoryPlate), new Object[]{
						"I I","III","III",
						'I', Trechnocraft.ivoryHorn,
						
					});
					GameRegistry.addRecipe(new ItemStack(Trechnocraft.ivoryLeggins), new Object[]{
						"III","I I","I I",
						'I', Trechnocraft.ivoryHorn,
						
					});
					GameRegistry.addRecipe(new ItemStack(Trechnocraft.titaniumShovel), new Object[]{
						" T "," S "," S ",
						'T', Trechnocraft.titaniumIngot,
						'S', Item.stick,
					});
						GameRegistry.addRecipe(new ItemStack(Trechnocraft.bronzeShovel), new Object[]{
							" B "," S "," S ",
							'B', Trechnocraft.bronzeIngot,
							'S', Item.stick,
						});
						GameRegistry.addRecipe(new ItemStack(Trechnocraft.tinShovel), new Object[]{
							" t "," S "," S ",
							't', Trechnocraft.tinIngot,
							'S', Item.stick,
						});
						GameRegistry.addRecipe(new ItemStack(Trechnocraft.copperShovel), new Object[]{
							" C "," S "," S ",
							'C', Trechnocraft.copperIngot,
							'S', Item.stick,
						});
						GameRegistry.addRecipe(new ItemStack(Trechnocraft.steelShovel), new Object[]{
							" s "," S "," S ",
							's', Trechnocraft.steelIngot,
							'S', Item.stick,
						});
						GameRegistry.addRecipe(new ItemStack(Trechnocraft.titaniumSword), new Object[]{
							" T "," T "," S ",
							'T', Trechnocraft.titaniumIngot,
							'S', Item.stick,
						});
							GameRegistry.addRecipe(new ItemStack(Trechnocraft.bronzeSword), new Object[]{
								" B "," B "," S ",
								'B', Trechnocraft.bronzeIngot,
								'S', Item.stick,
							});
							GameRegistry.addRecipe(new ItemStack(Trechnocraft.tinSword), new Object[]{
								" t "," t "," S ",
								't', Trechnocraft.tinIngot,
								'S', Item.stick,
							});
							GameRegistry.addRecipe(new ItemStack(Trechnocraft.copperSword), new Object[]{
								" C "," C "," S ",
								'C', Trechnocraft.copperIngot,
								'S', Item.stick,
							});
							GameRegistry.addRecipe(new ItemStack(Trechnocraft.steelSword), new Object[]{
								" s "," s "," S ",
								's', Trechnocraft.steelIngot,
								'S', Item.stick,
							});	
							GameRegistry.addRecipe(new ItemStack(Trechnocraft.foundryBlock), new Object[]{
								"ccc","cfc","ccc",
								'c', Block.cobblestone,
								'f', Block.furnaceIdle,
							});	
	}
}
	

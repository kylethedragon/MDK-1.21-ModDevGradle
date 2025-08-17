package net.kylereptyle.tutorialmod.item;

import net.kylereptyle.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TutorialMod.MOD_ID);

	public static final DeferredItem<Item> SACRED_EGG = ITEMS.register("sacred_egg",
			() -> new Item(new Item.Properties()));



	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}

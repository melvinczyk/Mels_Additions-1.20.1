package net.melvinczyk.borninspellbooks.registry;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.api.spells.SpellRarity;
import io.redspace.ironsspellbooks.item.spell_books.SimpleAttributeSpellBook;
import net.melvinczyk.borninspellbooks.BornInSpellbooks;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MAItemRegistry {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BornInSpellbooks.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
    public static final RegistryObject<Item> SOAKED_SPELL_BOOK = ITEMS.register("soaked_spell_book", () -> new SimpleAttributeSpellBook(8, SpellRarity.RARE, AttributeRegistry.SPELL_RESIST.get(), -.15, 100));
}

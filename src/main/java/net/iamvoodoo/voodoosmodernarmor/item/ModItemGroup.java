package net.iamvoodoo.voodoosmodernarmor.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.iamvoodoo.voodoosmodernarmor.VoodoosModernArmor;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup VOODOOS_MODERN_ARMOR_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(VoodoosModernArmor.MOD_ID, "voodoos_modern_armor_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.voodoos_modern_armor_group"))
                    .icon(() -> new ItemStack(ModItems.TEMPLATE_ITEM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.TEMPLATE_ITEM);
                    }).build());

    public static void registerItemGroups() {

    }
}

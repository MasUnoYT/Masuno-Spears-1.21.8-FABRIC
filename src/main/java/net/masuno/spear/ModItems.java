package net.masuno.spear;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents.ModifyEntries;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.item.consume.UseAction;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public class ModItems {
   public static final TagKey<Item> SPEARS = TagKey.of(RegistryKeys.ITEM, Identifier.of("spear", "spears"));
   public static final Item NETHERITE_SPEAR = register(
      "netherite_spear",
      new Item.Settings()
         .attributeModifiers(
            AttributeModifiersComponent.builder()
               .add(EntityAttributes.ATTACK_DAMAGE, new EntityAttributeModifier(Item.BASE_ATTACK_DAMAGE_MODIFIER_ID, 7.0, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
               .add(EntityAttributes.ATTACK_SPEED, new EntityAttributeModifier(Item.BASE_ATTACK_SPEED_MODIFIER_ID, -2.2, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
               .add(
                       EntityAttributes.ENTITY_INTERACTION_RANGE,
                  new EntityAttributeModifier(Identifier.ofVanilla("entity_interaction_range"), 1.0, EntityAttributeModifier.Operation.ADD_VALUE),
                  AttributeModifierSlot.MAINHAND
               )
               .build()
         )
         .component(
            DataComponentTypes.CONSUMABLE, ConsumableComponent.builder().consumeSeconds(999999.0F).useAction(UseAction.NONE).consumeParticles(false).build())
              .maxCount(1)
         .maxDamage(2031)
         .fireproof()
   );
   public static final Item DIAMOND_SPEAR = register(
      "diamond_spear",
      new Item.Settings()
              .attributeModifiers(
                      AttributeModifiersComponent.builder()
                              .add(EntityAttributes.ATTACK_DAMAGE, new EntityAttributeModifier(Item.BASE_ATTACK_DAMAGE_MODIFIER_ID, 7.0, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                              .add(EntityAttributes.ATTACK_SPEED, new EntityAttributeModifier(Item.BASE_ATTACK_SPEED_MODIFIER_ID, -2.2, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                              .add(
                                      EntityAttributes.ENTITY_INTERACTION_RANGE,
                                      new EntityAttributeModifier(Identifier.ofVanilla("entity_interaction_range"), 1.0, EntityAttributeModifier.Operation.ADD_VALUE),
                                      AttributeModifierSlot.MAINHAND
                              )
                              .build()
              )
              .component(
                      DataComponentTypes.CONSUMABLE, ConsumableComponent.builder().consumeSeconds(999999.0F).useAction(UseAction.NONE).consumeParticles(false).build())
              .maxCount(1)
              .maxDamage(1561)
   );
   public static final Item IRON_SPEAR = register(
      "iron_spear",
           new Item.Settings()
                   .attributeModifiers(
                           AttributeModifiersComponent.builder()
                                   .add(EntityAttributes.ATTACK_DAMAGE, new EntityAttributeModifier(Item.BASE_ATTACK_DAMAGE_MODIFIER_ID, 7.0, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                                   .add(EntityAttributes.ATTACK_SPEED, new EntityAttributeModifier(Item.BASE_ATTACK_SPEED_MODIFIER_ID, -2.2, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                                   .add(
                                           EntityAttributes.ENTITY_INTERACTION_RANGE,
                                           new EntityAttributeModifier(Identifier.ofVanilla("entity_interaction_range"), 1.0, EntityAttributeModifier.Operation.ADD_VALUE),
                                           AttributeModifierSlot.MAINHAND
                                   )
                                   .build()
                   )
                   .component(
                           DataComponentTypes.CONSUMABLE, ConsumableComponent.builder().consumeSeconds(999999.0F).useAction(UseAction.NONE).consumeParticles(false).build())
                   .maxCount(1)
                   .maxDamage(250)
   );
   public static final Item GOLDEN_SPEAR = register(
      "golden_spear",
           new Item.Settings()
                   .attributeModifiers(
                           AttributeModifiersComponent.builder()
                                   .add(EntityAttributes.ATTACK_DAMAGE, new EntityAttributeModifier(Item.BASE_ATTACK_DAMAGE_MODIFIER_ID, 7.0, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                                   .add(EntityAttributes.ATTACK_SPEED, new EntityAttributeModifier(Item.BASE_ATTACK_SPEED_MODIFIER_ID, -2.2, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                                   .add(
                                           EntityAttributes.ENTITY_INTERACTION_RANGE,
                                           new EntityAttributeModifier(Identifier.ofVanilla("entity_interaction_range"), 1.0, EntityAttributeModifier.Operation.ADD_VALUE),
                                           AttributeModifierSlot.MAINHAND
                                   )
                                   .build()
                   )
                   .component(
                           DataComponentTypes.CONSUMABLE, ConsumableComponent.builder().consumeSeconds(999999.0F).useAction(UseAction.NONE).consumeParticles(false).build())
                   .maxCount(1)
                   .maxDamage(32)
   );
   public static final Item STONE_SPEAR = register(
      "stone_spear",
           new Item.Settings()
                   .attributeModifiers(
                           AttributeModifiersComponent.builder()
                                   .add(EntityAttributes.ATTACK_DAMAGE, new EntityAttributeModifier(Item.BASE_ATTACK_DAMAGE_MODIFIER_ID, 7.0, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                                   .add(EntityAttributes.ATTACK_SPEED, new EntityAttributeModifier(Item.BASE_ATTACK_SPEED_MODIFIER_ID, -2.2, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                                   .add(
                                           EntityAttributes.ENTITY_INTERACTION_RANGE,
                                           new EntityAttributeModifier(Identifier.ofVanilla("entity_interaction_range"), 1.0, EntityAttributeModifier.Operation.ADD_VALUE),
                                           AttributeModifierSlot.MAINHAND
                                   )
                                   .build()
                   )
                   .component(
                           DataComponentTypes.CONSUMABLE, ConsumableComponent.builder().consumeSeconds(999999.0F).useAction(UseAction.NONE).consumeParticles(false).build())
                   .maxCount(1)
                   .maxDamage(131)
   );
   public static final Item WOODEN_SPEAR = register(
      "wooden_spear",
           new Item.Settings()
                   .attributeModifiers(
                           AttributeModifiersComponent.builder()
                                   .add(EntityAttributes.ATTACK_DAMAGE, new EntityAttributeModifier(Item.BASE_ATTACK_DAMAGE_MODIFIER_ID, 7.0, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                                   .add(EntityAttributes.ATTACK_SPEED, new EntityAttributeModifier(Item.BASE_ATTACK_SPEED_MODIFIER_ID, -2.2, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                                   .add(
                                           EntityAttributes.ENTITY_INTERACTION_RANGE,
                                           new EntityAttributeModifier(Identifier.ofVanilla("entity_interaction_range"), 1.0, EntityAttributeModifier.Operation.ADD_VALUE),
                                           AttributeModifierSlot.MAINHAND
                                   )
                                   .build()
                   )
                   .component(
                           DataComponentTypes.CONSUMABLE, ConsumableComponent.builder().consumeSeconds(999999.0F).useAction(UseAction.NONE).consumeParticles(false).build())
                   .maxCount(1)
                   .maxDamage(59)
   );

   public static Item register(String path, Item.Settings settings) {
      RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of("spear", path));
      return Items.register(registryKey, SpearItem::new, settings);
   }

   public static void initialize() {
   }

   public static void itemGroupsEdit() {
      ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((ModifyEntries) content -> content.add(WOODEN_SPEAR));
      ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((ModifyEntries)content -> content.add(STONE_SPEAR));
      ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((ModifyEntries)content -> content.add(GOLDEN_SPEAR));
      ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((ModifyEntries)content -> content.add(IRON_SPEAR));
      ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((ModifyEntries)content -> content.add(DIAMOND_SPEAR));
      ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((ModifyEntries)content -> content.add(NETHERITE_SPEAR));
   }
}

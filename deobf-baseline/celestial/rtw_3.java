package celestial;

import com.google.common.collect.Sets;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.Set;

public class rtw_3 extends rTp_1 {
   private static final Set<String> id_byte = Sets.newHashSet();
   private static final Set<String> id_protected = Sets.newHashSet();
   private static final Set<String> id_throws = Sets.newHashSet();
   private static final Set<String> id_case = Sets.newHashSet();
   private static final Set<String> id_catch = Sets.newHashSet();
   private static final Set<String> id_private = Sets.newHashSet();

   public static Dynamic<?> id_byte(Dynamic<?> var0) {
      return id_byte(var0, "UUID", "UUID").orElse(var0);
   }

   public rtw_3(Schema var1) {
      super(var1, rTC.id_int);
   }

   static {
      id_byte.add("minecraft:donkey");
      id_byte.add("minecraft:horse");
      id_byte.add("minecraft:llama");
      id_byte.add("minecraft:mule");
      id_byte.add("minecraft:skeleton_horse");
      id_byte.add("minecraft:trader_llama");
      id_byte.add("minecraft:zombie_horse");
      id_protected.add("minecraft:cat");
      id_protected.add("minecraft:parrot");
      id_protected.add("minecraft:wolf");
      id_throws.add("minecraft:bee");
      id_throws.add("minecraft:chicken");
      id_throws.add("minecraft:cow");
      id_throws.add("minecraft:fox");
      id_throws.add("minecraft:mooshroom");
      id_throws.add("minecraft:ocelot");
      id_throws.add("minecraft:panda");
      id_throws.add("minecraft:pig");
      id_throws.add("minecraft:polar_bear");
      id_throws.add("minecraft:rabbit");
      id_throws.add("minecraft:sheep");
      id_throws.add("minecraft:turtle");
      id_throws.add("minecraft:hoglin");
      id_case.add("minecraft:bat");
      id_case.add("minecraft:blaze");
      id_case.add("minecraft:cave_spider");
      id_case.add("minecraft:cod");
      id_case.add("minecraft:creeper");
      id_case.add("minecraft:dolphin");
      id_case.add("minecraft:drowned");
      id_case.add("minecraft:elder_guardian");
      id_case.add("minecraft:ender_dragon");
      id_case.add("minecraft:enderman");
      id_case.add("minecraft:endermite");
      id_case.add("minecraft:evoker");
      id_case.add("minecraft:ghast");
      id_case.add("minecraft:giant");
      id_case.add("minecraft:guardian");
      id_case.add("minecraft:husk");
      id_case.add("minecraft:illusioner");
      id_case.add("minecraft:magma_cube");
      id_case.add("minecraft:pufferfish");
      id_case.add("minecraft:zombified_piglin");
      id_case.add("minecraft:salmon");
      id_case.add("minecraft:shulker");
      id_case.add("minecraft:silverfish");
      id_case.add("minecraft:skeleton");
      id_case.add("minecraft:slime");
      id_case.add("minecraft:snow_golem");
      id_case.add("minecraft:spider");
      id_case.add("minecraft:squid");
      id_case.add("minecraft:stray");
      id_case.add("minecraft:tropical_fish");
      id_case.add("minecraft:vex");
      id_case.add("minecraft:villager");
      id_case.add("minecraft:iron_golem");
      id_case.add("minecraft:vindicator");
      id_case.add("minecraft:pillager");
      id_case.add("minecraft:wandering_trader");
      id_case.add("minecraft:witch");
      id_case.add("minecraft:wither");
      id_case.add("minecraft:wither_skeleton");
      id_case.add("minecraft:zombie");
      id_case.add("minecraft:zombie_villager");
      id_case.add("minecraft:phantom");
      id_case.add("minecraft:ravager");
      id_case.add("minecraft:piglin");
      id_catch.add("minecraft:armor_stand");
      id_private.add("minecraft:arrow");
      id_private.add("minecraft:dragon_fireball");
      id_private.add("minecraft:firework_rocket");
      id_private.add("minecraft:fireball");
      id_private.add("minecraft:llama_spit");
      id_private.add("minecraft:small_fireball");
      id_private.add("minecraft:snowball");
      id_private.add("minecraft:spectral_arrow");
      id_private.add("minecraft:egg");
      id_private.add("minecraft:ender_pearl");
      id_private.add("minecraft:experience_bottle");
      id_private.add("minecraft:potion");
      id_private.add("minecraft:trident");
      id_private.add("minecraft:wither_skull");
   }

   public static Dynamic<?> id_break(Dynamic<?> var0) {
      return var0.update(
         "Attributes",
         var1 -> var0.createList(
               var1.asStream()
                  .map(
                     var0xx -> var0xx.update(
                           "Modifiers",
                           var1x -> var0xx.createList(
                                 var1x.asStream().map(var0xxxx -> (Dynamic)id_byte((Dynamic<?>)var0xxxx, "UUID", "UUID").orElse((Dynamic<?>)var0xxxx))
                              )
                        )
                  )
            )
      );
   }

   private static Dynamic<?> id_throws(Dynamic<?> var0) {
      return id_byte(var0, "OwnerUUID", "Owner").orElse(var0);
   }

   private static Dynamic<?> id_finally(Dynamic<?> var0) {
      Optional var1 = var0.get("TrustedUUIDs")
         .result()
         .map(var1x -> var0.createList(var1x.asStream().map(var0xx -> (Dynamic)id_class((Dynamic<?>)var0xx).orElseGet(() -> {
                  id_class.warn("Trusted contained invalid data.");
                  return (Dynamic<?>)var0xx;
               }))));
      return (Dynamic<?>)DataFixUtils.orElse(var1.map(var1x -> var0.remove("TrustedUUIDs").set("Trusted", var1x)), var0);
   }

   private static Dynamic<?> id_catch(Dynamic<?> var0) {
      return id_byte(var0, "OwnerUUID", "Owner").orElse(var0);
   }

   private static Dynamic<?> id_extends(Dynamic<?> var0) {
      return id_class(var0, "HurtBy", "HurtBy").orElse(var0);
   }

   private static Dynamic<?> id_case(Dynamic<?> var0) {
      return id_byte(var0, "ConversionPlayer", "ConversionPlayer").orElse(var0);
   }

   private static Dynamic<?> id_implements(Dynamic<?> var0) {
      var0 = id_break(var0, "Owner", "Owner").orElse(var0);
      return id_break(var0, "Thrower", "Thrower").orElse(var0);
   }

   private static Dynamic<?> id_package(Dynamic<?> var0) {
      return (Dynamic<?>)DataFixUtils.orElse(var0.get("OwnerUUID").result().map(var1 -> var0.remove("OwnerUUID").set("Owner", var1)), var0);
   }

   private static Dynamic<?> id_protected(Dynamic<?> var0) {
      return var0.update(
         "Brain",
         var0x -> var0x.update("memories", var0xx -> var0xx.update("minecraft:angry_at", var0xxx -> id_class(var0xxx, "value", "value").orElseGet(() -> {
                     id_class.warn("angry_at has no value.");
                     return var0xxx;
                  })))
      );
   }

   private static Dynamic<?> id_private(Dynamic<?> var0) {
      var0 = id_break(var0, "Owner", "Owner").orElse(var0);
      return id_break(var0, "Target", "Target").orElse(var0);
   }

   private static Dynamic<?> id_final(Dynamic<?> var0) {
      return id_break(var0).update("Leash", var0x -> id_byte(var0x, "UUID", "UUID").orElse(var0x));
   }

   private static Dynamic<?> id_volatile(Dynamic<?> var0) {
      Dynamic var1 = id_final(var0);
      return id_byte(var1, "LoveCause", "LoveCause").orElse(var1);
   }

   private static Dynamic<?> id_native(Dynamic<?> var0) {
      Dynamic var1 = id_volatile(var0);
      return id_class(var1, "OwnerUUID", "Owner").orElse(var1);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped("EntityUUIDFixes", this.getInputSchema().getType(this.id_break), var1 -> {
         var1 = var1.update(DSL.remainderFinder(), rtw_3::id_byte);

         for (String var3 : id_byte) {
            var1 = this.id_class(var1, var3, rtw_3::id_native);
         }

         for (String var18 : id_protected) {
            var1 = this.id_class(var1, var18, rtw_3::id_native);
         }

         for (String var19 : id_throws) {
            var1 = this.id_class(var1, var19, rtw_3::id_volatile);
         }

         for (String var20 : id_case) {
            var1 = this.id_class(var1, var20, rtw_3::id_final);
         }

         for (String var21 : id_catch) {
            var1 = this.id_class(var1, var21, rtw_3::id_break);
         }

         for (String var22 : id_private) {
            var1 = this.id_class(var1, var22, rtw_3::id_package);
         }

         var1 = this.id_class(var1, "minecraft:bee", rtw_3::id_extends);
         var1 = this.id_class(var1, "minecraft:zombified_piglin", rtw_3::id_extends);
         var1 = this.id_class(var1, "minecraft:fox", rtw_3::id_finally);
         var1 = this.id_class(var1, "minecraft:item", rtw_3::id_implements);
         var1 = this.id_class(var1, "minecraft:shulker_bullet", rtw_3::id_private);
         var1 = this.id_class(var1, "minecraft:area_effect_cloud", rtw_3::id_catch);
         var1 = this.id_class(var1, "minecraft:zombie_villager", rtw_3::id_case);
         var1 = this.id_class(var1, "minecraft:evoker_fangs", rtw_3::id_throws);
         return this.id_class(var1, "minecraft:piglin", rtw_3::id_protected);
      });
   }
}

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
   private static final Set<String> byte_ = Sets.newHashSet();
   private static final Set<String> protected_ = Sets.newHashSet();
   private static final Set<String> throws_ = Sets.newHashSet();
   private static final Set<String> case_ = Sets.newHashSet();
   private static final Set<String> catch_ = Sets.newHashSet();
   private static final Set<String> private_ = Sets.newHashSet();

   public static Dynamic<?> byte_(Dynamic<?> var0) {
      return byte_(var0, "UUID", "UUID").orElse(var0);
   }

   public rtw_3(Schema var1) {
      super(var1, rTC.int_);
   }

   static {
      byte_.add("minecraft:donkey");
      byte_.add("minecraft:horse");
      byte_.add("minecraft:llama");
      byte_.add("minecraft:mule");
      byte_.add("minecraft:skeleton_horse");
      byte_.add("minecraft:trader_llama");
      byte_.add("minecraft:zombie_horse");
      protected_.add("minecraft:cat");
      protected_.add("minecraft:parrot");
      protected_.add("minecraft:wolf");
      throws_.add("minecraft:bee");
      throws_.add("minecraft:chicken");
      throws_.add("minecraft:cow");
      throws_.add("minecraft:fox");
      throws_.add("minecraft:mooshroom");
      throws_.add("minecraft:ocelot");
      throws_.add("minecraft:panda");
      throws_.add("minecraft:pig");
      throws_.add("minecraft:polar_bear");
      throws_.add("minecraft:rabbit");
      throws_.add("minecraft:sheep");
      throws_.add("minecraft:turtle");
      throws_.add("minecraft:hoglin");
      case_.add("minecraft:bat");
      case_.add("minecraft:blaze");
      case_.add("minecraft:cave_spider");
      case_.add("minecraft:cod");
      case_.add("minecraft:creeper");
      case_.add("minecraft:dolphin");
      case_.add("minecraft:drowned");
      case_.add("minecraft:elder_guardian");
      case_.add("minecraft:ender_dragon");
      case_.add("minecraft:enderman");
      case_.add("minecraft:endermite");
      case_.add("minecraft:evoker");
      case_.add("minecraft:ghast");
      case_.add("minecraft:giant");
      case_.add("minecraft:guardian");
      case_.add("minecraft:husk");
      case_.add("minecraft:illusioner");
      case_.add("minecraft:magma_cube");
      case_.add("minecraft:pufferfish");
      case_.add("minecraft:zombified_piglin");
      case_.add("minecraft:salmon");
      case_.add("minecraft:shulker");
      case_.add("minecraft:silverfish");
      case_.add("minecraft:skeleton");
      case_.add("minecraft:slime");
      case_.add("minecraft:snow_golem");
      case_.add("minecraft:spider");
      case_.add("minecraft:squid");
      case_.add("minecraft:stray");
      case_.add("minecraft:tropical_fish");
      case_.add("minecraft:vex");
      case_.add("minecraft:villager");
      case_.add("minecraft:iron_golem");
      case_.add("minecraft:vindicator");
      case_.add("minecraft:pillager");
      case_.add("minecraft:wandering_trader");
      case_.add("minecraft:witch");
      case_.add("minecraft:wither");
      case_.add("minecraft:wither_skeleton");
      case_.add("minecraft:zombie");
      case_.add("minecraft:zombie_villager");
      case_.add("minecraft:phantom");
      case_.add("minecraft:ravager");
      case_.add("minecraft:piglin");
      catch_.add("minecraft:armor_stand");
      private_.add("minecraft:arrow");
      private_.add("minecraft:dragon_fireball");
      private_.add("minecraft:firework_rocket");
      private_.add("minecraft:fireball");
      private_.add("minecraft:llama_spit");
      private_.add("minecraft:small_fireball");
      private_.add("minecraft:snowball");
      private_.add("minecraft:spectral_arrow");
      private_.add("minecraft:egg");
      private_.add("minecraft:ender_pearl");
      private_.add("minecraft:experience_bottle");
      private_.add("minecraft:potion");
      private_.add("minecraft:trident");
      private_.add("minecraft:wither_skull");
   }

   public static Dynamic<?> break_(Dynamic<?> var0) {
      return var0.update(
         "Attributes",
         var1 -> var0.createList(
               var1.asStream()
                  .map(
                     var0xx -> var0xx.update(
                           "Modifiers",
                           var1x -> var0xx.createList(
                                 var1x.asStream().map(var0xxxx -> (Dynamic)byte_((Dynamic<?>)var0xxxx, "UUID", "UUID").orElse((Dynamic<?>)var0xxxx))
                              )
                        )
                  )
            )
      );
   }

   private static Dynamic<?> throws_(Dynamic<?> var0) {
      return byte_(var0, "OwnerUUID", "Owner").orElse(var0);
   }

   private static Dynamic<?> finally_(Dynamic<?> var0) {
      Optional var1 = var0.get("TrustedUUIDs")
         .result()
         .map(var1x -> var0.createList(var1x.asStream().map(var0xx -> (Dynamic)class_((Dynamic<?>)var0xx).orElseGet(() -> {
                  class_.warn("Trusted contained invalid data.");
                  return (Dynamic<?>)var0xx;
               }))));
      return (Dynamic<?>)DataFixUtils.orElse(var1.map(var1x -> var0.remove("TrustedUUIDs").set("Trusted", var1x)), var0);
   }

   private static Dynamic<?> catch_(Dynamic<?> var0) {
      return byte_(var0, "OwnerUUID", "Owner").orElse(var0);
   }

   private static Dynamic<?> extends_(Dynamic<?> var0) {
      return class_(var0, "HurtBy", "HurtBy").orElse(var0);
   }

   private static Dynamic<?> case_(Dynamic<?> var0) {
      return byte_(var0, "ConversionPlayer", "ConversionPlayer").orElse(var0);
   }

   private static Dynamic<?> implements_(Dynamic<?> var0) {
      var0 = break_(var0, "Owner", "Owner").orElse(var0);
      return break_(var0, "Thrower", "Thrower").orElse(var0);
   }

   private static Dynamic<?> package_(Dynamic<?> var0) {
      return (Dynamic<?>)DataFixUtils.orElse(var0.get("OwnerUUID").result().map(var1 -> var0.remove("OwnerUUID").set("Owner", var1)), var0);
   }

   private static Dynamic<?> protected_(Dynamic<?> var0) {
      return var0.update(
         "Brain",
         var0x -> var0x.update("memories", var0xx -> var0xx.update("minecraft:angry_at", var0xxx -> class_(var0xxx, "value", "value").orElseGet(() -> {
                     class_.warn("angry_at has no value.");
                     return var0xxx;
                  })))
      );
   }

   private static Dynamic<?> private_(Dynamic<?> var0) {
      var0 = break_(var0, "Owner", "Owner").orElse(var0);
      return break_(var0, "Target", "Target").orElse(var0);
   }

   private static Dynamic<?> final_(Dynamic<?> var0) {
      return break_(var0).update("Leash", var0x -> byte_(var0x, "UUID", "UUID").orElse(var0x));
   }

   private static Dynamic<?> volatile_(Dynamic<?> var0) {
      Dynamic var1 = final_(var0);
      return byte_(var1, "LoveCause", "LoveCause").orElse(var1);
   }

   private static Dynamic<?> native_(Dynamic<?> var0) {
      Dynamic var1 = volatile_(var0);
      return class_(var1, "OwnerUUID", "Owner").orElse(var1);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped("EntityUUIDFixes", this.getInputSchema().getType(this.break_), var1 -> {
         var1 = var1.update(DSL.remainderFinder(), rtw_3::byte_);

         for (String var3 : byte_) {
            var1 = this.class_(var1, var3, rtw_3::native_);
         }

         for (String var18 : protected_) {
            var1 = this.class_(var1, var18, rtw_3::native_);
         }

         for (String var19 : throws_) {
            var1 = this.class_(var1, var19, rtw_3::volatile_);
         }

         for (String var20 : case_) {
            var1 = this.class_(var1, var20, rtw_3::final_);
         }

         for (String var21 : catch_) {
            var1 = this.class_(var1, var21, rtw_3::break_);
         }

         for (String var22 : private_) {
            var1 = this.class_(var1, var22, rtw_3::package_);
         }

         var1 = this.class_(var1, "minecraft:bee", rtw_3::extends_);
         var1 = this.class_(var1, "minecraft:zombified_piglin", rtw_3::extends_);
         var1 = this.class_(var1, "minecraft:fox", rtw_3::finally_);
         var1 = this.class_(var1, "minecraft:item", rtw_3::implements_);
         var1 = this.class_(var1, "minecraft:shulker_bullet", rtw_3::private_);
         var1 = this.class_(var1, "minecraft:area_effect_cloud", rtw_3::catch_);
         var1 = this.class_(var1, "minecraft:zombie_villager", rtw_3::case_);
         var1 = this.class_(var1, "minecraft:evoker_fangs", rtw_3::throws_);
         return this.class_(var1, "minecraft:piglin", rtw_3::protected_);
      });
   }
}

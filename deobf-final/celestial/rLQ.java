package celestial;

import com.mojang.serialization.Codec;
import java.util.function.Function;

public class rLQ {
   public static final rLO class_ = class_("ambient_entity_effect", false);
   public static final rLO break_ = class_("angry_villager", false);
   public static final rLO byte_ = class_("barrier", false);
   public static final rLz_1<rLX> protected_ = class_("block", rLX.class_, rLX::class_);
   public static final rLO throws_ = class_("bubble", false);
   public static final rLO case_ = class_("cloud", false);
   public static final rLO catch_ = class_("crit", false);
   public static final rLO private_ = class_("damage_indicator", true);
   public static final rLO implements_ = class_("dragon_breath", false);
   public static final rLO finally_ = class_("dripping_lava", false);
   public static final rLO extends_ = class_("falling_lava", false);
   public static final rLO native_ = class_("landing_lava", false);
   public static final rLO volatile_ = class_("dripping_water", false);
   public static final rLO final_ = class_("falling_water", false);
   public static final rLz_1<rLc_1> package_ = class_("dust", rLc_1.byte_, var0 -> rLc_1.break_);
   public static final rLO int_ = class_("effect", false);
   public static final rLO new_ = class_("elder_guardian", true);
   public static final rLO continue_ = class_("enchanted_hit", false);
   public static final rLO super_ = class_("enchant", false);
   public static final rLO this_ = class_("end_rod", false);
   public static final rLO else_ = class_("entity_effect", false);
   public static final rLO synchronized_ = class_("explosion_emitter", true);
   public static final rLO return_ = class_("explosion", true);
   public static final rLz_1<rLX> public_ = class_("falling_dust", rLX.class_, rLX::class_);
   public static final rLO goto_ = class_("firework", false);
   public static final rLO while_ = class_("fishing", false);
   public static final rLO try_ = class_("flame", false);
   public static final rLO instanceof_ = class_("soul_fire_flame", false);
   public static final rLO throw_ = class_("soul", false);
   public static final rLO interface_ = class_("flash", false);
   public static final rLO char_ = class_("happy_villager", false);
   public static final rLO abstract_ = class_("composter", false);
   public static final rLO long_ = class_("heart", false);
   public static final rLO float_ = class_("instant_effect", false);
   public static final rLz_1<rLk_1> void_ = class_("item", rLk_1.class_, rLk_1::class_);
   public static final rLO static_ = class_("item_slime", false);
   public static final rLO import_ = class_("item_snowball", false);
   public static final rLO short_ = class_("large_smoke", false);
   public static final rLO default_ = class_("lava", false);
   public static final rLO const_ = class_("mycelium", false);
   public static final rLO strictfp_ = class_("note", false);
   public static final rLO boolean_ = class_("poof", true);
   public static final rLO transient_ = class_("portal", false);
   public static final rLO for_ = class_("rain", false);
   public static final rLO double_ = class_("smoke", false);
   public static final rLO switch_ = class_("sneeze", false);
   public static final rLO r = class_("spit", true);
   public static final rLO P = class_("squid_ink", true);
   public static final rLO B = class_("sweep_attack", true);
   public static final rLO S = class_("totem_of_undying", false);
   public static final rLO s = class_("underwater", false);
   public static final rLO E = class_("splash", false);
   public static final rLO G = class_("witch", false);
   public static final rLO b = class_("bubble_pop", false);
   public static final rLO M = class_("current_down", false);
   public static final rLO O = class_("bubble_column_up", false);
   public static final rLO h = class_("nautilus", false);
   public static final rLO X = class_("dolphin", false);
   public static final rLO J = class_("campfire_cosy_smoke", true);
   public static final rLO x = class_("campfire_signal_smoke", true);
   public static final rLO d = class_("dripping_honey", false);
   public static final rLO k = class_("falling_honey", false);
   public static final rLO W = class_("landing_honey", false);
   public static final rLO z = class_("falling_nectar", false);
   public static final rLO Q = class_("ash", false);
   public static final rLO N = class_("crimson_spore", false);
   public static final rLO c = class_("warped_spore", false);
   public static final rLO u = class_("dripping_obsidian_tear", false);
   public static final rLO m = class_("falling_obsidian_tear", false);
   public static final rLO Z = class_("landing_obsidian_tear", false);
   public static final rLO v = class_("reverse_portal", false);
   public static final rLO F = class_("white_ash", false);
   public static final Codec<rLx_1> L = rVL.switch_.dispatch("type", rLx_1::protected_, rLz_1::break_);

   private static rLO class_(String var0, boolean var1) {
      return rVL.class_(rVL.switch_, var0, new rLO(var1));
   }

   private static <T extends rLx_1> rLz_1<T> class_(String var0, rLd_1<T> var1, Function<rLz_1<T>, Codec<T>> var2) {
      return rVL.class_(rVL.switch_, var0, new rLN(false, var1, var2));
   }
}

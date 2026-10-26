package celestial;

import com.mojang.serialization.Codec;
import java.util.function.Function;

public class rLQ {
   public static final rLO id_class = id_class("ambient_entity_effect", false);
   public static final rLO id_break = id_class("angry_villager", false);
   public static final rLO id_byte = id_class("barrier", false);
   public static final rLz_1<rLX> id_protected = id_class("block", rLX.id_class, rLX::id_class);
   public static final rLO id_throws = id_class("bubble", false);
   public static final rLO id_case = id_class("cloud", false);
   public static final rLO id_catch = id_class("crit", false);
   public static final rLO id_private = id_class("damage_indicator", true);
   public static final rLO id_implements = id_class("dragon_breath", false);
   public static final rLO id_finally = id_class("dripping_lava", false);
   public static final rLO id_extends = id_class("falling_lava", false);
   public static final rLO id_native = id_class("landing_lava", false);
   public static final rLO id_volatile = id_class("dripping_water", false);
   public static final rLO id_final = id_class("falling_water", false);
   public static final rLz_1<rLc_1> id_package = id_class("dust", rLc_1.id_byte, var0 -> rLc_1.id_break);
   public static final rLO id_int = id_class("effect", false);
   public static final rLO id_new = id_class("elder_guardian", true);
   public static final rLO id_continue = id_class("enchanted_hit", false);
   public static final rLO id_super = id_class("enchant", false);
   public static final rLO id_this = id_class("end_rod", false);
   public static final rLO id_else = id_class("entity_effect", false);
   public static final rLO id_synchronized = id_class("explosion_emitter", true);
   public static final rLO id_return = id_class("explosion", true);
   public static final rLz_1<rLX> id_public = id_class("falling_dust", rLX.id_class, rLX::id_class);
   public static final rLO id_goto = id_class("firework", false);
   public static final rLO id_while = id_class("fishing", false);
   public static final rLO id_try = id_class("flame", false);
   public static final rLO id_instanceof = id_class("soul_fire_flame", false);
   public static final rLO id_throw = id_class("soul", false);
   public static final rLO id_interface = id_class("flash", false);
   public static final rLO id_char = id_class("happy_villager", false);
   public static final rLO id_abstract = id_class("composter", false);
   public static final rLO id_long = id_class("heart", false);
   public static final rLO id_float = id_class("instant_effect", false);
   public static final rLz_1<rLk_1> id_void = id_class("item", rLk_1.id_class, rLk_1::id_class);
   public static final rLO id_static = id_class("item_slime", false);
   public static final rLO id_import = id_class("item_snowball", false);
   public static final rLO id_short = id_class("large_smoke", false);
   public static final rLO id_default = id_class("lava", false);
   public static final rLO id_const = id_class("mycelium", false);
   public static final rLO id_strictfp = id_class("note", false);
   public static final rLO id_boolean = id_class("poof", true);
   public static final rLO id_transient = id_class("portal", false);
   public static final rLO id_for = id_class("rain", false);
   public static final rLO id_double = id_class("smoke", false);
   public static final rLO id_switch = id_class("sneeze", false);
   public static final rLO r = id_class("spit", true);
   public static final rLO P = id_class("squid_ink", true);
   public static final rLO B = id_class("sweep_attack", true);
   public static final rLO S = id_class("totem_of_undying", false);
   public static final rLO s = id_class("underwater", false);
   public static final rLO E = id_class("splash", false);
   public static final rLO G = id_class("witch", false);
   public static final rLO b = id_class("bubble_pop", false);
   public static final rLO M = id_class("current_down", false);
   public static final rLO O = id_class("bubble_column_up", false);
   public static final rLO h = id_class("nautilus", false);
   public static final rLO X = id_class("dolphin", false);
   public static final rLO J = id_class("campfire_cosy_smoke", true);
   public static final rLO x = id_class("campfire_signal_smoke", true);
   public static final rLO d = id_class("dripping_honey", false);
   public static final rLO k = id_class("falling_honey", false);
   public static final rLO W = id_class("landing_honey", false);
   public static final rLO z = id_class("falling_nectar", false);
   public static final rLO Q = id_class("ash", false);
   public static final rLO N = id_class("crimson_spore", false);
   public static final rLO c = id_class("warped_spore", false);
   public static final rLO u = id_class("dripping_obsidian_tear", false);
   public static final rLO m = id_class("falling_obsidian_tear", false);
   public static final rLO Z = id_class("landing_obsidian_tear", false);
   public static final rLO v = id_class("reverse_portal", false);
   public static final rLO F = id_class("white_ash", false);
   public static final Codec<rLx_1> L = rVL.id_switch.dispatch("type", rLx_1::id_protected, rLz_1::id_break);

   private static rLO id_class(String var0, boolean var1) {
      return rVL.id_class(rVL.id_switch, var0, new rLO(var1));
   }

   private static <T extends rLx_1> rLz_1<T> id_class(String var0, rLd_1<T> var1, Function<rLz_1<T>, Codec<T>> var2) {
      return rVL.id_class(rVL.id_switch, var0, new rLN(false, var1, var2));
   }
}

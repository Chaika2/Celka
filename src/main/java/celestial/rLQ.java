/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rLN;
import celestial.rLO;
import celestial.rLX;
import celestial.rLc_1;
import celestial.rLd_1;
import celestial.rLk_1;
import celestial.rLx_1;
import celestial.rLz_1;
import celestial.rVL;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public class rLQ {
    public static final rLO id_class = rLQ.id_class("ambient_entity_effect", false);
    public static final rLO id_break = rLQ.id_class("angry_villager", false);
    public static final rLO id_byte = rLQ.id_class("barrier", false);
    public static final rLz_1<rLX> id_protected = rLQ.id_class("block", rLX.id_class, rLX::id_class);
    public static final rLO id_throws = rLQ.id_class("bubble", false);
    public static final rLO id_case = rLQ.id_class("cloud", false);
    public static final rLO id_catch = rLQ.id_class("crit", false);
    public static final rLO id_private = rLQ.id_class("damage_indicator", true);
    public static final rLO id_implements = rLQ.id_class("dragon_breath", false);
    public static final rLO id_finally = rLQ.id_class("dripping_lava", false);
    public static final rLO id_extends = rLQ.id_class("falling_lava", false);
    public static final rLO id_native = rLQ.id_class("landing_lava", false);
    public static final rLO id_volatile = rLQ.id_class("dripping_water", false);
    public static final rLO id_final = rLQ.id_class("falling_water", false);
    public static final rLz_1<rLc_1> id_package = rLQ.id_class("dust", rLc_1.id_byte, rLz_12 -> rLc_1.id_break);
    public static final rLO id_int = rLQ.id_class("effect", false);
    public static final rLO id_new = rLQ.id_class("elder_guardian", true);
    public static final rLO id_continue = rLQ.id_class("enchanted_hit", false);
    public static final rLO id_super = rLQ.id_class("enchant", false);
    public static final rLO id_this = rLQ.id_class("end_rod", false);
    public static final rLO id_else = rLQ.id_class("entity_effect", false);
    public static final rLO id_synchronized = rLQ.id_class("explosion_emitter", true);
    public static final rLO id_return = rLQ.id_class("explosion", true);
    public static final rLz_1<rLX> id_public = rLQ.id_class("falling_dust", rLX.id_class, rLX::id_class);
    public static final rLO id_goto = rLQ.id_class("firework", false);
    public static final rLO id_while = rLQ.id_class("fishing", false);
    public static final rLO id_try = rLQ.id_class("flame", false);
    public static final rLO id_instanceof = rLQ.id_class("soul_fire_flame", false);
    public static final rLO id_throw = rLQ.id_class("soul", false);
    public static final rLO id_interface = rLQ.id_class("flash", false);
    public static final rLO id_char = rLQ.id_class("happy_villager", false);
    public static final rLO id_abstract = rLQ.id_class("composter", false);
    public static final rLO id_long = rLQ.id_class("heart", false);
    public static final rLO id_float = rLQ.id_class("instant_effect", false);
    public static final rLz_1<rLk_1> id_void = rLQ.id_class("item", rLk_1.id_class, rLk_1::id_class);
    public static final rLO id_static = rLQ.id_class("item_slime", false);
    public static final rLO id_import = rLQ.id_class("item_snowball", false);
    public static final rLO id_short = rLQ.id_class("large_smoke", false);
    public static final rLO id_default = rLQ.id_class("lava", false);
    public static final rLO id_const = rLQ.id_class("mycelium", false);
    public static final rLO id_strictfp = rLQ.id_class("note", false);
    public static final rLO id_boolean = rLQ.id_class("poof", true);
    public static final rLO id_transient = rLQ.id_class("portal", false);
    public static final rLO id_for = rLQ.id_class("rain", false);
    public static final rLO id_double = rLQ.id_class("smoke", false);
    public static final rLO id_switch = rLQ.id_class("sneeze", false);
    public static final rLO r = rLQ.id_class("spit", true);
    public static final rLO P = rLQ.id_class("squid_ink", true);
    public static final rLO B = rLQ.id_class("sweep_attack", true);
    public static final rLO S = rLQ.id_class("totem_of_undying", false);
    public static final rLO s = rLQ.id_class("underwater", false);
    public static final rLO E = rLQ.id_class("splash", false);
    public static final rLO G = rLQ.id_class("witch", false);
    public static final rLO b = rLQ.id_class("bubble_pop", false);
    public static final rLO M = rLQ.id_class("current_down", false);
    public static final rLO O = rLQ.id_class("bubble_column_up", false);
    public static final rLO h = rLQ.id_class("nautilus", false);
    public static final rLO X = rLQ.id_class("dolphin", false);
    public static final rLO J = rLQ.id_class("campfire_cosy_smoke", true);
    public static final rLO x = rLQ.id_class("campfire_signal_smoke", true);
    public static final rLO d = rLQ.id_class("dripping_honey", false);
    public static final rLO k = rLQ.id_class("falling_honey", false);
    public static final rLO W = rLQ.id_class("landing_honey", false);
    public static final rLO z = rLQ.id_class("falling_nectar", false);
    public static final rLO Q = rLQ.id_class("ash", false);
    public static final rLO N = rLQ.id_class("crimson_spore", false);
    public static final rLO c = rLQ.id_class("warped_spore", false);
    public static final rLO u = rLQ.id_class("dripping_obsidian_tear", false);
    public static final rLO m = rLQ.id_class("falling_obsidian_tear", false);
    public static final rLO Z = rLQ.id_class("landing_obsidian_tear", false);
    public static final rLO v = rLQ.id_class("reverse_portal", false);
    public static final rLO F = rLQ.id_class("white_ash", false);
    public static final Codec<rLx_1> L = rVL.id_switch.dispatch("type", rLx_1::id_protected, rLz_1::id_break);

    private static rLO id_class(String string, boolean bl) {
        return rVL.id_class(rVL.id_switch, string, new rLO(bl));
    }

    private static <T extends rLx_1> rLz_1<T> id_class(String string, rLd_1<T> rLd_12, Function<rLz_1<T>, Codec<T>> function) {
        return rVL.id_class(rVL.id_switch, string, new rLN(false, rLd_12, function));
    }
}


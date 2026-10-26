/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rLD;
import celestial.rLY;
import celestial.rLi_1;
import celestial.rVL;

public class rAS {
    public static final rLi_1 id_class = rAS.id_class("empty", new rLi_1(new rLY[0]));
    public static final rLi_1 id_break = rAS.id_class("water", new rLi_1(new rLY[0]));
    public static final rLi_1 id_byte = rAS.id_class("mundane", new rLi_1(new rLY[0]));
    public static final rLi_1 id_protected = rAS.id_class("thick", new rLi_1(new rLY[0]));
    public static final rLi_1 id_throws = rAS.id_class("awkward", new rLi_1(new rLY[0]));
    public static final rLi_1 id_case = rAS.id_class("night_vision", new rLi_1(new rLY(rLD.id_int, 3600)));
    public static final rLi_1 id_catch = rAS.id_class("long_night_vision", new rLi_1("night_vision", new rLY(rLD.id_int, 9600)));
    public static final rLi_1 id_private = rAS.id_class("invisibility", new rLi_1(new rLY(rLD.id_final, 3600)));
    public static final rLi_1 id_implements = rAS.id_class("long_invisibility", new rLi_1("invisibility", new rLY(rLD.id_final, 9600)));
    public static final rLi_1 id_finally = rAS.id_class("leaping", new rLi_1(new rLY(rLD.id_private, 3600)));
    public static final rLi_1 id_extends = rAS.id_class("long_leaping", new rLi_1("leaping", new rLY(rLD.id_private, 9600)));
    public static final rLi_1 id_native = rAS.id_class("strong_leaping", new rLi_1("leaping", new rLY(rLD.id_private, 1800, 1)));
    public static final rLi_1 id_volatile = rAS.id_class("fire_resistance", new rLi_1(new rLY(rLD.id_native, 3600)));
    public static final rLi_1 id_final = rAS.id_class("long_fire_resistance", new rLi_1("fire_resistance", new rLY(rLD.id_native, 9600)));
    public static final rLi_1 id_package = rAS.id_class("swiftness", new rLi_1(new rLY(rLD.id_class, 3600)));
    public static final rLi_1 id_int = rAS.id_class("long_swiftness", new rLi_1("swiftness", new rLY(rLD.id_class, 9600)));
    public static final rLi_1 id_new = rAS.id_class("strong_swiftness", new rLi_1("swiftness", new rLY(rLD.id_class, 1800, 1)));
    public static final rLi_1 id_continue = rAS.id_class("slowness", new rLi_1(new rLY(rLD.id_break, 1800)));
    public static final rLi_1 id_super = rAS.id_class("long_slowness", new rLi_1("slowness", new rLY(rLD.id_break, 4800)));
    public static final rLi_1 id_this = rAS.id_class("strong_slowness", new rLi_1("slowness", new rLY(rLD.id_break, 400, 3)));
    public static final rLi_1 id_else = rAS.id_class("turtle_master", new rLi_1("turtle_master", new rLY(rLD.id_break, 400, 3), new rLY(rLD.id_extends, 400, 2)));
    public static final rLi_1 id_synchronized = rAS.id_class("long_turtle_master", new rLi_1("turtle_master", new rLY(rLD.id_break, 800, 3), new rLY(rLD.id_extends, 800, 2)));
    public static final rLi_1 id_return = rAS.id_class("strong_turtle_master", new rLi_1("turtle_master", new rLY(rLD.id_break, 400, 5), new rLY(rLD.id_extends, 400, 3)));
    public static final rLi_1 id_public = rAS.id_class("water_breathing", new rLi_1(new rLY(rLD.id_volatile, 3600)));
    public static final rLi_1 id_goto = rAS.id_class("long_water_breathing", new rLi_1("water_breathing", new rLY(rLD.id_volatile, 9600)));
    public static final rLi_1 id_while = rAS.id_class("healing", new rLi_1(new rLY(rLD.id_case, 1)));
    public static final rLi_1 id_try = rAS.id_class("strong_healing", new rLi_1("healing", new rLY(rLD.id_case, 1, 1)));
    public static final rLi_1 id_instanceof = rAS.id_class("harming", new rLi_1(new rLY(rLD.id_catch, 1)));
    public static final rLi_1 id_throw = rAS.id_class("strong_harming", new rLi_1("harming", new rLY(rLD.id_catch, 1, 1)));
    public static final rLi_1 id_interface = rAS.id_class("poison", new rLi_1(new rLY(rLD.id_super, 900)));
    public static final rLi_1 id_char = rAS.id_class("long_poison", new rLi_1("poison", new rLY(rLD.id_super, 1800)));
    public static final rLi_1 id_abstract = rAS.id_class("strong_poison", new rLi_1("poison", new rLY(rLD.id_super, 432, 1)));
    public static final rLi_1 id_long = rAS.id_class("regeneration", new rLi_1(new rLY(rLD.id_finally, 900)));
    public static final rLi_1 id_float = rAS.id_class("long_regeneration", new rLi_1("regeneration", new rLY(rLD.id_finally, 1800)));
    public static final rLi_1 id_void = rAS.id_class("strong_regeneration", new rLi_1("regeneration", new rLY(rLD.id_finally, 450, 1)));
    public static final rLi_1 id_static = rAS.id_class("strength", new rLi_1(new rLY(rLD.id_throws, 3600)));
    public static final rLi_1 id_import = rAS.id_class("long_strength", new rLi_1("strength", new rLY(rLD.id_throws, 9600)));
    public static final rLi_1 id_short = rAS.id_class("strong_strength", new rLi_1("strength", new rLY(rLD.id_throws, 1800, 1)));
    public static final rLi_1 id_default = rAS.id_class("weakness", new rLi_1(new rLY(rLD.id_continue, 1800)));
    public static final rLi_1 id_const = rAS.id_class("long_weakness", new rLi_1("weakness", new rLY(rLD.id_continue, 4800)));
    public static final rLi_1 id_strictfp = rAS.id_class("luck", new rLi_1("luck", new rLY(rLD.id_while, 6000)));
    public static final rLi_1 id_boolean = rAS.id_class("slow_falling", new rLi_1(new rLY(rLD.id_instanceof, 1800)));
    public static final rLi_1 id_transient = rAS.id_class("long_slow_falling", new rLi_1("slow_falling", new rLY(rLD.id_instanceof, 4800)));

    private static rLi_1 id_class(String string, rLi_1 rLi_12) {
        return rVL.id_class(rVL.id_double, string, rLi_12);
    }
}


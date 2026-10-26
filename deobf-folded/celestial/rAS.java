package celestial;

public class rAS {
   public static final rLi_1 id_class = id_class("empty", new rLi_1());
   public static final rLi_1 id_break = id_class("water", new rLi_1());
   public static final rLi_1 id_byte = id_class("mundane", new rLi_1());
   public static final rLi_1 id_protected = id_class("thick", new rLi_1());
   public static final rLi_1 id_throws = id_class("awkward", new rLi_1());
   public static final rLi_1 id_case = id_class("night_vision", new rLi_1(new rLY(rLD.id_int, 3600)));
   public static final rLi_1 id_catch = id_class("long_night_vision", new rLi_1("night_vision", new rLY(rLD.id_int, 9600)));
   public static final rLi_1 id_private = id_class("invisibility", new rLi_1(new rLY(rLD.id_final, 3600)));
   public static final rLi_1 id_implements = id_class("long_invisibility", new rLi_1("invisibility", new rLY(rLD.id_final, 9600)));
   public static final rLi_1 id_finally = id_class("leaping", new rLi_1(new rLY(rLD.id_private, 3600)));
   public static final rLi_1 id_extends = id_class("long_leaping", new rLi_1("leaping", new rLY(rLD.id_private, 9600)));
   public static final rLi_1 id_native = id_class("strong_leaping", new rLi_1("leaping", new rLY(rLD.id_private, 1800, 1)));
   public static final rLi_1 id_volatile = id_class("fire_resistance", new rLi_1(new rLY(rLD.id_native, 3600)));
   public static final rLi_1 id_final = id_class("long_fire_resistance", new rLi_1("fire_resistance", new rLY(rLD.id_native, 9600)));
   public static final rLi_1 id_package = id_class("swiftness", new rLi_1(new rLY(rLD.id_class, 3600)));
   public static final rLi_1 id_int = id_class("long_swiftness", new rLi_1("swiftness", new rLY(rLD.id_class, 9600)));
   public static final rLi_1 id_new = id_class("strong_swiftness", new rLi_1("swiftness", new rLY(rLD.id_class, 1800, 1)));
   public static final rLi_1 id_continue = id_class("slowness", new rLi_1(new rLY(rLD.id_break, 1800)));
   public static final rLi_1 id_super = id_class("long_slowness", new rLi_1("slowness", new rLY(rLD.id_break, 4800)));
   public static final rLi_1 id_this = id_class("strong_slowness", new rLi_1("slowness", new rLY(rLD.id_break, 400, 3)));
   public static final rLi_1 id_else = id_class("turtle_master", new rLi_1("turtle_master", new rLY(rLD.id_break, 400, 3), new rLY(rLD.id_extends, 400, 2)));
   public static final rLi_1 id_synchronized = id_class(
      "long_turtle_master", new rLi_1("turtle_master", new rLY(rLD.id_break, 800, 3), new rLY(rLD.id_extends, 800, 2))
   );
   public static final rLi_1 id_return = id_class(
      "strong_turtle_master", new rLi_1("turtle_master", new rLY(rLD.id_break, 400, 5), new rLY(rLD.id_extends, 400, 3))
   );
   public static final rLi_1 id_public = id_class("water_breathing", new rLi_1(new rLY(rLD.id_volatile, 3600)));
   public static final rLi_1 id_goto = id_class("long_water_breathing", new rLi_1("water_breathing", new rLY(rLD.id_volatile, 9600)));
   public static final rLi_1 id_while = id_class("healing", new rLi_1(new rLY(rLD.id_case, 1)));
   public static final rLi_1 id_try = id_class("strong_healing", new rLi_1("healing", new rLY(rLD.id_case, 1, 1)));
   public static final rLi_1 id_instanceof = id_class("harming", new rLi_1(new rLY(rLD.id_catch, 1)));
   public static final rLi_1 id_throw = id_class("strong_harming", new rLi_1("harming", new rLY(rLD.id_catch, 1, 1)));
   public static final rLi_1 id_interface = id_class("poison", new rLi_1(new rLY(rLD.id_super, 900)));
   public static final rLi_1 id_char = id_class("long_poison", new rLi_1("poison", new rLY(rLD.id_super, 1800)));
   public static final rLi_1 id_abstract = id_class("strong_poison", new rLi_1("poison", new rLY(rLD.id_super, 432, 1)));
   public static final rLi_1 id_long = id_class("regeneration", new rLi_1(new rLY(rLD.id_finally, 900)));
   public static final rLi_1 id_float = id_class("long_regeneration", new rLi_1("regeneration", new rLY(rLD.id_finally, 1800)));
   public static final rLi_1 id_void = id_class("strong_regeneration", new rLi_1("regeneration", new rLY(rLD.id_finally, 450, 1)));
   public static final rLi_1 id_static = id_class("strength", new rLi_1(new rLY(rLD.id_throws, 3600)));
   public static final rLi_1 id_import = id_class("long_strength", new rLi_1("strength", new rLY(rLD.id_throws, 9600)));
   public static final rLi_1 id_short = id_class("strong_strength", new rLi_1("strength", new rLY(rLD.id_throws, 1800, 1)));
   public static final rLi_1 id_default = id_class("weakness", new rLi_1(new rLY(rLD.id_continue, 1800)));
   public static final rLi_1 id_const = id_class("long_weakness", new rLi_1("weakness", new rLY(rLD.id_continue, 4800)));
   public static final rLi_1 id_strictfp = id_class("luck", new rLi_1("luck", new rLY(rLD.id_while, 6000)));
   public static final rLi_1 id_boolean = id_class("slow_falling", new rLi_1(new rLY(rLD.id_instanceof, 1800)));
   public static final rLi_1 id_transient = id_class("long_slow_falling", new rLi_1("slow_falling", new rLY(rLD.id_instanceof, 4800)));

   private static rLi_1 id_class(String var0, rLi_1 var1) {
      return rVL.id_class(rVL.id_double, var0, var1);
   }
}

package celestial;

public class rAS {
   public static final rLi_1 class_ = class_("empty", new rLi_1());
   public static final rLi_1 break_ = class_("water", new rLi_1());
   public static final rLi_1 byte_ = class_("mundane", new rLi_1());
   public static final rLi_1 protected_ = class_("thick", new rLi_1());
   public static final rLi_1 throws_ = class_("awkward", new rLi_1());
   public static final rLi_1 case_ = class_("night_vision", new rLi_1(new rLY(rLD.int_, 3600)));
   public static final rLi_1 catch_ = class_("long_night_vision", new rLi_1("night_vision", new rLY(rLD.int_, 9600)));
   public static final rLi_1 private_ = class_("invisibility", new rLi_1(new rLY(rLD.final_, 3600)));
   public static final rLi_1 implements_ = class_("long_invisibility", new rLi_1("invisibility", new rLY(rLD.final_, 9600)));
   public static final rLi_1 finally_ = class_("leaping", new rLi_1(new rLY(rLD.private_, 3600)));
   public static final rLi_1 extends_ = class_("long_leaping", new rLi_1("leaping", new rLY(rLD.private_, 9600)));
   public static final rLi_1 native_ = class_("strong_leaping", new rLi_1("leaping", new rLY(rLD.private_, 1800, 1)));
   public static final rLi_1 volatile_ = class_("fire_resistance", new rLi_1(new rLY(rLD.native_, 3600)));
   public static final rLi_1 final_ = class_("long_fire_resistance", new rLi_1("fire_resistance", new rLY(rLD.native_, 9600)));
   public static final rLi_1 package_ = class_("swiftness", new rLi_1(new rLY(rLD.class_, 3600)));
   public static final rLi_1 int_ = class_("long_swiftness", new rLi_1("swiftness", new rLY(rLD.class_, 9600)));
   public static final rLi_1 new_ = class_("strong_swiftness", new rLi_1("swiftness", new rLY(rLD.class_, 1800, 1)));
   public static final rLi_1 continue_ = class_("slowness", new rLi_1(new rLY(rLD.break_, 1800)));
   public static final rLi_1 super_ = class_("long_slowness", new rLi_1("slowness", new rLY(rLD.break_, 4800)));
   public static final rLi_1 this_ = class_("strong_slowness", new rLi_1("slowness", new rLY(rLD.break_, 400, 3)));
   public static final rLi_1 else_ = class_("turtle_master", new rLi_1("turtle_master", new rLY(rLD.break_, 400, 3), new rLY(rLD.extends_, 400, 2)));
   public static final rLi_1 synchronized_ = class_(
      "long_turtle_master", new rLi_1("turtle_master", new rLY(rLD.break_, 800, 3), new rLY(rLD.extends_, 800, 2))
   );
   public static final rLi_1 return_ = class_("strong_turtle_master", new rLi_1("turtle_master", new rLY(rLD.break_, 400, 5), new rLY(rLD.extends_, 400, 3)));
   public static final rLi_1 public_ = class_("water_breathing", new rLi_1(new rLY(rLD.volatile_, 3600)));
   public static final rLi_1 goto_ = class_("long_water_breathing", new rLi_1("water_breathing", new rLY(rLD.volatile_, 9600)));
   public static final rLi_1 while_ = class_("healing", new rLi_1(new rLY(rLD.case_, 1)));
   public static final rLi_1 try_ = class_("strong_healing", new rLi_1("healing", new rLY(rLD.case_, 1, 1)));
   public static final rLi_1 instanceof_ = class_("harming", new rLi_1(new rLY(rLD.catch_, 1)));
   public static final rLi_1 throw_ = class_("strong_harming", new rLi_1("harming", new rLY(rLD.catch_, 1, 1)));
   public static final rLi_1 interface_ = class_("poison", new rLi_1(new rLY(rLD.super_, 900)));
   public static final rLi_1 char_ = class_("long_poison", new rLi_1("poison", new rLY(rLD.super_, 1800)));
   public static final rLi_1 abstract_ = class_("strong_poison", new rLi_1("poison", new rLY(rLD.super_, 432, 1)));
   public static final rLi_1 long_ = class_("regeneration", new rLi_1(new rLY(rLD.finally_, 900)));
   public static final rLi_1 float_ = class_("long_regeneration", new rLi_1("regeneration", new rLY(rLD.finally_, 1800)));
   public static final rLi_1 void_ = class_("strong_regeneration", new rLi_1("regeneration", new rLY(rLD.finally_, 450, 1)));
   public static final rLi_1 static_ = class_("strength", new rLi_1(new rLY(rLD.throws_, 3600)));
   public static final rLi_1 import_ = class_("long_strength", new rLi_1("strength", new rLY(rLD.throws_, 9600)));
   public static final rLi_1 short_ = class_("strong_strength", new rLi_1("strength", new rLY(rLD.throws_, 1800, 1)));
   public static final rLi_1 default_ = class_("weakness", new rLi_1(new rLY(rLD.continue_, 1800)));
   public static final rLi_1 const_ = class_("long_weakness", new rLi_1("weakness", new rLY(rLD.continue_, 4800)));
   public static final rLi_1 strictfp_ = class_("luck", new rLi_1("luck", new rLY(rLD.while_, 6000)));
   public static final rLi_1 boolean_ = class_("slow_falling", new rLi_1(new rLY(rLD.instanceof_, 1800)));
   public static final rLi_1 transient_ = class_("long_slow_falling", new rLi_1("slow_falling", new rLY(rLD.instanceof_, 4800)));

   private static rLi_1 class_(String var0, rLi_1 var1) {
      return rVL.class_(rVL.double_, var0, var1);
   }
}

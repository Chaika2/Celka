package celestial;

import com.mojang.serialization.Dynamic;

public final class rYE {
   private final String class_;
   private final rRl_1 break_;
   private final boolean byte_;
   private final rRO protected_;
   private final boolean throws_;
   private final rRu_1 case_;
   private final rTH catch_;

   public boolean byte_() {
      return this.byte_;
   }

   public rYE(String var1, rRl_1 var2, boolean var3, rRO var4, boolean var5, rRu_1 var6, rTH var7) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
      this.case_ = var6;
      this.catch_ = var7;
   }

   public rYE class_(rRl_1 var1) {
      return new rYE(this.class_, var1, this.byte_, this.protected_, this.throws_, this.case_, this.catch_);
   }

   public rYE class_(rRO var1) {
      return new rYE(this.class_, this.break_, this.byte_, var1, this.throws_, this.case_, this.catch_);
   }

   public rYE class_(rTH var1) {
      return new rYE(this.class_, this.break_, this.byte_, this.protected_, this.throws_, this.case_, var1);
   }

   public String class_() {
      return this.class_;
   }

   public static rYE class_(Dynamic<?> var0, rTH var1) {
      rRl_1 var2 = rRl_1.class_(var0.get("GameType").asInt(0));
      return new rYE(
         var0.get("LevelName").asString(""),
         var2,
         var0.get("hardcore").asBoolean(false),
         var0.get("Difficulty").asNumber().map(var0x -> rRO.class_(var0x.byteValue())).result().orElse(rRO.NORMAL),
         var0.get("allowCommands").asBoolean(var2 == rRl_1.CREATIVE),
         new rRu_1(var0.get("GameRules")),
         var1
      );
   }

   public rRl_1 break_() {
      return this.break_;
   }

   public boolean throws_() {
      return this.throws_;
   }

   public rTH catch_() {
      return this.catch_;
   }

   public rRu_1 case_() {
      return this.case_;
   }

   public rRO protected_() {
      return this.protected_;
   }

   public rYE private_() {
      return new rYE(this.class_, this.break_, this.byte_, this.protected_, this.throws_, this.case_.break_(), this.catch_);
   }
}

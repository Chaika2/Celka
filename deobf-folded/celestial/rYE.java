package celestial;

import com.mojang.serialization.Dynamic;

public final class rYE {
   private final String id_class;
   private final rRl_1 id_break;
   private final boolean id_byte;
   private final rRO id_protected;
   private final boolean id_throws;
   private final rRu_1 id_case;
   private final rTH id_catch;

   public boolean id_byte() {
      return this.id_byte;
   }

   public rYE(String var1, rRl_1 var2, boolean var3, rRO var4, boolean var5, rRu_1 var6, rTH var7) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_case = var6;
      this.id_catch = var7;
   }

   public rYE id_class(rRl_1 var1) {
      return new rYE(this.id_class, var1, this.id_byte, this.id_protected, this.id_throws, this.id_case, this.id_catch);
   }

   public rYE id_class(rRO var1) {
      return new rYE(this.id_class, this.id_break, this.id_byte, var1, this.id_throws, this.id_case, this.id_catch);
   }

   public rYE id_class(rTH var1) {
      return new rYE(this.id_class, this.id_break, this.id_byte, this.id_protected, this.id_throws, this.id_case, var1);
   }

   public String id_class() {
      return this.id_class;
   }

   public static rYE id_class(Dynamic<?> var0, rTH var1) {
      rRl_1 var2 = rRl_1.id_class(var0.get("GameType").asInt(0));
      return new rYE(
         var0.get("LevelName").asString(""),
         var2,
         var0.get("hardcore").asBoolean(false),
         var0.get("Difficulty").asNumber().map(var0x -> rRO.id_class(var0x.byteValue())).result().orElse(rRO.NORMAL),
         var0.get("allowCommands").asBoolean(var2 == rRl_1.CREATIVE),
         new rRu_1(var0.get("GameRules")),
         var1
      );
   }

   public rRl_1 id_break() {
      return this.id_break;
   }

   public boolean id_throws() {
      return this.id_throws;
   }

   public rTH id_catch() {
      return this.id_catch;
   }

   public rRu_1 id_case() {
      return this.id_case;
   }

   public rRO id_protected() {
      return this.id_protected;
   }

   public rYE id_private() {
      return new rYE(this.id_class, this.id_break, this.id_byte, this.id_protected, this.id_throws, this.id_case.id_break(), this.id_catch);
   }
}

package celestial;

import com.mojang.serialization.DynamicLike;

public class roM_2 {
   private final double id_class;
   private final double id_break;
   private final double id_byte;
   private final double id_protected;
   private final int id_throws;
   private final int id_case;
   private final double id_catch;
   private final long id_private;
   private final double id_implements;

   public double id_byte() {
      return this.id_byte;
   }

   roM_2(double var1, double var3, double var5, double var7, int var9, int var10, double var11, long var13, double var15) {
      this.id_class = var1;
      this.id_break = var3;
      this.id_byte = var5;
      this.id_protected = var7;
      this.id_throws = var9;
      this.id_case = var10;
      this.id_catch = var11;
      this.id_private = var13;
      this.id_implements = var15;
   }

   roM_2(roE_2 var1) {
      this.id_class = var1.id_class();
      this.id_break = var1.id_break();
      this.id_byte = var1.id_package();
      this.id_protected = var1.id_final();
      this.id_throws = var1.id_continue();
      this.id_case = var1.id_new();
      this.id_catch = var1.id_implements();
      this.id_private = var1.id_finally();
      this.id_implements = var1.id_extends();
   }

   public void id_class(rcd_3 var1) {
      var1.id_class("BorderCenterX", this.id_class);
      var1.id_class("BorderCenterZ", this.id_break);
      var1.id_class("BorderSize", this.id_catch);
      var1.id_class("BorderSizeLerpTime", this.id_private);
      var1.id_class("BorderSafeZone", this.id_protected);
      var1.id_class("BorderDamagePerBlock", this.id_byte);
      var1.id_class("BorderSizeLerpTarget", this.id_implements);
      var1.id_class("BorderWarningBlocks", (double)this.id_throws);
      var1.id_class("BorderWarningTime", (double)this.id_case);
   }

   public static roM_2 id_class(DynamicLike<?> var0, roM_2 var1) {
      double var2 = var0.get("BorderCenterX").asDouble(var1.id_class);
      double var4 = var0.get("BorderCenterZ").asDouble(var1.id_break);
      double var6 = var0.get("BorderSize").asDouble(var1.id_catch);
      long var8 = var0.get("BorderSizeLerpTime").asLong(var1.id_private);
      double var10 = var0.get("BorderSizeLerpTarget").asDouble(var1.id_implements);
      double var12 = var0.get("BorderSafeZone").asDouble(var1.id_protected);
      double var14 = var0.get("BorderDamagePerBlock").asDouble(var1.id_byte);
      int var16 = var0.get("BorderWarningBlocks").asInt(var1.id_throws);
      int var17 = var0.get("BorderWarningTime").asInt(var1.id_case);
      return new roM_2(var2, var4, var14, var12, var16, var17, var6, var8, var10);
   }

   public double id_class() {
      return this.id_class;
   }

   public double id_break() {
      return this.id_break;
   }

   public int id_throws() {
      return this.id_throws;
   }

   public double id_catch() {
      return this.id_catch;
   }

   public int id_case() {
      return this.id_case;
   }

   public double id_implements() {
      return this.id_implements;
   }

   public double id_protected() {
      return this.id_protected;
   }

   public long id_private() {
      return this.id_private;
   }
}

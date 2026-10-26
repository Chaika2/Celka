package celestial;

import com.mojang.serialization.DynamicLike;

public class roM_2 {
   private final double class_;
   private final double break_;
   private final double byte_;
   private final double protected_;
   private final int throws_;
   private final int case_;
   private final double catch_;
   private final long private_;
   private final double implements_;

   public double byte_() {
      return this.byte_;
   }

   roM_2(double var1, double var3, double var5, double var7, int var9, int var10, double var11, long var13, double var15) {
      this.class_ = var1;
      this.break_ = var3;
      this.byte_ = var5;
      this.protected_ = var7;
      this.throws_ = var9;
      this.case_ = var10;
      this.catch_ = var11;
      this.private_ = var13;
      this.implements_ = var15;
   }

   roM_2(roE_2 var1) {
      this.class_ = var1.class_();
      this.break_ = var1.break_();
      this.byte_ = var1.package_();
      this.protected_ = var1.final_();
      this.throws_ = var1.continue_();
      this.case_ = var1.new_();
      this.catch_ = var1.implements_();
      this.private_ = var1.finally_();
      this.implements_ = var1.extends_();
   }

   public void class_(rcd_3 var1) {
      var1.class_("BorderCenterX", this.class_);
      var1.class_("BorderCenterZ", this.break_);
      var1.class_("BorderSize", this.catch_);
      var1.class_("BorderSizeLerpTime", this.private_);
      var1.class_("BorderSafeZone", this.protected_);
      var1.class_("BorderDamagePerBlock", this.byte_);
      var1.class_("BorderSizeLerpTarget", this.implements_);
      var1.class_("BorderWarningBlocks", (double)this.throws_);
      var1.class_("BorderWarningTime", (double)this.case_);
   }

   public static roM_2 class_(DynamicLike<?> var0, roM_2 var1) {
      double var2 = var0.get("BorderCenterX").asDouble(var1.class_);
      double var4 = var0.get("BorderCenterZ").asDouble(var1.break_);
      double var6 = var0.get("BorderSize").asDouble(var1.catch_);
      long var8 = var0.get("BorderSizeLerpTime").asLong(var1.private_);
      double var10 = var0.get("BorderSizeLerpTarget").asDouble(var1.implements_);
      double var12 = var0.get("BorderSafeZone").asDouble(var1.protected_);
      double var14 = var0.get("BorderDamagePerBlock").asDouble(var1.byte_);
      int var16 = var0.get("BorderWarningBlocks").asInt(var1.throws_);
      int var17 = var0.get("BorderWarningTime").asInt(var1.case_);
      return new roM_2(var2, var4, var14, var12, var16, var17, var6, var8, var10);
   }

   public double class_() {
      return this.class_;
   }

   public double break_() {
      return this.break_;
   }

   public int throws_() {
      return this.throws_;
   }

   public double catch_() {
      return this.catch_;
   }

   public int case_() {
      return this.case_;
   }

   public double implements_() {
      return this.implements_;
   }

   public double protected_() {
      return this.protected_;
   }

   public long private_() {
      return this.private_;
   }
}

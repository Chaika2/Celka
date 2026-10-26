package celestial;

import com.mojang.datafixers.util.Pair;
import java.util.Random;
import org.apache.commons.lang3.tuple.Triple;

public final class rjj_3 implements rfe_3 {
   private static final float finally_ = 3.0F + 2.0F * (float)Math.sqrt(2.0);
   private static final float extends_ = (float)Math.cos(Math.PI / 8);
   private static final float native_ = (float)Math.sin(Math.PI / 8);
   private static final float volatile_ = 1.0F / (float)Math.sqrt(2.0);
   protected float class_;
   protected float break_;
   protected float byte_;
   protected float protected_;
   protected float throws_;
   protected float case_;
   protected float catch_;
   protected float private_;
   protected float implements_;

   private void byte_(rjY_2 var1) {
      float var2 = var1.class_();
      float var3 = var1.protected_();
      float var4 = 2.0F * var2 * var2;
      float var5 = 1.0F - var4;
      float var6 = 1.0F - var4;
      float var7 = var2 * var3;
      float var8 = 2.0F * var7;
      float var9 = 2.0F * -var7;
      float var10 = this.break_ * var5 + this.byte_ * var8;
      float var11 = this.break_ * var9 + this.byte_ * var6;
      float var12 = this.throws_ * var5 + this.case_ * var8;
      float var13 = this.throws_ * var9 + this.case_ * var6;
      float var14 = this.private_ * var5 + this.implements_ * var8;
      float var15 = this.private_ * var9 + this.implements_ * var6;
      this.break_ = var10;
      this.byte_ = var11;
      this.throws_ = var12;
      this.case_ = var13;
      this.private_ = var14;
      this.implements_ = var15;
   }

   public void byte_(rjj_3 var1) {
      rjj_3 var2 = var1.case_();
      var2.break_(this);
      this.class_(var2);
   }

   @Override
   public float byte_(float var1, float var2, float var3) {
      return this.catch_ * var1 + this.private_ * var2 + this.implements_ * var3;
   }

   public void byte_() {
      this.class_ = 1.0F;
      this.break_ = 0.0F;
      this.byte_ = 0.0F;
      this.protected_ = 0.0F;
      this.throws_ = 1.0F;
      this.case_ = 0.0F;
      this.catch_ = 0.0F;
      this.private_ = 0.0F;
      this.implements_ = 1.0F;
   }

   public rjj_3() {
   }

   public rjj_3(rjY_2 var1) {
      float var2 = var1.class_();
      float var3 = var1.break_();
      float var4 = var1.byte_();
      float var5 = var1.protected_();
      float var6 = 2.0F * var2 * var2;
      float var7 = 2.0F * var3 * var3;
      float var8 = 2.0F * var4 * var4;
      this.class_ = 1.0F - var7 - var8;
      this.throws_ = 1.0F - var8 - var6;
      this.implements_ = 1.0F - var6 - var7;
      float var9 = var2 * var3;
      float var10 = var3 * var4;
      float var11 = var4 * var2;
      float var12 = var2 * var5;
      float var13 = var3 * var5;
      float var14 = var4 * var5;
      this.protected_ = 2.0F * (var9 + var14);
      this.break_ = 2.0F * (var9 - var14);
      this.catch_ = 2.0F * (var11 - var13);
      this.byte_ = 2.0F * (var11 + var13);
      this.private_ = 2.0F * (var10 + var12);
      this.case_ = 2.0F * (var10 - var12);
   }

   public rjj_3(rjV_2 var1) {
      this.class_ = var1.class_;
      this.break_ = var1.break_;
      this.byte_ = var1.byte_;
      this.protected_ = var1.throws_;
      this.throws_ = var1.case_;
      this.case_ = var1.catch_;
      this.catch_ = var1.implements_;
      this.private_ = var1.finally_;
      this.implements_ = var1.extends_;
   }

   public rjj_3(rjj_3 var1) {
      this.class_ = var1.class_;
      this.break_ = var1.break_;
      this.byte_ = var1.byte_;
      this.protected_ = var1.protected_;
      this.throws_ = var1.throws_;
      this.case_ = var1.case_;
      this.catch_ = var1.catch_;
      this.private_ = var1.private_;
      this.implements_ = var1.implements_;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rjj_3 var2 = (rjj_3)var1;
         return Float.compare(var2.class_, this.class_) == 0
            && Float.compare(var2.break_, this.break_) == 0
            && Float.compare(var2.byte_, this.byte_) == 0
            && Float.compare(var2.protected_, this.protected_) == 0
            && Float.compare(var2.throws_, this.throws_) == 0
            && Float.compare(var2.case_, this.case_) == 0
            && Float.compare(var2.catch_, this.catch_) == 0
            && Float.compare(var2.private_, this.private_) == 0
            && Float.compare(var2.implements_, this.implements_) == 0;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Matrix3f:\n");
      var1.append(this.class_);
      var1.append(" ");
      var1.append(this.break_);
      var1.append(" ");
      var1.append(this.byte_);
      var1.append("\n");
      var1.append(this.protected_);
      var1.append(" ");
      var1.append(this.throws_);
      var1.append(" ");
      var1.append(this.case_);
      var1.append("\n");
      var1.append(this.catch_);
      var1.append(" ");
      var1.append(this.private_);
      var1.append(" ");
      var1.append(this.implements_);
      var1.append("\n");
      return var1.toString();
   }

   @Override
   public int hashCode() {
      int var1 = this.class_ != 0.0F ? Float.floatToIntBits(this.class_) : 0;
      var1 = 31 * var1 + (this.break_ != 0.0F ? Float.floatToIntBits(this.break_) : 0);
      var1 = 31 * var1 + (this.byte_ != 0.0F ? Float.floatToIntBits(this.byte_) : 0);
      var1 = 31 * var1 + (this.protected_ != 0.0F ? Float.floatToIntBits(this.protected_) : 0);
      var1 = 31 * var1 + (this.throws_ != 0.0F ? Float.floatToIntBits(this.throws_) : 0);
      var1 = 31 * var1 + (this.case_ != 0.0F ? Float.floatToIntBits(this.case_) : 0);
      var1 = 31 * var1 + (this.catch_ != 0.0F ? Float.floatToIntBits(this.catch_) : 0);
      var1 = 31 * var1 + (this.private_ != 0.0F ? Float.floatToIntBits(this.private_) : 0);
      return 31 * var1 + (this.implements_ != 0.0F ? Float.floatToIntBits(this.implements_) : 0);
   }

   private static Pair<Float, Float> class_(float var0, float var1) {
      float var2 = (float)Math.hypot((double)var0, (double)var1);
      float var3 = var2 > 1.0E-6F ? var1 : 0.0F;
      float var4 = Math.abs(var0) + Math.max(var2, 1.0E-6F);
      if (var0 < 0.0F) {
         float var5 = var3;
         var3 = var4;
         var4 = var5;
      }

      float var8 = rfU_2.implements_(var4 * var4 + var3 * var3);
      var4 *= var8;
      var3 *= var8;
      return Pair.of(var3, var4);
   }

   @Override
   public void class_(rjY_2 var1) {
      boolean var2 = var1.class_() != 0.0F;
      boolean var3 = var1.break_() != 0.0F;
      boolean var4 = var1.byte_() != 0.0F;
      if (var2) {
         if (!var3 && !var4) {
            this.byte_(var1);
         } else {
            this.case_(var1);
         }
      } else if (var3) {
         if (!var4) {
            this.protected_(var1);
         } else {
            this.case_(var1);
         }
      } else if (var4) {
         this.throws_(var1);
      }
   }

   public void class_(int var1, int var2, float var3) {
      if (var1 == 0) {
         if (var2 == 0) {
            this.class_ = var3;
         } else if (var2 == 1) {
            this.break_ = var3;
         } else {
            this.byte_ = var3;
         }
      } else if (var1 == 1) {
         if (var2 == 0) {
            this.protected_ = var3;
         } else if (var2 == 1) {
            this.throws_ = var3;
         } else {
            this.case_ = var3;
         }
      } else if (var2 == 0) {
         this.catch_ = var3;
      } else if (var2 == 1) {
         this.private_ = var3;
      } else {
         this.implements_ = var3;
      }
   }

   public void class_(Random var1) {
      this.class_ = var1.nextFloat();
      this.break_ = var1.nextFloat();
      this.byte_ = var1.nextFloat();
      this.protected_ = var1.nextFloat();
      this.throws_ = var1.nextFloat();
      this.case_ = var1.nextFloat();
      this.catch_ = var1.nextFloat();
      this.private_ = var1.nextFloat();
      this.implements_ = var1.nextFloat();
   }

   public void class_(float var1) {
      this.class_ *= var1;
      this.break_ *= var1;
      this.byte_ *= var1;
      this.protected_ *= var1;
      this.throws_ *= var1;
      this.case_ *= var1;
      this.catch_ *= var1;
      this.private_ *= var1;
      this.implements_ *= var1;
   }

   public void class_(rjj_3 var1) {
      this.class_ = var1.class_;
      this.break_ = var1.break_;
      this.byte_ = var1.byte_;
      this.protected_ = var1.protected_;
      this.throws_ = var1.throws_;
      this.case_ = var1.case_;
      this.catch_ = var1.catch_;
      this.private_ = var1.private_;
      this.implements_ = var1.implements_;
   }

   @Override
   public int class_(rpr_3 var1) {
      rja_3 var2 = var1.int_();
      float var3 = (float)var2.b_();
      float var4 = (float)var2.c_();
      float var5 = (float)var2.d_();
      float var6 = this.class_ * var3 + this.break_ * var4 + this.byte_ * var5;
      float var7 = this.protected_ * var3 + this.throws_ * var4 + this.case_ * var5;
      float var8 = this.catch_ * var3 + this.private_ * var4 + this.implements_ * var5;
      return rjP_2.class_(var6, var7, var8);
   }

   @Override
   public float class_(float var1, float var2, float var3) {
      return this.class_ * var1 + this.break_ * var2 + this.byte_ * var3;
   }

   public void class_() {
      float var1 = this.break_;
      this.break_ = this.protected_;
      this.protected_ = var1;
      var1 = this.byte_;
      this.byte_ = this.catch_;
      this.catch_ = var1;
      var1 = this.case_;
      this.case_ = this.private_;
      this.private_ = var1;
   }

   public void break_(rjj_3 var1) {
      float var2 = this.class_ * var1.class_ + this.break_ * var1.protected_ + this.byte_ * var1.catch_;
      float var3 = this.class_ * var1.break_ + this.break_ * var1.throws_ + this.byte_ * var1.private_;
      float var4 = this.class_ * var1.byte_ + this.break_ * var1.case_ + this.byte_ * var1.implements_;
      float var5 = this.protected_ * var1.class_ + this.throws_ * var1.protected_ + this.case_ * var1.catch_;
      float var6 = this.protected_ * var1.break_ + this.throws_ * var1.throws_ + this.case_ * var1.private_;
      float var7 = this.protected_ * var1.byte_ + this.throws_ * var1.case_ + this.case_ * var1.implements_;
      float var8 = this.catch_ * var1.class_ + this.private_ * var1.protected_ + this.implements_ * var1.catch_;
      float var9 = this.catch_ * var1.break_ + this.private_ * var1.throws_ + this.implements_ * var1.private_;
      float var10 = this.catch_ * var1.byte_ + this.private_ * var1.case_ + this.implements_ * var1.implements_;
      this.class_ = var2;
      this.break_ = var3;
      this.byte_ = var4;
      this.protected_ = var5;
      this.throws_ = var6;
      this.case_ = var7;
      this.catch_ = var8;
      this.private_ = var9;
      this.implements_ = var10;
   }

   @Override
   public float break_(float var1, float var2, float var3) {
      return this.protected_ * var1 + this.throws_ * var2 + this.case_ * var3;
   }

   public Triple<rjY_2, rje_3, rjY_2> break_() {
      rjY_2 var1 = rjY_2.class_.catch_();
      rjY_2 var2 = rjY_2.class_.catch_();
      rjj_3 var3 = this.case_();
      var3.class_();
      var3.break_(this);

      for (int var4 = 0; var4 < 5; var4++) {
         var2.class_(protected_(var3));
      }

      var2.case_();
      rjj_3 var29 = new rjj_3(this);
      var29.break_(new rjj_3(var2));
      float var5 = 1.0F;
      Pair var6 = class_(var29.class_, var29.protected_);
      Float var7 = (Float)var6.getFirst();
      Float var8 = (Float)var6.getSecond();
      float var9 = var8 * var8 - var7 * var7;
      float var10 = -2.0F * var7 * var8;
      float var11 = var8 * var8 + var7 * var7;
      rjY_2 var12 = new rjY_2(0.0F, 0.0F, var7, var8);
      var1.class_(var12);
      rjj_3 var13 = new rjj_3();
      var13.byte_();
      var13.class_ = var9;
      var13.throws_ = var9;
      var13.protected_ = var10;
      var13.break_ = -var10;
      var13.implements_ = var11;
      var5 *= var11;
      var13.break_(var29);
      var6 = class_(var13.class_, var13.catch_);
      float var14 = -(Float)var6.getFirst();
      Float var15 = (Float)var6.getSecond();
      float var16 = var15 * var15 - var14 * var14;
      float var17 = -2.0F * var14 * var15;
      float var18 = var15 * var15 + var14 * var14;
      rjY_2 var19 = new rjY_2(0.0F, var14, 0.0F, var15);
      var1.class_(var19);
      rjj_3 var20 = new rjj_3();
      var20.byte_();
      var20.class_ = var16;
      var20.implements_ = var16;
      var20.catch_ = -var17;
      var20.byte_ = var17;
      var20.throws_ = var18;
      var5 *= var18;
      var20.break_(var13);
      var6 = class_(var20.throws_, var20.private_);
      Float var21 = (Float)var6.getFirst();
      Float var22 = (Float)var6.getSecond();
      float var23 = var22 * var22 - var21 * var21;
      float var24 = -2.0F * var21 * var22;
      float var25 = var22 * var22 + var21 * var21;
      rjY_2 var26 = new rjY_2(var21, 0.0F, 0.0F, var22);
      var1.class_(var26);
      rjj_3 var27 = new rjj_3();
      var27.byte_();
      var27.throws_ = var23;
      var27.implements_ = var23;
      var27.private_ = var24;
      var27.case_ = -var24;
      var27.class_ = var25;
      var5 *= var25;
      var27.break_(var20);
      var5 = 1.0F / var5;
      var1.class_((float)Math.sqrt((double)var5));
      rje_3 var28 = new rje_3(var27.class_ * var5, var27.throws_ * var5, var27.implements_ * var5);
      return Triple.of(var1, var28, var2);
   }

   public void break_(rjY_2 var1) {
      float var2 = var1.class_();
      float var3 = var1.break_();
      float var4 = var1.byte_();
      float var5 = var1.protected_();
      float var6 = 2.0F * var2 * var2;
      float var7 = 2.0F * var3 * var3;
      float var8 = 2.0F * var4 * var4;
      float var9 = var2 * var3;
      float var10 = var3 * var4;
      float var11 = var4 * var2;
      float var12 = var2 * var5;
      float var13 = var3 * var5;
      float var14 = var4 * var5;
      float var15 = 1.0F - var7 - var8;
      float var16 = 2.0F * (var9 - var14);
      float var17 = 2.0F * (var11 + var13);
      float var18 = 2.0F * (var9 + var14);
      float var19 = 1.0F - var8 - var6;
      float var20 = 2.0F * (var10 - var12);
      float var21 = 2.0F * (var11 - var13);
      float var22 = 2.0F * (var10 + var12);
      float var23 = 1.0F - var6 - var7;
      float var24 = this.class_ * var15 + this.break_ * var18 + this.byte_ * var21;
      float var25 = this.class_ * var16 + this.break_ * var19 + this.byte_ * var22;
      float var26 = this.class_ * var17 + this.break_ * var20 + this.byte_ * var23;
      float var27 = this.protected_ * var15 + this.throws_ * var18 + this.case_ * var21;
      float var28 = this.protected_ * var16 + this.throws_ * var19 + this.case_ * var22;
      float var29 = this.protected_ * var17 + this.throws_ * var20 + this.case_ * var23;
      float var30 = this.catch_ * var15 + this.private_ * var18 + this.implements_ * var21;
      float var31 = this.catch_ * var16 + this.private_ * var19 + this.implements_ * var22;
      float var32 = this.catch_ * var17 + this.private_ * var20 + this.implements_ * var23;
      this.class_ = var24;
      this.break_ = var25;
      this.byte_ = var26;
      this.protected_ = var27;
      this.throws_ = var28;
      this.case_ = var29;
      this.catch_ = var30;
      this.private_ = var31;
      this.implements_ = var32;
   }

   private void throws_(rjY_2 var1) {
      float var2 = var1.byte_();
      float var3 = var1.protected_();
      float var4 = 2.0F * var2 * var2;
      float var5 = 1.0F - var4;
      float var6 = 1.0F - var4;
      float var7 = var2 * var3;
      float var8 = 2.0F * (0.0F + var7);
      float var9 = 2.0F * (0.0F - var7);
      float var10 = this.class_ * var5 + this.break_ * var8;
      float var11 = this.class_ * var9 + this.break_ * var6;
      float var12 = this.protected_ * var5 + this.throws_ * var8;
      float var13 = this.protected_ * var9 + this.throws_ * var6;
      float var14 = this.catch_ * var5 + this.private_ * var8;
      float var15 = this.catch_ * var9 + this.private_ * var6;
      this.class_ = var10;
      this.break_ = var11;
      this.protected_ = var12;
      this.throws_ = var13;
      this.catch_ = var14;
      this.private_ = var15;
   }

   public boolean throws_() {
      float var1 = this.protected_();
      if (Math.abs(var1) > 1.0E-6F) {
         this.class_(var1);
         return true;
      } else {
         return false;
      }
   }

   public float throws_(float var1, float var2, float var3) {
      return this.class_ * var1 + this.break_ * var2 + this.byte_ * var3;
   }

   public float catch_(float var1, float var2, float var3) {
      return this.catch_ * var1 + this.private_ * var2 + this.implements_ * var3;
   }

   public float case_(float var1, float var2, float var3) {
      return this.protected_ * var1 + this.throws_ * var2 + this.case_ * var3;
   }

   private void case_(rjY_2 var1) {
      float var2 = var1.class_();
      float var3 = var1.break_();
      float var4 = var1.byte_();
      float var5 = var1.protected_();
      float var6 = 2.0F * var2 * var2;
      float var7 = 2.0F * var3 * var3;
      float var8 = 2.0F * var4 * var4;
      float var9 = 1.0F - var7 - var8;
      float var10 = 1.0F - var8 - var6;
      float var11 = 1.0F - var6 - var7;
      float var12 = var2 * var3;
      float var13 = var3 * var4;
      float var14 = var4 * var2;
      float var15 = var2 * var5;
      float var16 = var3 * var5;
      float var17 = var4 * var5;
      float var18 = 2.0F * (var12 + var17);
      float var19 = 2.0F * (var12 - var17);
      float var20 = 2.0F * (var14 - var16);
      float var21 = 2.0F * (var14 + var16);
      float var22 = 2.0F * (var13 + var15);
      float var23 = 2.0F * (var13 - var15);
      float var24 = this.class_ * var9 + this.break_ * var18 + this.byte_ * var20;
      float var25 = this.class_ * var19 + this.break_ * var10 + this.byte_ * var22;
      float var26 = this.class_ * var21 + this.break_ * var23 + this.byte_ * var11;
      float var27 = this.protected_ * var9 + this.throws_ * var18 + this.case_ * var20;
      float var28 = this.protected_ * var19 + this.throws_ * var10 + this.case_ * var22;
      float var29 = this.protected_ * var21 + this.throws_ * var23 + this.case_ * var11;
      float var30 = this.catch_ * var9 + this.private_ * var18 + this.implements_ * var20;
      float var31 = this.catch_ * var19 + this.private_ * var10 + this.implements_ * var22;
      float var32 = this.catch_ * var21 + this.private_ * var23 + this.implements_ * var11;
      this.class_ = var24;
      this.break_ = var25;
      this.byte_ = var26;
      this.protected_ = var27;
      this.throws_ = var28;
      this.case_ = var29;
      this.catch_ = var30;
      this.private_ = var31;
      this.implements_ = var32;
   }

   public rjj_3 case_() {
      return new rjj_3(this);
   }

   public static rjj_3 protected_(float var0, float var1, float var2) {
      rjj_3 var3 = new rjj_3();
      var3.class_ = var0;
      var3.throws_ = var1;
      var3.implements_ = var2;
      return var3;
   }

   private void protected_(rjY_2 var1) {
      float var2 = var1.break_();
      float var3 = var1.protected_();
      float var4 = 2.0F * var2 * var2;
      float var5 = 1.0F - var4;
      float var6 = 1.0F - var4;
      float var7 = var2 * var3;
      float var8 = 2.0F * -var7;
      float var9 = 2.0F * var7;
      float var10 = this.class_ * var5 + this.byte_ * var8;
      float var11 = this.class_ * var9 + this.byte_ * var6;
      float var12 = this.protected_ * var5 + this.case_ * var8;
      float var13 = this.protected_ * var9 + this.case_ * var6;
      float var14 = this.catch_ * var5 + this.implements_ * var8;
      float var15 = this.catch_ * var9 + this.implements_ * var6;
      this.class_ = var10;
      this.byte_ = var11;
      this.protected_ = var12;
      this.case_ = var13;
      this.catch_ = var14;
      this.implements_ = var15;
   }

   public float protected_() {
      float var1 = this.throws_ * this.implements_ - this.case_ * this.private_;
      float var2 = -(this.protected_ * this.implements_ - this.case_ * this.catch_);
      float var3 = this.protected_ * this.private_ - this.throws_ * this.catch_;
      float var4 = -(this.break_ * this.implements_ - this.byte_ * this.private_);
      float var5 = this.class_ * this.implements_ - this.byte_ * this.catch_;
      float var6 = -(this.class_ * this.private_ - this.break_ * this.catch_);
      float var7 = this.break_ * this.case_ - this.byte_ * this.throws_;
      float var8 = -(this.class_ * this.case_ - this.byte_ * this.protected_);
      float var9 = this.class_ * this.throws_ - this.break_ * this.protected_;
      float var10 = this.class_ * var1 + this.break_ * var2 + this.byte_ * var3;
      this.class_ = var1;
      this.protected_ = var2;
      this.catch_ = var3;
      this.break_ = var4;
      this.throws_ = var5;
      this.private_ = var6;
      this.byte_ = var7;
      this.case_ = var8;
      this.implements_ = var9;
      return var10;
   }

   private static rjY_2 protected_(rjj_3 var0) {
      rjj_3 var1 = new rjj_3();
      rjY_2 var2 = rjY_2.class_.catch_();
      if (var0.break_ * var0.break_ + var0.protected_ * var0.protected_ > 1.0E-6F) {
         Pair var3 = private_(var0.class_, 0.5F * (var0.break_ + var0.protected_), var0.throws_);
         Float var4 = (Float)var3.getFirst();
         Float var5 = (Float)var3.getSecond();
         rjY_2 var6 = new rjY_2(0.0F, 0.0F, var4, var5);
         float var7 = var5 * var5 - var4 * var4;
         float var8 = -2.0F * var4 * var5;
         float var9 = var5 * var5 + var4 * var4;
         var2.class_(var6);
         var1.byte_();
         var1.class_ = var7;
         var1.throws_ = var7;
         var1.protected_ = -var8;
         var1.break_ = var8;
         var1.implements_ = var9;
         var0.break_(var1);
         var1.class_();
         var1.break_(var0);
         var0.class_(var1);
      }

      if (var0.byte_ * var0.byte_ + var0.catch_ * var0.catch_ > 1.0E-6F) {
         Pair var10 = private_(var0.class_, 0.5F * (var0.byte_ + var0.catch_), var0.implements_);
         float var12 = -(Float)var10.getFirst();
         Float var14 = (Float)var10.getSecond();
         rjY_2 var16 = new rjY_2(0.0F, var12, 0.0F, var14);
         float var18 = var14 * var14 - var12 * var12;
         float var20 = -2.0F * var12 * var14;
         float var22 = var14 * var14 + var12 * var12;
         var2.class_(var16);
         var1.byte_();
         var1.class_ = var18;
         var1.implements_ = var18;
         var1.catch_ = var20;
         var1.byte_ = -var20;
         var1.throws_ = var22;
         var0.break_(var1);
         var1.class_();
         var1.break_(var0);
         var0.class_(var1);
      }

      if (var0.case_ * var0.case_ + var0.private_ * var0.private_ > 1.0E-6F) {
         Pair var11 = private_(var0.throws_, 0.5F * (var0.case_ + var0.private_), var0.implements_);
         Float var13 = (Float)var11.getFirst();
         Float var15 = (Float)var11.getSecond();
         rjY_2 var17 = new rjY_2(var13, 0.0F, 0.0F, var15);
         float var19 = var15 * var15 - var13 * var13;
         float var21 = -2.0F * var13 * var15;
         float var23 = var15 * var15 + var13 * var13;
         var2.class_(var17);
         var1.byte_();
         var1.throws_ = var19;
         var1.implements_ = var19;
         var1.private_ = -var21;
         var1.case_ = var21;
         var1.class_ = var23;
         var0.break_(var1);
         var1.class_();
         var1.break_(var0);
         var0.class_(var1);
      }

      return var2;
   }

   private static Pair<Float, Float> private_(float var0, float var1, float var2) {
      float var3 = 2.0F * (var0 - var2);
      if (finally_ * var1 * var1 < var3 * var3) {
         float var4 = rfU_2.implements_(var1 * var1 + var3 * var3);
         return Pair.of(var4 * var1, var4 * var3);
      } else {
         return Pair.of(native_, extends_);
      }
   }
}

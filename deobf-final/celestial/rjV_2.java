package celestial;

import java.nio.FloatBuffer;
import java.util.Random;

public final class rjV_2 implements rfa_3 {
   public float class_;
   public float break_;
   public float byte_;
   public float protected_;
   public float throws_;
   public float case_;
   public float catch_;
   public float private_;
   public float implements_;
   public float finally_;
   public float extends_;
   public float native_;
   public float volatile_;
   public float final_;
   public float package_;
   public float int_;

   public float byte_() {
      float var1 = this.class_ * this.case_ - this.break_ * this.throws_;
      float var2 = this.class_ * this.catch_ - this.byte_ * this.throws_;
      float var3 = this.class_ * this.private_ - this.protected_ * this.throws_;
      float var4 = this.break_ * this.catch_ - this.byte_ * this.case_;
      float var5 = this.break_ * this.private_ - this.protected_ * this.case_;
      float var6 = this.byte_ * this.private_ - this.protected_ * this.catch_;
      float var7 = this.implements_ * this.final_ - this.finally_ * this.volatile_;
      float var8 = this.implements_ * this.package_ - this.extends_ * this.volatile_;
      float var9 = this.implements_ * this.int_ - this.native_ * this.volatile_;
      float var10 = this.finally_ * this.package_ - this.extends_ * this.final_;
      float var11 = this.finally_ * this.int_ - this.native_ * this.final_;
      float var12 = this.extends_ * this.int_ - this.native_ * this.package_;
      float var13 = this.case_ * var12 - this.catch_ * var11 + this.private_ * var10;
      float var14 = -this.throws_ * var12 + this.catch_ * var9 - this.private_ * var8;
      float var15 = this.throws_ * var11 - this.case_ * var9 + this.private_ * var7;
      float var16 = -this.throws_ * var10 + this.case_ * var8 - this.catch_ * var7;
      float var17 = -this.break_ * var12 + this.byte_ * var11 - this.protected_ * var10;
      float var18 = this.class_ * var12 - this.byte_ * var9 + this.protected_ * var8;
      float var19 = -this.class_ * var11 + this.break_ * var9 - this.protected_ * var7;
      float var20 = this.class_ * var10 - this.break_ * var8 + this.byte_ * var7;
      float var21 = this.final_ * var6 - this.package_ * var5 + this.int_ * var4;
      float var22 = -this.volatile_ * var6 + this.package_ * var3 - this.int_ * var2;
      float var23 = this.volatile_ * var5 - this.final_ * var3 + this.int_ * var1;
      float var24 = -this.volatile_ * var4 + this.final_ * var2 - this.package_ * var1;
      float var25 = -this.finally_ * var6 + this.extends_ * var5 - this.native_ * var4;
      float var26 = this.implements_ * var6 - this.extends_ * var3 + this.native_ * var2;
      float var27 = -this.implements_ * var5 + this.finally_ * var3 - this.native_ * var1;
      float var28 = this.implements_ * var4 - this.finally_ * var2 + this.extends_ * var1;
      this.class_ = var13;
      this.throws_ = var14;
      this.implements_ = var15;
      this.volatile_ = var16;
      this.break_ = var17;
      this.case_ = var18;
      this.finally_ = var19;
      this.final_ = var20;
      this.byte_ = var21;
      this.catch_ = var22;
      this.extends_ = var23;
      this.package_ = var24;
      this.protected_ = var25;
      this.private_ = var26;
      this.native_ = var27;
      this.int_ = var28;
      return var1 * var12 - var2 * var11 + var3 * var10 + var4 * var9 - var5 * var8 + var6 * var7;
   }

   @Override
   public float byte_(float var1, float var2, float var3) {
      return this.throws_ * var1 + this.case_ * var2 + this.catch_ * var3 + this.private_;
   }

   public float byte_(float var1, float var2, float var3, float var4) {
      return this.throws_ * var1 + this.case_ * var2 + this.catch_ * var3 + this.private_ * var4;
   }

   public void byte_(rjV_2 var1) {
      this.class_ = this.class_ + var1.class_;
      this.break_ = this.break_ + var1.break_;
      this.byte_ = this.byte_ + var1.byte_;
      this.protected_ = this.protected_ + var1.protected_;
      this.throws_ = this.throws_ + var1.throws_;
      this.case_ = this.case_ + var1.case_;
      this.catch_ = this.catch_ + var1.catch_;
      this.private_ = this.private_ + var1.private_;
      this.implements_ = this.implements_ + var1.implements_;
      this.finally_ = this.finally_ + var1.finally_;
      this.extends_ = this.extends_ + var1.extends_;
      this.native_ = this.native_ + var1.native_;
      this.volatile_ = this.volatile_ + var1.volatile_;
      this.final_ = this.final_ + var1.final_;
      this.package_ = this.package_ + var1.package_;
      this.int_ = this.int_ + var1.int_;
   }

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
      float var12 = this.case_ * var5 + this.catch_ * var8;
      float var13 = this.case_ * var9 + this.catch_ * var6;
      float var14 = this.finally_ * var5 + this.extends_ * var8;
      float var15 = this.finally_ * var9 + this.extends_ * var6;
      float var16 = this.final_ * var5 + this.package_ * var8;
      float var17 = this.final_ * var9 + this.package_ * var6;
      this.break_ = var10;
      this.byte_ = var11;
      this.case_ = var12;
      this.catch_ = var13;
      this.finally_ = var14;
      this.extends_ = var15;
      this.final_ = var16;
      this.package_ = var17;
   }

   public rjV_2(float[] var1) {
      this.class_ = var1[0];
      this.break_ = var1[1];
      this.byte_ = var1[2];
      this.protected_ = var1[3];
      this.throws_ = var1[4];
      this.case_ = var1[5];
      this.catch_ = var1[6];
      this.private_ = var1[7];
      this.implements_ = var1[8];
      this.finally_ = var1[9];
      this.extends_ = var1[10];
      this.native_ = var1[11];
      this.volatile_ = var1[12];
      this.final_ = var1[13];
      this.package_ = var1[14];
      this.int_ = var1[15];
   }

   public rjV_2(rjV_2 var1) {
      this.class_ = var1.class_;
      this.break_ = var1.break_;
      this.byte_ = var1.byte_;
      this.protected_ = var1.protected_;
      this.throws_ = var1.throws_;
      this.case_ = var1.case_;
      this.catch_ = var1.catch_;
      this.private_ = var1.private_;
      this.implements_ = var1.implements_;
      this.finally_ = var1.finally_;
      this.extends_ = var1.extends_;
      this.native_ = var1.native_;
      this.volatile_ = var1.volatile_;
      this.final_ = var1.final_;
      this.package_ = var1.package_;
      this.int_ = var1.int_;
   }

   public rjV_2() {
   }

   public rjV_2(rjY_2 var1) {
      float var2 = var1.class_();
      float var3 = var1.break_();
      float var4 = var1.byte_();
      float var5 = var1.protected_();
      float var6 = 2.0F * var2 * var2;
      float var7 = 2.0F * var3 * var3;
      float var8 = 2.0F * var4 * var4;
      this.class_ = 1.0F - var7 - var8;
      this.case_ = 1.0F - var8 - var6;
      this.extends_ = 1.0F - var6 - var7;
      this.int_ = 1.0F;
      float var9 = var2 * var3;
      float var10 = var3 * var4;
      float var11 = var4 * var2;
      float var12 = var2 * var5;
      float var13 = var3 * var5;
      float var14 = var4 * var5;
      this.throws_ = 2.0F * (var9 + var14);
      this.break_ = 2.0F * (var9 - var14);
      this.implements_ = 2.0F * (var11 - var13);
      this.byte_ = 2.0F * (var11 + var13);
      this.finally_ = 2.0F * (var10 + var12);
      this.catch_ = 2.0F * (var10 - var12);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rjV_2 var2 = (rjV_2)var1;
         return Float.compare(var2.class_, this.class_) == 0
            && Float.compare(var2.break_, this.break_) == 0
            && Float.compare(var2.byte_, this.byte_) == 0
            && Float.compare(var2.protected_, this.protected_) == 0
            && Float.compare(var2.throws_, this.throws_) == 0
            && Float.compare(var2.case_, this.case_) == 0
            && Float.compare(var2.catch_, this.catch_) == 0
            && Float.compare(var2.private_, this.private_) == 0
            && Float.compare(var2.implements_, this.implements_) == 0
            && Float.compare(var2.finally_, this.finally_) == 0
            && Float.compare(var2.extends_, this.extends_) == 0
            && Float.compare(var2.native_, this.native_) == 0
            && Float.compare(var2.volatile_, this.volatile_) == 0
            && Float.compare(var2.final_, this.final_) == 0
            && Float.compare(var2.package_, this.package_) == 0
            && Float.compare(var2.int_, this.int_) == 0;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "Matrix4f:\n"
         + this.class_
         + " "
         + this.break_
         + " "
         + this.byte_
         + " "
         + this.protected_
         + "\n"
         + this.throws_
         + " "
         + this.case_
         + " "
         + this.catch_
         + " "
         + this.private_
         + "\n"
         + this.implements_
         + " "
         + this.finally_
         + " "
         + this.extends_
         + " "
         + this.native_
         + "\n"
         + this.volatile_
         + " "
         + this.final_
         + " "
         + this.package_
         + " "
         + this.int_
         + "\n";
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
      var1 = 31 * var1 + (this.implements_ != 0.0F ? Float.floatToIntBits(this.implements_) : 0);
      var1 = 31 * var1 + (this.finally_ != 0.0F ? Float.floatToIntBits(this.finally_) : 0);
      var1 = 31 * var1 + (this.extends_ != 0.0F ? Float.floatToIntBits(this.extends_) : 0);
      var1 = 31 * var1 + (this.native_ != 0.0F ? Float.floatToIntBits(this.native_) : 0);
      var1 = 31 * var1 + (this.volatile_ != 0.0F ? Float.floatToIntBits(this.volatile_) : 0);
      var1 = 31 * var1 + (this.final_ != 0.0F ? Float.floatToIntBits(this.final_) : 0);
      var1 = 31 * var1 + (this.package_ != 0.0F ? Float.floatToIntBits(this.package_) : 0);
      return 31 * var1 + (this.int_ != 0.0F ? Float.floatToIntBits(this.int_) : 0);
   }

   public static rjV_2 class_(float var0, float var1, float var2, float var3) {
      rjV_2 var4 = new rjV_2();
      var4.class_ = 2.0F / var0;
      var4.case_ = 2.0F / var1;
      float var5 = var3 - var2;
      var4.extends_ = -2.0F / var5;
      var4.int_ = 1.0F;
      var4.protected_ = -1.0F;
      var4.private_ = -1.0F;
      var4.native_ = -(var3 + var2) / var5;
      return var4;
   }

   public void class_(rje_3 var1) {
      this.protected_ = this.protected_ + var1.class_();
      this.private_ = this.private_ + var1.break_();
      this.native_ = this.native_ + var1.byte_();
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
      this.finally_ = var1.nextFloat();
      this.extends_ = var1.nextFloat();
      this.native_ = var1.nextFloat();
      this.volatile_ = var1.nextFloat();
      this.final_ = var1.nextFloat();
      this.package_ = var1.nextFloat();
      this.int_ = var1.nextFloat();
   }

   public void class_(float[] var1) {
      var1[0] = this.class_;
      var1[1] = this.break_;
      var1[2] = this.byte_;
      var1[3] = this.protected_;
      var1[4] = this.throws_;
      var1[5] = this.case_;
      var1[6] = this.catch_;
      var1[7] = this.private_;
      var1[8] = this.implements_;
      var1[9] = this.finally_;
      var1[10] = this.extends_;
      var1[11] = this.native_;
      var1[12] = this.volatile_;
      var1[13] = this.final_;
      var1[14] = this.package_;
      var1[15] = this.int_;
   }

   public void class_() {
      this.class_ = 1.0F;
      this.break_ = 0.0F;
      this.byte_ = 0.0F;
      this.protected_ = 0.0F;
      this.throws_ = 0.0F;
      this.case_ = 1.0F;
      this.catch_ = 0.0F;
      this.private_ = 0.0F;
      this.implements_ = 0.0F;
      this.finally_ = 0.0F;
      this.extends_ = 1.0F;
      this.native_ = 0.0F;
      this.volatile_ = 0.0F;
      this.final_ = 0.0F;
      this.package_ = 0.0F;
      this.int_ = 1.0F;
   }

   public void class_(FloatBuffer var1) {
      if (var1.remaining() < 16) {
         throw new IllegalArgumentException("Not enough space in buffer");
      } else {
         this.break_(var1);
      }
   }

   public void class_(rjV_2 var1) {
      float var2 = this.class_ * var1.class_ + this.break_ * var1.throws_ + this.byte_ * var1.implements_ + this.protected_ * var1.volatile_;
      float var3 = this.class_ * var1.break_ + this.break_ * var1.case_ + this.byte_ * var1.finally_ + this.protected_ * var1.final_;
      float var4 = this.class_ * var1.byte_ + this.break_ * var1.catch_ + this.byte_ * var1.extends_ + this.protected_ * var1.package_;
      float var5 = this.class_ * var1.protected_ + this.break_ * var1.private_ + this.byte_ * var1.native_ + this.protected_ * var1.int_;
      float var6 = this.throws_ * var1.class_ + this.case_ * var1.throws_ + this.catch_ * var1.implements_ + this.private_ * var1.volatile_;
      float var7 = this.throws_ * var1.break_ + this.case_ * var1.case_ + this.catch_ * var1.finally_ + this.private_ * var1.final_;
      float var8 = this.throws_ * var1.byte_ + this.case_ * var1.catch_ + this.catch_ * var1.extends_ + this.private_ * var1.package_;
      float var9 = this.throws_ * var1.protected_ + this.case_ * var1.private_ + this.catch_ * var1.native_ + this.private_ * var1.int_;
      float var10 = this.implements_ * var1.class_ + this.finally_ * var1.throws_ + this.extends_ * var1.implements_ + this.native_ * var1.volatile_;
      float var11 = this.implements_ * var1.break_ + this.finally_ * var1.case_ + this.extends_ * var1.finally_ + this.native_ * var1.final_;
      float var12 = this.implements_ * var1.byte_ + this.finally_ * var1.catch_ + this.extends_ * var1.extends_ + this.native_ * var1.package_;
      float var13 = this.implements_ * var1.protected_ + this.finally_ * var1.private_ + this.extends_ * var1.native_ + this.native_ * var1.int_;
      float var14 = this.volatile_ * var1.class_ + this.final_ * var1.throws_ + this.package_ * var1.implements_ + this.int_ * var1.volatile_;
      float var15 = this.volatile_ * var1.break_ + this.final_ * var1.case_ + this.package_ * var1.finally_ + this.int_ * var1.final_;
      float var16 = this.volatile_ * var1.byte_ + this.final_ * var1.catch_ + this.package_ * var1.extends_ + this.int_ * var1.package_;
      float var17 = this.volatile_ * var1.protected_ + this.final_ * var1.private_ + this.package_ * var1.native_ + this.int_ * var1.int_;
      this.class_ = var2;
      this.break_ = var3;
      this.byte_ = var4;
      this.protected_ = var5;
      this.throws_ = var6;
      this.case_ = var7;
      this.catch_ = var8;
      this.private_ = var9;
      this.implements_ = var10;
      this.finally_ = var11;
      this.extends_ = var12;
      this.native_ = var13;
      this.volatile_ = var14;
      this.final_ = var15;
      this.package_ = var16;
      this.int_ = var17;
   }

   public static rjV_2 class_(double var0, float var2, float var3, float var4) {
      float var5 = (float)(1.0 / Math.tan(var0 * (float) (Math.PI / 180.0) / 2.0));
      rjV_2 var6 = new rjV_2();
      var6.class_ = var5 / var2;
      var6.case_ = var5;
      var6.extends_ = (var4 + var3) / (var3 - var4);
      var6.package_ = -1.0F;
      var6.native_ = 2.0F * var4 * var3 / (var3 - var4);
      return var6;
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
      this.finally_ *= var1;
      this.extends_ *= var1;
      this.native_ *= var1;
      this.volatile_ *= var1;
      this.final_ *= var1;
      this.package_ *= var1;
      this.int_ *= var1;
   }

   @Override
   public void class_(float var1, float var2, float var3) {
      this.protected_ = this.class_ * var1 + this.break_ * var2 + this.byte_ * var3 + this.protected_;
      this.private_ = this.throws_ * var1 + this.case_ * var2 + this.catch_ * var3 + this.private_;
      this.native_ = this.implements_ * var1 + this.finally_ * var2 + this.extends_ * var3 + this.native_;
      this.int_ = this.volatile_ * var1 + this.final_ * var2 + this.package_ * var3 + this.int_;
   }

   public void break_(rjV_2 var1) {
      this.class_ = var1.class_;
      this.break_ = var1.break_;
      this.byte_ = var1.byte_;
      this.protected_ = var1.protected_;
      this.throws_ = var1.throws_;
      this.case_ = var1.case_;
      this.catch_ = var1.catch_;
      this.private_ = var1.private_;
      this.implements_ = var1.implements_;
      this.finally_ = var1.finally_;
      this.extends_ = var1.extends_;
      this.native_ = var1.native_;
      this.volatile_ = var1.volatile_;
      this.final_ = var1.final_;
      this.package_ = var1.package_;
      this.int_ = var1.int_;
   }

   private void break_(FloatBuffer var1) {
      var1.put(0, this.class_);
      var1.put(1, this.throws_);
      var1.put(2, this.implements_);
      var1.put(3, this.volatile_);
      var1.put(4, this.break_);
      var1.put(5, this.case_);
      var1.put(6, this.finally_);
      var1.put(7, this.final_);
      var1.put(8, this.byte_);
      var1.put(9, this.catch_);
      var1.put(10, this.extends_);
      var1.put(11, this.package_);
      var1.put(12, this.protected_);
      var1.put(13, this.private_);
      var1.put(14, this.native_);
      var1.put(15, this.int_);
   }

   @Override
   public float break_(float var1, float var2, float var3) {
      return this.class_ * var1 + this.break_ * var2 + this.byte_ * var3 + this.protected_;
   }

   public void break_(rjY_2 var1) {
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

   public float break_(float var1, float var2, float var3, float var4) {
      return this.class_ * var1 + this.break_ * var2 + this.byte_ * var3 + this.protected_ * var4;
   }

   public boolean break_() {
      return this.class_ == 1.0F
         && this.break_ == 0.0F
         && this.byte_ == 0.0F
         && this.protected_ == 0.0F
         && this.throws_ == 0.0F
         && this.case_ == 1.0F
         && this.catch_ == 0.0F
         && this.private_ == 0.0F
         && this.implements_ == 0.0F
         && this.finally_ == 0.0F
         && this.extends_ == 1.0F
         && this.native_ == 0.0F
         && this.volatile_ == 0.0F
         && this.final_ == 0.0F
         && this.package_ == 0.0F
         && this.int_ == 1.0F;
   }

   private void throws_(rjY_2 var1) {
      float var2 = var1.byte_();
      float var3 = var1.protected_();
      float var4 = 2.0F * var2 * var2;
      float var5 = 1.0F - var4;
      float var6 = 1.0F - var4;
      float var7 = var2 * var3;
      float var8 = 2.0F * var7;
      float var9 = 2.0F * -var7;
      float var10 = this.class_ * var5 + this.break_ * var8;
      float var11 = this.class_ * var9 + this.break_ * var6;
      float var12 = this.throws_ * var5 + this.case_ * var8;
      float var13 = this.throws_ * var9 + this.case_ * var6;
      float var14 = this.implements_ * var5 + this.finally_ * var8;
      float var15 = this.implements_ * var9 + this.finally_ * var6;
      float var16 = this.volatile_ * var5 + this.final_ * var8;
      float var17 = this.volatile_ * var9 + this.final_ * var6;
      this.class_ = var10;
      this.break_ = var11;
      this.throws_ = var12;
      this.case_ = var13;
      this.implements_ = var14;
      this.finally_ = var15;
      this.volatile_ = var16;
      this.final_ = var17;
   }

   public static rjV_2 throws_(float var0, float var1, float var2) {
      rjV_2 var3 = new rjV_2();
      var3.class_ = var0;
      var3.case_ = var1;
      var3.extends_ = var2;
      var3.int_ = 1.0F;
      return var3;
   }

   public float throws_(float var1, float var2, float var3, float var4) {
      return this.volatile_ * var1 + this.final_ * var2 + this.package_ * var3 + this.int_ * var4;
   }

   public boolean throws_() {
      float var1 = this.byte_();
      if (Math.abs(var1) > 1.0E-6F) {
         this.class_(var1);
         return true;
      } else {
         return false;
      }
   }

   public float catch_() {
      return (float)Math.sqrt((double)(this.class_ * this.class_ + this.throws_ * this.throws_ + this.implements_ * this.implements_));
   }

   public void catch_(float var1, float var2, float var3) {
      this.protected_ = this.protected_ + this.class_ * var1 + this.break_ * var2 + this.byte_ * var3;
      this.private_ = this.private_ + this.throws_ * var1 + this.case_ * var2 + this.catch_ * var3;
      this.native_ = this.native_ + this.implements_ * var1 + this.finally_ * var2 + this.extends_ * var3;
      this.int_ = this.int_ + this.volatile_ * var1 + this.final_ * var2 + this.package_ * var3;
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
      float var27 = this.throws_ * var9 + this.case_ * var18 + this.catch_ * var20;
      float var28 = this.throws_ * var19 + this.case_ * var10 + this.catch_ * var22;
      float var29 = this.throws_ * var21 + this.case_ * var23 + this.catch_ * var11;
      float var30 = this.implements_ * var9 + this.finally_ * var18 + this.extends_ * var20;
      float var31 = this.implements_ * var19 + this.finally_ * var10 + this.extends_ * var22;
      float var32 = this.implements_ * var21 + this.finally_ * var23 + this.extends_ * var11;
      float var33 = this.volatile_ * var9 + this.final_ * var18 + this.package_ * var20;
      float var34 = this.volatile_ * var19 + this.final_ * var10 + this.package_ * var22;
      float var35 = this.volatile_ * var21 + this.final_ * var23 + this.package_ * var11;
      this.class_ = var24;
      this.break_ = var25;
      this.byte_ = var26;
      this.throws_ = var27;
      this.case_ = var28;
      this.catch_ = var29;
      this.implements_ = var30;
      this.finally_ = var31;
      this.extends_ = var32;
      this.volatile_ = var33;
      this.final_ = var34;
      this.package_ = var35;
   }

   public static rjV_2 case_(float var0, float var1, float var2) {
      rjV_2 var3 = new rjV_2();
      var3.class_ = 1.0F;
      var3.case_ = 1.0F;
      var3.extends_ = 1.0F;
      var3.int_ = 1.0F;
      var3.protected_ = var0;
      var3.private_ = var1;
      var3.native_ = var2;
      return var3;
   }

   public rjV_2 case_() {
      return new rjV_2(this);
   }

   public void protected_() {
      float var1 = this.throws_;
      this.throws_ = this.break_;
      this.break_ = var1;
      var1 = this.implements_;
      this.implements_ = this.byte_;
      this.byte_ = var1;
      var1 = this.finally_;
      this.finally_ = this.catch_;
      this.catch_ = var1;
      var1 = this.volatile_;
      this.volatile_ = this.protected_;
      this.protected_ = var1;
      var1 = this.final_;
      this.final_ = this.private_;
      this.private_ = var1;
      var1 = this.package_;
      this.package_ = this.native_;
      this.native_ = var1;
   }

   @Override
   public float protected_(float var1, float var2, float var3) {
      return this.implements_ * var1 + this.finally_ * var2 + this.extends_ * var3 + this.native_;
   }

   public float protected_(float var1, float var2, float var3, float var4) {
      return this.implements_ * var1 + this.finally_ * var2 + this.extends_ * var3 + this.native_ * var4;
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
      float var12 = this.throws_ * var5 + this.catch_ * var8;
      float var13 = this.throws_ * var9 + this.catch_ * var6;
      float var14 = this.implements_ * var5 + this.extends_ * var8;
      float var15 = this.implements_ * var9 + this.extends_ * var6;
      float var16 = this.volatile_ * var5 + this.package_ * var8;
      float var17 = this.volatile_ * var9 + this.package_ * var6;
      this.class_ = var10;
      this.byte_ = var11;
      this.throws_ = var12;
      this.catch_ = var13;
      this.implements_ = var14;
      this.extends_ = var15;
      this.volatile_ = var16;
      this.package_ = var17;
   }

   public void private_(float var1, float var2, float var3) {
      this.class_ *= var1;
      this.break_ *= var2;
      this.byte_ *= var3;
      this.throws_ *= var1;
      this.case_ *= var2;
      this.catch_ *= var3;
      this.implements_ *= var1;
      this.finally_ *= var2;
      this.extends_ *= var3;
      this.volatile_ *= var1;
      this.final_ *= var2;
      this.package_ *= var3;
   }
}

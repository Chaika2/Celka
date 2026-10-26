package celestial;

import com.mojang.datafixers.util.Pair;
import java.util.Random;
import org.apache.commons.lang3.tuple.Triple;

public final class rjj_3 implements rfe_3 {
   private static final float id_finally = 3.0F + 2.0F * (float)Math.sqrt(2.0);
   private static final float id_extends = (float)Math.cos(Math.PI / 8);
   private static final float id_native = (float)Math.sin(Math.PI / 8);
   private static final float id_volatile = 1.0F / (float)Math.sqrt(2.0);
   protected float id_class;
   protected float id_break;
   protected float id_byte;
   protected float id_protected;
   protected float id_throws;
   protected float id_case;
   protected float id_catch;
   protected float id_private;
   protected float id_implements;

   private void id_byte(rjY_2 var1) {
      float var2 = var1.id_class();
      float var3 = var1.id_protected();
      float var4 = 2.0F * var2 * var2;
      float var5 = 1.0F - var4;
      float var6 = 1.0F - var4;
      float var7 = var2 * var3;
      float var8 = 2.0F * var7;
      float var9 = 2.0F * -var7;
      float var10 = this.id_break * var5 + this.id_byte * var8;
      float var11 = this.id_break * var9 + this.id_byte * var6;
      float var12 = this.id_throws * var5 + this.id_case * var8;
      float var13 = this.id_throws * var9 + this.id_case * var6;
      float var14 = this.id_private * var5 + this.id_implements * var8;
      float var15 = this.id_private * var9 + this.id_implements * var6;
      this.id_break = var10;
      this.id_byte = var11;
      this.id_throws = var12;
      this.id_case = var13;
      this.id_private = var14;
      this.id_implements = var15;
   }

   public void id_byte(rjj_3 var1) {
      rjj_3 var2 = var1.id_case();
      var2.id_break(this);
      this.id_class(var2);
   }

   @Override
   public float id_byte(float var1, float var2, float var3) {
      return this.id_catch * var1 + this.id_private * var2 + this.id_implements * var3;
   }

   public void id_byte() {
      this.id_class = 1.0F;
      this.id_break = 0.0F;
      this.id_byte = 0.0F;
      this.id_protected = 0.0F;
      this.id_throws = 1.0F;
      this.id_case = 0.0F;
      this.id_catch = 0.0F;
      this.id_private = 0.0F;
      this.id_implements = 1.0F;
   }

   public rjj_3() {
   }

   public rjj_3(rjY_2 var1) {
      float var2 = var1.id_class();
      float var3 = var1.id_break();
      float var4 = var1.id_byte();
      float var5 = var1.id_protected();
      float var6 = 2.0F * var2 * var2;
      float var7 = 2.0F * var3 * var3;
      float var8 = 2.0F * var4 * var4;
      this.id_class = 1.0F - var7 - var8;
      this.id_throws = 1.0F - var8 - var6;
      this.id_implements = 1.0F - var6 - var7;
      float var9 = var2 * var3;
      float var10 = var3 * var4;
      float var11 = var4 * var2;
      float var12 = var2 * var5;
      float var13 = var3 * var5;
      float var14 = var4 * var5;
      this.id_protected = 2.0F * (var9 + var14);
      this.id_break = 2.0F * (var9 - var14);
      this.id_catch = 2.0F * (var11 - var13);
      this.id_byte = 2.0F * (var11 + var13);
      this.id_private = 2.0F * (var10 + var12);
      this.id_case = 2.0F * (var10 - var12);
   }

   public rjj_3(rjV_2 var1) {
      this.id_class = var1.id_class;
      this.id_break = var1.id_break;
      this.id_byte = var1.id_byte;
      this.id_protected = var1.id_throws;
      this.id_throws = var1.id_case;
      this.id_case = var1.id_catch;
      this.id_catch = var1.id_implements;
      this.id_private = var1.id_finally;
      this.id_implements = var1.id_extends;
   }

   public rjj_3(rjj_3 var1) {
      this.id_class = var1.id_class;
      this.id_break = var1.id_break;
      this.id_byte = var1.id_byte;
      this.id_protected = var1.id_protected;
      this.id_throws = var1.id_throws;
      this.id_case = var1.id_case;
      this.id_catch = var1.id_catch;
      this.id_private = var1.id_private;
      this.id_implements = var1.id_implements;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rjj_3 var2 = (rjj_3)var1;
         return Float.compare(var2.id_class, this.id_class) == 0
            && Float.compare(var2.id_break, this.id_break) == 0
            && Float.compare(var2.id_byte, this.id_byte) == 0
            && Float.compare(var2.id_protected, this.id_protected) == 0
            && Float.compare(var2.id_throws, this.id_throws) == 0
            && Float.compare(var2.id_case, this.id_case) == 0
            && Float.compare(var2.id_catch, this.id_catch) == 0
            && Float.compare(var2.id_private, this.id_private) == 0
            && Float.compare(var2.id_implements, this.id_implements) == 0;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Matrix3f:\n");
      var1.append(this.id_class);
      var1.append(" ");
      var1.append(this.id_break);
      var1.append(" ");
      var1.append(this.id_byte);
      var1.append("\n");
      var1.append(this.id_protected);
      var1.append(" ");
      var1.append(this.id_throws);
      var1.append(" ");
      var1.append(this.id_case);
      var1.append("\n");
      var1.append(this.id_catch);
      var1.append(" ");
      var1.append(this.id_private);
      var1.append(" ");
      var1.append(this.id_implements);
      var1.append("\n");
      return var1.toString();
   }

   @Override
   public int hashCode() {
      int var1 = this.id_class != 0.0F ? Float.floatToIntBits(this.id_class) : 0;
      var1 = 31 * var1 + (this.id_break != 0.0F ? Float.floatToIntBits(this.id_break) : 0);
      var1 = 31 * var1 + (this.id_byte != 0.0F ? Float.floatToIntBits(this.id_byte) : 0);
      var1 = 31 * var1 + (this.id_protected != 0.0F ? Float.floatToIntBits(this.id_protected) : 0);
      var1 = 31 * var1 + (this.id_throws != 0.0F ? Float.floatToIntBits(this.id_throws) : 0);
      var1 = 31 * var1 + (this.id_case != 0.0F ? Float.floatToIntBits(this.id_case) : 0);
      var1 = 31 * var1 + (this.id_catch != 0.0F ? Float.floatToIntBits(this.id_catch) : 0);
      var1 = 31 * var1 + (this.id_private != 0.0F ? Float.floatToIntBits(this.id_private) : 0);
      return 31 * var1 + (this.id_implements != 0.0F ? Float.floatToIntBits(this.id_implements) : 0);
   }

   private static Pair<Float, Float> id_class(float var0, float var1) {
      float var2 = (float)Math.hypot((double)var0, (double)var1);
      float var3 = var2 > 1.0E-6F ? var1 : 0.0F;
      float var4 = Math.abs(var0) + Math.max(var2, 1.0E-6F);
      if (var0 < 0.0F) {
         float var5 = var3;
         var3 = var4;
         var4 = var5;
      }

      float var8 = rfU_2.id_implements(var4 * var4 + var3 * var3);
      var4 *= var8;
      var3 *= var8;
      return Pair.of(var3, var4);
   }

   @Override
   public void id_class(rjY_2 var1) {
      boolean var2 = var1.id_class() != 0.0F;
      boolean var3 = var1.id_break() != 0.0F;
      boolean var4 = var1.id_byte() != 0.0F;
      if (var2) {
         if (!var3 && !var4) {
            this.id_byte(var1);
         } else {
            this.id_case(var1);
         }
      } else if (var3) {
         if (!var4) {
            this.id_protected(var1);
         } else {
            this.id_case(var1);
         }
      } else if (var4) {
         this.id_throws(var1);
      }
   }

   public void id_class(int var1, int var2, float var3) {
      if (var1 == 0) {
         if (var2 == 0) {
            this.id_class = var3;
         } else if (var2 == 1) {
            this.id_break = var3;
         } else {
            this.id_byte = var3;
         }
      } else if (var1 == 1) {
         if (var2 == 0) {
            this.id_protected = var3;
         } else if (var2 == 1) {
            this.id_throws = var3;
         } else {
            this.id_case = var3;
         }
      } else if (var2 == 0) {
         this.id_catch = var3;
      } else if (var2 == 1) {
         this.id_private = var3;
      } else {
         this.id_implements = var3;
      }
   }

   public void id_class(Random var1) {
      this.id_class = var1.nextFloat();
      this.id_break = var1.nextFloat();
      this.id_byte = var1.nextFloat();
      this.id_protected = var1.nextFloat();
      this.id_throws = var1.nextFloat();
      this.id_case = var1.nextFloat();
      this.id_catch = var1.nextFloat();
      this.id_private = var1.nextFloat();
      this.id_implements = var1.nextFloat();
   }

   public void id_class(float var1) {
      this.id_class *= var1;
      this.id_break *= var1;
      this.id_byte *= var1;
      this.id_protected *= var1;
      this.id_throws *= var1;
      this.id_case *= var1;
      this.id_catch *= var1;
      this.id_private *= var1;
      this.id_implements *= var1;
   }

   public void id_class(rjj_3 var1) {
      this.id_class = var1.id_class;
      this.id_break = var1.id_break;
      this.id_byte = var1.id_byte;
      this.id_protected = var1.id_protected;
      this.id_throws = var1.id_throws;
      this.id_case = var1.id_case;
      this.id_catch = var1.id_catch;
      this.id_private = var1.id_private;
      this.id_implements = var1.id_implements;
   }

   @Override
   public int id_class(rpr_3 var1) {
      rja_3 var2 = var1.id_int();
      float var3 = (float)var2.b_();
      float var4 = (float)var2.c_();
      float var5 = (float)var2.d_();
      float var6 = this.id_class * var3 + this.id_break * var4 + this.id_byte * var5;
      float var7 = this.id_protected * var3 + this.id_throws * var4 + this.id_case * var5;
      float var8 = this.id_catch * var3 + this.id_private * var4 + this.id_implements * var5;
      return rjP_2.id_class(var6, var7, var8);
   }

   @Override
   public float id_class(float var1, float var2, float var3) {
      return this.id_class * var1 + this.id_break * var2 + this.id_byte * var3;
   }

   public void id_class() {
      float var1 = this.id_break;
      this.id_break = this.id_protected;
      this.id_protected = var1;
      var1 = this.id_byte;
      this.id_byte = this.id_catch;
      this.id_catch = var1;
      var1 = this.id_case;
      this.id_case = this.id_private;
      this.id_private = var1;
   }

   public void id_break(rjj_3 var1) {
      float var2 = this.id_class * var1.id_class + this.id_break * var1.id_protected + this.id_byte * var1.id_catch;
      float var3 = this.id_class * var1.id_break + this.id_break * var1.id_throws + this.id_byte * var1.id_private;
      float var4 = this.id_class * var1.id_byte + this.id_break * var1.id_case + this.id_byte * var1.id_implements;
      float var5 = this.id_protected * var1.id_class + this.id_throws * var1.id_protected + this.id_case * var1.id_catch;
      float var6 = this.id_protected * var1.id_break + this.id_throws * var1.id_throws + this.id_case * var1.id_private;
      float var7 = this.id_protected * var1.id_byte + this.id_throws * var1.id_case + this.id_case * var1.id_implements;
      float var8 = this.id_catch * var1.id_class + this.id_private * var1.id_protected + this.id_implements * var1.id_catch;
      float var9 = this.id_catch * var1.id_break + this.id_private * var1.id_throws + this.id_implements * var1.id_private;
      float var10 = this.id_catch * var1.id_byte + this.id_private * var1.id_case + this.id_implements * var1.id_implements;
      this.id_class = var2;
      this.id_break = var3;
      this.id_byte = var4;
      this.id_protected = var5;
      this.id_throws = var6;
      this.id_case = var7;
      this.id_catch = var8;
      this.id_private = var9;
      this.id_implements = var10;
   }

   @Override
   public float id_break(float var1, float var2, float var3) {
      return this.id_protected * var1 + this.id_throws * var2 + this.id_case * var3;
   }

   public Triple<rjY_2, rje_3, rjY_2> id_break() {
      rjY_2 var1 = rjY_2.id_class.id_catch();
      rjY_2 var2 = rjY_2.id_class.id_catch();
      rjj_3 var3 = this.id_case();
      var3.id_class();
      var3.id_break(this);

      for (int var4 = 0; var4 < 5; var4++) {
         var2.id_class(id_protected(var3));
      }

      var2.id_case();
      rjj_3 var29 = new rjj_3(this);
      var29.id_break(new rjj_3(var2));
      float var5 = 1.0F;
      Pair var6 = id_class(var29.id_class, var29.id_protected);
      Float var7 = (Float)var6.getFirst();
      Float var8 = (Float)var6.getSecond();
      float var9 = var8 * var8 - var7 * var7;
      float var10 = -2.0F * var7 * var8;
      float var11 = var8 * var8 + var7 * var7;
      rjY_2 var12 = new rjY_2(0.0F, 0.0F, var7, var8);
      var1.id_class(var12);
      rjj_3 var13 = new rjj_3();
      var13.id_byte();
      var13.id_class = var9;
      var13.id_throws = var9;
      var13.id_protected = var10;
      var13.id_break = -var10;
      var13.id_implements = var11;
      var5 *= var11;
      var13.id_break(var29);
      var6 = id_class(var13.id_class, var13.id_catch);
      float var14 = -(Float)var6.getFirst();
      Float var15 = (Float)var6.getSecond();
      float var16 = var15 * var15 - var14 * var14;
      float var17 = -2.0F * var14 * var15;
      float var18 = var15 * var15 + var14 * var14;
      rjY_2 var19 = new rjY_2(0.0F, var14, 0.0F, var15);
      var1.id_class(var19);
      rjj_3 var20 = new rjj_3();
      var20.id_byte();
      var20.id_class = var16;
      var20.id_implements = var16;
      var20.id_catch = -var17;
      var20.id_byte = var17;
      var20.id_throws = var18;
      var5 *= var18;
      var20.id_break(var13);
      var6 = id_class(var20.id_throws, var20.id_private);
      Float var21 = (Float)var6.getFirst();
      Float var22 = (Float)var6.getSecond();
      float var23 = var22 * var22 - var21 * var21;
      float var24 = -2.0F * var21 * var22;
      float var25 = var22 * var22 + var21 * var21;
      rjY_2 var26 = new rjY_2(var21, 0.0F, 0.0F, var22);
      var1.id_class(var26);
      rjj_3 var27 = new rjj_3();
      var27.id_byte();
      var27.id_throws = var23;
      var27.id_implements = var23;
      var27.id_private = var24;
      var27.id_case = -var24;
      var27.id_class = var25;
      var5 *= var25;
      var27.id_break(var20);
      var5 = 1.0F / var5;
      var1.id_class((float)Math.sqrt((double)var5));
      rje_3 var28 = new rje_3(var27.id_class * var5, var27.id_throws * var5, var27.id_implements * var5);
      return Triple.of(var1, var28, var2);
   }

   public void id_break(rjY_2 var1) {
      float var2 = var1.id_class();
      float var3 = var1.id_break();
      float var4 = var1.id_byte();
      float var5 = var1.id_protected();
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
      float var24 = this.id_class * var15 + this.id_break * var18 + this.id_byte * var21;
      float var25 = this.id_class * var16 + this.id_break * var19 + this.id_byte * var22;
      float var26 = this.id_class * var17 + this.id_break * var20 + this.id_byte * var23;
      float var27 = this.id_protected * var15 + this.id_throws * var18 + this.id_case * var21;
      float var28 = this.id_protected * var16 + this.id_throws * var19 + this.id_case * var22;
      float var29 = this.id_protected * var17 + this.id_throws * var20 + this.id_case * var23;
      float var30 = this.id_catch * var15 + this.id_private * var18 + this.id_implements * var21;
      float var31 = this.id_catch * var16 + this.id_private * var19 + this.id_implements * var22;
      float var32 = this.id_catch * var17 + this.id_private * var20 + this.id_implements * var23;
      this.id_class = var24;
      this.id_break = var25;
      this.id_byte = var26;
      this.id_protected = var27;
      this.id_throws = var28;
      this.id_case = var29;
      this.id_catch = var30;
      this.id_private = var31;
      this.id_implements = var32;
   }

   private void id_throws(rjY_2 var1) {
      float var2 = var1.id_byte();
      float var3 = var1.id_protected();
      float var4 = 2.0F * var2 * var2;
      float var5 = 1.0F - var4;
      float var6 = 1.0F - var4;
      float var7 = var2 * var3;
      float var8 = 2.0F * (0.0F + var7);
      float var9 = 2.0F * (0.0F - var7);
      float var10 = this.id_class * var5 + this.id_break * var8;
      float var11 = this.id_class * var9 + this.id_break * var6;
      float var12 = this.id_protected * var5 + this.id_throws * var8;
      float var13 = this.id_protected * var9 + this.id_throws * var6;
      float var14 = this.id_catch * var5 + this.id_private * var8;
      float var15 = this.id_catch * var9 + this.id_private * var6;
      this.id_class = var10;
      this.id_break = var11;
      this.id_protected = var12;
      this.id_throws = var13;
      this.id_catch = var14;
      this.id_private = var15;
   }

   public boolean id_throws() {
      float var1 = this.id_protected();
      if (Math.abs(var1) > 1.0E-6F) {
         this.id_class(var1);
         return true;
      } else {
         return false;
      }
   }

   public float id_throws(float var1, float var2, float var3) {
      return this.id_class * var1 + this.id_break * var2 + this.id_byte * var3;
   }

   public float id_catch(float var1, float var2, float var3) {
      return this.id_catch * var1 + this.id_private * var2 + this.id_implements * var3;
   }

   public float id_case(float var1, float var2, float var3) {
      return this.id_protected * var1 + this.id_throws * var2 + this.id_case * var3;
   }

   private void id_case(rjY_2 var1) {
      float var2 = var1.id_class();
      float var3 = var1.id_break();
      float var4 = var1.id_byte();
      float var5 = var1.id_protected();
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
      float var24 = this.id_class * var9 + this.id_break * var18 + this.id_byte * var20;
      float var25 = this.id_class * var19 + this.id_break * var10 + this.id_byte * var22;
      float var26 = this.id_class * var21 + this.id_break * var23 + this.id_byte * var11;
      float var27 = this.id_protected * var9 + this.id_throws * var18 + this.id_case * var20;
      float var28 = this.id_protected * var19 + this.id_throws * var10 + this.id_case * var22;
      float var29 = this.id_protected * var21 + this.id_throws * var23 + this.id_case * var11;
      float var30 = this.id_catch * var9 + this.id_private * var18 + this.id_implements * var20;
      float var31 = this.id_catch * var19 + this.id_private * var10 + this.id_implements * var22;
      float var32 = this.id_catch * var21 + this.id_private * var23 + this.id_implements * var11;
      this.id_class = var24;
      this.id_break = var25;
      this.id_byte = var26;
      this.id_protected = var27;
      this.id_throws = var28;
      this.id_case = var29;
      this.id_catch = var30;
      this.id_private = var31;
      this.id_implements = var32;
   }

   public rjj_3 id_case() {
      return new rjj_3(this);
   }

   public static rjj_3 id_protected(float var0, float var1, float var2) {
      rjj_3 var3 = new rjj_3();
      var3.id_class = var0;
      var3.id_throws = var1;
      var3.id_implements = var2;
      return var3;
   }

   private void id_protected(rjY_2 var1) {
      float var2 = var1.id_break();
      float var3 = var1.id_protected();
      float var4 = 2.0F * var2 * var2;
      float var5 = 1.0F - var4;
      float var6 = 1.0F - var4;
      float var7 = var2 * var3;
      float var8 = 2.0F * -var7;
      float var9 = 2.0F * var7;
      float var10 = this.id_class * var5 + this.id_byte * var8;
      float var11 = this.id_class * var9 + this.id_byte * var6;
      float var12 = this.id_protected * var5 + this.id_case * var8;
      float var13 = this.id_protected * var9 + this.id_case * var6;
      float var14 = this.id_catch * var5 + this.id_implements * var8;
      float var15 = this.id_catch * var9 + this.id_implements * var6;
      this.id_class = var10;
      this.id_byte = var11;
      this.id_protected = var12;
      this.id_case = var13;
      this.id_catch = var14;
      this.id_implements = var15;
   }

   public float id_protected() {
      float var1 = this.id_throws * this.id_implements - this.id_case * this.id_private;
      float var2 = -(this.id_protected * this.id_implements - this.id_case * this.id_catch);
      float var3 = this.id_protected * this.id_private - this.id_throws * this.id_catch;
      float var4 = -(this.id_break * this.id_implements - this.id_byte * this.id_private);
      float var5 = this.id_class * this.id_implements - this.id_byte * this.id_catch;
      float var6 = -(this.id_class * this.id_private - this.id_break * this.id_catch);
      float var7 = this.id_break * this.id_case - this.id_byte * this.id_throws;
      float var8 = -(this.id_class * this.id_case - this.id_byte * this.id_protected);
      float var9 = this.id_class * this.id_throws - this.id_break * this.id_protected;
      float var10 = this.id_class * var1 + this.id_break * var2 + this.id_byte * var3;
      this.id_class = var1;
      this.id_protected = var2;
      this.id_catch = var3;
      this.id_break = var4;
      this.id_throws = var5;
      this.id_private = var6;
      this.id_byte = var7;
      this.id_case = var8;
      this.id_implements = var9;
      return var10;
   }

   private static rjY_2 id_protected(rjj_3 var0) {
      rjj_3 var1 = new rjj_3();
      rjY_2 var2 = rjY_2.id_class.id_catch();
      if (var0.id_break * var0.id_break + var0.id_protected * var0.id_protected > 1.0E-6F) {
         Pair var3 = id_private(var0.id_class, 0.5F * (var0.id_break + var0.id_protected), var0.id_throws);
         Float var4 = (Float)var3.getFirst();
         Float var5 = (Float)var3.getSecond();
         rjY_2 var6 = new rjY_2(0.0F, 0.0F, var4, var5);
         float var7 = var5 * var5 - var4 * var4;
         float var8 = -2.0F * var4 * var5;
         float var9 = var5 * var5 + var4 * var4;
         var2.id_class(var6);
         var1.id_byte();
         var1.id_class = var7;
         var1.id_throws = var7;
         var1.id_protected = -var8;
         var1.id_break = var8;
         var1.id_implements = var9;
         var0.id_break(var1);
         var1.id_class();
         var1.id_break(var0);
         var0.id_class(var1);
      }

      if (var0.id_byte * var0.id_byte + var0.id_catch * var0.id_catch > 1.0E-6F) {
         Pair var10 = id_private(var0.id_class, 0.5F * (var0.id_byte + var0.id_catch), var0.id_implements);
         float var12 = -(Float)var10.getFirst();
         Float var14 = (Float)var10.getSecond();
         rjY_2 var16 = new rjY_2(0.0F, var12, 0.0F, var14);
         float var18 = var14 * var14 - var12 * var12;
         float var20 = -2.0F * var12 * var14;
         float var22 = var14 * var14 + var12 * var12;
         var2.id_class(var16);
         var1.id_byte();
         var1.id_class = var18;
         var1.id_implements = var18;
         var1.id_catch = var20;
         var1.id_byte = -var20;
         var1.id_throws = var22;
         var0.id_break(var1);
         var1.id_class();
         var1.id_break(var0);
         var0.id_class(var1);
      }

      if (var0.id_case * var0.id_case + var0.id_private * var0.id_private > 1.0E-6F) {
         Pair var11 = id_private(var0.id_throws, 0.5F * (var0.id_case + var0.id_private), var0.id_implements);
         Float var13 = (Float)var11.getFirst();
         Float var15 = (Float)var11.getSecond();
         rjY_2 var17 = new rjY_2(var13, 0.0F, 0.0F, var15);
         float var19 = var15 * var15 - var13 * var13;
         float var21 = -2.0F * var13 * var15;
         float var23 = var15 * var15 + var13 * var13;
         var2.id_class(var17);
         var1.id_byte();
         var1.id_throws = var19;
         var1.id_implements = var19;
         var1.id_private = -var21;
         var1.id_case = var21;
         var1.id_class = var23;
         var0.id_break(var1);
         var1.id_class();
         var1.id_break(var0);
         var0.id_class(var1);
      }

      return var2;
   }

   private static Pair<Float, Float> id_private(float var0, float var1, float var2) {
      float var3 = 2.0F * (var0 - var2);
      if (id_finally * var1 * var1 < var3 * var3) {
         float var4 = rfU_2.id_implements(var1 * var1 + var3 * var3);
         return Pair.of(var4 * var1, var4 * var3);
      } else {
         return Pair.of(id_native, id_extends);
      }
   }
}

package celestial;

import java.nio.FloatBuffer;
import java.util.Random;

public final class rjV_2 implements rfa_3 {
   public float id_class;
   public float id_break;
   public float id_byte;
   public float id_protected;
   public float id_throws;
   public float id_case;
   public float id_catch;
   public float id_private;
   public float id_implements;
   public float id_finally;
   public float id_extends;
   public float id_native;
   public float id_volatile;
   public float id_final;
   public float id_package;
   public float id_int;

   public float id_byte() {
      float var1 = this.id_class * this.id_case - this.id_break * this.id_throws;
      float var2 = this.id_class * this.id_catch - this.id_byte * this.id_throws;
      float var3 = this.id_class * this.id_private - this.id_protected * this.id_throws;
      float var4 = this.id_break * this.id_catch - this.id_byte * this.id_case;
      float var5 = this.id_break * this.id_private - this.id_protected * this.id_case;
      float var6 = this.id_byte * this.id_private - this.id_protected * this.id_catch;
      float var7 = this.id_implements * this.id_final - this.id_finally * this.id_volatile;
      float var8 = this.id_implements * this.id_package - this.id_extends * this.id_volatile;
      float var9 = this.id_implements * this.id_int - this.id_native * this.id_volatile;
      float var10 = this.id_finally * this.id_package - this.id_extends * this.id_final;
      float var11 = this.id_finally * this.id_int - this.id_native * this.id_final;
      float var12 = this.id_extends * this.id_int - this.id_native * this.id_package;
      float var13 = this.id_case * var12 - this.id_catch * var11 + this.id_private * var10;
      float var14 = -this.id_throws * var12 + this.id_catch * var9 - this.id_private * var8;
      float var15 = this.id_throws * var11 - this.id_case * var9 + this.id_private * var7;
      float var16 = -this.id_throws * var10 + this.id_case * var8 - this.id_catch * var7;
      float var17 = -this.id_break * var12 + this.id_byte * var11 - this.id_protected * var10;
      float var18 = this.id_class * var12 - this.id_byte * var9 + this.id_protected * var8;
      float var19 = -this.id_class * var11 + this.id_break * var9 - this.id_protected * var7;
      float var20 = this.id_class * var10 - this.id_break * var8 + this.id_byte * var7;
      float var21 = this.id_final * var6 - this.id_package * var5 + this.id_int * var4;
      float var22 = -this.id_volatile * var6 + this.id_package * var3 - this.id_int * var2;
      float var23 = this.id_volatile * var5 - this.id_final * var3 + this.id_int * var1;
      float var24 = -this.id_volatile * var4 + this.id_final * var2 - this.id_package * var1;
      float var25 = -this.id_finally * var6 + this.id_extends * var5 - this.id_native * var4;
      float var26 = this.id_implements * var6 - this.id_extends * var3 + this.id_native * var2;
      float var27 = -this.id_implements * var5 + this.id_finally * var3 - this.id_native * var1;
      float var28 = this.id_implements * var4 - this.id_finally * var2 + this.id_extends * var1;
      this.id_class = var13;
      this.id_throws = var14;
      this.id_implements = var15;
      this.id_volatile = var16;
      this.id_break = var17;
      this.id_case = var18;
      this.id_finally = var19;
      this.id_final = var20;
      this.id_byte = var21;
      this.id_catch = var22;
      this.id_extends = var23;
      this.id_package = var24;
      this.id_protected = var25;
      this.id_private = var26;
      this.id_native = var27;
      this.id_int = var28;
      return var1 * var12 - var2 * var11 + var3 * var10 + var4 * var9 - var5 * var8 + var6 * var7;
   }

   @Override
   public float id_byte(float var1, float var2, float var3) {
      return this.id_throws * var1 + this.id_case * var2 + this.id_catch * var3 + this.id_private;
   }

   public float id_byte(float var1, float var2, float var3, float var4) {
      return this.id_throws * var1 + this.id_case * var2 + this.id_catch * var3 + this.id_private * var4;
   }

   public void id_byte(rjV_2 var1) {
      this.id_class = this.id_class + var1.id_class;
      this.id_break = this.id_break + var1.id_break;
      this.id_byte = this.id_byte + var1.id_byte;
      this.id_protected = this.id_protected + var1.id_protected;
      this.id_throws = this.id_throws + var1.id_throws;
      this.id_case = this.id_case + var1.id_case;
      this.id_catch = this.id_catch + var1.id_catch;
      this.id_private = this.id_private + var1.id_private;
      this.id_implements = this.id_implements + var1.id_implements;
      this.id_finally = this.id_finally + var1.id_finally;
      this.id_extends = this.id_extends + var1.id_extends;
      this.id_native = this.id_native + var1.id_native;
      this.id_volatile = this.id_volatile + var1.id_volatile;
      this.id_final = this.id_final + var1.id_final;
      this.id_package = this.id_package + var1.id_package;
      this.id_int = this.id_int + var1.id_int;
   }

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
      float var12 = this.id_case * var5 + this.id_catch * var8;
      float var13 = this.id_case * var9 + this.id_catch * var6;
      float var14 = this.id_finally * var5 + this.id_extends * var8;
      float var15 = this.id_finally * var9 + this.id_extends * var6;
      float var16 = this.id_final * var5 + this.id_package * var8;
      float var17 = this.id_final * var9 + this.id_package * var6;
      this.id_break = var10;
      this.id_byte = var11;
      this.id_case = var12;
      this.id_catch = var13;
      this.id_finally = var14;
      this.id_extends = var15;
      this.id_final = var16;
      this.id_package = var17;
   }

   public rjV_2(float[] var1) {
      this.id_class = var1[0];
      this.id_break = var1[1];
      this.id_byte = var1[2];
      this.id_protected = var1[3];
      this.id_throws = var1[4];
      this.id_case = var1[5];
      this.id_catch = var1[6];
      this.id_private = var1[7];
      this.id_implements = var1[8];
      this.id_finally = var1[9];
      this.id_extends = var1[10];
      this.id_native = var1[11];
      this.id_volatile = var1[12];
      this.id_final = var1[13];
      this.id_package = var1[14];
      this.id_int = var1[15];
   }

   public rjV_2(rjV_2 var1) {
      this.id_class = var1.id_class;
      this.id_break = var1.id_break;
      this.id_byte = var1.id_byte;
      this.id_protected = var1.id_protected;
      this.id_throws = var1.id_throws;
      this.id_case = var1.id_case;
      this.id_catch = var1.id_catch;
      this.id_private = var1.id_private;
      this.id_implements = var1.id_implements;
      this.id_finally = var1.id_finally;
      this.id_extends = var1.id_extends;
      this.id_native = var1.id_native;
      this.id_volatile = var1.id_volatile;
      this.id_final = var1.id_final;
      this.id_package = var1.id_package;
      this.id_int = var1.id_int;
   }

   public rjV_2() {
   }

   public rjV_2(rjY_2 var1) {
      float var2 = var1.id_class();
      float var3 = var1.id_break();
      float var4 = var1.id_byte();
      float var5 = var1.id_protected();
      float var6 = 2.0F * var2 * var2;
      float var7 = 2.0F * var3 * var3;
      float var8 = 2.0F * var4 * var4;
      this.id_class = 1.0F - var7 - var8;
      this.id_case = 1.0F - var8 - var6;
      this.id_extends = 1.0F - var6 - var7;
      this.id_int = 1.0F;
      float var9 = var2 * var3;
      float var10 = var3 * var4;
      float var11 = var4 * var2;
      float var12 = var2 * var5;
      float var13 = var3 * var5;
      float var14 = var4 * var5;
      this.id_throws = 2.0F * (var9 + var14);
      this.id_break = 2.0F * (var9 - var14);
      this.id_implements = 2.0F * (var11 - var13);
      this.id_byte = 2.0F * (var11 + var13);
      this.id_finally = 2.0F * (var10 + var12);
      this.id_catch = 2.0F * (var10 - var12);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rjV_2 var2 = (rjV_2)var1;
         return Float.compare(var2.id_class, this.id_class) == 0
            && Float.compare(var2.id_break, this.id_break) == 0
            && Float.compare(var2.id_byte, this.id_byte) == 0
            && Float.compare(var2.id_protected, this.id_protected) == 0
            && Float.compare(var2.id_throws, this.id_throws) == 0
            && Float.compare(var2.id_case, this.id_case) == 0
            && Float.compare(var2.id_catch, this.id_catch) == 0
            && Float.compare(var2.id_private, this.id_private) == 0
            && Float.compare(var2.id_implements, this.id_implements) == 0
            && Float.compare(var2.id_finally, this.id_finally) == 0
            && Float.compare(var2.id_extends, this.id_extends) == 0
            && Float.compare(var2.id_native, this.id_native) == 0
            && Float.compare(var2.id_volatile, this.id_volatile) == 0
            && Float.compare(var2.id_final, this.id_final) == 0
            && Float.compare(var2.id_package, this.id_package) == 0
            && Float.compare(var2.id_int, this.id_int) == 0;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "Matrix4f:\n"
         + this.id_class
         + " "
         + this.id_break
         + " "
         + this.id_byte
         + " "
         + this.id_protected
         + "\n"
         + this.id_throws
         + " "
         + this.id_case
         + " "
         + this.id_catch
         + " "
         + this.id_private
         + "\n"
         + this.id_implements
         + " "
         + this.id_finally
         + " "
         + this.id_extends
         + " "
         + this.id_native
         + "\n"
         + this.id_volatile
         + " "
         + this.id_final
         + " "
         + this.id_package
         + " "
         + this.id_int
         + "\n";
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
      var1 = 31 * var1 + (this.id_implements != 0.0F ? Float.floatToIntBits(this.id_implements) : 0);
      var1 = 31 * var1 + (this.id_finally != 0.0F ? Float.floatToIntBits(this.id_finally) : 0);
      var1 = 31 * var1 + (this.id_extends != 0.0F ? Float.floatToIntBits(this.id_extends) : 0);
      var1 = 31 * var1 + (this.id_native != 0.0F ? Float.floatToIntBits(this.id_native) : 0);
      var1 = 31 * var1 + (this.id_volatile != 0.0F ? Float.floatToIntBits(this.id_volatile) : 0);
      var1 = 31 * var1 + (this.id_final != 0.0F ? Float.floatToIntBits(this.id_final) : 0);
      var1 = 31 * var1 + (this.id_package != 0.0F ? Float.floatToIntBits(this.id_package) : 0);
      return 31 * var1 + (this.id_int != 0.0F ? Float.floatToIntBits(this.id_int) : 0);
   }

   public static rjV_2 id_class(float var0, float var1, float var2, float var3) {
      rjV_2 var4 = new rjV_2();
      var4.id_class = 2.0F / var0;
      var4.id_case = 2.0F / var1;
      float var5 = var3 - var2;
      var4.id_extends = -2.0F / var5;
      var4.id_int = 1.0F;
      var4.id_protected = -1.0F;
      var4.id_private = -1.0F;
      var4.id_native = -(var3 + var2) / var5;
      return var4;
   }

   public void id_class(rje_3 var1) {
      this.id_protected = this.id_protected + var1.id_class();
      this.id_private = this.id_private + var1.id_break();
      this.id_native = this.id_native + var1.id_byte();
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
      this.id_finally = var1.nextFloat();
      this.id_extends = var1.nextFloat();
      this.id_native = var1.nextFloat();
      this.id_volatile = var1.nextFloat();
      this.id_final = var1.nextFloat();
      this.id_package = var1.nextFloat();
      this.id_int = var1.nextFloat();
   }

   public void id_class(float[] var1) {
      var1[0] = this.id_class;
      var1[1] = this.id_break;
      var1[2] = this.id_byte;
      var1[3] = this.id_protected;
      var1[4] = this.id_throws;
      var1[5] = this.id_case;
      var1[6] = this.id_catch;
      var1[7] = this.id_private;
      var1[8] = this.id_implements;
      var1[9] = this.id_finally;
      var1[10] = this.id_extends;
      var1[11] = this.id_native;
      var1[12] = this.id_volatile;
      var1[13] = this.id_final;
      var1[14] = this.id_package;
      var1[15] = this.id_int;
   }

   public void id_class() {
      this.id_class = 1.0F;
      this.id_break = 0.0F;
      this.id_byte = 0.0F;
      this.id_protected = 0.0F;
      this.id_throws = 0.0F;
      this.id_case = 1.0F;
      this.id_catch = 0.0F;
      this.id_private = 0.0F;
      this.id_implements = 0.0F;
      this.id_finally = 0.0F;
      this.id_extends = 1.0F;
      this.id_native = 0.0F;
      this.id_volatile = 0.0F;
      this.id_final = 0.0F;
      this.id_package = 0.0F;
      this.id_int = 1.0F;
   }

   public void id_class(FloatBuffer var1) {
      if (var1.remaining() < 16) {
         throw new IllegalArgumentException("Not enough space in buffer");
      } else {
         this.id_break(var1);
      }
   }

   public void id_class(rjV_2 var1) {
      float var2 = this.id_class * var1.id_class + this.id_break * var1.id_throws + this.id_byte * var1.id_implements + this.id_protected * var1.id_volatile;
      float var3 = this.id_class * var1.id_break + this.id_break * var1.id_case + this.id_byte * var1.id_finally + this.id_protected * var1.id_final;
      float var4 = this.id_class * var1.id_byte + this.id_break * var1.id_catch + this.id_byte * var1.id_extends + this.id_protected * var1.id_package;
      float var5 = this.id_class * var1.id_protected + this.id_break * var1.id_private + this.id_byte * var1.id_native + this.id_protected * var1.id_int;
      float var6 = this.id_throws * var1.id_class + this.id_case * var1.id_throws + this.id_catch * var1.id_implements + this.id_private * var1.id_volatile;
      float var7 = this.id_throws * var1.id_break + this.id_case * var1.id_case + this.id_catch * var1.id_finally + this.id_private * var1.id_final;
      float var8 = this.id_throws * var1.id_byte + this.id_case * var1.id_catch + this.id_catch * var1.id_extends + this.id_private * var1.id_package;
      float var9 = this.id_throws * var1.id_protected + this.id_case * var1.id_private + this.id_catch * var1.id_native + this.id_private * var1.id_int;
      float var10 = this.id_implements * var1.id_class
         + this.id_finally * var1.id_throws
         + this.id_extends * var1.id_implements
         + this.id_native * var1.id_volatile;
      float var11 = this.id_implements * var1.id_break + this.id_finally * var1.id_case + this.id_extends * var1.id_finally + this.id_native * var1.id_final;
      float var12 = this.id_implements * var1.id_byte + this.id_finally * var1.id_catch + this.id_extends * var1.id_extends + this.id_native * var1.id_package;
      float var13 = this.id_implements * var1.id_protected
         + this.id_finally * var1.id_private
         + this.id_extends * var1.id_native
         + this.id_native * var1.id_int;
      float var14 = this.id_volatile * var1.id_class + this.id_final * var1.id_throws + this.id_package * var1.id_implements + this.id_int * var1.id_volatile;
      float var15 = this.id_volatile * var1.id_break + this.id_final * var1.id_case + this.id_package * var1.id_finally + this.id_int * var1.id_final;
      float var16 = this.id_volatile * var1.id_byte + this.id_final * var1.id_catch + this.id_package * var1.id_extends + this.id_int * var1.id_package;
      float var17 = this.id_volatile * var1.id_protected + this.id_final * var1.id_private + this.id_package * var1.id_native + this.id_int * var1.id_int;
      this.id_class = var2;
      this.id_break = var3;
      this.id_byte = var4;
      this.id_protected = var5;
      this.id_throws = var6;
      this.id_case = var7;
      this.id_catch = var8;
      this.id_private = var9;
      this.id_implements = var10;
      this.id_finally = var11;
      this.id_extends = var12;
      this.id_native = var13;
      this.id_volatile = var14;
      this.id_final = var15;
      this.id_package = var16;
      this.id_int = var17;
   }

   public static rjV_2 id_class(double var0, float var2, float var3, float var4) {
      float var5 = (float)(1.0 / Math.tan(var0 * (float) (Math.PI / 180.0) / 2.0));
      rjV_2 var6 = new rjV_2();
      var6.id_class = var5 / var2;
      var6.id_case = var5;
      var6.id_extends = (var4 + var3) / (var3 - var4);
      var6.id_package = -1.0F;
      var6.id_native = 2.0F * var4 * var3 / (var3 - var4);
      return var6;
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
      this.id_finally *= var1;
      this.id_extends *= var1;
      this.id_native *= var1;
      this.id_volatile *= var1;
      this.id_final *= var1;
      this.id_package *= var1;
      this.id_int *= var1;
   }

   @Override
   public void id_class(float var1, float var2, float var3) {
      this.id_protected = this.id_class * var1 + this.id_break * var2 + this.id_byte * var3 + this.id_protected;
      this.id_private = this.id_throws * var1 + this.id_case * var2 + this.id_catch * var3 + this.id_private;
      this.id_native = this.id_implements * var1 + this.id_finally * var2 + this.id_extends * var3 + this.id_native;
      this.id_int = this.id_volatile * var1 + this.id_final * var2 + this.id_package * var3 + this.id_int;
   }

   public void id_break(rjV_2 var1) {
      this.id_class = var1.id_class;
      this.id_break = var1.id_break;
      this.id_byte = var1.id_byte;
      this.id_protected = var1.id_protected;
      this.id_throws = var1.id_throws;
      this.id_case = var1.id_case;
      this.id_catch = var1.id_catch;
      this.id_private = var1.id_private;
      this.id_implements = var1.id_implements;
      this.id_finally = var1.id_finally;
      this.id_extends = var1.id_extends;
      this.id_native = var1.id_native;
      this.id_volatile = var1.id_volatile;
      this.id_final = var1.id_final;
      this.id_package = var1.id_package;
      this.id_int = var1.id_int;
   }

   private void id_break(FloatBuffer var1) {
      var1.put(0, this.id_class);
      var1.put(1, this.id_throws);
      var1.put(2, this.id_implements);
      var1.put(3, this.id_volatile);
      var1.put(4, this.id_break);
      var1.put(5, this.id_case);
      var1.put(6, this.id_finally);
      var1.put(7, this.id_final);
      var1.put(8, this.id_byte);
      var1.put(9, this.id_catch);
      var1.put(10, this.id_extends);
      var1.put(11, this.id_package);
      var1.put(12, this.id_protected);
      var1.put(13, this.id_private);
      var1.put(14, this.id_native);
      var1.put(15, this.id_int);
   }

   @Override
   public float id_break(float var1, float var2, float var3) {
      return this.id_class * var1 + this.id_break * var2 + this.id_byte * var3 + this.id_protected;
   }

   public void id_break(rjY_2 var1) {
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

   public float id_break(float var1, float var2, float var3, float var4) {
      return this.id_class * var1 + this.id_break * var2 + this.id_byte * var3 + this.id_protected * var4;
   }

   public boolean id_break() {
      return this.id_class == 1.0F
         && this.id_break == 0.0F
         && this.id_byte == 0.0F
         && this.id_protected == 0.0F
         && this.id_throws == 0.0F
         && this.id_case == 1.0F
         && this.id_catch == 0.0F
         && this.id_private == 0.0F
         && this.id_implements == 0.0F
         && this.id_finally == 0.0F
         && this.id_extends == 1.0F
         && this.id_native == 0.0F
         && this.id_volatile == 0.0F
         && this.id_final == 0.0F
         && this.id_package == 0.0F
         && this.id_int == 1.0F;
   }

   private void id_throws(rjY_2 var1) {
      float var2 = var1.id_byte();
      float var3 = var1.id_protected();
      float var4 = 2.0F * var2 * var2;
      float var5 = 1.0F - var4;
      float var6 = 1.0F - var4;
      float var7 = var2 * var3;
      float var8 = 2.0F * var7;
      float var9 = 2.0F * -var7;
      float var10 = this.id_class * var5 + this.id_break * var8;
      float var11 = this.id_class * var9 + this.id_break * var6;
      float var12 = this.id_throws * var5 + this.id_case * var8;
      float var13 = this.id_throws * var9 + this.id_case * var6;
      float var14 = this.id_implements * var5 + this.id_finally * var8;
      float var15 = this.id_implements * var9 + this.id_finally * var6;
      float var16 = this.id_volatile * var5 + this.id_final * var8;
      float var17 = this.id_volatile * var9 + this.id_final * var6;
      this.id_class = var10;
      this.id_break = var11;
      this.id_throws = var12;
      this.id_case = var13;
      this.id_implements = var14;
      this.id_finally = var15;
      this.id_volatile = var16;
      this.id_final = var17;
   }

   public static rjV_2 id_throws(float var0, float var1, float var2) {
      rjV_2 var3 = new rjV_2();
      var3.id_class = var0;
      var3.id_case = var1;
      var3.id_extends = var2;
      var3.id_int = 1.0F;
      return var3;
   }

   public float id_throws(float var1, float var2, float var3, float var4) {
      return this.id_volatile * var1 + this.id_final * var2 + this.id_package * var3 + this.id_int * var4;
   }

   public boolean id_throws() {
      float var1 = this.id_byte();
      if (Math.abs(var1) > 1.0E-6F) {
         this.id_class(var1);
         return true;
      } else {
         return false;
      }
   }

   public float id_catch() {
      return (float)Math.sqrt((double)(this.id_class * this.id_class + this.id_throws * this.id_throws + this.id_implements * this.id_implements));
   }

   public void id_catch(float var1, float var2, float var3) {
      this.id_protected = this.id_protected + this.id_class * var1 + this.id_break * var2 + this.id_byte * var3;
      this.id_private = this.id_private + this.id_throws * var1 + this.id_case * var2 + this.id_catch * var3;
      this.id_native = this.id_native + this.id_implements * var1 + this.id_finally * var2 + this.id_extends * var3;
      this.id_int = this.id_int + this.id_volatile * var1 + this.id_final * var2 + this.id_package * var3;
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
      float var27 = this.id_throws * var9 + this.id_case * var18 + this.id_catch * var20;
      float var28 = this.id_throws * var19 + this.id_case * var10 + this.id_catch * var22;
      float var29 = this.id_throws * var21 + this.id_case * var23 + this.id_catch * var11;
      float var30 = this.id_implements * var9 + this.id_finally * var18 + this.id_extends * var20;
      float var31 = this.id_implements * var19 + this.id_finally * var10 + this.id_extends * var22;
      float var32 = this.id_implements * var21 + this.id_finally * var23 + this.id_extends * var11;
      float var33 = this.id_volatile * var9 + this.id_final * var18 + this.id_package * var20;
      float var34 = this.id_volatile * var19 + this.id_final * var10 + this.id_package * var22;
      float var35 = this.id_volatile * var21 + this.id_final * var23 + this.id_package * var11;
      this.id_class = var24;
      this.id_break = var25;
      this.id_byte = var26;
      this.id_throws = var27;
      this.id_case = var28;
      this.id_catch = var29;
      this.id_implements = var30;
      this.id_finally = var31;
      this.id_extends = var32;
      this.id_volatile = var33;
      this.id_final = var34;
      this.id_package = var35;
   }

   public static rjV_2 id_case(float var0, float var1, float var2) {
      rjV_2 var3 = new rjV_2();
      var3.id_class = 1.0F;
      var3.id_case = 1.0F;
      var3.id_extends = 1.0F;
      var3.id_int = 1.0F;
      var3.id_protected = var0;
      var3.id_private = var1;
      var3.id_native = var2;
      return var3;
   }

   public rjV_2 id_case() {
      return new rjV_2(this);
   }

   public void id_protected() {
      float var1 = this.id_throws;
      this.id_throws = this.id_break;
      this.id_break = var1;
      var1 = this.id_implements;
      this.id_implements = this.id_byte;
      this.id_byte = var1;
      var1 = this.id_finally;
      this.id_finally = this.id_catch;
      this.id_catch = var1;
      var1 = this.id_volatile;
      this.id_volatile = this.id_protected;
      this.id_protected = var1;
      var1 = this.id_final;
      this.id_final = this.id_private;
      this.id_private = var1;
      var1 = this.id_package;
      this.id_package = this.id_native;
      this.id_native = var1;
   }

   @Override
   public float id_protected(float var1, float var2, float var3) {
      return this.id_implements * var1 + this.id_finally * var2 + this.id_extends * var3 + this.id_native;
   }

   public float id_protected(float var1, float var2, float var3, float var4) {
      return this.id_implements * var1 + this.id_finally * var2 + this.id_extends * var3 + this.id_native * var4;
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
      float var12 = this.id_throws * var5 + this.id_catch * var8;
      float var13 = this.id_throws * var9 + this.id_catch * var6;
      float var14 = this.id_implements * var5 + this.id_extends * var8;
      float var15 = this.id_implements * var9 + this.id_extends * var6;
      float var16 = this.id_volatile * var5 + this.id_package * var8;
      float var17 = this.id_volatile * var9 + this.id_package * var6;
      this.id_class = var10;
      this.id_byte = var11;
      this.id_throws = var12;
      this.id_catch = var13;
      this.id_implements = var14;
      this.id_extends = var15;
      this.id_volatile = var16;
      this.id_package = var17;
   }

   public void id_private(float var1, float var2, float var3) {
      this.id_class *= var1;
      this.id_break *= var2;
      this.id_byte *= var3;
      this.id_throws *= var1;
      this.id_case *= var2;
      this.id_catch *= var3;
      this.id_implements *= var1;
      this.id_finally *= var2;
      this.id_extends *= var3;
      this.id_volatile *= var1;
      this.id_final *= var2;
      this.id_package *= var3;
   }
}

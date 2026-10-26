package celestial;

import com.google.common.base.MoreObjects;

public class rfi_3 {
   public int id_class;
   public int id_break;
   public int id_byte;
   public int id_protected;
   public int id_throws;
   public int id_case;

   public rja_3 id_byte() {
      return new rja_3(this.id_protected - this.id_class, this.id_throws - this.id_break, this.id_case - this.id_byte);
   }

   public rfi_3(rfi_3 var1) {
      this.id_class = var1.id_class;
      this.id_break = var1.id_break;
      this.id_byte = var1.id_byte;
      this.id_protected = var1.id_protected;
      this.id_throws = var1.id_throws;
      this.id_case = var1.id_case;
   }

   public rfi_3(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_case = var6;
   }

   public rfi_3(rja_3 var1, rja_3 var2) {
      this.id_class = Math.min(var1.b_(), var2.b_());
      this.id_break = Math.min(var1.c_(), var2.c_());
      this.id_byte = Math.min(var1.d_(), var2.d_());
      this.id_protected = Math.max(var1.b_(), var2.b_());
      this.id_throws = Math.max(var1.c_(), var2.c_());
      this.id_case = Math.max(var1.d_(), var2.d_());
   }

   public rfi_3(int var1, int var2, int var3, int var4) {
      this.id_class = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_case = var4;
      this.id_break = 1;
      this.id_throws = 512;
   }

   public rfi_3(int[] var1) {
      if (var1.length == 6) {
         this.id_class = var1[0];
         this.id_break = var1[1];
         this.id_byte = var1[2];
         this.id_protected = var1[3];
         this.id_throws = var1[4];
         this.id_case = var1[5];
      }
   }

   public rfi_3() {
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this)
         .add("x0", this.id_class)
         .add("y0", this.id_break)
         .add("z0", this.id_byte)
         .add("x1", this.id_protected)
         .add("y1", this.id_throws)
         .add("z1", this.id_case)
         .toString();
   }

   public boolean id_class(int var1, int var2, int var3, int var4) {
      return this.id_protected >= var1 && this.id_class <= var3 && this.id_case >= var2 && this.id_byte <= var4;
   }

   public void id_class(rja_3 var1) {
      this.id_class(var1.b_(), var1.c_(), var1.d_());
   }

   public void id_class(int var1, int var2, int var3) {
      this.id_class += var1;
      this.id_break += var2;
      this.id_byte += var3;
      this.id_protected += var1;
      this.id_throws += var2;
      this.id_case += var3;
   }

   public static rfi_3 id_class(int var0, int var1, int var2, int var3, int var4, int var5) {
      return new rfi_3(Math.min(var0, var3), Math.min(var1, var4), Math.min(var2, var5), Math.max(var0, var3), Math.max(var1, var4), Math.max(var2, var5));
   }

   public static rfi_3 id_class(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, rpr_3 var9) {
      switch (var9) {
         case NORTH:
            return new rfi_3(var0 + var3, var1 + var4, var2 - var8 + 1 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var5);
         case SOUTH:
            return new rfi_3(var0 + var3, var1 + var4, var2 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var8 - 1 + var5);
         case WEST:
            return new rfi_3(var0 - var8 + 1 + var5, var1 + var4, var2 + var3, var0 + var5, var1 + var7 - 1 + var4, var2 + var6 - 1 + var3);
         case EAST:
            return new rfi_3(var0 + var5, var1 + var4, var2 + var3, var0 + var8 - 1 + var5, var1 + var7 - 1 + var4, var2 + var6 - 1 + var3);
         default:
            return new rfi_3(var0 + var3, var1 + var4, var2 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var8 - 1 + var5);
      }
   }

   public static rfi_3 id_class() {
      return new rfi_3(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
   }

   public boolean id_class(rfi_3 var1) {
      return this.id_protected >= var1.id_class
         && this.id_class <= var1.id_protected
         && this.id_case >= var1.id_byte
         && this.id_byte <= var1.id_case
         && this.id_throws >= var1.id_break
         && this.id_break <= var1.id_throws;
   }

   public boolean id_break(rja_3 var1) {
      return var1.b_() >= this.id_class
         && var1.b_() <= this.id_protected
         && var1.d_() >= this.id_byte
         && var1.d_() <= this.id_case
         && var1.c_() >= this.id_break
         && var1.c_() <= this.id_throws;
   }

   public static rfi_3 id_break() {
      return new rfi_3(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
   }

   public void id_break(rfi_3 var1) {
      this.id_class = Math.min(this.id_class, var1.id_class);
      this.id_break = Math.min(this.id_break, var1.id_break);
      this.id_byte = Math.min(this.id_byte, var1.id_byte);
      this.id_protected = Math.max(this.id_protected, var1.id_protected);
      this.id_throws = Math.max(this.id_throws, var1.id_throws);
      this.id_case = Math.max(this.id_case, var1.id_case);
   }

   public rfi_3 id_break(int var1, int var2, int var3) {
      return new rfi_3(this.id_class + var1, this.id_break + var2, this.id_byte + var3, this.id_protected + var1, this.id_throws + var2, this.id_case + var3);
   }

   public int id_throws() {
      return this.id_throws - this.id_break + 1;
   }

   public rja_3 id_catch() {
      return new rfH_2(
         this.id_class + (this.id_protected - this.id_class + 1) / 2,
         this.id_break + (this.id_throws - this.id_break + 1) / 2,
         this.id_byte + (this.id_case - this.id_byte + 1) / 2
      );
   }

   public int id_case() {
      return this.id_case - this.id_byte + 1;
   }

   public int id_protected() {
      return this.id_protected - this.id_class + 1;
   }

   public rcL_2 id_private() {
      return new rcL_2(new int[]{this.id_class, this.id_break, this.id_byte, this.id_protected, this.id_throws, this.id_case});
   }
}

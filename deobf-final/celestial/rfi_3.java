package celestial;

import com.google.common.base.MoreObjects;

public class rfi_3 {
   public int class_;
   public int break_;
   public int byte_;
   public int protected_;
   public int throws_;
   public int case_;

   public rja_3 byte_() {
      return new rja_3(this.protected_ - this.class_, this.throws_ - this.break_, this.case_ - this.byte_);
   }

   public rfi_3(rfi_3 var1) {
      this.class_ = var1.class_;
      this.break_ = var1.break_;
      this.byte_ = var1.byte_;
      this.protected_ = var1.protected_;
      this.throws_ = var1.throws_;
      this.case_ = var1.case_;
   }

   public rfi_3(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
      this.case_ = var6;
   }

   public rfi_3(rja_3 var1, rja_3 var2) {
      this.class_ = Math.min(var1.b_(), var2.b_());
      this.break_ = Math.min(var1.c_(), var2.c_());
      this.byte_ = Math.min(var1.d_(), var2.d_());
      this.protected_ = Math.max(var1.b_(), var2.b_());
      this.throws_ = Math.max(var1.c_(), var2.c_());
      this.case_ = Math.max(var1.d_(), var2.d_());
   }

   public rfi_3(int var1, int var2, int var3, int var4) {
      this.class_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.case_ = var4;
      this.break_ = 1;
      this.throws_ = 512;
   }

   public rfi_3(int[] var1) {
      if (var1.length == 6) {
         this.class_ = var1[0];
         this.break_ = var1[1];
         this.byte_ = var1[2];
         this.protected_ = var1[3];
         this.throws_ = var1[4];
         this.case_ = var1[5];
      }
   }

   public rfi_3() {
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this)
         .add("x0", this.class_)
         .add("y0", this.break_)
         .add("z0", this.byte_)
         .add("x1", this.protected_)
         .add("y1", this.throws_)
         .add("z1", this.case_)
         .toString();
   }

   public boolean class_(int var1, int var2, int var3, int var4) {
      return this.protected_ >= var1 && this.class_ <= var3 && this.case_ >= var2 && this.byte_ <= var4;
   }

   public void class_(rja_3 var1) {
      this.class_(var1.b_(), var1.c_(), var1.d_());
   }

   public void class_(int var1, int var2, int var3) {
      this.class_ += var1;
      this.break_ += var2;
      this.byte_ += var3;
      this.protected_ += var1;
      this.throws_ += var2;
      this.case_ += var3;
   }

   public static rfi_3 class_(int var0, int var1, int var2, int var3, int var4, int var5) {
      return new rfi_3(Math.min(var0, var3), Math.min(var1, var4), Math.min(var2, var5), Math.max(var0, var3), Math.max(var1, var4), Math.max(var2, var5));
   }

   public static rfi_3 class_(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, rpr_3 var9) {
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

   public static rfi_3 class_() {
      return new rfi_3(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
   }

   public boolean class_(rfi_3 var1) {
      return this.protected_ >= var1.class_
         && this.class_ <= var1.protected_
         && this.case_ >= var1.byte_
         && this.byte_ <= var1.case_
         && this.throws_ >= var1.break_
         && this.break_ <= var1.throws_;
   }

   public boolean break_(rja_3 var1) {
      return var1.b_() >= this.class_
         && var1.b_() <= this.protected_
         && var1.d_() >= this.byte_
         && var1.d_() <= this.case_
         && var1.c_() >= this.break_
         && var1.c_() <= this.throws_;
   }

   public static rfi_3 break_() {
      return new rfi_3(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
   }

   public void break_(rfi_3 var1) {
      this.class_ = Math.min(this.class_, var1.class_);
      this.break_ = Math.min(this.break_, var1.break_);
      this.byte_ = Math.min(this.byte_, var1.byte_);
      this.protected_ = Math.max(this.protected_, var1.protected_);
      this.throws_ = Math.max(this.throws_, var1.throws_);
      this.case_ = Math.max(this.case_, var1.case_);
   }

   public rfi_3 break_(int var1, int var2, int var3) {
      return new rfi_3(this.class_ + var1, this.break_ + var2, this.byte_ + var3, this.protected_ + var1, this.throws_ + var2, this.case_ + var3);
   }

   public int throws_() {
      return this.throws_ - this.break_ + 1;
   }

   public rja_3 catch_() {
      return new rfH_2(
         this.class_ + (this.protected_ - this.class_ + 1) / 2,
         this.break_ + (this.throws_ - this.break_ + 1) / 2,
         this.byte_ + (this.case_ - this.byte_ + 1) / 2
      );
   }

   public int case_() {
      return this.case_ - this.byte_ + 1;
   }

   public int protected_() {
      return this.protected_ - this.class_ + 1;
   }

   public rcL_2 private_() {
      return new rcL_2(new int[]{this.class_, this.break_, this.byte_, this.protected_, this.throws_, this.case_});
   }
}

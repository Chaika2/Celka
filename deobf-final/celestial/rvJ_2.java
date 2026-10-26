package celestial;

import java.io.IOException;

public class rvJ_2 implements ruS_2<At_1> {
   protected int class_;
   protected short break_;
   protected short byte_;
   protected short protected_;
   protected byte throws_;
   protected byte case_;
   protected boolean catch_;
   protected boolean private_;
   protected boolean implements_;

   public byte byte_() {
      return this.case_;
   }

   public rvJ_2() {
   }

   public rvJ_2(int var1) {
      this.class_ = var1;
   }

   @Override
   public String toString() {
      return "Entity_" + super.toString();
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   public an_3 class_(rYB var1) {
      return var1.break_(this.class_);
   }

   public static long class_(double var0) {
      return rfU_2.protected_(var0 * 4096.0);
   }

   public rjU_2 class_(rjU_2 var1) {
      double var2 = this.break_ == 0 ? var1.break_ : class_(class_(var1.break_) + (long)this.break_);
      double var4 = this.byte_ == 0 ? var1.byte_ : class_(class_(var1.byte_) + (long)this.byte_);
      double var6 = this.protected_ == 0 ? var1.protected_ : class_(class_(var1.protected_) + (long)this.protected_);
      return new rjU_2(var2, var4, var6);
   }

   public static rjU_2 class_(long var0, long var2, long var4) {
      return new rjU_2((double)var0, (double)var2, (double)var4).class_(2.4414062E-4F);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.case_();
   }

   public static double class_(long var0) {
      return (double)var0 / 4096.0;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_);
   }

   public byte break_() {
      return this.throws_;
   }

   public boolean throws_() {
      return this.implements_;
   }

   public boolean case_() {
      return this.catch_;
   }

   public boolean protected_() {
      return this.private_;
   }
}

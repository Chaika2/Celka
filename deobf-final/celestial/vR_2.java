package celestial;

import java.util.List;

public abstract class vR_2 extends vl_3 {
   private final QF[] class_;
   private Le_1 throws_;

   public vR_2(vm_3 var1, Qw_1 var2, rgP_2 var3, QF[] var4) {
      super(var1, var2, var3);
      this.class_ = var4;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      this.throws_.class_(var1, var2, var3, var4);
      class_(var1, this.super_, this.extends_, this.package_ / 2, 20, 16777215);
      super.class_(var1, var2, var3, var4);
      List var5 = class_(this.throws_, var2, var3);
      if (var5 != null) {
         this.break_(var1, var5, var2, var3);
      }
   }

   protected void protected_() {
      this.class_(new LF(this.package_ / 2 - 100, this.int_ - 27, 200, 20, cN_2.byte_, var1 -> this.volatile_.break_(this.case_)));
   }

   @Override
   protected void v_() {
      this.throws_ = new Le_1(this.volatile_, this.package_, this.int_, 32, this.int_ - 32, 25);
      this.throws_.class_(this.class_);
      this.native_.add(this.throws_);
      this.protected_();
   }
}

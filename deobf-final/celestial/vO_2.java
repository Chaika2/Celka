package celestial;

public class vO_2 extends vl_3 {
   public vO_2(vm_3 var1, Qw_1 var2) {
      super(var1, var2, new rgn_3("options.sounds.title"));
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      class_(var1, this.super_, this.extends_, this.package_ / 2, 15, 16777215);
      super.class_(var1, var2, var3, var4);
   }

   @Override
   protected void v_() {
      int var1 = 0;
      this.class_(new Lc_1(this.volatile_, this.package_ / 2 - 155 + var1 % 2 * 160, this.int_ / 6 - 12 + 24 * (var1 >> 1), rqL_2.MASTER, 310));
      var1 += 2;

      for (rqL_2 var5 : rqL_2.values()) {
         if (var5 != rqL_2.MASTER) {
            this.class_(new Lc_1(this.volatile_, this.package_ / 2 - 155 + var1 % 2 * 160, this.int_ / 6 - 12 + 24 * (var1 >> 1), var5, 150));
            var1++;
         }
      }

      int var8 = this.package_ / 2 - 75;
      int var9 = this.int_ / 6 - 12;
      this.class_(new Lp_1(var8, var9 + 24 * (++var1 >> 1), 150, 20, QF.boolean_, QF.boolean_.byte_(this.catch_), var1x -> {
         QF.boolean_.class_((Qw_1)this.volatile_.class_[20]);
         var1x.break_(QF.boolean_.byte_((Qw_1)this.volatile_.class_[20]));
         ((Qw_1)this.volatile_.class_[20]).break_();
      }));
      this.class_(new LF(this.package_ / 2 - 100, this.int_ / 6 + 168, 200, 20, cN_2.byte_, var1x -> this.volatile_.break_(this.case_)));
   }
}

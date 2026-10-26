package celestial;

public class ZP extends vl_3 {
   public ZP(vm_3 var1, Qw_1 var2) {
      super(var1, var2, new rgn_3("options.skinCustomisation.title"));
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      class_(var1, this.super_, this.extends_, this.package_ / 2, 20, 16777215);
      super.class_(var1, var2, var3, var4);
   }

   private rgP_2 class_(rhQ_2 var1) {
      return cN_2.class_(var1.byte_(), this.catch_.protected_().contains(var1));
   }

   @Override
   protected void v_() {
      int var1 = 0;

      for (rhQ_2 var5 : rhQ_2.values()) {
         this.class_((LF)(new LF(this.package_ / 2 - 155 + var1 % 2 * 160, this.int_ / 6 + 24 * (var1 >> 1), 150, 20, this.class_(var5), var2 -> {
            this.catch_.class_(var5);
            var2.break_(this.class_(var5));
         })));
         var1++;
      }

      this.class_(
         new Lp_1(this.package_ / 2 - 155 + var1 % 2 * 160, this.int_ / 6 + 24 * (var1 >> 1), 150, 20, QF.goto_, QF.goto_.class_(this.catch_), var1x -> {
            QF.goto_.class_(this.catch_, 1);
            this.catch_.break_();
            var1x.break_(QF.goto_.class_(this.catch_));
            this.catch_.byte_();
         })
      );
      if (++var1 % 2 == 1) {
         var1++;
      }

      this.class_(
         (LF)(new LF(
            this.package_ / 2 - 100,
            this.int_ / 6 + 24 * (var1 >> 1),
            200,
            20,
            rrba_3.break_("of.options.skinCustomisation.ofCape"),
            var1x -> this.volatile_.break_(new rrJb_1(this))
         ))
      );
      var1 += 2;
      this.class_((LF)(new LF(this.package_ / 2 - 100, this.int_ / 6 + 24 * (var1 >> 1), 200, 20, cN_2.byte_, var1x -> this.volatile_.break_(this.case_))));
   }
}

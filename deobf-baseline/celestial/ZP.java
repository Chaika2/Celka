package celestial;

public class ZP extends vl_3 {
   public ZP(vm_3 var1, Qw_1 var2) {
      super(var1, var2, new rgn_3("options.skinCustomisation.title"));
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      id_class(var1, this.id_super, this.id_extends, this.id_package / 2, 20, 16777215);
      super.id_class(var1, var2, var3, var4);
   }

   private rgP_2 id_class(rhQ_2 var1) {
      return cN_2.id_class(var1.id_byte(), this.id_catch.id_protected().contains(var1));
   }

   @Override
   protected void v_() {
      int var1 = 0;

      for (rhQ_2 var5 : rhQ_2.values()) {
         this.id_class((LF)(new LF(this.id_package / 2 - 155 + var1 % 2 * 160, this.id_int / 6 + 24 * (var1 >> 1), 150, 20, this.id_class(var5), var2 -> {
            this.id_catch.id_class(var5);
            var2.id_break(this.id_class(var5));
         })));
         var1++;
      }

      this.id_class(
         new Lp_1(
            this.id_package / 2 - 155 + var1 % 2 * 160, this.id_int / 6 + 24 * (var1 >> 1), 150, 20, QF.id_goto, QF.id_goto.id_class(this.id_catch), var1x -> {
               QF.id_goto.id_class(this.id_catch, 1);
               this.id_catch.id_break();
               var1x.id_break(QF.id_goto.id_class(this.id_catch));
               this.id_catch.id_byte();
            }
         )
      );
      if (++var1 % 2 == 1) {
         var1++;
      }

      this.id_class(
         (LF)(new LF(
            this.id_package / 2 - 100,
            this.id_int / 6 + 24 * (var1 >> 1),
            200,
            20,
            rrba_3.id_break("of.options.skinCustomisation.ofCape"),
            var1x -> this.id_volatile.id_break(new rrJb_1(this))
         ))
      );
      var1 += 2;
      this.id_class(
         (LF)(new LF(this.id_package / 2 - 100, this.id_int / 6 + 24 * (var1 >> 1), 200, 20, cN_2.id_byte, var1x -> this.id_volatile.id_break(this.id_case)))
      );
   }
}

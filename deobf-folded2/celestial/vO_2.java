package celestial;

public class vO_2 extends vl_3 {
   public vO_2(vm_3 var1, Qw_1 var2) {
      super(var1, var2, new rgn_3("options.sounds.title"));
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      id_class(var1, this.id_super, this.id_extends, this.id_package / 2, 15, 16777215);
      super.id_class(var1, var2, var3, var4);
   }

   @Override
   protected void v_() {
      int var1 = 0;
      this.id_class(new Lc_1(this.id_volatile, this.id_package / 2 - 155 + var1 % 2 * 160, this.id_int / 6 - 12 + 24 * (var1 >> 1), rqL_2.MASTER, 310));
      var1 += 2;

      for (rqL_2 var5 : rqL_2.values()) {
         if (var5 != rqL_2.MASTER) {
            this.id_class(new Lc_1(this.id_volatile, this.id_package / 2 - 155 + var1 % 2 * 160, this.id_int / 6 - 12 + 24 * (var1 >> 1), var5, 150));
            var1++;
         }
      }

      int var8 = this.id_package / 2 - 75;
      int var9 = this.id_int / 6 - 12;
      this.id_class(new Lp_1(var8, var9 + 24 * (++var1 >> 1), 150, 20, QF.id_boolean, QF.id_boolean.id_byte(this.id_catch), var1x -> {
         QF.id_boolean.id_class((Qw_1)this.id_volatile.id_class[20]);
         var1x.id_break(QF.id_boolean.id_byte((Qw_1)this.id_volatile.id_class[20]));
         ((Qw_1)this.id_volatile.id_class[20]).id_break();
      }));
      this.id_class(new LF(this.id_package / 2 - 100, this.id_int / 6 + 168, 200, 20, cN_2.id_byte, var1x -> this.id_volatile.id_break(this.id_case)));
   }
}

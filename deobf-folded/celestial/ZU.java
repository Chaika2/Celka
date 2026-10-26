package celestial;

public class ZU extends vl_3 {
   private static final rgP_2 id_class = new rgN_2("(").id_class(new rgn_3("options.languageWarning")).id_break(")").id_class(rgF_2.GRAY);
   private Ze_1 id_throws;
   final jV_2 id_private;
   private Lp_1 id_implements;
   private LF id_finally;

   public ZU(vm_3 var1, Qw_1 var2, jV_2 var3) {
      super(var1, var2, new rgn_3("options.language"));
      this.id_private = var3;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_throws.id_class(var1, var2, var3, var4);
      id_class(var1, this.id_super, this.id_extends, this.id_package / 2, 16, 16777215);
      id_class(var1, this.id_super, id_class, this.id_package / 2, this.id_int - 56, 8421504);
      super.id_class(var1, var2, var3, var4);
   }

   @Override
   protected void v_() {
      this.id_throws = new Ze_1(this, this.id_volatile);
      this.id_native.add(this.id_throws);
      this.id_implements = this.id_class(
         new Lp_1(this.id_package / 2 - 155, this.id_int - 38, 150, 20, QF.id_default, QF.id_default.id_byte(this.id_catch), var1 -> {
            QF.id_default.id_class(this.id_catch);
            this.id_catch.id_break();
            var1.id_break(QF.id_default.id_byte(this.id_catch));
            this.id_volatile.v();
         })
      );
      this.id_finally = this.id_class(new LF(this.id_package / 2 - 155 + 160, this.id_int - 38, 150, 20, cN_2.id_byte, var1 -> {
         Za_1 var2 = this.id_throws.id_finally();
         if (var2 != null && !var2.id_break.getCode().equals(this.id_private.id_break().getCode())) {
            this.id_private.id_class(var2.id_break);
            this.id_catch.rG = var2.id_break.getCode();
            this.id_volatile.id_private();
            this.id_finally.id_break(cN_2.id_byte);
            this.id_implements.id_break(QF.id_default.id_byte(this.id_catch));
            this.id_catch.id_break();
         }

         this.id_volatile.id_break(this.id_case);
      }));
      super.v_();
   }
}

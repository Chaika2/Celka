package celestial;

class Ze_1 extends LV<Za_1> {
   public Ze_1(ZU var1, QY var2) {
      super(var2, var1.id_package, var1.id_int, 32, var1.id_int - 65 + 4, 18);
      this.id_class = var1;

      for (jj_3 var4 : var1.id_private.id_byte()) {
         Za_1 var5 = new Za_1(this, var4);
         this.id_break(var5);
         if (var1.id_private.id_break().getCode().equals(var4.getCode())) {
            this.id_class(var5);
         }
      }

      if (this.id_finally() != null) {
         this.id_byte(this.id_finally());
      }
   }

   @Override
   protected void id_class(Ml_1 var1) {
      this.id_class.id_class(var1);
   }

   @Override
   protected boolean id_class() {
      return this.id_class.id_catch() == this;
   }

   public void id_class(Za_1 var1) {
      super.id_class(var1);
   }

   @Override
   protected int id_protected() {
      return super.id_protected() + 20;
   }

   @Override
   public int F_() {
      return super.F_() + 50;
   }
}

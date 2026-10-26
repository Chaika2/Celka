package celestial;

class Ze_1 extends LV<Za_1> {
   public Ze_1(ZU var1, QY var2) {
      super(var2, var1.package_, var1.int_, 32, var1.int_ - 65 + 4, 18);
      this.class_ = var1;

      for (jj_3 var4 : var1.private_.byte_()) {
         Za_1 var5 = new Za_1(this, var4);
         this.break_(var5);
         if (var1.private_.break_().getCode().equals(var4.getCode())) {
            this.class_(var5);
         }
      }

      if (this.finally_() != null) {
         this.byte_(this.finally_());
      }
   }

   @Override
   protected void class_(Ml_1 var1) {
      this.class_.class_(var1);
   }

   @Override
   protected boolean class_() {
      return this.class_.catch_() == this;
   }

   public void class_(Za_1 var1) {
      super.class_(var1);
   }

   @Override
   protected int protected_() {
      return super.protected_() + 20;
   }

   @Override
   public int F_() {
      return super.F_() + 50;
   }
}

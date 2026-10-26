package celestial;

class rMh_1 extends rBP {
   @Override
   public void byte_() {
      ((rba_3)this.class_).sL();
      ((rba_3)this.byte_).sL();
      super.byte_();
   }

   public rMh_1(rba_3 var1, double var2) {
      super(var1, var2);
   }

   @Override
   protected void catch_() {
      rrEm_1 var1 = (rrEm_1)this.break_;
      rba_3 var2 = (rba_3)this.class_.class_(var1, (au_3)this.byte_);
      if (var2 != null) {
         rhN_2 var3 = this.class_.sz();
         rhN_2 var4 = this.byte_.sz();
         rhN_2 var5 = var3;
         if (var3 != null) {
            var2.break_(var3.ro());
         } else {
            var5 = var4;
         }

         if (var4 != null && var3 != var4) {
            var2.break_(var4.ro());
         }

         if (var5 != null) {
            var5.break_(rlB_2.strictfp_);
            Oo_1.package_.class_(var5, this.class_, this.byte_, var2);
         }

         this.class_.e_(6000);
         this.byte_.e_(6000);
         this.class_.sN();
         this.byte_.sN();
         var2.e_(-24000);
         var2.class_(this.class_.rx(), this.class_.re(), this.class_.BO(), 0.0F, 0.0F);
         var1.class_(var2);
         this.break_.class_(this.class_, (byte)18);
         if (this.break_.B().break_(rRu_1.throws_)) {
            this.break_.a_(new rsP_2(this.break_, this.class_.rx(), this.class_.re(), this.class_.BO(), this.class_.Sa().nextInt(7) + 1));
         }
      }
   }
}

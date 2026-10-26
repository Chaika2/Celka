package celestial;

class rMh_1 extends rBP {
   @Override
   public void id_byte() {
      ((rba_3)this.id_class).sL();
      ((rba_3)this.id_byte).sL();
      super.id_byte();
   }

   public rMh_1(rba_3 var1, double var2) {
      super(var1, var2);
   }

   @Override
   protected void id_catch() {
      rrEm_1 var1 = (rrEm_1)this.id_break;
      rba_3 var2 = (rba_3)this.id_class.id_class(var1, (au_3)this.id_byte);
      if (var2 != null) {
         rhN_2 var3 = this.id_class.sz();
         rhN_2 var4 = this.id_byte.sz();
         rhN_2 var5 = var3;
         if (var3 != null) {
            var2.id_break(var3.ro());
         } else {
            var5 = var4;
         }

         if (var4 != null && var3 != var4) {
            var2.id_break(var4.ro());
         }

         if (var5 != null) {
            var5.id_break(rlB_2.id_strictfp);
            Oo_1.id_package.id_class(var5, this.id_class, this.id_byte, var2);
         }

         this.id_class.e_(6000);
         this.id_byte.e_(6000);
         this.id_class.sN();
         this.id_byte.sN();
         var2.e_(-24000);
         var2.id_class(this.id_class.rx(), this.id_class.re(), this.id_class.BO(), 0.0F, 0.0F);
         var1.id_class(var2);
         this.id_break.id_class(this.id_class, (byte)18);
         if (this.id_break.B().id_break(rRu_1.id_throws)) {
            this.id_break.a_(new rsP_2(this.id_break, this.id_class.rx(), this.id_class.re(), this.id_class.BO(), this.id_class.Sa().nextInt(7) + 1));
         }
      }
   }
}

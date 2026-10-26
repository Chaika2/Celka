package celestial;

class rHv_1 extends rHm_1 {
   @Override
   public rjU_2 id_byte() {
      return rjU_2.id_class((rja_3)this.id_class.id_native);
   }

   rHv_1(rHZ var1) {
      this.id_class = var1;
   }

   @Override
   public void id_class(String var1) {
      super.id_class(var1);
      this.id_class.id_break();
   }

   @Override
   public rrEm_1 id_class() {
      return (rrEm_1)this.id_class.id_extends;
   }

   @Override
   public void id_break() {
      xc_3 var1 = this.id_class.id_extends.id_byte(this.id_class.id_native);
      this.id_class().id_class(this.id_class.id_native, var1, var1, 3);
   }

   @Override
   public gy_3 id_throws() {
      return new gy_3(
         this,
         rjU_2.id_class((rja_3)this.id_class.id_native),
         rjK_2.id_class,
         this.id_class(),
         2,
         this.id_implements().getString(),
         this.id_implements(),
         this.id_class().id_const(),
         (an_3)null
      );
   }
}

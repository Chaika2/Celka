package celestial;

class rMf_1 extends rBc_1 {
   private final rMl_1 id_class;

   public rMf_1(rMl_1 var1, Class<?>... var2) {
      super(var1, var2);
      this.id_class = var1;
   }

   @Override
   protected void id_class(is_3 var1, iB_2 var2) {
      if (var1 instanceof rMl_1 && ((rMl_1)var1).v()) {
         var1.id_byte(var2);
      }
   }

   @Override
   public boolean id_break() {
      if (!this.id_class.id_try && !this.id_class.id_instanceof) {
         return super.id_break();
      } else {
         this.id_class.id_byte((iB_2)null);
         return false;
      }
   }
}

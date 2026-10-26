package celestial;

class rMf_1 extends rBc_1 {
   private final rMl_1 class_;

   public rMf_1(rMl_1 var1, Class<?>... var2) {
      super(var1, var2);
      this.class_ = var1;
   }

   @Override
   protected void class_(is_3 var1, iB_2 var2) {
      if (var1 instanceof rMl_1 && ((rMl_1)var1).v()) {
         var1.byte_(var2);
      }
   }

   @Override
   public boolean break_() {
      if (!this.class_.try_ && !this.class_.instanceof_) {
         return super.break_();
      } else {
         this.class_.byte_((iB_2)null);
         return false;
      }
   }
}

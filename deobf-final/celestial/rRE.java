package celestial;

public final class rRE implements rRq_1 {
   private final xc_3[] class_;

   @Override
   public xc_3 byte_(rfH_2 var1) {
      int var2 = var1.c_();
      return var2 >= 0 && var2 < this.class_.length ? this.class_[var2] : xu_3.class_.continue_();
   }

   public rRE(xc_3[] var1) {
      this.class_ = var1;
   }

   @Override
   public ryO_2 class_(rfH_2 var1) {
      return null;
   }

   @Override
   public rXE break_(rfH_2 var1) {
      return this.byte_(var1).volatile_();
   }
}

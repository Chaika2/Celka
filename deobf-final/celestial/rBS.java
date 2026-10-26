package celestial;

public class rBS extends rBp_1 {
   private final rbf_3 catch_;

   @Override
   public void byte_() {
      super.byte_();
      this.catch_.public_(false);
   }

   public rBS(rbf_3 var1, double var2) {
      super(var1, var2, 8);
      this.catch_ = var1;
   }

   @Override
   protected boolean class_(rRR var1, rfH_2 var2) {
      if (!var1.finally_(var2.final_())) {
         return false;
      } else {
         xc_3 var3 = var1.byte_(var2);
         if (var3.class_(xu_3.re)) {
            return rHu_1.class_(var1, var2) < 1;
         } else {
            return var3.class_(xu_3.Ps) && var3.byte_(C_do.final_)
               ? true
               : var3.class_(rls_3.short_, var0 -> var0.protected_(xb_3.volatile_).map(var0x -> var0x != rCp_1.HEAD).orElse(true));
         }
      }
   }

   @Override
   public boolean class_() {
      return this.catch_.sZ() && !this.catch_.sL() && super.class_();
   }

   @Override
   public void throws_() {
      super.throws_();
      this.catch_.public_(this.native_());
   }

   @Override
   public void protected_() {
      super.protected_();
      this.catch_.public_(false);
   }
}

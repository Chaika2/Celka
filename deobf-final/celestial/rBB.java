package celestial;

import java.util.EnumSet;

public class rBB extends rBp_1 {
   private final rbf_3 catch_;

   @Override
   public void byte_() {
      super.byte_();
      this.catch_.public_(false);
   }

   public rBB(rbf_3 var1, double var2, int var4) {
      super(var1, var2, var4, 6);
      this.catch_ = var1;
      this.case_ = -2;
      this.class_(EnumSet.of(rBW.JUMP, rBW.MOVE));
   }

   @Override
   protected boolean class_(rRR var1, rfH_2 var2) {
      return var1.finally_(var2.final_()) && var1.byte_(var2).break_().class_(rls_3.short_);
   }

   @Override
   protected int class_(aA_2 var1) {
      return 40;
   }

   @Override
   public boolean class_() {
      return this.catch_.sZ() && !this.catch_.sL() && !this.catch_.sJ() && super.class_();
   }

   @Override
   public void throws_() {
      super.throws_();
      this.catch_.public_(false);
      if (!this.native_()) {
         this.catch_.this_(false);
      } else if (!this.catch_.sJ()) {
         this.catch_.this_(true);
      }
   }

   @Override
   public void protected_() {
      super.protected_();
      this.catch_.this_(false);
   }
}

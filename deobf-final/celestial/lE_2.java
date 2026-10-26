package celestial;

public class lE_2 extends CT {
   lE_2(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12, Ch_1 var14) {
      super(var1, var2, var4, var6, var8, var10, var12, var14);
      this.else_ = 0.5F;
   }

   @Override
   public void case_() {
      super.case_();
      this.extends_ = this.extends_ - (0.004 + 0.04 * (double)this.else_);
   }
}

package celestial;

public abstract class JL extends dB_2 {
   private final rxL_2 volatile_;

   protected JL(rxL_2 var1, Jq_1 var2) {
      super(var2);
      this.volatile_ = var1;
   }

   @Override
   public rdn_3 class_(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      ryO_2 var4 = var1.class_(var2);
      return var4 instanceof rHb_1 ? ((rHb_1)var4).class_(var3) : super.class_(var1, var2, var3);
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      if (var5.this_()) {
         ryO_2 var6 = var1.class_(var2);
         if (var6 instanceof rHb_1) {
            ((rHb_1)var6).class_(var5.continue_());
         }
      }
   }

   @Override
   public ryO_2 class_(rRq_1 var1) {
      return new rHb_1(this.volatile_);
   }

   @Override
   public boolean class_() {
      return true;
   }

   public rxL_2 break_() {
      return this.volatile_;
   }
}

package celestial;

public abstract class JL extends dB_2 {
   private final rxL_2 id_volatile;

   protected JL(rxL_2 var1, Jq_1 var2) {
      super(var2);
      this.id_volatile = var1;
   }

   @Override
   public rdn_3 id_class(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      ryO_2 var4 = var1.id_class(var2);
      return var4 instanceof rHb_1 ? ((rHb_1)var4).id_class(var3) : super.id_class(var1, var2, var3);
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      if (var5.id_this()) {
         ryO_2 var6 = var1.id_class(var2);
         if (var6 instanceof rHb_1) {
            ((rHb_1)var6).id_class(var5.id_continue());
         }
      }
   }

   @Override
   public ryO_2 id_class(rRq_1 var1) {
      return new rHb_1(this.id_volatile);
   }

   @Override
   public boolean id_class() {
      return true;
   }

   public rxL_2 id_break() {
      return this.id_volatile;
   }
}

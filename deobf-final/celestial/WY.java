package celestial;

public class WY extends xm_3 {
   public WY(Jq_1 var1) {
      super(var1);
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, an_3 var3) {
      double var4 = Math.abs(var3.rv().byte_);
      if (var4 < 0.1 && !var3.Pc()) {
         double var6 = 0.4 + var4 * 0.2;
         var3.byte_(var3.rv().throws_(var6, 1.0, var6));
      }

      super.class_(var1, var2, var3);
   }

   private void class_(an_3 var1) {
      rjU_2 var2 = var1.rv();
      if (var2.byte_ < 0.0) {
         double var3 = var1 instanceof iB_2 ? 1.0 : 0.8;
         var1.catch_(var2.break_, -var2.byte_ * var3, var2.protected_);
      }
   }

   @Override
   public void class_(rRq_1 var1, an_3 var2) {
      if (var2.PR()) {
         super.class_(var1, var2);
      } else {
         this.class_(var2);
      }
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, an_3 var3, float var4) {
      if (var3.PR()) {
         super.class_(var1, var2, var3, var4);
      } else {
         var3.class_(var4, 0.0F);
      }
   }
}

package celestial;

public class WY extends xm_3 {
   public WY(Jq_1 var1) {
      super(var1);
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, an_3 var3) {
      double var4 = Math.abs(var3.rv().id_byte);
      if (var4 < 0.1 && !var3.Pc()) {
         double var6 = 0.4 + var4 * 0.2;
         var3.id_byte(var3.rv().id_throws(var6, 1.0, var6));
      }

      super.id_class(var1, var2, var3);
   }

   private void id_class(an_3 var1) {
      rjU_2 var2 = var1.rv();
      if (var2.id_byte < 0.0) {
         double var3 = var1 instanceof iB_2 ? 1.0 : 0.8;
         var1.id_catch(var2.id_break, -var2.id_byte * var3, var2.id_protected);
      }
   }

   @Override
   public void id_class(rRq_1 var1, an_3 var2) {
      if (var2.PR()) {
         super.id_class(var1, var2);
      } else {
         this.id_class(var2);
      }
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, an_3 var3, float var4) {
      if (var3.PR()) {
         super.id_class(var1, var2, var3, var4);
      } else {
         var3.id_class(var4, 0.0F);
      }
   }
}

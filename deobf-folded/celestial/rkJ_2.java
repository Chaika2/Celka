package celestial;

public class rkJ_2 extends rdb_3 {
   public rkJ_2(rdO_2 var1) {
      super(var1);
   }

   public static void id_class(rdn_3 var0, rLR var1, int var2) {
      rcd_3 var3 = var0.id_int();
      rcy_3 var4 = var3.id_protected("Effects", 9);
      rcd_3 var5 = new rcd_3();
      var5.id_class("EffectId", (byte)rLR.id_class(var1));
      var5.id_break("EffectDuration", var2);
      var4.add(var5);
      var3.id_class("Effects", var4);
   }

   @Override
   public rdn_3 id_class(rdn_3 var1, rYB var2, iB_2 var3) {
      rdn_3 var4 = super.id_class(var1, var2, var3);
      rcd_3 var5 = var1.id_package();
      if (var5 != null && var5.id_byte("Effects", 9)) {
         rcy_3 var6 = var5.id_protected("Effects", 10);

         for (int var7 = 0; var7 < var6.size(); var7++) {
            int var8 = 160;
            rcd_3 var9 = var6.id_class(var7);
            if (var9.id_byte("EffectDuration", 3)) {
               var8 = var9.id_private("EffectDuration");
            }

            rLR var10 = rLR.id_class(var9.id_case("EffectId"));
            if (var10 != null) {
               var3.id_break(new rLY(var10, var8));
            }
         }
      }

      return var3 instanceof rhd_3 && ((rhx_3)((rhd_3)var3).id_implements[18]).id_protected ? var4 : new rdn_3(rdy_3.OU);
   }
}

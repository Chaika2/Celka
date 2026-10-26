package celestial;

public class rkJ_2 extends rdb_3 {
   public rkJ_2(rdO_2 var1) {
      super(var1);
   }

   public static void class_(rdn_3 var0, rLR var1, int var2) {
      rcd_3 var3 = var0.int_();
      rcy_3 var4 = var3.protected_("Effects", 9);
      rcd_3 var5 = new rcd_3();
      var5.class_("EffectId", (byte)rLR.class_(var1));
      var5.break_("EffectDuration", var2);
      var4.add(var5);
      var3.class_("Effects", var4);
   }

   @Override
   public rdn_3 class_(rdn_3 var1, rYB var2, iB_2 var3) {
      rdn_3 var4 = super.class_(var1, var2, var3);
      rcd_3 var5 = var1.package_();
      if (var5 != null && var5.byte_("Effects", 9)) {
         rcy_3 var6 = var5.protected_("Effects", 10);

         for (int var7 = 0; var7 < var6.size(); var7++) {
            int var8 = 160;
            rcd_3 var9 = var6.class_(var7);
            if (var9.byte_("EffectDuration", 3)) {
               var8 = var9.private_("EffectDuration");
            }

            rLR var10 = rLR.class_(var9.case_("EffectId"));
            if (var10 != null) {
               var3.break_(new rLY(var10, var8));
            }
         }
      }

      return var3 instanceof rhd_3 && ((rhx_3)((rhd_3)var3).implements_[18]).protected_ ? var4 : new rdn_3(rdy_3.OU);
   }
}

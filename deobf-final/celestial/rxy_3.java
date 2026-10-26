package celestial;

import java.util.List;

public class rxy_3 extends rdb_3 {
   public rxy_3(rdO_2 var1) {
      super(var1);
   }

   @Override
   public void class_(rdn_3 var1, rYB var2, List<rgP_2> var3, VD var4) {
      super.class_(var1, var2, var3, var4);
      rdn_3.class_(var3, protected_(var1));
   }

   public static void class_(rdn_3 var0, eL_2 var1) {
      rcy_3 var2 = protected_(var0);
      boolean var3 = true;
      rqO_2 var4 = rVL.boolean_.break_(var1.class_);

      for (int var5 = 0; var5 < var2.size(); var5++) {
         rcd_3 var6 = var2.class_(var5);
         rqO_2 var7 = rqO_2.break_(var6.native_("id"));
         if (var7 != null && var7.equals(var4)) {
            if (var6.private_("lvl") < var1.break_) {
               var6.class_("lvl", (short)var1.break_);
            }

            var3 = false;
            break;
         }
      }

      if (var3) {
         rcd_3 var8 = new rcd_3();
         var8.class_("id", String.valueOf(var4));
         var8.class_("lvl", (short)var1.break_);
         var2.add(var8);
      }

      var0.int_().class_("StoredEnchantments", var2);
   }

   public static rdn_3 class_(eL_2 var0) {
      rdn_3 var1 = new rdn_3(rdy_3.dm);
      class_(var1, var0);
      return var1;
   }

   @Override
   public void class_(rdX_2 var1, rqs_3<rdn_3> var2) {
      if (var1 == rdX_2.catch_) {
         for (ev_3 var4 : rVL.boolean_) {
            if (var4.break_ != null) {
               for (int var5 = var4.throws_(); var5 <= var4.class_(); var5++) {
                  var2.add(class_(new eL_2(var4, var5)));
               }
            }
         }
      } else if (var1.final_().length != 0) {
         for (ev_3 var7 : rVL.boolean_) {
            if (var1.class_(var7.break_)) {
               var2.add(class_(new eL_2(var7, var7.class_())));
            }
         }
      }
   }

   @Override
   public boolean class_(rdn_3 var1) {
      return false;
   }

   @Override
   public boolean throws_(rdn_3 var1) {
      return true;
   }

   public static rcy_3 protected_(rdn_3 var0) {
      rcd_3 var1 = var0.package_();
      return var1 != null ? var1.protected_("StoredEnchantments", 10) : new rcy_3();
   }
}

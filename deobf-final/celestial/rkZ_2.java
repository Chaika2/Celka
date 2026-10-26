package celestial;

import java.util.List;

public class rkZ_2 extends rdb_3 {
   public rkZ_2(rdO_2 var1) {
      super(var1);
   }

   @Override
   public void class_(rdn_3 var1, rYB var2, List<rgP_2> var3, VD var4) {
      if (var1.final_()) {
         rcd_3 var5 = var1.package_();
         String var6 = var5.native_("author");
         if (!rql_3.break_(var6)) {
            var3.add(new rgn_3("book.byAuthor", var6).class_(rgF_2.GRAY));
         }

         var3.add(new rgn_3("book.generation." + var5.private_("generation")).class_(rgF_2.GRAY));
      }
   }

   @Override
   public ryZ_2 class_(rdH_2 var1) {
      rYB var2 = var1.int_();
      rfH_2 var3 = var1.class_();
      xc_3 var4 = var2.byte_(var3);
      if (var4.class_(xu_3.Xs)) {
         return kv_3.class_(var2, var3, var4, var1.volatile_()) ? ryZ_2.class_(var2.continue_) : ryZ_2.PASS;
      } else {
         return ryZ_2.PASS;
      }
   }

   @Override
   public rym_3<rdn_3> class_(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.protected_(var3);
      var2.class_(var4, var3);
      var2.class_(rlB_2.byte_.break_(this));
      return rym_3.class_(var4, var1.import_());
   }

   public static boolean class_(rdn_3 var0, gy_3 var1, rhd_3 var2) {
      rcd_3 var3 = var0.package_();
      if (var3 != null && !var3.new_("resolved")) {
         var3.class_("resolved", true);
         if (!class_(var3)) {
            return false;
         } else {
            rcy_3 var4 = var3.protected_("pages", 8);

            for (int var5 = 0; var5 < var4.size(); var5++) {
               String var6 = var4.implements_(var5);

               Object var7;
               try {
                  var7 = rgB_2.break_(var6);
                  var7 = rgv_3.class_(var1, (rgP_2)var7, var2, 0);
               } catch (Exception var9) {
                  var7 = new rgN_2(var6);
               }

               var4.protected_(var5, rca_3.class_(rgB_2.class_((rgP_2)var7)));
            }

            var3.class_("pages", var4);
            return true;
         }
      } else {
         return false;
      }
   }

   public static boolean class_(rcd_3 var0) {
      if (!rkm_3.class_(var0)) {
         return false;
      } else if (!var0.byte_("title", 8)) {
         return false;
      } else {
         String var1 = var0.native_("title");
         return var1.length() > 32 ? false : var0.byte_("author", 8);
      }
   }

   @Override
   public boolean throws_(rdn_3 var1) {
      return true;
   }

   public static int catch_(rdn_3 var0) {
      rcd_3 var1 = var0.package_();
      return var1 != null ? var1.protected_("pages", 8).size() : 0;
   }

   @Override
   public rgP_2 implements_(rdn_3 var1) {
      if (var1.final_()) {
         rcd_3 var2 = var1.package_();
         String var3 = var2.native_("title");
         if (!rql_3.break_(var3)) {
            return new rgN_2(var3);
         }
      }

      return super.implements_(var1);
   }

   public static int protected_(rdn_3 var0) {
      return var0.package_().private_("generation");
   }
}

package celestial;

import java.util.List;

public class rkZ_2 extends rdb_3 {
   public rkZ_2(rdO_2 var1) {
      super(var1);
   }

   @Override
   public void id_class(rdn_3 var1, rYB var2, List<rgP_2> var3, VD var4) {
      if (var1.id_final()) {
         rcd_3 var5 = var1.id_package();
         String var6 = var5.id_native("author");
         if (!rql_3.id_break(var6)) {
            var3.add(new rgn_3("book.byAuthor", var6).id_class(rgF_2.GRAY));
         }

         var3.add(new rgn_3("book.generation." + var5.id_private("generation")).id_class(rgF_2.GRAY));
      }
   }

   @Override
   public ryZ_2 id_class(rdH_2 var1) {
      rYB var2 = var1.id_int();
      rfH_2 var3 = var1.id_class();
      xc_3 var4 = var2.id_byte(var3);
      if (var4.id_class(xu_3.Xs)) {
         return kv_3.id_class(var2, var3, var4, var1.id_volatile()) ? ryZ_2.id_class(var2.id_continue) : ryZ_2.PASS;
      } else {
         return ryZ_2.PASS;
      }
   }

   @Override
   public rym_3<rdn_3> id_class(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.id_protected(var3);
      var2.id_class(var4, var3);
      var2.id_class(rlB_2.id_byte.id_break(this));
      return rym_3.id_class(var4, var1.id_import());
   }

   public static boolean id_class(rdn_3 var0, gy_3 var1, rhd_3 var2) {
      rcd_3 var3 = var0.id_package();
      if (var3 != null && !var3.id_new("resolved")) {
         var3.id_class("resolved", true);
         if (!id_class(var3)) {
            return false;
         } else {
            rcy_3 var4 = var3.id_protected("pages", 8);

            for (int var5 = 0; var5 < var4.size(); var5++) {
               String var6 = var4.id_implements(var5);

               Object var7;
               try {
                  var7 = rgB_2.id_break(var6);
                  var7 = rgv_3.id_class(var1, (rgP_2)var7, var2, 0);
               } catch (Exception var9) {
                  var7 = new rgN_2(var6);
               }

               var4.id_protected(var5, rca_3.id_class(rgB_2.id_class((rgP_2)var7)));
            }

            var3.id_class("pages", var4);
            return true;
         }
      } else {
         return false;
      }
   }

   public static boolean id_class(rcd_3 var0) {
      if (!rkm_3.id_class(var0)) {
         return false;
      } else if (!var0.id_byte("title", 8)) {
         return false;
      } else {
         String var1 = var0.id_native("title");
         return var1.length() > 32 ? false : var0.id_byte("author", 8);
      }
   }

   @Override
   public boolean id_throws(rdn_3 var1) {
      return true;
   }

   public static int id_catch(rdn_3 var0) {
      rcd_3 var1 = var0.id_package();
      return var1 != null ? var1.id_protected("pages", 8).size() : 0;
   }

   @Override
   public rgP_2 id_implements(rdn_3 var1) {
      if (var1.id_final()) {
         rcd_3 var2 = var1.id_package();
         String var3 = var2.id_native("title");
         if (!rql_3.id_break(var3)) {
            return new rgN_2(var3);
         }
      }

      return super.id_implements(var1);
   }

   public static int id_protected(rdn_3 var0) {
      return var0.id_package().id_private("generation");
   }
}

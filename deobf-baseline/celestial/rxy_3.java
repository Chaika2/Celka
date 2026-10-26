package celestial;

import java.util.List;

public class rxy_3 extends rdb_3 {
   public rxy_3(rdO_2 var1) {
      super(var1);
   }

   @Override
   public void id_class(rdn_3 var1, rYB var2, List<rgP_2> var3, VD var4) {
      super.id_class(var1, var2, var3, var4);
      rdn_3.id_class(var3, id_protected(var1));
   }

   public static void id_class(rdn_3 var0, eL_2 var1) {
      rcy_3 var2 = id_protected(var0);
      boolean var3 = true;
      rqO_2 var4 = rVL.id_boolean.id_break(var1.id_class);

      for (int var5 = 0; var5 < var2.size(); var5++) {
         rcd_3 var6 = var2.id_class(var5);
         rqO_2 var7 = rqO_2.id_break(var6.id_native("id"));
         if (var7 != null && var7.equals(var4)) {
            if (var6.id_private("lvl") < var1.id_break) {
               var6.id_class("lvl", (short)var1.id_break);
            }

            var3 = false;
            break;
         }
      }

      if (var3) {
         rcd_3 var8 = new rcd_3();
         var8.id_class("id", String.valueOf(var4));
         var8.id_class("lvl", (short)var1.id_break);
         var2.add(var8);
      }

      var0.id_int().id_class("StoredEnchantments", var2);
   }

   public static rdn_3 id_class(eL_2 var0) {
      rdn_3 var1 = new rdn_3(rdy_3.dm);
      id_class(var1, var0);
      return var1;
   }

   @Override
   public void id_class(rdX_2 var1, rqs_3<rdn_3> var2) {
      if (var1 == rdX_2.id_catch) {
         for (ev_3 var4 : rVL.id_boolean) {
            if (var4.id_break != null) {
               for (int var5 = var4.id_throws(); var5 <= var4.id_class(); var5++) {
                  var2.add(id_class(new eL_2(var4, var5)));
               }
            }
         }
      } else if (var1.id_final().length != 0) {
         for (ev_3 var7 : rVL.id_boolean) {
            if (var1.id_class(var7.id_break)) {
               var2.add(id_class(new eL_2(var7, var7.id_class())));
            }
         }
      }
   }

   @Override
   public boolean id_class(rdn_3 var1) {
      return false;
   }

   @Override
   public boolean id_throws(rdn_3 var1) {
      return true;
   }

   public static rcy_3 id_protected(rdn_3 var0) {
      rcd_3 var1 = var0.id_package();
      return var1 != null ? var1.id_protected("StoredEnchantments", 10) : new rcy_3();
   }
}

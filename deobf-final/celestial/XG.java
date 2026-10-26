package celestial;

import com.google.gson.JsonObject;

public class XG extends hG_2<Xb_1> {
   static final rqO_2 class_ = new rqO_2("inventory_changed");

   private void class_(rhN_2 var1, rhz_3 var2, rdn_3 var3, int var4, int var5, int var6) {
      this.class_(var1, var5x -> var5x.class_(var2, var3, var4, var5, var6));
   }

   @Override
   public rqO_2 class_() {
      return class_;
   }

   public void class_(rhN_2 var1, rhz_3 var2, rdn_3 var3) {
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;

      for (int var7 = 0; var7 < var2.else_(); var7++) {
         rdn_3 var8 = var2.extends_(var7);
         if (var8.class_()) {
            var5++;
         } else {
            var6++;
            if (var8.char_() >= var8.byte_()) {
               var4++;
            }
         }
      }

      this.class_(var1, var2, var3, var4, var5, var6);
   }

   public Xb_1 break_(JsonObject var1, ho_3 var2, rWl_1 var3) {
      JsonObject var4 = rpY_2.class_(var1, "slots", new JsonObject());
      XF var5 = XF.class_(var4.get("occupied"));
      XF var6 = XF.class_(var4.get("full"));
      XF var7 = XF.class_(var4.get("empty"));
      Xh_1[] var8 = Xh_1.break_(var1.get("items"));
      return new Xb_1(var2, var5, var6, var7, var8);
   }
}

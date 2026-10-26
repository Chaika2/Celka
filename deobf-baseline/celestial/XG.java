package celestial;

import com.google.gson.JsonObject;

public class XG extends hG_2<Xb_1> {
   static final rqO_2 id_class = new rqO_2("inventory_changed");

   private void id_class(rhN_2 var1, rhz_3 var2, rdn_3 var3, int var4, int var5, int var6) {
      this.id_class(var1, var5x -> var5x.id_class(var2, var3, var4, var5, var6));
   }

   @Override
   public rqO_2 id_class() {
      return id_class;
   }

   public void id_class(rhN_2 var1, rhz_3 var2, rdn_3 var3) {
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;

      for (int var7 = 0; var7 < var2.id_else(); var7++) {
         rdn_3 var8 = var2.id_extends(var7);
         if (var8.id_class()) {
            var5++;
         } else {
            var6++;
            if (var8.id_char() >= var8.id_byte()) {
               var4++;
            }
         }
      }

      this.id_class(var1, var2, var3, var4, var5, var6);
   }

   public Xb_1 id_break(JsonObject var1, ho_3 var2, rWl_1 var3) {
      JsonObject var4 = rpY_2.id_class(var1, "slots", new JsonObject());
      XF var5 = XF.id_class(var4.get("occupied"));
      XF var6 = XF.id_class(var4.get("full"));
      XF var7 = XF.id_class(var4.get("empty"));
      Xh_1[] var8 = Xh_1.id_break(var1.get("items"));
      return new Xb_1(var2, var5, var6, var7, var8);
   }
}

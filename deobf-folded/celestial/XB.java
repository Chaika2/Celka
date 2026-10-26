package celestial;

import com.google.gson.JsonObject;
import java.util.Collection;

public class XB extends hZ_2 {
   private final Xh_1 id_class;
   private final ho_3 id_break;
   private final Xh_1 id_byte;

   public XB(ho_3 var1, Xh_1 var2, ho_3 var3, Xh_1 var4) {
      super(XP.id_class, var1);
      this.id_class = var2;
      this.id_break = var3;
      this.id_byte = var4;
   }

   @Override
   public JsonObject id_class(rWH var1) {
      JsonObject var2 = super.id_class(var1);
      var2.add("rod", this.id_class.id_class());
      var2.add("entity", this.id_break.id_class(var1));
      var2.add("item", this.id_byte.id_class());
      return var2;
   }

   public boolean id_class(rdn_3 var1, rzr_3 var2, Collection<rdn_3> var3) {
      if (!this.id_class.id_class(var1)) {
         return false;
      } else if (!this.id_break.id_class(var2)) {
         return false;
      } else {
         if (this.id_byte != Xh_1.id_class) {
            boolean var4 = false;
            an_3 var5 = var2.id_break(rzQ_2.id_class);
            if (var5 instanceof rsE_2 var6 && this.id_byte.id_class(var6.id_protected())) {
               var4 = true;
            }

            for (rdn_3 var7 : var3) {
               if (this.id_byte.id_class(var7)) {
                  var4 = true;
                  break;
               }
            }

            if (!var4) {
               return false;
            }
         }

         return true;
      }
   }

   public static XB id_class(Xh_1 var0, hY_2 var1, Xh_1 var2) {
      return new XB(ho_3.id_class, var0, ho_3.id_class(var1), var2);
   }
}

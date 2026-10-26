package celestial;

import com.google.gson.JsonObject;

public class XO extends hZ_2 {
   private final Xh_1 id_class;
   private final XF id_break;
   private final XF id_byte;

   public XO(ho_3 var1, Xh_1 var2, XF var3, XF var4) {
      super(XM.id_class, var1);
      this.id_class = var2;
      this.id_break = var3;
      this.id_byte = var4;
   }

   @Override
   public JsonObject id_class(rWH var1) {
      JsonObject var2 = super.id_class(var1);
      var2.add("item", this.id_class.id_class());
      var2.add("durability", this.id_break.id_protected());
      var2.add("delta", this.id_byte.id_protected());
      return var2;
   }

   public boolean id_class(rdn_3 var1, int var2) {
      if (!this.id_class.id_class(var1)) {
         return false;
      } else {
         return !this.id_break.id_byte(var1.id_private() - var2) ? false : this.id_byte.id_byte(var1.id_catch() - var2);
      }
   }

   public static XO id_class(ho_3 var0, Xh_1 var1, XF var2) {
      return new XO(var0, var1, var2, XF.id_throws);
   }
}

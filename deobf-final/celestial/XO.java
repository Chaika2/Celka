package celestial;

import com.google.gson.JsonObject;

public class XO extends hZ_2 {
   private final Xh_1 class_;
   private final XF break_;
   private final XF byte_;

   public XO(ho_3 var1, Xh_1 var2, XF var3, XF var4) {
      super(XM.class_, var1);
      this.class_ = var2;
      this.break_ = var3;
      this.byte_ = var4;
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = super.class_(var1);
      var2.add("item", this.class_.class_());
      var2.add("durability", this.break_.protected_());
      var2.add("delta", this.byte_.protected_());
      return var2;
   }

   public boolean class_(rdn_3 var1, int var2) {
      if (!this.class_.class_(var1)) {
         return false;
      } else {
         return !this.break_.byte_(var1.private_() - var2) ? false : this.byte_.byte_(var1.catch_() - var2);
      }
   }

   public static XO class_(ho_3 var0, Xh_1 var1, XF var2) {
      return new XO(var0, var1, var2, XF.throws_);
   }
}

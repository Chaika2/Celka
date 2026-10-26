package celestial;

import com.google.gson.JsonObject;

public class hm_3 extends hZ_2 {
   private final Xh_1 id_class;

   public hm_3(ho_3 var1, Xh_1 var2) {
      super(hu_3.id_class, var1);
      this.id_class = var2;
   }

   @Override
   public JsonObject id_class(rWH var1) {
      JsonObject var2 = super.id_class(var1);
      var2.add("item", this.id_class.id_class());
      return var2;
   }

   public boolean id_class(rdn_3 var1) {
      return this.id_class.id_class(var1);
   }

   public static hm_3 id_class(rpL_2 var0) {
      return new hm_3(
         ho_3.id_class, new Xh_1((rlb_3<rdb_3>)null, var0.id_case(), XF.id_throws, XF.id_throws, hT_2.id_break, hT_2.id_break, (rLi_1)null, XC.id_class)
      );
   }

   public static hm_3 id_break() {
      return new hm_3(ho_3.id_class, Xh_1.id_class);
   }
}

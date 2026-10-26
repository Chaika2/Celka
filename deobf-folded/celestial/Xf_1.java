package celestial;

import com.google.gson.JsonObject;

public class Xf_1 extends hZ_2 {
   private final hL_2 id_class;
   private final ho_3 id_break;

   public Xf_1(ho_3 var1, hL_2 var2, ho_3 var3) {
      super(XI.id_class, var1);
      this.id_class = var2;
      this.id_break = var3;
   }

   @Override
   public JsonObject id_class(rWH var1) {
      JsonObject var2 = super.id_class(var1);
      var2.add("damage", this.id_class.id_class());
      var2.add("entity", this.id_break.id_class(var1));
      return var2;
   }

   public boolean id_class(rhN_2 var1, rzr_3 var2, rye_3 var3, float var4, float var5, boolean var6) {
      return !this.id_class.id_class(var1, var3, var4, var5, var6) ? false : this.id_break.id_class(var2);
   }

   public static Xf_1 id_class(hA_2 var0) {
      return new Xf_1(ho_3.id_class, var0.id_break(), ho_3.id_class);
   }
}

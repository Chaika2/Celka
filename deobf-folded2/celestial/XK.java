package celestial;

import com.google.gson.JsonObject;

public class XK extends hZ_2 {
   private final XN id_class;

   public XK(rqO_2 var1, ho_3 var2, XN var3) {
      super(var1, var2);
      this.id_class = var3;
   }

   public boolean id_class(rrEm_1 var1, double var2, double var4, double var6) {
      return this.id_class.id_class(var1, var2, var4, var6);
   }

   @Override
   public JsonObject id_class(rWH var1) {
      JsonObject var2 = super.id_class(var1);
      var2.add("location", this.id_class.id_class());
      return var2;
   }

   public static XK id_class(XN var0) {
      return new XK(Oo_1.id_int.id_class, ho_3.id_class, var0);
   }

   public static XK id_break() {
      return new XK(Oo_1.id_new.id_class, ho_3.id_class, XN.id_class);
   }

   public static XK id_protected() {
      return new XK(Oo_1.id_float.id_class, ho_3.id_class, XN.id_class);
   }
}

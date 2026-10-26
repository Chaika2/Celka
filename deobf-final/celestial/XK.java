package celestial;

import com.google.gson.JsonObject;

public class XK extends hZ_2 {
   private final XN class_;

   public XK(rqO_2 var1, ho_3 var2, XN var3) {
      super(var1, var2);
      this.class_ = var3;
   }

   public boolean class_(rrEm_1 var1, double var2, double var4, double var6) {
      return this.class_.class_(var1, var2, var4, var6);
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = super.class_(var1);
      var2.add("location", this.class_.class_());
      return var2;
   }

   public static XK class_(XN var0) {
      return new XK(Oo_1.int_.class_, ho_3.class_, var0);
   }

   public static XK break_() {
      return new XK(Oo_1.new_.class_, ho_3.class_, XN.class_);
   }

   public static XK protected_() {
      return new XK(Oo_1.float_.class_, ho_3.class_, XN.class_);
   }
}

package celestial;

import com.google.gson.JsonObject;

public class XH extends hZ_2 {
   private final XN class_;
   private final XN break_;
   private final hl_3 byte_;

   public XH(ho_3 var1, XN var2, XN var3, hl_3 var4) {
      super(Xl_1.class_, var1);
      this.class_ = var2;
      this.break_ = var3;
      this.byte_ = var4;
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = super.class_(var1);
      var2.add("entered", this.class_.class_());
      var2.add("exited", this.break_.class_());
      var2.add("distance", this.byte_.class_());
      return var2;
   }

   public boolean class_(rrEm_1 var1, rjU_2 var2, double var3, double var5, double var7) {
      if (!this.class_.class_(var1, var2.break_, var2.byte_, var2.protected_)) {
         return false;
      } else {
         return !this.break_.class_(var1, var3, var5, var7) ? false : this.byte_.class_(var2.break_, var2.byte_, var2.protected_, var3, var5, var7);
      }
   }

   public static XH class_(hl_3 var0) {
      return new XH(ho_3.class_, XN.class_, XN.class_, var0);
   }
}

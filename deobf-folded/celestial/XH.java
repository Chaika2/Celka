package celestial;

import com.google.gson.JsonObject;

public class XH extends hZ_2 {
   private final XN id_class;
   private final XN id_break;
   private final hl_3 id_byte;

   public XH(ho_3 var1, XN var2, XN var3, hl_3 var4) {
      super(Xl_1.id_class, var1);
      this.id_class = var2;
      this.id_break = var3;
      this.id_byte = var4;
   }

   @Override
   public JsonObject id_class(rWH var1) {
      JsonObject var2 = super.id_class(var1);
      var2.add("entered", this.id_class.id_class());
      var2.add("exited", this.id_break.id_class());
      var2.add("distance", this.id_byte.id_class());
      return var2;
   }

   public boolean id_class(rrEm_1 var1, rjU_2 var2, double var3, double var5, double var7) {
      if (!this.id_class.id_class(var1, var2.id_break, var2.id_byte, var2.id_protected)) {
         return false;
      } else {
         return !this.id_break.id_class(var1, var3, var5, var7)
            ? false
            : this.id_byte.id_class(var2.id_break, var2.id_byte, var2.id_protected, var3, var5, var7);
      }
   }

   public static XH id_class(hl_3 var0) {
      return new XH(ho_3.id_class, XN.id_class, XN.id_class, var0);
   }
}

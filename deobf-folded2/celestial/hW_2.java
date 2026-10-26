package celestial;

import com.google.gson.JsonObject;

public class hW_2 extends hZ_2 {
   private final rqM_2<rYB> id_class;
   private final rqM_2<rYB> id_break;

   public hW_2(ho_3 var1, rqM_2<rYB> var2, rqM_2<rYB> var3) {
      super(hk_3.id_class, var1);
      this.id_class = var2;
      this.id_break = var3;
   }

   @Override
   public JsonObject id_class(rWH var1) {
      JsonObject var2 = super.id_class(var1);
      if (this.id_class != null) {
         var2.addProperty("from", this.id_class.id_class().toString());
      }

      if (this.id_break != null) {
         var2.addProperty("to", this.id_break.id_class().toString());
      }

      return var2;
   }

   public boolean id_class(rqM_2<rYB> var1, rqM_2<rYB> var2) {
      return this.id_class != null && this.id_class != var1 ? false : this.id_break == null || this.id_break == var2;
   }

   public static hW_2 id_class(rqM_2<rYB> var0) {
      return new hW_2(ho_3.id_class, (rqM_2<rYB>)null, var0);
   }
}

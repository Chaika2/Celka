package celestial;

import com.google.gson.JsonObject;

public class hW_2 extends hZ_2 {
   private final rqM_2<rYB> class_;
   private final rqM_2<rYB> break_;

   public hW_2(ho_3 var1, rqM_2<rYB> var2, rqM_2<rYB> var3) {
      super(hk_3.class_, var1);
      this.class_ = var2;
      this.break_ = var3;
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = super.class_(var1);
      if (this.class_ != null) {
         var2.addProperty("from", this.class_.class_().toString());
      }

      if (this.break_ != null) {
         var2.addProperty("to", this.break_.class_().toString());
      }

      return var2;
   }

   public boolean class_(rqM_2<rYB> var1, rqM_2<rYB> var2) {
      return this.class_ != null && this.class_ != var1 ? false : this.break_ == null || this.break_ == var2;
   }

   public static hW_2 class_(rqM_2<rYB> var0) {
      return new hW_2(ho_3.class_, (rqM_2<rYB>)null, var0);
   }
}

package celestial;

import com.google.gson.JsonObject;

public class hF_2 extends hZ_2 {
   private final ho_3 class_;
   private final ho_3 break_;

   public hF_2(ho_3 var1, ho_3 var2, ho_3 var3) {
      super(hv_3.class_, var1);
      this.class_ = var2;
      this.break_ = var3;
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = super.class_(var1);
      var2.add("zombie", this.class_.class_(var1));
      var2.add("villager", this.break_.class_(var1));
      return var2;
   }

   public boolean class_(rzr_3 var1, rzr_3 var2) {
      return !this.class_.class_(var1) ? false : this.break_.class_(var2);
   }

   public static hF_2 break_() {
      return new hF_2(ho_3.class_, ho_3.class_, ho_3.class_);
   }
}

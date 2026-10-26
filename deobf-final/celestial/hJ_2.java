package celestial;

import com.google.gson.JsonObject;

public class hJ_2 extends hZ_2 {
   private final ho_3 class_;
   private final ho_3 break_;
   private final ho_3 byte_;

   public hJ_2(ho_3 var1, ho_3 var2, ho_3 var3, ho_3 var4) {
      super(hX_2.class_, var1);
      this.class_ = var2;
      this.break_ = var3;
      this.byte_ = var4;
   }

   public static hJ_2 class_(hY_2 var0, hY_2 var1, hY_2 var2) {
      return new hJ_2(ho_3.class_, ho_3.class_(var0), ho_3.class_(var1), ho_3.class_(var2));
   }

   public boolean class_(rzr_3 var1, rzr_3 var2, rzr_3 var3) {
      return this.byte_ == ho_3.class_ || var3 != null && this.byte_.class_(var3)
         ? this.class_.class_(var1) && this.break_.class_(var2) || this.class_.class_(var2) && this.break_.class_(var1)
         : false;
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = super.class_(var1);
      var2.add("parent", this.class_.class_(var1));
      var2.add("partner", this.break_.class_(var1));
      var2.add("child", this.byte_.class_(var1));
      return var2;
   }

   public static hJ_2 class_(hK_2 var0) {
      return new hJ_2(ho_3.class_, ho_3.class_, ho_3.class_, ho_3.class_(var0.break_()));
   }

   public static hJ_2 break_() {
      return new hJ_2(ho_3.class_, ho_3.class_, ho_3.class_, ho_3.class_);
   }
}

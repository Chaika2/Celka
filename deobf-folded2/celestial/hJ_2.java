package celestial;

import com.google.gson.JsonObject;

public class hJ_2 extends hZ_2 {
   private final ho_3 id_class;
   private final ho_3 id_break;
   private final ho_3 id_byte;

   public hJ_2(ho_3 var1, ho_3 var2, ho_3 var3, ho_3 var4) {
      super(hX_2.id_class, var1);
      this.id_class = var2;
      this.id_break = var3;
      this.id_byte = var4;
   }

   public static hJ_2 id_class(hY_2 var0, hY_2 var1, hY_2 var2) {
      return new hJ_2(ho_3.id_class, ho_3.id_class(var0), ho_3.id_class(var1), ho_3.id_class(var2));
   }

   public boolean id_class(rzr_3 var1, rzr_3 var2, rzr_3 var3) {
      return this.id_byte == ho_3.id_class || var3 != null && this.id_byte.id_class(var3)
         ? this.id_class.id_class(var1) && this.id_break.id_class(var2) || this.id_class.id_class(var2) && this.id_break.id_class(var1)
         : false;
   }

   @Override
   public JsonObject id_class(rWH var1) {
      JsonObject var2 = super.id_class(var1);
      var2.add("parent", this.id_class.id_class(var1));
      var2.add("partner", this.id_break.id_class(var1));
      var2.add("child", this.id_byte.id_class(var1));
      return var2;
   }

   public static hJ_2 id_class(hK_2 var0) {
      return new hJ_2(ho_3.id_class, ho_3.id_class, ho_3.id_class, ho_3.id_class(var0.id_break()));
   }

   public static hJ_2 id_break() {
      return new hJ_2(ho_3.id_class, ho_3.id_class, ho_3.id_class, ho_3.id_class);
   }
}

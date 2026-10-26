package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class rkl_3<T extends rkv_3> implements rkf_3<T> {
   private final int id_synchronized;
   private final rkH_2<T> id_return;

   public rkl_3(rkH_2<T> var1, int var2) {
      this.id_synchronized = var2;
      this.id_return = var1;
   }

   public void id_class(ruu_3 var1, T var2) {
      var1.id_class(var2.id_byte);
      var2.id_protected.id_class(var1);
      var1.id_class(var2.id_throws);
      var1.writeFloat(var2.id_case);
      var1.id_protected(var2.id_catch);
   }

   public T id_class(rqO_2 var1, JsonObject var2) {
      String var3 = rpY_2.id_class(var2, "group", "");
      Object var4 = rpY_2.id_byte(var2, "ingredient") ? rpY_2.id_volatile(var2, "ingredient") : rpY_2.id_native(var2, "ingredient");
      rkg_3 var5 = rkg_3.id_class((JsonElement)var4);
      String var6 = rpY_2.id_case(var2, "result");
      rqO_2 var7 = new rqO_2(var6);
      rdn_3 var8 = new rdn_3(rVL.id_for.id_break(var7).orElseThrow(() -> new IllegalStateException("Item: " + var6 + " does not exist")));
      float var9 = rpY_2.id_class(var2, "experience", 0.0F);
      int var10 = rpY_2.id_class(var2, "cookingtime", this.id_synchronized);
      return this.id_return.create(var1, var3, var5, var8, var9, var10);
   }

   public T id_class(rqO_2 var1, ruu_3 var2) {
      String var3 = var2.id_throws(32767);
      rkg_3 var4 = rkg_3.id_break(var2);
      rdn_3 var5 = var2.id_extends();
      float var6 = var2.readFloat();
      int var7 = var2.id_case();
      return this.id_return.create(var1, var3, var4, var5, var6, var7);
   }
}

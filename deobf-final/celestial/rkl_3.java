package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class rkl_3<T extends rkv_3> implements rkf_3<T> {
   private final int synchronized_;
   private final rkH_2<T> return_;

   public rkl_3(rkH_2<T> var1, int var2) {
      this.synchronized_ = var2;
      this.return_ = var1;
   }

   public void class_(ruu_3 var1, T var2) {
      var1.class_(var2.byte_);
      var2.protected_.class_(var1);
      var1.class_(var2.throws_);
      var1.writeFloat(var2.case_);
      var1.protected_(var2.catch_);
   }

   public T class_(rqO_2 var1, JsonObject var2) {
      String var3 = rpY_2.class_(var2, "group", "");
      Object var4 = rpY_2.byte_(var2, "ingredient") ? rpY_2.volatile_(var2, "ingredient") : rpY_2.native_(var2, "ingredient");
      rkg_3 var5 = rkg_3.class_((JsonElement)var4);
      String var6 = rpY_2.case_(var2, "result");
      rqO_2 var7 = new rqO_2(var6);
      rdn_3 var8 = new rdn_3(rVL.for_.break_(var7).orElseThrow(() -> new IllegalStateException("Item: " + var6 + " does not exist")));
      float var9 = rpY_2.class_(var2, "experience", 0.0F);
      int var10 = rpY_2.class_(var2, "cookingtime", this.synchronized_);
      return this.return_.create(var1, var3, var5, var8, var9, var10);
   }

   public T class_(rqO_2 var1, ruu_3 var2) {
      String var3 = var2.throws_(32767);
      rkg_3 var4 = rkg_3.break_(var2);
      rdn_3 var5 = var2.extends_();
      float var6 = var2.readFloat();
      int var7 = var2.case_();
      return this.return_.create(var1, var3, var4, var5, var6, var7);
   }
}

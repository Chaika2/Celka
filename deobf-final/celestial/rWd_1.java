package celestial;

import com.google.gson.JsonObject;

public class rWd_1<T extends rWx_1> implements rkf_3<T> {
   final rWk_1<T> synchronized_;

   protected rWd_1(rWk_1<T> var1) {
      this.synchronized_ = var1;
   }

   public void class_(ruu_3 var1, T var2) {
      var1.class_(var2.protected_);
      var2.class_.class_(var1);
      var1.class_(var2.break_);
   }

   public T class_(rqO_2 var1, ruu_3 var2) {
      String var3 = var2.throws_(32767);
      rkg_3 var4 = rkg_3.break_(var2);
      rdn_3 var5 = var2.extends_();
      return this.synchronized_.create(var1, var3, var4, var5);
   }

   public T class_(rqO_2 var1, JsonObject var2) {
      String var3 = rpY_2.class_(var2, "group", "");
      rkg_3 var4;
      if (rpY_2.byte_(var2, "ingredient")) {
         var4 = rkg_3.class_(rpY_2.volatile_(var2, "ingredient"));
      } else {
         var4 = rkg_3.class_(rpY_2.native_(var2, "ingredient"));
      }

      String var5 = rpY_2.case_(var2, "result");
      int var6 = rpY_2.extends_(var2, "count");
      rdn_3 var7 = new rdn_3(rVL.for_.class_(new rqO_2(var5)), var6);
      return this.synchronized_.create(var1, var3, var4, var7);
   }
}

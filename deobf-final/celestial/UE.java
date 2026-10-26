package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class UE implements Dw_1 {
   private final rqO_2 class_;
   private final rdb_3 break_;
   private final int byte_;
   private final String protected_;
   private final List<rkg_3> throws_;
   private final Ot_1 case_;
   private final rqO_2 catch_;

   @Override
   public JsonObject byte_() {
      return this.case_.break_();
   }

   public UE(rqO_2 var1, rdb_3 var2, int var3, String var4, List<rkg_3> var5, Ot_1 var6, rqO_2 var7) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
      this.case_ = var6;
      this.catch_ = var7;
   }

   @Override
   public void class_(JsonObject var1) {
      if (!this.protected_.isEmpty()) {
         var1.addProperty("group", this.protected_);
      }

      JsonArray var2 = new JsonArray();

      for (rkg_3 var4 : this.throws_) {
         var2.add(var4.byte_());
      }

      var1.add("ingredients", var2);
      JsonObject var5 = new JsonObject();
      var5.addProperty("item", rVL.for_.break_(this.break_).toString());
      if (this.byte_ > 1) {
         var5.addProperty("count", this.byte_);
      }

      var1.add("result", var5);
   }

   @Override
   public rkf_3<?> class_() {
      return rkf_3.break_;
   }

   @Override
   public rqO_2 break_() {
      return this.class_;
   }

   @Override
   public rqO_2 protected_() {
      return this.catch_;
   }
}

package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class US implements Dw_1 {
   private final rqO_2 class_;
   private final rdb_3 break_;
   private final int byte_;
   private final String protected_;
   private final List<String> throws_;
   private final Map<Character, rkg_3> case_;
   private final Ot_1 catch_;
   private final rqO_2 private_;

   @Override
   public JsonObject byte_() {
      return this.catch_.break_();
   }

   public US(rqO_2 var1, rdb_3 var2, int var3, String var4, List<String> var5, Map<Character, rkg_3> var6, Ot_1 var7, rqO_2 var8, rqO_2 var9) {
      this.class_ = var2;
      this.break_ = var3;
      this.byte_ = var4;
      this.protected_ = var5;
      this.throws_ = var6;
      this.case_ = var7;
      this.catch_ = var8;
      this.private_ = var9;
   }

   @Override
   public void class_(JsonObject var1) {
      if (!this.protected_.isEmpty()) {
         var1.addProperty("group", this.protected_);
      }

      JsonArray var2 = new JsonArray();

      for (String var4 : this.throws_) {
         var2.add(var4);
      }

      var1.add("pattern", var2);
      JsonObject var6 = new JsonObject();

      for (Entry var5 : this.case_.entrySet()) {
         var6.add(String.valueOf(var5.getKey()), ((rkg_3)var5.getValue()).byte_());
      }

      var1.add("key", var6);
      JsonObject var8 = new JsonObject();
      var8.addProperty("item", rVL.for_.break_(this.break_).toString());
      if (this.byte_ > 1) {
         var8.addProperty("count", this.byte_);
      }

      var1.add("result", var8);
   }

   @Override
   public rkf_3<?> class_() {
      return rkf_3.class_;
   }

   @Override
   public rqO_2 break_() {
      return this.class_;
   }

   @Override
   public rqO_2 protected_() {
      return this.private_;
   }
}

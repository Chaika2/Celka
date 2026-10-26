package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class US implements Dw_1 {
   private final rqO_2 id_class;
   private final rdb_3 id_break;
   private final int id_byte;
   private final String id_protected;
   private final List<String> id_throws;
   private final Map<Character, rkg_3> id_case;
   private final Ot_1 id_catch;
   private final rqO_2 id_private;

   @Override
   public JsonObject id_byte() {
      return this.id_catch.id_break();
   }

   public US(rqO_2 var1, rdb_3 var2, int var3, String var4, List<String> var5, Map<Character, rkg_3> var6, Ot_1 var7, rqO_2 var8, rqO_2 var9) {
      this.id_class = var2;
      this.id_break = var3;
      this.id_byte = var4;
      this.id_protected = var5;
      this.id_throws = var6;
      this.id_case = var7;
      this.id_catch = var8;
      this.id_private = var9;
   }

   @Override
   public void id_class(JsonObject var1) {
      if (!this.id_protected.isEmpty()) {
         var1.addProperty("group", this.id_protected);
      }

      JsonArray var2 = new JsonArray();

      for (String var4 : this.id_throws) {
         var2.add(var4);
      }

      var1.add("pattern", var2);
      JsonObject var6 = new JsonObject();

      for (Entry var5 : this.id_case.entrySet()) {
         var6.add(String.valueOf(var5.getKey()), ((rkg_3)var5.getValue()).id_byte());
      }

      var1.add("key", var6);
      JsonObject var8 = new JsonObject();
      var8.addProperty("item", rVL.id_for.id_break(this.id_break).toString());
      if (this.id_byte > 1) {
         var8.addProperty("count", this.id_byte);
      }

      var1.add("result", var8);
   }

   @Override
   public rkf_3<?> id_class() {
      return rkf_3.id_class;
   }

   @Override
   public rqO_2 id_break() {
      return this.id_class;
   }

   @Override
   public rqO_2 id_protected() {
      return this.id_private;
   }
}

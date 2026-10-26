package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class UE implements Dw_1 {
   private final rqO_2 id_class;
   private final rdb_3 id_break;
   private final int id_byte;
   private final String id_protected;
   private final List<rkg_3> id_throws;
   private final Ot_1 id_case;
   private final rqO_2 id_catch;

   @Override
   public JsonObject id_byte() {
      return this.id_case.id_break();
   }

   public UE(rqO_2 var1, rdb_3 var2, int var3, String var4, List<rkg_3> var5, Ot_1 var6, rqO_2 var7) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_case = var6;
      this.id_catch = var7;
   }

   @Override
   public void id_class(JsonObject var1) {
      if (!this.id_protected.isEmpty()) {
         var1.addProperty("group", this.id_protected);
      }

      JsonArray var2 = new JsonArray();

      for (rkg_3 var4 : this.id_throws) {
         var2.add(var4.id_byte());
      }

      var1.add("ingredients", var2);
      JsonObject var5 = new JsonObject();
      var5.addProperty("item", rVL.id_for.id_break(this.id_break).toString());
      if (this.id_byte > 1) {
         var5.addProperty("count", this.id_byte);
      }

      var1.add("result", var5);
   }

   @Override
   public rkf_3<?> id_class() {
      return rkf_3.id_break;
   }

   @Override
   public rqO_2 id_break() {
      return this.id_class;
   }

   @Override
   public rqO_2 id_protected() {
      return this.id_catch;
   }
}

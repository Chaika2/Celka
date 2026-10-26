package celestial;

import com.google.gson.JsonObject;

public class Ub_1 implements Dw_1 {
   private final rqO_2 id_class;
   private final String id_break;
   private final rkg_3 id_byte;
   private final rdb_3 id_protected;
   private final int id_throws;
   private final Ot_1 id_case;
   private final rqO_2 id_catch;
   private final rkf_3<?> id_private;

   @Override
   public JsonObject id_byte() {
      return this.id_case.id_break();
   }

   public Ub_1(rqO_2 var1, rkf_3<?> var2, String var3, rkg_3 var4, rdb_3 var5, int var6, Ot_1 var7, rqO_2 var8) {
      this.id_class = var1;
      this.id_private = var2;
      this.id_break = var3;
      this.id_byte = var4;
      this.id_protected = var5;
      this.id_throws = var6;
      this.id_case = var7;
      this.id_catch = var8;
   }

   @Override
   public rkf_3<?> id_class() {
      return this.id_private;
   }

   @Override
   public void id_class(JsonObject var1) {
      if (!this.id_break.isEmpty()) {
         var1.addProperty("group", this.id_break);
      }

      var1.add("ingredient", this.id_byte.id_byte());
      var1.addProperty("result", rVL.id_for.id_break(this.id_protected).toString());
      var1.addProperty("count", this.id_throws);
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

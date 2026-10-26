package celestial;

import com.google.gson.JsonObject;

public class UO implements Dw_1 {
   private final rqO_2 id_class;
   private final rkg_3 id_break;
   private final rkg_3 id_byte;
   private final rdb_3 id_protected;
   private final Ot_1 id_throws;
   private final rqO_2 id_case;
   private final rkf_3<?> id_catch;

   @Override
   public JsonObject id_byte() {
      return this.id_throws.id_break();
   }

   public UO(rqO_2 var1, rkf_3<?> var2, rkg_3 var3, rkg_3 var4, rdb_3 var5, Ot_1 var6, rqO_2 var7) {
      this.id_class = var1;
      this.id_catch = var2;
      this.id_break = var3;
      this.id_byte = var4;
      this.id_protected = var5;
      this.id_throws = var6;
      this.id_case = var7;
   }

   @Override
   public rkf_3<?> id_class() {
      return this.id_catch;
   }

   @Override
   public void id_class(JsonObject var1) {
      var1.add("base", this.id_break.id_byte());
      var1.add("addition", this.id_byte.id_byte());
      JsonObject var2 = new JsonObject();
      var2.addProperty("item", rVL.id_for.id_break(this.id_protected).toString());
      var1.add("result", var2);
   }

   @Override
   public rqO_2 id_break() {
      return this.id_class;
   }

   @Override
   public rqO_2 id_protected() {
      return this.id_case;
   }
}

package celestial;

import com.google.gson.JsonObject;

public class Dv_1 implements Dw_1 {
   private final rqO_2 id_class;
   private final String id_break;
   private final rkg_3 id_byte;
   private final rdb_3 id_protected;
   private final float id_throws;
   private final int id_case;
   private final Ot_1 id_catch;
   private final rqO_2 id_private;
   private final rkf_3<? extends rkv_3> id_implements;

   @Override
   public JsonObject id_byte() {
      return this.id_catch.id_break();
   }

   public Dv_1(rqO_2 var1, String var2, rkg_3 var3, rdb_3 var4, float var5, int var6, Ot_1 var7, rqO_2 var8, rkf_3<? extends rkv_3> var9) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_case = var6;
      this.id_catch = var7;
      this.id_private = var8;
      this.id_implements = var9;
   }

   @Override
   public void id_class(JsonObject var1) {
      if (!this.id_break.isEmpty()) {
         var1.addProperty("group", this.id_break);
      }

      var1.add("ingredient", this.id_byte.id_byte());
      var1.addProperty("result", rVL.id_for.id_break(this.id_protected).toString());
      var1.addProperty("experience", this.id_throws);
      var1.addProperty("cookingtime", this.id_case);
   }

   @Override
   public rkf_3<?> id_class() {
      return this.id_implements;
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

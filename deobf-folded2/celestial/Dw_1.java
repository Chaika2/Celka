package celestial;

import com.google.gson.JsonObject;

public interface Dw_1 {
   JsonObject id_byte();

   rkf_3<?> id_class();

   void id_class(JsonObject var1);

   rqO_2 id_break();

   default JsonObject id_throws() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("type", rVL.M.id_break(this.id_class()).toString());
      this.id_class(var1);
      return var1;
   }

   rqO_2 id_protected();
}

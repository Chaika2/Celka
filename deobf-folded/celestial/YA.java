package celestial;

import com.google.gson.JsonObject;

public class YA implements RI<Yv_1> {
   public void id_class(Yv_1 var1, JsonObject var2) {
      var2.addProperty("amount", var1.id_protected ? "multiple" : "single");
   }

   public void id_class(Yv_1 var1, ruu_3 var2) {
      byte var3 = 0;
      if (var1.id_protected) {
         var3 = (byte)(var3 | 1);
      }

      var2.writeByte(var3);
   }

   public Yv_1 id_break(ruu_3 var1) {
      byte var2 = var1.readByte();
      boolean var3 = (var2 & 1) != 0;
      return new Yv_1(var3);
   }
}

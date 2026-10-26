package celestial;

import com.google.gson.JsonObject;

public class Rv_1 implements RI<RZ> {
   public void id_class(RZ var1, JsonObject var2) {
      var2.addProperty("amount", var1.id_private ? "single" : "multiple");
      var2.addProperty("type", var1.id_implements ? "players" : "entities");
   }

   public void id_class(RZ var1, ruu_3 var2) {
      byte var3 = 0;
      if (var1.id_private) {
         var3 = (byte)(var3 | 1);
      }

      if (var1.id_implements) {
         var3 = (byte)(var3 | 2);
      }

      var2.writeByte(var3);
   }

   public RZ id_break(ruu_3 var1) {
      byte var2 = var1.readByte();
      return new RZ((var2 & 1) != 0, (var2 & 2) != 0);
   }
}

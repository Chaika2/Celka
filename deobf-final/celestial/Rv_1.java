package celestial;

import com.google.gson.JsonObject;

public class Rv_1 implements RI<RZ> {
   public void class_(RZ var1, JsonObject var2) {
      var2.addProperty("amount", var1.private_ ? "single" : "multiple");
      var2.addProperty("type", var1.implements_ ? "players" : "entities");
   }

   public void class_(RZ var1, ruu_3 var2) {
      byte var3 = 0;
      if (var1.private_) {
         var3 = (byte)(var3 | 1);
      }

      if (var1.implements_) {
         var3 = (byte)(var3 | 2);
      }

      var2.writeByte(var3);
   }

   public RZ break_(ruu_3 var1) {
      byte var2 = var1.readByte();
      return new RZ((var2 & 1) != 0, (var2 & 2) != 0);
   }
}

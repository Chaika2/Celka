package celestial;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.FloatArgumentType;

public class YV implements RI<FloatArgumentType> {
   public void id_class(FloatArgumentType var1, JsonObject var2) {
      if (var1.getMinimum() != -Float.MAX_VALUE) {
         var2.addProperty("min", var1.getMinimum());
      }

      if (var1.getMaximum() != Float.MAX_VALUE) {
         var2.addProperty("max", var1.getMaximum());
      }
   }

   public void id_class(FloatArgumentType var1, ruu_3 var2) {
      boolean var3 = var1.getMinimum() != -Float.MAX_VALUE;
      boolean var4 = var1.getMaximum() != Float.MAX_VALUE;
      var2.writeByte(Yf_1.id_class(var3, var4));
      if (var3) {
         var2.writeFloat(var1.getMinimum());
      }

      if (var4) {
         var2.writeFloat(var1.getMaximum());
      }
   }

   public FloatArgumentType id_break(ruu_3 var1) {
      byte var2 = var1.readByte();
      float var3 = Yf_1.id_class(var2) ? var1.readFloat() : -Float.MAX_VALUE;
      float var4 = Yf_1.id_break(var2) ? var1.readFloat() : Float.MAX_VALUE;
      return FloatArgumentType.floatArg(var3, var4);
   }
}

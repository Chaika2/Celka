package celestial;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class Yj_1 implements RI<DoubleArgumentType> {
   public void id_class(DoubleArgumentType var1, JsonObject var2) {
      if (var1.getMinimum() != -Double.MAX_VALUE) {
         var2.addProperty("min", var1.getMinimum());
      }

      if (var1.getMaximum() != Double.MAX_VALUE) {
         var2.addProperty("max", var1.getMaximum());
      }
   }

   public void id_class(DoubleArgumentType var1, ruu_3 var2) {
      boolean var3 = var1.getMinimum() != -Double.MAX_VALUE;
      boolean var4 = var1.getMaximum() != Double.MAX_VALUE;
      var2.writeByte(Yf_1.id_class(var3, var4));
      if (var3) {
         var2.writeDouble(var1.getMinimum());
      }

      if (var4) {
         var2.writeDouble(var1.getMaximum());
      }
   }

   public DoubleArgumentType id_break(ruu_3 var1) {
      byte var2 = var1.readByte();
      double var3 = Yf_1.id_class(var2) ? var1.readDouble() : -Double.MAX_VALUE;
      double var5 = Yf_1.id_break(var2) ? var1.readDouble() : Double.MAX_VALUE;
      return DoubleArgumentType.doubleArg(var3, var5);
   }
}

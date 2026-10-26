package celestial;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.IntegerArgumentType;

public class Yg_1 implements RI<IntegerArgumentType> {
   public void class_(IntegerArgumentType var1, JsonObject var2) {
      if (var1.getMinimum() != Integer.MIN_VALUE) {
         var2.addProperty("min", var1.getMinimum());
      }

      if (var1.getMaximum() != Integer.MAX_VALUE) {
         var2.addProperty("max", var1.getMaximum());
      }
   }

   public void class_(IntegerArgumentType var1, ruu_3 var2) {
      boolean var3 = var1.getMinimum() != Integer.MIN_VALUE;
      boolean var4 = var1.getMaximum() != Integer.MAX_VALUE;
      var2.writeByte(Yf_1.class_(var3, var4));
      if (var3) {
         var2.writeInt(var1.getMinimum());
      }

      if (var4) {
         var2.writeInt(var1.getMaximum());
      }
   }

   public IntegerArgumentType break_(ruu_3 var1) {
      byte var2 = var1.readByte();
      int var3 = Yf_1.class_(var2) ? var1.readInt() : Integer.MIN_VALUE;
      int var4 = Yf_1.break_(var2) ? var1.readInt() : Integer.MAX_VALUE;
      return IntegerArgumentType.integer(var3, var4);
   }
}

package celestial;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.LongArgumentType;

public class YR implements RI<LongArgumentType> {
   public void id_class(LongArgumentType var1, JsonObject var2) {
      if (var1.getMinimum() != Long.MIN_VALUE) {
         var2.addProperty("min", var1.getMinimum());
      }

      if (var1.getMaximum() != Long.MAX_VALUE) {
         var2.addProperty("max", var1.getMaximum());
      }
   }

   public void id_class(LongArgumentType var1, ruu_3 var2) {
      boolean var3 = var1.getMinimum() != Long.MIN_VALUE;
      boolean var4 = var1.getMaximum() != Long.MAX_VALUE;
      var2.writeByte(Yf_1.id_class(var3, var4));
      if (var3) {
         var2.writeLong(var1.getMinimum());
      }

      if (var4) {
         var2.writeLong(var1.getMaximum());
      }
   }

   public LongArgumentType id_break(ruu_3 var1) {
      byte var2 = var1.readByte();
      long var3 = Yf_1.id_class(var2) ? var1.readLong() : Long.MIN_VALUE;
      long var5 = Yf_1.id_break(var2) ? var1.readLong() : Long.MAX_VALUE;
      return LongArgumentType.longArg(var3, var5);
   }
}

package celestial;

import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.LongArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;

public class Yf_1 {
   public static boolean id_class(byte var0) {
      return (var0 & 1) != 0;
   }

   public static byte id_class(boolean var0, boolean var1) {
      byte var2 = 0;
      if (var0) {
         var2 = (byte)(var2 | 1);
      }

      if (var1) {
         var2 = (byte)(var2 | 2);
      }

      return var2;
   }

   public static void id_class() {
      RG.id_class("brigadier:bool", BoolArgumentType.class, new RE(BoolArgumentType::bool));
      RG.id_class("brigadier:float", FloatArgumentType.class, new YV());
      RG.id_class("brigadier:double", DoubleArgumentType.class, new Yj_1());
      RG.id_class("brigadier:integer", IntegerArgumentType.class, new Yg_1());
      RG.id_class("brigadier:long", LongArgumentType.class, new YR());
      RG.id_class("brigadier:string", StringArgumentType.class, new YY());
   }

   public static boolean id_break(byte var0) {
      return (var0 & 2) != 0;
   }
}

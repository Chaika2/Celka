package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class reO_2 extends rUO<rUt_1> {
   private static final rfH_2 id_class = new rfH_2(8, 3, 8);
   private static final rfj_3 b = new rfj_3(id_class);

   public reO_2(Codec<rUt_1> var1) {
      super(var1);
   }

   private static int id_class(int var0, int var1, int var2, int var3) {
      return Math.max(Math.abs(var0 - var2), Math.abs(var1 - var3));
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUt_1 var5) {
      rfj_3 var6 = new rfj_3(var4);
      if (id_class(var6.id_break, var6.id_byte, b.id_break, b.id_byte) > 1) {
         return true;
      } else {
         rfw_3 var7 = new rfw_3();

         for (int var8 = var6.id_byte(); var8 <= var6.id_throws(); var8++) {
            for (int var9 = var6.id_break(); var9 <= var6.id_protected(); var9++) {
               if (id_class(id_class.b_(), id_class.d_(), var9, var8) <= 16) {
                  var7.id_class(var9, id_class.c_(), var8);
                  if (var7.equals(id_class)) {
                     var1.id_class(var7, xu_3.id_volatile.id_continue(), 2);
                  } else {
                     var1.id_class(var7, xu_3.id_break.id_continue(), 2);
                  }
               }
            }
         }

         return true;
      }
   }
}

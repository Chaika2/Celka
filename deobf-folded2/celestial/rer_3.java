package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rer_3 extends rUO<rUH> {
   public rer_3(Codec<rUH> var1) {
      super(var1);
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUH var5) {
      if (!var5.id_case.contains(var1.id_byte(var4.id_final()).id_break())) {
         return false;
      } else if (var5.id_byte && !var5.id_case.contains(var1.id_byte(var4.id_break()).id_break())) {
         return false;
      } else {
         xc_3 var6 = var1.id_byte(var4);
         if (!var6.id_catch() && !var5.id_case.contains(var6.id_break())) {
            return false;
         } else {
            int var7 = 0;
            int var8 = 0;
            if (var5.id_case.contains(var1.id_byte(var4.id_byte()).id_break())) {
               var8++;
            }

            if (var5.id_case.contains(var1.id_byte(var4.id_extends()).id_break())) {
               var8++;
            }

            if (var5.id_case.contains(var1.id_byte(var4.id_private()).id_break())) {
               var8++;
            }

            if (var5.id_case.contains(var1.id_byte(var4.id_protected()).id_break())) {
               var8++;
            }

            if (var5.id_case.contains(var1.id_byte(var4.id_break()).id_break())) {
               var8++;
            }

            int var9 = 0;
            if (var1.id_finally(var4.id_byte())) {
               var9++;
            }

            if (var1.id_finally(var4.id_extends())) {
               var9++;
            }

            if (var1.id_finally(var4.id_private())) {
               var9++;
            }

            if (var1.id_finally(var4.id_protected())) {
               var9++;
            }

            if (var1.id_finally(var4.id_break())) {
               var9++;
            }

            if (var8 == var5.id_protected && var9 == var5.id_throws) {
               var1.id_class(var4, var5.id_break.id_catch(), 2);
               var1.id_extends().id_class(var4, var5.id_break.id_class(), 0);
               var7++;
            }

            return var7 > 0;
         }
      }
   }
}

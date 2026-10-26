package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rUB extends rUO<rUP> {
   public rUB(Codec<rUP> var1) {
      super(var1);
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUP var5) {
      for (rfH_2 var7 : rfH_2.id_class(var4.id_break(-1, -2, -1), var4.id_break(1, 2, 1))) {
         boolean var8 = var7.b_() == var4.b_();
         boolean var9 = var7.c_() == var4.c_();
         boolean var10 = var7.d_() == var4.d_();
         boolean var11 = Math.abs(var7.c_() - var4.c_()) == 2;
         if (var8 && var9 && var10) {
            rfH_2 var12 = var7.id_int();
            this.id_class(var1, var12, xu_3.bw.id_continue());
            var5.id_byte().ifPresent(var3x -> {
               ryO_2 var4x = var1.id_class(var12);
               if (var4x instanceof rHy_1 var5x) {
                  var5x.id_class(var3x, var5.id_protected());
                  var4x.id_break();
               }
            });
         } else if (var9) {
            this.id_class(var1, var7, xu_3.id_class.id_continue());
         } else if (var11 && var8 && var10) {
            this.id_class(var1, var7, xu_3.id_while.id_continue());
         } else if ((var8 || var10) && !var11) {
            this.id_class(var1, var7, xu_3.id_while.id_continue());
         } else {
            this.id_class(var1, var7, xu_3.id_class.id_continue());
         }
      }

      return true;
   }
}

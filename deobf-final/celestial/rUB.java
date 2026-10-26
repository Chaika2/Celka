package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rUB extends rUO<rUP> {
   public rUB(Codec<rUP> var1) {
      super(var1);
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUP var5) {
      for (rfH_2 var7 : rfH_2.class_(var4.break_(-1, -2, -1), var4.break_(1, 2, 1))) {
         boolean var8 = var7.b_() == var4.b_();
         boolean var9 = var7.c_() == var4.c_();
         boolean var10 = var7.d_() == var4.d_();
         boolean var11 = Math.abs(var7.c_() - var4.c_()) == 2;
         if (var8 && var9 && var10) {
            rfH_2 var12 = var7.int_();
            this.class_(var1, var12, xu_3.bw.continue_());
            var5.byte_().ifPresent(var3x -> {
               ryO_2 var4x = var1.class_(var12);
               if (var4x instanceof rHy_1 var5x) {
                  var5x.class_(var3x, var5.protected_());
                  var4x.break_();
               }
            });
         } else if (var9) {
            this.class_(var1, var7, xu_3.class_.continue_());
         } else if (var11 && var8 && var10) {
            this.class_(var1, var7, xu_3.while_.continue_());
         } else if ((var8 || var10) && !var11) {
            this.class_(var1, var7, xu_3.while_.continue_());
         } else {
            this.class_(var1, var7, xu_3.class_.continue_());
         }
      }

      return true;
   }
}

package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public abstract class rDo_1 extends rUO<rUt_1> {
   public rDo_1(Codec<rUt_1> var1) {
      super(var1);
   }

   protected abstract boolean class_(rRg_1 var1, Random var2, rfH_2 var3, xc_3 var4);

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUt_1 var5) {
      xc_3 var6 = rls_3.s.class_(var3).continue_();
      return this.class_(var1, var3, var4, var6);
   }

   protected boolean break_(rRg_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      rfH_2 var5 = var3.final_();
      xc_3 var6 = var1.byte_(var3);
      if ((var6.class_(xu_3.try_) || var6.class_(rls_3.b)) && var1.byte_(var5).class_(xu_3.try_)) {
         var1.class_(var3, var4, 3);
         if (var2.nextFloat() < 0.25F) {
            var1.class_(var5, rls_3.b.class_(var2).continue_(), 2);
         } else if (var2.nextFloat() < 0.05F) {
            var1.class_(var5, xu_3.hr.continue_().class_(Wy_1.volatile_, Integer.valueOf(var2.nextInt(4) + 1)), 2);
         }

         for (rpr_3 var8 : rpb_3.HORIZONTAL) {
            if (var2.nextFloat() < 0.2F) {
               rfH_2 var9 = var3.break_(var8);
               if (var1.byte_(var9).class_(xu_3.try_)) {
                  xc_3 var10 = rls_3.E.class_(var2).continue_().class_(dd_3.final_, var8);
                  var1.class_(var9, var10, 2);
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }
}

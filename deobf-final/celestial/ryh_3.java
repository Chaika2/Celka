package celestial;

import java.util.function.BiPredicate;
import java.util.function.Function;

public class ryh_3 {
   public static <S extends ryO_2> ryJ_2<S> class_(
      ryW_2<S> var0, Function<xc_3, ryk_3> var1, Function<xc_3, rpr_3> var2, rCc_1 var3, xc_3 var4, rRg_1 var5, rfH_2 var6, BiPredicate<rRg_1, rfH_2> var7
   ) {
      ryO_2 var8 = var0.class_(var5, var6);
      if (var8 == null) {
         return ryX_2::break_;
      } else if (var7.test(var5, var6)) {
         return ryX_2::break_;
      } else {
         ryk_3 var9 = (ryk_3)var1.apply(var4);
         boolean var10 = var9 == ryk_3.SINGLE;
         boolean var11 = var9 == ryk_3.FIRST;
         if (var10) {
            return new ryd_3<>((S)var8);
         } else {
            rfH_2 var12 = var6.break_((rpr_3)var2.apply(var4));
            xc_3 var13 = var5.byte_(var12);
            if (var13.class_(var4.break_())) {
               ryk_3 var14 = (ryk_3)var1.apply(var13);
               if (var14 != ryk_3.SINGLE && var9 != var14 && var13.byte_(var3) == var4.byte_(var3)) {
                  if (var7.test(var5, var12)) {
                     return ryX_2::break_;
                  }

                  ryO_2 var15 = var0.class_(var5, var12);
                  if (var15 != null) {
                     ryO_2 var16 = var11 ? var8 : var15;
                     ryO_2 var17 = var11 ? var15 : var8;
                     return new ryx_3<>((S)var16, (S)var17);
                  }
               }
            }

            return new ryd_3<>((S)var8);
         }
      }
   }
}

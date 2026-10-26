package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;

public class ia_3 extends rrr_3<iB_2> {
   private static Optional<rfH_2> id_byte(rrEm_1 var0, iB_2 var1) {
      return rfH_2.id_class(var1.Bs(), 8, 4, var1x -> id_class(var0, var1x));
   }

   private static boolean id_class(rrEm_1 var0, rfH_2 var1) {
      xc_3 var2 = var0.id_byte(var1);
      boolean var3 = var2.id_class(rls_3.id_boolean);
      return var3 && var2.id_class(xu_3.XX) ? xn_3.id_private(var2) : var3;
   }

   @Override
   public Set<il_3<?>> id_class() {
      return ImmutableSet.of(il_3.id_private, il_3.id_catch, il_3.id_import, il_3.B, il_3.h, il_3.r, new il_3[]{il_3.P, il_3.s, il_3.S, il_3.M, il_3.O, il_3.J});
   }

   @Override
   protected void id_class(rrEm_1 var1, iB_2 var2) {
      iZ_2 var3 = var2.SF();
      var3.id_class(il_3.J, id_byte(var1, var2));
      Optional var4 = Optional.empty();
      Optional var5 = Optional.empty();
      Optional var6 = Optional.empty();
      Optional var7 = Optional.empty();
      Optional var8 = Optional.empty();
      Optional var9 = Optional.empty();
      Optional var10 = Optional.empty();
      int var11 = 0;
      ArrayList var12 = Lists.newArrayList();
      ArrayList var13 = Lists.newArrayList();

      for (iB_2 var15 : var3.id_byte(il_3.id_private).orElse(ImmutableList.of())) {
         if (var15 instanceof rEg_1) {
            rEg_1 var20 = (rEg_1)var15;
            if (var20.n_() && !var6.isPresent()) {
               var6 = Optional.of(var20);
            } else if (var20.sJ()) {
               var11++;
               if (!var5.isPresent() && var20.sd()) {
                  var5 = Optional.of(var20);
               }
            }
         } else if (var15 instanceof rbd_3) {
            var12.add((rbd_3)var15);
         } else if (var15 instanceof rbk_3) {
            rbk_3 var19 = (rbk_3)var15;
            if (var19.n_() && !var7.isPresent()) {
               var7 = Optional.of(var19);
            } else if (var19.sx()) {
               var12.add(var19);
            }
         } else if (var15 instanceof rhd_3) {
            rhd_3 var16 = (rhd_3)var15;
            if (!var9.isPresent() && rpJ_2.id_case.test(var15) && !rbW_2.id_class(var16)) {
               var9 = Optional.of(var16);
            }

            if (!var10.isPresent() && !var16.id_native() && rbW_2.id_break(var16)) {
               var10 = Optional.of(var16);
            }
         } else if (var4.isPresent() || !(var15 instanceof rbr_3) && !(var15 instanceof rSN)) {
            if (!var8.isPresent() && rbW_2.id_class(var15.BC())) {
               var8 = Optional.of(var15);
            }
         } else {
            var4 = Optional.of((is_3)var15);
         }
      }

      for (iB_2 var18 : var3.id_byte(il_3.id_catch).orElse(ImmutableList.of())) {
         if (var18 instanceof rbM_2 && ((rbM_2)var18).sx()) {
            var13.add((rbM_2)var18);
         }
      }

      var3.id_class(il_3.id_import, var4);
      var3.id_class(il_3.r, var5);
      var3.id_class(il_3.P, var6);
      var3.id_class(il_3.b, var8);
      var3.id_class(il_3.B, var9);
      var3.id_class(il_3.h, var10);
      var3.id_class(il_3.S, var13);
      var3.id_class(il_3.s, var12);
      var3.id_class(il_3.M, var12.size());
      var3.id_class(il_3.O, var11);
   }
}

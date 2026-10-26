package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class rbx_3 {
   protected static void id_byte(rbd_3 var0) {
      if ((double)((rYB)var0.id_throws[7]).id_int.nextFloat() < 0.0125) {
         id_protected(var0);
      }
   }

   private static void id_byte(rbd_3 var0, iZ_2<rbd_3> var1) {
      var1.id_class(iq_3.id_break, 10, ImmutableList.of(new rrp_3<>(rbx_3::id_class), id_class(), id_break(), new rrL_2(aI_2.rM, 4)));
   }

   private static Optional<? extends iB_2> id_class(rbM_2 var0, il_3<? extends iB_2> var1) {
      return var0.SF().id_byte(var1).filter(var1x -> var1x.id_class(var0, 12.0));
   }

   private static boolean id_class(iB_2 var0) {
      return rpJ_2.id_case.test(var0);
   }

   private static boolean id_class(rbM_2 var0, iB_2 var1) {
      return id_class(var0).filter(var1x -> var1x == var1).isPresent();
   }

   private static Optional<? extends iB_2> id_class(rbM_2 var0) {
      Optional var1 = iA_2.id_class(var0, il_3.id_short);
      if (var1.isPresent() && id_class((iB_2)var1.get())) {
         return var1;
      } else {
         Optional var2 = id_class(var0, il_3.id_native);
         return var2.isPresent() ? var2 : var0.SF().id_byte(il_3.id_import);
      }
   }

   protected static void id_class(rbd_3 var0, iB_2 var1) {
      if (!(var1 instanceof rbM_2)) {
         rbW_2.id_class(var0, var1);
      }
   }

   protected static void id_class(rbd_3 var0) {
      rfK_2 var1 = rfK_2.id_class(((rYB)var0.id_throws[7]).E(), var0.Bs());
      var0.SF().id_class(il_3.id_break, var1);
   }

   private static rry_3<rbd_3> id_class() {
      return new rry_3<>(
         ImmutableList.of(
            Pair.of(new rro_3(aI_2.rM, 8.0F), 1),
            Pair.of(new rro_3(aI_2.d, 8.0F), 1),
            Pair.of(new rro_3(aI_2.k, 8.0F), 1),
            Pair.of(new rro_3(8.0F), 1),
            Pair.of(new rrQ_2(30, 60), 1)
         )
      );
   }

   protected static iZ_2<?> id_class(rbd_3 var0, iZ_2<rbd_3> var1) {
      id_break(var0, var1);
      id_byte(var0, var1);
      id_protected(var0, var1);
      var1.id_class(ImmutableSet.of(iq_3.id_class));
      var1.id_break(iq_3.id_break);
      var1.id_byte();
      return var1;
   }

   protected static void id_break(rbd_3 var0) {
      iZ_2 var1 = var0.SF();
      iq_3 var2 = var1.id_protected().orElse((iq_3)null);
      var1.id_class(ImmutableList.of(iq_3.id_extends, iq_3.id_break));
      iq_3 var3 = var1.id_protected().orElse((iq_3)null);
      if (var2 != var3) {
         id_protected(var0);
      }

      var0.id_case(var1.id_class(il_3.id_package));
   }

   private static rry_3<rbd_3> id_break() {
      return new rry_3<>(
         ImmutableList.of(
            Pair.of(new rPC(0.6F), 2),
            Pair.of(rrR_2.id_class(aI_2.d, 8, il_3.id_new, 0.6F, 2), 2),
            Pair.of(rrR_2.id_class(aI_2.k, 8, il_3.id_new, 0.6F, 2), 2),
            Pair.of(new rPT(il_3.id_break, 0.6F, 2, 100), 2),
            Pair.of(new rPw_1(il_3.id_break, 0.6F, 5), 2),
            Pair.of(new rrQ_2(30, 60), 1)
         )
      );
   }

   private static void id_break(rbd_3 var0, iZ_2<rbd_3> var1) {
      var1.id_class(iq_3.id_class, 0, ImmutableList.of(new rrK_2(45, 90), new rPy_1(), new rrg_3(), new rrw_3()));
   }

   private static void id_protected(rbd_3 var0, iZ_2<rbd_3> var1) {
      var1.id_class(iq_3.id_extends, 10, ImmutableList.of(new rrn_3(var1x -> !id_class((rbM_2)var0, var1x)), new rrU_2(1.0F), new rrO_2(20)), il_3.id_package);
   }

   private static void id_protected(rbd_3 var0) {
      var0.SF().id_protected().ifPresent(var1 -> {
         if (var1 == iq_3.id_extends) {
            var0.sQ();
         }
      });
   }
}

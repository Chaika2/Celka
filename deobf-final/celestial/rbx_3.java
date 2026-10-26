package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class rbx_3 {
   protected static void byte_(rbd_3 var0) {
      if ((double)((rYB)var0.throws_[7]).int_.nextFloat() < 0.0125) {
         protected_(var0);
      }
   }

   private static void byte_(rbd_3 var0, iZ_2<rbd_3> var1) {
      var1.class_(iq_3.break_, 10, ImmutableList.of(new rrp_3<>(rbx_3::class_), class_(), break_(), new rrL_2(aI_2.rM, 4)));
   }

   private static Optional<? extends iB_2> class_(rbM_2 var0, il_3<? extends iB_2> var1) {
      return var0.SF().byte_(var1).filter(var1x -> var1x.class_(var0, 12.0));
   }

   private static boolean class_(iB_2 var0) {
      return rpJ_2.case_.test(var0);
   }

   private static boolean class_(rbM_2 var0, iB_2 var1) {
      return class_(var0).filter(var1x -> var1x == var1).isPresent();
   }

   private static Optional<? extends iB_2> class_(rbM_2 var0) {
      Optional var1 = iA_2.class_(var0, il_3.short_);
      if (var1.isPresent() && class_((iB_2)var1.get())) {
         return var1;
      } else {
         Optional var2 = class_(var0, il_3.native_);
         return var2.isPresent() ? var2 : var0.SF().byte_(il_3.import_);
      }
   }

   protected static void class_(rbd_3 var0, iB_2 var1) {
      if (!(var1 instanceof rbM_2)) {
         rbW_2.class_(var0, var1);
      }
   }

   protected static void class_(rbd_3 var0) {
      rfK_2 var1 = rfK_2.class_(((rYB)var0.throws_[7]).E(), var0.Bs());
      var0.SF().class_(il_3.break_, var1);
   }

   private static rry_3<rbd_3> class_() {
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

   protected static iZ_2<?> class_(rbd_3 var0, iZ_2<rbd_3> var1) {
      break_(var0, var1);
      byte_(var0, var1);
      protected_(var0, var1);
      var1.class_(ImmutableSet.of(iq_3.class_));
      var1.break_(iq_3.break_);
      var1.byte_();
      return var1;
   }

   protected static void break_(rbd_3 var0) {
      iZ_2 var1 = var0.SF();
      iq_3 var2 = var1.protected_().orElse((iq_3)null);
      var1.class_(ImmutableList.of(iq_3.extends_, iq_3.break_));
      iq_3 var3 = var1.protected_().orElse((iq_3)null);
      if (var2 != var3) {
         protected_(var0);
      }

      var0.case_(var1.class_(il_3.package_));
   }

   private static rry_3<rbd_3> break_() {
      return new rry_3<>(
         ImmutableList.of(
            Pair.of(new rPC(0.6F), 2),
            Pair.of(rrR_2.class_(aI_2.d, 8, il_3.new_, 0.6F, 2), 2),
            Pair.of(rrR_2.class_(aI_2.k, 8, il_3.new_, 0.6F, 2), 2),
            Pair.of(new rPT(il_3.break_, 0.6F, 2, 100), 2),
            Pair.of(new rPw_1(il_3.break_, 0.6F, 5), 2),
            Pair.of(new rrQ_2(30, 60), 1)
         )
      );
   }

   private static void break_(rbd_3 var0, iZ_2<rbd_3> var1) {
      var1.class_(iq_3.class_, 0, ImmutableList.of(new rrK_2(45, 90), new rPy_1(), new rrg_3(), new rrw_3()));
   }

   private static void protected_(rbd_3 var0, iZ_2<rbd_3> var1) {
      var1.class_(iq_3.extends_, 10, ImmutableList.of(new rrn_3(var1x -> !class_((rbM_2)var0, var1x)), new rrU_2(1.0F), new rrO_2(20)), il_3.package_);
   }

   private static void protected_(rbd_3 var0) {
      var0.SF().protected_().ifPresent(var1 -> {
         if (var1 == iq_3.extends_) {
            var0.sQ();
         }
      });
   }
}

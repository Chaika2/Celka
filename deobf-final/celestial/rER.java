package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class rER {
   private static final rqb_3 class_ = rqt_3.class_(5, 20);
   private static final rqb_3 break_ = rqb_3.class_(5, 16);

   private static void byte_(rEg_1 var0, iB_2 var1) {
      catch_(var0).forEach(var1x -> protected_(var1x, var1));
   }

   protected static boolean byte_(rEg_1 var0) {
      return var0.SF().class_(il_3.x);
   }

   private static void byte_(iZ_2<rEg_1> var0) {
      var0.class_(
         iq_3.break_,
         10,
         ImmutableList.of(
            new rPG(il_3.J, 200),
            new rrG_2(aI_2.long_, 0.6F),
            rPO.class_(il_3.J, 1.0F, 8, true),
            new rrp_3<>(rER::protected_),
            new rPN<>(rEg_1::sJ, (rPm_1<? super aA_2>)rPO.break_(il_3.G, 0.4F, 8, false)),
            new rPh_1<>(new rro_3(8.0F), rqb_3.class_(30, 60)),
            new rrd_3(break_, 0.6F),
            class_()
         )
      );
   }

   protected static void class_(rEg_1 var0, iB_2 var1) {
      if (!var0.n_()) {
         if (var1.BC() == aI_2.d && case_(var0)) {
            throws_(var0, var1);
            byte_(var0, var1);
         } else {
            private_(var0, var1);
         }
      }
   }

   private static rqA_2 class_(rEg_1 var0, iq_3 var1) {
      if (var1 == iq_3.final_ || var0.sx()) {
         return rqn_3.sf;
      } else if (var1 == iq_3.extends_) {
         return rqn_3.sq;
      } else {
         return private_(var0) ? rqn_3.sf : rqn_3.sp;
      }
   }

   protected static iZ_2<?> class_(iZ_2<rEg_1> var0) {
      break_(var0);
      byte_(var0);
      protected_(var0);
      throws_(var0);
      var0.class_(ImmutableSet.of(iq_3.class_));
      var0.break_(iq_3.break_);
      var0.byte_();
      return var0;
   }

   static boolean class_(rEg_1 var0, rfH_2 var1) {
      Optional var2 = var0.SF().byte_(il_3.J);
      return var2.isPresent() && ((rfH_2)var2.get()).class_(var1, 8.0);
   }

   private static rry_3<rEg_1> class_() {
      return new rry_3<>(ImmutableList.of(Pair.of(new rPC(0.4F), 2), Pair.of(new rPq_1(0.4F, 3), 2), Pair.of(new rrQ_2(30, 60), 1)));
   }

   protected static void class_(rEg_1 var0) {
      iZ_2 var1 = var0.SF();
      iq_3 var2 = var1.protected_().orElse((iq_3)null);
      var1.class_(ImmutableList.of(iq_3.extends_, iq_3.final_, iq_3.break_));
      iq_3 var3 = var1.protected_().orElse((iq_3)null);
      if (var2 != var3) {
         break_(var0).ifPresent(var0::class_);
      }

      var0.case_(var1.class_(il_3.package_));
   }

   protected static void break_(rEg_1 var0, iB_2 var1) {
      iZ_2 var2 = var0.SF();
      var2.break_(il_3.x);
      var2.break_(il_3.continue_);
      if (var0.n_()) {
         protected_(var0, var1);
      } else {
         case_(var0, var1);
      }
   }

   private static void break_(iZ_2<rEg_1> var0) {
      var0.class_(iq_3.class_, 0, ImmutableList.of(new rrK_2(45, 90), new rPy_1()));
   }

   public static Optional<rqA_2> break_(rEg_1 var0) {
      return var0.SF().protected_().map(var1 -> class_(var0, var1));
   }

   private static void throws_(iZ_2<rEg_1> var0) {
      var0.class_(
         iq_3.final_,
         10,
         ImmutableList.of(
            rPO.break_(il_3.while_, 1.3F, 15, false), class_(), new rPh_1<>(new rro_3(8.0F), rqb_3.class_(30, 60)), new rPE<>(rER::throws_, il_3.while_)
         ),
         il_3.while_
      );
   }

   private static void throws_(rEg_1 var0, iB_2 var1) {
      var0.SF().break_(il_3.package_);
      var0.SF().break_(il_3.volatile_);
      var0.SF().class_(il_3.while_, var1, (long)class_.class_(((rYB)var0.throws_[7]).int_));
   }

   private static boolean throws_(rEg_1 var0) {
      return var0.sJ() && !case_(var0);
   }

   private static List<rEg_1> catch_(rEg_1 var0) {
      return var0.SF().byte_(il_3.E).orElse(ImmutableList.of());
   }

   private static void catch_(rEg_1 var0, iB_2 var1) {
      iZ_2 var2 = var0.SF();
      var2.break_(il_3.interface_);
      var2.break_(il_3.continue_);
      var2.class_(il_3.package_, var1, 200L);
   }

   private static boolean case_(rEg_1 var0) {
      if (var0.n_()) {
         return false;
      } else {
         int var1 = var0.SF().byte_(il_3.M).orElse(0);
         int var2 = var0.SF().byte_(il_3.O).orElse(0) + 1;
         return var1 > var2;
      }
   }

   private static void case_(rEg_1 var0, iB_2 var1) {
      if ((!var0.SF().byte_(iq_3.final_) || var1.BC() != aI_2.d) && rpJ_2.case_.test(var1) && var1.BC() != aI_2.long_ && !iA_2.class_(var0, var1, 4.0)) {
         catch_(var0, var1);
         private_(var0, var1);
      }
   }

   private static boolean implements_(rEg_1 var0) {
      return var0.SF().class_(il_3.continue_);
   }

   private static void implements_(rEg_1 var0, iB_2 var1) {
      if (!byte_(var0)) {
         Optional var2 = var0.SF().byte_(il_3.package_);
         iB_2 var3 = iA_2.class_(var0, var2, var1);
         catch_(var0, var3);
      }
   }

   private static void protected_(iZ_2<rEg_1> var0) {
      var0.class_(
         iq_3.extends_,
         10,
         ImmutableList.of(
            new rPG(il_3.J, 200),
            new rrG_2(aI_2.long_, 0.6F),
            new rrU_2(1.0F),
            new rPN<>(rEg_1::sJ, new rrO_2(40)),
            new rPN<>(au_3::n_, new rrO_2(15)),
            new rrn_3(),
            new rPE<>(rER::implements_, il_3.package_)
         ),
         il_3.package_
      );
   }

   private static void protected_(rEg_1 var0, iB_2 var1) {
      iZ_2 var2 = var0.SF();
      iB_2 var3 = iA_2.class_(var0, var2.byte_(il_3.while_), var1);
      var3 = iA_2.class_(var0, var2.byte_(il_3.package_), var3);
      throws_(var0, var3);
   }

   private static Optional<? extends iB_2> protected_(rEg_1 var0) {
      return !byte_(var0) && !implements_(var0) ? var0.SF().byte_(il_3.native_) : Optional.empty();
   }

   private static boolean private_(rEg_1 var0) {
      return var0.SF().class_(il_3.J);
   }

   private static void private_(rEg_1 var0, iB_2 var1) {
      catch_(var0).forEach(var1x -> implements_(var1x, var1));
   }
}

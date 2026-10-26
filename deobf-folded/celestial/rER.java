package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class rER {
   private static final rqb_3 id_class = rqt_3.id_class(5, 20);
   private static final rqb_3 id_break = rqb_3.id_class(5, 16);

   private static void id_byte(rEg_1 var0, iB_2 var1) {
      id_catch(var0).forEach(var1x -> id_protected(var1x, var1));
   }

   protected static boolean id_byte(rEg_1 var0) {
      return var0.SF().id_class(il_3.x);
   }

   private static void id_byte(iZ_2<rEg_1> var0) {
      var0.id_class(
         iq_3.id_break,
         10,
         ImmutableList.of(
            new rPG(il_3.J, 200),
            new rrG_2(aI_2.id_long, 0.6F),
            rPO.id_class(il_3.J, 1.0F, 8, true),
            new rrp_3<>(rER::id_protected),
            new rPN<>(rEg_1::sJ, (rPm_1<? super aA_2>)rPO.id_break(il_3.G, 0.4F, 8, false)),
            new rPh_1<>(new rro_3(8.0F), rqb_3.id_class(30, 60)),
            new rrd_3(id_break, 0.6F),
            id_class()
         )
      );
   }

   protected static void id_class(rEg_1 var0, iB_2 var1) {
      if (!var0.n_()) {
         if (var1.BC() == aI_2.d && id_case(var0)) {
            id_throws(var0, var1);
            id_byte(var0, var1);
         } else {
            id_private(var0, var1);
         }
      }
   }

   private static rqA_2 id_class(rEg_1 var0, iq_3 var1) {
      if (var1 == iq_3.id_final || var0.sx()) {
         return rqn_3.sf;
      } else if (var1 == iq_3.id_extends) {
         return rqn_3.sq;
      } else {
         return id_private(var0) ? rqn_3.sf : rqn_3.sp;
      }
   }

   protected static iZ_2<?> id_class(iZ_2<rEg_1> var0) {
      id_break(var0);
      id_byte(var0);
      id_protected(var0);
      id_throws(var0);
      var0.id_class(ImmutableSet.of(iq_3.id_class));
      var0.id_break(iq_3.id_break);
      var0.id_byte();
      return var0;
   }

   static boolean id_class(rEg_1 var0, rfH_2 var1) {
      Optional var2 = var0.SF().id_byte(il_3.J);
      return var2.isPresent() && ((rfH_2)var2.get()).id_class(var1, 8.0);
   }

   private static rry_3<rEg_1> id_class() {
      return new rry_3<>(ImmutableList.of(Pair.of(new rPC(0.4F), 2), Pair.of(new rPq_1(0.4F, 3), 2), Pair.of(new rrQ_2(30, 60), 1)));
   }

   protected static void id_class(rEg_1 var0) {
      iZ_2 var1 = var0.SF();
      iq_3 var2 = var1.id_protected().orElse((iq_3)null);
      var1.id_class(ImmutableList.of(iq_3.id_extends, iq_3.id_final, iq_3.id_break));
      iq_3 var3 = var1.id_protected().orElse((iq_3)null);
      if (var2 != var3) {
         id_break(var0).ifPresent(var0::id_class);
      }

      var0.id_case(var1.id_class(il_3.id_package));
   }

   protected static void id_break(rEg_1 var0, iB_2 var1) {
      iZ_2 var2 = var0.SF();
      var2.id_break(il_3.x);
      var2.id_break(il_3.id_continue);
      if (var0.n_()) {
         id_protected(var0, var1);
      } else {
         id_case(var0, var1);
      }
   }

   private static void id_break(iZ_2<rEg_1> var0) {
      var0.id_class(iq_3.id_class, 0, ImmutableList.of(new rrK_2(45, 90), new rPy_1()));
   }

   public static Optional<rqA_2> id_break(rEg_1 var0) {
      return var0.SF().id_protected().map(var1 -> id_class(var0, var1));
   }

   private static void id_throws(iZ_2<rEg_1> var0) {
      var0.id_class(
         iq_3.id_final,
         10,
         ImmutableList.of(
            rPO.id_break(il_3.id_while, 1.3F, 15, false),
            id_class(),
            new rPh_1<>(new rro_3(8.0F), rqb_3.id_class(30, 60)),
            new rPE<>(rER::id_throws, il_3.id_while)
         ),
         il_3.id_while
      );
   }

   private static void id_throws(rEg_1 var0, iB_2 var1) {
      var0.SF().id_break(il_3.id_package);
      var0.SF().id_break(il_3.id_volatile);
      var0.SF().id_class(il_3.id_while, var1, (long)id_class.id_class(((rYB)var0.id_throws[7]).id_int));
   }

   private static boolean id_throws(rEg_1 var0) {
      return var0.sJ() && !id_case(var0);
   }

   private static List<rEg_1> id_catch(rEg_1 var0) {
      return var0.SF().id_byte(il_3.E).orElse(ImmutableList.of());
   }

   private static void id_catch(rEg_1 var0, iB_2 var1) {
      iZ_2 var2 = var0.SF();
      var2.id_break(il_3.id_interface);
      var2.id_break(il_3.id_continue);
      var2.id_class(il_3.id_package, var1, 200L);
   }

   private static boolean id_case(rEg_1 var0) {
      if (var0.n_()) {
         return false;
      } else {
         int var1 = var0.SF().id_byte(il_3.M).orElse(0);
         int var2 = var0.SF().id_byte(il_3.O).orElse(0) + 1;
         return var1 > var2;
      }
   }

   private static void id_case(rEg_1 var0, iB_2 var1) {
      if ((!var0.SF().id_byte(iq_3.id_final) || var1.BC() != aI_2.d)
         && rpJ_2.id_case.test(var1)
         && var1.BC() != aI_2.id_long
         && !iA_2.id_class(var0, var1, 4.0)) {
         id_catch(var0, var1);
         id_private(var0, var1);
      }
   }

   private static boolean id_implements(rEg_1 var0) {
      return var0.SF().id_class(il_3.id_continue);
   }

   private static void id_implements(rEg_1 var0, iB_2 var1) {
      if (!id_byte(var0)) {
         Optional var2 = var0.SF().id_byte(il_3.id_package);
         iB_2 var3 = iA_2.id_class(var0, var2, var1);
         id_catch(var0, var3);
      }
   }

   private static void id_protected(iZ_2<rEg_1> var0) {
      var0.id_class(
         iq_3.id_extends,
         10,
         ImmutableList.of(
            new rPG(il_3.J, 200),
            new rrG_2(aI_2.id_long, 0.6F),
            new rrU_2(1.0F),
            new rPN<>(rEg_1::sJ, new rrO_2(40)),
            new rPN<>(au_3::n_, new rrO_2(15)),
            new rrn_3(),
            new rPE<>(rER::id_implements, il_3.id_package)
         ),
         il_3.id_package
      );
   }

   private static void id_protected(rEg_1 var0, iB_2 var1) {
      iZ_2 var2 = var0.SF();
      iB_2 var3 = iA_2.id_class(var0, var2.id_byte(il_3.id_while), var1);
      var3 = iA_2.id_class(var0, var2.id_byte(il_3.id_package), var3);
      id_throws(var0, var3);
   }

   private static Optional<? extends iB_2> id_protected(rEg_1 var0) {
      return !id_byte(var0) && !id_implements(var0) ? var0.SF().id_byte(il_3.id_native) : Optional.empty();
   }

   private static boolean id_private(rEg_1 var0) {
      return var0.SF().id_class(il_3.J);
   }

   private static void id_private(rEg_1 var0, iB_2 var1) {
      id_catch(var0).forEach(var1x -> id_implements(var1x, var1));
   }
}

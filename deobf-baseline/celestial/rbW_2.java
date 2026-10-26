package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;

public class rbW_2 {
   public static final rdb_3 id_class = rdy_3.Od;
   private static final rqb_3 id_break = rqt_3.id_class(30, 120);
   private static final rqb_3 id_byte = rqt_3.id_class(10, 40);
   private static final rqb_3 id_protected = rqt_3.id_class(10, 30);
   private static final rqb_3 id_throws = rqt_3.id_class(5, 20);
   private static final rqb_3 id_case = rqt_3.id_class(5, 7);
   private static final rqb_3 id_catch = rqt_3.id_class(5, 7);
   private static final Set<rdb_3> id_private = ImmutableSet.of(rdy_3.hC, rdy_3.hl);

   private static void id_byte(rbk_3 var0, iB_2 var1) {
      id_volatile(var0).stream().filter(var0x -> var0x instanceof rbk_3).forEach(var1x -> id_protected((rbk_3)var1x, var1));
   }

   private static rPO<rfH_2> id_byte() {
      return rPO.id_class(il_3.J, 1.0F, 8, false);
   }

   protected static void id_byte(rbM_2 var0, iB_2 var1) {
      if (id_throws(var1)) {
         var0.SF().id_break(il_3.id_interface);
         var0.SF().id_class(il_3.id_short, var1.ro(), 600L);
         if (var1.BC() == aI_2.id_long && var0.id_throws()) {
            id_byte(var0);
         }

         if (var1.BC() == aI_2.rM && ((rYB)var0.id_throws[7]).B().id_break(rRu_1.id_long)) {
            var0.SF().id_class(il_3.id_default, true, 600L);
         }
      }
   }

   protected static void id_byte(rbk_3 var0) {
      if (id_else(var0) && !var0.Sn().id_class()) {
         var0.a_(var0.Sn());
         var0.id_class(rpm_3.OFF_HAND, rdn_3.id_break);
      }
   }

   private static void id_byte(rbk_3 var0, rdn_3 var1) {
      if (id_public(var0)) {
         var0.a_(var0.id_protected(rpm_3.OFF_HAND));
      }

      var0.id_final(var1);
   }

   private static void id_byte(iZ_2<rbk_3> var0) {
      var0.id_class(
         iq_3.id_native,
         10,
         ImmutableList.of(
            id_byte(),
            new rro_3(rbW_2::id_break, 14.0F),
            new rrp_3<>(rbM_2::sx, rbW_2::id_extends),
            new rPN<>(var0x -> !var0x.sQ(), new rrV_2<>(2, 1.0F)),
            new rPN<>(rbk_3::sQ, new rrV_2<>(4, 0.6F)),
            new rry_3(ImmutableList.of(Pair.of(new rro_3(aI_2.d, 8.0F), 1), Pair.of(new rPC(0.6F, 2, 1), 1), Pair.of(new rrQ_2(10, 20), 1)))
         ),
         il_3.id_double
      );
   }

   private static boolean id_byte(rdb_3 var0) {
      return id_private.contains(var0);
   }

   protected static void id_byte(rbM_2 var0) {
      var0.SF().id_class(il_3.id_for, true, (long)id_break.id_class(((rYB)var0.id_throws[7]).id_int));
   }

   private static boolean id_byte(iB_2 var0) {
      return var0.id_class(rdy_3.kU);
   }

   private static boolean id_int(rbk_3 var0) {
      return !id_new(var0);
   }

   private static boolean id_this(rbk_3 var0) {
      return var0.SF().id_class(il_3.X);
   }

   protected static void id_class(rbM_2 var0) {
      id_throws(var0).forEach(var0x -> id_break(var0x).ifPresent(var1 -> id_byte(var0x, var1)));
   }

   private static boolean id_class(rbk_3 var0, an_3 var1) {
      return !(var1 instanceof is_3 var2)
         ? false
         : !var2.n_() || !var2.BM() || id_private((iB_2)var0) || id_private(var2) || var2 instanceof rbk_3 && var2.ra() == null;
   }

   protected static iZ_2<?> id_class(rbk_3 var0, iZ_2<rbk_3> var1) {
      id_class(var1);
      id_break(var1);
      id_protected(var1);
      id_break(var0, var1);
      id_byte(var1);
      id_throws(var1);
      id_case(var1);
      var1.id_class(ImmutableSet.of(iq_3.id_class));
      var1.id_break(iq_3.id_break);
      var1.id_byte();
      return var1;
   }

   public static void id_class(rhd_3 var0, boolean var1) {
      List var2 = ((rYB)var0.id_throws[7]).id_class(rbk_3.class, var0.rN().id_class(16.0));
      var2.stream().filter(rbW_2::id_protected).filter(var2x -> !var1 || iA_2.id_byte(var2x, var0)).forEach(var1x -> {
         if (((rYB)var1x.id_throws[7]).B().id_break(rRu_1.id_long)) {
            id_protected((rbM_2)var1x, var0);
         } else {
            id_byte((rbM_2)var1x, var0);
         }
      });
   }

   protected static boolean id_class(rbk_3 var0, rdn_3 var1) {
      rdb_3 var2 = var1.id_break();
      if (var2.id_class(rlc_3.id_const)) {
         return false;
      } else if (id_return(var0) && var0.SF().id_class(il_3.id_package)) {
         return false;
      } else if (id_break(var2)) {
         return id_goto(var0);
      } else {
         boolean var3 = var0.id_native(var1);
         if (var2 == rdy_3.JF) {
            return var3;
         } else if (id_byte(var2)) {
            return !id_this(var0) && var3;
         } else {
            return !id_class(var2) ? var0.id_package(var1) : id_goto(var0) && var3;
         }
      }
   }

   private static boolean id_class(iB_2 var0, iB_2 var1) {
      return var1.BC() != aI_2.id_long ? false : new Random(((rYB)var0.id_throws[7]).r()).nextFloat() < 0.1F;
   }

   public static boolean id_class(aI_2 var0) {
      return var0 == aI_2.rb || var0 == aI_2.rS;
   }

   protected static void id_class(rbM_2 var0, iB_2 var1) {
      if (!var0.SF().id_byte(iq_3.id_final) && id_throws(var1) && !iA_2.id_class(var0, var1, 4.0)) {
         if (var1.BC() == aI_2.rM && ((rYB)var0.id_throws[7]).B().id_break(rRu_1.id_long)) {
            id_protected(var0, var1);
            id_class(var0);
         } else {
            id_byte(var0, var1);
            id_break(var0, var1);
         }
      }
   }

   private static rqA_2 id_class(rbk_3 var0, iq_3 var1) {
      if (var1 == iq_3.id_extends) {
         return rqn_3.hr;
      } else if (var0.sJ()) {
         return rqn_3.hE;
      } else if (var1 == iq_3.id_final && id_native(var0)) {
         return rqn_3.hE;
      } else if (var1 == iq_3.id_volatile) {
         return rqn_3.Oa;
      } else if (var1 == iq_3.id_native) {
         return rqn_3.hP;
      } else if (id_case((iB_2)var0)) {
         return rqn_3.hS;
      } else {
         return id_synchronized(var0) ? rqn_3.hE : rqn_3.Oi;
      }
   }

   private static void id_class(iZ_2<rbk_3> var0) {
      var0.id_class(
         iq_3.id_class,
         0,
         ImmutableList.of(
            new rrK_2(45, 90), new rPy_1(), new rrg_3(), id_protected(), id_throws(), new rbz_3(), new rbO_2(120), new rrN_2(300, rbW_2::id_class), new rrw_3()
         )
      );
   }

   public static boolean id_class(iB_2 var0) {
      for (rdn_3 var2 : var0.PV()) {
         rdb_3 var3 = var2.id_break();
         if (var3 instanceof rxS_2 && ((rxS_2)var3).id_throws() == rxE_2.GOLD) {
            return true;
         }
      }

      return false;
   }

   protected static void id_class(rbk_3 var0, iB_2 var1) {
      if (!(var1 instanceof rbk_3)) {
         if (id_public(var0)) {
            id_class(var0, false);
         }

         iZ_2 var2 = var0.SF();
         var2.id_break(il_3.id_double);
         var2.id_break(il_3.id_switch);
         var2.id_break(il_3.id_const);
         if (var1 instanceof rhd_3) {
            var2.id_class(il_3.id_transient, true, 400L);
         }

         id_catch(var0).ifPresent(var2x -> {
            if (var2x.BC() != var1.BC()) {
               var2.id_break(il_3.id_while);
            }
         });
         if (var0.n_()) {
            var2.id_class(il_3.id_while, var1, 100L);
            if (id_throws(var1)) {
               id_break((rbM_2)var0, var1);
            }
         } else if (var1.BC() == aI_2.id_long && id_new(var0)) {
            id_throws(var0, var1);
            id_byte(var0, var1);
         } else {
            id_class((rbM_2)var0, var1);
         }
      }
   }

   protected static void id_class(rbk_3 var0) {
      int var1 = id_break.id_class(((rYB)var0.id_throws[7]).id_int);
      var0.SF().id_class(il_3.id_for, true, (long)var1);
   }

   public static ryZ_2 id_class(rbk_3 var0, rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.id_protected(var2);
      if (id_break(var0, var3)) {
         rdn_3 var4 = var3.id_class(1);
         id_byte(var0, var4);
         id_protected((iB_2)var0);
         id_final(var0);
         return ryZ_2.CONSUME;
      } else {
         return ryZ_2.PASS;
      }
   }

   protected static void id_class(rbk_3 var0, rsE_2 var1) {
      id_final(var0);
      rdn_3 var2;
      if (var1.id_protected().id_break() == rdy_3.JF) {
         var0.id_class(var1, var1.id_protected().id_char());
         var2 = var1.id_protected();
         var1.PD();
      } else {
         var0.id_class(var1, 1);
         var2 = id_class(var1);
      }

      rdb_3 var3 = var2.id_break();
      if (id_class(var3)) {
         var0.SF().id_break(il_3.id_strictfp);
         id_byte(var0, var2);
         id_protected((iB_2)var0);
      } else if (id_byte(var3) && !id_this(var0)) {
         id_continue(var0);
      } else {
         boolean var4 = var0.id_catch(var2);
         if (!var4) {
            id_protected(var0, var2);
         }
      }
   }

   private static rry_3<rbk_3> id_class() {
      return new rry_3<>(
         ImmutableList.of(Pair.of(new rro_3(aI_2.rM, 8.0F), 1), Pair.of(new rro_3(aI_2.d, 8.0F), 1), Pair.of(new rro_3(8.0F), 1), Pair.of(new rrQ_2(30, 60), 1))
      );
   }

   private static rdn_3 id_class(rsE_2 var0) {
      rdn_3 var1 = var0.id_protected();
      rdn_3 var2 = var1.id_class(1);
      if (var1.id_class()) {
         var0.PD();
      } else {
         var0.id_break(var1);
      }

      return var2;
   }

   protected static void id_class(rbk_3 var0, boolean var1) {
      rdn_3 var2 = var0.id_protected(rpm_3.OFF_HAND);
      var0.id_class(rpm_3.OFF_HAND, rdn_3.id_break);
      if (var0.sx()) {
         boolean var3 = id_break(var2.id_break());
         if (var1 && var3) {
            id_class(var0, id_implements(var0));
         } else if (!var3) {
            boolean var4 = var0.id_catch(var2);
            if (!var4) {
               id_protected(var0, var2);
            }
         }
      } else {
         boolean var5 = var0.id_catch(var2);
         if (!var5) {
            rdn_3 var6 = var0.ss();
            if (id_class(var6.id_break())) {
               id_protected(var0, var6);
            } else {
               id_class(var0, Collections.singletonList(var6));
            }

            var0.id_volatile(var2);
         }
      }
   }

   protected static boolean id_class(rdb_3 var0) {
      return var0.id_class(rlc_3.id_strictfp);
   }

   private static void id_class(rbk_3 var0, List<rdn_3> var1, rjU_2 var2) {
      if (!var1.isEmpty()) {
         var0.id_class(rpm_3.OFF_HAND);

         for (rdn_3 var4 : var1) {
            iA_2.id_class(var0, var4, var2.id_break(0.0, 1.0, 0.0));
         }
      }
   }

   private static void id_class(rbk_3 var0, List<rdn_3> var1) {
      Optional var2 = var0.SF().id_byte(il_3.id_extends);
      if (var2.isPresent()) {
         id_class(var0, (rhd_3)var2.get(), var1);
      } else {
         id_break(var0, var1);
      }
   }

   private static void id_class(rbk_3 var0, rhd_3 var1, List<rdn_3> var2) {
      id_class(var0, var2, var1.Ps());
   }

   private static void id_break(rbk_3 var0, iZ_2<rbk_3> var1) {
      var1.id_class(
         iq_3.id_extends,
         10,
         ImmutableList.of(
            new rrn_3(var1x -> !id_break(var0, var1x)),
            new rPN<>(rbW_2::id_byte, new rrM_2<>(5, 0.75F)),
            new rrU_2(1.0F),
            new rrO_2(20),
            new rPJ(),
            new rbh_3(),
            new rPE<>(rbW_2::id_finally, il_3.id_package)
         ),
         il_3.id_package
      );
   }

   public static Optional<rhd_3> id_break(rbM_2 var0) {
      return var0.SF().id_class(il_3.id_native) ? var0.SF().id_byte(il_3.id_native) : Optional.empty();
   }

   protected static void id_break(rbM_2 var0, iB_2 var1) {
      id_throws(var0).forEach(var1x -> {
         if (var1.BC() != aI_2.id_long || var1x.id_throws() && ((rEg_1)var1).sd()) {
            id_throws(var1x, var1);
         }
      });
   }

   public static boolean id_break(iB_2 var0) {
      return var0.BC() == aI_2.rM && var0.id_class(rbW_2::id_class);
   }

   private static boolean id_break(rdb_3 var0) {
      return var0 == id_class;
   }

   private static void id_break(iZ_2<rbk_3> var0) {
      var0.id_class(
         iq_3.id_break,
         10,
         ImmutableList.of(
            new rro_3(rbW_2::id_break, 14.0F),
            new rrp_3<>(rbM_2::sx, rbW_2::id_extends),
            new rPN<>(rbk_3::id_throws, new rbQ_2<>()),
            id_byte(),
            id_case(),
            id_class(),
            id_break(),
            new rrL_2(aI_2.rM, 4)
         )
      );
   }

   protected static boolean id_break(rbk_3 var0, rdn_3 var1) {
      return !id_return(var0) && !id_else(var0) && var0.sx() && id_break(var1.id_break());
   }

   private static void id_break(rbk_3 var0, List<rdn_3> var1) {
      id_class(var0, var1, id_super(var0));
   }

   protected static void id_break(rbk_3 var0) {
      iZ_2 var1 = var0.SF();
      iq_3 var2 = var1.id_protected().orElse((iq_3)null);
      var1.id_class(ImmutableList.of(iq_3.id_volatile, iq_3.id_extends, iq_3.id_final, iq_3.id_native, iq_3.id_package, iq_3.id_break));
      iq_3 var3 = var1.id_protected().orElse((iq_3)null);
      if (var2 != var3) {
         id_protected(var0).ifPresent(var0::id_class);
      }

      var0.id_case(var1.id_class(il_3.id_package));
      if (!var1.id_class(il_3.id_super) && id_private(var0)) {
         var0.BH();
      }

      if (!var1.id_class(il_3.id_double)) {
         var1.id_break(il_3.id_switch);
      }

      var0.id_else(var1.id_class(il_3.id_switch));
   }

   private static rry_3<rbk_3> id_break() {
      return new rry_3<>(
         ImmutableList.of(
            Pair.of(new rPC(0.6F), 2),
            Pair.of(rrR_2.id_class(aI_2.d, 8, il_3.id_new, 0.6F, 2), 2),
            Pair.of(new rPN<>(rbW_2::id_catch, new rPq_1(0.6F, 3)), 2),
            Pair.of(new rrQ_2(30, 60), 1)
         )
      );
   }

   private static boolean id_break(rbk_3 var0, iB_2 var1) {
      return id_extends(var0).filter(var1x -> var1x == var1).isPresent();
   }

   private static List<rbM_2> id_throws(rbM_2 var0) {
      return var0.SF().id_byte(il_3.S).orElse(ImmutableList.of());
   }

   private static void id_throws(rbk_3 var0, iB_2 var1) {
      var0.SF().id_break(il_3.id_short);
      var0.SF().id_break(il_3.id_package);
      var0.SF().id_break(il_3.id_volatile);
      var0.SF().id_class(il_3.id_while, var1, (long)id_throws.id_class(((rYB)var0.id_throws[7]).id_int));
      id_byte((rbM_2)var0);
   }

   protected static boolean id_throws(rbk_3 var0) {
      return var0.SF().id_class(il_3.id_for) || id_volatile(var0).stream().anyMatch(var0x -> var0x.SF().id_class(il_3.id_for));
   }

   private static rPs_1<rbk_3, iB_2> id_throws() {
      return new rPs_1<>(rbW_2::id_finally, il_3.b, il_3.id_while, id_case);
   }

   private static void id_throws(rbM_2 var0, iB_2 var1) {
      Optional var2 = id_case(var0);
      iB_2 var3 = iA_2.id_class(var0, var2, var1);
      if (!var2.isPresent() || var2.get() != var3) {
         id_byte(var0, var3);
      }
   }

   private static void id_throws(iZ_2<rbk_3> var0) {
      var0.id_class(
         iq_3.id_final,
         10,
         ImmutableList.of(rPO.id_break(il_3.id_while, 1.0F, 12, true), id_class(), id_break(), new rPE<>(rbW_2::id_package, il_3.id_while)),
         il_3.id_while
      );
   }

   private static boolean id_throws(iB_2 var0) {
      return rpJ_2.id_case.test(var0);
   }

   private static boolean id_finally(rbk_3 var0) {
      iZ_2 var1 = var0.SF();
      if (var1.id_class(il_3.b)) {
         iB_2 var2 = var1.id_byte(il_3.b).get();
         return var0.id_class(var2, 6.0);
      } else {
         return false;
      }
   }

   public static Optional<iB_2> id_catch(rbk_3 var0) {
      return var0.SF().id_class(il_3.id_while) ? var0.SF().id_byte(il_3.id_while) : Optional.empty();
   }

   private static boolean id_catch(iB_2 var0) {
      return !id_case(var0);
   }

   private static Optional<? extends iB_2> id_extends(rbk_3 var0) {
      iZ_2 var1 = var0.SF();
      if (id_finally(var0)) {
         return Optional.empty();
      } else {
         Optional var2 = iA_2.id_class(var0, il_3.id_short);
         if (var2.isPresent() && id_throws((iB_2)var2.get())) {
            return var2;
         } else {
            if (var1.id_class(il_3.id_default)) {
               Optional var3 = var1.id_byte(il_3.id_native);
               if (var3.isPresent()) {
                  return var3;
               }
            }

            Optional var5 = var1.id_byte(il_3.id_import);
            if (var5.isPresent()) {
               return var5;
            } else {
               Optional var4 = var1.id_byte(il_3.B);
               return var4.isPresent() && id_throws((iB_2)var4.get()) ? var4 : Optional.empty();
            }
         }
      }
   }

   private static boolean id_goto(rbk_3 var0) {
      return var0.Sn().id_class() || !id_class(var0.Sn().id_break());
   }

   private static Optional<iB_2> id_case(rbM_2 var0) {
      return iA_2.id_class(var0, il_3.id_short);
   }

   private static boolean id_case(iB_2 var0) {
      return var0.SF().id_class(il_3.h);
   }

   protected static void id_case(rbk_3 var0) {
      id_volatile(var0).forEach(rbW_2::id_byte);
   }

   private static rPh_1<rbk_3> id_case() {
      return new rPh_1<>(new rPs_1<>(rbk_3::n_, il_3.P, il_3.id_super, id_protected), id_byte);
   }

   private static void id_case(iZ_2<rbk_3> var0) {
      var0.id_class(
         iq_3.id_package,
         10,
         ImmutableList.of(new rPb_1(0.8F), new rro_3(rbW_2::id_break, 8.0F), new rPN<>(an_3::Pm, id_class()), new rPQ<>(8, rbW_2::id_class)),
         il_3.id_super
      );
   }

   private static void id_continue(rbk_3 var0) {
      var0.SF().id_class(il_3.X, true, 200L);
   }

   private static boolean id_else(rbk_3 var0) {
      return var0.SF().id_class(il_3.id_const);
   }

   private static List<rdn_3> id_implements(rbk_3 var0) {
      rzL_2 var1 = ((rYB)var0.id_throws[7]).id_const().o().id_class(rzl_3.l);
      return var1.id_class(
         new rzP_2((rrEm_1)((rYB)var0.id_throws[7])).id_class(rzQ_2.id_class, var0).id_class(((rYB)var0.id_throws[7]).id_int).id_class(rzz_3.id_private)
      );
   }

   private static boolean id_new(rbk_3 var0) {
      int var1 = var0.SF().id_byte(il_3.M).orElse(0) + 1;
      int var2 = var0.SF().id_byte(il_3.O).orElse(0);
      return var2 > var1;
   }

   private static boolean id_package(rbk_3 var0) {
      iZ_2 var1 = var0.SF();
      if (!var1.id_class(il_3.id_while)) {
         return true;
      } else {
         iB_2 var2 = var1.id_byte(il_3.id_while).get();
         aI_2 var3 = var2.BC();
         if (var3 == aI_2.id_long) {
            return id_int(var0);
         } else {
            return id_class(var3) ? !var1.id_break(il_3.b, var2) : false;
         }
      }
   }

   private static boolean id_return(rbk_3 var0) {
      return var0.SF().id_class(il_3.id_transient);
   }

   private static rjU_2 id_super(rbk_3 var0) {
      rjU_2 var1 = iX_2.id_break(var0, 4, 2);
      return var1 == null ? var0.Ps() : var1;
   }

   private static boolean id_public(rbk_3 var0) {
      return !var0.Sn().id_class();
   }

   private static void id_protected(rbk_3 var0, rdn_3 var1) {
      rdn_3 var2 = var0.id_extends(var1);
      id_break(var0, Collections.singletonList(var2));
   }

   private static rPs_1<rbk_3, iB_2> id_protected() {
      return new rPs_1<>(rbk_3::n_, il_3.id_import, il_3.id_while, id_catch);
   }

   public static Optional<rqA_2> id_protected(rbk_3 var0) {
      return var0.SF().id_protected().map(var1 -> id_class(var0, var1));
   }

   private static void id_protected(iZ_2<rbk_3> var0) {
      var0.id_class(iq_3.id_volatile, 10, ImmutableList.of(new rPS<>(rbW_2::id_goto, 1.0F, true, 9), new rbX_2(9), new rbN_2(200, 200)), il_3.id_const);
   }

   protected static boolean id_protected(rbM_2 var0) {
      return var0.SF().id_byte(iq_3.id_break);
   }

   private static void id_protected(iB_2 var0) {
      var0.SF().id_class(il_3.id_const, true, 120L);
   }

   private static void id_protected(rbM_2 var0, iB_2 var1) {
      Optional var2 = id_break(var0);
      if (var2.isPresent()) {
         id_byte(var0, (iB_2)var2.get());
      } else {
         id_byte(var0, var1);
      }
   }

   private static void id_protected(rbk_3 var0, iB_2 var1) {
      iZ_2 var2 = var0.SF();
      iB_2 var3 = iA_2.id_class(var0, var2.id_byte(il_3.id_while), var1);
      var3 = iA_2.id_class(var0, var2.id_byte(il_3.id_package), var3);
      id_throws(var0, var3);
   }

   private static boolean id_private(iB_2 var0) {
      return var0.SF().id_class(il_3.id_public);
   }

   private static boolean id_private(rbk_3 var0) {
      if (!var0.n_()) {
         return false;
      } else {
         an_3 var1 = var0.ra();
         return var1 instanceof rbk_3 && ((rbk_3)var1).n_() || var1 instanceof rEg_1 && ((rEg_1)var1).n_();
      }
   }

   private static void id_final(rbk_3 var0) {
      var0.SF().id_break(il_3.id_volatile);
      var0.id_public().id_final();
   }

   private static List<rbM_2> id_volatile(rbk_3 var0) {
      return var0.SF().id_byte(il_3.s).orElse(ImmutableList.of());
   }

   private static boolean id_synchronized(rbk_3 var0) {
      return var0.SF().id_class(il_3.J);
   }

   private static boolean id_native(rbk_3 var0) {
      iZ_2 var1 = var0.SF();
      return !var1.id_class(il_3.id_while) ? false : var1.id_byte(il_3.id_while).get().id_class(var0, 12.0);
   }
}

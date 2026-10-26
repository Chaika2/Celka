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
   public static final rdb_3 class_ = rdy_3.Od;
   private static final rqb_3 break_ = rqt_3.class_(30, 120);
   private static final rqb_3 byte_ = rqt_3.class_(10, 40);
   private static final rqb_3 protected_ = rqt_3.class_(10, 30);
   private static final rqb_3 throws_ = rqt_3.class_(5, 20);
   private static final rqb_3 case_ = rqt_3.class_(5, 7);
   private static final rqb_3 catch_ = rqt_3.class_(5, 7);
   private static final Set<rdb_3> private_ = ImmutableSet.of(rdy_3.hC, rdy_3.hl);

   private static void byte_(rbk_3 var0, iB_2 var1) {
      volatile_(var0).stream().filter(var0x -> var0x instanceof rbk_3).forEach(var1x -> protected_((rbk_3)var1x, var1));
   }

   private static rPO<rfH_2> byte_() {
      return rPO.class_(il_3.J, 1.0F, 8, false);
   }

   protected static void byte_(rbM_2 var0, iB_2 var1) {
      if (throws_(var1)) {
         var0.SF().break_(il_3.interface_);
         var0.SF().class_(il_3.short_, var1.ro(), 600L);
         if (var1.BC() == aI_2.long_ && var0.throws_()) {
            byte_(var0);
         }

         if (var1.BC() == aI_2.rM && ((rYB)var0.throws_[7]).B().break_(rRu_1.long_)) {
            var0.SF().class_(il_3.default_, true, 600L);
         }
      }
   }

   protected static void byte_(rbk_3 var0) {
      if (else_(var0) && !var0.Sn().class_()) {
         var0.a_(var0.Sn());
         var0.class_(rpm_3.OFF_HAND, rdn_3.break_);
      }
   }

   private static void byte_(rbk_3 var0, rdn_3 var1) {
      if (public_(var0)) {
         var0.a_(var0.protected_(rpm_3.OFF_HAND));
      }

      var0.final_(var1);
   }

   private static void byte_(iZ_2<rbk_3> var0) {
      var0.class_(
         iq_3.native_,
         10,
         ImmutableList.of(
            byte_(),
            new rro_3(rbW_2::break_, 14.0F),
            new rrp_3<>(rbM_2::sx, rbW_2::extends_),
            new rPN<>(var0x -> !var0x.sQ(), new rrV_2<>(2, 1.0F)),
            new rPN<>(rbk_3::sQ, new rrV_2<>(4, 0.6F)),
            new rry_3(ImmutableList.of(Pair.of(new rro_3(aI_2.d, 8.0F), 1), Pair.of(new rPC(0.6F, 2, 1), 1), Pair.of(new rrQ_2(10, 20), 1)))
         ),
         il_3.double_
      );
   }

   private static boolean byte_(rdb_3 var0) {
      return private_.contains(var0);
   }

   protected static void byte_(rbM_2 var0) {
      var0.SF().class_(il_3.for_, true, (long)break_.class_(((rYB)var0.throws_[7]).int_));
   }

   private static boolean byte_(iB_2 var0) {
      return var0.class_(rdy_3.kU);
   }

   private static boolean int_(rbk_3 var0) {
      return !new_(var0);
   }

   private static boolean this_(rbk_3 var0) {
      return var0.SF().class_(il_3.X);
   }

   protected static void class_(rbM_2 var0) {
      throws_(var0).forEach(var0x -> break_(var0x).ifPresent(var1 -> byte_(var0x, var1)));
   }

   private static boolean class_(rbk_3 var0, an_3 var1) {
      return !(var1 instanceof is_3 var2)
         ? false
         : !var2.n_() || !var2.BM() || private_((iB_2)var0) || private_(var2) || var2 instanceof rbk_3 && var2.ra() == null;
   }

   protected static iZ_2<?> class_(rbk_3 var0, iZ_2<rbk_3> var1) {
      class_(var1);
      break_(var1);
      protected_(var1);
      break_(var0, var1);
      byte_(var1);
      throws_(var1);
      case_(var1);
      var1.class_(ImmutableSet.of(iq_3.class_));
      var1.break_(iq_3.break_);
      var1.byte_();
      return var1;
   }

   public static void class_(rhd_3 var0, boolean var1) {
      List var2 = ((rYB)var0.throws_[7]).class_(rbk_3.class, var0.rN().class_(16.0));
      var2.stream().filter(rbW_2::protected_).filter(var2x -> !var1 || iA_2.byte_(var2x, var0)).forEach(var1x -> {
         if (((rYB)var1x.throws_[7]).B().break_(rRu_1.long_)) {
            protected_((rbM_2)var1x, var0);
         } else {
            byte_((rbM_2)var1x, var0);
         }
      });
   }

   protected static boolean class_(rbk_3 var0, rdn_3 var1) {
      rdb_3 var2 = var1.break_();
      if (var2.class_(rlc_3.const_)) {
         return false;
      } else if (return_(var0) && var0.SF().class_(il_3.package_)) {
         return false;
      } else if (break_(var2)) {
         return goto_(var0);
      } else {
         boolean var3 = var0.native_(var1);
         if (var2 == rdy_3.JF) {
            return var3;
         } else if (byte_(var2)) {
            return !this_(var0) && var3;
         } else {
            return !class_(var2) ? var0.package_(var1) : goto_(var0) && var3;
         }
      }
   }

   private static boolean class_(iB_2 var0, iB_2 var1) {
      return var1.BC() != aI_2.long_ ? false : new Random(((rYB)var0.throws_[7]).r()).nextFloat() < 0.1F;
   }

   public static boolean class_(aI_2 var0) {
      return var0 == aI_2.rb || var0 == aI_2.rS;
   }

   protected static void class_(rbM_2 var0, iB_2 var1) {
      if (!var0.SF().byte_(iq_3.final_) && throws_(var1) && !iA_2.class_(var0, var1, 4.0)) {
         if (var1.BC() == aI_2.rM && ((rYB)var0.throws_[7]).B().break_(rRu_1.long_)) {
            protected_(var0, var1);
            class_(var0);
         } else {
            byte_(var0, var1);
            break_(var0, var1);
         }
      }
   }

   private static rqA_2 class_(rbk_3 var0, iq_3 var1) {
      if (var1 == iq_3.extends_) {
         return rqn_3.hr;
      } else if (var0.sJ()) {
         return rqn_3.hE;
      } else if (var1 == iq_3.final_ && native_(var0)) {
         return rqn_3.hE;
      } else if (var1 == iq_3.volatile_) {
         return rqn_3.Oa;
      } else if (var1 == iq_3.native_) {
         return rqn_3.hP;
      } else if (case_((iB_2)var0)) {
         return rqn_3.hS;
      } else {
         return synchronized_(var0) ? rqn_3.hE : rqn_3.Oi;
      }
   }

   private static void class_(iZ_2<rbk_3> var0) {
      var0.class_(
         iq_3.class_,
         0,
         ImmutableList.of(
            new rrK_2(45, 90), new rPy_1(), new rrg_3(), protected_(), throws_(), new rbz_3(), new rbO_2(120), new rrN_2(300, rbW_2::class_), new rrw_3()
         )
      );
   }

   public static boolean class_(iB_2 var0) {
      for (rdn_3 var2 : var0.PV()) {
         rdb_3 var3 = var2.break_();
         if (var3 instanceof rxS_2 && ((rxS_2)var3).throws_() == rxE_2.GOLD) {
            return true;
         }
      }

      return false;
   }

   protected static void class_(rbk_3 var0, iB_2 var1) {
      if (!(var1 instanceof rbk_3)) {
         if (public_(var0)) {
            class_(var0, false);
         }

         iZ_2 var2 = var0.SF();
         var2.break_(il_3.double_);
         var2.break_(il_3.switch_);
         var2.break_(il_3.const_);
         if (var1 instanceof rhd_3) {
            var2.class_(il_3.transient_, true, 400L);
         }

         catch_(var0).ifPresent(var2x -> {
            if (var2x.BC() != var1.BC()) {
               var2.break_(il_3.while_);
            }
         });
         if (var0.n_()) {
            var2.class_(il_3.while_, var1, 100L);
            if (throws_(var1)) {
               break_((rbM_2)var0, var1);
            }
         } else if (var1.BC() == aI_2.long_ && new_(var0)) {
            throws_(var0, var1);
            byte_(var0, var1);
         } else {
            class_((rbM_2)var0, var1);
         }
      }
   }

   protected static void class_(rbk_3 var0) {
      int var1 = break_.class_(((rYB)var0.throws_[7]).int_);
      var0.SF().class_(il_3.for_, true, (long)var1);
   }

   public static ryZ_2 class_(rbk_3 var0, rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.protected_(var2);
      if (break_(var0, var3)) {
         rdn_3 var4 = var3.class_(1);
         byte_(var0, var4);
         protected_((iB_2)var0);
         final_(var0);
         return ryZ_2.CONSUME;
      } else {
         return ryZ_2.PASS;
      }
   }

   protected static void class_(rbk_3 var0, rsE_2 var1) {
      final_(var0);
      rdn_3 var2;
      if (var1.protected_().break_() == rdy_3.JF) {
         var0.class_(var1, var1.protected_().char_());
         var2 = var1.protected_();
         var1.PD();
      } else {
         var0.class_(var1, 1);
         var2 = class_(var1);
      }

      rdb_3 var3 = var2.break_();
      if (class_(var3)) {
         var0.SF().break_(il_3.strictfp_);
         byte_(var0, var2);
         protected_((iB_2)var0);
      } else if (byte_(var3) && !this_(var0)) {
         continue_(var0);
      } else {
         boolean var4 = var0.catch_(var2);
         if (!var4) {
            protected_(var0, var2);
         }
      }
   }

   private static rry_3<rbk_3> class_() {
      return new rry_3<>(
         ImmutableList.of(Pair.of(new rro_3(aI_2.rM, 8.0F), 1), Pair.of(new rro_3(aI_2.d, 8.0F), 1), Pair.of(new rro_3(8.0F), 1), Pair.of(new rrQ_2(30, 60), 1))
      );
   }

   private static rdn_3 class_(rsE_2 var0) {
      rdn_3 var1 = var0.protected_();
      rdn_3 var2 = var1.class_(1);
      if (var1.class_()) {
         var0.PD();
      } else {
         var0.break_(var1);
      }

      return var2;
   }

   protected static void class_(rbk_3 var0, boolean var1) {
      rdn_3 var2 = var0.protected_(rpm_3.OFF_HAND);
      var0.class_(rpm_3.OFF_HAND, rdn_3.break_);
      if (var0.sx()) {
         boolean var3 = break_(var2.break_());
         if (var1 && var3) {
            class_(var0, implements_(var0));
         } else if (!var3) {
            boolean var4 = var0.catch_(var2);
            if (!var4) {
               protected_(var0, var2);
            }
         }
      } else {
         boolean var5 = var0.catch_(var2);
         if (!var5) {
            rdn_3 var6 = var0.ss();
            if (class_(var6.break_())) {
               protected_(var0, var6);
            } else {
               class_(var0, Collections.singletonList(var6));
            }

            var0.volatile_(var2);
         }
      }
   }

   protected static boolean class_(rdb_3 var0) {
      return var0.class_(rlc_3.strictfp_);
   }

   private static void class_(rbk_3 var0, List<rdn_3> var1, rjU_2 var2) {
      if (!var1.isEmpty()) {
         var0.class_(rpm_3.OFF_HAND);

         for (rdn_3 var4 : var1) {
            iA_2.class_(var0, var4, var2.break_(0.0, 1.0, 0.0));
         }
      }
   }

   private static void class_(rbk_3 var0, List<rdn_3> var1) {
      Optional var2 = var0.SF().byte_(il_3.extends_);
      if (var2.isPresent()) {
         class_(var0, (rhd_3)var2.get(), var1);
      } else {
         break_(var0, var1);
      }
   }

   private static void class_(rbk_3 var0, rhd_3 var1, List<rdn_3> var2) {
      class_(var0, var2, var1.Ps());
   }

   private static void break_(rbk_3 var0, iZ_2<rbk_3> var1) {
      var1.class_(
         iq_3.extends_,
         10,
         ImmutableList.of(
            new rrn_3(var1x -> !break_(var0, var1x)),
            new rPN<>(rbW_2::byte_, new rrM_2<>(5, 0.75F)),
            new rrU_2(1.0F),
            new rrO_2(20),
            new rPJ(),
            new rbh_3(),
            new rPE<>(rbW_2::finally_, il_3.package_)
         ),
         il_3.package_
      );
   }

   public static Optional<rhd_3> break_(rbM_2 var0) {
      return var0.SF().class_(il_3.native_) ? var0.SF().byte_(il_3.native_) : Optional.empty();
   }

   protected static void break_(rbM_2 var0, iB_2 var1) {
      throws_(var0).forEach(var1x -> {
         if (var1.BC() != aI_2.long_ || var1x.throws_() && ((rEg_1)var1).sd()) {
            throws_(var1x, var1);
         }
      });
   }

   public static boolean break_(iB_2 var0) {
      return var0.BC() == aI_2.rM && var0.class_(rbW_2::class_);
   }

   private static boolean break_(rdb_3 var0) {
      return var0 == class_;
   }

   private static void break_(iZ_2<rbk_3> var0) {
      var0.class_(
         iq_3.break_,
         10,
         ImmutableList.of(
            new rro_3(rbW_2::break_, 14.0F),
            new rrp_3<>(rbM_2::sx, rbW_2::extends_),
            new rPN<>(rbk_3::throws_, new rbQ_2<>()),
            byte_(),
            case_(),
            class_(),
            break_(),
            new rrL_2(aI_2.rM, 4)
         )
      );
   }

   protected static boolean break_(rbk_3 var0, rdn_3 var1) {
      return !return_(var0) && !else_(var0) && var0.sx() && break_(var1.break_());
   }

   private static void break_(rbk_3 var0, List<rdn_3> var1) {
      class_(var0, var1, super_(var0));
   }

   protected static void break_(rbk_3 var0) {
      iZ_2 var1 = var0.SF();
      iq_3 var2 = var1.protected_().orElse((iq_3)null);
      var1.class_(ImmutableList.of(iq_3.volatile_, iq_3.extends_, iq_3.final_, iq_3.native_, iq_3.package_, iq_3.break_));
      iq_3 var3 = var1.protected_().orElse((iq_3)null);
      if (var2 != var3) {
         protected_(var0).ifPresent(var0::class_);
      }

      var0.case_(var1.class_(il_3.package_));
      if (!var1.class_(il_3.super_) && private_(var0)) {
         var0.BH();
      }

      if (!var1.class_(il_3.double_)) {
         var1.break_(il_3.switch_);
      }

      var0.else_(var1.class_(il_3.switch_));
   }

   private static rry_3<rbk_3> break_() {
      return new rry_3<>(
         ImmutableList.of(
            Pair.of(new rPC(0.6F), 2),
            Pair.of(rrR_2.class_(aI_2.d, 8, il_3.new_, 0.6F, 2), 2),
            Pair.of(new rPN<>(rbW_2::catch_, new rPq_1(0.6F, 3)), 2),
            Pair.of(new rrQ_2(30, 60), 1)
         )
      );
   }

   private static boolean break_(rbk_3 var0, iB_2 var1) {
      return extends_(var0).filter(var1x -> var1x == var1).isPresent();
   }

   private static List<rbM_2> throws_(rbM_2 var0) {
      return var0.SF().byte_(il_3.S).orElse(ImmutableList.of());
   }

   private static void throws_(rbk_3 var0, iB_2 var1) {
      var0.SF().break_(il_3.short_);
      var0.SF().break_(il_3.package_);
      var0.SF().break_(il_3.volatile_);
      var0.SF().class_(il_3.while_, var1, (long)throws_.class_(((rYB)var0.throws_[7]).int_));
      byte_((rbM_2)var0);
   }

   protected static boolean throws_(rbk_3 var0) {
      return var0.SF().class_(il_3.for_) || volatile_(var0).stream().anyMatch(var0x -> var0x.SF().class_(il_3.for_));
   }

   private static rPs_1<rbk_3, iB_2> throws_() {
      return new rPs_1<>(rbW_2::finally_, il_3.b, il_3.while_, case_);
   }

   private static void throws_(rbM_2 var0, iB_2 var1) {
      Optional var2 = case_(var0);
      iB_2 var3 = iA_2.class_(var0, var2, var1);
      if (!var2.isPresent() || var2.get() != var3) {
         byte_(var0, var3);
      }
   }

   private static void throws_(iZ_2<rbk_3> var0) {
      var0.class_(
         iq_3.final_, 10, ImmutableList.of(rPO.break_(il_3.while_, 1.0F, 12, true), class_(), break_(), new rPE<>(rbW_2::package_, il_3.while_)), il_3.while_
      );
   }

   private static boolean throws_(iB_2 var0) {
      return rpJ_2.case_.test(var0);
   }

   private static boolean finally_(rbk_3 var0) {
      iZ_2 var1 = var0.SF();
      if (var1.class_(il_3.b)) {
         iB_2 var2 = var1.byte_(il_3.b).get();
         return var0.class_(var2, 6.0);
      } else {
         return false;
      }
   }

   public static Optional<iB_2> catch_(rbk_3 var0) {
      return var0.SF().class_(il_3.while_) ? var0.SF().byte_(il_3.while_) : Optional.empty();
   }

   private static boolean catch_(iB_2 var0) {
      return !case_(var0);
   }

   private static Optional<? extends iB_2> extends_(rbk_3 var0) {
      iZ_2 var1 = var0.SF();
      if (finally_(var0)) {
         return Optional.empty();
      } else {
         Optional var2 = iA_2.class_(var0, il_3.short_);
         if (var2.isPresent() && throws_((iB_2)var2.get())) {
            return var2;
         } else {
            if (var1.class_(il_3.default_)) {
               Optional var3 = var1.byte_(il_3.native_);
               if (var3.isPresent()) {
                  return var3;
               }
            }

            Optional var5 = var1.byte_(il_3.import_);
            if (var5.isPresent()) {
               return var5;
            } else {
               Optional var4 = var1.byte_(il_3.B);
               return var4.isPresent() && throws_((iB_2)var4.get()) ? var4 : Optional.empty();
            }
         }
      }
   }

   private static boolean goto_(rbk_3 var0) {
      return var0.Sn().class_() || !class_(var0.Sn().break_());
   }

   private static Optional<iB_2> case_(rbM_2 var0) {
      return iA_2.class_(var0, il_3.short_);
   }

   private static boolean case_(iB_2 var0) {
      return var0.SF().class_(il_3.h);
   }

   protected static void case_(rbk_3 var0) {
      volatile_(var0).forEach(rbW_2::byte_);
   }

   private static rPh_1<rbk_3> case_() {
      return new rPh_1<>(new rPs_1<>(rbk_3::n_, il_3.P, il_3.super_, protected_), byte_);
   }

   private static void case_(iZ_2<rbk_3> var0) {
      var0.class_(
         iq_3.package_,
         10,
         ImmutableList.of(new rPb_1(0.8F), new rro_3(rbW_2::break_, 8.0F), new rPN<>(an_3::Pm, class_()), new rPQ<>(8, rbW_2::class_)),
         il_3.super_
      );
   }

   private static void continue_(rbk_3 var0) {
      var0.SF().class_(il_3.X, true, 200L);
   }

   private static boolean else_(rbk_3 var0) {
      return var0.SF().class_(il_3.const_);
   }

   private static List<rdn_3> implements_(rbk_3 var0) {
      rzL_2 var1 = ((rYB)var0.throws_[7]).const_().o().class_(rzl_3.l);
      return var1.class_(new rzP_2((rrEm_1)((rYB)var0.throws_[7])).class_(rzQ_2.class_, var0).class_(((rYB)var0.throws_[7]).int_).class_(rzz_3.private_));
   }

   private static boolean new_(rbk_3 var0) {
      int var1 = var0.SF().byte_(il_3.M).orElse(0) + 1;
      int var2 = var0.SF().byte_(il_3.O).orElse(0);
      return var2 > var1;
   }

   private static boolean package_(rbk_3 var0) {
      iZ_2 var1 = var0.SF();
      if (!var1.class_(il_3.while_)) {
         return true;
      } else {
         iB_2 var2 = var1.byte_(il_3.while_).get();
         aI_2 var3 = var2.BC();
         if (var3 == aI_2.long_) {
            return int_(var0);
         } else {
            return class_(var3) ? !var1.break_(il_3.b, var2) : false;
         }
      }
   }

   private static boolean return_(rbk_3 var0) {
      return var0.SF().class_(il_3.transient_);
   }

   private static rjU_2 super_(rbk_3 var0) {
      rjU_2 var1 = iX_2.break_(var0, 4, 2);
      return var1 == null ? var0.Ps() : var1;
   }

   private static boolean public_(rbk_3 var0) {
      return !var0.Sn().class_();
   }

   private static void protected_(rbk_3 var0, rdn_3 var1) {
      rdn_3 var2 = var0.extends_(var1);
      break_(var0, Collections.singletonList(var2));
   }

   private static rPs_1<rbk_3, iB_2> protected_() {
      return new rPs_1<>(rbk_3::n_, il_3.import_, il_3.while_, catch_);
   }

   public static Optional<rqA_2> protected_(rbk_3 var0) {
      return var0.SF().protected_().map(var1 -> class_(var0, var1));
   }

   private static void protected_(iZ_2<rbk_3> var0) {
      var0.class_(iq_3.volatile_, 10, ImmutableList.of(new rPS<>(rbW_2::goto_, 1.0F, true, 9), new rbX_2(9), new rbN_2(200, 200)), il_3.const_);
   }

   protected static boolean protected_(rbM_2 var0) {
      return var0.SF().byte_(iq_3.break_);
   }

   private static void protected_(iB_2 var0) {
      var0.SF().class_(il_3.const_, true, 120L);
   }

   private static void protected_(rbM_2 var0, iB_2 var1) {
      Optional var2 = break_(var0);
      if (var2.isPresent()) {
         byte_(var0, (iB_2)var2.get());
      } else {
         byte_(var0, var1);
      }
   }

   private static void protected_(rbk_3 var0, iB_2 var1) {
      iZ_2 var2 = var0.SF();
      iB_2 var3 = iA_2.class_(var0, var2.byte_(il_3.while_), var1);
      var3 = iA_2.class_(var0, var2.byte_(il_3.package_), var3);
      throws_(var0, var3);
   }

   private static boolean private_(iB_2 var0) {
      return var0.SF().class_(il_3.public_);
   }

   private static boolean private_(rbk_3 var0) {
      if (!var0.n_()) {
         return false;
      } else {
         an_3 var1 = var0.ra();
         return var1 instanceof rbk_3 && ((rbk_3)var1).n_() || var1 instanceof rEg_1 && ((rEg_1)var1).n_();
      }
   }

   private static void final_(rbk_3 var0) {
      var0.SF().break_(il_3.volatile_);
      var0.public_().final_();
   }

   private static List<rbM_2> volatile_(rbk_3 var0) {
      return var0.SF().byte_(il_3.s).orElse(ImmutableList.of());
   }

   private static boolean synchronized_(rbk_3 var0) {
      return var0.SF().class_(il_3.J);
   }

   private static boolean native_(rbk_3 var0) {
      iZ_2 var1 = var0.SF();
      return !var1.class_(il_3.while_) ? false : var1.byte_(il_3.while_).get().class_(var0, 12.0);
   }
}

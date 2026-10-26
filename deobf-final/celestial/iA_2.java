package celestial;

import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class iA_2 {
   public static boolean byte_(iB_2 var0, iB_2 var1) {
      iZ_2 var2 = var0.SF();
      return !var2.class_(il_3.private_) ? false : var2.byte_(il_3.private_).get().contains(var1);
   }

   public static Stream<rsq_3> class_(rsq_3 var0, Predicate<rsq_3> var1) {
      return var0.SF()
         .byte_(il_3.catch_)
         .map(var2 -> var2.stream().filter(var1xx -> var1xx instanceof rsq_3 && var1xx != var0).map(var0xx -> (rsq_3)var0xx).filter(iB_2::BM).filter(var1))
         .orElseGet(Stream::empty);
   }

   public static Optional<iB_2> class_(iB_2 var0, il_3<UUID> var1) {
      Optional var2 = var0.SF().byte_(var1);
      return var2.map(var1x -> (iB_2)((rrEm_1)((rYB)var0.throws_[7])).break_(var1x));
   }

   public static iB_2 class_(iB_2 var0, iB_2 var1, iB_2 var2) {
      rjU_2 var3 = var1.Ps();
      rjU_2 var4 = var2.Ps();
      return var0.break_(var3) < var0.break_(var4) ? var1 : var2;
   }

   public static iB_2 class_(iB_2 var0, Optional<iB_2> var1, iB_2 var2) {
      return !var1.isPresent() ? var2 : class_(var0, (iB_2)var1.get(), var2);
   }

   public static boolean class_(iB_2 var0, iB_2 var1, double var2) {
      Optional var4 = var0.SF().byte_(il_3.package_);
      if (!var4.isPresent()) {
         return false;
      } else {
         double var5 = var0.break_(((iB_2)var4.get()).Ps());
         double var7 = var0.break_(var1.Ps());
         return var7 > var5 + var2 * var2;
      }
   }

   public static void class_(iB_2 var0, an_3 var1, float var2, int var3) {
      iH_2 var4 = new iH_2(new rfY_2(var1, false), var2, var3);
      var0.SF().class_(il_3.final_, new rfY_2(var1, true));
      var0.SF().class_(il_3.volatile_, var4);
   }

   public static void class_(iB_2 var0, iB_2 var1, float var2) {
      protected_(var0, var1);
      break_(var0, var1, var2);
   }

   private static boolean class_(iZ_2<?> var0, il_3<? extends iB_2> var1, Predicate<iB_2> var2) {
      return var0.<iB_2>byte_(var1).filter(var2).filter(iB_2::BM).filter(var1x -> class_(var0, var1x)).isPresent();
   }

   public static boolean class_(iZ_2<?> var0, il_3<? extends iB_2> var1, aI_2<?> var2) {
      return class_(var0, var1, var1x -> var1x.BC() == var2);
   }

   public static boolean class_(iZ_2<?> var0, iB_2 var1) {
      return var0.byte_(il_3.private_).filter(var1x -> var1x.contains(var1)).isPresent();
   }

   public static void class_(iB_2 var0, iB_2 var1) {
      var0.SF().class_(il_3.final_, new rfY_2(var1, true));
   }

   public static boolean class_(is_3 var0, iB_2 var1, int var2) {
      rdb_3 var3 = var0.ss().break_();
      if (var3 instanceof rkB_2 && var0.class_((rkB_2)var3)) {
         int var4 = ((rkB_2)var3).throws_() - var2;
         return var0.class_(var1, (double)var4);
      } else {
         return break_(var0, var1);
      }
   }

   public static rjh_3 class_(rrEm_1 var0, rjh_3 var1, int var2) {
      int var3 = var0.break_(var1);
      return rjh_3.class_(var1, var2).filter(var2x -> var0.break_(var2x) < var3).min(Comparator.comparingInt(var0::break_)).orElse(var1);
   }

   public static void class_(iB_2 var0, rfH_2 var1, float var2, int var3) {
      iH_2 var4 = new iH_2(new rfI_2(var1), var2, var3);
      var0.SF().class_(il_3.final_, new rfI_2(var1));
      var0.SF().class_(il_3.volatile_, var4);
   }

   public static void class_(iB_2 var0, rdn_3 var1, rjU_2 var2) {
      double var3 = var0.rH() - 0.3F;
      rsE_2 var5 = new rsE_2((rYB)var0.throws_[7], var0.rx(), var3, var0.BO(), var1);
      float var6 = 0.3F;
      rjU_2 var7 = var2.protected_(var0.Ps());
      var7 = var7.protected_().class_(0.3F);
      var5.byte_(var7);
      var5.private_();
      ((rYB)var0.throws_[7]).a_(var5);
   }

   public static boolean break_(iB_2 var0, iB_2 var1) {
      double var2 = var0.class_(var1.rx(), var1.re(), var1.BO());
      double var4 = (double)(var0.PN() * 2.0F * var0.PN() * 2.0F + var1.PN());
      return var2 <= var4;
   }

   private static void break_(iB_2 var0, iB_2 var1, float var2) {
      byte var3 = 2;
      class_(var0, var1, var2, 2);
      class_(var1, var0, var2, 2);
   }

   private static void protected_(iB_2 var0, iB_2 var1) {
      class_(var0, var1);
      class_(var1, var0);
   }
}

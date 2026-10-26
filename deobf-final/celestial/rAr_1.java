package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;

public class rAr_1 {
   private static final List<rAP<rLi_1>> class_ = Lists.newArrayList();
   private static final List<rAP<rdb_3>> break_ = Lists.newArrayList();
   private static final List<rkg_3> byte_ = Lists.newArrayList();
   private static final Predicate<rdn_3> protected_ = var0 -> {
      for (rkg_3 var2 : byte_) {
         if (var2.class_(var0)) {
            return true;
         }
      }

      return false;
   };

   protected static boolean byte_(rdn_3 var0, rdn_3 var1) {
      rLi_1 var2 = rAB.protected_(var0);
      int var3 = 0;

      for (int var4 = class_.size(); var3 < var4; var3++) {
         rAP var5 = class_.get(var3);
         if (var5.class_ == var2 && var5.break_.class_(var1)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean byte_(rdn_3 var0) {
      int var1 = 0;

      for (int var2 = class_.size(); var1 < var2; var1++) {
         if (class_.get(var1).break_.class_(var0)) {
            return true;
         }
      }

      return false;
   }

   public static void class_() {
      class_(rdy_3.JA);
      class_(rdy_3.kk);
      class_(rdy_3.kQ);
      class_(rdy_3.JA, rdy_3.hr, rdy_3.kk);
      class_(rdy_3.kk, rdy_3.kd, rdy_3.kQ);
      class_(rAS.break_, rdy_3.Jt, rAS.byte_);
      class_(rAS.break_, rdy_3.Jv, rAS.byte_);
      class_(rAS.break_, rdy_3.dy, rAS.byte_);
      class_(rAS.break_, rdy_3.JH, rAS.byte_);
      class_(rAS.break_, rdy_3.JC, rAS.byte_);
      class_(rAS.break_, rdy_3.XY, rAS.byte_);
      class_(rAS.break_, rdy_3.Jy, rAS.byte_);
      class_(rAS.break_, rdy_3.XW, rAS.protected_);
      class_(rAS.break_, rdy_3.hD, rAS.byte_);
      class_(rAS.break_, rdy_3.JL, rAS.throws_);
      class_(rAS.throws_, rdy_3.dO, rAS.case_);
      class_(rAS.case_, rdy_3.hD, rAS.catch_);
      class_(rAS.case_, rdy_3.Jl, rAS.private_);
      class_(rAS.catch_, rdy_3.Jl, rAS.implements_);
      class_(rAS.private_, rdy_3.hD, rAS.implements_);
      class_(rAS.throws_, rdy_3.Jy, rAS.volatile_);
      class_(rAS.volatile_, rdy_3.hD, rAS.final_);
      class_(rAS.throws_, rdy_3.dy, rAS.finally_);
      class_(rAS.finally_, rdy_3.hD, rAS.extends_);
      class_(rAS.finally_, rdy_3.XW, rAS.native_);
      class_(rAS.finally_, rdy_3.Jl, rAS.continue_);
      class_(rAS.extends_, rdy_3.Jl, rAS.super_);
      class_(rAS.continue_, rdy_3.hD, rAS.super_);
      class_(rAS.continue_, rdy_3.XW, rAS.this_);
      class_(rAS.throws_, rdy_3.Os, rAS.else_);
      class_(rAS.else_, rdy_3.hD, rAS.synchronized_);
      class_(rAS.else_, rdy_3.XW, rAS.return_);
      class_(rAS.package_, rdy_3.Jl, rAS.continue_);
      class_(rAS.int_, rdy_3.Jl, rAS.super_);
      class_(rAS.throws_, rdy_3.XY, rAS.package_);
      class_(rAS.package_, rdy_3.hD, rAS.int_);
      class_(rAS.package_, rdy_3.XW, rAS.new_);
      class_(rAS.throws_, rdy_3.Xc, rAS.public_);
      class_(rAS.public_, rdy_3.hD, rAS.goto_);
      class_(rAS.throws_, rdy_3.Jt, rAS.while_);
      class_(rAS.while_, rdy_3.XW, rAS.try_);
      class_(rAS.while_, rdy_3.Jl, rAS.instanceof_);
      class_(rAS.try_, rdy_3.Jl, rAS.throw_);
      class_(rAS.instanceof_, rdy_3.XW, rAS.throw_);
      class_(rAS.interface_, rdy_3.Jl, rAS.instanceof_);
      class_(rAS.char_, rdy_3.Jl, rAS.instanceof_);
      class_(rAS.abstract_, rdy_3.Jl, rAS.throw_);
      class_(rAS.throws_, rdy_3.JC, rAS.interface_);
      class_(rAS.interface_, rdy_3.hD, rAS.char_);
      class_(rAS.interface_, rdy_3.XW, rAS.abstract_);
      class_(rAS.throws_, rdy_3.Jv, rAS.long_);
      class_(rAS.long_, rdy_3.hD, rAS.float_);
      class_(rAS.long_, rdy_3.XW, rAS.void_);
      class_(rAS.throws_, rdy_3.JH, rAS.static_);
      class_(rAS.static_, rdy_3.hD, rAS.import_);
      class_(rAS.static_, rdy_3.XW, rAS.short_);
      class_(rAS.break_, rdy_3.Jl, rAS.default_);
      class_(rAS.default_, rdy_3.hD, rAS.const_);
      class_(rAS.throws_, rdy_3.ko, rAS.boolean_);
      class_(rAS.boolean_, rdy_3.hD, rAS.transient_);
   }

   private static void class_(rdb_3 var0, rdb_3 var1, rdb_3 var2) {
      if (!(var0 instanceof rdU_2)) {
         throw new IllegalArgumentException("Expected a potion, got: " + rVL.for_.break_(var0));
      } else if (!(var2 instanceof rdU_2)) {
         throw new IllegalArgumentException("Expected a potion, got: " + rVL.for_.break_(var2));
      } else {
         break_.add(new rAP<>(var0, rkg_3.class_(var1), var2));
      }
   }

   private static void class_(rdb_3 var0) {
      if (!(var0 instanceof rdU_2)) {
         throw new IllegalArgumentException("Expected a potion, got: " + rVL.for_.break_(var0));
      } else {
         byte_.add(rkg_3.class_(var0));
      }
   }

   private static void class_(rLi_1 var0, rdb_3 var1, rLi_1 var2) {
      class_.add(new rAP<>(var0, rkg_3.class_(var1), var2));
   }

   public static boolean class_(rLi_1 var0) {
      int var1 = 0;

      for (int var2 = class_.size(); var1 < var2; var1++) {
         if (class_.get(var1).byte_ == var0) {
            return true;
         }
      }

      return false;
   }

   public static boolean class_(rdn_3 var0) {
      return break_(var0) || byte_(var0);
   }

   public static boolean class_(rdn_3 var0, rdn_3 var1) {
      return !protected_.test(var0) ? false : break_(var0, var1) || byte_(var0, var1);
   }

   protected static boolean break_(rdn_3 var0) {
      int var1 = 0;

      for (int var2 = break_.size(); var1 < var2; var1++) {
         if (break_.get(var1).break_.class_(var0)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean break_(rdn_3 var0, rdn_3 var1) {
      rdb_3 var2 = var0.break_();
      int var3 = 0;

      for (int var4 = break_.size(); var3 < var4; var3++) {
         rAP var5 = break_.get(var3);
         if (var5.class_ == var2 && var5.break_.class_(var1)) {
            return true;
         }
      }

      return false;
   }

   public static rdn_3 protected_(rdn_3 var0, rdn_3 var1) {
      if (!var1.class_()) {
         rLi_1 var2 = rAB.protected_(var1);
         rdb_3 var3 = var1.break_();
         int var4 = 0;

         for (int var5 = break_.size(); var4 < var5; var4++) {
            rAP var6 = break_.get(var4);
            if (var6.class_ == var3 && var6.break_.class_(var0)) {
               return rAB.class_(new rdn_3((rpL_2)var6.byte_), var2);
            }
         }

         var4 = 0;

         for (int var8 = class_.size(); var4 < var8; var4++) {
            rAP var9 = class_.get(var4);
            if (var9.class_ == var2 && var9.break_.class_(var0)) {
               return rAB.class_(new rdn_3(var3), (rLi_1)var9.byte_);
            }
         }
      }

      return var1;
   }
}

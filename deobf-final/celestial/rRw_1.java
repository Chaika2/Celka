package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface rRw_1 {
   default rhd_3 class_(ay_3 var1, double var2, double var4, double var6) {
      return this.class_(this.continue_(), var1, (iB_2)null, var2, var4, var6);
   }

   default rhd_3 class_(ay_3 var1, iB_2 var2, double var3, double var5, double var7) {
      return this.class_(this.continue_(), var1, var2, var3, var5, var7);
   }

   default rhd_3 class_(ay_3 var1, iB_2 var2) {
      return this.class_(this.continue_(), var1, var2, var2.rx(), var2.re(), var2.BO());
   }

   default boolean class_(double var1, double var3, double var5, double var7) {
      for (rhd_3 var10 : this.continue_()) {
         if (rpJ_2.catch_.test(var10) && rpJ_2.break_.test(var10)) {
            double var11 = var10.class_(var1, var3, var5);
            if (var7 < 0.0 || var11 < var7 * var7) {
               return true;
            }
         }
      }

      return false;
   }

   default rhd_3 class_(an_3 var1, double var2) {
      return this.class_(var1.rx(), var1.re(), var1.BO(), var2, false);
   }

   @Nullable
   default rhd_3 class_(UUID var1) {
      for (int var2 = 0; var2 < this.continue_().size(); var2++) {
         rhd_3 var3 = this.continue_().get(var2);
         if (var1.equals(var3.ro())) {
            return var3;
         }
      }

      return null;
   }

   default <T extends iB_2> List<T> class_(Class<? extends T> var1, ay_3 var2, iB_2 var3, rfl_3 var4) {
      List var5 = this.class_(var1, var4, (Predicate<? super T>)null);
      ArrayList var6 = Lists.newArrayList();

      for (iB_2 var8 : var5) {
         if (var2.class_(var3, var8)) {
            var6.add(var8);
         }
      }

      return var6;
   }

   default List<rhd_3> class_(ay_3 var1, iB_2 var2, rfl_3 var3) {
      ArrayList var4 = Lists.newArrayList();

      for (rhd_3 var6 : this.continue_()) {
         if (var3.throws_(var6.rx(), var6.re(), var6.BO()) && var1.class_(var2, var6)) {
            var4.add(var6);
         }
      }

      return var4;
   }

   default <T extends iB_2> T class_(List<? extends T> var1, ay_3 var2, iB_2 var3, double var4, double var6, double var8) {
      double var10 = -1.0;
      iB_2 var12 = null;

      for (iB_2 var14 : var1) {
         if (var2.class_(var3, var14)) {
            double var15 = var14.class_(var4, var6, var8);
            if (var10 == -1.0 || var15 < var10) {
               var10 = var15;
               var12 = var14;
            }
         }
      }

      return (T)var12;
   }

   default <T extends iB_2> T class_(Class<? extends T> var1, ay_3 var2, iB_2 var3, double var4, double var6, double var8, rfl_3 var10) {
      return this.class_(this.class_(var1, var10, (Predicate<? super T>)null), var2, var3, var4, var6, var8);
   }

   default <T extends an_3> List<T> class_(Class<? extends T> var1, rfl_3 var2) {
      return this.class_(var1, var2, rpJ_2.catch_);
   }

   default boolean class_(an_3 var1, rjC_2 var2) {
      if (var2.break_()) {
         return true;
      } else {
         for (an_3 var4 : this.class_(var1, var2.class_())) {
            if (!(Boolean)var4.throws_[27]
               && (Boolean)var4.throws_[2]
               && (var1 == null || !var4.return_(var1))
               && rjw_3.byte_(var2, rjw_3.class_(var4.rN()), rjN_2.implements_)) {
               return false;
            }
         }

         return true;
      }
   }

   default List<an_3> class_(an_3 var1, rfl_3 var2) {
      return this.break_(var1, var2, rpJ_2.catch_);
   }

   default rhd_3 class_(double var1, double var3, double var5, double var7, boolean var9) {
      Predicate var10 = var9 ? rpJ_2.throws_ : rpJ_2.catch_;
      return this.class_(var1, var3, var5, var7, var10);
   }

   <T extends an_3> List<T> class_(Class<? extends T> var1, rfl_3 var2, Predicate<? super T> var3);

   default rhd_3 class_(double var1, double var3, double var5, double var7, Predicate<an_3> var9) {
      double var10 = -1.0;
      rhd_3 var12 = null;

      for (rhd_3 var14 : this.continue_()) {
         if (var9 == null || var9.test(var14)) {
            double var15 = var14.class_(var1, var3, var5);
            if ((var7 < 0.0 || var15 < var7 * var7) && (var10 == -1.0 || var15 < var10)) {
               var10 = var15;
               var12 = var14;
            }
         }
      }

      return var12;
   }

   default Stream<rjC_2> class_(an_3 var1, rfl_3 var2, Predicate<an_3> var3) {
      if (var2.class_() < 1.0E-7) {
         return Stream.empty();
      } else {
         rfl_3 var4 = var2.class_(1.0E-7);
         return this.break_(var1, var4, var3.and(var2x -> {
            if (var2x.rN().byte_(var4)) {
               if (var1 == null) {
                  if (var2x.PU()) {
                     return true;
                  }
               } else if (var1.super_(var2x)) {
                  return true;
               }
            }

            return false;
         })).stream().map(an_3::rN).map(rjw_3::class_);
      }
   }

   default rhd_3 class_(an_3 var1, double var2, Predicate<an_3> var4) {
      double var5 = -1.0;
      rhd_3 var7 = null;

      for (rhd_3 var9 : this.continue_()) {
         if (var4 == null || var4.test(var9)) {
            double var10 = var9.int_(var1);
            if ((var2 < 0.0 || var10 < var2 * var2) && (var5 == -1.0 || var10 < var5)) {
               var5 = var10;
               var7 = var9;
            }
         }
      }

      return var7;
   }

   List<an_3> break_(an_3 var1, rfl_3 var2, Predicate<? super an_3> var3);

   @Nullable
   default rhd_3 break_(String var1) {
      for (int var2 = 0; var2 < this.continue_().size(); var2++) {
         rhd_3 var3 = this.continue_().get(var2);
         if (var1.equals(var3.extends_())) {
            return var3;
         }
      }

      return null;
   }

   default <T extends an_3> List<T> break_(Class<? extends T> var1, rfl_3 var2) {
      return this.break_(var1, var2, rpJ_2.catch_);
   }

   default <T extends iB_2> T break_(Class<? extends T> var1, ay_3 var2, iB_2 var3, double var4, double var6, double var8, rfl_3 var10) {
      return this.class_(this.break_(var1, var10, (Predicate<? super T>)null), var2, var3, var4, var6, var8);
   }

   default <T extends an_3> List<T> break_(Class<? extends T> var1, rfl_3 var2, Predicate<? super T> var3) {
      return this.class_(var1, var2, var3);
   }

   List<? extends rhd_3> continue_();
}

package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface rRw_1 {
   default rhd_3 id_class(ay_3 var1, double var2, double var4, double var6) {
      return this.id_class(this.id_continue(), var1, (iB_2)null, var2, var4, var6);
   }

   default rhd_3 id_class(ay_3 var1, iB_2 var2, double var3, double var5, double var7) {
      return this.id_class(this.id_continue(), var1, var2, var3, var5, var7);
   }

   default rhd_3 id_class(ay_3 var1, iB_2 var2) {
      return this.id_class(this.id_continue(), var1, var2, var2.rx(), var2.re(), var2.BO());
   }

   default boolean id_class(double var1, double var3, double var5, double var7) {
      for (rhd_3 var10 : this.id_continue()) {
         if (rpJ_2.id_catch.test(var10) && rpJ_2.id_break.test(var10)) {
            double var11 = var10.id_class(var1, var3, var5);
            if (var7 < 0.0 || var11 < var7 * var7) {
               return true;
            }
         }
      }

      return false;
   }

   default rhd_3 id_class(an_3 var1, double var2) {
      return this.id_class(var1.rx(), var1.re(), var1.BO(), var2, false);
   }

   @Nullable
   default rhd_3 id_class(UUID var1) {
      for (int var2 = 0; var2 < this.id_continue().size(); var2++) {
         rhd_3 var3 = this.id_continue().get(var2);
         if (var1.equals(var3.ro())) {
            return var3;
         }
      }

      return null;
   }

   default <T extends iB_2> List<T> id_class(Class<? extends T> var1, ay_3 var2, iB_2 var3, rfl_3 var4) {
      List var5 = this.id_class(var1, var4, (Predicate<? super T>)null);
      ArrayList var6 = Lists.newArrayList();

      for (iB_2 var8 : var5) {
         if (var2.id_class(var3, var8)) {
            var6.add(var8);
         }
      }

      return var6;
   }

   default List<rhd_3> id_class(ay_3 var1, iB_2 var2, rfl_3 var3) {
      ArrayList var4 = Lists.newArrayList();

      for (rhd_3 var6 : this.id_continue()) {
         if (var3.id_throws(var6.rx(), var6.re(), var6.BO()) && var1.id_class(var2, var6)) {
            var4.add(var6);
         }
      }

      return var4;
   }

   default <T extends iB_2> T id_class(List<? extends T> var1, ay_3 var2, iB_2 var3, double var4, double var6, double var8) {
      double var10 = -1.0;
      iB_2 var12 = null;

      for (iB_2 var14 : var1) {
         if (var2.id_class(var3, var14)) {
            double var15 = var14.id_class(var4, var6, var8);
            if (var10 == -1.0 || var15 < var10) {
               var10 = var15;
               var12 = var14;
            }
         }
      }

      return (T)var12;
   }

   default <T extends iB_2> T id_class(Class<? extends T> var1, ay_3 var2, iB_2 var3, double var4, double var6, double var8, rfl_3 var10) {
      return this.id_class(this.id_class(var1, var10, (Predicate<? super T>)null), var2, var3, var4, var6, var8);
   }

   default <T extends an_3> List<T> id_class(Class<? extends T> var1, rfl_3 var2) {
      return this.id_class(var1, var2, rpJ_2.id_catch);
   }

   default boolean id_class(an_3 var1, rjC_2 var2) {
      if (var2.id_break()) {
         return true;
      } else {
         for (an_3 var4 : this.id_class(var1, var2.id_class())) {
            if (!(Boolean)var4.id_throws[27]
               && (Boolean)var4.id_throws[2]
               && (var1 == null || !var4.id_return(var1))
               && rjw_3.id_byte(var2, rjw_3.id_class(var4.rN()), rjN_2.id_implements)) {
               return false;
            }
         }

         return true;
      }
   }

   default List<an_3> id_class(an_3 var1, rfl_3 var2) {
      return this.id_break(var1, var2, rpJ_2.id_catch);
   }

   default rhd_3 id_class(double var1, double var3, double var5, double var7, boolean var9) {
      Predicate var10 = var9 ? rpJ_2.id_throws : rpJ_2.id_catch;
      return this.id_class(var1, var3, var5, var7, var10);
   }

   <T extends an_3> List<T> id_class(Class<? extends T> var1, rfl_3 var2, Predicate<? super T> var3);

   default rhd_3 id_class(double var1, double var3, double var5, double var7, Predicate<an_3> var9) {
      double var10 = -1.0;
      rhd_3 var12 = null;

      for (rhd_3 var14 : this.id_continue()) {
         if (var9 == null || var9.test(var14)) {
            double var15 = var14.id_class(var1, var3, var5);
            if ((var7 < 0.0 || var15 < var7 * var7) && (var10 == -1.0 || var15 < var10)) {
               var10 = var15;
               var12 = var14;
            }
         }
      }

      return var12;
   }

   default Stream<rjC_2> id_class(an_3 var1, rfl_3 var2, Predicate<an_3> var3) {
      if (var2.id_class() < 1.0E-7) {
         return Stream.empty();
      } else {
         rfl_3 var4 = var2.id_class(1.0E-7);
         return this.id_break(var1, var4, var3.and(var2x -> {
            if (var2x.rN().id_byte(var4)) {
               if (var1 == null) {
                  if (var2x.PU()) {
                     return true;
                  }
               } else if (var1.id_super(var2x)) {
                  return true;
               }
            }

            return false;
         })).stream().map(an_3::rN).map(rjw_3::id_class);
      }
   }

   default rhd_3 id_class(an_3 var1, double var2, Predicate<an_3> var4) {
      double var5 = -1.0;
      rhd_3 var7 = null;

      for (rhd_3 var9 : this.id_continue()) {
         if (var4 == null || var4.test(var9)) {
            double var10 = var9.id_int(var1);
            if ((var2 < 0.0 || var10 < var2 * var2) && (var5 == -1.0 || var10 < var5)) {
               var5 = var10;
               var7 = var9;
            }
         }
      }

      return var7;
   }

   List<an_3> id_break(an_3 var1, rfl_3 var2, Predicate<? super an_3> var3);

   @Nullable
   default rhd_3 id_break(String var1) {
      for (int var2 = 0; var2 < this.id_continue().size(); var2++) {
         rhd_3 var3 = this.id_continue().get(var2);
         if (var1.equals(var3.id_extends())) {
            return var3;
         }
      }

      return null;
   }

   default <T extends an_3> List<T> id_break(Class<? extends T> var1, rfl_3 var2) {
      return this.id_break(var1, var2, rpJ_2.id_catch);
   }

   default <T extends iB_2> T id_break(Class<? extends T> var1, ay_3 var2, iB_2 var3, double var4, double var6, double var8, rfl_3 var10) {
      return this.id_class(this.id_break(var1, var10, (Predicate<? super T>)null), var2, var3, var4, var6, var8);
   }

   default <T extends an_3> List<T> id_break(Class<? extends T> var1, rfl_3 var2, Predicate<? super T> var3) {
      return this.id_class(var1, var2, var3);
   }

   List<? extends rhd_3> id_continue();
}

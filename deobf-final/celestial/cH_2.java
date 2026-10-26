package celestial;

import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public interface cH_2 extends cC_2 {
   default void byte_(cC_2 var1) {
      this.class_(var1);
   }

   default Optional<cC_2> byte_(double var1, double var3) {
      for (cC_2 var6 : this.x_()) {
         if (var6.break_(var1, var3)) {
            return Optional.of(var6);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean class_(double var1, double var3, double var5) {
      return this.byte_(var1, var3).filter(var6 -> var6.class_(var1, var3, var5)).isPresent();
   }

   @Override
   default boolean class_(int var1, int var2, int var3) {
      return this.catch_() != null && this.catch_().class_(var1, var2, var3);
   }

   void class_(boolean var1);

   void class_(cC_2 var1);

   @Override
   default boolean class_(char var1, int var2) {
      return this.catch_() != null && this.catch_().class_(var1, var2);
   }

   @Override
   default boolean class_(double var1, double var3, int var5) {
      this.class_(false);
      return this.byte_(var1, var3).filter(var5x -> var5x.class_(var1, var3, var5)).isPresent();
   }

   @Override
   default boolean class_(double var1, double var3, int var5, double var6, double var8) {
      return this.catch_() != null && this.case_() && var5 == 0 ? this.catch_().class_(var1, var3, var5, var6, var8) : false;
   }

   @Override
   default boolean break_(boolean var1) {
      cC_2 var2 = this.catch_();
      boolean var3 = var2 != null;
      if (var3 && var2.break_(var1)) {
         return true;
      } else {
         List var4 = this.x_();
         int var5 = var4.indexOf(var2);
         int var6;
         if (var3 && var5 >= 0) {
            var6 = var5 + (var1 ? 1 : 0);
         } else if (var1) {
            var6 = 0;
         } else {
            var6 = var4.size();
         }

         ListIterator var7 = var4.listIterator(var6);
         BooleanSupplier var8 = var1 ? var7::hasNext : var7::hasPrevious;
         Supplier var9 = var1 ? var7::next : var7::previous;

         while (var8.getAsBoolean()) {
            cC_2 var10 = (cC_2)var9.get();
            if (var10.break_(var1)) {
               this.class_(var10);
               return true;
            }
         }

         this.class_((cC_2)null);
         return false;
      }
   }

   default void break_(cC_2 var1) {
      this.class_(var1);
      var1.break_(true);
   }

   @Override
   default boolean break_(int var1, int var2, int var3) {
      return this.catch_() != null && this.catch_().break_(var1, var2, var3);
   }

   @Override
   default boolean break_(double var1, double var3, int var5) {
      for (cC_2 var7 : this.x_()) {
         if (var7.break_(var1, var3, var5)) {
            this.class_(var7);
            if (var5 == 0) {
               this.class_(true);
            }

            return true;
         }
      }

      return false;
   }

   cC_2 catch_();

   boolean case_();

   List<? extends cC_2> x_();
}

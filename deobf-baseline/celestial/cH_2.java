package celestial;

import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public interface cH_2 extends cC_2 {
   default void id_byte(cC_2 var1) {
      this.id_class(var1);
   }

   default Optional<cC_2> id_byte(double var1, double var3) {
      for (cC_2 var6 : this.x_()) {
         if (var6.id_break(var1, var3)) {
            return Optional.of(var6);
         }
      }

      return Optional.empty();
   }

   @Override
   default boolean id_class(double var1, double var3, double var5) {
      return this.id_byte(var1, var3).filter(var6 -> var6.id_class(var1, var3, var5)).isPresent();
   }

   @Override
   default boolean id_class(int var1, int var2, int var3) {
      return this.id_catch() != null && this.id_catch().id_class(var1, var2, var3);
   }

   void id_class(boolean var1);

   void id_class(cC_2 var1);

   @Override
   default boolean id_class(char var1, int var2) {
      return this.id_catch() != null && this.id_catch().id_class(var1, var2);
   }

   @Override
   default boolean id_class(double var1, double var3, int var5) {
      this.id_class(false);
      return this.id_byte(var1, var3).filter(var5x -> var5x.id_class(var1, var3, var5)).isPresent();
   }

   @Override
   default boolean id_class(double var1, double var3, int var5, double var6, double var8) {
      return this.id_catch() != null && this.id_case() && var5 == 0 ? this.id_catch().id_class(var1, var3, var5, var6, var8) : false;
   }

   @Override
   default boolean id_break(boolean var1) {
      cC_2 var2 = this.id_catch();
      boolean var3 = var2 != null;
      if (var3 && var2.id_break(var1)) {
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
            if (var10.id_break(var1)) {
               this.id_class(var10);
               return true;
            }
         }

         this.id_class((cC_2)null);
         return false;
      }
   }

   default void id_break(cC_2 var1) {
      this.id_class(var1);
      var1.id_break(true);
   }

   @Override
   default boolean id_break(int var1, int var2, int var3) {
      return this.id_catch() != null && this.id_catch().id_break(var1, var2, var3);
   }

   @Override
   default boolean id_break(double var1, double var3, int var5) {
      for (cC_2 var7 : this.x_()) {
         if (var7.id_break(var1, var3, var5)) {
            this.id_class(var7);
            if (var5 == 0) {
               this.id_class(true);
            }

            return true;
         }
      }

      return false;
   }

   cC_2 id_catch();

   boolean id_case();

   List<? extends cC_2> x_();
}

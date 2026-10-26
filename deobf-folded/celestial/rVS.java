package celestial;

import java.util.function.Function;
import java.util.function.Predicate;

public class rVS<T> implements rVE<T> {
   private final rqE_2<T> id_class;
   private final T[] id_break;
   private final rVG<T> id_byte;
   private final Function<rcd_3, T> id_protected;
   private final int id_throws;
   private int id_case;

   public rVS(rqE_2<T> var1, int var2, rVG<T> var3, Function<rcd_3, T> var4) {
      this.id_class = var1;
      this.id_break = (T[])(new Object[1 << var2]);
      this.id_throws = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   @Override
   public void id_class(ruu_3 var1) {
      this.id_case = var1.id_case();

      for (int var2 = 0; var2 < this.id_case; var2++) {
         this.id_break[var2] = this.id_class.id_class(var1.id_case());
      }
   }

   @Override
   public int id_class() {
      int var1 = ruu_3.id_class(this.id_break());

      for (int var2 = 0; var2 < this.id_break(); var2++) {
         var1 += ruu_3.id_class(this.id_class.id_class(this.id_break[var2]));
      }

      return var1;
   }

   @Override
   public void id_class(rcy_3 var1) {
      for (int var2 = 0; var2 < var1.size(); var2++) {
         this.id_break[var2] = this.id_protected.apply(var1.id_class(var2));
      }

      this.id_case = var1.size();
   }

   @Override
   public int id_class(T var1) {
      for (int var2 = 0; var2 < this.id_case; var2++) {
         if (this.id_break[var2] == var1) {
            return var2;
         }
      }

      int var3 = this.id_case;
      if (var3 < this.id_break.length) {
         this.id_break[var3] = (T)var1;
         this.id_case++;
         return var3;
      } else {
         return this.id_byte.onResize(this.id_throws + 1, (T)var1);
      }
   }

   @Override
   public boolean id_class(Predicate<T> var1) {
      for (int var2 = 0; var2 < this.id_case; var2++) {
         if (var1.test(this.id_break[var2])) {
            return true;
         }
      }

      return false;
   }

   @Override
   public T id_class(int var1) {
      return var1 >= 0 && var1 < this.id_case ? this.id_break[var1] : null;
   }

   public int id_break() {
      return this.id_case;
   }

   @Override
   public void id_break(ruu_3 var1) {
      var1.id_protected(this.id_case);

      for (int var2 = 0; var2 < this.id_case; var2++) {
         var1.id_protected(this.id_class.id_class(this.id_break[var2]));
      }
   }
}

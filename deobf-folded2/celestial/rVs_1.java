package celestial;

import java.util.function.Function;
import java.util.function.Predicate;

public class rVs_1<T> implements rVE<T> {
   private final rqE_2<T> id_class;
   private final rpf_3<T> id_break;
   private final rVG<T> id_byte;
   private final Function<rcd_3, T> id_protected;
   private final Function<T, rcd_3> id_throws;
   private final int id_case;

   public rVs_1(rqE_2<T> var1, int var2, rVG<T> var3, Function<rcd_3, T> var4, Function<T, rcd_3> var5) {
      this.id_class = var1;
      this.id_case = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_break = new rpf_3<>(1 << var2);
   }

   @Override
   public void id_class(ruu_3 var1) {
      this.id_break.id_class();
      int var2 = var1.id_case();

      for (int var3 = 0; var3 < var2; var3++) {
         this.id_break.id_break(this.id_class.id_class(var1.id_case()));
      }
   }

   @Override
   public int id_class() {
      int var1 = ruu_3.id_class(this.id_break());

      for (int var2 = 0; var2 < this.id_break(); var2++) {
         var1 += ruu_3.id_class(this.id_class.id_class(this.id_break.id_class(var2)));
      }

      return var1;
   }

   @Override
   public void id_class(rcy_3 var1) {
      this.id_break.id_class();

      for (int var2 = 0; var2 < var1.size(); var2++) {
         this.id_break.id_break(this.id_protected.apply(var1.id_class(var2)));
      }
   }

   @Override
   public int id_class(T var1) {
      int var2 = this.id_break.id_class((T)var1);
      if (var2 == -1) {
         var2 = this.id_break.id_break((T)var1);
         if (var2 >= 1 << this.id_case) {
            var2 = this.id_byte.onResize(this.id_case + 1, (T)var1);
         }
      }

      return var2;
   }

   @Override
   public boolean id_class(Predicate<T> var1) {
      for (int var2 = 0; var2 < this.id_break(); var2++) {
         if (var1.test(this.id_break.id_class(var2))) {
            return true;
         }
      }

      return false;
   }

   @Override
   public T id_class(int var1) {
      return this.id_break.id_class(var1);
   }

   public void id_break(rcy_3 var1) {
      for (int var2 = 0; var2 < this.id_break(); var2++) {
         var1.add(this.id_throws.apply(this.id_break.id_class(var2)));
      }
   }

   public int id_break() {
      return this.id_break.id_break();
   }

   @Override
   public void id_break(ruu_3 var1) {
      int var2 = this.id_break();
      var1.id_protected(var2);

      for (int var3 = 0; var3 < var2; var3++) {
         var1.id_protected(this.id_class.id_class(this.id_break.id_class(var3)));
      }
   }
}

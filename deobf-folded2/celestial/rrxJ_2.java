package celestial;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;
import java.util.function.Supplier;

public class rrxJ_2<T> {
   private T[] id_class = (T[])(new Object[HU.s.length]);
   private Supplier<T> id_break;

   public rrxJ_2(Function<HU, T> var1) {
      HU[] var2 = HU.s;
      this.id_class = (T[])(new Object[var2.length]);

      for (int var3 = 0; var3 < var2.length; var3++) {
         HU var4 = var2[var3];
         Object var5 = var1.apply(var4);
         this.id_class[var4.id_protected()] = (T)var5;
      }

      for (int var6 = 0; var6 < this.id_class.length; var6++) {
         if (this.id_class[var6] == null) {
            throw new RuntimeException("Missing value at index: " + var6);
         }
      }
   }

   public T id_class(HU var1) {
      return this.id_class[var1.id_protected()];
   }

   public Collection<T> id_class() {
      return Arrays.asList(this.id_class);
   }
}

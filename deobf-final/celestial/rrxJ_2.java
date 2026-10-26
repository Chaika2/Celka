package celestial;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;
import java.util.function.Supplier;

public class rrxJ_2<T> {
   private T[] class_ = (T[])(new Object[HU.s.length]);
   private Supplier<T> break_;

   public rrxJ_2(Function<HU, T> var1) {
      HU[] var2 = HU.s;
      this.class_ = (T[])(new Object[var2.length]);

      for (int var3 = 0; var3 < var2.length; var3++) {
         HU var4 = var2[var3];
         Object var5 = var1.apply(var4);
         this.class_[var4.protected_()] = (T)var5;
      }

      for (int var6 = 0; var6 < this.class_.length; var6++) {
         if (this.class_[var6] == null) {
            throw new RuntimeException("Missing value at index: " + var6);
         }
      }
   }

   public T class_(HU var1) {
      return this.class_[var1.protected_()];
   }

   public Collection<T> class_() {
      return Arrays.asList(this.class_);
   }
}

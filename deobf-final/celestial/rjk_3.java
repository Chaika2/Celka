package celestial;

import com.google.common.math.IntMath;
import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class rjk_3 implements rjc_3 {
   private final rjW_2 class_;
   private final int break_;
   private final int byte_;
   private final int protected_;

   rjk_3(int var1, int var2) {
      this.class_ = new rjW_2((int)rjw_3.class_(var1, var2));
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = IntMath.gcd(var1, var2);
   }

   @Override
   public boolean class_(rju_3 var1) {
      int var2 = this.break_ / this.protected_;
      int var3 = this.byte_ / this.protected_;

      for (int var4 = 0; var4 <= this.class_.size(); var4++) {
         if (!var1.merge(var4 / var3, var4 / var2, var4)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public DoubleList class_() {
      return this.class_;
   }
}

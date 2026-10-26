package celestial;

import com.google.common.math.IntMath;
import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class rjk_3 implements rjc_3 {
   private final rjW_2 id_class;
   private final int id_break;
   private final int id_byte;
   private final int id_protected;

   rjk_3(int var1, int var2) {
      this.id_class = new rjW_2((int)rjw_3.id_class(var1, var2));
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = IntMath.gcd(var1, var2);
   }

   @Override
   public boolean id_class(rju_3 var1) {
      int var2 = this.id_break / this.id_protected;
      int var3 = this.id_byte / this.id_protected;

      for (int var4 = 0; var4 <= this.id_class.size(); var4++) {
         if (!var1.merge(var4 / var3, var4 / var2, var4)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public DoubleList id_class() {
      return this.id_class;
   }
}

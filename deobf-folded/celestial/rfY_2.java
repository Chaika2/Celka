package celestial;

import java.util.List;
import java.util.Optional;

public class rfY_2 implements rfD_2 {
   private final an_3 id_class;
   private final boolean id_break;

   public rfY_2(an_3 var1, boolean var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.id_class;
   }

   @Override
   public rjU_2 id_class() {
      return this.id_break ? this.id_class.Ps().id_break(0.0, (double)this.id_class.Bx(), 0.0) : this.id_class.Ps();
   }

   @Override
   public boolean id_class(iB_2 var1) {
      if (!(this.id_class instanceof iB_2)) {
         return true;
      } else {
         Optional var2 = var1.SF().id_byte(il_3.id_private);
         return this.id_class.BM() && var2.isPresent() && ((List)var2.get()).contains(this.id_class);
      }
   }

   @Override
   public rfH_2 id_break() {
      return this.id_class.Bs();
   }
}

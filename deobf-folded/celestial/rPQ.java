package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.function.BiPredicate;

public class rPQ<E extends iB_2, T extends an_3> extends rPm_1<E> {
   private final int id_class;
   private final BiPredicate<E, an_3> id_byte;

   public rPQ(int var1, BiPredicate<E, an_3> var2) {
      super(ImmutableMap.of(il_3.id_super, iC_2.REGISTERED));
      this.id_class = var1;
      this.id_byte = var2;
   }

   private boolean id_class(E var1, an_3 var2) {
      return var2.BM() && var2.id_class(var1, (double)this.id_class) && (rYB)var2.id_throws[7] == (rYB)var1.id_throws[7];
   }

   @Override
   protected boolean id_class(rrEm_1 var1, E var2) {
      an_3 var3 = var2.ra();
      an_3 var4 = var2.SF().id_byte(il_3.id_super).orElse((an_3)null);
      if (var3 == null && var4 == null) {
         return false;
      } else {
         an_3 var5 = var3 == null ? var4 : var3;
         return !this.id_class((E)var2, var5) || this.id_byte.test((E)var2, var5);
      }
   }

   @Override
   protected void id_protected(rrEm_1 var1, E var2, long var3) {
      var2.BH();
      var2.SF().id_break(il_3.id_super);
   }
}

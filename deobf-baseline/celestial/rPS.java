package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.function.Predicate;

public class rPS<E extends iB_2> extends rPm_1<E> {
   private final Predicate<E> id_class;
   private final int id_byte;
   private final float id_protected;

   public rPS(float var1, boolean var2, int var3) {
      this(var0 -> true, var1, var2, var3);
   }

   public rPS(Predicate<E> var1, float var2, boolean var3, int var4) {
      super(ImmutableMap.of(il_3.id_final, iC_2.REGISTERED, il_3.id_volatile, var3 ? iC_2.REGISTERED : iC_2.VALUE_ABSENT, il_3.id_static, iC_2.VALUE_PRESENT));
      this.id_class = var1;
      this.id_byte = var4;
      this.id_protected = var2;
   }

   private rsE_2 id_class(E var1) {
      return var1.SF().id_byte(il_3.id_static).get();
   }

   @Override
   protected boolean id_class(rrEm_1 var1, E var2) {
      return this.id_class.test((E)var2) && this.id_class((E)var2).id_class(var2, (double)this.id_byte);
   }

   @Override
   protected void id_protected(rrEm_1 var1, E var2, long var3) {
      iA_2.id_class(var2, this.id_class((E)var2), this.id_protected, 0);
   }
}

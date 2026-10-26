package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.function.Function;

public class rPO<T> extends rPm_1<aA_2> {
   private final il_3<T> id_class;
   private final float id_byte;
   private final int id_protected;
   private final Function<T, rjU_2> id_throws;

   public rPO(il_3<T> var1, float var2, int var3, boolean var4, Function<T, rjU_2> var5) {
      super(ImmutableMap.of(il_3.id_volatile, var4 ? iC_2.REGISTERED : iC_2.VALUE_ABSENT, var1, iC_2.VALUE_PRESENT));
      this.id_class = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var5;
   }

   private rjU_2 id_class(aA_2 var1) {
      return this.id_throws.apply(var1.SF().id_byte(this.id_class).get());
   }

   private static void id_class(aA_2 var0, rjU_2 var1, float var2) {
      for (int var3 = 0; var3 < 10; var3++) {
         rjU_2 var4 = iX_2.id_protected(var0, 16, 7, var1);
         if (var4 != null) {
            var0.SF().id_class(il_3.id_volatile, new iH_2(var4, var2, 0));
            return;
         }
      }
   }

   protected void id_class(rrEm_1 var1, aA_2 var2, long var3) {
      id_class(var2, this.id_class(var2), this.id_byte);
   }

   protected boolean id_class(rrEm_1 var1, aA_2 var2) {
      return this.id_break(var2) ? false : var2.Ps().id_class(this.id_class(var2), (double)this.id_protected);
   }

   public static rPO<rfH_2> id_class(il_3<rfH_2> var0, float var1, int var2, boolean var3) {
      return new rPO<>(var0, var1, var2, var3, rjU_2::id_protected);
   }

   private boolean id_break(aA_2 var1) {
      if (!var1.SF().id_class(il_3.id_volatile)) {
         return false;
      } else {
         iH_2 var2 = var1.SF().id_byte(il_3.id_volatile).get();
         if (var2.id_break() != this.id_byte) {
            return false;
         } else {
            rjU_2 var3 = var2.id_class().id_class().id_protected(var1.Ps());
            rjU_2 var4 = this.id_class(var1).id_protected(var1.Ps());
            return var3.id_break(var4) < 0.0;
         }
      }
   }

   public static rPO<? extends an_3> id_break(il_3<? extends an_3> var0, float var1, int var2, boolean var3) {
      return new rPO<>(var0, var1, var2, var3, an_3::Ps);
   }
}

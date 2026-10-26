package celestial;

import com.google.common.collect.ImmutableMap;

public class rrd_3<E extends au_3> extends rPm_1<E> {
   private final rqb_3 id_class;
   private final float id_byte;

   public rrd_3(rqb_3 var1, float var2) {
      super(ImmutableMap.of(il_3.id_void, iC_2.VALUE_PRESENT, il_3.id_volatile, iC_2.VALUE_ABSENT));
      this.id_class = var1;
      this.id_byte = var2;
   }

   private au_3 id_class(E var1) {
      return var1.SF().id_byte(il_3.id_void).get();
   }

   protected void id_class(rrEm_1 var1, E var2, long var3) {
      iA_2.id_class(var2, this.id_class((E)var2), this.id_byte, this.id_class.id_class() - 1);
   }

   protected boolean id_class(rrEm_1 var1, E var2) {
      if (!var2.n_()) {
         return false;
      } else {
         au_3 var3 = this.id_class((E)var2);
         return var2.id_class(var3, (double)(this.id_class.id_break() + 1)) && !var2.id_class(var3, (double)this.id_class.id_class());
      }
   }
}

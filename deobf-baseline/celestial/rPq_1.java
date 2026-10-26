package celestial;

import com.google.common.collect.ImmutableMap;

public class rPq_1 extends rPm_1<iB_2> {
   private final float id_class;
   private final int id_byte;

   public rPq_1(float var1, int var2) {
      super(ImmutableMap.of(il_3.id_volatile, iC_2.VALUE_ABSENT, il_3.id_final, iC_2.VALUE_PRESENT));
      this.id_class = var1;
      this.id_byte = var2;
   }

   @Override
   protected void id_protected(rrEm_1 var1, iB_2 var2, long var3) {
      iZ_2 var5 = var2.SF();
      rfD_2 var6 = var5.id_byte(il_3.id_final).get();
      var5.id_class(il_3.id_volatile, new iH_2(var6, this.id_class, this.id_byte));
   }
}

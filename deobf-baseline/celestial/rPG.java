package celestial;

import com.google.common.collect.ImmutableMap;

public class rPG extends rPm_1<iB_2> {
   private final int id_class;

   public rPG(il_3<?> var1, int var2) {
      super(ImmutableMap.of(il_3.id_package, iC_2.REGISTERED, il_3.x, iC_2.VALUE_ABSENT, var1, iC_2.VALUE_PRESENT));
      this.id_class = var2;
   }

   @Override
   protected void id_protected(rrEm_1 var1, iB_2 var2, long var3) {
      var2.SF().id_class(il_3.x, true, (long)this.id_class);
      var2.SF().id_break(il_3.id_package);
   }
}

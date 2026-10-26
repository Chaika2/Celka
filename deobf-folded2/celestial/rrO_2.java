package celestial;

import com.google.common.collect.ImmutableMap;

public class rrO_2 extends rPm_1<is_3> {
   private final int id_class;

   public rrO_2(int var1) {
      super(ImmutableMap.of(il_3.id_final, iC_2.REGISTERED, il_3.id_package, iC_2.VALUE_PRESENT, il_3.id_int, iC_2.VALUE_ABSENT));
      this.id_class = var1;
   }

   protected void id_class(rrEm_1 var1, is_3 var2, long var3) {
      iB_2 var5 = this.id_break(var2);
      iA_2.id_class(var2, var5);
      var2.id_class(rpm_3.MAIN_HAND);
      var2.id_public(var5);
      var2.SF().id_class(il_3.id_int, true, (long)this.id_class);
   }

   private boolean id_class(is_3 var1) {
      return var1.id_class(var1x -> var1x instanceof rkB_2 && var1.id_class((rkB_2)var1x));
   }

   protected boolean id_class(rrEm_1 var1, is_3 var2) {
      iB_2 var3 = this.id_break(var2);
      return !this.id_class(var2) && iA_2.id_byte(var2, var3) && iA_2.id_break(var2, var3);
   }

   private iB_2 id_break(is_3 var1) {
      return var1.SF().id_byte(il_3.id_package).get();
   }
}

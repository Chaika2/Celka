package celestial;

import com.google.common.collect.ImmutableMap;

public class rrk_3 extends rPm_1<rsq_3> {
   public rrk_3() {
      super(ImmutableMap.of());
   }

   private static boolean id_class(rsq_3 var0) {
      return var0.SF().id_byte(il_3.id_goto).filter(var1 -> var1.id_int(var0) <= 36.0).isPresent();
   }

   protected void id_class(rrEm_1 var1, rsq_3 var2, long var3) {
      boolean var5 = rPB.id_break(var2) || rPB.id_class(var2) || id_class(var2);
      if (!var5) {
         var2.SF().id_break(il_3.id_public);
         var2.SF().id_break(il_3.id_goto);
         var2.SF().id_class(var1.P(), var1.r());
      }
   }
}

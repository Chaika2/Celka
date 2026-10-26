package celestial;

import com.google.common.collect.ImmutableMap;

public class rPB extends rPm_1<rsq_3> {
   protected void id_byte(rrEm_1 var1, rsq_3 var2, long var3) {
      if (var3 % 100L == 0L) {
         var2.id_class(var1, var3, 3);
      }
   }

   public rPB() {
      super(ImmutableMap.of());
   }

   public static boolean id_class(iB_2 var0) {
      return var0.SF().id_class(il_3.id_try);
   }

   protected boolean id_class(rrEm_1 var1, rsq_3 var2, long var3) {
      return id_break(var2) || id_class(var2);
   }

   public static boolean id_break(iB_2 var0) {
      return var0.SF().id_class(il_3.id_public);
   }

   protected void id_break(rrEm_1 var1, rsq_3 var2, long var3) {
      if (id_break(var2) || id_class(var2)) {
         iZ_2 var5 = var2.SF();
         if (!var5.id_byte(iq_3.id_catch)) {
            var5.id_break(il_3.id_this);
            var5.id_break(il_3.id_volatile);
            var5.id_break(il_3.id_final);
            var5.id_break(il_3.id_continue);
            var5.id_break(il_3.id_new);
         }

         var5.id_class(iq_3.id_catch);
      }
   }
}

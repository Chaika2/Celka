package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rPk_1 extends rPm_1<iB_2> {
   private long id_class;

   public rPk_1() {
      super(ImmutableMap.of(il_3.id_break, iC_2.VALUE_PRESENT, il_3.id_long, iC_2.REGISTERED));
   }

   @Override
   protected boolean id_class(long var1) {
      return false;
   }

   @Override
   protected boolean id_class(rrEm_1 var1, iB_2 var2, long var3) {
      Optional var5 = var2.SF().id_byte(il_3.id_break);
      if (!var5.isPresent()) {
         return false;
      } else {
         rfH_2 var6 = ((rfK_2)var5.get()).id_break();
         return var2.SF().id_byte(iq_3.id_throws) && var2.re() > (double)var6.c_() + 0.4 && var6.id_class(var2.Ps(), 1.14);
      }
   }

   @Override
   protected boolean id_class(rrEm_1 var1, iB_2 var2) {
      if (var2.Pm()) {
         return false;
      } else {
         iZ_2 var3 = var2.SF();
         rfK_2 var4 = var3.id_byte(il_3.id_break).get();
         if (var1.E() != var4.id_class()) {
            return false;
         } else {
            Optional var5 = var3.id_byte(il_3.id_long);
            if (var5.isPresent()) {
               long var6 = var1.r() - (Long)var5.get();
               if (var6 > 0L && var6 < 100L) {
                  return false;
               }
            }

            xc_3 var8 = var1.id_byte(var4.id_break());
            return var4.id_break().id_class(var2.Ps(), 2.0) && var8.id_break().id_class(rls_3.id_short) && !var8.id_byte(xb_3.id_final);
         }
      }
   }

   @Override
   protected void id_break(rrEm_1 var1, iB_2 var2, long var3) {
      if (var2.Sc()) {
         var2.SQ();
         this.id_class = var3 + 40L;
      }
   }

   @Override
   protected void id_protected(rrEm_1 var1, iB_2 var2, long var3) {
      if (var3 > this.id_class) {
         rrg_3.id_class(var1, var2, (rLq_1)null, (rLq_1)null);
         var2.id_case(var2.SF().id_byte(il_3.id_break).get().id_break());
      }
   }
}

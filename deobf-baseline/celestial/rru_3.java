package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.function.Predicate;

public class rru_3 extends rPm_1<iB_2> {
   private final il_3<rfK_2> id_class;
   private final Predicate<rRP> id_byte;

   public rru_3(rRP var1, il_3<rfK_2> var2) {
      super(ImmutableMap.of(var2, iC_2.VALUE_PRESENT));
      this.id_byte = var1.id_break();
      this.id_class = var2;
   }

   private boolean id_class(rrEm_1 var1, rfH_2 var2, iB_2 var3) {
      xc_3 var4 = var1.id_byte(var2);
      return var4.id_break().id_class(rls_3.id_short) && var4.id_byte(xb_3.id_final) && !var3.Sc();
   }

   private boolean id_class(rrEm_1 var1, rfH_2 var2) {
      return !var1.d().id_class(var2, this.id_byte);
   }

   @Override
   protected boolean id_class(rrEm_1 var1, iB_2 var2) {
      rfK_2 var3 = var2.SF().id_byte(this.id_class).get();
      return var1.E() == var3.id_class() && var3.id_break().id_class(var2.Ps(), 16.0);
   }

   @Override
   protected void id_protected(rrEm_1 var1, iB_2 var2, long var3) {
      iZ_2 var5 = var2.SF();
      rfK_2 var6 = var5.id_byte(this.id_class).get();
      rfH_2 var7 = var6.id_break();
      rrEm_1 var8 = var1.id_const().id_class(var6.id_class());
      if (var8 == null || this.id_class(var8, var7)) {
         var5.id_break(this.id_class);
      } else if (this.id_class(var8, var7, var2)) {
         var5.id_break(this.id_class);
         var1.d().id_break(var7);
         ruP_2.id_byte(var1, var7);
      }
   }
}

package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rrc_3 extends rPm_1<iB_2> {
   private final int id_class;
   private final int id_byte;
   private int id_protected;

   public rrc_3(int var1, int var2) {
      super(ImmutableMap.of(il_3.id_instanceof, iC_2.VALUE_PRESENT, il_3.id_throw, iC_2.VALUE_PRESENT));
      this.id_byte = var1 * 20;
      this.id_protected = 0;
      this.id_class = var2;
   }

   @Override
   protected void id_protected(rrEm_1 var1, iB_2 var2, long var3) {
      iZ_2 var5 = var2.SF();
      Optional var6 = var5.id_byte(il_3.id_throw);
      boolean var7 = (Long)var6.get() + 300L <= var3;
      if (this.id_protected <= this.id_byte && !var7) {
         rfH_2 var8 = var5.id_byte(il_3.id_instanceof).get().id_break();
         if (var8.id_class(var2.Bs(), (double)this.id_class)) {
            this.id_protected++;
         }
      } else {
         var5.id_break(il_3.id_throw);
         var5.id_break(il_3.id_instanceof);
         var5.id_class(var1.P(), var1.r());
         this.id_protected = 0;
      }
   }
}

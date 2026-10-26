package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rPz_1 extends rPm_1<rsq_3> {
   private final il_3<rfK_2> id_class;
   private final float id_byte;
   private final int id_protected;
   private final int id_throws;
   private final int id_case;

   public rPz_1(il_3<rfK_2> var1, float var2, int var3, int var4, int var5) {
      super(ImmutableMap.of(il_3.id_interface, iC_2.REGISTERED, il_3.id_volatile, iC_2.VALUE_ABSENT, var1, iC_2.VALUE_PRESENT));
      this.id_class = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
      this.id_case = var5;
   }

   private boolean id_class(rsq_3 var1, rfK_2 var2) {
      return var2.id_break().id_implements(var1.Bs()) > this.id_throws;
   }

   private boolean id_class(rrEm_1 var1, rfK_2 var2) {
      return var2.id_class() != var1.E();
   }

   private boolean id_class(rrEm_1 var1, rsq_3 var2, rfK_2 var3) {
      return var3.id_class() == var1.E() && var3.id_break().id_implements(var2.Bs()) <= this.id_protected;
   }

   private void id_class(rsq_3 var1, long var2) {
      iZ_2 var4 = var1.SF();
      var1.id_class(this.id_class);
      var4.id_break(this.id_class);
      var4.id_class(il_3.id_interface, var2);
   }

   protected void id_class(rrEm_1 var1, rsq_3 var2, long var3) {
      iZ_2 var5 = var2.SF();
      var5.id_byte(this.id_class).ifPresent(var6 -> {
         if (this.id_class(var1, var6) || this.id_class(var1, var2)) {
            this.id_class(var2, var3);
         } else if (this.id_class(var2, var6)) {
            rjU_2 var7 = null;
            int var8 = 0;

            for (short var9 = 1000; var8 < 1000 && (var7 == null || this.id_class(var2, rfK_2.id_class(var1.E(), new rfH_2(var7)))); var8++) {
               var7 = iX_2.id_break(var2, 15, 7, rjU_2.id_protected(var6.id_break()));
            }

            if (var8 == 1000) {
               this.id_class(var2, var3);
               return;
            }

            var5.id_class(il_3.id_volatile, new iH_2(var7, this.id_byte, this.id_protected));
         } else if (!this.id_class(var1, var2, var6)) {
            var5.id_class(il_3.id_volatile, new iH_2(var6.id_break(), this.id_byte, this.id_protected));
         }
      });
   }

   private boolean id_class(rrEm_1 var1, rsq_3 var2) {
      Optional var3 = var2.SF().id_byte(il_3.id_interface);
      return var3.isPresent() ? var1.r() - (Long)var3.get() > (long)this.id_case : false;
   }
}

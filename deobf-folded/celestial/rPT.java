package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rPT extends rPm_1<aA_2> {
   private final il_3<rfK_2> id_class;
   private final int id_byte;
   private final int id_protected;
   private final float id_throws;
   private long id_case;

   public rPT(il_3<rfK_2> var1, float var2, int var3, int var4) {
      super(ImmutableMap.of(il_3.id_volatile, iC_2.REGISTERED, var1, iC_2.VALUE_PRESENT));
      this.id_class = var1;
      this.id_throws = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   protected void id_class(rrEm_1 var1, aA_2 var2, long var3) {
      if (var3 > this.id_case) {
         iZ_2 var5 = var2.SF();
         Optional var6 = var5.id_byte(this.id_class);
         var6.ifPresent(var2x -> var5.id_class(il_3.id_volatile, new iH_2(var2x.id_break(), this.id_throws, this.id_byte)));
         this.id_case = var3 + 80L;
      }
   }

   protected boolean id_class(rrEm_1 var1, aA_2 var2) {
      Optional var3 = var2.SF().id_byte(this.id_class);
      return var3.isPresent() && var1.E() == ((rfK_2)var3.get()).id_class() && ((rfK_2)var3.get()).id_break().id_class(var2.Ps(), (double)this.id_protected);
   }
}

package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rPw_1 extends rPm_1<aA_2> {
   private final il_3<rfK_2> id_class;
   private long id_byte;
   private final int id_protected;
   private float id_throws;

   public rPw_1(il_3<rfK_2> var1, float var2, int var3) {
      super(ImmutableMap.of(il_3.id_volatile, iC_2.REGISTERED, var1, iC_2.VALUE_PRESENT));
      this.id_class = var1;
      this.id_throws = var2;
      this.id_protected = var3;
   }

   protected void id_class(rrEm_1 var1, aA_2 var2, long var3) {
      if (var3 > this.id_byte) {
         Optional var5 = Optional.ofNullable(iX_2.id_break(var2, 8, 6));
         var2.SF().id_class(il_3.id_volatile, var5.map(var1x -> new iH_2(var1x, this.id_throws, 1)));
         this.id_byte = var3 + 180L;
      }
   }

   protected boolean id_class(rrEm_1 var1, aA_2 var2) {
      Optional var3 = var2.SF().id_byte(this.id_class);
      return var3.isPresent() && var1.E() == ((rfK_2)var3.get()).id_class() && ((rfK_2)var3.get()).id_break().id_class(var2.Ps(), (double)this.id_protected);
   }
}

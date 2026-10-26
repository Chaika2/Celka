package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rPC extends rPm_1<aA_2> {
   private final float id_class;
   private final int id_byte;
   private final int id_protected;

   public rPC(float var1) {
      this(var1, 10, 7);
   }

   public rPC(float var1, int var2, int var3) {
      super(ImmutableMap.of(il_3.id_volatile, iC_2.VALUE_ABSENT));
      this.id_class = var1;
      this.id_byte = var2;
      this.id_protected = var3;
   }

   protected void id_class(rrEm_1 var1, aA_2 var2, long var3) {
      Optional var5 = Optional.ofNullable(iX_2.id_break(var2, this.id_byte, this.id_protected));
      var2.SF().id_class(il_3.id_volatile, var5.map(var1x -> new iH_2(var1x, this.id_class, 0)));
   }
}

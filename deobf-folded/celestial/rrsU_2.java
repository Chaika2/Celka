package celestial;

import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public final class rrsU_2 extends rrsj_3<rrsU_2> {
   int id_break;
   final Long2IntOpenHashMap id_byte;

   public rrsU_2(Long2ObjectOpenHashMap<roH_2> var1, Long2IntOpenHashMap var2, int var3) {
      super(var1);
      this.id_byte = var2;
      var2.defaultReturnValue(var3);
      this.id_break = var3;
   }

   public rrsU_2 id_class() {
      return new rrsU_2(this.id_class.clone(), this.id_byte.clone(), this.id_break);
   }
}

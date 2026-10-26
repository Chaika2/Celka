package celestial;

import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public final class rrsU_2 extends rrsj_3<rrsU_2> {
   int break_;
   final Long2IntOpenHashMap byte_;

   public rrsU_2(Long2ObjectOpenHashMap<roH_2> var1, Long2IntOpenHashMap var2, int var3) {
      super(var1);
      this.byte_ = var2;
      var2.defaultReturnValue(var3);
      this.break_ = var3;
   }

   public rrsU_2 class_() {
      return new rrsU_2(this.class_.clone(), this.byte_.clone(), this.break_);
   }
}

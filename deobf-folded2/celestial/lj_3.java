package celestial;

import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;

class lj_3 extends Long2FloatLinkedOpenHashMap {
   lj_3(lI_2 var1, int var2, float var3) {
      super(var2, var3);
      this.id_class = var1;
   }

   protected void rehash(int var1) {
   }
}

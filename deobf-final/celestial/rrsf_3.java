package celestial;

import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;

class rrsf_3 extends Long2ByteOpenHashMap {
   rrsf_3(rrsw_3 var1, int var2, float var3, int var4) {
      super(var2, var3);
      this.break_ = var1;
      this.class_ = var4;
   }

   protected void rehash(int var1) {
      if (var1 > this.class_) {
         super.rehash(var1);
      }
   }
}

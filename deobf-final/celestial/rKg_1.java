package celestial;

import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;

public final class rKg_1 implements rKj_1 {
   private final rrBw_1 class_;
   private final Long2IntLinkedOpenHashMap break_;
   private final int byte_;

   public rKg_1(Long2IntLinkedOpenHashMap var1, int var2, rrBw_1 var3) {
      this.break_ = var1;
      this.byte_ = var2;
      this.class_ = var3;
   }

   @Override
   public int class_(int var1, int var2) {
      long var3 = rfj_3.class_(var1, var2);
      synchronized (this.break_) {
         int var6 = this.break_.get(var3);
         if (var6 != Integer.MIN_VALUE) {
            return var6;
         } else {
            int var7 = this.class_.apply(var1, var2);
            this.break_.put(var3, var7);
            if (this.break_.size() > this.byte_) {
               for (int var8 = 0; var8 < this.byte_ / 16; var8++) {
                  this.break_.removeFirstInt();
               }
            }

            return var7;
         }
      }
   }

   public int class_() {
      return this.byte_;
   }
}

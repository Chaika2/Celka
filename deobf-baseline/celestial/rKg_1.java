package celestial;

import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;

public final class rKg_1 implements rKj_1 {
   private final rrBw_1 id_class;
   private final Long2IntLinkedOpenHashMap id_break;
   private final int id_byte;

   public rKg_1(Long2IntLinkedOpenHashMap var1, int var2, rrBw_1 var3) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_class = var3;
   }

   @Override
   public int id_class(int var1, int var2) {
      long var3 = rfj_3.id_class(var1, var2);
      synchronized (this.id_break) {
         int var6 = this.id_break.get(var3);
         if (var6 != Integer.MIN_VALUE) {
            return var6;
         } else {
            int var7 = this.id_class.apply(var1, var2);
            this.id_break.put(var3, var7);
            if (this.id_break.size() > this.id_byte) {
               for (int var8 = 0; var8 < this.id_byte / 16; var8++) {
                  this.id_break.removeFirstInt();
               }
            }

            return var7;
         }
      }
   }

   public int id_class() {
      return this.id_byte;
   }
}

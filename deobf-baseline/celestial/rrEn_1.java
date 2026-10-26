package celestial;

import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectSet;

class rrEn_1 extends rod_3 {
   protected final Long2ByteMap id_class;
   protected final int id_break;

   @Override
   protected int id_byte(long var1) {
      return this.id_class.get(var1);
   }

   protected rrEn_1(rrEL var1, int var2) {
      super(var2 + 2, 2048, 2048);
      this.id_byte = var1;
      this.id_class = new Long2ByteOpenHashMap();
      this.id_break = var2;
      this.id_class.defaultReturnValue((byte)(var2 + 2));
   }

   @Override
   protected void id_class(long var1, int var3, int var4) {
   }

   public void id_class() {
      this.id_class(Integer.MAX_VALUE);
   }

   @Override
   protected void id_class(long var1, int var3) {
      byte var4;
      if (var3 > this.id_break) {
         var4 = this.id_class.remove(var1);
      } else {
         var4 = this.id_class.put(var1, (byte)var3);
      }

      this.id_class(var1, var4, var3);
   }

   @Override
   protected int id_break(long var1) {
      return this.id_protected(var1) ? 0 : Integer.MAX_VALUE;
   }

   private boolean id_protected(long var1) {
      ObjectSet var3 = (ObjectSet)this.id_byte.id_byte.get(var1);
      return var3 != null && !var3.isEmpty();
   }
}

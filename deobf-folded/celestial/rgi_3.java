package celestial;

import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;

final class rgi_3 extends rqz_3 {
   private final Long2ByteMap id_break;

   @Override
   protected int id_byte(long var1) {
      return this.id_break.get(var1);
   }

   protected rgi_3(rga_3 var1) {
      super(7, 16, 256);
      this.id_class = var1;
      this.id_break = new Long2ByteOpenHashMap();
      this.id_break.defaultReturnValue((byte)7);
   }

   @Override
   protected void id_class(long var1, int var3) {
      if (var3 > 6) {
         this.id_break.remove(var1);
      } else {
         this.id_break.put(var1, (byte)var3);
      }
   }

   public void id_class() {
      super.id_class(Integer.MAX_VALUE);
   }

   @Override
   protected int id_break(long var1) {
      return this.id_class.id_case(var1) ? 0 : 7;
   }
}

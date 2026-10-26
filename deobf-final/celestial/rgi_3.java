package celestial;

import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;

final class rgi_3 extends rqz_3 {
   private final Long2ByteMap break_;

   @Override
   protected int byte_(long var1) {
      return this.break_.get(var1);
   }

   protected rgi_3(rga_3 var1) {
      super(7, 16, 256);
      this.class_ = var1;
      this.break_ = new Long2ByteOpenHashMap();
      this.break_.defaultReturnValue((byte)7);
   }

   @Override
   protected void class_(long var1, int var3) {
      if (var3 > 6) {
         this.break_.remove(var1);
      } else {
         this.break_.put(var1, (byte)var3);
      }
   }

   public void class_() {
      super.class_(Integer.MAX_VALUE);
   }

   @Override
   protected int break_(long var1) {
      return this.class_.case_(var1) ? 0 : 7;
   }
}

package celestial;

import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectSet;

class rrEn_1 extends rod_3 {
   protected final Long2ByteMap class_;
   protected final int break_;

   @Override
   protected int byte_(long var1) {
      return this.class_.get(var1);
   }

   protected rrEn_1(rrEL var1, int var2) {
      super(var2 + 2, 2048, 2048);
      this.byte_ = var1;
      this.class_ = new Long2ByteOpenHashMap();
      this.break_ = var2;
      this.class_.defaultReturnValue((byte)(var2 + 2));
   }

   @Override
   protected void class_(long var1, int var3, int var4) {
   }

   public void class_() {
      this.class_(Integer.MAX_VALUE);
   }

   @Override
   protected void class_(long var1, int var3) {
      byte var4;
      if (var3 > this.break_) {
         var4 = this.class_.remove(var1);
      } else {
         var4 = this.class_.put(var1, (byte)var3);
      }

      this.class_(var1, var4, var3);
   }

   @Override
   protected int break_(long var1) {
      return this.protected_(var1) ? 0 : Integer.MAX_VALUE;
   }

   private boolean protected_(long var1) {
      ObjectSet var3 = (ObjectSet)this.byte_.byte_.get(var1);
      return var3 != null && !var3.isEmpty();
   }
}

package celestial;

import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntMaps;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ByteMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

class rrEC extends rrEn_1 {
   private int throws_;
   private final Long2IntMap case_;
   private final LongSet catch_;

   private boolean byte_(int var1) {
      return var1 <= this.throws_ - 2;
   }

   protected rrEC(rrEL var1, int var2) {
      super(var1, var2);
      this.protected_ = var1;
      this.case_ = Long2IntMaps.synchronize(new Long2IntOpenHashMap());
      this.catch_ = new LongOpenHashSet();
      this.throws_ = 0;
      this.case_.defaultReturnValue(var2 + 2);
   }

   @Override
   protected void class_(long var1, int var3, int var4) {
      this.catch_.add(var1);
   }

   @Override
   public void class_() {
      super.class_();
      if (!this.catch_.isEmpty()) {
         LongIterator var1 = this.catch_.iterator();

         while (var1.hasNext()) {
            long var2 = var1.nextLong();
            int var4 = this.case_.get(var2);
            int var5 = this.byte_(var2);
            if (var4 != var5) {
               this.protected_.implements_.class_(new rfj_3(var2), () -> this.case_.get(var2), var5, var3 -> {
                  if (var3 >= this.case_.defaultReturnValue()) {
                     this.case_.remove(var2);
                  } else {
                     this.case_.put(var2, var3);
                  }
               });
               this.class_(var2, var5, this.byte_(var4), this.byte_(var5));
            }
         }

         this.catch_.clear();
      }
   }

   private void class_(long var1, int var3, boolean var4, boolean var5) {
      if (var4 != var5) {
         rrEF var6 = new rrEF<>(rrEl_1.byte_, rrEL.break_, new rfj_3(var1));
         if (var5) {
            this.protected_.finally_.class_(roF_2.class_(() -> this.protected_.volatile_.execute(() -> {
                  if (this.byte_(this.byte_(var1))) {
                     this.protected_.class_(var1, var6);
                     this.protected_.native_.add(var1);
                  } else {
                     this.protected_.extends_.class_(roF_2.class_(() -> {
                     }, var1, false));
                  }
               }), var1, () -> var3));
         } else {
            this.protected_.extends_.class_(roF_2.class_(() -> this.protected_.volatile_.execute(() -> this.protected_.break_(var1, var6)), var1, true));
         }
      }
   }

   @Override
   public void break_(int var1) {
      ObjectIterator var2 = this.class_.long2ByteEntrySet().iterator();

      while (var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         byte var4 = var3.getByteValue();
         long var5 = var3.getLongKey();
         this.class_(var5, var4, this.byte_(var4), var4 <= var1 - 2);
      }

      this.throws_ = var1;
   }
}

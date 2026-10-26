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
   private int id_throws;
   private final Long2IntMap id_case;
   private final LongSet id_catch;

   private boolean id_byte(int var1) {
      return var1 <= this.id_throws - 2;
   }

   protected rrEC(rrEL var1, int var2) {
      super(var1, var2);
      this.id_protected = var1;
      this.id_case = Long2IntMaps.synchronize(new Long2IntOpenHashMap());
      this.id_catch = new LongOpenHashSet();
      this.id_throws = 0;
      this.id_case.defaultReturnValue(var2 + 2);
   }

   @Override
   protected void id_class(long var1, int var3, int var4) {
      this.id_catch.add(var1);
   }

   @Override
   public void id_class() {
      super.id_class();
      if (!this.id_catch.isEmpty()) {
         LongIterator var1 = this.id_catch.iterator();

         while (var1.hasNext()) {
            long var2 = var1.nextLong();
            int var4 = this.id_case.get(var2);
            int var5 = this.id_byte(var2);
            if (var4 != var5) {
               this.id_protected.id_implements.id_class(new rfj_3(var2), () -> this.id_case.get(var2), var5, var3 -> {
                  if (var3 >= this.id_case.defaultReturnValue()) {
                     this.id_case.remove(var2);
                  } else {
                     this.id_case.put(var2, var3);
                  }
               });
               this.id_class(var2, var5, this.id_byte(var4), this.id_byte(var5));
            }
         }

         this.id_catch.clear();
      }
   }

   private void id_class(long var1, int var3, boolean var4, boolean var5) {
      if (var4 != var5) {
         rrEF var6 = new rrEF<>(rrEl_1.id_byte, rrEL.id_break, new rfj_3(var1));
         if (var5) {
            this.id_protected.id_finally.id_class(roF_2.id_class(() -> this.id_protected.id_volatile.execute(() -> {
                  if (this.id_byte(this.id_byte(var1))) {
                     this.id_protected.id_class(var1, var6);
                     this.id_protected.id_native.add(var1);
                  } else {
                     this.id_protected.id_extends.id_class(roF_2.id_class(() -> {
                     }, var1, false));
                  }
               }), var1, () -> var3));
         } else {
            this.id_protected
               .id_extends
               .id_class(roF_2.id_class(() -> this.id_protected.id_volatile.execute(() -> this.id_protected.id_break(var1, var6)), var1, true));
         }
      }
   }

   @Override
   public void id_break(int var1) {
      ObjectIterator var2 = this.id_class.long2ByteEntrySet().iterator();

      while (var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         byte var4 = var3.getByteValue();
         long var5 = var3.getLongKey();
         this.id_class(var5, var4, this.id_byte(var4), var4 <= var1 - 2);
      }

      this.id_throws = var1;
   }
}

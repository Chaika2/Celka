package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntIterator;
import it.unimi.dsi.fastutil.ints.IntSet;

public abstract class rrWy_1<T> {
   private final int class_;
   private long break_;
   private Int2ObjectOpenHashMap<rrWp_1<T>> byte_ = new Int2ObjectOpenHashMap();

   public rrWy_1(int var1) {
      this.class_ = var1;
   }

   public T class_(int var1) {
      long var2 = System.currentTimeMillis();
      if (!this.byte_.isEmpty() && var2 >= this.break_) {
         this.break_ = var2 + (long)this.class_;
         long var4 = var2 - (long)this.class_;
         IntSet var6 = this.byte_.keySet();
         IntIterator var7 = var6.iterator();

         while (var7.hasNext()) {
            int var8 = var7.nextInt();
            if (var8 != var1) {
               rrWp_1 var9 = (rrWp_1)this.byte_.get(var8);
               if (var9.break_() <= var4) {
                  var7.remove();
               }
            }
         }
      }

      rrWp_1 var10 = (rrWp_1)this.byte_.get(var1);
      if (var10 == null) {
         Object var5 = this.break_();
         var10 = new rrWp_1<>(var5);
         this.byte_.put(var1, var10);
      }

      var10.class_(var2);
      return (T)var10.class_();
   }

   protected abstract T break_();
}

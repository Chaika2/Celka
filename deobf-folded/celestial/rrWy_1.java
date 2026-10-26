package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntIterator;
import it.unimi.dsi.fastutil.ints.IntSet;

public abstract class rrWy_1<T> {
   private final int id_class;
   private long id_break;
   private Int2ObjectOpenHashMap<rrWp_1<T>> id_byte = new Int2ObjectOpenHashMap();

   public rrWy_1(int var1) {
      this.id_class = var1;
   }

   public T id_class(int var1) {
      long var2 = System.currentTimeMillis();
      if (!this.id_byte.isEmpty() && var2 >= this.id_break) {
         this.id_break = var2 + (long)this.id_class;
         long var4 = var2 - (long)this.id_class;
         IntSet var6 = this.id_byte.keySet();
         IntIterator var7 = var6.iterator();

         while (var7.hasNext()) {
            int var8 = var7.nextInt();
            if (var8 != var1) {
               rrWp_1 var9 = (rrWp_1)this.id_byte.get(var8);
               if (var9.id_break() <= var4) {
                  var7.remove();
               }
            }
         }
      }

      rrWp_1 var10 = (rrWp_1)this.id_byte.get(var1);
      if (var10 == null) {
         Object var5 = this.id_break();
         var10 = new rrWp_1<>(var5);
         this.id_byte.put(var1, var10);
      }

      var10.id_class(var2);
      return (T)var10.id_class();
   }

   protected abstract T id_break();
}

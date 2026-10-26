package celestial;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public abstract class rrsj_3<M extends rrsj_3<M>> {
   private final long[] id_break = new long[2];
   private final roH_2[] id_byte = new roH_2[2];
   private boolean id_protected;
   protected final Long2ObjectOpenHashMap<roH_2> id_class;

   public roH_2 id_byte(long var1) {
      if (this.id_protected) {
         for (int var3 = 0; var3 < 2; var3++) {
            if (var1 == this.id_break[var3]) {
               return this.id_byte[var3];
            }
         }
      }

      roH_2 var5 = (roH_2)this.id_class.get(var1);
      if (var5 == null) {
         return null;
      } else {
         if (this.id_protected) {
            for (int var4 = 1; var4 > 0; var4--) {
               this.id_break[var4] = this.id_break[var4 - 1];
               this.id_byte[var4] = this.id_byte[var4 - 1];
            }

            this.id_break[0] = var1;
            this.id_byte[0] = var5;
         }

         return var5;
      }
   }

   public void id_byte() {
      for (int var1 = 0; var1 < 2; var1++) {
         this.id_break[var1] = Long.MAX_VALUE;
         this.id_byte[var1] = null;
      }
   }

   protected rrsj_3(Long2ObjectOpenHashMap<roH_2> var1) {
      this.id_class = var1;
      this.id_byte();
      this.id_protected = true;
   }

   public void id_class(long var1, roH_2 var3) {
      this.id_class.put(var1, var3);
   }

   public void id_class(long var1) {
      this.id_class.put(var1, ((roH_2)this.id_class.get(var1)).id_break());
      this.id_byte();
   }

   public boolean id_break(long var1) {
      return this.id_class.containsKey(var1);
   }

   public abstract M id_break();

   public roH_2 id_protected(long var1) {
      return (roH_2)this.id_class.remove(var1);
   }

   public void id_protected() {
      this.id_protected = false;
   }
}

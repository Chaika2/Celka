package celestial;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public abstract class rrsj_3<M extends rrsj_3<M>> {
   private final long[] break_ = new long[2];
   private final roH_2[] byte_ = new roH_2[2];
   private boolean protected_;
   protected final Long2ObjectOpenHashMap<roH_2> class_;

   public roH_2 byte_(long var1) {
      if (this.protected_) {
         for (int var3 = 0; var3 < 2; var3++) {
            if (var1 == this.break_[var3]) {
               return this.byte_[var3];
            }
         }
      }

      roH_2 var5 = (roH_2)this.class_.get(var1);
      if (var5 == null) {
         return null;
      } else {
         if (this.protected_) {
            for (int var4 = 1; var4 > 0; var4--) {
               this.break_[var4] = this.break_[var4 - 1];
               this.byte_[var4] = this.byte_[var4 - 1];
            }

            this.break_[0] = var1;
            this.byte_[0] = var5;
         }

         return var5;
      }
   }

   public void byte_() {
      for (int var1 = 0; var1 < 2; var1++) {
         this.break_[var1] = Long.MAX_VALUE;
         this.byte_[var1] = null;
      }
   }

   protected rrsj_3(Long2ObjectOpenHashMap<roH_2> var1) {
      this.class_ = var1;
      this.byte_();
      this.protected_ = true;
   }

   public void class_(long var1, roH_2 var3) {
      this.class_.put(var1, var3);
   }

   public void class_(long var1) {
      this.class_.put(var1, ((roH_2)this.class_.get(var1)).break_());
      this.byte_();
   }

   public boolean break_(long var1) {
      return this.class_.containsKey(var1);
   }

   public abstract M break_();

   public roH_2 protected_(long var1) {
      return (roH_2)this.class_.remove(var1);
   }

   public void protected_() {
      this.protected_ = false;
   }
}

package celestial;

import java.util.concurrent.atomic.AtomicReferenceArray;

final class Ah_1 {
   final AtomicReferenceArray<roJ_2> break_;
   final int byte_;
   private final int protected_;
   volatile int throws_;
   volatile int case_;
   int catch_;

   public int byte_() {
      return this.byte_;
   }

   Ah_1(AO var1, int var2) {
      this.class_ = var1;
      this.byte_ = var2;
      this.protected_ = var2 * 2 + 1;
      this.break_ = new AtomicReferenceArray<>(this.protected_ * this.protected_);
   }

   public void class_(Ah_1 var1) {
      this.throws_ = var1.class_();
      this.case_ = var1.break_();
      AtomicReferenceArray var2 = var1.protected_();

      for (int var3 = 0; var3 < var2.length(); var3++) {
         roJ_2 var4 = (roJ_2)var2.get(var3);
         if (var4 != null) {
            rfj_3 var5 = var4.private_();
            if (this.break_(var5.break_, var5.byte_)) {
               int var6 = this.class_(var5.break_, var5.byte_);
               if (this.break_.get(var6) != null) {
                  throw new IllegalStateException("Doing this would mutate the client's REAL loaded chunks?!");
               }

               this.class_(var6, var4);
            }
         }
      }
   }

   public int class_() {
      return this.throws_;
   }

   protected roJ_2 class_(int var1) {
      return this.break_.get(var1);
   }

   int class_(int var1, int var2) {
      return Math.floorMod(var2, this.protected_) * this.protected_ + Math.floorMod(var1, this.protected_);
   }

   protected roJ_2 class_(int var1, roJ_2 var2, roJ_2 var3) {
      if (this.break_.compareAndSet(var1, var2, var3) && var3 == null) {
         this.catch_--;
      }

      this.class_.throws_.class_(var2);
      return var2;
   }

   protected void class_(int var1, roJ_2 var2) {
      roJ_2 var3 = this.break_.getAndSet(var1, var2);
      if (var3 != null) {
         this.catch_--;
         this.class_.throws_.class_(var3);
      }

      if (var2 != null) {
         this.catch_++;
      }
   }

   boolean break_(int var1, int var2) {
      return Math.abs(var1 - this.throws_) <= this.byte_ && Math.abs(var2 - this.case_) <= this.byte_;
   }

   public int break_() {
      return this.case_;
   }

   public AtomicReferenceArray<roJ_2> protected_() {
      return this.break_;
   }
}

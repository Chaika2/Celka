package celestial;

import com.google.common.collect.AbstractIterator;

class rfp_3 extends AbstractIterator<rfH_2> {
   private final rfw_3 private_;
   private int implements_;
   private int finally_;
   private int extends_;
   private int native_;
   private int volatile_;
   private boolean final_;

   rfp_3(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
      this.case_ = var6;
      this.catch_ = var7;
      this.private_ = new rfw_3();
   }

   protected rfH_2 class_() {
      if (this.final_) {
         this.final_ = false;
         this.private_.c_(this.class_ - (this.private_.d_() - this.class_));
         return this.private_;
      } else {
         rfw_3 var1;
         for (var1 = null; var1 == null; this.volatile_++) {
            if (this.volatile_ > this.extends_) {
               this.native_++;
               if (this.native_ > this.finally_) {
                  this.implements_++;
                  if (this.implements_ > this.break_) {
                     return (rfH_2)this.endOfData();
                  }

                  this.finally_ = Math.min(this.byte_, this.implements_);
                  this.native_ = -this.finally_;
               }

               this.extends_ = Math.min(this.protected_, this.implements_ - Math.abs(this.native_));
               this.volatile_ = -this.extends_;
            }

            int var2 = this.native_;
            int var3 = this.volatile_;
            int var4 = this.implements_ - Math.abs(var2) - Math.abs(var3);
            if (var4 <= this.throws_) {
               this.final_ = var4 != 0;
               var1 = this.private_.class_(this.case_ + var2, this.catch_ + var3, this.class_ + var4);
            }
         }

         return var1;
      }
   }
}

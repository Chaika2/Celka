package celestial;

import com.google.common.collect.AbstractIterator;

class rfq_3 extends AbstractIterator<rfH_2> {
   private final rfw_3 catch_;
   private int private_;

   rfq_3(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
      this.case_ = var6;
      this.catch_ = new rfw_3();
   }

   protected rfH_2 class_() {
      if (this.private_ == this.class_) {
         return (rfH_2)this.endOfData();
      } else {
         int var1 = this.private_ % this.break_;
         int var2 = this.private_ / this.break_;
         int var3 = var2 % this.byte_;
         int var4 = var2 / this.byte_;
         this.private_++;
         return this.catch_.class_(this.protected_ + var1, this.throws_ + var3, this.case_ + var4);
      }
   }
}

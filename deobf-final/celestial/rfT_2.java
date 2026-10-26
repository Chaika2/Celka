package celestial;

import com.google.common.collect.AbstractIterator;

class rfT_2 extends AbstractIterator<rfw_3> {
   private final rpr_3[] throws_;
   private final rfw_3 case_;
   private final int catch_;
   private int private_;
   private int implements_;
   private int finally_;
   private int extends_;
   private int native_;
   private int volatile_;

   rfT_2(rpr_3 var1, rpr_3 var2, rfH_2 var3, int var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = new rpr_3[]{this.class_, this.break_, this.class_.case_(), this.break_.case_()};
      this.case_ = this.byte_.new_().class_(this.break_);
      this.catch_ = 4 * this.protected_;
      this.private_ = -1;
      this.extends_ = this.case_.b_();
      this.native_ = this.case_.c_();
      this.volatile_ = this.case_.d_();
   }

   protected rfw_3 class_() {
      this.case_.class_(this.extends_, this.native_, this.volatile_).class_(this.throws_[(this.private_ + 4) % 4]);
      this.extends_ = this.case_.b_();
      this.native_ = this.case_.c_();
      this.volatile_ = this.case_.d_();
      if (this.finally_ >= this.implements_) {
         if (this.private_ >= this.catch_) {
            return (rfw_3)this.endOfData();
         }

         this.private_++;
         this.finally_ = 0;
         this.implements_ = this.private_ / 2 + 1;
      }

      this.finally_++;
      return this.case_;
   }
}

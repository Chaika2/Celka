package celestial;

import com.google.common.collect.AbstractIterator;

class rrbP_2 extends AbstractIterator {
   private rrGi_1 break_;

   rrbP_2(rrbr_3 var1) {
      this.class_ = var1;
      this.break_ = null;
   }

   protected Object computeNext() {
      if (this.break_ == null) {
         this.break_ = new rrGi_1(this.class_.class_.b_(), this.class_.class_.c_(), this.class_.class_.d_(), 3);
         return this.break_;
      } else if (this.break_.equals(this.class_.break_)) {
         return (rrGi_1)this.endOfData();
      } else {
         int var1 = this.break_.b_();
         int var2 = this.break_.c_();
         int var3 = this.break_.d_();
         if (var1 < this.class_.break_.b_()) {
            var1++;
         } else if (var3 < this.class_.break_.d_()) {
            var1 = this.class_.class_.b_();
            var3++;
         } else if (var2 < this.class_.break_.c_()) {
            var1 = this.class_.class_.b_();
            var3 = this.class_.class_.d_();
            var2++;
         }

         this.break_.class_(var1, var2, var3);
         return this.break_;
      }
   }
}

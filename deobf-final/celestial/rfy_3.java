package celestial;

import com.google.common.collect.AbstractIterator;
import java.util.Random;

class rfy_3 extends AbstractIterator<rfH_2> {
   final rfw_3 class_;
   int break_;

   rfy_3(int var1, int var2, Random var3, int var4, int var5, int var6, int var7, int var8) {
      this.byte_ = var1;
      this.protected_ = var2;
      this.throws_ = var3;
      this.case_ = var4;
      this.catch_ = var5;
      this.private_ = var6;
      this.implements_ = var7;
      this.finally_ = var8;
      this.class_ = new rfw_3();
      this.break_ = this.byte_;
   }

   protected rfH_2 class_() {
      if (this.break_ <= 0) {
         return (rfH_2)this.endOfData();
      } else {
         rfw_3 var1 = this.class_
            .class_(
               this.protected_ + this.throws_.nextInt(this.case_),
               this.catch_ + this.throws_.nextInt(this.private_),
               this.implements_ + this.throws_.nextInt(this.finally_)
            );
         this.break_--;
         return var1;
      }
   }
}

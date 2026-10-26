package celestial;

import com.google.common.collect.AbstractIterator;

class rrbP_2 extends AbstractIterator {
   private rrGi_1 id_break;

   rrbP_2(rrbr_3 var1) {
      this.id_class = var1;
      this.id_break = null;
   }

   protected Object computeNext() {
      if (this.id_break == null) {
         this.id_break = new rrGi_1(this.id_class.id_class.b_(), this.id_class.id_class.c_(), this.id_class.id_class.d_(), 3);
         return this.id_break;
      } else if (this.id_break.equals(this.id_class.id_break)) {
         return (rrGi_1)this.endOfData();
      } else {
         int var1 = this.id_break.b_();
         int var2 = this.id_break.c_();
         int var3 = this.id_break.d_();
         if (var1 < this.id_class.id_break.b_()) {
            var1++;
         } else if (var3 < this.id_class.id_break.d_()) {
            var1 = this.id_class.id_class.b_();
            var3++;
         } else if (var2 < this.id_class.id_break.c_()) {
            var1 = this.id_class.id_class.b_();
            var3 = this.id_class.id_class.d_();
            var2++;
         }

         this.id_break.id_class(var1, var2, var3);
         return this.id_break;
      }
   }
}

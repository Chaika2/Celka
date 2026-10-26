package celestial;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;

public class rWG<C extends rXu_1> extends rWE<C> {
   private boolean throws_;

   public rWG(rJI<C> var1) {
      super(var1);
   }

   protected void class_(int var1, IntList var2) {
      IntListIterator var3 = var2.iterator();
      rJY var4 = this.protected_.class_(0);
      rdn_3 var5 = rWr_1.class_((Integer)var3.next());
      if (!var5.class_()) {
         int var6 = Math.min(var5.byte_(), var1);
         if (this.throws_) {
            var6 -= var4.class_().char_();
         }

         for (int var7 = 0; var7 < var6; var7++) {
            this.class_(var4, var5);
         }
      }
   }

   @Override
   protected void class_() {
      this.class_(this.protected_.break_());
      super.class_();
   }

   @Override
   protected void class_(rkw_3<C> var1, boolean var2) {
      this.throws_ = this.protected_.class_(var1);
      int var3 = this.break_.break_(var1, (IntList)null);
      if (this.throws_) {
         rdn_3 var4 = this.protected_.class_(0).class_();
         if (var4.class_() || var3 <= var4.char_()) {
            return;
         }
      }

      int var6 = this.class_(var2, var3, this.throws_);
      IntArrayList var5 = new IntArrayList();
      if (this.break_.class_(var1, var5, var6)) {
         if (!this.throws_) {
            this.class_(this.protected_.break_());
            this.class_(0);
         }

         this.class_(var6, var5);
      }
   }
}

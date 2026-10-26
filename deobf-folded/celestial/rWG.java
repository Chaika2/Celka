package celestial;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;

public class rWG<C extends rXu_1> extends rWE<C> {
   private boolean id_throws;

   public rWG(rJI<C> var1) {
      super(var1);
   }

   protected void id_class(int var1, IntList var2) {
      IntListIterator var3 = var2.iterator();
      rJY var4 = this.id_protected.id_class(0);
      rdn_3 var5 = rWr_1.id_class((Integer)var3.next());
      if (!var5.id_class()) {
         int var6 = Math.min(var5.id_byte(), var1);
         if (this.id_throws) {
            var6 -= var4.id_class().id_char();
         }

         for (int var7 = 0; var7 < var6; var7++) {
            this.id_class(var4, var5);
         }
      }
   }

   @Override
   protected void id_class() {
      this.id_class(this.id_protected.id_break());
      super.id_class();
   }

   @Override
   protected void id_class(rkw_3<C> var1, boolean var2) {
      this.id_throws = this.id_protected.id_class(var1);
      int var3 = this.id_break.id_break(var1, (IntList)null);
      if (this.id_throws) {
         rdn_3 var4 = this.id_protected.id_class(0).id_class();
         if (var4.id_class() || var3 <= var4.id_char()) {
            return;
         }
      }

      int var6 = this.id_class(var2, var3, this.id_throws);
      IntArrayList var5 = new IntArrayList();
      if (this.id_break.id_class(var1, var5, var6)) {
         if (!this.id_throws) {
            this.id_class(this.id_protected.id_break());
            this.id_class(0);
         }

         this.id_class(var6, var5);
      }
   }
}

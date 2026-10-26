package celestial;

import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntList;

public class rWr_1 {
   public final Int2IntMap class_ = new Int2IntOpenHashMap();

   public static int byte_(rdn_3 var0) {
      return rVL.for_.class_(var0.break_());
   }

   public void class_() {
      this.class_.clear();
   }

   public boolean class_(rkw_3<?> var1, IntList var2) {
      return this.class_(var1, var2, 1);
   }

   public boolean class_(rkw_3<?> var1, IntList var2, int var3) {
      return new rWP(this, var1).class_(var3, var2);
   }

   public int class_(rkw_3<?> var1, int var2, IntList var3) {
      return new rWP(this, var1).break_(var2, var3);
   }

   public static rdn_3 class_(int var0) {
      return var0 == 0 ? rdn_3.break_ : new rdn_3(rdb_3.break_(var0));
   }

   public void class_(rdn_3 var1) {
      if (!var1.case_() && !var1.public_() && !var1.this_()) {
         this.break_(var1);
      }
   }

   public void class_(rdn_3 var1, int var2) {
      if (!var1.class_()) {
         int var3 = byte_(var1);
         int var4 = Math.min(var2, var1.char_());
         this.break_(var3, var4);
      }
   }

   int class_(int var1, int var2) {
      int var3 = this.class_.get(var1);
      if (var3 >= var2) {
         this.class_.put(var1, var3 - var2);
         return var1;
      } else {
         return 0;
      }
   }

   void break_(int var1, int var2) {
      this.class_.put(var1, this.class_.get(var1) + var2);
   }

   public void break_(rdn_3 var1) {
      this.class_(var1, 64);
   }

   public int break_(rkw_3<?> var1, IntList var2) {
      return this.class_(var1, Integer.MAX_VALUE, var2);
   }

   boolean break_(int var1) {
      return this.class_.get(var1) > 0;
   }
}

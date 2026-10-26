package celestial;

import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntList;

public class rWr_1 {
   public final Int2IntMap id_class = new Int2IntOpenHashMap();

   public static int id_byte(rdn_3 var0) {
      return rVL.id_for.id_class(var0.id_break());
   }

   public void id_class() {
      this.id_class.clear();
   }

   public boolean id_class(rkw_3<?> var1, IntList var2) {
      return this.id_class(var1, var2, 1);
   }

   public boolean id_class(rkw_3<?> var1, IntList var2, int var3) {
      return new rWP(this, var1).id_class(var3, var2);
   }

   public int id_class(rkw_3<?> var1, int var2, IntList var3) {
      return new rWP(this, var1).id_break(var2, var3);
   }

   public static rdn_3 id_class(int var0) {
      return var0 == 0 ? rdn_3.id_break : new rdn_3(rdb_3.id_break(var0));
   }

   public void id_class(rdn_3 var1) {
      if (!var1.id_case() && !var1.id_public() && !var1.id_this()) {
         this.id_break(var1);
      }
   }

   public void id_class(rdn_3 var1, int var2) {
      if (!var1.id_class()) {
         int var3 = id_byte(var1);
         int var4 = Math.min(var2, var1.id_char());
         this.id_break(var3, var4);
      }
   }

   int id_class(int var1, int var2) {
      int var3 = this.id_class.get(var1);
      if (var3 >= var2) {
         this.id_class.put(var1, var3 - var2);
         return var1;
      } else {
         return 0;
      }
   }

   void id_break(int var1, int var2) {
      this.id_class.put(var1, this.id_class.get(var1) + var2);
   }

   public void id_break(rdn_3 var1) {
      this.id_class(var1, 64);
   }

   public int id_break(rkw_3<?> var1, IntList var2) {
      return this.id_class(var1, Integer.MAX_VALUE, var2);
   }

   boolean id_break(int var1) {
      return this.id_class.get(var1) > 0;
   }
}

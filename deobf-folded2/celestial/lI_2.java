package celestial;

import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;
import java.util.function.Supplier;

class lI_2 {
   private boolean id_class;
   private final Long2IntLinkedOpenHashMap id_break = rqR_2.id_class((Supplier<Long2IntLinkedOpenHashMap>)(() -> {
      lf_3 var1 = new lf_3(this, 100, 0.25F);
      var1.defaultReturnValue(Integer.MAX_VALUE);
      return var1;
   }));
   private final Long2FloatLinkedOpenHashMap id_byte = rqR_2.id_class((Supplier<Long2FloatLinkedOpenHashMap>)(() -> {
      lj_3 var1 = new lj_3(this, 100, 0.25F);
      var1.defaultReturnValue(Float.NaN);
      return var1;
   }));

   public int id_class(xc_3 var1, rRp_1 var2, rfH_2 var3) {
      long var4 = var3.id_package();
      if (this.id_class) {
         int var6 = this.id_break.get(var4);
         if (var6 != Integer.MAX_VALUE) {
            return var6;
         }
      }

      int var7 = yX_2.id_class(var2, var1, var3);
      if (this.id_class) {
         if (this.id_break.size() == 100) {
            this.id_break.removeFirstInt();
         }

         this.id_break.put(var4, var7);
      }

      return var7;
   }

   public void id_class() {
      this.id_class = true;
   }

   public void id_break() {
      this.id_class = false;
      this.id_break.clear();
      this.id_byte.clear();
   }

   public float id_break(xc_3 var1, rRp_1 var2, rfH_2 var3) {
      long var4 = var3.id_package();
      if (this.id_class) {
         float var6 = this.id_byte.get(var4);
         if (!Float.isNaN(var6)) {
            return var6;
         }
      }

      float var7 = var1.id_case(var2, var3);
      if (this.id_class) {
         if (this.id_byte.size() == 100) {
            this.id_byte.removeFirstFloat();
         }

         this.id_byte.put(var4, var7);
      }

      return var7;
   }
}

package celestial;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class rrEg_1 {
   private final int id_class;
   private final Object2IntOpenHashMap<aH_2> id_break;
   private final rrET id_byte;
   private final Object2IntMap<aH_2> id_protected;
   private rfH_2 id_throws;
   private aI_2<?> id_case;
   private double id_catch;

   rrEg_1(int var1, Object2IntOpenHashMap<aH_2> var2, rrET var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = Object2IntMaps.unmodifiable(var2);
   }

   boolean id_class(aH_2 var1) {
      int var2 = var1.id_byte() * this.id_class / rrEj_1.id_break;
      return this.id_break.getInt(var1) < var2;
   }

   public int id_class() {
      return this.id_class;
   }

   void id_class(is_3 var1, roC_2 var2) {
      aI_2 var3 = var1.BC();
      rfH_2 var4 = var1.Bs();
      double var5;
      if (var4.equals(this.id_throws) && var3 == this.id_case) {
         var5 = this.id_catch;
      } else {
         rYI var7 = rrEj_1.id_class(var4, var2).id_break().id_class(var3);
         if (var7 != null) {
            var5 = var7.id_break();
         } else {
            var5 = 0.0;
         }
      }

      this.id_byte.id_class(var4, var5);
      this.id_break.addTo(var3.id_throws(), 1);
   }

   boolean id_class(aI_2<?> var1, rfH_2 var2, roC_2 var3) {
      this.id_throws = var2;
      this.id_case = var1;
      rYI var4 = rrEj_1.id_class(var2, var3).id_break().id_class(var1);
      if (var4 == null) {
         this.id_catch = 0.0;
         return true;
      } else {
         double var5 = var4.id_break();
         this.id_catch = var5;
         double var7 = this.id_byte.id_break(var2, var5);
         return var7 <= var4.id_class();
      }
   }

   public Object2IntMap<aH_2> id_break() {
      return this.id_protected;
   }
}

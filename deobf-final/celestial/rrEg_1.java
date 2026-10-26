package celestial;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class rrEg_1 {
   private final int class_;
   private final Object2IntOpenHashMap<aH_2> break_;
   private final rrET byte_;
   private final Object2IntMap<aH_2> protected_;
   private rfH_2 throws_;
   private aI_2<?> case_;
   private double catch_;

   rrEg_1(int var1, Object2IntOpenHashMap<aH_2> var2, rrET var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = Object2IntMaps.unmodifiable(var2);
   }

   boolean class_(aH_2 var1) {
      int var2 = var1.byte_() * this.class_ / rrEj_1.break_;
      return this.break_.getInt(var1) < var2;
   }

   public int class_() {
      return this.class_;
   }

   void class_(is_3 var1, roC_2 var2) {
      aI_2 var3 = var1.BC();
      rfH_2 var4 = var1.Bs();
      double var5;
      if (var4.equals(this.throws_) && var3 == this.case_) {
         var5 = this.catch_;
      } else {
         rYI var7 = rrEj_1.class_(var4, var2).break_().class_(var3);
         if (var7 != null) {
            var5 = var7.break_();
         } else {
            var5 = 0.0;
         }
      }

      this.byte_.class_(var4, var5);
      this.break_.addTo(var3.throws_(), 1);
   }

   boolean class_(aI_2<?> var1, rfH_2 var2, roC_2 var3) {
      this.throws_ = var2;
      this.case_ = var1;
      rYI var4 = rrEj_1.class_(var2, var3).break_().class_(var1);
      if (var4 == null) {
         this.catch_ = 0.0;
         return true;
      } else {
         double var5 = var4.break_();
         this.catch_ = var5;
         double var7 = this.byte_.break_(var2, var5);
         return var7 <= var4.class_();
      }
   }

   public Object2IntMap<aH_2> break_() {
      return this.protected_;
   }
}

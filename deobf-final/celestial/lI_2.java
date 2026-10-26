package celestial;

import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;
import java.util.function.Supplier;

class lI_2 {
   private boolean class_;
   private final Long2IntLinkedOpenHashMap break_ = rqR_2.class_((Supplier<Long2IntLinkedOpenHashMap>)(() -> {
      lf_3 var1 = new lf_3(this, 100, 0.25F);
      var1.defaultReturnValue(Integer.MAX_VALUE);
      return var1;
   }));
   private final Long2FloatLinkedOpenHashMap byte_ = rqR_2.class_((Supplier<Long2FloatLinkedOpenHashMap>)(() -> {
      lj_3 var1 = new lj_3(this, 100, 0.25F);
      var1.defaultReturnValue(Float.NaN);
      return var1;
   }));

   public int class_(xc_3 var1, rRp_1 var2, rfH_2 var3) {
      long var4 = var3.package_();
      if (this.class_) {
         int var6 = this.break_.get(var4);
         if (var6 != Integer.MAX_VALUE) {
            return var6;
         }
      }

      int var7 = yX_2.class_(var2, var1, var3);
      if (this.class_) {
         if (this.break_.size() == 100) {
            this.break_.removeFirstInt();
         }

         this.break_.put(var4, var7);
      }

      return var7;
   }

   public void class_() {
      this.class_ = true;
   }

   public void break_() {
      this.class_ = false;
      this.break_.clear();
      this.byte_.clear();
   }

   public float break_(xc_3 var1, rRp_1 var2, rfH_2 var3) {
      long var4 = var3.package_();
      if (this.class_) {
         float var6 = this.byte_.get(var4);
         if (!Float.isNaN(var6)) {
            return var6;
         }
      }

      float var7 = var1.case_(var2, var3);
      if (this.class_) {
         if (this.byte_.size() == 100) {
            this.byte_.removeFirstFloat();
         }

         this.byte_.put(var4, var7);
      }

      return var7;
   }
}

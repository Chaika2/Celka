package celestial;

import it.unimi.dsi.fastutil.floats.Float2FloatFunction;

class xj_3 implements ryX_2<rHu_1, Float2FloatFunction> {
   xj_3(rHw_1 var1) {
      this.class_ = var1;
   }

   public Float2FloatFunction class_(rHu_1 var1, rHu_1 var2) {
      return var2x -> Math.max(var1.class_(var2x), var2.class_(var2x));
   }

   public Float2FloatFunction class_(rHu_1 var1) {
      return var1::class_;
   }

   public Float2FloatFunction class_() {
      return this.class_::class_;
   }
}

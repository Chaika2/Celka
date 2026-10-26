package celestial;

import it.unimi.dsi.fastutil.floats.Float2FloatFunction;

class xj_3 implements ryX_2<rHu_1, Float2FloatFunction> {
   xj_3(rHw_1 var1) {
      this.id_class = var1;
   }

   public Float2FloatFunction id_class(rHu_1 var1, rHu_1 var2) {
      return var2x -> Math.max(var1.id_class(var2x), var2.id_class(var2x));
   }

   public Float2FloatFunction id_class(rHu_1 var1) {
      return var1::id_class;
   }

   public Float2FloatFunction id_class() {
      return this.id_class::id_class;
   }
}

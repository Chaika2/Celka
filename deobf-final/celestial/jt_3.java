package celestial;

import java.io.IOException;

public class jt_3 extends jY_2<int[]> {
   private static final rqO_2 class_ = new rqO_2("textures/colormap/foliage.png");

   protected int[] class_(rAL var1) {
      try {
         return jl_3.class_(var1, class_);
      } catch (IOException var3) {
         throw new IllegalStateException("Failed to load foliage color texture", var3);
      }
   }

   protected void class_(int[] var1, rAL var2) {
      rRN.class_(var1);
   }
}

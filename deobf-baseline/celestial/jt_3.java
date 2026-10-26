package celestial;

import java.io.IOException;

public class jt_3 extends jY_2<int[]> {
   private static final rqO_2 id_class = new rqO_2("textures/colormap/foliage.png");

   protected int[] id_class(rAL var1) {
      try {
         return jl_3.id_class(var1, id_class);
      } catch (IOException var3) {
         throw new IllegalStateException("Failed to load foliage color texture", var3);
      }
   }

   protected void id_class(int[] var1, rAL var2) {
      rRN.id_class(var1);
   }
}

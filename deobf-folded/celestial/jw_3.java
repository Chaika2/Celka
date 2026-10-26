package celestial;

import java.io.IOException;

public class jw_3 extends jY_2<int[]> {
   private static final rqO_2 id_class = new rqO_2("textures/colormap/grass.png");

   protected int[] id_class(rAL var1) {
      try {
         return jl_3.id_class(var1, id_class);
      } catch (IOException var3) {
         throw new IllegalStateException("Failed to load grass color texture", var3);
      }
   }

   protected void id_class(int[] var1, rAL var2) {
      rRH.id_class(var1);
   }
}

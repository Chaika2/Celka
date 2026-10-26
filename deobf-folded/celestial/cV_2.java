package celestial;

import java.io.IOException;
import java.io.InputStream;

class cV_2 extends fH_2 {
   public cV_2() {
      super(cj_3.id_class);
   }

   @Override
   protected fy_3 id_class(rAL var1) {
      QY var2 = QY.id_instanceof();
      rAY var3 = var2.Z().id_class();

      try {
         fy_3 var5;
         try (InputStream var4 = id_class(var1, var3)) {
            var5 = new fy_3(new Vs_1(true, true), fN_2.id_class(var4));
         }

         return var5;
      } catch (IOException var9) {
         return new fy_3(var9);
      }
   }

   private static InputStream id_class(rAL var0, rAY var1) throws IOException {
      return var0.id_break(cj_3.id_class) ? var0.id_class(cj_3.id_class).id_break() : var1.id_class(rAI.CLIENT_RESOURCES, cj_3.id_class);
   }
}

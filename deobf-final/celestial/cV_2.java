package celestial;

import java.io.IOException;
import java.io.InputStream;

class cV_2 extends fH_2 {
   public cV_2() {
      super(cj_3.class_);
   }

   @Override
   protected fy_3 class_(rAL var1) {
      QY var2 = QY.instanceof_();
      rAY var3 = var2.Z().class_();

      try {
         fy_3 var5;
         try (InputStream var4 = class_(var1, var3)) {
            var5 = new fy_3(new Vs_1(true, true), fN_2.class_(var4));
         }

         return var5;
      } catch (IOException var9) {
         return new fy_3(var9);
      }
   }

   private static InputStream class_(rAL var0, rAY var1) throws IOException {
      return var0.break_(cj_3.class_) ? var0.class_(cj_3.class_).break_() : var1.class_(rAI.CLIENT_RESOURCES, cj_3.class_);
   }
}

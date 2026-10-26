package celestial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

class rnF_2 extends Thread {
   rnF_2(rnv_3 var1, String var2) {
      super(var2);
      this.class_ = var1;
   }

   @Override
   public void run() {
      BufferedReader var1 = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));

      String var2;
      try {
         while (!this.class_.J() && this.class_.synchronized_() && (var2 = var1.readLine()) != null) {
            this.class_.class_(var2, this.class_.j());
         }
      } catch (IOException var4) {
         rnv_3.finally_.error("Exception handling console input", var4);
      }
   }
}

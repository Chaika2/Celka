package celestial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

class rnF_2 extends Thread {
   rnF_2(rnv_3 var1, String var2) {
      super(var2);
      this.id_class = var1;
   }

   @Override
   public void run() {
      BufferedReader var1 = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));

      String var2;
      try {
         while (!this.id_class.J() && this.id_class.id_synchronized() && (var2 = var1.readLine()) != null) {
            this.id_class.id_class(var2, this.id_class.j());
         }
      } catch (IOException var4) {
         rnv_3.id_finally.error("Exception handling console input", var4);
      }
   }
}

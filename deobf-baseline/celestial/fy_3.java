package celestial;

import java.io.Closeable;
import java.io.IOException;

public class fy_3 implements Closeable {
   private final Vs_1 id_class;
   private final fN_2 id_break;
   private final IOException id_byte;

   public void id_byte() throws IOException {
      if (this.id_byte != null) {
         throw this.id_byte;
      }
   }

   public fy_3(IOException var1) {
      this.id_byte = var1;
      this.id_class = null;
      this.id_break = null;
   }

   public fy_3(Vs_1 var1, fN_2 var2) {
      this.id_byte = null;
      this.id_class = var1;
      this.id_break = var2;
   }

   public Vs_1 id_class() {
      return this.id_class;
   }

   public static fy_3 id_class(rAL var0, rqO_2 var1) {
      try {
         fy_3 var5;
         try (rAF var2 = var0.id_class(var1)) {
            fN_2 var3 = fN_2.id_class(var2.id_break());
            Vs_1 var4 = null;

            try {
               var4 = var2.id_class(Vs_1.id_class);
            } catch (RuntimeException var7) {
               fH_2.id_class.warn("Failed reading metadata of: {}", var1, var7);
            }

            var5 = new fy_3(var4, var3);
         }

         return var5;
      } catch (IOException var9) {
         return new fy_3(var9);
      }
   }

   @Override
   public void close() {
      if (this.id_break != null) {
         this.id_break.close();
      }
   }

   public fN_2 id_break() throws IOException {
      if (this.id_byte != null) {
         throw this.id_byte;
      } else {
         return this.id_break;
      }
   }
}

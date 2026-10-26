package celestial;

import java.io.Closeable;
import java.io.IOException;

public class fy_3 implements Closeable {
   private final Vs_1 class_;
   private final fN_2 break_;
   private final IOException byte_;

   public void byte_() throws IOException {
      if (this.byte_ != null) {
         throw this.byte_;
      }
   }

   public fy_3(IOException var1) {
      this.byte_ = var1;
      this.class_ = null;
      this.break_ = null;
   }

   public fy_3(Vs_1 var1, fN_2 var2) {
      this.byte_ = null;
      this.class_ = var1;
      this.break_ = var2;
   }

   public Vs_1 class_() {
      return this.class_;
   }

   public static fy_3 class_(rAL var0, rqO_2 var1) {
      try {
         fy_3 var5;
         try (rAF var2 = var0.class_(var1)) {
            fN_2 var3 = fN_2.class_(var2.break_());
            Vs_1 var4 = null;

            try {
               var4 = var2.class_(Vs_1.class_);
            } catch (RuntimeException var7) {
               fH_2.class_.warn("Failed reading metadata of: {}", var1, var7);
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
      if (this.break_ != null) {
         this.break_.close();
      }
   }

   public fN_2 break_() throws IOException {
      if (this.byte_ != null) {
         throw this.byte_;
      } else {
         return this.break_;
      }
   }
}

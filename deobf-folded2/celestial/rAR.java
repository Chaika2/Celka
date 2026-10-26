package celestial;

import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.IOUtils;

public class rAR implements rAF {
   private final String id_class;
   private final rqO_2 id_break;
   private final InputStream id_byte;
   private final InputStream id_protected;
   private boolean id_throws;
   private JsonObject id_case;

   @Override
   public String id_byte() {
      return this.id_class;
   }

   public rAR(String var1, rqO_2 var2, InputStream var3, InputStream var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof rAR var2)) {
         return false;
      } else {
         if (this.id_break != null) {
            if (!this.id_break.equals(var2.id_break)) {
               return false;
            }
         } else if (var2.id_break != null) {
            return false;
         }

         if (this.id_class != null) {
            if (!this.id_class.equals(var2.id_class)) {
               return false;
            }
         } else if (var2.id_class != null) {
            return false;
         }

         return true;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.id_class != null ? this.id_class.hashCode() : 0;
      return 31 * var1 + (this.id_break != null ? this.id_break.hashCode() : 0);
   }

   @Override
   public <T> T id_class(rAo_1<T> var1) {
      if (!this.id_protected()) {
         return null;
      } else {
         if (this.id_case == null && !this.id_throws) {
            this.id_throws = true;
            BufferedReader var2 = null;

            try {
               var2 = new BufferedReader(new InputStreamReader(this.id_protected, StandardCharsets.UTF_8));
               this.id_case = rpY_2.id_class(var2);
            } finally {
               IOUtils.closeQuietly(var2);
            }
         }

         if (this.id_case == null) {
            return null;
         } else {
            String var6 = var1.id_class();
            return (T)(this.id_case.has(var6) ? var1.id_break(rpY_2.id_native(this.id_case, var6)) : null);
         }
      }
   }

   @Override
   public rqO_2 id_class() {
      return this.id_break;
   }

   @Override
   public void close() throws IOException {
      this.id_byte.close();
      if (this.id_protected != null) {
         this.id_protected.close();
      }
   }

   @Override
   public InputStream id_break() {
      return this.id_byte;
   }

   public boolean id_protected() {
      return this.id_protected != null;
   }
}

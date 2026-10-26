package celestial;

import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.IOUtils;

public class rAR implements rAF {
   private final String class_;
   private final rqO_2 break_;
   private final InputStream byte_;
   private final InputStream protected_;
   private boolean throws_;
   private JsonObject case_;

   @Override
   public String byte_() {
      return this.class_;
   }

   public rAR(String var1, rqO_2 var2, InputStream var3, InputStream var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof rAR var2)) {
         return false;
      } else {
         if (this.break_ != null) {
            if (!this.break_.equals(var2.break_)) {
               return false;
            }
         } else if (var2.break_ != null) {
            return false;
         }

         if (this.class_ != null) {
            if (!this.class_.equals(var2.class_)) {
               return false;
            }
         } else if (var2.class_ != null) {
            return false;
         }

         return true;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.class_ != null ? this.class_.hashCode() : 0;
      return 31 * var1 + (this.break_ != null ? this.break_.hashCode() : 0);
   }

   @Override
   public <T> T class_(rAo_1<T> var1) {
      if (!this.protected_()) {
         return null;
      } else {
         if (this.case_ == null && !this.throws_) {
            this.throws_ = true;
            BufferedReader var2 = null;

            try {
               var2 = new BufferedReader(new InputStreamReader(this.protected_, StandardCharsets.UTF_8));
               this.case_ = rpY_2.class_(var2);
            } finally {
               IOUtils.closeQuietly(var2);
            }
         }

         if (this.case_ == null) {
            return null;
         } else {
            String var6 = var1.class_();
            return (T)(this.case_.has(var6) ? var1.break_(rpY_2.native_(this.case_, var6)) : null);
         }
      }
   }

   @Override
   public rqO_2 class_() {
      return this.break_;
   }

   @Override
   public void close() throws IOException {
      this.byte_.close();
      if (this.protected_ != null) {
         this.protected_.close();
      }
   }

   @Override
   public InputStream break_() {
      return this.byte_;
   }

   public boolean protected_() {
      return this.protected_ != null;
   }
}

package celestial;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rnN_2 {
   private static final Logger class_ = LogManager.getLogger();
   private final Path break_;
   private final boolean byte_;

   private void byte_() {
      if (!rqu_3.byte_) {
         try (OutputStream var1 = Files.newOutputStream(this.break_)) {
            Properties var2 = new Properties();
            var2.setProperty("eula", "false");
            var2.store(
               var1,
               "By changing the setting below to TRUE you are indicating your agreement to our EULA (https://account.mojang.com/documents/minecraft_eula)."
            );
         } catch (Exception var6) {
            class_.warn("Failed to save {}", this.break_, var6);
         }
      }
   }

   public rnN_2(Path var1) {
      this.break_ = var1;
      this.byte_ = rqu_3.byte_ || this.break_();
   }

   public boolean class_() {
      return this.byte_;
   }

   private boolean break_() {
      try {
         boolean var3;
         try (InputStream var1 = Files.newInputStream(this.break_)) {
            Properties var2 = new Properties();
            var2.load(var1);
            var3 = Boolean.parseBoolean(var2.getProperty("eula", "false"));
         }

         return var3;
      } catch (Exception var6) {
         class_.warn("Failed to load {}", this.break_);
         this.byte_();
         return false;
      }
   }
}

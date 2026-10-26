package celestial;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rnN_2 {
   private static final Logger id_class = LogManager.getLogger();
   private final Path id_break;
   private final boolean id_byte;

   private void id_byte() {
      if (!rqu_3.id_byte) {
         try (OutputStream var1 = Files.newOutputStream(this.id_break)) {
            Properties var2 = new Properties();
            var2.setProperty("eula", "false");
            var2.store(
               var1,
               "By changing the setting below to TRUE you are indicating your agreement to our EULA (https://account.mojang.com/documents/minecraft_eula)."
            );
         } catch (Exception var6) {
            id_class.warn("Failed to save {}", this.id_break, var6);
         }
      }
   }

   public rnN_2(Path var1) {
      this.id_break = var1;
      this.id_byte = rqu_3.id_byte || this.id_break();
   }

   public boolean id_class() {
      return this.id_byte;
   }

   private boolean id_break() {
      try {
         boolean var3;
         try (InputStream var1 = Files.newInputStream(this.id_break)) {
            Properties var2 = new Properties();
            var2.load(var1);
            var3 = Boolean.parseBoolean(var2.getProperty("eula", "false"));
         }

         return var3;
      } catch (Exception var6) {
         id_class.warn("Failed to load {}", this.id_break);
         this.id_byte();
         return false;
      }
   }
}

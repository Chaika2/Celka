package celestial;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DU implements DT {
   private static final Logger id_break = LogManager.getLogger();
   private final DA id_byte;

   public DU(DA var1) {
      this.id_byte = var1;
   }

   public static Path id_class(Path var0, String var1, Path var2) {
      try {
         rcd_3 var3 = rcW_2.id_class(Files.newInputStream(var0));
         rgP_2 var4 = var3.id_class("    ", 0);
         String var5 = var4.getString() + "\n";
         Path var6 = var2.resolve(var1 + ".snbt");
         Files.createDirectories(var6.getParent());

         try (BufferedWriter var7 = Files.newBufferedWriter(var6)) {
            var7.write(var5);
         }

         id_break.info("Converted {} from NBT to SNBT", var1);
         return var6;
      } catch (IOException var12) {
         id_break.error("Couldn't convert {} from NBT to SNBT at {}", var1, var0, var12);
         return null;
      }
   }

   @Override
   public void id_class(Dn_1 var1) throws IOException {
      Path var2 = this.id_byte.id_break();

      for (Path var4 : this.id_byte.id_class()) {
         Files.walk(var4).filter(var0 -> var0.toString().endsWith(".nbt")).forEach(var3 -> id_class(var3, this.id_class(var4, var3), var2));
      }
   }

   private String id_class(Path var1, Path var2) {
      String var3 = var1.relativize(var2).toString().replaceAll("\\\\", "/");
      return var3.substring(0, var3.length() - ".nbt".length());
   }

   @Override
   public String id_class() {
      return "NBT to SNBT";
   }
}

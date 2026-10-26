package celestial;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DU implements DT {
   private static final Logger break_ = LogManager.getLogger();
   private final DA byte_;

   public DU(DA var1) {
      this.byte_ = var1;
   }

   public static Path class_(Path var0, String var1, Path var2) {
      try {
         rcd_3 var3 = rcW_2.class_(Files.newInputStream(var0));
         rgP_2 var4 = var3.class_("    ", 0);
         String var5 = var4.getString() + "\n";
         Path var6 = var2.resolve(var1 + ".snbt");
         Files.createDirectories(var6.getParent());

         try (BufferedWriter var7 = Files.newBufferedWriter(var6)) {
            var7.write(var5);
         }

         break_.info("Converted {} from NBT to SNBT", var1);
         return var6;
      } catch (IOException var12) {
         break_.error("Couldn't convert {} from NBT to SNBT at {}", var1, var0, var12);
         return null;
      }
   }

   @Override
   public void class_(Dn_1 var1) throws IOException {
      Path var2 = this.byte_.break_();

      for (Path var4 : this.byte_.class_()) {
         Files.walk(var4).filter(var0 -> var0.toString().endsWith(".nbt")).forEach(var3 -> class_(var3, this.class_(var4, var3), var2));
      }
   }

   private String class_(Path var1, Path var2) {
      String var3 = var1.relativize(var2).toString().replaceAll("\\\\", "/");
      return var3.substring(0, var3.length() - ".nbt".length());
   }

   @Override
   public String class_() {
      return "NBT to SNBT";
   }
}

package celestial;

import com.mojang.datafixers.DataFixer;
import java.io.File;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rrGx_1 {
   private static final Logger id_break = LogManager.getLogger();
   private final File id_byte;
   protected final DataFixer id_class;

   public rrGx_1(rrGk_1 var1, DataFixer var2) {
      this.id_class = var2;
      this.id_byte = var1.id_class(rrGr_1.id_byte).toFile();
      this.id_byte.mkdirs();
   }

   public void id_class(rhd_3 var1) {
      try {
         rcd_3 var2 = var1.id_case(new rcd_3());
         File var3 = File.createTempFile(var1.rz() + "-", ".dat", this.id_byte);
         rcW_2.id_class(var2, var3);
         File var4 = new File(this.id_byte, var1.rz() + ".dat");
         File var5 = new File(this.id_byte, var1.rz() + ".dat_old");
         rqR_2.id_class(var4, var3, var5);
      } catch (Exception var6) {
         id_break.warn("Failed to save player data for {}", var1.g().getString());
      }
   }

   public String[] id_class() {
      String[] var1 = this.id_byte.list();
      if (var1 == null) {
         var1 = new String[0];
      }

      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var1[var2].endsWith(".dat")) {
            var1[var2] = var1[var2].substring(0, var1[var2].length() - 4);
         }
      }

      return var1;
   }

   public rcd_3 id_break(rhd_3 var1) {
      rcd_3 var2 = null;

      try {
         File var3 = new File(this.id_byte, var1.rz() + ".dat");
         if (var3.exists() && var3.isFile()) {
            var2 = rcW_2.id_class(var3);
         }
      } catch (Exception var4) {
         id_break.warn("Failed to load player data for {}", var1.g().getString());
      }

      if (var2 != null) {
         int var5 = var2.id_byte("DataVersion", 3) ? var2.id_private("DataVersion") : -1;
         var1.id_throws(rco_3.id_class(this.id_class, rTv_1.PLAYER, var2, var5));
      }

      return var2;
   }
}

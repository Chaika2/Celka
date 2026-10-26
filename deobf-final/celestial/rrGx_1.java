package celestial;

import com.mojang.datafixers.DataFixer;
import java.io.File;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rrGx_1 {
   private static final Logger break_ = LogManager.getLogger();
   private final File byte_;
   protected final DataFixer class_;

   public rrGx_1(rrGk_1 var1, DataFixer var2) {
      this.class_ = var2;
      this.byte_ = var1.class_(rrGr_1.byte_).toFile();
      this.byte_.mkdirs();
   }

   public void class_(rhd_3 var1) {
      try {
         rcd_3 var2 = var1.case_(new rcd_3());
         File var3 = File.createTempFile(var1.rz() + "-", ".dat", this.byte_);
         rcW_2.class_(var2, var3);
         File var4 = new File(this.byte_, var1.rz() + ".dat");
         File var5 = new File(this.byte_, var1.rz() + ".dat_old");
         rqR_2.class_(var4, var3, var5);
      } catch (Exception var6) {
         break_.warn("Failed to save player data for {}", var1.g().getString());
      }
   }

   public String[] class_() {
      String[] var1 = this.byte_.list();
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

   public rcd_3 break_(rhd_3 var1) {
      rcd_3 var2 = null;

      try {
         File var3 = new File(this.byte_, var1.rz() + ".dat");
         if (var3.exists() && var3.isFile()) {
            var2 = rcW_2.class_(var3);
         }
      } catch (Exception var4) {
         break_.warn("Failed to load player data for {}", var1.g().getString());
      }

      if (var2 != null) {
         int var5 = var2.byte_("DataVersion", 3) ? var2.private_("DataVersion") : -1;
         var1.throws_(rco_3.class_(this.class_, rTv_1.PLAYER, var2, var5));
      }

      return var2;
   }
}

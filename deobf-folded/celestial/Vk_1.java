package celestial;

import com.mojang.datafixers.DataFixer;
import java.io.File;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Vk_1 {
   private static final Logger id_class = LogManager.getLogger();
   private final File id_break;
   private final DataFixer id_byte;
   private final VQ[] id_protected = new VQ[9];
   private boolean id_throws;

   public Vk_1(File var1, DataFixer var2) {
      this.id_break = new File(var1, "hotbar.nbt");
      this.id_byte = var2;

      for (int var3 = 0; var3 < 9; var3++) {
         this.id_protected[var3] = new VQ();
      }
   }

   public VQ id_class(int var1) {
      if (!this.id_throws) {
         this.id_break();
         this.id_throws = true;
      }

      return this.id_protected[var1];
   }

   public void id_class() {
      try {
         rcd_3 var1 = new rcd_3();
         var1.id_break("DataVersion", rqu_3.id_class().getWorldVersion());

         for (int var2 = 0; var2 < 9; var2++) {
            var1.id_class(String.valueOf(var2), this.id_class(var2).id_class());
         }

         rcW_2.id_break(var1, this.id_break);
      } catch (Exception var3) {
         id_class.error("Failed to save creative mode options", var3);
      }
   }

   private void id_break() {
      try {
         rcd_3 var1 = rcW_2.id_break(this.id_break);
         if (var1 == null) {
            return;
         }

         if (!var1.id_byte("DataVersion", 99)) {
            var1.id_break("DataVersion", 1343);
         }

         var1 = rco_3.id_class(this.id_byte, rTv_1.HOTBAR, var1, var1.id_private("DataVersion"));

         for (int var2 = 0; var2 < 9; var2++) {
            this.id_protected[var2].id_class(var1.id_protected(String.valueOf(var2), 10));
         }
      } catch (Exception var3) {
         id_class.error("Failed to load creative mode options", var3);
      }
   }
}

package celestial;

import com.mojang.datafixers.DataFixer;
import java.io.File;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Vk_1 {
   private static final Logger class_ = LogManager.getLogger();
   private final File break_;
   private final DataFixer byte_;
   private final VQ[] protected_ = new VQ[9];
   private boolean throws_;

   public Vk_1(File var1, DataFixer var2) {
      this.break_ = new File(var1, "hotbar.nbt");
      this.byte_ = var2;

      for (int var3 = 0; var3 < 9; var3++) {
         this.protected_[var3] = new VQ();
      }
   }

   public VQ class_(int var1) {
      if (!this.throws_) {
         this.break_();
         this.throws_ = true;
      }

      return this.protected_[var1];
   }

   public void class_() {
      try {
         rcd_3 var1 = new rcd_3();
         var1.break_("DataVersion", rqu_3.class_().getWorldVersion());

         for (int var2 = 0; var2 < 9; var2++) {
            var1.class_(String.valueOf(var2), this.class_(var2).class_());
         }

         rcW_2.break_(var1, this.break_);
      } catch (Exception var3) {
         class_.error("Failed to save creative mode options", var3);
      }
   }

   private void break_() {
      try {
         rcd_3 var1 = rcW_2.break_(this.break_);
         if (var1 == null) {
            return;
         }

         if (!var1.byte_("DataVersion", 99)) {
            var1.break_("DataVersion", 1343);
         }

         var1 = rco_3.class_(this.byte_, rTv_1.HOTBAR, var1, var1.private_("DataVersion"));

         for (int var2 = 0; var2 < 9; var2++) {
            this.protected_[var2].class_(var1.protected_(String.valueOf(var2), 10));
         }
      } catch (Exception var3) {
         class_.error("Failed to load creative mode options", var3);
      }
   }
}

package celestial;

import java.io.File;
import java.io.FileFilter;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class rAz_1 implements rAm_1 {
   private static final FileFilter class_ = var0 -> {
      boolean var1 = var0.isFile() && var0.getName().endsWith(".zip");
      boolean var2 = var0.isDirectory() && new File(var0, "pack.mcmeta").isFile();
      return var1 || var2;
   };
   private final File break_;
   private final rAZ byte_;

   public rAz_1(File var1, rAZ var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   private Supplier<rAC> class_(File var1) {
      return var1.isDirectory() ? () -> new rAW(var1) : () -> new rAk_1(var1);
   }

   @Override
   public void class_(Consumer<rAp_1> var1, rAq_1 var2) {
      if (!this.break_.isDirectory()) {
         this.break_.mkdirs();
      }

      File[] var3 = this.break_.listFiles(class_);
      if (var3 != null) {
         for (File var7 : var3) {
            String var8 = "file/" + var7.getName();
            rAp_1 var9 = rAp_1.class_(var8, false, this.class_(var7), var2, rAT.TOP, this.byte_);
            if (var9 != null) {
               var1.accept(var9);
            }
         }
      }
   }
}

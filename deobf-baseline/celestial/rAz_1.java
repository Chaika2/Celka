package celestial;

import java.io.File;
import java.io.FileFilter;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class rAz_1 implements rAm_1 {
   private static final FileFilter id_class = var0 -> {
      boolean var1 = var0.isFile() && var0.getName().endsWith(".zip");
      boolean var2 = var0.isDirectory() && new File(var0, "pack.mcmeta").isFile();
      return var1 || var2;
   };
   private final File id_break;
   private final rAZ id_byte;

   public rAz_1(File var1, rAZ var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   private Supplier<rAC> id_class(File var1) {
      return var1.isDirectory() ? () -> new rAW(var1) : () -> new rAk_1(var1);
   }

   @Override
   public void id_class(Consumer<rAp_1> var1, rAq_1 var2) {
      if (!this.id_break.isDirectory()) {
         this.id_break.mkdirs();
      }

      File[] var3 = this.id_break.listFiles(id_class);
      if (var3 != null) {
         for (File var7 : var3) {
            String var8 = "file/" + var7.getName();
            rAp_1 var9 = rAp_1.id_class(var8, false, this.id_class(var7), var2, rAT.TOP, this.id_byte);
            if (var9 != null) {
               var1.accept(var9);
            }
         }
      }
   }
}

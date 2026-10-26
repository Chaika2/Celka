package celestial;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class rrdQ implements rrxi_3 {
   protected File id_class;

   public rrdQ(String var1, File var2) {
      this.id_class = var2;
   }

   @Override
   public String id_class() {
      return this.id_class.getName();
   }

   @Override
   public InputStream id_class(String var1) {
      try {
         String var2 = rrzX_2.id_byte(var1, "/", "/");
         File var3 = new File(this.id_class, var2);
         return !var3.exists() ? null : new BufferedInputStream(new FileInputStream(var3));
      } catch (Exception var4) {
         return null;
      }
   }

   @Override
   public boolean id_break(String var1) {
      File var2 = new File(this.id_class, var1.substring(1));
      return !var2.exists() ? false : var2.isDirectory();
   }

   @Override
   public void id_break() {
   }
}

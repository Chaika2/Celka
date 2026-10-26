package celestial;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class rrdQ implements rrxi_3 {
   protected File class_;

   public rrdQ(String var1, File var2) {
      this.class_ = var2;
   }

   @Override
   public String class_() {
      return this.class_.getName();
   }

   @Override
   public InputStream class_(String var1) {
      try {
         String var2 = rrzX_2.byte_(var1, "/", "/");
         File var3 = new File(this.class_, var2);
         return !var3.exists() ? null : new BufferedInputStream(new FileInputStream(var3));
      } catch (Exception var4) {
         return null;
      }
   }

   @Override
   public boolean break_(String var1) {
      File var2 = new File(this.class_, var1.substring(1));
      return !var2.exists() ? false : var2.isDirectory();
   }

   @Override
   public void break_() {
   }
}

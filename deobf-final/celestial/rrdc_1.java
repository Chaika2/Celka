package celestial;

import com.google.common.base.Joiner;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class rrdc_1 implements rrxi_3 {
   protected File class_;
   protected ZipFile break_;
   protected String byte_;

   private String byte_(String var1) {
      ArrayDeque var2 = new ArrayDeque();
      String[] var3 = rrbb_3.class_(var1, "/");

      for (int var4 = 0; var4 < var3.length; var4++) {
         String var5 = var3[var4];
         if (var5.equals("..")) {
            if (var2.isEmpty()) {
               return "";
            }

            var2.removeLast();
         } else {
            var2.add(var5);
         }
      }

      return Joiner.on('/').join(var2);
   }

   public rrdc_1(String var1, File var2) {
      this.class_ = var2;
      this.break_ = null;
      this.byte_ = "";
   }

   @Override
   public String class_() {
      return this.class_.getName();
   }

   private String class_(ZipFile var1) {
      ZipEntry var2 = var1.getEntry("shaders/");
      if (var2 != null && var2.isDirectory()) {
         return "";
      } else {
         Pattern var3 = Pattern.compile("([^/]+/)shaders/");
         Enumeration var4 = var1.entries();

         while (var4.hasMoreElements()) {
            ZipEntry var5 = (ZipEntry)var4.nextElement();
            String var6 = var5.getName();
            Matcher var7 = var3.matcher(var6);
            if (var7.matches()) {
               String var8 = var7.group(1);
               if (var8 != null) {
                  if (var8.equals("shaders/")) {
                     return "";
                  }

                  return var8;
               }
            }
         }

         return "";
      }
   }

   @Override
   public InputStream class_(String var1) {
      try {
         if (this.break_ == null) {
            this.break_ = new ZipFile(this.class_);
            this.byte_ = this.class_(this.break_);
         }

         String var2 = rrzX_2.protected_(var1, "/");
         if (var2.contains("..")) {
            var2 = this.byte_(var2);
         }

         ZipEntry var3 = this.break_.getEntry(this.byte_ + var2);
         return var3 == null ? null : this.break_.getInputStream(var3);
      } catch (Exception var4) {
         return null;
      }
   }

   @Override
   public boolean break_(String var1) {
      try {
         if (this.break_ == null) {
            this.break_ = new ZipFile(this.class_);
            this.byte_ = this.class_(this.break_);
         }

         String var2 = rrzX_2.protected_(var1, "/");
         ZipEntry var3 = this.break_.getEntry(this.byte_ + var2);
         return var3 != null;
      } catch (IOException var4) {
         return false;
      }
   }

   @Override
   public void break_() {
      if (this.break_ != null) {
         try {
            this.break_.close();
         } catch (Exception var2) {
         }

         this.break_ = null;
      }
   }
}

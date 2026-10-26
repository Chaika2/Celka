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
   protected File id_class;
   protected ZipFile id_break;
   protected String id_byte;

   private String id_byte(String var1) {
      ArrayDeque var2 = new ArrayDeque();
      String[] var3 = rrbb_3.id_class(var1, "/");

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
      this.id_class = var2;
      this.id_break = null;
      this.id_byte = "";
   }

   @Override
   public String id_class() {
      return this.id_class.getName();
   }

   private String id_class(ZipFile var1) {
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
   public InputStream id_class(String var1) {
      try {
         if (this.id_break == null) {
            this.id_break = new ZipFile(this.id_class);
            this.id_byte = this.id_class(this.id_break);
         }

         String var2 = rrzX_2.id_protected(var1, "/");
         if (var2.contains("..")) {
            var2 = this.id_byte(var2);
         }

         ZipEntry var3 = this.id_break.getEntry(this.id_byte + var2);
         return var3 == null ? null : this.id_break.getInputStream(var3);
      } catch (Exception var4) {
         return null;
      }
   }

   @Override
   public boolean id_break(String var1) {
      try {
         if (this.id_break == null) {
            this.id_break = new ZipFile(this.id_class);
            this.id_byte = this.id_class(this.id_break);
         }

         String var2 = rrzX_2.id_protected(var1, "/");
         ZipEntry var3 = this.id_break.getEntry(this.id_byte + var2);
         return var3 != null;
      } catch (IOException var4) {
         return false;
      }
   }

   @Override
   public void id_break() {
      if (this.id_break != null) {
         try {
            this.id_break.close();
         } catch (Exception var2) {
         }

         this.id_break = null;
      }
   }
}

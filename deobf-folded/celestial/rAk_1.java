package celestial;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.function.Predicate;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.apache.commons.io.IOUtils;

public class rAk_1 extends rAH {
   public static final Splitter id_class = Splitter.on('/').omitEmptyStrings().limit(3);
   private ZipFile id_byte;

   @Override
   public boolean id_byte(String var1) {
      try {
         return this.id_break().getEntry(var1) != null;
      } catch (IOException var3) {
         return false;
      }
   }

   public rAk_1(File var1) {
      super(var1);
   }

   @Override
   protected void finalize() throws Throwable {
      this.close();
      super.finalize();
   }

   @Override
   public Set<String> id_class(rAI var1) {
      ZipFile var2;
      try {
         var2 = this.id_break();
      } catch (IOException var9) {
         return Collections.emptySet();
      }

      Enumeration var3 = var2.entries();
      HashSet var4 = Sets.newHashSet();

      while (var3.hasMoreElements()) {
         ZipEntry var5 = (ZipEntry)var3.nextElement();
         String var6 = var5.getName();
         if (var6.startsWith(var1.id_class() + "/")) {
            ArrayList var7 = Lists.newArrayList(id_class.split(var6));
            if (var7.size() > 1) {
               String var8 = (String)var7.get(1);
               if (var8.equals(var8.toLowerCase(Locale.ROOT))) {
                  var4.add(var8);
               } else {
                  this.id_protected(var8);
               }
            }
         }
      }

      return var4;
   }

   @Override
   public Collection<rqO_2> id_class(rAI var1, String var2, String var3, int var4, Predicate<String> var5) {
      ZipFile var6;
      try {
         var6 = this.id_break();
      } catch (IOException var15) {
         return Collections.emptySet();
      }

      Enumeration var7 = var6.entries();
      ArrayList var8 = Lists.newArrayList();
      String var9 = var1.id_class() + "/" + var2 + "/";
      String var10 = var9 + var3 + "/";

      while (var7.hasMoreElements()) {
         ZipEntry var11 = (ZipEntry)var7.nextElement();
         if (!var11.isDirectory()) {
            String var12 = var11.getName();
            if (!var12.endsWith(".mcmeta") && var12.startsWith(var10)) {
               String var13 = var12.substring(var9.length());
               String[] var14 = var13.split("/");
               if (var14.length >= var4 + 1 && var5.test(var14[var14.length - 1])) {
                  var8.add(new rqO_2(var2, var13));
               }
            }
         }
      }

      return var8;
   }

   @Override
   public void close() {
      if (this.id_byte != null) {
         IOUtils.closeQuietly(this.id_byte);
         this.id_byte = null;
      }
   }

   private ZipFile id_break() throws IOException {
      if (this.id_byte == null) {
         this.id_byte = new ZipFile(this.id_break);
      }

      return this.id_byte;
   }

   @Override
   protected InputStream id_break(String var1) throws IOException {
      ZipFile var2 = this.id_break();
      ZipEntry var3 = var2.getEntry(var1);
      if (var3 == null) {
         throw new rAy_1(this.id_break, var1);
      } else {
         return var2.getInputStream(var3);
      }
   }
}

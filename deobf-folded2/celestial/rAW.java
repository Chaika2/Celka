package celestial;

import com.google.common.base.CharMatcher;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.function.Predicate;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rAW extends rAH {
   private static final Logger id_class = LogManager.getLogger();
   private static final boolean id_byte = rqR_2.id_implements() == rqi_3.WINDOWS;
   private static final CharMatcher id_protected = CharMatcher.is('\\');

   @Override
   protected boolean id_byte(String var1) {
      return this.id_throws(var1) != null;
   }

   public rAW(File var1) {
      super(var1);
   }

   @Override
   public Collection<rqO_2> id_class(rAI var1, String var2, String var3, int var4, Predicate<String> var5) {
      File var6 = new File(this.id_break, var1.id_class());
      ArrayList var7 = Lists.newArrayList();
      this.id_class(new File(new File(var6, var2), var3), var4, var2, var7, var3 + "/", var5);
      return var7;
   }

   public static boolean id_class(File var0, String var1) throws IOException {
      String var2 = var0.getCanonicalPath();
      if (id_byte) {
         var2 = id_protected.replaceFrom(var2, '/');
      }

      return var2.endsWith(var1);
   }

   private void id_class(File var1, int var2, String var3, List<rqO_2> var4, String var5, Predicate<String> var6) {
      File[] var7 = var1.listFiles();
      if (var7 != null) {
         for (File var11 : var7) {
            if (var11.isDirectory()) {
               if (var2 > 0) {
                  this.id_class(var11, var2 - 1, var3, var4, var5 + var11.getName() + "/", var6);
               }
            } else if (!var11.getName().endsWith(".mcmeta") && var6.test(var11.getName())) {
               try {
                  var4.add(new rqO_2(var3, var5 + var11.getName()));
               } catch (rqX_2 var13) {
                  id_class.error(var13.getMessage());
               }
            }
         }
      }
   }

   @Override
   public Set<String> id_class(rAI var1) {
      HashSet var2 = Sets.newHashSet();
      File var3 = new File(this.id_break, var1.id_class());
      File[] var4 = var3.listFiles(DirectoryFileFilter.DIRECTORY);
      if (var4 != null) {
         for (File var8 : var4) {
            String var9 = id_class(var3, var8);
            if (var9.equals(var9.toLowerCase(Locale.ROOT))) {
               var2.add(var9.substring(0, var9.length() - 1));
            } else {
               this.id_protected(var9);
            }
         }
      }

      return var2;
   }

   @Override
   public void close() {
   }

   @Override
   protected InputStream id_break(String var1) throws IOException {
      File var2 = this.id_throws(var1);
      if (var2 == null) {
         throw new rAy_1(this.id_break, var1);
      } else {
         return new FileInputStream(var2);
      }
   }

   private File id_throws(String var1) {
      try {
         File var2 = new File(this.id_break, var1);
         if (var2.isFile() && id_class(var2, var1)) {
            return var2;
         }
      } catch (IOException var3) {
      }

      return null;
   }
}

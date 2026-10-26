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
   private static final Logger class_ = LogManager.getLogger();
   private static final boolean byte_ = rqR_2.implements_() == rqi_3.WINDOWS;
   private static final CharMatcher protected_ = CharMatcher.is('\\');

   @Override
   protected boolean byte_(String var1) {
      return this.throws_(var1) != null;
   }

   public rAW(File var1) {
      super(var1);
   }

   @Override
   public Collection<rqO_2> class_(rAI var1, String var2, String var3, int var4, Predicate<String> var5) {
      File var6 = new File(this.break_, var1.class_());
      ArrayList var7 = Lists.newArrayList();
      this.class_(new File(new File(var6, var2), var3), var4, var2, var7, var3 + "/", var5);
      return var7;
   }

   public static boolean class_(File var0, String var1) throws IOException {
      String var2 = var0.getCanonicalPath();
      if (byte_) {
         var2 = protected_.replaceFrom(var2, '/');
      }

      return var2.endsWith(var1);
   }

   private void class_(File var1, int var2, String var3, List<rqO_2> var4, String var5, Predicate<String> var6) {
      File[] var7 = var1.listFiles();
      if (var7 != null) {
         for (File var11 : var7) {
            if (var11.isDirectory()) {
               if (var2 > 0) {
                  this.class_(var11, var2 - 1, var3, var4, var5 + var11.getName() + "/", var6);
               }
            } else if (!var11.getName().endsWith(".mcmeta") && var6.test(var11.getName())) {
               try {
                  var4.add(new rqO_2(var3, var5 + var11.getName()));
               } catch (rqX_2 var13) {
                  class_.error(var13.getMessage());
               }
            }
         }
      }
   }

   @Override
   public Set<String> class_(rAI var1) {
      HashSet var2 = Sets.newHashSet();
      File var3 = new File(this.break_, var1.class_());
      File[] var4 = var3.listFiles(DirectoryFileFilter.DIRECTORY);
      if (var4 != null) {
         for (File var8 : var4) {
            String var9 = class_(var3, var8);
            if (var9.equals(var9.toLowerCase(Locale.ROOT))) {
               var2.add(var9.substring(0, var9.length() - 1));
            } else {
               this.protected_(var9);
            }
         }
      }

      return var2;
   }

   @Override
   public void close() {
   }

   @Override
   protected InputStream break_(String var1) throws IOException {
      File var2 = this.throws_(var1);
      if (var2 == null) {
         throw new rAy_1(this.break_, var1);
      } else {
         return new FileInputStream(var2);
      }
   }

   private File throws_(String var1) {
      try {
         File var2 = new File(this.break_, var1);
         if (var2.isFile() && class_(var2, var1)) {
            return var2;
         }
      } catch (IOException var3) {
      }

      return null;
   }
}

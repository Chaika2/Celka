package celestial;

import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

public class rrba_3 {
   private static final Splitter id_class = Splitter.on('=').limit(2);
   private static final Pattern id_break = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");

   public static String id_byte() {
      return jI_2.id_class("options.off");
   }

   public static void id_class() {
      HashMap var0 = new HashMap();
      ArrayList var1 = new ArrayList();
      String var2 = "optifine/lang/";
      String var3 = "en_us";
      String var4 = ".lang";
      var1.add(var2 + var3 + var4);
      if (!rrbb_3.rE().rG.equals(var3)) {
         var1.add(var2 + rrbb_3.rE().rG + var4);
      }

      String[] var5 = var1.toArray(new String[var1.size()]);
      id_class(rrbb_3.W(), var5, var0);
      rAC[] var6 = rrbb_3.d();

      for (int var7 = 0; var7 < var6.length; var7++) {
         rAC var8 = var6[var7];
         id_class(var8, var5, var0);
      }
   }

   public static String id_class(String var0, String var1) {
      String var2 = jI_2.id_class(var0);
      return var2 != null && !var2.equals(var0) ? var2 : var1;
   }

   private static void id_class(rAC var0, String[] var1, Map var2) {
      try {
         for (int var3 = 0; var3 < var1.length; var3++) {
            String var4 = var1[var3];
            rqO_2 var5 = new rqO_2(var4);
            if (var0.id_break(rAI.CLIENT_RESOURCES, var5)) {
               InputStream var6 = var0.id_class(rAI.CLIENT_RESOURCES, var5);
               if (var6 != null) {
                  id_class(var6, var2);
               }
            }
         }
      } catch (IOException var7) {
         var7.printStackTrace();
      }
   }

   public static void id_class(InputStream var0, Map var1) throws IOException {
      Iterator var2 = IOUtils.readLines(var0, Charsets.UTF_8).iterator();
      var0.close();

      while (var2.hasNext()) {
         String var3 = (String)var2.next();
         if (!var3.isEmpty() && var3.charAt(0) != '#') {
            String[] var4 = (String[])Iterables.toArray(id_class.split(var3), String.class);
            if (var4 != null && var4.length == 2) {
               String var5 = var4[0];
               String var6 = id_break.matcher(var4[1]).replaceAll("%$1s");
               var1.put(var5, var6);
            }
         }
      }
   }

   public static String id_class(String var0) {
      return jI_2.id_class(var0);
   }

   public static void id_class(rAL var0, String var1, Map<String, String> var2) {
      try {
         String var3 = "optifine/lang/" + var1 + ".lang";
         rqO_2 var4 = new rqO_2(var3);
         rAF var5 = var0.id_class(var4);
         InputStream var6 = var5.id_break();
         id_class(var6, var2);
      } catch (IOException var7) {
      }
   }

   public static String id_break() {
      return jI_2.id_class("options.on");
   }

   public static rgn_3 id_break(String var0) {
      return new rgn_3(var0);
   }

   public static String id_throws() {
      return jI_2.id_class("options.graphics.fancy");
   }

   public static String id_case() {
      return jI_2.id_class("generator.default");
   }

   public static String id_protected() {
      return jI_2.id_class("options.graphics.fast");
   }
}

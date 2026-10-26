package celestial;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class rrdT {
   private static List<rrdD> id_class() {
      ArrayList var0 = new ArrayList();
      rrdD[] var1 = rrdZ.id_throws();

      for (int var2 = 0; var2 < var1.length; var2++) {
         rrdD var3 = var1[var2];
         String var4 = var3.id_package();
         if (var4 != null && var4.startsWith("#")) {
            var0.add(var3);
         }
      }

      return var0;
   }

   private static String id_class(String var0, boolean var1) throws IOException {
      StringBuilder var2 = new StringBuilder();
      List var3 = null;
      ArrayList var4 = null;
      StringReader var5 = new StringReader(var0);
      BufferedReader var6 = new BufferedReader(var5);

      while (true) {
         String var7 = var6.readLine();
         if (var7 == null) {
            return var2.toString();
         }

         if (rrdt_1.id_break(var7)) {
            if (var2.length() == 0) {
               var2.append(rrdo_1.id_catch());
            }

            if (var1) {
               if (var3 == null) {
                  var3 = id_class();
               }

               Iterator var8 = var3.iterator();

               while (var8.hasNext()) {
                  rrdD var9 = (rrdD)var8.next();
                  if (var7.contains(var9.id_class())) {
                     var2.append(var9.id_package());
                     var2.append("\n");
                     var8.remove();
                  }
               }
            }

            if (var4 == null) {
               var4 = new ArrayList<>(Arrays.asList(rrdo_1.id_throws()));
            }

            Iterator var10 = var4.iterator();

            while (var10.hasNext()) {
               rrdY var11 = (rrdY)var10.next();
               if (var7.contains(var11.id_class())) {
                  var2.append(var11.id_byte());
                  var2.append("\n");
                  var10.remove();
               }
            }
         }
      }
   }

   public static String id_class(String var0) throws IOException {
      StringReader var1 = new StringReader(var0);
      BufferedReader var2 = new BufferedReader(var1);
      rrdt_1 var3 = new rrdt_1();
      StringBuilder var4 = new StringBuilder();

      while (true) {
         String var5 = var2.readLine();
         if (var5 == null) {
            return var4.toString();
         }

         if (var3.id_class(var5) && !rrdt_1.id_break(var5)) {
            var4.append(var5);
            var4.append("\n");
         }
      }
   }

   public static InputStream id_class(InputStream var0, String var1, boolean var2) throws IOException {
      String var3 = rrbb_3.id_class(var0, "ASCII");
      String var4 = id_class(var3, var2);
      if (!var4.isEmpty()) {
         var3 = var4 + var3;
         if (rrdZ.sy) {
            String var5 = var1.replace(':', '/') + ".pre";
            rrdZ.id_class(var5, var3);
         }

         var3 = id_class(var3);
      }

      if (rrdZ.sy) {
         String var7 = var1.replace(':', '/');
         rrdZ.id_class(var7, var3);
      }

      byte[] var8 = var3.getBytes("ASCII");
      return new ByteArrayInputStream(var8);
   }
}

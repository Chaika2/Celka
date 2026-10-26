package celestial;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class rrzM_2 {
   private static String[] id_class(File var0, String[] var1, String[] var2) {
      ArrayList var3 = new ArrayList();
      String var4 = "assets/minecraft/";

      try {
         ZipFile var5 = new ZipFile(var0);
         Enumeration var6 = var5.entries();

         while (var6.hasMoreElements()) {
            ZipEntry var7 = (ZipEntry)var6.nextElement();
            String var8 = var7.getName();
            if (var8.startsWith(var4)) {
               var8 = var8.substring(var4.length());
               if (rrzX_2.id_class(var8, var1) && rrzX_2.id_break(var8, var2)) {
                  if (!id_class(var8)) {
                     rrbb_3.id_protected("Skipping non-lowercase path: " + var8);
                  } else {
                     var3.add(var8);
                  }
               }
            }
         }

         var5.close();
         return var3.toArray(new String[var3.size()]);
      } catch (IOException var9) {
         var9.printStackTrace();
         return new String[0];
      }
   }

   private static String[] id_class(File var0, String var1, String[] var2, String[] var3) {
      ArrayList var4 = new ArrayList();
      String var5 = "assets/minecraft/";
      File[] var6 = var0.listFiles();
      if (var6 == null) {
         return new String[0];
      } else {
         for (int var7 = 0; var7 < var6.length; var7++) {
            File var8 = var6[var7];
            if (var8.isFile()) {
               String var13 = var1 + var8.getName();
               if (var13.startsWith(var5)) {
                  var13 = var13.substring(var5.length());
                  if (rrzX_2.id_class(var13, var2) && rrzX_2.id_break(var13, var3)) {
                     if (!id_class(var13)) {
                        rrbb_3.id_protected("Skipping non-lowercase path: " + var13);
                     } else {
                        var4.add(var13);
                     }
                  }
               }
            } else if (var8.isDirectory()) {
               String var9 = var1 + var8.getName() + "/";
               String[] var10 = id_class(var8, var9, var2, var3);

               for (int var11 = 0; var11 < var10.length; var11++) {
                  String var12 = var10[var11];
                  var4.add(var12);
               }
            }
         }

         return var4.toArray(new String[var4.size()]);
      }
   }

   private static String[] id_class(rAC var0, String[] var1) {
      if (var1 == null) {
         return new String[0];
      } else {
         ArrayList var2 = new ArrayList();

         for (int var3 = 0; var3 < var1.length; var3++) {
            String var4 = var1[var3];
            if (!id_class(var4)) {
               rrbb_3.id_protected("Skipping non-lowercase path: " + var4);
            } else {
               rqO_2 var5 = new rqO_2(var4);
               if (var0.id_break(rAI.CLIENT_RESOURCES, var5)) {
                  var2.add(var4);
               }
            }
         }

         return var2.toArray(new String[var2.size()]);
      }
   }

   private static boolean id_class(String var0) {
      return var0.equals(var0.toLowerCase(Locale.ROOT));
   }

   public static Properties id_class(InputStream var0, String var1) {
      if (var0 == null) {
         return null;
      } else {
         try {
            rrzE_2 var2 = new rrzE_2();
            var2.load(var0);
            var0.close();
            return var2;
         } catch (FileNotFoundException var3) {
            return null;
         } catch (IOException var4) {
            return null;
         }
      }
   }

   public static String[] id_class(String var0, String var1) {
      return id_class(new String[]{var0}, new String[]{var1});
   }

   public static String[] id_class(String[] var0, String[] var1) {
      LinkedHashSet var2 = new LinkedHashSet();
      rAC[] var3 = rrbb_3.d();

      for (int var4 = 0; var4 < var3.length; var4++) {
         rAC var5 = var3[var4];
         String[] var6 = id_class(var5, var0, var1, (String[])null);
         var2.addAll(Arrays.asList(var6));
      }

      return var2.toArray(new String[var2.size()]);
   }

   public static String[] id_class(rAC var0, String var1, String var2, String[] var3) {
      return id_class(var0, new String[]{var1}, new String[]{var2}, var3);
   }

   public static String[] id_class(rAC var0, String[] var1, String[] var2) {
      return id_class(var0, var1, var2, (String[])null);
   }

   public static String[] id_class(rAC var0, String[] var1, String[] var2, String[] var3) {
      if (var0 instanceof rAY) {
         return id_class(var0, var3);
      } else {
         if (var0 instanceof jg_3) {
            rAC var4 = (rAC)rrxr_3.id_class(var0, rrxr_3.Sk);
            if (var4 == null) {
               rrbb_3.id_protected("LegacyResourcePackWrapper base resource pack not found: " + var0);
               return new String[0];
            }

            var0 = var4;
         }

         if (var0 instanceof jR_2) {
            rAC var6 = (rAC)rrxr_3.id_class(var0, rrxr_3.Sz);
            if (var6 == null) {
               rrbb_3.id_protected("LegacyResourcePackWrapperV4 base resource pack not found: " + var0);
               return new String[0];
            }

            var0 = var6;
         }

         if (!(var0 instanceof rAH var7)) {
            rrbb_3.id_protected("Unknown resource pack type: " + var0);
            return new String[0];
         } else {
            File var5 = var7.id_break;
            if (var5 == null) {
               return new String[0];
            } else if (var5.isDirectory()) {
               return id_class(var5, "", var1, var2);
            } else if (var5.isFile()) {
               return id_class(var5, var1, var2);
            } else {
               rrbb_3.id_protected("Unknown resource pack file: " + var5);
               return new String[0];
            }
         }
      }
   }

   public static Properties id_break(String var0, String var1) {
      rqO_2 var2 = new rqO_2(var0);

      try {
         InputStream var3 = rrbb_3.id_class(var2);
         if (var3 == null) {
            return null;
         } else {
            rrzE_2 var4 = new rrzE_2();
            var4.load(var3);
            var3.close();
            rrbb_3.id_byte(var1 + ": Loading " + var0);
            return var4;
         }
      } catch (FileNotFoundException var5) {
         return null;
      } catch (IOException var6) {
         rrbb_3.id_protected(var1 + ": Error reading " + var0);
         return null;
      }
   }
}

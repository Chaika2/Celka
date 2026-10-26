package celestial;

import java.util.Locale;

public enum gc_3 {
   B,
   KB,
   MB,
   GB;

   public static double class_(long var0, gc_3 var2) {
      return var2 == B ? (double)var0 : (double)var0 / Math.pow(1024.0, (double)var2.ordinal());
   }

   public static gc_3 class_(long var0) {
      if (var0 < 1024L) {
         return B;
      } else {
         try {
            int var2 = (int)(Math.log((double)var0) / Math.log(1024.0));
            String var3 = String.valueOf("KMGTPE".charAt(var2 - 1));
            return valueOf(var3 + "B");
         } catch (Exception var4) {
            return GB;
         }
      }
   }

   public static String break_(long var0) {
      short var2 = 1024;
      if (var0 < 1024L) {
         return var0 + " B";
      } else {
         int var3 = (int)(Math.log((double)var0) / Math.log(1024.0));
         String var4 = "KMGTPE".charAt(var3 - 1) + "";
         return String.format(Locale.ROOT, "%.1f %sB", (double)var0 / Math.pow(1024.0, (double)var3), var4);
      }
   }

   public static String break_(long var0, gc_3 var2) {
      return String.format("%." + (var2 == GB ? "1" : "0") + "f %s", class_(var0, var2), var2.name());
   }
}

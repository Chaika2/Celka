package celestial;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.Duration;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

public class rql_3 {
   private static final Pattern id_class = Pattern.compile("(?i)\\u00A7[0-9A-FK-OR]");

   public static String id_class(String var0, char var1) {
      if (var0 != null && var0.length() >= 4) {
         try {
            DecimalFormatSymbols var2 = new DecimalFormatSymbols();
            var2.setGroupingSeparator(var1);
            DecimalFormat var3 = new DecimalFormat("#,###", var2);
            var3.setMaximumFractionDigits(0);
            return var3.format(Double.parseDouble(var0));
         } catch (NumberFormatException var4) {
            return var0;
         }
      } else {
         return var0;
      }
   }

   public static String id_class(Duration var0, rqy_3... var1) {
      if (var1.length == 0) {
         var1 = rqy_3.ALL_VALUES;
      }

      long var2 = var0.toDaysPart();
      long var4 = (long)var0.toHoursPart();
      long var6 = (long)var0.toMinutesPart();
      long var8 = (long)var0.toSecondsPart();
      StringBuilder var10 = new StringBuilder();

      for (rqy_3 var14 : var1) {
         switch (var14) {
            case DAYS:
               if (var2 > 0L) {
                  var10.append(var2).append("д ");
               }
               break;
            case HOURS:
               if (var4 > 0L) {
                  var10.append(var4).append("ч ");
               }
               break;
            case MINUTES:
               if (var6 > 0L) {
                  var10.append(var6).append("м ");
               }
               break;
            case SECONDS:
               var10.append(var8).append("с");
         }
      }

      return var10.toString();
   }

   public static String id_class(long var0, String... var2) {
      var0 = Math.abs(var0) % 100L;
      long var3 = var0 % 10L;
      if (var0 >= 11L && var0 <= 19L) {
         return var2[Math.max(0, var2.length - 1)];
      } else if (var3 >= 2L && var3 <= 4L) {
         return var2[Math.max(0, var2.length - 2)];
      } else {
         return var3 == 1L ? var2[Math.max(0, var2.length - 3)] : var2[Math.max(0, var2.length - 1)];
      }
   }

   public static String id_class(Number var0, char var1) {
      if (var0 == null) {
         return "null";
      } else {
         DecimalFormatSymbols var2 = new DecimalFormatSymbols();
         var2.setGroupingSeparator(var1);
         DecimalFormat var3 = new DecimalFormat("#,###", var2);
         var3.setMaximumFractionDigits(0);
         return var3.format(var0);
      }
   }

   public static String id_class(String var0) {
      return id_class.matcher(var0).replaceAll("");
   }

   public static String id_class(float var0) {
      return (float)((int)(var0 * 10.0F)) / 10.0F + "";
   }

   public static String id_class(int var0) {
      int var1 = var0 / 20;
      int var2 = var1 / 60;
      var1 %= 60;
      return var1 < 10 ? var2 + ":0" + var1 : var2 + ":" + var1;
   }

   public static boolean id_break(String var0) {
      return StringUtils.isEmpty(var0);
   }
}

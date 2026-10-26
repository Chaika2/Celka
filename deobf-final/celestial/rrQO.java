package celestial;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.attribute.PosixFilePermission;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.PatternSyntaxException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQO {
   private static boolean[] break_;
   private static long[] byte_;
   private static byte[] protected_;
   private static String[] throws_;
   private static short[] case_;
   public static Object[] class_;

   public static long byte_(long var0) {
      return TimeUnit.SECONDS.convert(var0, TimeUnit.MILLISECONDS);
   }

   private static void byte_() {
      throws_ = new String[]{
         new String(".^$+{[]|()"),
         new String("\\*?[{"),
         new String("^"),
         new String("No character to escape"),
         new String("[[^/]&&["),
         new String("\\^"),
         new String("Explicit 'name separator' in class"),
         new String("Invalid range"),
         new String("Invalid range"),
         new String("Missing ']"),
         new String("]]"),
         new String("Cannot nest groups"),
         new String("(?:(?:"),
         new String("))"),
         new String(")|(?:"),
         new String(".*"),
         new String("[^/]*"),
         new String("[^/]"),
         new String("Missing '}"),
         new String(".^$+{[]|()"),
         new String("\\*?[{")
      };
   }

   static {
      ntfClinit();
   }

   private static char class_(String var0, int var1) {
      return var1 < var0.length() ? var0.charAt(var1) : (Character)class_['\f'];
   }

   private static long class_(int var0, int var1, int var2, int var3, int var4, int var5) {
      return new Date(var0 - 1900, var1 - 1, var2, var3, var4, var5).getTime();
   }

   public static void class_(OutputStream var0, byte[] var1, int var2, int var3) throws IOException {
      var0.write(var1, var2, var3);
   }

   public static String class_(String var0) {
      boolean var1 = false;
      StringBuilder var2 = new StringBuilder("^");
      int var3 = 0;

      label118:
      while (var3 < var0.length()) {
         char var4 = var0.charAt(var3++);
         switch (var4) {
            case '*':
               if (class_(var0, var3) == '*') {
                  var2.append(".*");
                  var3++;
               } else {
                  var2.append("[^/]*");
               }
               break;
            case ',':
               if (var1) {
                  var2.append(")|(?:");
               } else {
                  var2.append(',');
               }
               break;
            case '/':
               var2.append(var4);
               break;
            case '?':
               var2.append("[^/]");
               break;
            case '[':
               var2.append("[[^/]&&[");
               if (class_(var0, var3) == '^') {
                  var2.append("\\^");
                  var3++;
               } else {
                  if (class_(var0, var3) == '!') {
                     var2.append('^');
                     var3++;
                  }

                  if (class_(var0, var3) == '-') {
                     var2.append('-');
                     var3++;
                  }
               }

               boolean var6 = break_[17];
               char var7 = 0;

               while (true) {
                  if (var3 < var0.length()) {
                     var4 = var0.charAt(var3++);
                     if (var4 != ']') {
                        if (var4 == '/') {
                           throw new PatternSyntaxException("Explicit 'name separator' in class", var0, var3 - 1);
                        }

                        if (var4 == '\\' || var4 == '[' || var4 == '&' && class_(var0, var3) == '&') {
                           var2.append('\\');
                        }

                        var2.append(var4);
                        if (var4 != '-') {
                           var6 = break_[22];
                           var7 = var4;
                           continue;
                        }

                        if (!var6) {
                           throw new PatternSyntaxException("Invalid range", var0, var3 - 1);
                        }

                        if ((var4 = class_(var0, var3++)) != (Character)class_[12] && var4 != ']') {
                           if (var4 < var7) {
                              throw new PatternSyntaxException("Invalid range", var0, var3 - 3);
                           }

                           var2.append(var4);
                           var6 = false;
                           continue;
                        }
                     }
                  }

                  if (var4 != ']') {
                     throw new PatternSyntaxException("Missing ']", var0, var3 - 1);
                  }

                  var2.append("]]");
                  continue label118;
               }
            case '\\':
               if (var3 == var0.length()) {
                  throw new PatternSyntaxException("No character to escape", var0, var3 - 1);
               }

               char var5 = var0.charAt(var3++);
               if (break_(var5) || class_(var5)) {
                  var2.append('\\');
               }

               var2.append(var5);
               break;
            case '{':
               if (var1) {
                  throw new PatternSyntaxException("Cannot nest groups", var0, var3 - 1);
               }

               var2.append("(?:(?:");
               var1 = true;
               break;
            case '}':
               if (var1) {
                  var2.append("))");
                  var1 = false;
               } else {
                  var2.append('}');
               }
               break;
            default:
               if (class_(var4)) {
                  var2.append('\\');
               }

               var2.append(var4);
         }
      }

      if (var1) {
         throw new PatternSyntaxException("Missing '}", var0, var3 - 1);
      } else {
         return var2.append('$').toString();
      }
   }

   public static int class_(Set<PosixFilePermission> var0) {
      if (var0 == null) {
         return -1;
      } else {
         int var1 = break_[2];

         for (PosixFilePermission var3 : var0) {
            var1 |= class_(var3);
         }

         return var1;
      }
   }

   private static boolean class_(char var0) {
      return ".^$+{[]|()".indexOf(var0) != -1 ? true : break_[11];
   }

   public static void class_(OutputStream var0, int var1) throws IOException {
      var0.write(var1 & 0xFF);
      var0.write(var1 >>> 8 & 0xFF);
   }

   public static int class_(PosixFilePermission var0) {
      switch (((int[])rrQh_1.class_[0])[var0.ordinal()]) {
         case 1:
            return case_[1];
         case 2:
            return case_[2];
         case 3:
            return protected_[0];
         case 4:
            return protected_[1];
         case 5:
            return protected_[2];
         case 6:
            return protected_[3];
         case 7:
            return protected_[4];
         case 8:
            return protected_[5];
         case 9:
            return break_[0];
         default:
            return break_[1];
      }
   }

   public static void class_(OutputStream var0, long var1) throws IOException {
      var0.write((int)(var1 & 255L));
      var0.write((int)(var1 >>> 8 & 255L));
      var0.write((int)(var1 >>> 16 & 255L));
      var0.write((int)(var1 >>> 24 & 255L));
      var0.write((int)(var1 >>> 32 & 255L));
      var0.write((int)(var1 >>> 40 & 255L));
      var0.write((int)(var1 >>> 48 & 255L));
      var0.write((int)(var1 >>> 56 & 255L));
   }

   public static long class_(long var0) {
      return (TimeUnit.MICROSECONDS.convert(var0, TimeUnit.MILLISECONDS) - -11644473600000000L) * 10L;
   }

   public static byte[] class_(byte[] var0) {
      if (var0.length != 0 && var0[var0.length - 1] != 47) {
         var0 = Arrays.copyOf(var0, var0.length + 1);
         var0[var0.length - 1] = 47;
      }

      return var0;
   }

   public static void class_(OutputStream var0, byte[] var1) throws IOException {
      var0.write(var1, 0, var1.length);
   }

   private static void class_() {
      case_ = new short[]{0, 256, 128, 255, 255, 1900, 1980, 12, 12, 256, 128};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -675014720;
   }

   private static boolean break_(char var0) {
      return "\\*?[{".indexOf(var0) != -1 ? true : break_[13];
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-17, -32, 78, 4, -16, 8, -58, -88}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static long break_(long var0) {
      int var2 = (int)((var0 >> 25 & 127L) + 1980L);
      int var3 = (int)(var0 >> 21 & 15L);
      int var4 = (int)(var0 >> 16 & 31L);
      int var5 = (int)(var0 >> 11 & 31L);
      int var6 = (int)(var0 >> 5 & 63L);
      int var7 = (int)(var0 << 1 & 62L);
      if (var3 > 0 && var3 < 13 && var4 > 0 && var5 < 24 && var6 < 60 && var7 < 60) {
         try {
            LocalDateTime var8 = LocalDateTime.of(var2, var3, var4, var5, var6, var7);
            return TimeUnit.MILLISECONDS.convert(var8.toEpochSecond(ZoneId.systemDefault().getRules().getOffset(var8)), TimeUnit.SECONDS);
         } catch (DateTimeException var9) {
         }
      }

      return class_(var2, var3, var4, var5, var6, var7);
   }

   private static void break_() {
      byte_ = new long[]{
         255L,
         255L,
         255L,
         255L,
         255L,
         255L,
         255L,
         255L,
         255L,
         255L,
         255L,
         255L,
         127L,
         1980L,
         15L,
         31L,
         31L,
         63L,
         62L,
         2162688L,
         4294967295L,
         10L,
         -11644473600000000L,
         -11644473600000000L,
         10L,
         -11644473600000000L
      };
   }

   public static void break_(OutputStream var0, long var1) throws IOException {
      var0.write((int)(var1 & 255L));
      var0.write((int)(var1 >>> 8 & 255L));
      var0.write((int)(var1 >>> 16 & 255L));
      var0.write((int)(var1 >>> 24 & 255L));
   }

   private static void throws_() {
      break_ = new boolean[]{
         true,
         false,
         false,
         false,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         false
      };
   }

   public static long throws_(long var0) {
      return TimeUnit.MILLISECONDS.convert(var0, TimeUnit.SECONDS);
   }

   private static long catch_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4964372555889935931L;
   }

   public static long case_(long var0) {
      Instant var2 = Instant.ofEpochMilli(var0);
      LocalDateTime var3 = LocalDateTime.ofInstant(var2, ZoneId.systemDefault());
      int var4 = var3.getYear() - 1980;
      return var4 < 0
         ? 2162688L
         : (long)(var4 << 25 | var3.getMonthValue() << 21 | var3.getDayOfMonth() << 16 | var3.getHour() << 11 | var3.getMinute() << 5 | var3.getSecond() >> 1)
            & 4294967295L;
   }

   private static void case_() {
      Object[] var0 = new Object[]{256, 128, 64, 32, 16, 8, 4, 2, 1, -11644473600000000L, ".^$+{[]|()", "\\*?[{", '\u0000'};
      class_ = var0;
   }

   public static long protected_(long var0) {
      return TimeUnit.MILLISECONDS.convert(var0 / 10L + -11644473600000000L, TimeUnit.MICROSECONDS);
   }

   private static void protected_() {
      protected_ = new byte[]{
         64,
         32,
         16,
         8,
         4,
         2,
         -1,
         8,
         8,
         16,
         24,
         8,
         16,
         24,
         32,
         40,
         48,
         56,
         47,
         47,
         25,
         21,
         16,
         11,
         5,
         13,
         24,
         60,
         60,
         25,
         21,
         16,
         11,
         5,
         -1,
         -1,
         92,
         94,
         33,
         94,
         45,
         45,
         93,
         47,
         92,
         91,
         38,
         38,
         92,
         45,
         93,
         3,
         93,
         125,
         44,
         42,
         92,
         36,
         12,
         13,
         2,
         64,
         3,
         32,
         4,
         16,
         5,
         8,
         6,
         4,
         7,
         2,
         8,
         9,
         10,
         11,
         12
      };
   }
}

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
   private static boolean[] id_break;
   private static long[] id_byte;
   private static byte[] id_protected;
   private static String[] id_throws;
   private static short[] id_case;
   public static Object[] id_class;

   public static long id_byte(long var0) {
      return TimeUnit.SECONDS.convert(var0, TimeUnit.MILLISECONDS);
   }

   private static void id_byte() {
      id_throws = new String[]{
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

   private static char id_class(String var0, int var1) {
      return var1 < var0.length() ? var0.charAt(var1) : (Character)id_class['\f'];
   }

   private static long id_class(int var0, int var1, int var2, int var3, int var4, int var5) {
      return new Date(var0 - 1900, var1 - 1, var2, var3, var4, var5).getTime();
   }

   public static void id_class(OutputStream var0, byte[] var1, int var2, int var3) throws IOException {
      var0.write(var1, var2, var3);
   }

   public static String id_class(String var0) {
      boolean var1 = false;
      StringBuilder var2 = new StringBuilder("^");
      int var3 = 0;

      label118:
      while (var3 < var0.length()) {
         char var4 = var0.charAt(var3++);
         switch (var4) {
            case '*':
               if (id_class(var0, var3) == '*') {
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
               if (id_class(var0, var3) == '^') {
                  var2.append("\\^");
                  var3++;
               } else {
                  if (id_class(var0, var3) == '!') {
                     var2.append('^');
                     var3++;
                  }

                  if (id_class(var0, var3) == '-') {
                     var2.append('-');
                     var3++;
                  }
               }

               boolean var6 = id_break[17];
               char var7 = 0;

               while (true) {
                  if (var3 < var0.length()) {
                     var4 = var0.charAt(var3++);
                     if (var4 != ']') {
                        if (var4 == '/') {
                           throw new PatternSyntaxException("Explicit 'name separator' in class", var0, var3 - 1);
                        }

                        if (var4 == '\\' || var4 == '[' || var4 == '&' && id_class(var0, var3) == '&') {
                           var2.append('\\');
                        }

                        var2.append(var4);
                        if (var4 != '-') {
                           var6 = id_break[22];
                           var7 = var4;
                           continue;
                        }

                        if (!var6) {
                           throw new PatternSyntaxException("Invalid range", var0, var3 - 1);
                        }

                        if ((var4 = id_class(var0, var3++)) != (Character)id_class[12] && var4 != ']') {
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
               if (id_break(var5) || id_class(var5)) {
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
               if (id_class(var4)) {
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

   public static int id_class(Set<PosixFilePermission> var0) {
      if (var0 == null) {
         return -1;
      } else {
         int var1 = id_break[2];

         for (PosixFilePermission var3 : var0) {
            var1 |= id_class(var3);
         }

         return var1;
      }
   }

   private static boolean id_class(char var0) {
      return ".^$+{[]|()".indexOf(var0) != -1 ? true : id_break[11];
   }

   public static void id_class(OutputStream var0, int var1) throws IOException {
      var0.write(var1 & 0xFF);
      var0.write(var1 >>> 8 & 0xFF);
   }

   public static int id_class(PosixFilePermission var0) {
      switch (((int[])rrQh_1.id_class[0])[var0.ordinal()]) {
         case 1:
            return id_case[1];
         case 2:
            return id_case[2];
         case 3:
            return id_protected[0];
         case 4:
            return id_protected[1];
         case 5:
            return id_protected[2];
         case 6:
            return id_protected[3];
         case 7:
            return id_protected[4];
         case 8:
            return id_protected[5];
         case 9:
            return id_break[0];
         default:
            return id_break[1];
      }
   }

   public static void id_class(OutputStream var0, long var1) throws IOException {
      var0.write((int)(var1 & 255L));
      var0.write((int)(var1 >>> 8 & 255L));
      var0.write((int)(var1 >>> 16 & 255L));
      var0.write((int)(var1 >>> 24 & 255L));
      var0.write((int)(var1 >>> 32 & 255L));
      var0.write((int)(var1 >>> 40 & 255L));
      var0.write((int)(var1 >>> 48 & 255L));
      var0.write((int)(var1 >>> 56 & 255L));
   }

   public static long id_class(long var0) {
      return (TimeUnit.MICROSECONDS.convert(var0, TimeUnit.MILLISECONDS) - -11644473600000000L) * 10L;
   }

   public static byte[] id_class(byte[] var0) {
      if (var0.length != 0 && var0[var0.length - 1] != 47) {
         var0 = Arrays.copyOf(var0, var0.length + 1);
         var0[var0.length - 1] = 47;
      }

      return var0;
   }

   public static void id_class(OutputStream var0, byte[] var1) throws IOException {
      var0.write(var1, 0, var1.length);
   }

   private static void id_class() {
      id_case = new short[]{0, 256, 128, 255, 255, 1900, 1980, 12, 12, 256, 128};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -675014720;
   }

   private static boolean id_break(char var0) {
      return "\\*?[{".indexOf(var0) != -1 ? true : id_break[13];
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-17, -32, 78, 4, -16, 8, -58, -88}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static long id_break(long var0) {
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

      return id_class(var2, var3, var4, var5, var6, var7);
   }

   private static void id_break() {
      id_byte = new long[]{
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

   public static void id_break(OutputStream var0, long var1) throws IOException {
      var0.write((int)(var1 & 255L));
      var0.write((int)(var1 >>> 8 & 255L));
      var0.write((int)(var1 >>> 16 & 255L));
      var0.write((int)(var1 >>> 24 & 255L));
   }

   private static void id_throws() {
      id_break = new boolean[]{
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

   public static long id_throws(long var0) {
      return TimeUnit.MILLISECONDS.convert(var0, TimeUnit.SECONDS);
   }

   private static long id_catch(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4964372555889935931L;
   }

   public static long id_case(long var0) {
      Instant var2 = Instant.ofEpochMilli(var0);
      LocalDateTime var3 = LocalDateTime.ofInstant(var2, ZoneId.systemDefault());
      int var4 = var3.getYear() - 1980;
      return var4 < 0
         ? 2162688L
         : (long)(var4 << 25 | var3.getMonthValue() << 21 | var3.getDayOfMonth() << 16 | var3.getHour() << 11 | var3.getMinute() << 5 | var3.getSecond() >> 1)
            & 4294967295L;
   }

   private static void id_case() {
      Object[] var0 = new Object[]{256, 128, 64, 32, 16, 8, 4, 2, 1, -11644473600000000L, ".^$+{[]|()", "\\*?[{", '\u0000'};
      id_class = var0;
   }

   public static long id_protected(long var0) {
      return TimeUnit.MILLISECONDS.convert(var0 / 10L + -11644473600000000L, TimeUnit.MICROSECONDS);
   }

   private static void id_protected() {
      id_protected = new byte[]{
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

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
      return var1 < var0.length() ? var0.charAt(var1) : (Character)id_class[id_case[7]];
   }

   private static long id_class(int var0, int var1, int var2, int var3, int var4, int var5) {
      return new Date(var0 - id_case[5], var1 - id_break[8], var2, var3, var4, var5).getTime();
   }

   public static void id_class(OutputStream var0, byte[] var1, int var2, int var3) throws IOException {
      var0.write(var1, var2, var3);
   }

   public static String id_class(String var0) {
      boolean var1 = id_break[14];
      StringBuilder var2 = new StringBuilder(id_throws[2]);
      int var3 = id_break[15];

      label118:
      while (var3 < var0.length()) {
         char var4 = var0.charAt(var3++);
         switch (var4) {
            case '*':
               if (id_class(var0, var3) == id_protected[55]) {
                  var2.append(id_throws[15]);
                  var3++;
               } else {
                  var2.append(id_throws[16]);
               }
               break;
            case ',':
               if (var1) {
                  var2.append(id_throws[14]);
               } else {
                  var2.append((char)id_protected[54]);
               }
               break;
            case '/':
               var2.append(var4);
               break;
            case '?':
               var2.append(id_throws[17]);
               break;
            case '[':
               var2.append(id_throws[4]);
               if (id_class(var0, var3) == id_protected[37]) {
                  var2.append(id_throws[5]);
                  var3++;
               } else {
                  if (id_class(var0, var3) == id_protected[38]) {
                     var2.append((char)id_protected[39]);
                     var3++;
                  }

                  if (id_class(var0, var3) == id_protected[40]) {
                     var2.append((char)id_protected[41]);
                     var3++;
                  }
               }

               boolean var6 = id_break[17];
               char var7 = id_break[18];

               while (true) {
                  if (var3 < var0.length()) {
                     var4 = var0.charAt(var3++);
                     if (var4 != id_protected[42]) {
                        if (var4 == id_protected[43]) {
                           throw new PatternSyntaxException(id_throws[6], var0, var3 - id_break[19]);
                        }

                        if (var4 == id_protected[44] || var4 == id_protected[45] || var4 == id_protected[46] && id_class(var0, var3) == id_protected[47]) {
                           var2.append((char)id_protected[48]);
                        }

                        var2.append(var4);
                        if (var4 != id_protected[49]) {
                           var6 = id_break[22];
                           var7 = var4;
                           continue;
                        }

                        if (!var6) {
                           throw new PatternSyntaxException(id_throws[7], var0, var3 - id_break[20]);
                        }

                        if ((var4 = id_class(var0, var3++)) != (Character)id_class[id_case[8]] && var4 != id_protected[50]) {
                           if (var4 < var7) {
                              throw new PatternSyntaxException(id_throws[8], var0, var3 - id_protected[51]);
                           }

                           var2.append(var4);
                           var6 = id_break[21];
                           continue;
                        }
                     }
                  }

                  if (var4 != id_protected[52]) {
                     throw new PatternSyntaxException(id_throws[9], var0, var3 - id_break[23]);
                  }

                  var2.append(id_throws[10]);
                  continue label118;
               }
            case '\\':
               if (var3 == var0.length()) {
                  throw new PatternSyntaxException(id_throws[3], var0, var3 - id_break[16]);
               }

               char var5 = var0.charAt(var3++);
               if (id_break(var5) || id_class(var5)) {
                  var2.append((char)id_protected[36]);
               }

               var2.append(var5);
               break;
            case '{':
               if (var1) {
                  throw new PatternSyntaxException(id_throws[11], var0, var3 - id_break[24]);
               }

               var2.append(id_throws[12]);
               var1 = id_break[25];
               break;
            case '}':
               if (var1) {
                  var2.append(id_throws[13]);
                  var1 = id_break[26];
               } else {
                  var2.append((char)id_protected[53]);
               }
               break;
            default:
               if (id_class(var4)) {
                  var2.append((char)id_protected[56]);
               }

               var2.append(var4);
         }
      }

      if (var1) {
         throw new PatternSyntaxException(id_throws[18], var0, var3 - id_break[27]);
      } else {
         return var2.append((char)id_protected[57]).toString();
      }
   }

   public static int id_class(Set<PosixFilePermission> var0) {
      if (var0 == null) {
         return id_protected[6];
      } else {
         int var1 = id_break[2];

         for (PosixFilePermission var3 : var0) {
            var1 |= id_class(var3);
         }

         return var1;
      }
   }

   private static boolean id_class(char var0) {
      return id_throws[0].indexOf(var0) != id_protected[34] ? id_break[10] : id_break[11];
   }

   public static void id_class(OutputStream var0, int var1) throws IOException {
      var0.write(var1 & id_case[3]);
      var0.write(var1 >>> id_protected[7] & id_case[4]);
   }

   public static int id_class(PosixFilePermission var0) {
      switch (((int[])rrQh_1.id_class[id_case[0]])[var0.ordinal()]) {
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
      var0.write((int)(var1 & id_byte[4]));
      var0.write((int)(var1 >>> id_protected[11] & id_byte[5]));
      var0.write((int)(var1 >>> id_protected[12] & id_byte[6]));
      var0.write((int)(var1 >>> id_protected[13] & id_byte[7]));
      var0.write((int)(var1 >>> id_protected[14] & id_byte[8]));
      var0.write((int)(var1 >>> id_protected[15] & id_byte[9]));
      var0.write((int)(var1 >>> id_protected[16] & id_byte[10]));
      var0.write((int)(var1 >>> id_protected[17] & id_byte[11]));
   }

   public static long id_class(long var0) {
      return (TimeUnit.MICROSECONDS.convert(var0, TimeUnit.MILLISECONDS) - id_byte[23]) * id_byte[24];
   }

   public static byte[] id_class(byte[] var0) {
      if (var0.length != 0 && var0[var0.length - id_break[4]] != id_protected[18]) {
         var0 = Arrays.copyOf(var0, var0.length + id_break[5]);
         var0[var0.length - id_break[6]] = id_protected[19];
      }

      return var0;
   }

   public static void id_class(OutputStream var0, byte[] var1) throws IOException {
      var0.write(var1, id_break[3], var1.length);
   }

   private static void id_class() {
      id_case = new short[]{0, 256, 128, 255, 255, 1900, 1980, 12, 12, 256, 128};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -675014720;
   }

   private static boolean id_break(char var0) {
      return id_throws[1].indexOf(var0) != id_protected[35] ? id_break[12] : id_break[13];
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-17, -32, 78, 4, -16, 8, -58, -88}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static long id_break(long var0) {
      int var2 = (int)((var0 >> id_protected[20] & id_byte[12]) + id_byte[13]);
      int var3 = (int)(var0 >> id_protected[21] & id_byte[14]);
      int var4 = (int)(var0 >> id_protected[22] & id_byte[15]);
      int var5 = (int)(var0 >> id_protected[23] & id_byte[16]);
      int var6 = (int)(var0 >> id_protected[24] & id_byte[17]);
      int var7 = (int)(var0 << id_break[7] & id_byte[18]);
      if (var3 > 0 && var3 < id_protected[25] && var4 > 0 && var5 < id_protected[26] && var6 < id_protected[27] && var7 < id_protected[28]) {
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
      var0.write((int)(var1 & id_byte[0]));
      var0.write((int)(var1 >>> id_protected[8] & id_byte[1]));
      var0.write((int)(var1 >>> id_protected[9] & id_byte[2]));
      var0.write((int)(var1 >>> id_protected[10] & id_byte[3]));
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
      int var4 = var3.getYear() - id_case[6];
      return var4 < 0
         ? id_byte[19]
         : (long)(
               var4 << id_protected[29]
                  | var3.getMonthValue() << id_protected[30]
                  | var3.getDayOfMonth() << id_protected[31]
                  | var3.getHour() << id_protected[32]
                  | var3.getMinute() << id_protected[33]
                  | var3.getSecond() >> id_break[9]
            )
            & id_byte[20];
   }

   private static void id_case() {
      Object[] var0 = new Object[]{256, 128, 64, 32, 16, 8, 4, 2, 1, -11644473600000000L, id_throws[19], id_throws[20], '\u0000'};
      id_class = var0;
   }

   public static long id_protected(long var0) {
      return TimeUnit.MILLISECONDS.convert(var0 / id_byte[21] + id_byte[22], TimeUnit.MICROSECONDS);
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

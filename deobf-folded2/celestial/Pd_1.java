package celestial;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pd_1 {
   private static short[] id_break;
   private static byte[] id_byte;
   public static Object[] id_class;
   private static boolean[] id_protected;
   private static String[] id_throws;

   public static String id_byte(C_extends var0) throws IllegalStateException {
      return id_throws(var0) ? var0.id_protected() : var0.id_protected() + " " + id_break(var0);
   }

   public static void id_byte(C_private var0) {
      try {
         id_class((Path)id_class[id_break[0]], var1 -> {
            Matcher var2x = ((Pattern)id_class[1]).matcher(var1);
            if (!var2x.matches()) {
               System.out.println("Invalid syntax in setting file: " + var1);
            } else {
               String var3x = var2x.group("setting").toLowerCase();
               String var4 = var2x.group("value");

               try {
                  id_class(var0, var3x, var4);
               } catch (Exception var6) {
                  System.out.println("Unable to parse line " + var1);
                  var6.printStackTrace();
               }
            }
         });
      } catch (NoSuchFileException var2) {
         System.out.println("Baritone settings file not found, resetting.");
      } catch (Exception var3) {
         System.out.println("Exception while reading Baritone settings, some settings may be reset to default values!");
         var3.printStackTrace();
      }
   }

   private static void id_byte() {
      id_break = new short[]{0, 0, 1, 0, 0, 1, 0, 1, 0, 2, 0, 0, 1};
   }

   static {
      ntfClinit();
   }

   public static <T> String id_class(C_extends<T> var0, T var1) throws IllegalArgumentException {
      PW var2 = PW.id_break(var0.id_throws());
      if (var2 == null) {
         throw new IllegalStateException("Missing " + var0.id_byte() + " " + var0.id_protected());
      } else {
         return var2.id_class(new PN(var0), var1);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5539521502553326367L;
   }

   public static String id_class(int var0) {
      return C_throws.id_break().A.id_class[0] ? "<censored>" : Integer.toString(var0);
   }

   private static void id_class(Path var0, Consumer<String> var1) throws IOException {
      String var3;
      try (BufferedReader var2 = Files.newBufferedReader(var0)) {
         while ((var3 = var2.readLine()) != null) {
            if (!var3.isEmpty() && !id_break(var3)) {
               var1.accept(var3);
            }
         }
      }
   }

   private static void id_class() {
      id_byte = new byte[]{24, 3, 2, 2, 3};
   }

   public static List<C_extends> id_class(C_private var0) {
      ArrayList var1 = new ArrayList();

      for (C_extends var3 : (List)var0.Pj[1]) {
         if (var3.id_class[0] == null) {
            System.out.println("NULL SETTING?" + var3.id_protected());
         } else if (!id_throws(var3) && var3.id_class[0] != var3.id_class[1]) {
            var1.add(var3);
         }
      }

      return var1;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{70, -117, -5, 45, -56, 79, 13, -113}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void id_class(C_private var0, String var1, String var2) throws NumberFormatException, IllegalStateException {
      C_extends var3 = (C_extends)((Map)var0.Pj[0]).get(var1);
      if (var3 == null) {
         throw new IllegalStateException("No setting by that name");
      } else {
         Class var4 = var3.id_byte();
         PW var5 = PW.id_break(var3.id_throws());
         Object var6 = var5.id_class(new PN(var3), var2);
         if (!var4.isInstance(var6)) {
            throw new IllegalStateException(var5 + " parser returned incorrect type, expected " + var4 + " got " + var6 + " which is " + var6.getClass());
         } else {
            var3.id_class[0] = var6;
         }
      }
   }

   public static String id_class(C_extends var0) throws IllegalArgumentException {
      return id_class(var0, var0.id_class[1]);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1866194371;
   }

   public static synchronized void id_break(C_private var0) {
      try (BufferedWriter var1 = Files.newBufferedWriter((Path)id_class[id_break[1]])) {
         for (C_extends var3 : id_class(var0)) {
            var1.write(id_byte(var3) + "\n");
         }
      } catch (Exception var6) {
         System.out.println("Exception thrown while saving Baritone settings!");
         var6.printStackTrace();
      }
   }

   private static boolean id_break(String var0) {
      return !var0.startsWith("#") && !var0.startsWith("//") ? id_protected[1] : id_protected[0];
   }

   public static String id_break(C_extends var0) throws IllegalArgumentException {
      return id_class(var0, var0.id_class[0]);
   }

   private static void id_break() {
      Object[] var0 = new Object[]{Paths.get("C:\\Celestial\\Beta 1.16.5\\baritone\\settings.txt"), Pattern.compile("^(?<setting>[^ ]+) +(?<value>.+)"), null};
      String[] var2 = new String[]{"logger", "notifier", "toaster"};
      var0[2] = var2;
      id_class = var0;
   }

   public static boolean id_throws(C_extends var0) {
      for (String var4 : (String[])id_class[2]) {
         if (var0.id_protected().equalsIgnoreCase(var4)) {
            return true;
         }
      }

      return id_protected[5];
   }

   private static void id_throws() {
      id_protected = new boolean[]{true, false, false, false, true, false, false, true, false, true};
   }

   private static void id_protected() {
      id_throws = new String[]{
         new String("#"),
         new String("//"),
         new String("Baritone settings file not found, resetting."),
         new String("Exception while reading Baritone settings, some settings may be reset to default values!"),
         new String("Exception thrown while saving Baritone settings!"),
         new String("(?:\\w+\\.)+(\\w+)"),
         new String("$1"),
         new String("<censored>"),
         new String("No setting by that name"),
         new String("setting"),
         new String("value"),
         new String("baritone"),
         new String("settings.txt"),
         new String("^(?<setting>[^ ]+) +(?<value>.+)"),
         new String("logger"),
         new String("notifier"),
         new String("toaster")
      };
   }

   public static String id_protected(C_extends var0) {
      return var0.id_throws().getTypeName().replaceAll("(?:\\w+\\.)+(\\w+)", "$1");
   }
}

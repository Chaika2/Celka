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
   private static short[] break_;
   private static byte[] byte_;
   public static Object[] class_;
   private static boolean[] protected_;
   private static String[] throws_;

   public static String byte_(C_extends var0) throws IllegalStateException {
      return throws_(var0) ? var0.protected_() : var0.protected_() + " " + break_(var0);
   }

   public static void byte_(C_private var0) {
      try {
         class_((Path)class_[break_[0]], var1 -> {
            Matcher var2x = ((Pattern)class_[1]).matcher(var1);
            if (!var2x.matches()) {
               System.out.println("Invalid syntax in setting file: " + var1);
            } else {
               String var3x = var2x.group("setting").toLowerCase();
               String var4 = var2x.group("value");

               try {
                  class_(var0, var3x, var4);
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

   private static void byte_() {
      break_ = new short[]{0, 0, 1, 0, 0, 1, 0, 1, 0, 2, 0, 0, 1};
   }

   static {
      ntfClinit();
   }

   public static <T> String class_(C_extends<T> var0, T var1) throws IllegalArgumentException {
      PW var2 = PW.break_(var0.throws_());
      if (var2 == null) {
         throw new IllegalStateException("Missing " + var0.byte_() + " " + var0.protected_());
      } else {
         return var2.class_(new PN(var0), var1);
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5539521502553326367L;
   }

   public static String class_(int var0) {
      return C_throws.break_().A.class_[0] ? "<censored>" : Integer.toString(var0);
   }

   private static void class_(Path var0, Consumer<String> var1) throws IOException {
      String var3;
      try (BufferedReader var2 = Files.newBufferedReader(var0)) {
         while ((var3 = var2.readLine()) != null) {
            if (!var3.isEmpty() && !break_(var3)) {
               var1.accept(var3);
            }
         }
      }
   }

   private static void class_() {
      byte_ = new byte[]{24, 3, 2, 2, 3};
   }

   public static List<C_extends> class_(C_private var0) {
      ArrayList var1 = new ArrayList();

      for (C_extends var3 : (List)var0.Pj[1]) {
         if (var3.class_[0] == null) {
            System.out.println("NULL SETTING?" + var3.protected_());
         } else if (!throws_(var3) && var3.class_[0] != var3.class_[1]) {
            var1.add(var3);
         }
      }

      return var1;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{70, -117, -5, 45, -56, 79, 13, -113}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void class_(C_private var0, String var1, String var2) throws NumberFormatException, IllegalStateException {
      C_extends var3 = (C_extends)((Map)var0.Pj[0]).get(var1);
      if (var3 == null) {
         throw new IllegalStateException("No setting by that name");
      } else {
         Class var4 = var3.byte_();
         PW var5 = PW.break_(var3.throws_());
         Object var6 = var5.class_(new PN(var3), var2);
         if (!var4.isInstance(var6)) {
            throw new IllegalStateException(var5 + " parser returned incorrect type, expected " + var4 + " got " + var6 + " which is " + var6.getClass());
         } else {
            var3.class_[0] = var6;
         }
      }
   }

   public static String class_(C_extends var0) throws IllegalArgumentException {
      return class_(var0, var0.class_[1]);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1866194371;
   }

   public static synchronized void break_(C_private var0) {
      try (BufferedWriter var1 = Files.newBufferedWriter((Path)class_[break_[1]])) {
         for (C_extends var3 : class_(var0)) {
            var1.write(byte_(var3) + "\n");
         }
      } catch (Exception var6) {
         System.out.println("Exception thrown while saving Baritone settings!");
         var6.printStackTrace();
      }
   }

   private static boolean break_(String var0) {
      return !var0.startsWith("#") && !var0.startsWith("//") ? protected_[1] : protected_[0];
   }

   public static String break_(C_extends var0) throws IllegalArgumentException {
      return class_(var0, var0.class_[0]);
   }

   private static void break_() {
      Object[] var0 = new Object[]{Paths.get("C:\\Celestial\\Beta 1.16.5\\baritone\\settings.txt"), Pattern.compile("^(?<setting>[^ ]+) +(?<value>.+)"), null};
      String[] var2 = new String[]{"logger", "notifier", "toaster"};
      var0[2] = var2;
      class_ = var0;
   }

   public static boolean throws_(C_extends var0) {
      for (String var4 : (String[])class_[2]) {
         if (var0.protected_().equalsIgnoreCase(var4)) {
            return true;
         }
      }

      return protected_[5];
   }

   private static void throws_() {
      protected_ = new boolean[]{true, false, false, false, true, false, false, true, false, true};
   }

   private static void protected_() {
      throws_ = new String[]{
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

   public static String protected_(C_extends var0) {
      return var0.throws_().getTypeName().replaceAll("(?:\\w+\\.)+(\\w+)", "$1");
   }
}

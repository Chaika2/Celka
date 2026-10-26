package celestial;

import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.SystemUtils;

public class Pb_1 {
   private static String[] break_;
   private static byte[] byte_;
   public static Object[] class_;
   private static short[] protected_;
   private static boolean[] throws_;

   private static void byte_(String var0) {
      ProcessBuilder var1 = new ProcessBuilder();
      var1.command("osascript", "-e", "display notification \"" + var0 + "\" with title \"Celestial\"");

      try {
         var1.start();
      } catch (IOException var3) {
         var3.printStackTrace();
      }
   }

   private static void byte_() {
      Object[] var0 = new Object[1];
      class_ = var0;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-48, 14, 1, -7, -117, -48, -82, 100}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void class_(String var0, boolean var1) {
      if (SystemUtils.IS_OS_WINDOWS) {
         break_(var0, var1);
      } else if (SystemUtils.IS_OS_MAC_OSX) {
         byte_(var0);
      } else if (SystemUtils.IS_OS_LINUX) {
         break_(var0);
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4778793316240208373L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1313636800;
   }

   private static void class_() {
      break_ = new String[]{
         new String(""),
         new String("Celestial"),
         new String("Celestial"),
         new String("Celestial"),
         new String("SystemTray is not supported"),
         new String("osascript"),
         new String("-e"),
         new String("notify-send"),
         new String("-a"),
         new String("Celestial")
      };
   }

   private static void break_() {
      protected_ = new short[6];
   }

   private static void break_(String var0, boolean var1) {
      if (SystemTray.isSupported()) {
         try {
            if ((TrayIcon)class_[protected_[0]] == null) {
               SystemTray var2 = SystemTray.getSystemTray();
               Image var3 = Toolkit.getDefaultToolkit().createImage(break_[0]);
               TrayIcon var8 = new TrayIcon(var3, break_[1]);
               class_[protected_[1]] = var8;
               ((TrayIcon)class_[protected_[2]]).setImageAutoSize(throws_[0]);
               ((TrayIcon)class_[protected_[3]]).setToolTip(break_[2]);
               var2.add((TrayIcon)class_[protected_[4]]);
            }

            ((TrayIcon)class_[protected_[5]]).displayMessage(break_[3], var0, var1 ? MessageType.ERROR : MessageType.INFO);
         } catch (Exception var9) {
            var9.printStackTrace();
         }
      } else {
         System.out.println("SystemTray is not supported");
      }
   }

   private static void break_(String var0) {
      ProcessBuilder var1 = new ProcessBuilder();
      var1.command("notify-send", "-a", "Celestial", var0);

      try {
         var1.start();
      } catch (IOException var3) {
         var3.printStackTrace();
      }
   }

   private static void throws_() {
      byte_ = new byte[]{3, 2, 4, 2, 3};
   }

   private static void protected_() {
      throws_ = new boolean[]{true, false, false, true, false, false, true, true};
   }
}

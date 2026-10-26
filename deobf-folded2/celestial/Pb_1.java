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
   private static String[] id_break;
   private static byte[] id_byte;
   public static Object[] id_class;
   private static short[] id_protected;
   private static boolean[] id_throws;

   private static void id_byte(String var0) {
      ProcessBuilder var1 = new ProcessBuilder();
      var1.command("osascript", "-e", "display notification \"" + var0 + "\" with title \"Celestial\"");

      try {
         var1.start();
      } catch (IOException var3) {
         var3.printStackTrace();
      }
   }

   private static void id_byte() {
      Object[] var0 = new Object[1];
      id_class = var0;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-48, 14, 1, -7, -117, -48, -82, 100}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void id_class(String var0, boolean var1) {
      if (SystemUtils.IS_OS_WINDOWS) {
         id_break(var0, var1);
      } else if (SystemUtils.IS_OS_MAC_OSX) {
         id_byte(var0);
      } else if (SystemUtils.IS_OS_LINUX) {
         id_break(var0);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4778793316240208373L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1313636800;
   }

   private static void id_class() {
      id_break = new String[]{
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

   private static void id_break() {
      id_protected = new short[6];
   }

   private static void id_break(String var0, boolean var1) {
      if (SystemTray.isSupported()) {
         try {
            if ((TrayIcon)id_class[id_protected[0]] == null) {
               SystemTray var2 = SystemTray.getSystemTray();
               Image var3 = Toolkit.getDefaultToolkit().createImage(id_break[0]);
               TrayIcon var8 = new TrayIcon(var3, id_break[1]);
               id_class[id_protected[1]] = var8;
               ((TrayIcon)id_class[id_protected[2]]).setImageAutoSize(id_throws[0]);
               ((TrayIcon)id_class[id_protected[3]]).setToolTip(id_break[2]);
               var2.add((TrayIcon)id_class[id_protected[4]]);
            }

            ((TrayIcon)id_class[id_protected[5]]).displayMessage(id_break[3], var0, var1 ? MessageType.ERROR : MessageType.INFO);
         } catch (Exception var9) {
            var9.printStackTrace();
         }
      } else {
         System.out.println("SystemTray is not supported");
      }
   }

   private static void id_break(String var0) {
      ProcessBuilder var1 = new ProcessBuilder();
      var1.command("notify-send", "-a", "Celestial", var0);

      try {
         var1.start();
      } catch (IOException var3) {
         var3.printStackTrace();
      }
   }

   private static void id_throws() {
      id_byte = new byte[]{3, 2, 4, 2, 3};
   }

   private static void id_protected() {
      id_throws = new boolean[]{true, false, false, true, false, false, true, true};
   }
}

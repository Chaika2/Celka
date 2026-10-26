package celestial;

import com.viaversion.viaversion.configuration.AbstractViaConfig;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjV_2 extends AbstractViaConfig {
   private static boolean[] break_;
   private static byte[] byte_;
   public static Object[] class_;
   private static String[] protected_;
   private static short[] throws_;

   private static void byte_() {
      throws_ = new short[1];
   }

   public rrjV_2(File var1) {
      super(var1, Logger.getLogger("ViaVersion"));
      this.reload();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1648336703;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-125, -62, 90, 42, -69, 12, -24, 28}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      Object[] var0 = new Object[1];
      String[] var2 = new String[]{
         "anti-xray-patch",
         "bungee-ping-interval",
         "bungee-ping-save",
         "bungee-servers",
         "quick-move-action-fix",
         "nms-player-ticking",
         "velocity-ping-interval",
         "velocity-ping-save",
         "velocity-servers",
         "blockconnection-method",
         "change-1_9-hitbox",
         "change-1_14-hitbox",
         "show-shield-when-sword-in-hand",
         "left-handed-handling"
      };
      var0[0] = Arrays.asList(var2);
      class_ = var0;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2707635919952831817L;
   }

   private static void break_() {
      byte_ = new byte[]{14, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
   }

   private static void throws_() {
      protected_ = new String[]{
         new String("anti-xray-patch"),
         new String("bungee-ping-interval"),
         new String("bungee-ping-save"),
         new String("bungee-servers"),
         new String("quick-move-action-fix"),
         new String("nms-player-ticking"),
         new String("velocity-ping-interval"),
         new String("velocity-ping-save"),
         new String("velocity-servers"),
         new String("blockconnection-method"),
         new String("change-1_9-hitbox"),
         new String("change-1_14-hitbox"),
         new String("show-shield-when-sword-in-hand"),
         new String("left-handed-handling")
      };
   }

   private static void protected_() {
      break_ = new boolean[]{false, true, false, true};
   }

   public void handleConfig(Map<String, Object> var1) {
   }

   public List<String> getUnsupportedOptions() {
      return (List<String>)class_[0];
   }
}

package celestial;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjl_3 implements MinecraftAccessor {
   private static byte[] break_;
   public static Object[] class_;
   private static short[] byte_;
   private static boolean[] protected_;

   private static void byte_(rhd_3 var0, an_3 var1, rpm_3 var2) {
      ((Ax_1)((QY)class_[0]).class_[55]).class_(var0, var1, false);
      ((cb_3)((QY)class_[0]).class_[57]).class_(var2);
   }

   private static void byte_() {
      break_ = new byte[]{2, 47};
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{50, 119, -114, -34, 21, 72, -92, 95}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void class_(rhd_3 var0, an_3 var1, rpm_3 var2) {
      if (rrjA_2.protected_().throws_().protected_(ProtocolVersion.v1_8)) {
         break_(var0, var1, var2);
      } else {
         byte_(var0, var1, var2);
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8006441529467008853L;
   }

   private static void class_() {
      Object[] var0 = new Object[]{MinecraftAccessor.import_, 47};
      class_ = var0;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1554393295;
   }

   public static void class_(rjG_2 var0, rpm_3 var1) {
      if (var0 != null && var0.byte_() != rjM_2.ENTITY) {
         ((cb_3)((QY)class_[0]).class_[57]).class_(var1);
      }
   }

   private static void break_() {
      protected_ = new boolean[]{false, false, false, true};
   }

   private static void break_(rhd_3 var0, an_3 var1, rpm_3 var2) {
      ((cb_3)((QY)class_[0]).class_[57]).class_(var2);
      ((Ax_1)((QY)class_[0]).class_[55]).class_(var0, var1, false);
   }

   private static void protected_() {
      byte_ = new short[]{0, 57, 0, 57, 0, 55, 0, 55, 0, 57};
   }
}

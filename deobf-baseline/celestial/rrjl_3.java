package celestial;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjl_3 implements MinecraftAccessor {
   private static byte[] id_break;
   public static Object[] id_class;
   private static short[] id_byte;
   private static boolean[] id_protected;

   private static void id_byte(rhd_3 var0, an_3 var1, rpm_3 var2) {
      ((Ax_1)((QY)id_class[id_byte[6]]).id_class[id_byte[7]]).id_class(var0, var1, id_protected[1]);
      ((cb_3)((QY)id_class[id_byte[8]]).id_class[id_byte[9]]).id_class(var2);
   }

   private static void id_byte() {
      id_break = new byte[]{2, 47};
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{50, 119, -114, -34, 21, 72, -92, 95}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void id_class(rhd_3 var0, an_3 var1, rpm_3 var2) {
      if (rrjA_2.id_protected().id_throws().id_protected(ProtocolVersion.v1_8)) {
         id_break(var0, var1, var2);
      } else {
         id_byte(var0, var1, var2);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8006441529467008853L;
   }

   private static void id_class() {
      Object[] var0 = new Object[]{MinecraftAccessor.id_import, 47};
      id_class = var0;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1554393295;
   }

   public static void id_class(rjG_2 var0, rpm_3 var1) {
      if (var0 != null && var0.id_byte() != rjM_2.ENTITY) {
         ((cb_3)((QY)id_class[id_byte[0]]).id_class[id_byte[1]]).id_class(var1);
      }
   }

   private static void id_break() {
      id_protected = new boolean[]{false, false, false, true};
   }

   private static void id_break(rhd_3 var0, an_3 var1, rpm_3 var2) {
      ((cb_3)((QY)id_class[id_byte[2]]).id_class[id_byte[3]]).id_class(var2);
      ((Ax_1)((QY)id_class[id_byte[4]]).id_class[id_byte[5]]).id_class(var0, var1, id_protected[0]);
   }

   private static void id_protected() {
      id_byte = new short[]{0, 57, 0, 57, 0, 55, 0, 55, 0, 57};
   }
}

package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum Bs_1 {
   public static Object[] staticFieldsab676614e82b32e79a1e1e0ca1d59f08;
   private static short[] shortsab676614e82b32e79a1e1e0ca1d59f08;
   private static boolean[] booleansab676614e82b32e79a1e1e0ca1d59f08;
   private static byte[] bytesab676614e82b32e79a1e1e0ca1d59f08;
   private static String[] stringsab676614e82b32e79a1e1e0ca1d59f08;

   private static void id_byte() {
      shortsab676614e82b32e79a1e1e0ca1d59f08 = new short[]{3, 0, 0, 0, 0, 0, 1, 2, 0, 1, 2};
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      bytesab676614e82b32e79a1e1e0ca1d59f08 = new byte[]{3, 2, 2, 2, 3, 4};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6063123905905738555L;
   }

   public static Bs_1 id_class(boolean var0) {
      C_private var1 = C_class.id_instanceof();
      boolean var2 = (Boolean)var1.F.id_class[shortsab676614e82b32e79a1e1e0ca1d59f08[1]];
      boolean var3 = (Boolean)var1.id_private.id_class[shortsab676614e82b32e79a1e1e0ca1d59f08[2]];
      boolean var4 = (Boolean)var1.n.id_class[shortsab676614e82b32e79a1e1e0ca1d59f08[3]];
      if (!var4) {
         return (Bs_1)staticFieldsab676614e82b32e79a1e1e0ca1d59f08[shortsab676614e82b32e79a1e1e0ca1d59f08[4]];
      } else if (!var3 && var0) {
         return (Bs_1)staticFieldsab676614e82b32e79a1e1e0ca1d59f08[shortsab676614e82b32e79a1e1e0ca1d59f08[5]];
      } else {
         return !var2 && !var0 ? (Bs_1)staticFieldsab676614e82b32e79a1e1e0ca1d59f08[2] : (Bs_1)staticFieldsab676614e82b32e79a1e1e0ca1d59f08[1];
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-118, 52, -27, -63, -8, 108, 110, 65}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1729532917;
   }

   private static void id_break() {
      booleansab676614e82b32e79a1e1e0ca1d59f08 = new boolean[]{false, true, false, false, true, true};
   }

   private static void id_throws() {
      stringsab676614e82b32e79a1e1e0ca1d59f08 = new String[]{new String("CLIENT"), new String("SERVER"), new String("NONE")};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new Bs_1(), new Bs_1(), new Bs_1(), null};
      var0[3] = new Bs_1[]{(Bs_1)var0[0], (Bs_1)var0[1], (Bs_1)var0[2]};
      staticFieldsab676614e82b32e79a1e1e0ca1d59f08 = var0;
   }
}

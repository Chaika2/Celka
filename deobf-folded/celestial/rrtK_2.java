package celestial;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrtK_2 {
   private static boolean[] booleansc4d05dcb6ab834399a1b48042de01686;
   private static short[] shortsc4d05dcb6ab834399a1b48042de01686;
   private static byte[] bytesc4d05dcb6ab834399a1b48042de01686;
   private static String[] stringsc4d05dcb6ab834399a1b48042de01686;
   public static Object[] staticFieldsc4d05dcb6ab834399a1b48042de01686;
   public Object[] fieldsc4d05dcb6ab834399a1b48042de01686;

   private rrtK_2(rrtD_2 var3) {
      this.id_break();
      this.fieldsc4d05dcb6ab834399a1b48042de01686[shortsc4d05dcb6ab834399a1b48042de01686[1]] = var3;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 568012034;
   }

   public rrtD_2 id_class() {
      return (rrtD_2)this.fieldsc4d05dcb6ab834399a1b48042de01686[shortsc4d05dcb6ab834399a1b48042de01686[2]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6248939343572301017L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-42, -82, -50, 126, -61, 94, -31, -116}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_break() {
      if (this.fieldsc4d05dcb6ab834399a1b48042de01686 == null) {
         this.fieldsc4d05dcb6ab834399a1b48042de01686 = new Object[1];
         Object[] var1 = this.fieldsc4d05dcb6ab834399a1b48042de01686;
      }
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{
         new rrtK_2(new rrtD_2(() -> rrZF.k_, () -> rrZF.k_, new Color(-65536)::getRGB)),
         new rrtK_2(new rrtD_2(() -> rrZF.d_, () -> rrZF.d_, () -> rrZF.d_)),
         new rrtK_2(new rrtD_2(() -> rrZF.d_, () -> rrZF.d_, new Color(-65536)::getRGB)),
         null
      };
      var0[3] = new rrtK_2[]{(rrtK_2)var0[0], (rrtK_2)var0[1], (rrtK_2)var0[2]};
      staticFieldsc4d05dcb6ab834399a1b48042de01686 = var0;
   }

   private static void id_finally() {
      bytesc4d05dcb6ab834399a1b48042de01686 = new byte[]{3, 2, 2, 2, 3, 4};
   }

   private static void id_extends() {
      shortsc4d05dcb6ab834399a1b48042de01686 = new short[]{3, 0, 0, 0, 1, 2};
   }

   private static void id_final() {
      stringsc4d05dcb6ab834399a1b48042de01686 = new String[]{new String("OLD"), new String("SIMPLE"), new String("MODERN")};
   }

   private static void id_volatile() {
      booleansc4d05dcb6ab834399a1b48042de01686 = new boolean[]{false, true, false, false, true, true, true};
   }
}

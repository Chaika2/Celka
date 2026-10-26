package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlx_3 extends rrTF<WaterSpeed> {
   private static short[] id_class;
   private static float[] id_break;
   private static byte[] id_byte;
   private static boolean[] id_protected;

   private static void id_byte() {
      id_byte = new byte[]{2};
   }

   public rrlx_3(WaterSpeed var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -308531360;
   }

   @EventTarget
   public void id_class(rrLd_1 var1) {
      if (!((cb_3)id_import.id_class[57]).id_break(rLD.id_interface)) {
         if (var1.id_class() != 0) {
            var1.id_class(0.022F - (((cb_3)id_import.id_class[57]).id_throws[41] % 2 == 0 ? 5.0E-5F : 1.0E-4F));
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2519820296593917357L;
   }

   @EventTarget
   public void id_class(rrAn_1 var1) {
      if (((cb_3)id_import.id_class[57]).rT()) {
         var1.id_break(id_protected[0]);
      }
   }

   private static void id_class() {
      id_class = new short[]{57, 57, 41, 57, 57};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{114, -120, -124, 51, 44, 114, 98, 120}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void id_class(rrLZ var1) {
      if (var1.id_class() instanceof rmD_2 var3 && var3.id_break() == rmU_2.PRESS_SHIFT_KEY && ((cb_3)id_import.id_class[57]).rT()) {
         var1.id_class(true);
      }
   }

   private static void id_break() {
      id_break = new float[]{0.022F, 5.0E-5F, 1.0E-4F};
   }

   private static void id_protected() {
      id_protected = new boolean[]{false, true};
   }
}

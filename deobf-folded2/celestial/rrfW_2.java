package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfW_2 extends ArrayList<rrfz_3> {
   private static boolean[] id_break;
   private static short[] id_byte;
   public Object[] id_class;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
      }
   }

   public rrfW_2(rrfk_3 var1) {
      this.id_byte();
      this.id_class[0] = var1;

      for (rrfx_3 var5 : rrfx_3.values()) {
         if (var5.id_byte()) {
            this.add(new rrfz_3((rrfk_3)this.id_class[0], var5, var5.id_break()));
         }
      }
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7512166251123763148L;
   }

   private static void id_class() {
      id_byte = new short[2];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{15, 57, 72, 62, -10, -57, 8, -35}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1133804194;
   }

   private static void id_break() {
      id_break = new boolean[]{false, true};
   }
}

package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqU_2 {
   public Object[] id_class;
   private static short[] id_break;
   private static boolean[] id_byte;
   private static byte[] id_protected;

   public String id_byte() {
      return (String)this.id_class[1];
   }

   public rrqU_2(xd_3 var1, int var2) {
      this.id_throws();
      this.id_class[0] = var1;
      Integer var8 = var2;
      this.id_class[2] = var8;
      String var9 = ri_3.id_class(var1);
      this.id_class[1] = var9;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrqU_2 var2 = (rrqU_2)var1;
         return Objects.equals((String)this.id_class[1], (String)var2.id_class[1]);
      } else {
         return id_byte[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash((String)this.id_class[1]);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1458389579365711495L;
   }

   public int id_class() {
      return (Integer)this.id_class[2];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1565206776;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-29, -43, 52, -83, 125, -36, 95, 126}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public xd_3 id_break() {
      return (xd_3)this.id_class[0];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         this.id_class[2] = 0;
      }
   }

   private static void id_catch() {
      id_protected = new byte[]{3, 2};
   }

   private static void id_case() {
      id_break = new short[]{0, 2, 1, 1, 1, 1, 0, 1, 2};
   }

   private static void id_protected() {
      id_byte = new boolean[]{true, false, true, false, false};
   }
}

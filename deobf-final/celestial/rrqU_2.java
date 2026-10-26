package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqU_2 {
   public Object[] class_;
   private static short[] break_;
   private static boolean[] byte_;
   private static byte[] protected_;

   public String byte_() {
      return (String)this.class_[1];
   }

   public rrqU_2(xd_3 var1, int var2) {
      this.throws_();
      this.class_[0] = var1;
      Integer var8 = var2;
      this.class_[2] = var8;
      String var9 = ri_3.class_(var1);
      this.class_[1] = var9;
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
         return Objects.equals((String)this.class_[1], (String)var2.class_[1]);
      } else {
         return byte_[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash((String)this.class_[1]);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1458389579365711495L;
   }

   public int class_() {
      return (Integer)this.class_[2];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1565206776;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-29, -43, 52, -83, 125, -36, 95, 126}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public xd_3 break_() {
      return (xd_3)this.class_[0];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         this.class_[2] = 0;
      }
   }

   private static void catch_() {
      protected_ = new byte[]{3, 2};
   }

   private static void case_() {
      break_ = new short[]{0, 2, 1, 1, 1, 1, 0, 1, 2};
   }

   private static void protected_() {
      byte_ = new boolean[]{true, false, true, false, false};
   }
}

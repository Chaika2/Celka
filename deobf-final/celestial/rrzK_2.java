package celestial;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzK_2 extends rrzA_2 {
   private static byte[] protected_;
   private static long[] throws_;
   public Object[] byte_;
   private static short[] case_;
   private static boolean[] catch_;

   public rrzK_2(rrzf_3 var1, rrzY_2 var2) {
      super(var2.class_[12] > 0L ? (int)((Long)var2.class_[12]).longValue() : case_[2], catch_[0]);
      this.private_();
      this.byte_[1] = var1;
      this.byte_[0] = var2;
      if ((Long)var2.class_[7] == -1L) {
         Long var9 = System.currentTimeMillis();
         var2.class_[7] = var9;
      }

      if ((Integer)var2.class_[6] == -1) {
         Integer var10 = (Integer)var1.break_[10];
         var2.class_[6] = var10;
      }

      Integer var11 = 8;
      var2.class_[4] = var11;
      if (((rrzC_2)var1.break_[2]).class_()) {
         Integer var12 = (Integer)var2.class_[4] | 2048;
         var2.class_[4] = var12;
      }
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 971816897;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5717085891434347488L;
   }

   @Override
   public void close() throws IOException {
      this.private_();
      super.break_();

      try {
         if (this.isOpen()) {
            try (OutputStream var1 = ((rrzf_3)this.byte_[case_[15]]).break_((rrzY_2)this.byte_[case_[16]])) {
               var1.write(this.class_());
            }

            super.close();
            return;
         }
      } finally {
         super.byte_();
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-35, -90, -23, -26, -104, -118, -24, 50}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      catch_ = new boolean[1];
   }

   private static void catch_() {
      throws_ = new long[]{0L, -1L};
   }

   private static void case_() {
      case_ = new short[]{12, 12, 8192, 1, 0, 7, 7, 6, 10, 6, 4, 2, 4, 2048, 4, 1, 0};
   }

   private static void protected_() {
      protected_ = new byte[]{-1, 8, 2};
   }

   private void private_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[2];
         Object[] var1 = this.byte_;
      }
   }
}

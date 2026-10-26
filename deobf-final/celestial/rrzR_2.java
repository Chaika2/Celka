package celestial;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzR_2 {
   private static byte[] break_;
   private static int[] byte_;
   private static boolean[] protected_;
   private static long[] throws_;
   public Object[] class_;
   private static short[] case_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
         var1[0] = 0;
         var1[1] = 0L;
         var1[2] = 0L;
         var1[3] = 0L;
      }
   }

   public rrzR_2() {
      this.byte_();
   }

   static {
      ntfClinit();
   }

   public void class_(OutputStream var1, long var2, boolean var4) throws IOException {
      boolean var5 = var4;
      long var6 = (Long)this.class_[1];
      long var8 = (Long)this.class_[2];
      if (var6 >= 4294967295L) {
         var6 = 4294967295L;
         var5 = true;
      }

      if (var8 >= 4294967295L) {
         var8 = 4294967295L;
         var5 = true;
      }

      int var10 = (Integer)this.class_[0];
      if (var10 >= 65535) {
         var10 = 65535;
         var5 = true;
      }

      if (var5) {
         rrQO.break_(var1, 101075792L);
         rrQO.class_(var1, 44L);
         rrQO.class_(var1, 45);
         rrQO.class_(var1, 45);
         rrQO.break_(var1, 0L);
         rrQO.break_(var1, 0L);
         rrQO.class_(var1, (long)((Integer)this.class_[0]).intValue());
         rrQO.class_(var1, (long)((Integer)this.class_[0]).intValue());
         rrQO.class_(var1, (Long)this.class_[1]);
         rrQO.class_(var1, (Long)this.class_[2]);
         rrQO.break_(var1, 117853008L);
         rrQO.break_(var1, 0L);
         rrQO.class_(var1, var2);
         rrQO.break_(var1, 1L);
      }

      rrQO.break_(var1, (Long)rrzH_2.class_[13]);
      rrQO.class_(var1, 0);
      rrQO.class_(var1, 0);
      rrQO.class_(var1, var10);
      rrQO.class_(var1, var10);
      rrQO.break_(var1, var6);
      rrQO.break_(var1, var8);
      rrQO.class_(var1, 0);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5765539680119562065L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1395636363;
   }

   private static void class_() {
      throws_ = new long[]{4294967295L, 4294967295L, 4294967295L, 4294967295L, 101075792L, 44L, 0L, 0L, 117853008L, 0L, 1L, 0L, 0L, 0L};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{108, 114, -27, 19, 109, 83, -84, -7}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      break_ = new byte[]{45, 45, 4, 2, 3};
   }

   private static void throws_() {
      byte_ = new int[]{65535, 65535};
   }

   private static void case_() {
      case_ = new short[]{1, 2, 0, 0, 0, 1, 2, 13};
   }

   private static void protected_() {
      protected_ = new boolean[]{true, true, true, false, false, false, false, false, true};
   }
}

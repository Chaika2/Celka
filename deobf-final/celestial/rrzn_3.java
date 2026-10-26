package celestial;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzn_3 extends InputStream {
   public Object[] class_;
   public static Object[] break_;
   private static byte[] byte_;
   private static boolean[] protected_;
   private static short[] throws_;
   private static long[] case_;

   private static void byte_() {
      Object[] var0 = new Object[]{2048};
      break_ = var0;
   }

   public rrzn_3(InputStream var1, byte[] var2) {
      this.break_();
      this.class_[0] = var1;
      this.class_[1] = var2;
   }

   static {
      ntfClinit();
   }

   @Override
   public synchronized void reset() throws IOException {
      ((InputStream)this.class_[0]).reset();
   }

   private int class_(int var1) throws IOException {
      if (var1 == 0) {
         return 0;
      } else {
         int var2 = ((InputStream)this.class_[0]).read();
         Integer var9 = (Integer)this.class_[2] + 1;
         this.class_[2] = var9;
         if (var2 == -1) {
            return -1;
         } else {
            int var3 = protected_[3];

            try {
               while (var3 < var1) {
                  var2 = ((InputStream)this.class_[throws_[17]]).read();
                  Integer var10 = (Integer)this.class_[throws_[18]] + protected_[4];
                  this.class_[throws_[19]] = var10;
                  if (var2 == byte_[3]) {
                     break;
                  }

                  var3++;
               }
            } catch (IOException var11) {
            }

            return var3;
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -892998526538164534L;
   }

   private static void class_() {
      protected_ = new boolean[]{true, false, true, true, true, false, true, false};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{66, 78, -58, 119, -43, -33, 26, 33}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public int read() throws IOException {
      int var1 = ((InputStream)this.class_[0]).read();
      Integer var6 = (Integer)this.class_[2] + 1;
      this.class_[2] = var6;
      return var1 == -1 ? var1 : (var1 ^ ((byte[])this.class_[1])[this.class_[2] % ((byte[])this.class_[1]).length]) & 0xFF;
   }

   @Override
   public void close() throws IOException {
      ((InputStream)this.class_[0]).close();
   }

   @Override
   public synchronized void mark(int var1) {
      ((InputStream)this.class_[0]).mark(var1);
   }

   @Override
   public long skip(long var1) throws IOException {
      long var3 = var1;
      if (var1 <= 0L) {
         return 0L;
      } else {
         int var6 = (int)Math.min(case_[2], var1);

         while (var3 > 0L) {
            int var5 = this.class_((int)Math.min((long)var6, var3));
            if (var5 < 0) {
               break;
            }

            var3 -= (long)var5;
         }

         return var1 - var3;
      }
   }

   @Override
   public int available() throws IOException {
      return ((InputStream)this.class_[0]).available();
   }

   @Override
   public boolean markSupported() {
      return ((InputStream)this.class_[0]).markSupported();
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[2] = 0;
      }
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1179867613;
   }

   private static void throws_() {
      byte_ = new byte[]{-1, -1, -1, -1, 3, 2};
   }

   private static void case_() {
      throws_ = new short[]{0, 1, 0, 0, 0, 0, 0, 0, 2, 2, 1, 2, 1, 255, 0, 2, 2, 0, 2, 2, 2048};
   }

   private static void protected_() {
      case_ = new long[]{0L, 0L, 2048L, 0L};
   }
}

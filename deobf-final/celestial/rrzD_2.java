package celestial;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzD_2 extends FilterOutputStream {
   private static long[] break_;
   private static byte[] byte_;
   public Object[] class_;
   private static boolean[] protected_;
   private static short[] throws_;
   private static String[] case_;

   private static void byte_() {
      byte_ = new byte[]{4, 2};
   }

   public rrzD_2(rrzf_3 var1, rrzY_2 var2, OutputStream var3) {
      super(var3);
      this.case_();
      this.class_[3] = var1;
      rrzY_2 var9 = Objects.requireNonNull(var2, "Zip entry is null");
      this.class_[0] = var9;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{85, 49, 34, 114, 86, -92, 44, 121}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      case_ = new String[]{new String("Zip entry is null")};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1155999088626740011L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -927287916;
   }

   @Override
   public synchronized void write(int var1) throws IOException {
      this.out.write(var1);
      Long var6 = (Long)this.class_[1] + 1L;
      this.class_[1] = var6;
   }

   @Override
   public synchronized void write(byte[] var1, int var2, int var3) throws IOException {
      this.out.write(var1, var2, var3);
      Long var8 = (Long)this.class_[1] + (long)var3;
      this.class_[1] = var8;
   }

   @Override
   public synchronized void close() throws IOException {
      if (!(Boolean)this.class_[2]) {
         Boolean var7 = true;
         this.class_[2] = var7;
         rrzY_2 var10000 = (rrzY_2)this.class_[0];
         Long var8 = (Long)this.class_[1];
         var10000.class_[12] = var8;
         if (this.out instanceof rrza_3 var1 && (OutputStream)var1.class_[2] == null) {
            var10000 = (rrzY_2)this.class_[0];
            byte[] var9 = var1.byte_();
            var10000.class_[0] = var9;
         }

         super.close();
         ((rrzf_3)this.class_[3]).class_((rrzY_2)this.class_[0]);
      }
   }

   private static void break_() {
      break_ = new long[]{1L, 0L};
   }

   private static void throws_() {
      protected_ = new boolean[]{true, true, false};
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
         var1[1] = 0L;
         var1[2] = false;
      }
   }

   private static void protected_() {
      throws_ = new short[]{3, 0, 1, 1, 1, 1, 2, 2, 0, 1, 12, 2, 0, 0, 3, 0};
   }
}

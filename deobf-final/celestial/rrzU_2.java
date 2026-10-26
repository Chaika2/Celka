package celestial;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.zip.CRC32;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzU_2 extends FilterOutputStream {
   private static short[] break_;
   private static String[] byte_;
   public Object[] class_;
   private static byte[] protected_;
   private static boolean[] throws_;
   private static long[] case_;

   private static void byte_() {
      protected_ = new byte[]{4, 2, 3};
   }

   public rrzU_2(rrzf_3 var1, rrzY_2 var2, OutputStream var3) {
      super(var3);
      this.protected_();
      rrzY_2 var8 = Objects.requireNonNull(var2, "Zip entry is null");
      this.class_[1] = var8;
      CRC32 var9 = new CRC32();
      this.class_[0] = var9;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{24, 27, 8, -9, 43, 68, 61, -40}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -38485650;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8399667670453300484L;
   }

   private static void class_() {
      throws_ = new boolean[]{true, false};
   }

   @Override
   public void write(int var1) throws IOException {
      this.out.write(var1);
      ((CRC32)this.class_[0]).update(var1);
      Long var6 = (Long)this.class_[2] + 1L;
      this.class_[2] = var6;
   }

   @Override
   public void write(byte[] var1, int var2, int var3) throws IOException {
      this.out.write(var1, var2, var3);
      ((CRC32)this.class_[0]).update(var1, var2, var3);
      Long var8 = (Long)this.class_[2] + (long)var3;
      this.class_[2] = var8;
   }

   @Override
   public void close() {
      if (!(Boolean)this.class_[3]) {
         Boolean var5 = true;
         this.class_[3] = var5;
         rrzY_2 var10000 = (rrzY_2)this.class_[1];
         rrzY_2 var10001 = (rrzY_2)this.class_[1];
         long var10003 = (Long)this.class_[2];
         Long var6 = var10003;
         var10001.class_[11] = var6;
         Long var7 = var10003;
         var10000.class_[12] = var7;
         var10000 = (rrzY_2)this.class_[1];
         Long var8 = ((CRC32)this.class_[0]).getValue();
         var10000.class_[10] = var8;
      }
   }

   private static void break_() {
      byte_ = new String[]{new String("Zip entry is null")};
   }

   private static void throws_() {
      case_ = new long[]{1L, 0L};
   }

   private static void case_() {
      break_ = new short[]{1, 0, 0, 2, 2, 0, 2, 2, 3, 3, 1, 1, 2, 11, 12, 1, 0, 10};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
         var1[2] = 0L;
         var1[3] = false;
      }
   }
}

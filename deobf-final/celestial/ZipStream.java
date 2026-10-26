package celestial;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.zip.CRC32;
import java.util.zip.DeflaterOutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ZipStream extends DeflaterOutputStream {
   private static short[] break_;
   private static boolean[] byte_;
   private static String[] protected_;
   private static byte[] throws_;
   public Object[] class_;

   private static void byte_() {
      protected_ = new String[]{new String("Zip entry is null")};
   }

   public ZipStream(rrzf_3 var1, rrzY_2 var2, OutputStream var3) {
      super(var3, var1.while_());
      this.protected_();
      this.class_[3] = var1;
      rrzY_2 var9 = Objects.requireNonNull(var2, "Zip entry is null");
      this.class_[1] = var9;
      CRC32 var10 = new CRC32();
      this.class_[0] = var10;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-46, 99, 100, 17, -91, -125, -67, -9}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -492458078;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7896766315689489386L;
   }

   private static void class_() {
      break_ = new short[]{3, 1, 0, 0, 2, 2, 1, 12, 1, 11, 1, 0, 10, 2, 1, 0, 3, 1, 3};
   }

   @Override
   public synchronized void write(byte[] var1, int var2, int var3) throws IOException {
      super.write(var1, var2, var3);
      ((CRC32)this.class_[0]).update(var1, var2, var3);
   }

   @Override
   public synchronized void close() throws IOException {
      if (!(Boolean)this.class_[2]) {
         Boolean var7 = true;
         this.class_[2] = var7;
         this.finish();
         rrzY_2 var10000 = (rrzY_2)this.class_[1];
         Long var8 = this.def.getBytesRead();
         var10000.class_[12] = var8;
         var10000 = (rrzY_2)this.class_[1];
         Long var9 = this.def.getBytesWritten();
         var10000.class_[11] = var9;
         var10000 = (rrzY_2)this.class_[1];
         Long var10 = ((CRC32)this.class_[0]).getValue();
         var10000.class_[10] = var10;
         if (this.out instanceof rrza_3 var1 && (OutputStream)var1.class_[2] == null) {
            var10000 = (rrzY_2)this.class_[1];
            byte[] var11 = var1.byte_();
            var10000.class_[0] = var11;
         }

         super.close();
         ((rrzf_3)this.class_[3]).class_((rrzY_2)this.class_[1]);
         ((rrzf_3)this.class_[3]).class_(this.def);
      }
   }

   private static void break_() {
      throws_ = new byte[]{4, 2};
   }

   private static void throws_() {
      byte_ = new boolean[]{true, false};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
         var1[2] = false;
      }
   }
}

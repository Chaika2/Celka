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

public class rrze_3 extends DeflaterOutputStream {
   private static byte[] break_;
   private static short[] byte_;
   private static String[] protected_;
   public Object[] class_;
   private static boolean[] throws_;

   private static void byte_() {
      throws_ = new boolean[]{true, false};
   }

   public rrze_3(rrzf_3 var1, rrzY_2 var2, OutputStream var3) {
      super(var3, var1.while_());
      this.class_();
      this.class_[3] = var1;
      rrzY_2 var9 = Objects.requireNonNull(var2, "Zip entry is null");
      this.class_[1] = var9;
      CRC32 var10 = new CRC32();
      this.class_[0] = var10;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -324254332;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4085124173078454963L;
   }

   private void class_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
         var1[2] = false;
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{127, -63, 47, 36, 81, 15, 41, -54}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void write(byte[] var1, int var2, int var3) throws IOException {
      super.write(var1, var2, var3);
      ((CRC32)this.class_[0]).update(var1, var2, var3);
   }

   @Override
   public void close() throws IOException {
      if (!(Boolean)this.class_[2]) {
         Boolean var5 = true;
         this.class_[2] = var5;
         this.finish();
         rrzY_2 var10000 = (rrzY_2)this.class_[1];
         Long var6 = this.def.getBytesRead();
         var10000.class_[12] = var6;
         var10000 = (rrzY_2)this.class_[1];
         Long var7 = this.def.getBytesWritten();
         var10000.class_[11] = var7;
         var10000 = (rrzY_2)this.class_[1];
         Long var8 = ((CRC32)this.class_[0]).getValue();
         var10000.class_[10] = var8;
         ((rrzf_3)this.class_[3]).class_(this.def);
      }
   }

   private static void break_() {
      break_ = new byte[]{4, 2};
   }

   private static void throws_() {
      protected_ = new String[]{new String("Zip entry is null")};
   }

   private static void protected_() {
      byte_ = new short[]{3, 1, 0, 0, 2, 2, 1, 12, 1, 11, 1, 0, 10, 3};
   }
}

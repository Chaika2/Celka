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
   private static short[] id_break;
   private static boolean[] id_byte;
   private static String[] id_protected;
   private static byte[] id_throws;
   public Object[] id_class;

   private static void id_byte() {
      id_protected = new String[]{new String("Zip entry is null")};
   }

   public ZipStream(rrzf_3 var1, rrzY_2 var2, OutputStream var3) {
      super(var3, var1.id_while());
      this.id_protected();
      this.id_class[3] = var1;
      rrzY_2 var9 = Objects.requireNonNull(var2, id_protected[0]);
      this.id_class[1] = var9;
      CRC32 var10 = new CRC32();
      this.id_class[id_break[2]] = var10;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-46, 99, 100, 17, -91, -125, -67, -9}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -492458078;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7896766315689489386L;
   }

   private static void id_class() {
      id_break = new short[]{3, 1, 0, 0, 2, 2, 1, 12, 1, 11, 1, 0, 10, 2, 1, 0, 3, 1, 3};
   }

   @Override
   public synchronized void write(byte[] var1, int var2, int var3) throws IOException {
      super.write(var1, var2, var3);
      ((CRC32)this.id_class[id_break[3]]).update(var1, var2, var3);
   }

   @Override
   public synchronized void close() throws IOException {
      if (!(Boolean)this.id_class[2]) {
         Boolean var7 = true;
         this.id_class[2] = var7;
         this.finish();
         rrzY_2 var10000 = (rrzY_2)this.id_class[1];
         Long var8 = this.def.getBytesRead();
         var10000.id_class[12] = var8;
         var10000 = (rrzY_2)this.id_class[1];
         Long var9 = this.def.getBytesWritten();
         var10000.id_class[11] = var9;
         var10000 = (rrzY_2)this.id_class[1];
         Long var10 = ((CRC32)this.id_class[id_break[11]]).getValue();
         var10000.id_class[10] = var10;
         if (this.out instanceof rrza_3 var1 && (OutputStream)var1.id_class[2] == null) {
            var10000 = (rrzY_2)this.id_class[1];
            byte[] var11 = var1.id_byte();
            var10000.id_class[id_break[15]] = var11;
         }

         super.close();
         ((rrzf_3)this.id_class[3]).id_class((rrzY_2)this.id_class[1]);
         ((rrzf_3)this.id_class[3]).id_class(this.def);
      }
   }

   private static void id_break() {
      id_throws = new byte[]{4, 2};
   }

   private static void id_throws() {
      id_byte = new boolean[]{true, false};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         Object[] var1 = this.id_class;
         var1[2] = id_byte[1];
      }
   }
}

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
   private static short[] id_break;
   private static String[] id_byte;
   public Object[] id_class;
   private static byte[] id_protected;
   private static boolean[] id_throws;
   private static long[] id_case;

   private static void id_byte() {
      id_protected = new byte[]{4, 2, 3};
   }

   public rrzU_2(rrzf_3 var1, rrzY_2 var2, OutputStream var3) {
      super(var3);
      this.id_protected();
      rrzY_2 var8 = Objects.requireNonNull(var2, "Zip entry is null");
      this.id_class[1] = var8;
      CRC32 var9 = new CRC32();
      this.id_class[0] = var9;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{24, 27, 8, -9, 43, 68, 61, -40}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -38485650;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8399667670453300484L;
   }

   private static void id_class() {
      id_throws = new boolean[]{true, false};
   }

   @Override
   public void write(int var1) throws IOException {
      this.out.write(var1);
      ((CRC32)this.id_class[0]).update(var1);
      Long var6 = (Long)this.id_class[2] + 1L;
      this.id_class[2] = var6;
   }

   @Override
   public void write(byte[] var1, int var2, int var3) throws IOException {
      this.out.write(var1, var2, var3);
      ((CRC32)this.id_class[0]).update(var1, var2, var3);
      Long var8 = (Long)this.id_class[2] + (long)var3;
      this.id_class[2] = var8;
   }

   @Override
   public void close() {
      if (!(Boolean)this.id_class[3]) {
         Boolean var5 = true;
         this.id_class[3] = var5;
         rrzY_2 var10000 = (rrzY_2)this.id_class[1];
         rrzY_2 var10001 = (rrzY_2)this.id_class[1];
         long var10003 = (Long)this.id_class[2];
         Long var6 = var10003;
         var10001.id_class[11] = var6;
         Long var7 = var10003;
         var10000.id_class[12] = var7;
         var10000 = (rrzY_2)this.id_class[1];
         Long var8 = ((CRC32)this.id_class[0]).getValue();
         var10000.id_class[10] = var8;
      }
   }

   private static void id_break() {
      id_byte = new String[]{new String("Zip entry is null")};
   }

   private static void id_throws() {
      id_case = new long[]{1L, 0L};
   }

   private static void id_case() {
      id_break = new short[]{1, 0, 0, 2, 2, 0, 2, 2, 3, 3, 1, 1, 2, 11, 12, 1, 0, 10};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         Object[] var1 = this.id_class;
         var1[2] = 0L;
         var1[3] = false;
      }
   }
}

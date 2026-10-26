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
   private static long[] id_break;
   private static byte[] id_byte;
   public Object[] id_class;
   private static boolean[] id_protected;
   private static short[] id_throws;
   private static String[] id_case;

   private static void id_byte() {
      id_byte = new byte[]{4, 2};
   }

   public rrzD_2(rrzf_3 var1, rrzY_2 var2, OutputStream var3) {
      super(var3);
      this.id_case();
      this.id_class[3] = var1;
      rrzY_2 var9 = Objects.requireNonNull(var2, id_case[0]);
      this.id_class[id_throws[1]] = var9;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{85, 49, 34, 114, 86, -92, 44, 121}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_case = new String[]{new String("Zip entry is null")};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1155999088626740011L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -927287916;
   }

   @Override
   public synchronized void write(int var1) throws IOException {
      this.out.write(var1);
      Long var6 = (Long)this.id_class[1] + 1L;
      this.id_class[1] = var6;
   }

   @Override
   public synchronized void write(byte[] var1, int var2, int var3) throws IOException {
      this.out.write(var1, var2, var3);
      Long var8 = (Long)this.id_class[1] + (long)var3;
      this.id_class[1] = var8;
   }

   @Override
   public synchronized void close() throws IOException {
      if (!(Boolean)this.id_class[2]) {
         Boolean var7 = true;
         this.id_class[2] = var7;
         rrzY_2 var10000 = (rrzY_2)this.id_class[id_throws[8]];
         Long var8 = (Long)this.id_class[1];
         var10000.id_class[12] = var8;
         if (this.out instanceof rrza_3 var1 && (OutputStream)var1.id_class[2] == null) {
            var10000 = (rrzY_2)this.id_class[id_throws[12]];
            byte[] var9 = var1.id_byte();
            var10000.id_class[id_throws[13]] = var9;
         }

         super.close();
         ((rrzf_3)this.id_class[3]).id_class((rrzY_2)this.id_class[id_throws[15]]);
      }
   }

   private static void id_break() {
      id_break = new long[]{1L, 0L};
   }

   private static void id_throws() {
      id_protected = new boolean[]{true, true, false};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         Object[] var1 = this.id_class;
         var1[1] = id_break[1];
         var1[2] = id_protected[2];
      }
   }

   private static void id_protected() {
      id_throws = new short[]{3, 0, 1, 1, 1, 1, 2, 2, 0, 1, 12, 2, 0, 0, 3, 0};
   }
}

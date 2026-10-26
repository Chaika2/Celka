package celestial;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzV_2 extends InflaterInputStream {
   private static long[] id_break;
   private static String[] id_byte;
   private static int[] id_protected;
   private static short[] id_throws;
   private static byte[] id_case;
   public Object[] id_class;
   private static boolean[] id_catch;

   private static void id_byte() {
      id_case = new byte[]{-1, 4, 2};
   }

   public rrzV_2(rrzf_3 var1, InputStream var2, Inflater var3, int var4, long var5) {
      super(var2, var3, var4);
      this.id_protected();
      this.id_class[3] = var1;
      Long var12 = var5;
      this.id_class[2] = var12;
      Boolean var13 = false;
      this.id_class[0] = var13;
   }

   static {
      ntfClinit();
   }

   @Override
   public void fill() throws IOException {
      if ((Boolean)this.id_class[1]) {
         throw new EOFException("Unexpected end of ZLIB input stream");
      } else {
         this.len = this.in.read(this.buf, 0, this.buf.length);
         if (this.len == -1) {
            this.buf[0] = 0;
            this.len = 1;
            Boolean var5 = true;
            this.id_class[1] = var5;
         }

         this.inf.setInput(this.buf, 0, this.len);
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{11, -125, -123, -96, -56, 10, -6, 83}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7060448634955738447L;
   }

   private static void id_class() {
      id_catch = new boolean[]{false, true, false, false, false, true, true, false, false, false, false, true, false};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1987386454;
   }

   @Override
   public void close() throws IOException {
      if (!(Boolean)this.id_class[0]) {
         ((rrzf_3)this.id_class[3]).id_class(this.inf);
         this.in.close();
         Boolean var5 = true;
         this.id_class[0] = var5;
         ((Set)((rrzf_3)this.id_class[3]).id_break[17]).remove(this);
      }
   }

   @Override
   public int available() {
      if ((Boolean)this.id_class[0]) {
         return 0;
      } else {
         long var1 = (Long)this.id_class[2] - this.inf.getBytesWritten();
         return var1 > 2147483647L ? Integer.MAX_VALUE : (int)var1;
      }
   }

   private static void id_break() {
      id_protected = new int[]{Integer.MAX_VALUE};
   }

   private static void id_throws() {
      id_throws = new short[]{3, 2, 0, 0, 3, 0, 3, 17, 1, 1, 0, 2};
   }

   private static void id_catch() {
      id_break = new long[]{2147483647L, 0L};
   }

   private static void id_case() {
      id_byte = new String[]{new String("Unexpected end of ZLIB input stream")};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         Object[] var1 = this.id_class;
         var1[0] = false;
         var1[1] = false;
         var1[2] = 0L;
      }
   }
}

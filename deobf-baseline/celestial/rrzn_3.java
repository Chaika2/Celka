package celestial;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzn_3 extends InputStream {
   public Object[] id_class;
   public static Object[] id_break;
   private static byte[] id_byte;
   private static boolean[] id_protected;
   private static short[] id_throws;
   private static long[] id_case;

   private static void id_byte() {
      Object[] var0 = new Object[]{2048};
      id_break = var0;
   }

   public rrzn_3(InputStream var1, byte[] var2) {
      this.id_break();
      this.id_class[id_throws[0]] = var1;
      this.id_class[id_throws[1]] = var2;
   }

   static {
      ntfClinit();
   }

   @Override
   public synchronized void reset() throws IOException {
      ((InputStream)this.id_class[id_throws[5]]).reset();
   }

   private int id_class(int var1) throws IOException {
      if (var1 == 0) {
         return id_protected[1];
      } else {
         int var2 = ((InputStream)this.id_class[id_throws[14]]).read();
         Integer var9 = (Integer)this.id_class[id_throws[15]] + id_protected[2];
         this.id_class[id_throws[16]] = var9;
         if (var2 == id_byte[1]) {
            return id_byte[2];
         } else {
            int var3 = id_protected[3];

            try {
               while (var3 < var1) {
                  var2 = ((InputStream)this.id_class[id_throws[17]]).read();
                  Integer var10 = (Integer)this.id_class[id_throws[18]] + id_protected[4];
                  this.id_class[id_throws[19]] = var10;
                  if (var2 == id_byte[3]) {
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

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -892998526538164534L;
   }

   private static void id_class() {
      id_protected = new boolean[]{true, false, true, true, true, false, true, false};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{66, 78, -58, 119, -43, -33, 26, 33}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public int read() throws IOException {
      int var1 = ((InputStream)this.id_class[id_throws[7]]).read();
      Integer var6 = (Integer)this.id_class[id_throws[8]] + id_protected[0];
      this.id_class[id_throws[9]] = var6;
      return var1 == id_byte[0]
         ? var1
         : (var1 ^ ((byte[])this.id_class[id_throws[10]])[this.id_class[id_throws[11]] % ((byte[])this.id_class[id_throws[12]]).length]) & id_throws[13];
   }

   @Override
   public void close() throws IOException {
      ((InputStream)this.id_class[id_throws[3]]).close();
   }

   @Override
   public synchronized void mark(int var1) {
      ((InputStream)this.id_class[id_throws[6]]).mark(var1);
   }

   @Override
   public long skip(long var1) throws IOException {
      long var3 = var1;
      if (var1 <= id_case[0]) {
         return id_case[1];
      } else {
         int var6 = (int)Math.min(id_case[2], var1);

         while (var3 > id_case[3]) {
            int var5 = this.id_class((int)Math.min((long)var6, var3));
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
      return ((InputStream)this.id_class[id_throws[2]]).available();
   }

   @Override
   public boolean markSupported() {
      return ((InputStream)this.id_class[id_throws[4]]).markSupported();
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[4]];
         Object[] var1 = this.id_class;
         var1[id_byte[5]] = Integer.valueOf(id_protected[5]);
      }
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1179867613;
   }

   private static void id_throws() {
      id_byte = new byte[]{-1, -1, -1, -1, 3, 2};
   }

   private static void id_case() {
      id_throws = new short[]{0, 1, 0, 0, 0, 0, 0, 0, 2, 2, 1, 2, 1, 255, 0, 2, 2, 0, 2, 2, 2048};
   }

   private static void id_protected() {
      id_case = new long[]{0L, 0L, 2048L, 0L};
   }
}

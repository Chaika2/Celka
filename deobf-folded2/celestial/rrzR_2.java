package celestial;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzR_2 {
   private static byte[] id_break;
   private static int[] id_byte;
   private static boolean[] id_protected;
   private static long[] id_throws;
   public Object[] id_class;
   private static short[] id_case;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         Object[] var1 = this.id_class;
         var1[0] = 0;
         var1[1] = 0L;
         var1[2] = 0L;
         var1[3] = 0L;
      }
   }

   public rrzR_2() {
      this.id_byte();
   }

   static {
      ntfClinit();
   }

   public void id_class(OutputStream var1, long var2, boolean var4) throws IOException {
      boolean var5 = var4;
      long var6 = (Long)this.id_class[1];
      long var8 = (Long)this.id_class[2];
      if (var6 >= 4294967295L) {
         var6 = 4294967295L;
         var5 = true;
      }

      if (var8 >= 4294967295L) {
         var8 = 4294967295L;
         var5 = true;
      }

      int var10 = (Integer)this.id_class[0];
      if (var10 >= 65535) {
         var10 = 65535;
         var5 = true;
      }

      if (var5) {
         rrQO.id_break(var1, 101075792L);
         rrQO.id_class(var1, 44L);
         rrQO.id_class(var1, 45);
         rrQO.id_class(var1, 45);
         rrQO.id_break(var1, 0L);
         rrQO.id_break(var1, 0L);
         rrQO.id_class(var1, (long)((Integer)this.id_class[0]).intValue());
         rrQO.id_class(var1, (long)((Integer)this.id_class[0]).intValue());
         rrQO.id_class(var1, (Long)this.id_class[1]);
         rrQO.id_class(var1, (Long)this.id_class[2]);
         rrQO.id_break(var1, 117853008L);
         rrQO.id_break(var1, 0L);
         rrQO.id_class(var1, var2);
         rrQO.id_break(var1, 1L);
      }

      rrQO.id_break(var1, (Long)rrzH_2.id_class[13]);
      rrQO.id_class(var1, 0);
      rrQO.id_class(var1, 0);
      rrQO.id_class(var1, var10);
      rrQO.id_class(var1, var10);
      rrQO.id_break(var1, var6);
      rrQO.id_break(var1, var8);
      rrQO.id_class(var1, 0);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5765539680119562065L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1395636363;
   }

   private static void id_class() {
      id_throws = new long[]{4294967295L, 4294967295L, 4294967295L, 4294967295L, 101075792L, 44L, 0L, 0L, 117853008L, 0L, 1L, 0L, 0L, 0L};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{108, 114, -27, 19, 109, 83, -84, -7}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_break = new byte[]{45, 45, 4, 2, 3};
   }

   private static void id_throws() {
      id_byte = new int[]{65535, 65535};
   }

   private static void id_case() {
      id_case = new short[]{1, 2, 0, 0, 0, 1, 2, 13};
   }

   private static void id_protected() {
      id_protected = new boolean[]{true, true, true, false, false, false, false, false, true};
   }
}

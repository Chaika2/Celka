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
         this.id_class = new Object[id_break[2]];
         Object[] var1 = this.id_class;
         var1[id_protected[6]] = Integer.valueOf(id_protected[7]);
         var1[id_protected[8]] = id_throws[11];
         var1[id_break[3]] = id_throws[12];
         var1[id_break[4]] = id_throws[13];
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
      long var6 = (Long)this.id_class[id_case[0]];
      long var8 = (Long)this.id_class[id_case[1]];
      if (var6 >= id_throws[0]) {
         var6 = id_throws[1];
         var5 = id_protected[0];
      }

      if (var8 >= id_throws[2]) {
         var8 = id_throws[3];
         var5 = id_protected[1];
      }

      int var10 = (Integer)this.id_class[id_case[2]];
      if (var10 >= id_byte[0]) {
         var10 = id_byte[1];
         var5 = id_protected[2];
      }

      if (var5) {
         rrQO.id_break(var1, id_throws[4]);
         rrQO.id_class(var1, id_throws[5]);
         rrQO.id_class(var1, id_break[0]);
         rrQO.id_class(var1, id_break[1]);
         rrQO.id_break(var1, id_throws[6]);
         rrQO.id_break(var1, id_throws[7]);
         rrQO.id_class(var1, (long)((Integer)this.id_class[id_case[3]]).intValue());
         rrQO.id_class(var1, (long)((Integer)this.id_class[id_case[4]]).intValue());
         rrQO.id_class(var1, (Long)this.id_class[id_case[5]]);
         rrQO.id_class(var1, (Long)this.id_class[id_case[6]]);
         rrQO.id_break(var1, id_throws[8]);
         rrQO.id_break(var1, id_throws[9]);
         rrQO.id_class(var1, var2);
         rrQO.id_break(var1, id_throws[10]);
      }

      rrQO.id_break(var1, (Long)rrzH_2.id_class[id_case[7]]);
      rrQO.id_class(var1, id_protected[3]);
      rrQO.id_class(var1, id_protected[4]);
      rrQO.id_class(var1, var10);
      rrQO.id_class(var1, var10);
      rrQO.id_break(var1, var6);
      rrQO.id_break(var1, var8);
      rrQO.id_class(var1, id_protected[5]);
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

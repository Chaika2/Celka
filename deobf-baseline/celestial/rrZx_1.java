package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZx_1 {
   private static short[] id_byte;
   public Object[] id_class;
   private static byte[] id_protected;
   public static Object[] id_break;
   private static boolean[] id_throws;

   private static void id_byte() {
      id_byte = new short[]{0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 167, 8470, 183, 169, 187, 171, 1072, 1103, 1040, 1071, 1025, 1105};
   }

   public rrZx_1() {
      this.id_throws();
      ArrayList var5 = new ArrayList();
      this.id_class[id_byte[0]] = var5;
      Integer var6 = Integer.valueOf(id_throws[0]);
      this.id_class[id_byte[1]] = var6;
   }

   public rrZx_1(int var1, int var2) {
      this.id_throws();
      ArrayList var7 = new ArrayList();
      this.id_class[id_byte[2]] = var7;
      Integer var8 = Integer.valueOf(id_throws[1]);
      this.id_class[id_byte[3]] = var8;
      this.id_class(var1, var2);
   }

   static {
      ntfClinit();
   }

   public rrZx_1 id_class(rrZx_1... var1) {
      rrZx_1[] var2 = var1;
      int var3 = var1.length;

      for (int var4 = id_throws[4]; var4 < var3; var4++) {
         rrZx_1 var5 = var2[var4];

         for (rrZd_1 var7 : var5.id_class()) {
            this.id_class(var7.id_break(), var7.id_class());
         }
      }

      return this;
   }

   public rrZx_1 id_class(int... var1) {
      int[] var2 = var1;
      int var3 = var1.length;

      for (int var4 = id_throws[3]; var4 < var3; var4++) {
         int var5 = var2[var4];
         this.id_class(var5);
      }

      return this;
   }

   public rrZx_1 id_class(int var1) {
      Integer var6 = (Integer)this.id_class[id_byte[7]] + id_throws[2];
      this.id_class[id_byte[8]] = var6;
      ((List)this.id_class[id_byte[9]]).add(new rrZd_1(var1, var1));
      return this;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-32, 27, -17, -97, -119, 70, 20, -25}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrZx_1 id_class(int var1, int var2) {
      rrZd_1 var3 = new rrZd_1(var1, var2);
      Integer var8 = (Integer)this.id_class[id_byte[4]] + id_class(var3);
      this.id_class[id_byte[5]] = var8;
      ((List)this.id_class[id_byte[6]]).add(var3);
      return this;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2090052178978296484L;
   }

   public static int id_class(rrZd_1 var0) {
      return var0.id_class() - var0.id_break() + id_throws[5];
   }

   public List<rrZd_1> id_class() {
      return (List<rrZd_1>)this.id_class[id_byte[10]];
   }

   public int id_break() {
      return (Integer)this.id_class[id_byte[11]];
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1266852625;
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[23]];
         Object[] var1 = this.id_class;
         var1[id_throws[12]] = Integer.valueOf(id_throws[13]);
      }
   }

   private static void id_catch() {
      id_throws = new boolean[]{false, false, true, false, false, true, false, true, false, false, true, true, true, false};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{
         new rrZx_1(48, 57),
         (new rrZx_1())
            .id_class(33, 47)
            .id_class(58, 64)
            .id_class(91, 96)
            .id_class(167)
            .id_class(123, 126)
            .id_class(8470)
            .id_class(32)
            .id_class(183)
            .id_class(169)
            .id_class(187)
            .id_class(171),
         (new rrZx_1(97, 122)).id_class(65, 90),
         (new rrZx_1(1072, 1103)).id_class(1040, 1071).id_class(1025).id_class(1105),
         null
      };
      rrZx_1[] var2 = new rrZx_1[]{
         new rrZx_1(48, 57),
         (new rrZx_1())
            .id_class(33, 47)
            .id_class(58, 64)
            .id_class(91, 96)
            .id_class(167)
            .id_class(123, 126)
            .id_class(8470)
            .id_class(32)
            .id_class(183)
            .id_class(169)
            .id_class(187)
            .id_class(171),
         (new rrZx_1(97, 122)).id_class(65, 90),
         (new rrZx_1(1072, 1103)).id_class(1040, 1071).id_class(1025).id_class(1105)
      };
      var0[4] = (new rrZx_1()).id_class(var2);
      id_break = var0;
   }

   private static void id_protected() {
      id_protected = new byte[]{48, 57, 33, 47, 58, 64, 91, 96, 123, 126, 32, 97, 122, 65, 90, 2, 3, 4, 2, 2, 3, 3, 4, 2, 5};
   }
}

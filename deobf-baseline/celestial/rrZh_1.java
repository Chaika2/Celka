package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZh_1 implements rpv_3 {
   private static float[] id_break;
   private static boolean[] id_byte;
   public Object[] id_class;
   private static byte[] id_protected;
   private static int[] id_throws;
   private static short[] id_case;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[1]];
         Object[] var1 = this.id_class;
         var1[id_byte[1]] = id_break[0];
         var1[id_byte[2]] = id_break[1];
         var1[id_protected[2]] = Integer.valueOf(id_byte[3]);
         var1[id_protected[3]] = id_break[2];
         var1[id_protected[4]] = Integer.valueOf(id_byte[4]);
      }
   }

   public rrZh_1(rrZO var1, float var2, int var3, Ml_1 var4, float var5, int var6) {
      this.id_byte();
      this.id_class[id_case[0]] = var1;
      Float var12 = var2;
      this.id_class[id_case[1]] = var12;
      Integer var13 = var3;
      this.id_class[id_case[2]] = var13;
      this.id_class[id_case[3]] = var4;
      Float var15 = var5;
      this.id_class[id_case[4]] = var15;
      Integer var16 = var6;
      this.id_class[id_case[5]] = var16;
      Float var17 = (Float)this.id_class[id_case[6]];
      this.id_class[id_case[7]] = var17;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-104, 8, -73, 13, -22, -92, -19, 69}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1582147912;
   }

   private static void id_class() {
      id_protected = new byte[]{8, 7, 2, 4, 5};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3921254796466781133L;
   }

   @Override
   public boolean accept(int var1, rgc_3 var2, int var3) {
      int var4 = var2.id_class() != null ? var2.id_class().id_class() : (Integer)this.id_class[id_case[8]];
      char var5 = (char)var3;
      rrZM var6 = (rrZM)((Int2ObjectOpenHashMap)((rrZO)this.id_class[id_case[9]]).id_class[id_case[10]])
         .getOrDefault(var5, (rrZM)((rrZO)this.id_class[id_case[11]]).id_class[id_case[12]]);
      if (var6 != null) {
         ((rrZO)this.id_class[id_case[13]])
            .id_class(
               (Ml_1)this.id_class[id_case[14]],
               var5,
               (Float)this.id_class[id_case[15]],
               (Float)this.id_class[id_case[16]],
               ColorHelper.id_break(var4 | id_throws[0], (Integer)this.id_class[id_case[17]])
            );
         Float var11 = (Float)this.id_class[id_case[18]] + (float)((Integer)var6.id_class[id_case[19]] - id_protected[0]);
         this.id_class[id_case[20]] = var11;
      }

      return id_byte[0];
   }

   private static void id_break() {
      id_break = new float[3];
   }

   private static void id_throws() {
      id_byte = new boolean[]{true, false, true, false, false};
   }

   private static void id_case() {
      id_case = new short[]{6, 1, 2, 3, 4, 5, 1, 0, 2, 6, 1, 6, 2, 6, 3, 0, 4, 5, 0, 2, 0};
   }

   private static void id_protected() {
      id_throws = new int[]{-16777216};
   }
}

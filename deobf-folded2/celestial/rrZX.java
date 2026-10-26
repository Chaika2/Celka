package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZX implements rpv_3 {
   private static float[] id_break;
   private static short[] id_byte;
   private static int[] id_protected;
   public Object[] id_class;
   private static boolean[] id_throws;
   private static byte[] id_case;

   private static void id_byte() {
      id_break = new float[3];
   }

   public rrZX(rrZO var1, float var2, int var3, Ml_1 var4, float var5, int var6) {
      this.id_protected();
      this.id_class[6] = var1;
      Float var12 = var2;
      this.id_class[1] = var12;
      Integer var13 = var3;
      this.id_class[2] = var13;
      this.id_class[3] = var4;
      Float var15 = var5;
      this.id_class[4] = var15;
      Integer var16 = var6;
      this.id_class[5] = var16;
      Float var17 = (Float)this.id_class[1];
      this.id_class[0] = var17;
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      id_protected = new int[]{-16777216};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1073402639;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4642735024528475734L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{111, -13, 41, 29, 115, -96, -35, 43}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public boolean accept(int var1, rgc_3 var2, int var3) {
      int var4 = var2.id_class() != null ? var2.id_class().id_class() : (Integer)this.id_class[2];
      char var5 = (char)var3;
      rrZM var6 = (rrZM)((Int2ObjectOpenHashMap)((rrZO)this.id_class[6]).id_class[1]).getOrDefault(var5, (rrZM)((rrZO)this.id_class[6]).id_class[2]);
      if (var6 != null) {
         ((rrZO)this.id_class[6])
            .id_class(
               (Ml_1)this.id_class[3],
               var5,
               (Float)this.id_class[0],
               (Float)this.id_class[4],
               ColorHelper.id_break(var4 | 0xFF000000, (Integer)this.id_class[5])
            );
         Float var11 = (Float)this.id_class[0] + (float)((Integer)var6.id_class[2] - 8);
         this.id_class[0] = var11;
      }

      return id_throws[0];
   }

   private static void id_break() {
      id_throws = new boolean[]{true, false, true, false, false};
   }

   private static void id_throws() {
      id_case = new byte[]{8, 7, 2, 4, 5};
   }

   private static void id_case() {
      id_byte = new short[]{6, 1, 2, 3, 4, 5, 1, 0, 2, 6, 1, 6, 2, 6, 3, 0, 4, 5, 0, 2, 0};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[7];
         Object[] var1 = this.id_class;
         var1[0] = 0.0F;
         var1[1] = 0.0F;
         var1[2] = 0;
         var1[4] = 0.0F;
         var1[5] = 0;
      }
   }
}

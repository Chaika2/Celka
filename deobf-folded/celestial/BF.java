package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BF extends Pv_1 {
   private static byte[] id_byte;
   private static short[] id_protected;
   private static String[] id_throws;
   private static long[] id_case;
   private static float[] id_catch;
   private static boolean[] id_private;
   public Object[] id_break;

   public String id_byte() {
      this.id_throws();
      return (String)this.id_break[3];
   }

   public BF(C_class var1) {
      super(var1);
      this.id_throws();
      float[] var6 = new float[20];
      this.id_break[id_protected[0]] = var6;
      Long var7 = -1L;
      this.id_break[1] = var7;
      String var8 = id_throws[0];
      this.id_break[3] = var8;
      Float var9 = 20.0F;
      this.id_break[4] = var9;
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(y_1 var1) {
      this.id_throws();
      if (var1.id_protected() instanceof rFp_1) {
         if ((Long)this.id_break[1] != -1L) {
            float var2 = (float)(System.currentTimeMillis() - (Long)this.id_break[1]) / 1000.0F;
            ((float[])this.id_break[id_protected[6]])[this.id_break[2] % ((float[])this.id_break[id_protected[8]]).length] = rfU_2.id_class(
               20.0F / var2, id_catch[3], 20.0F
            );
            Integer var7 = (Integer)this.id_break[2] + 1;
            this.id_break[2] = var7;
         }

         Long var8 = System.currentTimeMillis();
         this.id_break[1] = var8;
         Float var9 = this.id_protected();
         this.id_break[4] = var9;
         if (!((Float)this.id_break[4] <= id_catch[5]) && !Float.isNaN((Float)this.id_break[4])) {
            String var11 = rql_3.id_class((Float)this.id_break[4]);
            this.id_break[3] = var11;
         } else {
            String var10 = id_throws[1];
            this.id_break[3] = var10;
         }
      }
   }

   public float id_class() {
      this.id_throws();
      return 20.0F / (Float)this.id_break[4];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4917165579917451537L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1113112124;
   }

   public float id_break() {
      this.id_throws();
      return (Float)this.id_break[4];
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{93, -95, -100, 80, -106, 81, 102, -7}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_throws() {
      if (this.id_break == null) {
         this.id_break = new Object[5];
         Object[] var1 = this.id_break;
         var1[1] = id_case[2];
         var1[2] = Integer.valueOf(id_private[3]);
         var1[4] = id_catch[13];
      }
   }

   private static void id_finally() {
      id_byte = new byte[]{20, 5, 2, 4};
   }

   private static void id_catch() {
      id_catch = new float[]{20.0F, 1000.0F, 20.0F, 0.0F, 20.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 20.0F, 20.0F, 0.0F};
   }

   private static void id_extends() {
      id_private = new boolean[]{true, false, true, false};
   }

   private static void id_case() {
      id_case = new long[]{-1L, -1L, 0L};
   }

   private static void id_implements() {
      id_protected = new short[]{0, 1, 3, 4, 1, 1, 0, 2, 0, 2, 2, 1, 4, 4, 4, 3, 4, 3, 0, 4, 4, 3};
   }

   private float id_protected() {
      this.id_throws();
      float var1 = id_catch[6];
      float var2 = id_catch[7];
      float[] var3 = (float[])this.id_break[id_protected[18]];
      int var4 = var3.length;

      for (int var5 = id_private[1]; var5 < var4; var5++) {
         float var6 = var3[var5];
         if (var6 > id_catch[8]) {
            var2 += var6;
            var1++;
         }
      }

      return rfU_2.id_class(var2 / var1, id_catch[10], 20.0F);
   }

   private static void id_private() {
      id_throws = new String[]{new String("20.0"), new String("0.0")};
   }
}

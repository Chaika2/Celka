package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZl_1 extends rrZN {
   private static int[] id_protected;
   private static float[] id_throws;
   public Object[] id_break;
   private static byte[] id_case;
   public static Object[] id_byte;
   private static short[] id_catch;
   private static double[] id_private;
   private static boolean[] id_implements;

   public boolean id_int() {
      this.id_return();
      return (Boolean)this.id_break[id_catch[50]];
   }

   public rrZl_1(rrtN_2 var1, rrZH var2) {
      this.id_return();
      Float var7 = id_throws[2];
      this.id_break[id_catch[3]] = var7;
      AnimValue var8 = new AnimValue(id_throws[3], id_implements[1]);
      this.id_break[id_catch[4]] = var8;
      this.id_break[id_catch[5]] = var2;
      this.id_break[id_catch[6]] = var1;
   }

   public rrZl_1(rrZH var1) {
      this.id_return();
      Float var6 = id_throws[0];
      this.id_break[id_catch[0]] = var6;
      AnimValue var7 = new AnimValue(id_throws[1], id_implements[0]);
      this.id_break[id_catch[1]] = var7;
      this.id_break[id_catch[2]] = var1;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      Object[] var0 = new Object[]{15};
      id_byte = var0;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2488182610250880398L;
   }

   private void id_class(float var1, float var2, float var3, float var4) {
      this.id_return();
      Float var9 = var1;
      this.id_break[id_catch[42]] = var9;
      Float var10 = var2;
      this.id_break[id_catch[43]] = var10;
      Float var11 = var3;
      this.id_break[id_catch[44]] = var11;
      Float var12 = var4;
      this.id_break[id_catch[45]] = var12;
   }

   @Override
   public boolean id_class(Ml_1 var1, rrtu_3 var2, float var3, float var4, float var5, float var6, int var7, int var8, boolean var9) {
      return id_implements[12];
   }

   private boolean id_class(rrtu_3 var1, int var2, int var3, boolean var4) {
      this.id_return();
      if (var4 && rrtu_3.id_class(var1, var2, var3)) {
         return id_implements[16];
      } else {
         return (rrtN_2)this.id_break[id_catch[36]] != null && var1.id_class((rrtN_2)this.id_break[id_catch[37]], var2, var3)
            ? id_implements[17]
            : this.id_final().id_break((float)var2, (float)var3);
      }
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.id_return();
      if (!super.id_class(var1, var2, var3, var4, var5)) {
         return id_implements[7];
      } else {
         boolean var6 = this.id_class(var1, var2, var3, var5);
         if (var4 == 0 && var6) {
            Float var11 = (float)var3;
            this.id_break[id_catch[28]] = var11;
            Boolean var12 = id_implements[8];
            this.id_break[id_catch[29]] = var12;
            Boolean var13 = id_implements[9];
            this.id_break[id_catch[30]] = var13;
            return id_implements[10];
         } else {
            boolean var10000 = id_implements[11];
            Boolean var14 = id_implements[11];
            this.id_break[id_catch[31]] = var14;
            return var10000;
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 791658498;
   }

   public void id_class(Ml_1 var1, rrtu_3 var2, float var3, float var4, int var5, int var6, float var7, float var8, float var9, boolean var10, float var11) {
      this.id_return();
      if (!(Boolean)this.id_break[id_catch[7]]) {
         boolean var12 = var8 > var9 ? id_implements[2] : id_implements[3];
         ((AnimValue)this.id_break[id_catch[8]]).id_class(var12);
         if (!((AnimValue)this.id_break[id_catch[9]]).id_case()) {
            return;
         }

         if (var12) {
            Float var24 = var8;
            this.id_break[id_catch[10]] = var24;
         }

         float var13 = ((AnimValue)this.id_break[id_catch[11]]).id_byte();
         var11 *= var13;
         if (!((AnimValue)this.id_break[id_catch[12]]).id_case()) {
            return;
         }
      } else {
         Float var25 = var8;
         this.id_break[id_catch[13]] = var25;
      }

      this.id_class(var3, var4, var7, var9);
      boolean var28 = !this.id_break[id_catch[14]] && !this.id_class(var2, var5, var6, var10) ? id_implements[5] : id_implements[4];
      float var29 = (Float)this.id_break[id_catch[15]] / var9;
      float var14 = Math.max(var9 / var29, id_throws[4]);
      float var15 = ((rrZH)this.id_break[id_catch[16]]).id_break();
      if ((Float)this.id_break[id_catch[17]] != id_throws[5]) {
         float var16 = (Float)this.id_break[id_catch[18]] - (float)var6;
         Float var26 = (float)var6;
         this.id_break[id_catch[19]] = var26;
         var15 += var16 * var29;
      }

      float var30 = var15 / (-(Float)this.id_break[id_catch[20]] + var9);
      float var17 = rfU_2.id_class(var30, id_throws[6], id_throws[7]);
      float var18 = (var9 - var14) * var17;
      if ((Boolean)this.id_break[id_catch[21]]) {
         ((rrZH)this.id_break[id_catch[22]]).id_byte(-((Float)this.id_break[id_catch[23]] - var9) * var17);
      }

      if ((Boolean)this.id_break[id_catch[24]]) {
         this.id_class(var6, var4, (Float)this.id_break[id_catch[25]], var9, var18, var14);
         Boolean var27 = id_implements[6];
         this.id_break[id_catch[26]] = var27;
      }

      id_class(var1, var3, var4, id_throws[8], var7, var9, ColorHelper.id_break((Integer)rrZI.id_break[id_catch[27]], (int)var11));
      int var19 = (int)Math.min(var28 ? (double)var11 : (double)var11 / id_private[0], id_private[1]);
      id_class(var1, var3, var4, var18, var7, var14, ColorHelper.id_break(id_protected[0], var19));
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, double var4, boolean var6) {
      return id_implements[15];
   }

   private static void id_class(Ml_1 var0, float var1, float var2, float var3, float var4, float var5, int var6) {
      rrfD_2.id_class(
         var0,
         var1 + id_throws[12],
         var2 + id_throws[13] + var3,
         var4 - id_throws[14],
         var5 - id_throws[15],
         id_throws[16],
         id_throws[17],
         id_throws[18],
         id_throws[19],
         var6
      );
   }

   private void id_class(int var1, float var2, float var3, float var4, float var5, float var6) {
      this.id_return();
      int var7 = (int)((float)var1 - var2);
      if (!((float)var7 >= var5) || !((float)var7 < var5 + var6)) {
         if (var7 >= 0 && !((float)var7 >= var4)) {
            float var8 = (float)var7 / var4;
            float var9 = -(var3 - var4) * var8;
            ((rrZH)this.id_break[id_catch[47]]).id_byte(var9);
         }
      }
   }

   @Override
   public void id_break(int var1, int var2, int var3) {
      this.id_return();
      if (var3 == 0) {
         Float var8 = id_throws[9];
         this.id_break[id_catch[32]] = var8;
         Boolean var9 = id_implements[13];
         this.id_break[id_catch[33]] = var9;
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-96, -23, -124, 46, -79, -77, 124, -108}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean id_finally() {
      this.id_return();
      return (Boolean)this.id_break[id_catch[46]];
   }

   public rrZH id_extends() {
      this.id_return();
      return (rrZH)this.id_break[id_catch[48]];
   }

   private static void id_continue() {
      id_case = new byte[]{12, 2, 3, 4, 5, 6, 7, 8, 9, 15};
   }

   private static void id_else() {
      id_private = new double[]{1.2, 255.0};
   }

   private static void id_new() {
      id_throws = new float[]{
         -1.0F,
         0.4F,
         -1.0F,
         0.4F,
         15.0F,
         -1.0F,
         0.0F,
         1.0F,
         0.0F,
         -1.0F,
         -1.0F,
         0.0F,
         1.0F,
         1.0F,
         2.0F,
         2.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F
      };
   }

   public AnimValue id_package() {
      this.id_return();
      return (AnimValue)this.id_break[id_catch[49]];
   }

   private void id_return() {
      if (this.id_break == null) {
         this.id_break = new Object[id_case[0]];
         Object[] var1 = this.id_break;
         var1[id_implements[19]] = id_throws[20];
         var1[id_case[1]] = id_throws[21];
         var1[id_case[2]] = id_throws[22];
         var1[id_case[3]] = id_throws[23];
         var1[id_case[4]] = id_throws[24];
         var1[id_case[5]] = id_implements[20];
         var1[id_case[6]] = id_throws[25];
         var1[id_case[7]] = id_implements[21];
         var1[id_case[8]] = id_implements[22];
      }
   }

   private static void id_super() {
      id_implements = new boolean[]{
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         false,
         true,
         false
      };
   }

   private static void id_public() {
      id_protected = new int[]{6781311};
   }

   @Override
   public void id_private() {
      this.id_return();
      super.id_private();
      Float var5 = id_throws[10];
      this.id_break[id_catch[34]] = var5;
      Boolean var6 = id_implements[14];
      this.id_break[id_catch[35]] = var6;
   }

   public rruv_1 id_final() {
      this.id_return();
      return new rruv_1(
         (Float)this.id_break[id_catch[38]], (Float)this.id_break[id_catch[39]], (Float)this.id_break[id_catch[40]], (Float)this.id_break[id_catch[41]]
      );
   }

   @Override
   public void id_volatile() {
      rrZH var1 = this.id_extends();
      var1.id_byte(id_throws[11]);
   }

   private static void id_synchronized() {
      id_catch = new short[]{
         7,
         10,
         0,
         7,
         10,
         0,
         11,
         9,
         10,
         10,
         5,
         10,
         10,
         5,
         6,
         5,
         0,
         7,
         7,
         7,
         5,
         6,
         0,
         5,
         8,
         5,
         8,
         4,
         7,
         8,
         6,
         6,
         7,
         6,
         7,
         6,
         11,
         11,
         1,
         2,
         3,
         4,
         1,
         2,
         3,
         4,
         6,
         0,
         0,
         10,
         9,
         9
      };
   }

   public rrZl_1 id_native() {
      this.id_return();
      Boolean var5 = id_implements[18];
      this.id_break[id_catch[51]] = var5;
      return this;
   }
}

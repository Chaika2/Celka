package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Timer extends Module implements rrnZ_2 {
   public static Object[] id_break;
   private static double[] id_protected;
   private static float[] id_throws;
   public Object[] id_byte;
   private static short[] id_catch;
   private static byte[] id_private;
   private static boolean[] id_implements;
   private static String[] id_finally;

   public Timer() {
      super(id_finally[0], id_finally[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_catch[0]]);
      this.id_goto();
      rrIm_1 var5 = new rrIm_1(id_finally[2], id_throws[0], id_throws[1], id_throws[2], id_throws[3]);
      this.id_byte[id_catch[1]] = var5;
      rrIk_1 var6 = new rrIk_1(id_finally[3], id_implements[0]);
      this.id_byte[id_catch[2]] = var6;
      rrIm_1 var7 = new rrIm_1(id_finally[4], id_throws[4], id_throws[5], id_throws[6], id_throws[7]).id_class(((rrIk_1)this.id_byte[id_catch[3]])::id_class);
      this.id_byte[id_catch[4]] = var7;
      rrIm_1 var8 = new rrIm_1(id_finally[5], id_throws[8], id_throws[9], id_throws[10], id_throws[11]).id_class(((rrIk_1)this.id_byte[id_catch[5]])::id_class);
      this.id_byte[id_catch[6]] = var8;
      this.id_class(id_implements[1], id_implements[2]);
      Setting[] var10001 = new Setting[id_private[0]];
      var10001[id_implements[3]] = (rrIm_1)this.id_byte[id_catch[7]];
      var10001[id_implements[4]] = (rrIk_1)this.id_byte[id_catch[8]];
      var10001[id_private[1]] = (rrIm_1)this.id_byte[id_catch[9]];
      var10001[id_private[2]] = (rrIm_1)this.id_byte[id_catch[10]];
      this.id_class(var10001);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_catch[11]]).id_finally().id_class(new OH<>(rrAy_1.class, var1 -> this.id_class(var1)));
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_protected = new double[4];
   }

   public void id_class(rrAy_1 var1) {
      this.id_class(
         ((cb_3)id_import.id_class[id_catch[12]]).N(),
         ((cb_3)id_import.id_class[id_catch[13]]).b(),
         ((cb_3)id_import.id_class[id_catch[14]]).id_for(),
         ((cb_3)id_import.id_class[id_catch[15]]).O(),
         ((cb_3)id_import.id_class[id_catch[16]]).id_static()
      );
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1404158420;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3275059681255142658L;
   }

   public void id_class(float var1, float var2, double var3, double var5, double var7) {
      this.id_goto();
      if (this.id_continue()) {
         Float var13 = (Float)this.id_byte[id_catch[32]] - (((rrIm_1)this.id_byte[id_catch[33]]).id_byte() + id_throws[18]);
         this.id_byte[id_catch[34]] = var13;
      } else {
         Float var14 = (Float)this.id_byte[id_catch[35]] - ((rrIm_1)this.id_byte[id_catch[36]]).id_byte() / id_throws[19];
         this.id_byte[id_catch[37]] = var14;
      }

      Float var15 = (float)rfU_2.id_class(
         (double)((Float)this.id_byte[id_catch[38]]).floatValue(),
         id_protected[0],
         Math.floor((double)(id_throws[20] / ((rqw_3)id_import.id_class[id_catch[39]]).id_class()))
      );
      this.id_byte[id_catch[40]] = var15;
      Double var16 = var3;
      this.id_byte[id_catch[41]] = var16;
      Double var17 = var5;
      this.id_byte[id_catch[42]] = var17;
      Double var18 = var7;
      this.id_byte[id_catch[43]] = var18;
      Float var19 = var1;
      this.id_byte[id_catch[44]] = var19;
      Float var20 = var2;
      this.id_byte[id_catch[45]] = var20;
   }

   @Override
   public void id_class() {
      this.id_byte(id_implements[7]);
   }

   @EventTarget(
      id_class = -200
   )
   public void id_class(q_1 var1) {
      this.id_goto();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_catch[17]]) {
         ((rqw_3)id_import.id_class[id_catch[18]]).id_class(((rrIm_1)this.id_byte[id_catch[19]]).id_byte());
         if (!((rrIk_1)this.id_byte[id_catch[20]]).id_class() || ((rqw_3)id_import.id_class[id_catch[21]]).id_class() <= id_throws[12]) {
            return;
         }

         if ((Float)this.id_byte[id_catch[22]] < id_throws[13] / ((rrIm_1)this.id_byte[id_catch[23]]).id_byte()) {
            Float var6 = (Float)this.id_byte[id_catch[24]] + ((rrIm_1)this.id_byte[id_catch[25]]).id_byte();
            this.id_byte[id_catch[26]] = var6;
            Float var7 = rfU_2.id_class((Float)this.id_byte[id_catch[27]], id_throws[14], id_throws[15] / ((rrIm_1)this.id_byte[id_catch[28]]).id_byte());
            this.id_byte[id_catch[29]] = var7;
         } else {
            this.aw_();
         }
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-94, -9, 45, -92, -33, -109, -8, -23}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      ((rqw_3)id_import.id_class[id_catch[58]]).id_class(id_throws[21]);
   }

   private void id_goto() {
      if (this.id_byte == null) {
         this.id_byte = new Object[10];
         this.id_byte[4] = 0.0F;
         this.id_byte[5] = 0.0;
         this.id_byte[6] = 0.0;
         this.id_byte[7] = 0.0;
         this.id_byte[8] = 0.0F;
         this.id_byte[9] = 0.0F;
      }
   }

   private boolean id_continue() {
      this.id_goto();
      return this.id_byte[id_catch[46]] == ((cb_3)id_import.id_class[id_catch[47]]).rx()
            && this.id_byte[id_catch[48]] == ((cb_3)id_import.id_class[id_catch[49]]).re()
            && this.id_byte[id_catch[50]] == ((cb_3)id_import.id_class[id_catch[51]]).BO()
            && this.id_byte[id_catch[52]] == ((cb_3)id_import.id_class[id_catch[53]]).id_throws[id_catch[54]]
            && this.id_byte[id_catch[55]] == ((cb_3)id_import.id_class[id_catch[56]]).id_throws[id_catch[57]]
         ? id_implements[5]
         : id_implements[6];
   }

   private static void id_else() {
      id_private = new byte[]{4, 2, 3, 10, 4, 5, 6, 7, 8, 9};
   }

   public float id_new() {
      this.id_goto();
      return id_throws[16] - (Float)this.id_byte[id_catch[30]] / (id_throws[17] / ((rrIm_1)this.id_byte[id_catch[31]]).id_byte());
   }

   private static void id_return() {
      id_throws = new float[]{
         1.8F,
         1.1F,
         10.0F,
         0.1F,
         1.0F,
         0.5F,
         3.0F,
         0.1F,
         0.0F,
         0.0F,
         1.0F,
         0.05F,
         1.0F,
         90.0F,
         0.0F,
         100.0F,
         1.0F,
         100.0F,
         0.4F,
         10.0F,
         100.0F,
         1.0F,
         0.0F,
         0.0F,
         0.0F,
         100.0F
      };
   }

   private static void id_super() {
      id_finally = new String[]{
         new String("Timer"),
         new String("Ускоряет время игры"),
         new String("Скорость"),
         new String("Умный режим"),
         new String("Скорость убывания"),
         new String("Добавлять в движении")
      };
   }

   private static void id_try() {
      Object[] var0 = new Object[]{0.0F};
      id_break = var0;
   }

   private static void id_while() {
      id_implements = new boolean[]{true, true, false, false, true, true, false, false, true, false};
   }

   private static void id_public() {
      id_catch = new short[]{
         1,
         0,
         1,
         1,
         2,
         1,
         3,
         0,
         1,
         2,
         3,
         0,
         57,
         57,
         57,
         57,
         57,
         0,
         6,
         0,
         1,
         6,
         4,
         0,
         4,
         2,
         4,
         4,
         0,
         4,
         4,
         0,
         4,
         2,
         4,
         4,
         3,
         4,
         4,
         6,
         4,
         5,
         6,
         7,
         8,
         9,
         5,
         57,
         6,
         57,
         7,
         57,
         8,
         57,
         15,
         9,
         57,
         16,
         6
      };
   }
}

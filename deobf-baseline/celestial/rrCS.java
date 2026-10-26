package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCS extends Pv_1 implements MinecraftAccessor {
   public Object[] id_break;
   private static byte[] id_protected;
   private static boolean[] id_throws;
   public static Object[] id_byte;
   private static double[] id_case;
   private static short[] id_catch;
   private static long[] id_private;
   private static float[] id_implements;

   private static void id_byte() {
      id_private = new long[]{4000L, 4000L, 0L, 4000L};
   }

   public rrCS() {
      super(C_throws.id_byte());
      this.id_catch();
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(rrFK var1) {
      this.id_catch();
      super.id_class(var1);
      Long var6 = System.currentTimeMillis() + id_private[1];
      this.id_break[id_catch[40]] = var6;
   }

   @Override
   public void id_class(rrAX var1) {
   }

   private static float id_class(float var0, float var1, boolean var2) {
      float var3 = rrfQ_2.id_byte(id_implements[2], id_implements[3]);
      float var4 = Math.abs(var1);
      float var5 = var0 + var3;
      float var6 = var0 - var3;
      if (var2) {
         var5 = rfU_2.id_class(var5, id_implements[4], id_implements[5]);
         var6 = rfU_2.id_class(var6, id_implements[6], id_implements[7]);
      }

      float var7 = var5 - var0;
      float var8 = var6 - var0;
      if (var7 == id_implements[8]) {
         return var8;
      } else if (var8 == id_implements[9]) {
         return var7;
      } else {
         float var9 = Math.abs(Math.abs(var5) - var4);
         float var10 = Math.abs(Math.abs(var6) - var4);
         return var9 >= var10 ? var7 : var8;
      }
   }

   public static double id_class(double var0, double var2) {
      double var4 = Math.pow(id_case[4], var2);
      return Math.ceil(var0 * var4) / var4;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3172205131124250027L;
   }

   @Override
   public void id_class(rrAO var1) {
      this.id_catch();
      if ((PX)this.id_break[id_catch[36]] != null) {
         rrfj_3.id_class(var1, ((PX)this.id_break[id_catch[37]]).id_throws(), (Float)((cb_3)id_import.id_class[id_catch[38]]).id_break[id_catch[39]]);
      }
   }

   @Override
   public void id_class(q_1 var1) {
      this.id_catch();
      Y var2 = var1.id_class();
      if (var2 == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_catch[0]]) {
         Object var16 = null;
         this.id_break[id_catch[1]] = var16;
         Object var17 = null;
         this.id_break[id_catch[2]] = var17;
         if (!this.id_implements() || System.currentTimeMillis() - (Long)this.id_break[id_catch[3]] > id_private[0]) {
            Boolean var18 = id_throws[0];
            this.id_break[id_catch[4]] = var18;
            return;
         }

         boolean var3 = (Boolean)this.id_break[id_catch[5]];
         Boolean var19 = id_throws[1];
         this.id_break[id_catch[6]] = var19;
         float var4 = ((cb_3)id_import.id_class[id_catch[7]]).N();
         float var5 = ((cb_3)id_import.id_class[id_catch[8]]).b();
         float var6 = (Float)((cb_3)id_import.id_class[id_catch[9]]).id_throws[id_catch[10]];
         float var7 = (Float)((cb_3)id_import.id_class[id_catch[11]]).id_throws[id_catch[12]];
         float var8 = Math.abs(var6 - var4);
         float var9 = Math.abs(var7 - var5);
         if (id_class((double)var8, id_case[0]) > id_case[1] || id_class((double)var9, id_case[2]) > id_case[3]) {
            Boolean var20 = id_throws[2];
            this.id_break[id_catch[13]] = var20;
         }

         if (var3) {
            PX var21 = ((cb_3)id_import.id_class[id_catch[14]]).id_goto();
            this.id_break[id_catch[15]] = var21;
            float var10 = id_class(var6, var4, id_throws[3]);
            float var11 = id_class(var7, var5, id_throws[4]);
            PX var22 = new PX(var6 + var10, rfU_2.id_class(var7 + var11, id_implements[0], id_implements[1]));
            this.id_break[id_catch[16]] = var22;
            cb_3 var10000 = (cb_3)id_import.id_class[id_catch[17]];
            Float var23 = ((PX)this.id_break[id_catch[18]]).id_throws();
            var10000.id_throws[id_catch[19]] = var23;
            var10000 = (cb_3)id_import.id_class[id_catch[20]];
            Float var24 = ((PX)this.id_break[id_catch[21]]).id_protected();
            var10000.id_throws[id_catch[22]] = var24;
         }
      } else if (var2 == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_catch[23]] && (PX)this.id_break[id_catch[24]] != null) {
         cb_3 var29 = (cb_3)id_import.id_class[id_catch[25]];
         Float var25 = ((PX)this.id_break[id_catch[26]]).id_throws();
         var29.id_throws[id_catch[27]] = var25;
         var29 = (cb_3)id_import.id_class[id_catch[28]];
         Float var26 = ((PX)this.id_break[id_catch[29]]).id_protected();
         var29.id_throws[id_catch[30]] = var26;
         Object var27 = null;
         this.id_break[id_catch[31]] = var27;
      }
   }

   @Override
   public void id_class(rrAH var1) {
      if (this.id_implements()) {
         var1.id_class(((cb_3)id_import.id_class[id_catch[32]]).N());
         var1.id_break(((cb_3)id_import.id_class[id_catch[33]]).b());
         var1.id_class(id_throws[5]);
      }
   }

   private static void id_class() {
      id_catch = new short[]{
         0, 3, 2, 1, 0, 0, 0, 57, 57, 57, 15, 57, 16, 0, 57, 2, 3, 57, 3, 15, 57, 3, 16, 1, 2, 57, 2, 15, 57, 2, 16, 2, 57, 57, 0, 1, 3, 3, 57, 45, 1, 1, 4, 0
      };
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 117861840;
   }

   private static void id_break() {
      id_protected = new byte[]{4, 2};
   }

   @Override
   public void id_break(y_1 var1) {
      this.id_catch();
      if (var1.id_byte() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_catch[34]]) {
         if (var1.id_protected() instanceof rZq_1 var2 && var2.id_break() == rZT.ATTACK) {
            Long var8 = System.currentTimeMillis();
            this.id_break[id_catch[35]] = var8;
         }
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-21, 48, -71, -72, 16, 74, 94, 116}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_implements = new float[]{-90.0F, 90.0F, 2.2F, 2.3F, -90.0F, 90.0F, -90.0F, 90.0F, 0.0F, 0.0F, 35.0F};
   }

   private void id_catch() {
      if (this.id_break == null) {
         this.id_break = new Object[4];
         this.id_break[0] = false;
         this.id_break[1] = 0L;
      }
   }

   private static void id_case() {
      id_throws = new boolean[]{false, false, true, false, true, false, false, false, true, false, false, true, false, true};
   }

   private boolean id_implements() {
      if ((rrfq_3)rrfp_3.id_class[id_catch[41]] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_catch[42]]) {
         return id_throws[6];
      } else {
         return !((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_catch[43]]).id_private().E().id_void() ? id_throws[7] : id_throws[8];
      }
   }

   private static void id_protected() {
      id_case = new double[]{2.0, 35.0, 2.0, 35.0, 10.0};
   }

   private static void id_private() {
      Object[] var0 = new Object[]{0.0F, 4000L};
      id_byte = var0;
   }
}

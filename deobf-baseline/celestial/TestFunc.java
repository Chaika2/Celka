package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;

public class TestFunc extends Module {
   private static String[] id_protected;
   private static double[] id_throws;
   private static long[] id_catch;
   public Object[] id_break;
   private static float[] id_private;
   private static boolean[] id_implements;
   public static Object[] id_byte;
   private static short[] id_finally;
   private static byte[] id_extends;

   public TestFunc() {
      super(id_protected[0], id_protected[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_finally[0]]);
      this.id_goto();
      ArrayList var5 = new ArrayList();
      this.id_break[id_finally[1]] = var5;
      ArrayList var6 = new ArrayList();
      this.id_break[id_finally[2]] = var6;
      ArrayList var7 = new ArrayList();
      this.id_break[id_finally[3]] = var7;
      Long var8 = id_catch[0];
      this.id_break[id_finally[4]] = var8;
   }

   static {
      ntfClinit();
   }

   private void id_this() {
      this.id_goto();
      Integer var5 = Integer.valueOf(id_implements[22]);
      this.id_break[id_finally[66]] = var5;
      Long var6 = id_catch[3];
      this.id_break[id_finally[67]] = var6;
      ((List)this.id_break[id_finally[68]]).clear();
      ((List)this.id_break[id_finally[69]]).clear();
      ((List)this.id_break[id_finally[70]]).clear();
      ((List)id_byte[id_finally[71]]).clear();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6091643480443415464L;
   }

   @EventTarget
   public void id_class(rrnB_2 var1) {
      this.id_goto();
      Ml_1 var2 = var1.id_class();
      rrZO var3 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_finally[5]]).id_break();
      float var4 = id_import.id_else().id_final() / id_private[0] + id_private[1];
      var2.id_class();
      var3.id_break(id_strictfp);
      rrfD_2.id_throws((lD_2)rrfD_2.id_class[id_finally[6]]);

      for (rryE var6 : (List)id_byte[id_finally[7]]) {
         rrfD_2.id_class(
            var2,
            (lD_2)rrfD_2.id_class[id_finally[8]],
            (Float)var6.id_class[id_finally[9]],
            var4 + (Float)var6.id_class[id_finally[10]],
            id_private[2],
            id_private[3],
            id_extends[0]
         );
         if (Math.abs((Float)var6.id_class[id_finally[11]]) > id_private[4]) {
            String var10000 = id_protected[2];
            Object[] var10001 = new Object[id_implements[0]];
            var10001[id_implements[1]] = Math.abs((Float)var6.id_class[id_finally[12]]);
            String var7 = String.format(var10000, var10001);
            var3.id_class(
               var2,
               id_strictfp,
               var7,
               (double)((Float)var6.id_class[id_finally[13]]).floatValue(),
               (double)(var4 + (Float)var6.id_class[id_finally[14]] + (float)(var6.id_class[id_finally[15]] > id_private[5] ? id_extends[1] : id_extends[2])),
               Color.RED.getRGB(),
               id_implements[2],
               id_implements[3]
            );
         }
      }

      rrfD_2.id_private((lD_2)rrfD_2.id_class[id_finally[16]]);
      var3.id_byte(id_strictfp);
      var2.id_break();
      int var9 = id_extends[3];
      ((cm_3)id_import.id_class[id_finally[17]])
         .id_class(var2, "Hit count: " + (Integer)this.id_break[id_finally[18]], (int)(id_import.id_else().id_volatile() / id_private[6]), var9, id_extends[4]);
      var9 += 15;
      if ((Long)this.id_break[id_finally[19]] != id_catch[1]) {
         long var13 = rqR_2.id_break() - (Long)this.id_break[id_finally[20]];
         Duration var20 = Duration.ofMillis(var13);
         rqy_3[] var25 = new rqy_3[id_extends[5]];
         var25[id_implements[4]] = rqy_3.HOURS;
         var25[id_implements[5]] = rqy_3.MINUTES;
         var25[id_extends[6]] = rqy_3.SECONDS;
         String var8 = "Duration: " + rql_3.id_class(var20, var25);
         ((cm_3)id_import.id_class[id_finally[21]]).id_class(var2, var8, (int)(id_import.id_else().id_volatile() / id_private[7]), var9, id_extends[7]);
         var9 += 15;
      }

      if (!((List)this.id_break[id_finally[22]]).isEmpty()) {
         float var14 = (float)((List)this.id_break[id_finally[23]]).stream().mapToDouble(Float::doubleValue).average().orElse(id_throws[0]);
         float var16 = (float)((List)this.id_break[id_finally[24]]).stream().mapToDouble(Float::doubleValue).max().orElse(id_throws[1]);
         float var18 = (float)((List)this.id_break[id_finally[25]]).stream().mapToDouble(Float::doubleValue).min().orElse(id_throws[2]);
         cm_3 var21 = (cm_3)id_import.id_class[id_finally[26]];
         String var10002 = id_protected[3];
         Object[] var10003 = new Object[id_implements[6]];
         var10003[id_implements[7]] = var14;
         var21.id_class(var2, String.format(var10002, var10003), (int)(id_import.id_else().id_volatile() / id_private[8]), var9, id_extends[8]);
         var9 += 15;
         var21 = (cm_3)id_import.id_class[id_finally[27]];
         var10002 = id_protected[4];
         var10003 = new Object[id_extends[9]];
         var10003[id_implements[8]] = var16;
         var10003[id_implements[9]] = var18;
         var21.id_class(var2, String.format(var10002, var10003), (int)(id_import.id_else().id_volatile() / id_private[9]), var9, id_extends[10]);
         var9 += 15;
      }

      if (!((List)this.id_break[id_finally[28]]).isEmpty()) {
         float var15 = (float)((List)this.id_break[id_finally[29]]).stream().mapToDouble(Float::doubleValue).average().orElse(id_throws[3]);
         float var17 = (float)((List)this.id_break[id_finally[30]]).stream().mapToDouble(Float::doubleValue).max().orElse(id_throws[4]);
         float var19 = (float)((List)this.id_break[id_finally[31]]).stream().mapToDouble(Float::doubleValue).min().orElse(id_throws[5]);
         cm_3 var23 = (cm_3)id_import.id_class[id_finally[32]];
         String var27 = id_protected[5];
         Object[] var30 = new Object[id_implements[10]];
         var30[id_implements[11]] = var15;
         var23.id_class(var2, String.format(var27, var30), (int)(id_import.id_else().id_volatile() / id_private[10]), var9, id_extends[11]);
         var9 += 15;
         var23 = (cm_3)id_import.id_class[id_finally[33]];
         var27 = id_protected[6];
         var30 = new Object[id_extends[12]];
         var30[id_implements[12]] = var17;
         var30[id_implements[13]] = var19;
         var23.id_class(var2, String.format(var27, var30), (int)(id_import.id_else().id_volatile() / id_private[11]), var9, id_extends[13]);
      }
   }

   @EventTarget
   public void id_class(rrAM var1) {
      this.id_this();
   }

   @EventTarget
   public void id_class(RenderEvent var1) {
      if (!((List)rrTT.id_break[id_finally[49]]).isEmpty()) {
         double var2 = id_void.id_case();
         double var4 = id_void.id_catch();
         double var6 = id_void.id_private();
         Ml_1 var8 = var1.id_class();
         var8.id_class();
         RenderSystem.enableBlend();
         RenderSystem.disableTexture();
         RenderSystem.disableDepthTest();
         RenderSystem.disableCull();
         RenderSystem.blendFunc(id_finally[50], id_finally[51]);
         RenderSystem.lineWidth(id_private[17]);
         GL11.glEnable(id_finally[52]);
         GL11.glHint(id_finally[53], id_finally[54]);
         GL11.glPointSize(id_private[18]);
         id_strictfp.id_class(id_implements[15], ju_3.id_this);
         rjV_2 var9 = var8.id_byte().id_class();

         for (rrTA var11 : (List)rrTT.id_break[id_finally[55]]) {
            rjU_2 var12 = var11.rr();
            int var13 = ColorHelper.id_class(id_finally[56], id_implements[16], id_implements[17], id_finally[57]);
            id_strictfp.id_class(var9, (float)(var12.id_break - var2), (float)(var12.id_byte - var4), (float)(var12.id_protected - var6))
               .id_class(var13)
               .id_class();
         }

         id_default.id_break();
         if ((rrTA)rrTT.id_break[id_finally[58]] != null) {
            id_strictfp.id_class(id_implements[18], ju_3.id_this);
            rrTA var14 = (rrTA)rrTT.id_break[id_finally[59]];
            rjU_2 var15 = var14.rr();
            int var16 = ColorHelper.id_class(id_implements[19], id_implements[20], id_finally[60], id_finally[61]);
            id_strictfp.id_class(var9, (float)(var15.id_break - var2), (float)(var15.id_byte - var4), (float)(var15.id_protected - var6))
               .id_class(var16)
               .id_class();
            id_default.id_break();
         }

         RenderSystem.enableDepthTest();
         RenderSystem.enableTexture();
         RenderSystem.disableBlend();
         RenderSystem.enableCull();
         RenderSystem.lineWidth(id_private[19]);
         var8.id_break();
      }
   }

   @EventTarget
   public void id_class(rrFj_1 var1) {
      this.id_goto();
      Integer var6 = (Integer)this.id_break[id_finally[62]] + id_implements[21];
      this.id_break[id_finally[63]] = var6;
      if ((Long)this.id_break[id_finally[64]] == id_catch[2]) {
         Long var7 = rqR_2.id_break();
         this.id_break[id_finally[65]] = var7;
      }
   }

   @EventTarget
   public void id_class(rrAo_1 var1) {
      this.id_goto();
      float var2 = var1.id_throws();
      float var3 = var1.id_this();
      if (var3 > id_private[12] && var2 > id_private[13]) {
      }

      if (var3 > id_private[14] && (Integer)this.id_break[id_finally[34]] > 0) {
         ((List)this.id_break[id_finally[35]]).add(Math.abs(var3));
      }

      if (var2 > id_private[15]) {
         if ((Integer)this.id_break[id_finally[36]] > 0) {
            ((List)this.id_break[id_finally[37]]).add(Math.abs(var2));
         }

         float var4 = var1.id_continue();
         float var5 = ((List)id_byte[id_finally[38]]).isEmpty()
            ? id_private[16]
            : (Float)((rryE)((List)id_byte[id_finally[39]]).get(((List)id_byte[id_finally[40]]).size() - id_implements[14])).id_class[id_finally[41]];
         float var6 = var4 - ((cb_3)id_import.id_class[id_finally[42]]).b();
         byte var7 = id_extends[14];
         ((List)id_byte[id_finally[43]]).add(new rryE(var4, var5 + (float)var7, var6));
         if (var5 + (float)(var7 * id_extends[15]) > id_import.id_else().id_volatile()) {
            ((List)id_byte[id_finally[44]]).clear();
         }
      }

      if (((List)this.id_break[id_finally[45]]).size() > id_finally[46]) {
         StringBuilder var8 = new StringBuilder();

         for (PX var11 : (List)this.id_break[id_finally[47]]) {
            var8.append(id_protected[7]).append(var11.id_throws()).append(id_protected[8]).append(var11.id_protected()).append(id_protected[9]);
         }

         String var10 = var8.toString();
         rrfu_3.id_byte(id_protected[10]);
         System.out.println(var10);
         ((List)this.id_break[id_finally[48]]).clear();
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1827744530;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{114, 51, 57, 88, -52, 63, -72, 18}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      this.id_this();
   }

   private void id_goto() {
      if (this.id_break == null) {
         this.id_break = new Object[5];
         this.id_break[3] = 0;
         this.id_break[4] = 0L;
      }
   }

   private static void id_continue() {
      id_extends = new byte[]{-1, 5, -5, 40, -1, 3, 2, -1, -1, 2, -1, -1, 2, -1, 5, 2, 5, 3, 4};
   }

   private static void id_else() {
      id_throws = new double[6];
   }

   private static void id_new() {
      id_protected = new String[]{
         new String("Test Func"),
         new String("Test :)"),
         new String("%.1f"),
         new String("Average yaw speed: %.2f"),
         new String("Max yaw speed: %.2f | Min yaw speed: %.2f"),
         new String("Average pitch speed: %.2f"),
         new String("Max pitch speed: %.2f | Min pitch speed: %.2f"),
         new String("new Rotation("),
         new String("F, "),
         new String("F), "),
         new String("First 300 rotations")
      };
   }

   private static void id_return() {
      id_finally = new short[]{
         4,
         0,
         1,
         2,
         4,
         0,
         7,
         0,
         7,
         1,
         2,
         2,
         2,
         1,
         2,
         2,
         7,
         15,
         3,
         4,
         4,
         15,
         1,
         1,
         1,
         1,
         15,
         15,
         2,
         2,
         2,
         2,
         15,
         15,
         3,
         1,
         3,
         2,
         0,
         0,
         0,
         1,
         57,
         0,
         0,
         0,
         300,
         0,
         0,
         1,
         770,
         771,
         2848,
         3154,
         4354,
         1,
         255,
         255,
         2,
         2,
         255,
         255,
         3,
         3,
         4,
         4,
         3,
         4,
         0,
         1,
         2,
         0
      };
   }

   private static void id_super() {
      id_implements = new boolean[]{
         true,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true
      };
   }

   private static void id_try() {
      Object[] var0 = new Object[]{new ArrayList()};
      id_byte = var0;
   }

   private static void id_while() {
      id_catch = new long[]{-1L, -1L, -1L, -1L, 0L};
   }

   private static void id_public() {
      id_private = new float[]{2.0F, 45.0F, 5.0F, 1.0F, 3.0F, 0.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 5.0F, 1.0F};
   }
}

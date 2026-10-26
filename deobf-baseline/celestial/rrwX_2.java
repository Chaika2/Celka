package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwX_2 implements MinecraftAccessor {
   private static byte[] id_byte;
   private static String[] id_protected;
   private static double[] id_throws;
   private static boolean[] id_case;
   private static short[] id_catch;
   public Object[] id_class;
   public static Object[] id_break;
   private static int[] id_private;
   private static float[] id_implements;

   public boolean id_byte() {
      return (Boolean)this.id_class[id_catch[8]];
   }

   private static void id_int() {
      id_case = new boolean[]{true, false, false, false, true, false, true, false, false, true, false};
   }

   public rrwX_2(rrtN_2 var1) {
      this.id_case();
      rruL var6 = new rruL();
      this.id_class[id_catch[0]] = var6;
      this.id_class[id_catch[1]] = var1;
      if (var1.id_new()) {
         this.id_package();
      }
   }

   static {
      ntfClinit();
   }

   public void id_class(Ml_1 var1, float var2, float var3, boolean var4, boolean var5) {
      rrtN_2 var6 = this.id_class();
      int var7 = ColorHelper.id_class(id_implements[4]);
      int var8 = ColorHelper.id_class(id_implements[5]);
      int var9 = ColorHelper.id_class(id_implements[6]);
      int var10 = ColorHelper.id_class(id_implements[7]);
      float var11 = var6.id_implements();
      float var12 = var6.ao_();
      rrfD_2.id_class(var1, var2, var3 + id_implements[8], var11, var12, id_implements[9], id_implements[10], id_implements[11], id_implements[12], rrZF.n_);
      rrfD_2.id_break(
         var1, var2, var3, var11, id_implements[13], id_implements[14], id_implements[15], id_implements[16], id_implements[17], var7, var8, var9, var10
      );
      if (!var5) {
         rrZO var13 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_catch[5]]).id_protected();
         StringBuilder var14 = new StringBuilder();
         String var15 = var6.id_byte();

         for (int var16 = id_case[5]; var16 < var15.length(); var16++) {
            char var17 = var15.charAt(var16);
            if (var4 && var13.id_break(var14.toString() + var17) > var11 - id_implements[18]) {
               int var18 = var14.length() - id_case[6];
               if (var18 >= 0 && var14.charAt(var18) == id_byte[0]) {
                  var14.deleteCharAt(var18);
               }

               var14.append(id_protected[0]);
               break;
            }

            var14.append(var17);
         }

         var13.id_byte(var1, var14.toString(), var2 + var11 / id_implements[19] + id_implements[20], var3 + id_implements[21], rrZF.d_, id_case[7]);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -39557666;
   }

   public void id_class(Ml_1 var1, Runnable var2, rrtu_3 var3, int var4, int var5, boolean var6) {
      rrtN_2 var7 = this.id_class();
      float var8 = var7.id_long();
      this.id_class().id_class(var1, var8);
      var2.run();
      this.id_break().id_class(var1, var3, var4, var5, id_case[3], var6);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1026358058022567622L;
   }

   public void id_class(Ml_1 var1, Runnable var2, rrtu_3 var3, int var4, int var5, boolean var6, boolean var7) {
      rrtN_2 var8 = this.id_class();
      rrwX_2 var9 = var8.id_interface();
      float var10 = var8.id_long();
      double var11 = (double)(id_implements[1] - var10);
      var1.id_class(
         var11 * (double)(var8.id_default() + var8.id_implements() / id_implements[2]),
         var11 * (double)(var8.id_abstract() + var8.ao_() / id_implements[3]),
         id_throws[0]
      );
      var1.id_class(var10, var10, var10);
      var9.id_class(var1, var8.id_default(), var8.id_abstract(), var6, var7);
      this.id_break().id_class(var1, var3, var4, var5, id_case[2], var7);
      var2.run();
   }

   public void id_class(Ml_1 var1, Runnable var2, boolean var3, boolean var4) {
      if (var3) {
         var2.run();
      } else {
         float var5 = ((rrtN_2)this.id_class[id_catch[4]]).id_long();
         var1.id_class();
         rrfi_3.id_break();
         if (var4) {
            this.id_class().id_class(var1, var5);
         }

         var2.run();
         rrfi_3.id_class(id_case[4]);
         var1.id_break();
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{122, 111, -1, -88, 35, -121, -114, 86}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(boolean var1) {
      Boolean var6 = var1;
      this.id_class[id_catch[9]] = var6;
   }

   public rrtN_2 id_class() {
      return (rrtN_2)this.id_class[id_catch[6]];
   }

   public void id_class(Ml_1 var1, Runnable var2) {
      var1.id_class();
      RenderSystem.disableBlend();
      RenderSystem.disableAlphaTest();
      float var3 = ((rrtN_2)this.id_class[id_catch[3]]).id_long();
      this.id_class().id_class(var1, var3);
      var2.run();
      RenderSystem.enableAlphaTest();
      RenderSystem.enableBlend();
      var1.id_break();
   }

   public rruL id_break() {
      return (rruL)this.id_class[id_catch[7]];
   }

   private static void id_finally() {
      id_byte = new byte[]{32, 3, 2};
   }

   private static void id_extends() {
      Object[] var0 = new Object[]{-657931};
      id_break = var0;
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[1]];
         Object[] var1 = this.id_class;
         var1[id_byte[2]] = id_case[8];
      }
   }

   private static void id_implements() {
      id_implements = new float[]{
         0.3F,
         1.0F,
         2.0F,
         2.0F,
         0.0F,
         90.0F,
         270.0F,
         180.0F,
         3.0F,
         8.0F,
         8.0F,
         8.0F,
         8.0F,
         13.0F,
         4.0F,
         4.0F,
         0.0F,
         0.0F,
         40.0F,
         2.0F,
         0.5F,
         2.5F,
         9.0F,
         9.0F,
         11.0F,
         2.0F
      };
   }

   private void id_package() {
      rrtN_2 var1 = this.id_class();
      Runnable var2 = () -> var1.id_int();
      rruL var10000 = (rruL)this.id_class[id_catch[2]];
      rruF[] var10001 = new rruF[id_case[0]];
      var10001[id_case[1]] = new rruF(
            this.id_class(),
            new rrun_1(
                  () -> rrZL.id_native,
                  () -> new rjK_2(var1.id_default() + var1.id_implements() - id_implements[24], var1.id_abstract() + id_implements[25]),
                  () -> new rjK_2(id_implements[22], id_implements[23]),
                  () -> id_private[0]
               )
               .id_class(id_implements[0])
         )
         .id_class(var2);
      var10000.id_class(var10001);
   }

   private static void id_protected() {
      id_catch = new short[]{1, 0, 1, 0, 0, 0, 0, 1, 2, 2};
   }

   private static void id_private() {
      id_protected = new String[]{new String("...")};
   }

   private static void id_final() {
      id_private = new int[]{-657931, -657931};
   }

   private static void id_native() {
      id_throws = new double[1];
   }
}

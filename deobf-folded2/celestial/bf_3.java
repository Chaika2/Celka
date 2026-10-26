package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bf_3 extends vm_3 implements PP {
   private static String[] id_throws;
   private static double[] id_case;
   public Object[] id_class;
   private static short[] id_catch;
   private static boolean[] id_private;
   private static float[] id_implements;
   private static byte[] id_finally;

   private static void id_char() {
      id_private = new boolean[]{false, true, false, true, true, false, false, true, false, true, true, true, true};
   }

   private static void id_int() {
      id_throws = new String[]{new String("CLICK")};
   }

   public bf_3() {
      super(new rgN_2("CLICK"));
      this.id_interface();
   }

   static {
      ntfClinit();
   }

   private void id_interface() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
      }
   }

   public void id_class(Ml_1 var1, rjV_2 var2) {
      this.id_interface();
      rjV_2 var11 = var2.id_case();
      this.id_class[0] = var11;
      ((rjV_2)this.id_class[0]).id_class(var1.id_byte().id_class());
      ((rjV_2)this.id_class[0]).id_throws();
      if ((rfH_2)this.id_class[2] != null) {
         QY var3 = QY.id_instanceof();
         an_3 var4 = var3.id_catch();
         bg_3.id_class(var1, var4, Collections.singletonList((rfH_2)this.id_class[2]), Color.CYAN);
         if ((rfH_2)this.id_class[1] != null && !((rfH_2)this.id_class[1]).equals((rfH_2)this.id_class[2])) {
            RenderSystem.enableBlend();
            RenderSystem.blendFuncSeparate(770, 771, 1, 0);
            RenderSystem.color4f(Color.RED.getColorComponents(null)[0], Color.RED.getColorComponents(null)[1], Color.RED.getColorComponents(null)[2], 0.4F);
            RenderSystem.lineWidth((Float)C_class.id_instanceof().id_break.id_class[0]);
            RenderSystem.disableTexture();
            RenderSystem.depthMask(false);
            RenderSystem.disableDepthTest();
            rU_2 var5 = new rU_2((rfH_2)this.id_class[2]);
            rU_2 var6 = new rU_2((rfH_2)this.id_class[1]);
            bj_3.id_class(
               var1,
               new rfl_3(
                  (double)Math.min((Integer)var5.id_break[0], (Integer)var6.id_break[0]),
                  (double)Math.min((Integer)var5.id_break[1], (Integer)var6.id_break[1]),
                  (double)Math.min((Integer)var5.id_break[2], (Integer)var6.id_break[2]),
                  (double)(Math.max((Integer)var5.id_break[0], (Integer)var6.id_break[0]) + 1),
                  (double)(Math.max((Integer)var5.id_break[1], (Integer)var6.id_break[1]) + 1),
                  (double)(Math.max((Integer)var5.id_break[2], (Integer)var6.id_break[2]) + 1)
               )
            );
            RenderSystem.enableDepthTest();
            RenderSystem.depthMask(true);
            RenderSystem.enableTexture();
            RenderSystem.disableBlend();
         }
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-72, -116, -37, -120, -76, 119, -23, -22}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public boolean id_class(double var1, double var3, int var5) {
      this.id_interface();
      if ((rfH_2)this.id_class[2] != null) {
         if (var5 == 0) {
            if ((rfH_2)this.id_class[1] != null && !((rfH_2)this.id_class[1]).equals((rfH_2)this.id_class[2])) {
               C_throws.id_class().id_break().id_double().id_throws();
               C_throws.id_class().id_break().id_double().id_class(rU_2.id_class((rfH_2)this.id_class[1]), rU_2.id_class((rfH_2)this.id_class[2]));
               rVe_1 var6 = new rVe_1("Selection made! For usage: " + (String)C_class.id_instanceof().id_protected.id_class[0] + "help sel");
               var6.id_class(var6.id_class().id_class(rgF_2.WHITE).id_class(new rgl_3(rgH_2.RUN_COMMAND, C_throw.id_class + "help sel")));
               a_.id_class(var6);
               Object var11 = null;
               this.id_class[1] = var11;
            } else {
               C_throws.id_class().id_break().id_import().id_break(new rS_2((rfH_2)this.id_class[2]));
            }
         } else if (var5 == 1) {
            C_throws.id_class().id_break().id_import().id_break(new rS_2(((rfH_2)this.id_class[2]).id_final()));
         }
      }

      Object var12 = null;
      this.id_class[1] = var12;
      return super.id_class(var1, var3, var5);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6903430105361454797L;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_interface();
      QY var5 = QY.id_instanceof();
      double var6 = ((Qi_1)var5.id_class[22]).id_byte();
      double var8 = ((Qi_1)var5.id_class[22]).id_protected();
      var8 = (double)var5.id_else().id_continue() - var8;
      var8 *= (double)var5.id_else().id_native() / (double)var5.id_else().id_continue();
      var6 *= (double)var5.id_else().id_extends() / (double)var5.id_else().id_new();
      rjU_2 var10 = this.id_break(var6, var8, 0.0);
      rjU_2 var11 = this.id_break(var6, var8, 1.0);
      if (var10 != null && var11 != null) {
         rjU_2 var12 = new rjU_2(bg_3.id_byte(), bg_3.id_break(), bg_3.id_class());
         cb_3 var13 = C_throws.id_class().id_break().id_throw().id_catch();
         rff_3 var14 = ((rYB)var13.id_throws[7]).id_class(new rjB_2(var10.id_throws(var12), var11.id_throws(var12), rjS_2.OUTLINE, rjs_3.NONE, var13));
         if (var14 != null && var14.id_byte() == rjM_2.BLOCK) {
            rfH_2 var19 = var14.id_class();
            this.id_class[2] = var19;
         }
      }
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      this.id_interface();
      rfH_2 var10 = (rfH_2)this.id_class[2];
      this.id_class[1] = var10;
      return super.id_break(var1, var3, var5);
   }

   private rjU_2 id_break(double var1, double var3, double var5) {
      this.id_interface();
      if ((rjV_2)this.id_class[0] == null) {
         return null;
      } else {
         QY var7 = QY.id_instanceof();
         var1 /= (double)var7.id_else().id_extends();
         var3 /= (double)var7.id_else().id_native();
         var1 = var1 * 2.0 - 1.0;
         var3 = var3 * 2.0 - 1.0;
         rji_3 var8 = new rji_3((float)var1, (float)var3, (float)var5, 1.0F);
         var8.id_class((rjV_2)this.id_class[0]);
         if (var8.id_protected() == 0.0F) {
            return null;
         } else {
            var8.id_case();
            return new rjU_2((double)var8.id_class(), (double)var8.id_break(), (double)var8.id_byte());
         }
      }
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1524138729;
   }

   private static void id_finally() {
      id_case = new double[]{0.0, 1.0, 2.0, 1.0, 2.0, 1.0};
   }

   private static void id_package() {
      id_implements = new float[]{0.4F, 1.0F, 0.0F};
   }

   private static void id_final() {
      id_finally = new byte[]{2, 3};
   }

   private static void id_native() {
      id_catch = new short[]{
         22, 22, 7, 2, 2, 1, 1, 2, 1, 2, 0, 1, 2, 2, 1, 2, 1, 0, 0, 0, 2, 2, 1, 1, 2, 770, 771, 0, 2, 1, 0, 0, 1, 1, 2, 2, 0, 0, 1, 1, 2, 2, 0, 0
      };
   }

   @Override
   public boolean z_() {
      return false;
   }
}

package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bf_3 extends vm_3 implements PP {
   private static String[] throws_;
   private static double[] case_;
   public Object[] class_;
   private static short[] catch_;
   private static boolean[] private_;
   private static float[] implements_;
   private static byte[] finally_;

   private static void char_() {
      private_ = new boolean[]{false, true, false, true, true, false, false, true, false, true, true, true, true};
   }

   private static void int_() {
      throws_ = new String[]{new String("CLICK")};
   }

   public bf_3() {
      super(new rgN_2("CLICK"));
      this.interface_();
   }

   static {
      ntfClinit();
   }

   private void interface_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
      }
   }

   public void class_(Ml_1 var1, rjV_2 var2) {
      this.interface_();
      rjV_2 var11 = var2.case_();
      this.class_[0] = var11;
      ((rjV_2)this.class_[0]).class_(var1.byte_().class_());
      ((rjV_2)this.class_[0]).throws_();
      if ((rfH_2)this.class_[2] != null) {
         QY var3 = QY.instanceof_();
         an_3 var4 = var3.catch_();
         bg_3.class_(var1, var4, Collections.singletonList((rfH_2)this.class_[2]), Color.CYAN);
         if ((rfH_2)this.class_[1] != null && !((rfH_2)this.class_[1]).equals((rfH_2)this.class_[2])) {
            RenderSystem.enableBlend();
            RenderSystem.blendFuncSeparate(770, 771, 1, 0);
            RenderSystem.color4f(Color.RED.getColorComponents(null)[0], Color.RED.getColorComponents(null)[1], Color.RED.getColorComponents(null)[2], 0.4F);
            RenderSystem.lineWidth((Float)C_class.instanceof_().break_.class_[0]);
            RenderSystem.disableTexture();
            RenderSystem.depthMask(false);
            RenderSystem.disableDepthTest();
            rU_2 var5 = new rU_2((rfH_2)this.class_[2]);
            rU_2 var6 = new rU_2((rfH_2)this.class_[1]);
            bj_3.class_(
               var1,
               new rfl_3(
                  (double)Math.min((Integer)var5.break_[0], (Integer)var6.break_[0]),
                  (double)Math.min((Integer)var5.break_[1], (Integer)var6.break_[1]),
                  (double)Math.min((Integer)var5.break_[2], (Integer)var6.break_[2]),
                  (double)(Math.max((Integer)var5.break_[0], (Integer)var6.break_[0]) + 1),
                  (double)(Math.max((Integer)var5.break_[1], (Integer)var6.break_[1]) + 1),
                  (double)(Math.max((Integer)var5.break_[2], (Integer)var6.break_[2]) + 1)
               )
            );
            RenderSystem.enableDepthTest();
            RenderSystem.depthMask(true);
            RenderSystem.enableTexture();
            RenderSystem.disableBlend();
         }
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-72, -116, -37, -120, -76, 119, -23, -22}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public boolean class_(double var1, double var3, int var5) {
      this.interface_();
      if ((rfH_2)this.class_[2] != null) {
         if (var5 == 0) {
            if ((rfH_2)this.class_[1] != null && !((rfH_2)this.class_[1]).equals((rfH_2)this.class_[2])) {
               C_throws.class_().break_().double_().throws_();
               C_throws.class_().break_().double_().class_(rU_2.class_((rfH_2)this.class_[1]), rU_2.class_((rfH_2)this.class_[2]));
               rVe_1 var6 = new rVe_1("Selection made! For usage: " + (String)C_class.instanceof_().protected_.class_[0] + "help sel");
               var6.class_(var6.class_().class_(rgF_2.WHITE).class_(new rgl_3(rgH_2.RUN_COMMAND, C_throw.class_ + "help sel")));
               a_.class_(var6);
               Object var11 = null;
               this.class_[1] = var11;
            } else {
               C_throws.class_().break_().import_().break_(new rS_2((rfH_2)this.class_[2]));
            }
         } else if (var5 == 1) {
            C_throws.class_().break_().import_().break_(new rS_2(((rfH_2)this.class_[2]).final_()));
         }
      }

      Object var12 = null;
      this.class_[1] = var12;
      return super.class_(var1, var3, var5);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6903430105361454797L;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.interface_();
      QY var5 = QY.instanceof_();
      double var6 = ((Qi_1)var5.class_[22]).byte_();
      double var8 = ((Qi_1)var5.class_[22]).protected_();
      var8 = (double)var5.else_().continue_() - var8;
      var8 *= (double)var5.else_().native_() / (double)var5.else_().continue_();
      var6 *= (double)var5.else_().extends_() / (double)var5.else_().new_();
      rjU_2 var10 = this.break_(var6, var8, 0.0);
      rjU_2 var11 = this.break_(var6, var8, 1.0);
      if (var10 != null && var11 != null) {
         rjU_2 var12 = new rjU_2(bg_3.byte_(), bg_3.break_(), bg_3.class_());
         cb_3 var13 = C_throws.class_().break_().throw_().catch_();
         rff_3 var14 = ((rYB)var13.throws_[7]).class_(new rjB_2(var10.throws_(var12), var11.throws_(var12), rjS_2.OUTLINE, rjs_3.NONE, var13));
         if (var14 != null && var14.byte_() == rjM_2.BLOCK) {
            rfH_2 var19 = var14.class_();
            this.class_[2] = var19;
         }
      }
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      this.interface_();
      rfH_2 var10 = (rfH_2)this.class_[2];
      this.class_[1] = var10;
      return super.break_(var1, var3, var5);
   }

   private rjU_2 break_(double var1, double var3, double var5) {
      this.interface_();
      if ((rjV_2)this.class_[0] == null) {
         return null;
      } else {
         QY var7 = QY.instanceof_();
         var1 /= (double)var7.else_().extends_();
         var3 /= (double)var7.else_().native_();
         var1 = var1 * 2.0 - 1.0;
         var3 = var3 * 2.0 - 1.0;
         rji_3 var8 = new rji_3((float)var1, (float)var3, (float)var5, 1.0F);
         var8.class_((rjV_2)this.class_[0]);
         if (var8.protected_() == 0.0F) {
            return null;
         } else {
            var8.case_();
            return new rjU_2((double)var8.class_(), (double)var8.break_(), (double)var8.byte_());
         }
      }
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1524138729;
   }

   private static void finally_() {
      case_ = new double[]{0.0, 1.0, 2.0, 1.0, 2.0, 1.0};
   }

   private static void package_() {
      implements_ = new float[]{0.4F, 1.0F, 0.0F};
   }

   private static void final_() {
      finally_ = new byte[]{2, 3};
   }

   private static void native_() {
      catch_ = new short[]{
         22, 22, 7, 2, 2, 1, 1, 2, 1, 2, 0, 1, 2, 2, 1, 2, 1, 0, 0, 0, 2, 2, 1, 1, 2, 770, 771, 0, 2, 1, 0, 0, 1, 1, 2, 2, 0, 0, 1, 1, 2, 2, 0, 0
      };
   }

   @Override
   public boolean z_() {
      return false;
   }
}

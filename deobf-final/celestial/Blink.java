package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;

public class Blink extends Module {
   private static byte[] byte_;
   private static boolean[] protected_;
   private static String[] throws_;
   private static double[] catch_;
   public Object[] break_;
   private static short[] private_;
   private static float[] implements_;

   public Blink() {
      super("Blink", "Замедляет пакеты отправляемые\nна сервер", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
      this.else_();
      ArrayDeque var5 = new ArrayDeque();
      this.break_[0] = var5;
      rrfw_3 var6 = new rrfw_3();
      this.break_[1] = var6;
      rrIQ var7 = new rrIQ("Режим замедления", "Normal", "Normal", "Delay");
      this.break_[3] = var7;
      rrIm_1 var8 = new rrIm_1("Длительность", 0.5F, 0.1F, 5.0F, 0.1F).class_(() -> {
         this.else_();
         return ((rrIQ)this.break_[3]).byte_().equals("Delay");
      });
      this.break_[4] = var8;
      rrIk_1 var9 = new rrIk_1("Отображать настоящую\nпозицию", true);
      this.break_[5] = var9;
      this.class_(new Setting[]{(rrIQ)this.break_[3], (rrIm_1)this.break_[4], (rrIk_1)this.break_[5]});
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      throws_ = new String[]{
         new String("Blink"),
         new String("Замедляет пакеты отправляемые\nна сервер"),
         new String("Режим замедления"),
         new String("Normal"),
         new String("Normal"),
         new String("Delay"),
         new String("Длительность"),
         new String("Отображать настоящую\nпозицию"),
         new String("S"),
         new String("Delay"),
         new String("Delay")
      };
   }

   @EventTarget
   public void class_(RenderEvent var1) {
      this.else_();
      if (((rrIk_1)this.break_[5]).class_() && (rjU_2)this.break_[2] != null && ((Qw_1)import_.class_[20]).volatile_() != VZ.FIRST_PERSON) {
         Ml_1 var2 = var1.class_();
         rfl_3 var3 = ((cb_3)import_.class_[57]).a_(((cb_3)import_.class_[57]).Pb()).class_((rjU_2)this.break_[2]);
         double var4 = void_.case_();
         double var6 = void_.catch_();
         double var8 = void_.private_();
         var2.class_();
         GL11.glEnable(2848);
         RenderSystem.disableDepthTest();
         RenderSystem.disableTexture();
         RenderSystem.disableLighting();
         RenderSystem.depthMask(false);
         RenderSystem.disableAlphaTest();
         RenderSystem.blendFunc(770, 771);
         RenderSystem.enableBlend();
         RenderSystem.lineWidth(1.5F);
         strictfp_.class_(1, ju_3.this_);
         yX_2.class_(var2, strictfp_, var3.protected_(-var4, -var6, -var8), 1.0F, 1.0F, 1.0F, 1.0F);
         default_.break_();
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.enableTexture();
         RenderSystem.enableDepthTest();
         RenderSystem.enableAlphaTest();
         GL11.glDisable(2848);
         rrfa_3.class_();
         var2.break_();
      }
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.else_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]
         && ((rrIQ)this.break_[3]).byte_().equals("Delay")
         && ((rrfw_3)this.break_[1]).class_((double)(((rrIm_1)this.break_[4]).byte_() * 1000.0F))) {
         this.continue_();
      }
   }

   @EventTarget
   public void class_(rrAl_1 var1) {
      this.else_();
      rjU_2 var6 = new rjU_2(var1.break_(), var1.extends_(), var1.catch_());
      this.break_[2] = var6;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8300829112054583095L;
   }

   @EventTarget
   public void class_(rrFj_1 var1) {
      this.continue_();
   }

   @EventTarget
   public void class_(rrLZ var1) {
      this.else_();
      ruS_2 var2 = var1.class_();
      if (var2 != null
         && !(var2 instanceof rmT_2)
         && !(var2 instanceof rmV_2)
         && !(var2 instanceof rZr_1)
         && !(var2 instanceof rZL)
         && !(var2 instanceof rmJ_2)
         && !(var2 instanceof rLS)
         && !(var2 instanceof rmu_3)
         && !(var2 instanceof rmI_2)
         && !var2.getClass().getSimpleName().startsWith("S")) {
         ((Queue)this.break_[0]).add(var2);
         var1.class_(true);
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2133812722;
   }

   @Override
   public void class_(boolean var1) {
      this.else_();
      super.class_(var1);
      if ((cb_3)import_.class_[57] != null) {
         rjU_2 var6 = ((cb_3)import_.class_[57]).Ps();
         this.break_[2] = var6;
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{119, 2, -31, -86, -36, 91, -85, -26}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      super.throws_(var1);
      this.continue_();
   }

   private static void goto_() {
      byte_ = new byte[]{2, 3, 2, 6};
   }

   private void continue_() {
      this.else_();
      ((rrfw_3)this.break_[1]).class_();

      while (!((Queue)this.break_[0]).isEmpty()) {
         ruS_2 var1 = (ruS_2)((Queue)this.break_[0]).poll();
         if (var1 instanceof rZO var2 && var2.byte_()) {
            rjU_2 var7 = new rjU_2(var2.class_(0.0), var2.break_(0.0), var2.byte_(0.0));
            this.break_[2] = var7;
         }

         ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(var1);
      }
   }

   private void else_() {
      if (this.break_ == null) {
         this.break_ = new Object[6];
      }
   }

   private static void new_() {
      protected_ = new boolean[]{false, true, true, false, true, true, false, true, true};
   }

   private static void return_() {
      implements_ = new float[]{0.5F, 0.1F, 5.0F, 0.1F, 1000.0F, 1.5F, 1.0F, 1.0F, 1.0F, 1.0F};
   }

   private static void while_() {
      private_ = new short[]{3, 0, 1, 3, 4, 5, 3, 4, 5, 0, 2, 0, 3, 1, 4, 5, 2, 20, 57, 57, 2, 2848, 770, 771, 2848, 57, 57, 2, 1, 0, 0, 2, 57, 0, 3};
   }

   private static void public_() {
      catch_ = new double[3];
   }
}

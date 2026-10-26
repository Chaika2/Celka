package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Crosshair extends Module {
   public Object[] break_;
   private static float[] byte_;
   private static String[] protected_;
   private static boolean[] throws_;
   private static int[] catch_;
   private static byte[] private_;
   private static short[] implements_;

   public Crosshair() {
      super("Crosshair", "Позволяет кастомизировать ваш\nприцел", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[2]);
      this.new_();
      rrIz_1 var5 = new rrIz_1("Цвет прицела", -1).break_();
      this.break_[0] = var5;
      rrIk_1 var6 = new rrIk_1("Подсветка энтити", false);
      this.break_[1] = var6;
      rrIz_1 var7 = new rrIz_1("Цвет подсветки", -65536).break_().class_(() -> {
         this.new_();
         return ((rrIk_1)this.break_[1]).class_();
      });
      this.break_[2] = var7;
      rrIk_1 var8 = new rrIk_1("Учитывать кулдаун", false);
      this.break_[3] = var8;
      rrIk_1 var9 = new rrIk_1("Точка по середине", false);
      this.break_[4] = var9;
      rrIm_1 var10 = new rrIm_1("Радиус", 0.0F, 0.0F, 6.0F, 0.5F);
      this.break_[5] = var10;
      rrIm_1 var11 = new rrIm_1("Длина", 4.0F, 0.5F, 6.0F, 0.5F);
      this.break_[6] = var11;
      this.class_(
         new Setting[]{
            (rrIz_1)this.break_[0],
            (rrIk_1)this.break_[1],
            (rrIz_1)this.break_[2],
            (rrIk_1)this.break_[4],
            (rrIk_1)this.break_[3],
            (rrIm_1)this.break_[5],
            (rrIm_1)this.break_[6]
         }
      );
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      implements_ = new short[]{2, 0, 1, 2, 3, 4, 5, 6, 0, 1, 2, 4, 3, 5, 6, 20, 20, 0, 5, 0, 3, 57, 6, 0, 1, 64, 2, 4, 1};
   }

   @EventTarget(
      id_class = -100
   )
   public void class_(rrnB_2 var1) {
      this.new_();
      Ml_1 var2 = var1.class_();
      if (!((Qw_1)import_.class_[20]).R
         && (((Qw_1)import_.class_[20]).volatile_() == VZ.FIRST_PERSON || ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().K().aJ_())) {
         float var3 = const_.volatile_() / 2.0F;
         float var4 = const_.final_() / 2.0F;
         float var5 = ((rrIm_1)this.break_[5]).byte_();
         boolean var6 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().a().aJ_();
         float var7 = var5 + (((rrIk_1)this.break_[3]).class_() ? (1.0F - ((cb_3)import_.class_[57]).class_(0.5F, var6)) * 10.0F : byte_[13]);
         float var8 = ((rrIm_1)this.break_[6]).byte_();
         int var9 = ((rrIz_1)this.break_[0]).byte_();
         int var10 = rrZF.e_;
         if (((rrIk_1)this.break_[1]).class_()) {
            rjG_2 var12 = (rjG_2)import_.class_[64];
            if (var12 instanceof rfo_3 var11) {
               an_3 var14 = var11.class_();
               if (var14 instanceof iB_2) {
                  var9 = ((rrIz_1)this.break_[2]).byte_();
               }
            }
         }

         var2.class_();
         RenderSystem.disableTexture();
         RenderSystem.enableSmoothShadeModel();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         strictfp_.class_(7, ju_3.this_);
         float var13 = 0.5F;
         if (((rrIk_1)this.break_[4]).class_()) {
            rrfD_2.class_(var2, var3 - var13, var4 - var13, 1.0F + var13 * 2.0F, 1.0F + var13 * 2.0F, var10);
            rrfD_2.class_(var2, var3, var4, 1.0F, 1.0F, var9);
         }

         rrfD_2.class_(var2, var3 - (var7 + var8 - 1.0F) - var13, var4 - var13, var8 + var13 * 2.0F, 1.0F + var13 * 2.0F, var10);
         rrfD_2.class_(var2, var3 - var13, var4 - (var7 + var8 - 1.0F) - var13, 1.0F + var13 * 2.0F, var8 + var13 * 2.0F, var10);
         rrfD_2.class_(var2, var3 + var7 - var13, var4 - var13, var8 + var13 * 2.0F, 1.0F + var13 * 2.0F, var10);
         rrfD_2.class_(var2, var3 - var13, var4 + var7 - var13, 1.0F + var13 * 2.0F, var8 + var13 * 2.0F, var10);
         rrfD_2.class_(var2, var3 - (var7 + var8 - 1.0F), var4, var8, 1.0F, var9);
         rrfD_2.class_(var2, var3, var4 - (var7 + var8 - 1.0F), 1.0F, var8, var9);
         rrfD_2.class_(var2, var3 + var7, var4, var8, 1.0F, var9);
         rrfD_2.class_(var2, var3, var4 + var7, 1.0F, var8, var9);
         default_.break_();
         RenderSystem.disableBlend();
         RenderSystem.disableSmoothShadeModel();
         RenderSystem.enableTexture();
         var2.break_();
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1040876553;
   }

   @EventTarget
   public void class_(rrAa_1 var1) {
      var1.class_(true);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5856410163724162779L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{14, 92, -17, -62, 90, -107, 126, -68}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void goto_() {
      private_ = new byte[]{-1, 7, 2, 3, 4, 5, 6, 7, 7};
   }

   private static void continue_() {
      throws_ = new boolean[]{false, false, false, false, true, true};
   }

   private static void else_() {
      protected_ = new String[]{
         new String("Crosshair"),
         new String("Позволяет кастомизировать ваш\nприцел"),
         new String("Цвет прицела"),
         new String("Подсветка энтити"),
         new String("Цвет подсветки"),
         new String("Учитывать кулдаун"),
         new String("Точка по середине"),
         new String("Радиус"),
         new String("Длина")
      };
   }

   private void new_() {
      if (this.break_ == null) {
         this.break_ = new Object[7];
      }
   }

   private static void return_() {
      catch_ = new int[]{-65536};
   }

   private static void super_() {
      byte_ = new float[]{
         0.0F,
         0.0F,
         6.0F,
         0.5F,
         4.0F,
         0.5F,
         6.0F,
         0.5F,
         2.0F,
         2.0F,
         1.0F,
         0.5F,
         10.0F,
         0.0F,
         0.5F,
         1.0F,
         2.0F,
         1.0F,
         2.0F,
         1.0F,
         1.0F,
         1.0F,
         2.0F,
         1.0F,
         2.0F,
         1.0F,
         1.0F,
         2.0F,
         2.0F,
         2.0F,
         1.0F,
         2.0F,
         1.0F,
         2.0F,
         2.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F
      };
   }
}

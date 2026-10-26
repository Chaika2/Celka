package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Crosshair extends Module {
   public Object[] id_break;
   private static float[] id_byte;
   private static String[] id_protected;
   private static boolean[] id_throws;
   private static int[] id_catch;
   private static byte[] id_private;
   private static short[] id_implements;

   public Crosshair() {
      super(id_protected[0], id_protected[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[2]);
      this.id_new();
      rrIz_1 var5 = new rrIz_1(id_protected[2], -1).id_break();
      this.id_break[id_implements[1]] = var5;
      rrIk_1 var6 = new rrIk_1(id_protected[3], id_throws[0]);
      this.id_break[1] = var6;
      rrIz_1 var7 = new rrIz_1(id_protected[4], -65536).id_break().id_class(() -> {
         this.id_new();
         return ((rrIk_1)this.id_break[1]).id_class();
      });
      this.id_break[2] = var7;
      rrIk_1 var8 = new rrIk_1(id_protected[5], id_throws[1]);
      this.id_break[3] = var8;
      rrIk_1 var9 = new rrIk_1(id_protected[6], id_throws[2]);
      this.id_break[4] = var9;
      rrIm_1 var10 = new rrIm_1(id_protected[7], id_byte[0], id_byte[1], 6.0F, 0.5F);
      this.id_break[5] = var10;
      rrIm_1 var11 = new rrIm_1(id_protected[8], 4.0F, 0.5F, 6.0F, 0.5F);
      this.id_break[6] = var11;
      Setting[] var10001 = new Setting[7];
      var10001[id_throws[3]] = (rrIz_1)this.id_break[id_implements[8]];
      var10001[1] = (rrIk_1)this.id_break[1];
      var10001[2] = (rrIz_1)this.id_break[2];
      var10001[3] = (rrIk_1)this.id_break[4];
      var10001[4] = (rrIk_1)this.id_break[3];
      var10001[5] = (rrIm_1)this.id_break[5];
      var10001[6] = (rrIm_1)this.id_break[6];
      this.id_class(var10001);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_implements = new short[]{2, 0, 1, 2, 3, 4, 5, 6, 0, 1, 2, 4, 3, 5, 6, 20, 20, 0, 5, 0, 3, 57, 6, 0, 1, 64, 2, 4, 1};
   }

   @EventTarget(
      id_class = -100
   )
   public void id_class(rrnB_2 var1) {
      this.id_new();
      Ml_1 var2 = var1.id_class();
      if (!((Qw_1)id_import.id_class[20]).R
         && (
            ((Qw_1)id_import.id_class[20]).id_volatile() == VZ.FIRST_PERSON
               || ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_implements[17]]).id_private().K().aJ_()
         )) {
         float var3 = id_const.id_volatile() / 2.0F;
         float var4 = id_const.id_final() / 2.0F;
         float var5 = ((rrIm_1)this.id_break[5]).id_byte();
         boolean var6 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_implements[19]]).id_private().a().aJ_();
         float var7 = var5 + (((rrIk_1)this.id_break[3]).id_class() ? (1.0F - ((cb_3)id_import.id_class[57]).id_class(0.5F, var6)) * 10.0F : id_byte[13]);
         float var8 = ((rrIm_1)this.id_break[6]).id_byte();
         int var9 = ((rrIz_1)this.id_break[id_implements[23]]).id_byte();
         int var10 = rrZF.e_;
         if (((rrIk_1)this.id_break[1]).id_class()) {
            rjG_2 var12 = (rjG_2)id_import.id_class[64];
            if (var12 instanceof rfo_3 var11) {
               an_3 var14 = var11.id_class();
               if (var14 instanceof iB_2) {
                  var9 = ((rrIz_1)this.id_break[2]).id_byte();
               }
            }
         }

         var2.id_class();
         RenderSystem.disableTexture();
         RenderSystem.enableSmoothShadeModel();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         id_strictfp.id_class(7, ju_3.id_this);
         float var13 = 0.5F;
         if (((rrIk_1)this.id_break[4]).id_class()) {
            rrfD_2.id_class(var2, var3 - var13, var4 - var13, 1.0F + var13 * 2.0F, 1.0F + var13 * 2.0F, var10);
            rrfD_2.id_class(var2, var3, var4, 1.0F, 1.0F, var9);
         }

         rrfD_2.id_class(var2, var3 - (var7 + var8 - 1.0F) - var13, var4 - var13, var8 + var13 * 2.0F, 1.0F + var13 * 2.0F, var10);
         rrfD_2.id_class(var2, var3 - var13, var4 - (var7 + var8 - 1.0F) - var13, 1.0F + var13 * 2.0F, var8 + var13 * 2.0F, var10);
         rrfD_2.id_class(var2, var3 + var7 - var13, var4 - var13, var8 + var13 * 2.0F, 1.0F + var13 * 2.0F, var10);
         rrfD_2.id_class(var2, var3 - var13, var4 + var7 - var13, 1.0F + var13 * 2.0F, var8 + var13 * 2.0F, var10);
         rrfD_2.id_class(var2, var3 - (var7 + var8 - 1.0F), var4, var8, 1.0F, var9);
         rrfD_2.id_class(var2, var3, var4 - (var7 + var8 - 1.0F), 1.0F, var8, var9);
         rrfD_2.id_class(var2, var3 + var7, var4, var8, 1.0F, var9);
         rrfD_2.id_class(var2, var3, var4 + var7, 1.0F, var8, var9);
         id_default.id_break();
         RenderSystem.disableBlend();
         RenderSystem.disableSmoothShadeModel();
         RenderSystem.enableTexture();
         var2.id_break();
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1040876553;
   }

   @EventTarget
   public void id_class(rrAa_1 var1) {
      var1.id_class(true);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5856410163724162779L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{14, 92, -17, -62, 90, -107, 126, -68}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_goto() {
      id_private = new byte[]{-1, 7, 2, 3, 4, 5, 6, 7, 7};
   }

   private static void id_continue() {
      id_throws = new boolean[]{false, false, false, false, true, true};
   }

   private static void id_else() {
      id_protected = new String[]{
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

   private void id_new() {
      if (this.id_break == null) {
         this.id_break = new Object[7];
      }
   }

   private static void id_return() {
      id_catch = new int[]{-65536};
   }

   private static void id_super() {
      id_byte = new float[]{
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

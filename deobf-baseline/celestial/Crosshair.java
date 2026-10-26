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
      super(id_protected[0], id_protected[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_implements[0]]);
      this.id_new();
      rrIz_1 var5 = new rrIz_1(id_protected[2], id_private[0]).id_break();
      this.id_break[id_implements[1]] = var5;
      rrIk_1 var6 = new rrIk_1(id_protected[3], id_throws[0]);
      this.id_break[id_implements[2]] = var6;
      rrIz_1 var7 = new rrIz_1(id_protected[4], id_catch[0]).id_break().id_class(() -> {
         this.id_new();
         return ((rrIk_1)this.id_break[id_implements[28]]).id_class();
      });
      this.id_break[id_implements[3]] = var7;
      rrIk_1 var8 = new rrIk_1(id_protected[5], id_throws[1]);
      this.id_break[id_implements[4]] = var8;
      rrIk_1 var9 = new rrIk_1(id_protected[6], id_throws[2]);
      this.id_break[id_implements[5]] = var9;
      rrIm_1 var10 = new rrIm_1(id_protected[7], id_byte[0], id_byte[1], id_byte[2], id_byte[3]);
      this.id_break[id_implements[6]] = var10;
      rrIm_1 var11 = new rrIm_1(id_protected[8], id_byte[4], id_byte[5], id_byte[6], id_byte[7]);
      this.id_break[id_implements[7]] = var11;
      Setting[] var10001 = new Setting[id_private[1]];
      var10001[id_throws[3]] = (rrIz_1)this.id_break[id_implements[8]];
      var10001[id_throws[4]] = (rrIk_1)this.id_break[id_implements[9]];
      var10001[id_private[2]] = (rrIz_1)this.id_break[id_implements[10]];
      var10001[id_private[3]] = (rrIk_1)this.id_break[id_implements[11]];
      var10001[id_private[4]] = (rrIk_1)this.id_break[id_implements[12]];
      var10001[id_private[5]] = (rrIm_1)this.id_break[id_implements[13]];
      var10001[id_private[6]] = (rrIm_1)this.id_break[id_implements[14]];
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
      if (!((Qw_1)id_import.id_class[id_implements[15]]).R
         && (
            ((Qw_1)id_import.id_class[id_implements[16]]).id_volatile() == VZ.FIRST_PERSON
               || ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_implements[17]]).id_private().K().aJ_()
         )) {
         float var3 = id_const.id_volatile() / id_byte[8];
         float var4 = id_const.id_final() / id_byte[9];
         float var5 = ((rrIm_1)this.id_break[id_implements[18]]).id_byte();
         boolean var6 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_implements[19]]).id_private().a().aJ_();
         float var7 = var5
            + (
               ((rrIk_1)this.id_break[id_implements[20]]).id_class()
                  ? (id_byte[10] - ((cb_3)id_import.id_class[id_implements[21]]).id_class(id_byte[11], var6)) * id_byte[12]
                  : id_byte[13]
            );
         float var8 = ((rrIm_1)this.id_break[id_implements[22]]).id_byte();
         int var9 = ((rrIz_1)this.id_break[id_implements[23]]).id_byte();
         int var10 = rrZF.e_;
         if (((rrIk_1)this.id_break[id_implements[24]]).id_class()) {
            rjG_2 var12 = (rjG_2)id_import.id_class[id_implements[25]];
            if (var12 instanceof rfo_3 var11) {
               an_3 var14 = var11.id_class();
               if (var14 instanceof iB_2) {
                  var9 = ((rrIz_1)this.id_break[id_implements[26]]).id_byte();
               }
            }
         }

         var2.id_class();
         RenderSystem.disableTexture();
         RenderSystem.enableSmoothShadeModel();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         id_strictfp.id_class(id_private[7], ju_3.id_this);
         float var13 = id_byte[14];
         if (((rrIk_1)this.id_break[id_implements[27]]).id_class()) {
            rrfD_2.id_class(var2, var3 - var13, var4 - var13, id_byte[15] + var13 * id_byte[16], id_byte[17] + var13 * id_byte[18], var10);
            rrfD_2.id_class(var2, var3, var4, id_byte[19], id_byte[20], var9);
         }

         rrfD_2.id_class(var2, var3 - (var7 + var8 - id_byte[21]) - var13, var4 - var13, var8 + var13 * id_byte[22], id_byte[23] + var13 * id_byte[24], var10);
         rrfD_2.id_class(var2, var3 - var13, var4 - (var7 + var8 - id_byte[25]) - var13, id_byte[26] + var13 * id_byte[27], var8 + var13 * id_byte[28], var10);
         rrfD_2.id_class(var2, var3 + var7 - var13, var4 - var13, var8 + var13 * id_byte[29], id_byte[30] + var13 * id_byte[31], var10);
         rrfD_2.id_class(var2, var3 - var13, var4 + var7 - var13, id_byte[32] + var13 * id_byte[33], var8 + var13 * id_byte[34], var10);
         rrfD_2.id_class(var2, var3 - (var7 + var8 - id_byte[35]), var4, var8, id_byte[36], var9);
         rrfD_2.id_class(var2, var3, var4 - (var7 + var8 - id_byte[37]), id_byte[38], var8, var9);
         rrfD_2.id_class(var2, var3 + var7, var4, var8, id_byte[39], var9);
         rrfD_2.id_class(var2, var3, var4 + var7, id_byte[40], var8, var9);
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
      var1.id_class(id_throws[5]);
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

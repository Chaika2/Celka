package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;

public class Pointers extends Module {
   private static String[] protected_;
   private static boolean[] throws_;
   private static short[] catch_;
   private static float[] private_;
   private static double[] implements_;
   private static int[] finally_;
   public Object[] break_;
   public static Object[] byte_;
   private static byte[] extends_;

   private rrZO byte_(String var1) {
      return var1.equals("Пиксельный")
         ? ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).break_()
         : ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).implements_();
   }

   public Pointers() {
      super("Pointers", "Рисует стрелки к сущностям", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[2]);
      this.else_();
      CheckGroup var5 = new CheckGroup()
         .catch_(true)
         .case_(false)
         .throws_(true)
         .private_(true)
         .break_(false)
         .implements_(false)
         .byte_(false)
         .protected_(false)
         .class_(true);
      this.break_[0] = var5;
      rrIQ var6 = new rrIQ("Режим", "Клиентский", "Клиентский", "Индикатор");
      this.break_[1] = var6;
      rrIz_1 var7 = new rrIz_1("Цвет друзей", Color.GREEN.getRGB()).break_().class_(() -> {
         this.else_();
         return ((CheckGroup)this.break_[0]).implements_();
      });
      this.break_[2] = var7;
      rrIQ var8 = new rrIQ("Режим", "Обычный", "Обычный", "Пиксельный");
      this.break_[3] = var8;
      rrIk_1 var9 = new rrIk_1("Здоровье", true);
      this.break_[4] = var9;
      rrIk_1 var10 = new rrIk_1("Дистанцию", true);
      this.break_[5] = var10;
      rrIk_1 var11 = new rrIk_1("Ник", true);
      this.break_[6] = var11;
      rrIm_1 var12 = new rrIm_1("Размер", 7.0F, 5.0F, 10.0F, 1.0F);
      this.break_[7] = var12;
      rrIm_1 var13 = new rrIm_1("Радиус", 100.0F, 50.0F, 150.0F, 5.0F);
      this.break_[8] = var13;
      rrIk_1 var14 = new rrIk_1("Свечение", true);
      this.break_[9] = var14;
      ObjectOpenHashSet var15 = new ObjectOpenHashSet();
      this.break_[10] = var15;
      AnimValue var16 = new AnimValue(0.5F, false);
      this.break_[11] = var16;
      this.class_(
         new Setting[]{
            new GroupSetting("Цели", new rrIc_1("Выбор", ((CheckGroup)this.break_[0]).byte_())),
            new GroupSetting("Дополнения", new rrIc_1("Отображать", (rrIk_1)this.break_[4], (rrIk_1)this.break_[6], (rrIk_1)this.break_[5])),
            new GroupSetting("Цвета", (rrIQ)this.break_[1], (rrIz_1)this.break_[2]),
            new GroupSetting("Шрифты", (rrIQ)this.break_[3]),
            new GroupSetting("Другое", (rrIm_1)this.break_[7], (rrIm_1)this.break_[8], (rrIk_1)this.break_[9])
         }
      );
   }

   static {
      ntfClinit();
   }

   private float this_() {
      this.else_();
      vm_3 var2 = (vm_3)import_.class_[74];
      if (var2 instanceof Fu_1 var1) {
         int var5 = var1.synchronized_;
         int var3 = var1.return_;
         int var4 = (int)import_.else_().return_();
         return (float)Math.max(var5, var3) + (float)(var4 - 1) * 100.0F;
      } else {
         return ((rrIm_1)this.break_[8]).byte_();
      }
   }

   private rVr_1 class_(an_3 var1) {
      this.else_();
      if (var1 instanceof cG_2 var2 && ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).class_(var2)) {
         int var3 = ((rrIz_1)this.break_[2]).byte_();
         return new rVr_1(var3, var3, var3, var3);
      }

      if (((rrIQ)this.break_[1]).byte_().equals("Индикатор")) {
         int var4 = ColorHelper.break_(ColorHelper.class_(var1), 0.5F);
         return var1 instanceof rSi_1 ? new rVr_1(-6606593, -6606593, -6606593, -6606593) : new rVr_1(var4, var4, var4, var4);
      } else {
         return new rVr_1(ColorHelper.class_(0.0F), ColorHelper.class_(90.0F), ColorHelper.class_(180.0F), ColorHelper.class_(270.0F));
      }
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.else_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((Set)this.break_[10]).clear();
         ObjectSet var2 = ((gm_3)import_.class_[56]).return_().int2ObjectEntrySet();
         ObjectIterator var3 = var2.iterator();

         while (var3.hasNext()) {
            Entry var4 = (Entry)var3.next();
            an_3 var5 = (an_3)var4.getValue();
            if (this.class_(var5, (CheckGroup)this.break_[0])) {
               ((Set)this.break_[10]).add(var5);
            }
         }

         Float var10 = this.this_();
         this.break_[12] = var10;
      }
   }

   private void class_(Ml_1 var1, rrZO var2, an_3 var3, float var4, float var5, float var6) {
      this.else_();
      float var7 = var4 / 2.0F;
      if (((rrIk_1)this.break_[5]).class_()) {
         String var8 = (int)Math.abs(((cb_3)import_.class_[57]).implements_(var3)) + "m";
         var2.class_(var1, strictfp_, var8, var5, var6 + var7 + 5.0F, rrZF.d_);
      }

      if (((rrIk_1)this.break_[6]).class_()) {
         var2.class_(
            var1,
            strictfp_,
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().throws_().break_(var3.extends_()),
            var5,
            var6 - var7 - 6.0F,
            rrZF.d_
         );
      }
   }

   @EventTarget
   public void class_(rrnB_2 var1) {
      this.else_();
      if (!((Set)this.break_[10]).isEmpty()) {
         Ml_1 var2 = var1.class_();
         float var3 = var1.break_();
         ((AnimValue)this.break_[11]).break_((Float)this.break_[12]);
         float var4 = ((AnimValue)this.break_[11]).byte_();
         float var5 = ((rrIm_1)this.break_[7]).byte_();
         float var6 = (float)const_.extends_() / 4.0F;
         float var7 = (float)const_.native_() / 4.0F;
         rrZO var8 = this.byte_(((rrIQ)this.break_[3]).byte_());
         rrfD_2.byte_((lD_2)rrfD_2.class_[7]);
         rrfD_2.throws_((lD_2)rrfD_2.class_[8]);
         var8.break_(strictfp_);
         import_.A().class_((rqO_2)byte_[0]);
         float var9 = (Float)((cb_3)import_.class_[57]).throws_[15] * (float) (Math.PI / 180.0);
         float var10 = rfU_2.break_(var9);
         float var11 = rfU_2.class_(var9);
         float var12 = -var5 / 2.0F;

         for (an_3 var14 : (Set)this.break_[10]) {
            float var15 = (float)(rrjZ_2.protected_(var14, var3) - rrjZ_2.protected_((cb_3)import_.class_[57], var3));
            float var16 = (float)(rrjZ_2.byte_(var14, var3) - rrjZ_2.byte_((cb_3)import_.class_[57], var3));
            float var17 = -(var16 * var10 - var15 * var11);
            float var18 = -(var15 * var10 + var16 * var11);
            float var19 = (float)(Math.atan2((double)var17, (double)var18) * (float) (180.0 / Math.PI));
            float var20 = (float)Math.toRadians((double)var19);
            float var21 = var4 / 2.0F;
            float var22 = var21 * rfU_2.break_(var20) + var6;
            float var23 = var21 * rfU_2.class_(var20) + var7;
            var2.class_();
            var2.class_((double)var22, (double)var23, 0.0);
            this.class_(var2, var8, var14, var5, 0.0F, 0.0F);
            if (var14 instanceof iB_2 var24 && ((rrIk_1)this.break_[4]).class_()) {
               this.class_(var2, var24, var5, 0.0F, var12);
            }

            var2.class_(rje_3.case_.byte_(var19 + 90.0F));
            this.class_(var2, var14, var5);
            var2.break_();
         }

         boolean var25 = ((rrIk_1)this.break_[9]).class_();
         if (var25) {
            GL11.glBlendFunc(770, 1);
         }

         rrfD_2.catch_((lD_2)rrfD_2.class_[7]);
         if (var25) {
            GL11.glBlendFunc(770, 771);
         }

         rrfD_2.private_((lD_2)rrfD_2.class_[8]);
         var8.byte_(strictfp_);
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4752496285503973076L;
   }

   private void class_(Ml_1 var1, an_3 var2, float var3) {
      rVr_1 var4 = this.class_(var2);
      rrfD_2.break_(var1, (lD_2)rrfD_2.class_[7], var3, var4.class_(), var4.break_(), var4.byte_(), var4.byte_());
   }

   private void class_(Ml_1 var1, iB_2 var2, float var3, float var4, float var5) {
      float var6 = rrjZ_2.class_(var2);
      float var7 = var3 / 2.0F;
      float var8 = var4 - var7 - 5.0F;
      float var9 = 1.0F;
      float var10 = var3 + 2.0F;
      float var11 = var10 * var6;
      rrfD_2.class_(var1, (lD_2)rrfD_2.class_[8], var8 - 0.5F, var5 - 0.5F, var9 + 1.0F, var10 + 1.0F, ColorHelper.break_(rrZF.e_, Math.min(225, 80)));
      rrfD_2.class_(var1, (lD_2)rrfD_2.class_[8], var8, var5 + var10 - var11, var9, var11, ColorHelper.break_(ColorHelper.class_(var2), 0.5F));
   }

   private boolean class_(an_3 var1, CheckGroup var2) {
      return var1 != null && var1 != (cb_3)import_.class_[57] && var1.Pu() ? rrff_3.class_(var1, var2) : throws_[34];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -38831160;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-78, 121, -75, -67, -4, 96, -83, -20}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      this.else_();
      super.throws_(var1);
      ((Set)this.break_[10]).clear();
   }

   private static void continue_() {
      finally_ = new int[]{-6606593, -6606593, -6606593, -6606593};
   }

   private void else_() {
      if (this.break_ == null) {
         this.break_ = new Object[13];
         this.break_[12] = 0.0F;
      }
   }

   private static void instanceof_() {
      catch_ = new short[]{
         2,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         0,
         4,
         6,
         5,
         1,
         2,
         3,
         7,
         8,
         9,
         10,
         11,
         12,
         11,
         7,
         3,
         7,
         8,
         0,
         57,
         15,
         10,
         57,
         57,
         4,
         9,
         770,
         7,
         770,
         771,
         8,
         0,
         10,
         56,
         0,
         10,
         12,
         10,
         7,
         8,
         225,
         8,
         5,
         57,
         6,
         0,
         74,
         8,
         57,
         0,
         2,
         1,
         0,
         0,
         0
      };
   }

   private static void new_() {
      protected_ = new String[]{
         new String("Pointers"),
         new String("Рисует стрелки к сущностям"),
         new String("Режим"),
         new String("Клиентский"),
         new String("Клиентский"),
         new String("Индикатор"),
         new String("Цвет друзей"),
         new String("Режим"),
         new String("Обычный"),
         new String("Обычный"),
         new String("Пиксельный"),
         new String("Здоровье"),
         new String("Дистанцию"),
         new String("Ник"),
         new String("Размер"),
         new String("Радиус"),
         new String("Свечение"),
         new String("Цели"),
         new String("Выбор"),
         new String("Дополнения"),
         new String("Отображать"),
         new String("Цвета"),
         new String("Шрифты"),
         new String("Другое"),
         new String("Индикатор"),
         new String("Пиксельный"),
         new String("celestial/images/pointer.png")
      };
   }

   private static void return_() {
      throws_ = new boolean[]{
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         true,
         true,
         false,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         true
      };
   }

   private static void super_() {
      Object[] var0 = new Object[]{new rqO_2("celestial/images/pointer.png")};
      byte_ = var0;
   }

   private static void try_() {
      implements_ = new double[]{(float) (180.0 / Math.PI), 0.0};
   }

   private static void while_() {
      private_ = new float[]{
         7.0F,
         5.0F,
         10.0F,
         1.0F,
         100.0F,
         50.0F,
         150.0F,
         5.0F,
         0.5F,
         4.0F,
         4.0F,
         (float) (Math.PI / 180.0),
         2.0F,
         2.0F,
         0.0F,
         0.0F,
         0.0F,
         90.0F,
         2.0F,
         5.0F,
         1.0F,
         2.0F,
         0.5F,
         0.5F,
         1.0F,
         1.0F,
         0.5F,
         2.0F,
         5.0F,
         6.0F,
         100.0F,
         0.5F,
         0.0F,
         90.0F,
         180.0F,
         270.0F,
         0.0F
      };
   }

   private static void public_() {
      extends_ = new byte[]{2, 2, 5, 3, 2, 2, 2, 3, 4, 3, 2, 80, 13, 12};
   }
}

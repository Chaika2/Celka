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
   private static String[] id_protected;
   private static boolean[] id_throws;
   private static short[] id_catch;
   private static float[] id_private;
   private static double[] id_implements;
   private static int[] id_finally;
   public Object[] id_break;
   public static Object[] id_byte;
   private static byte[] id_extends;

   private rrZO id_byte(String var1) {
      return var1.equals("Пиксельный")
         ? ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_break()
         : ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_implements();
   }

   public Pointers() {
      super("Pointers", "Рисует стрелки к сущностям", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[2]);
      this.id_else();
      CheckGroup var5 = new CheckGroup()
         .id_catch(true)
         .id_case(false)
         .id_throws(true)
         .id_private(true)
         .id_break(false)
         .id_implements(false)
         .id_byte(false)
         .id_protected(false)
         .id_class(true);
      this.id_break[0] = var5;
      rrIQ var6 = new rrIQ("Режим", "Клиентский", "Клиентский", "Индикатор");
      this.id_break[1] = var6;
      rrIz_1 var7 = new rrIz_1("Цвет друзей", Color.GREEN.getRGB()).id_break().id_class(() -> {
         this.id_else();
         return ((CheckGroup)this.id_break[0]).id_implements();
      });
      this.id_break[2] = var7;
      rrIQ var8 = new rrIQ("Режим", "Обычный", "Обычный", "Пиксельный");
      this.id_break[3] = var8;
      rrIk_1 var9 = new rrIk_1("Здоровье", true);
      this.id_break[4] = var9;
      rrIk_1 var10 = new rrIk_1("Дистанцию", true);
      this.id_break[5] = var10;
      rrIk_1 var11 = new rrIk_1("Ник", true);
      this.id_break[6] = var11;
      rrIm_1 var12 = new rrIm_1("Размер", 7.0F, 5.0F, 10.0F, 1.0F);
      this.id_break[7] = var12;
      rrIm_1 var13 = new rrIm_1("Радиус", 100.0F, 50.0F, 150.0F, 5.0F);
      this.id_break[8] = var13;
      rrIk_1 var14 = new rrIk_1("Свечение", true);
      this.id_break[9] = var14;
      ObjectOpenHashSet var15 = new ObjectOpenHashSet();
      this.id_break[10] = var15;
      AnimValue var16 = new AnimValue(0.5F, false);
      this.id_break[11] = var16;
      this.id_class(
         new Setting[]{
            new GroupSetting("Цели", new rrIc_1("Выбор", ((CheckGroup)this.id_break[0]).id_byte())),
            new GroupSetting("Дополнения", new rrIc_1("Отображать", (rrIk_1)this.id_break[4], (rrIk_1)this.id_break[6], (rrIk_1)this.id_break[5])),
            new GroupSetting("Цвета", (rrIQ)this.id_break[1], (rrIz_1)this.id_break[2]),
            new GroupSetting("Шрифты", (rrIQ)this.id_break[3]),
            new GroupSetting("Другое", (rrIm_1)this.id_break[7], (rrIm_1)this.id_break[8], (rrIk_1)this.id_break[9])
         }
      );
   }

   static {
      ntfClinit();
   }

   private float id_this() {
      this.id_else();
      vm_3 var2 = (vm_3)id_import.id_class[74];
      if (var2 instanceof Fu_1 var1) {
         int var5 = var1.id_synchronized;
         int var3 = var1.id_return;
         int var4 = (int)id_import.id_else().id_return();
         return (float)Math.max(var5, var3) + (float)(var4 - 1) * 100.0F;
      } else {
         return ((rrIm_1)this.id_break[8]).id_byte();
      }
   }

   private rVr_1 id_class(an_3 var1) {
      this.id_else();
      if (var1 instanceof cG_2 var2 && ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).id_class(var2)) {
         int var3 = ((rrIz_1)this.id_break[2]).id_byte();
         return new rVr_1(var3, var3, var3, var3);
      }

      if (((rrIQ)this.id_break[1]).id_byte().equals("Индикатор")) {
         int var4 = ColorHelper.id_break(ColorHelper.id_class(var1), 0.5F);
         return var1 instanceof rSi_1 ? new rVr_1(-6606593, -6606593, -6606593, -6606593) : new rVr_1(var4, var4, var4, var4);
      } else {
         return new rVr_1(ColorHelper.id_class(0.0F), ColorHelper.id_class(90.0F), ColorHelper.id_class(180.0F), ColorHelper.id_class(270.0F));
      }
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_else();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((Set)this.id_break[10]).clear();
         ObjectSet var2 = ((gm_3)id_import.id_class[56]).id_return().int2ObjectEntrySet();
         ObjectIterator var3 = var2.iterator();

         while (var3.hasNext()) {
            Entry var4 = (Entry)var3.next();
            an_3 var5 = (an_3)var4.getValue();
            if (this.id_class(var5, (CheckGroup)this.id_break[0])) {
               ((Set)this.id_break[10]).add(var5);
            }
         }

         Float var10 = this.id_this();
         this.id_break[12] = var10;
      }
   }

   private void id_class(Ml_1 var1, rrZO var2, an_3 var3, float var4, float var5, float var6) {
      this.id_else();
      float var7 = var4 / 2.0F;
      if (((rrIk_1)this.id_break[5]).id_class()) {
         String var8 = (int)Math.abs(((cb_3)id_import.id_class[57]).id_implements(var3)) + "m";
         var2.id_class(var1, id_strictfp, var8, var5, var6 + var7 + 5.0F, rrZF.d_);
      }

      if (((rrIk_1)this.id_break[6]).id_class()) {
         var2.id_class(
            var1,
            id_strictfp,
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_throws().id_break(var3.id_extends()),
            var5,
            var6 - var7 - 6.0F,
            rrZF.d_
         );
      }
   }

   @EventTarget
   public void id_class(rrnB_2 var1) {
      this.id_else();
      if (!((Set)this.id_break[10]).isEmpty()) {
         Ml_1 var2 = var1.id_class();
         float var3 = var1.id_break();
         ((AnimValue)this.id_break[11]).id_break((Float)this.id_break[12]);
         float var4 = ((AnimValue)this.id_break[11]).id_byte();
         float var5 = ((rrIm_1)this.id_break[7]).id_byte();
         float var6 = (float)id_const.id_extends() / 4.0F;
         float var7 = (float)id_const.id_native() / 4.0F;
         rrZO var8 = this.id_byte(((rrIQ)this.id_break[3]).id_byte());
         rrfD_2.id_byte((lD_2)rrfD_2.id_class[7]);
         rrfD_2.id_throws((lD_2)rrfD_2.id_class[8]);
         var8.id_break(id_strictfp);
         id_import.A().id_class((rqO_2)id_byte[0]);
         float var9 = (Float)((cb_3)id_import.id_class[57]).id_throws[15] * (float) (Math.PI / 180.0);
         float var10 = rfU_2.id_break(var9);
         float var11 = rfU_2.id_class(var9);
         float var12 = -var5 / 2.0F;

         for (an_3 var14 : (Set)this.id_break[10]) {
            float var15 = (float)(rrjZ_2.id_protected(var14, var3) - rrjZ_2.id_protected((cb_3)id_import.id_class[57], var3));
            float var16 = (float)(rrjZ_2.id_byte(var14, var3) - rrjZ_2.id_byte((cb_3)id_import.id_class[57], var3));
            float var17 = -(var16 * var10 - var15 * var11);
            float var18 = -(var15 * var10 + var16 * var11);
            float var19 = (float)(Math.atan2((double)var17, (double)var18) * (float) (180.0 / Math.PI));
            float var20 = (float)Math.toRadians((double)var19);
            float var21 = var4 / 2.0F;
            float var22 = var21 * rfU_2.id_break(var20) + var6;
            float var23 = var21 * rfU_2.id_class(var20) + var7;
            var2.id_class();
            var2.id_class((double)var22, (double)var23, 0.0);
            this.id_class(var2, var8, var14, var5, 0.0F, 0.0F);
            if (var14 instanceof iB_2 var24 && ((rrIk_1)this.id_break[4]).id_class()) {
               this.id_class(var2, var24, var5, 0.0F, var12);
            }

            var2.id_class(rje_3.id_case.id_byte(var19 + 90.0F));
            this.id_class(var2, var14, var5);
            var2.id_break();
         }

         boolean var25 = ((rrIk_1)this.id_break[9]).id_class();
         if (var25) {
            GL11.glBlendFunc(770, 1);
         }

         rrfD_2.id_catch((lD_2)rrfD_2.id_class[7]);
         if (var25) {
            GL11.glBlendFunc(770, 771);
         }

         rrfD_2.id_private((lD_2)rrfD_2.id_class[8]);
         var8.id_byte(id_strictfp);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4752496285503973076L;
   }

   private void id_class(Ml_1 var1, an_3 var2, float var3) {
      rVr_1 var4 = this.id_class(var2);
      rrfD_2.id_break(var1, (lD_2)rrfD_2.id_class[7], var3, var4.id_class(), var4.id_break(), var4.id_byte(), var4.id_byte());
   }

   private void id_class(Ml_1 var1, iB_2 var2, float var3, float var4, float var5) {
      float var6 = rrjZ_2.id_class(var2);
      float var7 = var3 / 2.0F;
      float var8 = var4 - var7 - 5.0F;
      float var9 = 1.0F;
      float var10 = var3 + 2.0F;
      float var11 = var10 * var6;
      rrfD_2.id_class(var1, (lD_2)rrfD_2.id_class[8], var8 - 0.5F, var5 - 0.5F, var9 + 1.0F, var10 + 1.0F, ColorHelper.id_break(rrZF.e_, Math.min(225, 80)));
      rrfD_2.id_class(var1, (lD_2)rrfD_2.id_class[8], var8, var5 + var10 - var11, var9, var11, ColorHelper.id_break(ColorHelper.id_class(var2), 0.5F));
   }

   private boolean id_class(an_3 var1, CheckGroup var2) {
      return var1 != null && var1 != (cb_3)id_import.id_class[57] && var1.Pu() ? rrff_3.id_class(var1, var2) : id_throws[34];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -38831160;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-78, 121, -75, -67, -4, 96, -83, -20}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_else();
      super.id_throws(var1);
      ((Set)this.id_break[10]).clear();
   }

   private static void id_continue() {
      id_finally = new int[]{-6606593, -6606593, -6606593, -6606593};
   }

   private void id_else() {
      if (this.id_break == null) {
         this.id_break = new Object[13];
         this.id_break[12] = 0.0F;
      }
   }

   private static void id_instanceof() {
      id_catch = new short[]{
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

   private static void id_new() {
      id_protected = new String[]{
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

   private static void id_return() {
      id_throws = new boolean[]{
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

   private static void id_super() {
      Object[] var0 = new Object[]{new rqO_2("celestial/images/pointer.png")};
      id_byte = var0;
   }

   private static void id_try() {
      id_implements = new double[]{(float) (180.0 / Math.PI), 0.0};
   }

   private static void id_while() {
      id_private = new float[]{
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

   private static void id_public() {
      id_extends = new byte[]{2, 2, 5, 3, 2, 2, 2, 3, 4, 3, 2, 80, 13, 12};
   }
}

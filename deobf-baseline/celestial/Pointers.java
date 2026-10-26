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
      return var1.equals(id_protected[25])
         ? ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_catch[65]]).id_break()
         : ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_catch[66]]).id_implements();
   }

   public Pointers() {
      super(id_protected[0], id_protected[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_catch[0]]);
      this.id_else();
      CheckGroup var5 = new CheckGroup()
         .id_catch(id_throws[0])
         .id_case(id_throws[1])
         .id_throws(id_throws[2])
         .id_private(id_throws[3])
         .id_break(id_throws[4])
         .id_implements(id_throws[5])
         .id_byte(id_throws[6])
         .id_protected(id_throws[7])
         .id_class(id_throws[8]);
      this.id_break[id_catch[1]] = var5;
      String var10003 = id_protected[2];
      String var10004 = id_protected[3];
      String[] var10005 = new String[id_extends[0]];
      var10005[id_throws[9]] = id_protected[4];
      var10005[id_throws[10]] = id_protected[5];
      rrIQ var6 = new rrIQ(var10003, var10004, var10005);
      this.id_break[id_catch[2]] = var6;
      rrIz_1 var7 = new rrIz_1(id_protected[6], Color.GREEN.getRGB()).id_break().id_class(() -> {
         this.id_else();
         return ((CheckGroup)this.id_break[id_catch[67]]).id_implements();
      });
      this.id_break[id_catch[3]] = var7;
      var10003 = id_protected[7];
      var10004 = id_protected[8];
      var10005 = new String[id_extends[1]];
      var10005[id_throws[11]] = id_protected[9];
      var10005[id_throws[12]] = id_protected[10];
      rrIQ var8 = new rrIQ(var10003, var10004, var10005);
      this.id_break[id_catch[4]] = var8;
      rrIk_1 var9 = new rrIk_1(id_protected[11], id_throws[13]);
      this.id_break[id_catch[5]] = var9;
      rrIk_1 var10 = new rrIk_1(id_protected[12], id_throws[14]);
      this.id_break[id_catch[6]] = var10;
      rrIk_1 var11 = new rrIk_1(id_protected[13], id_throws[15]);
      this.id_break[id_catch[7]] = var11;
      rrIm_1 var12 = new rrIm_1(id_protected[14], id_private[0], id_private[1], id_private[2], id_private[3]);
      this.id_break[id_catch[8]] = var12;
      rrIm_1 var13 = new rrIm_1(id_protected[15], id_private[4], id_private[5], id_private[6], id_private[7]);
      this.id_break[id_catch[9]] = var13;
      rrIk_1 var14 = new rrIk_1(id_protected[16], id_throws[16]);
      this.id_break[id_catch[10]] = var14;
      ObjectOpenHashSet var15 = new ObjectOpenHashSet();
      this.id_break[id_catch[11]] = var15;
      AnimValue var16 = new AnimValue(id_private[8], id_throws[17]);
      this.id_break[id_catch[12]] = var16;
      Setting[] var10001 = new Setting[id_extends[2]];
      byte var18 = id_throws[18];
      String var10006 = id_protected[17];
      Setting[] var10007 = new Setting[id_throws[19]];
      var10007[id_throws[20]] = new rrIc_1(id_protected[18], ((CheckGroup)this.id_break[id_catch[13]]).id_byte());
      var10001[var18] = new GroupSetting(var10006, var10007);
      byte var19 = id_throws[21];
      var10006 = id_protected[19];
      var10007 = new Setting[id_throws[22]];
      byte var10009 = id_throws[23];
      String var10012 = id_protected[20];
      rrIk_1[] var10013 = new rrIk_1[id_extends[3]];
      var10013[id_throws[24]] = (rrIk_1)this.id_break[id_catch[14]];
      var10013[id_throws[25]] = (rrIk_1)this.id_break[id_catch[15]];
      var10013[id_extends[4]] = (rrIk_1)this.id_break[id_catch[16]];
      var10007[var10009] = new rrIc_1(var10012, var10013);
      var10001[var19] = new GroupSetting(var10006, var10007);
      byte var20 = id_extends[5];
      var10006 = id_protected[21];
      var10007 = new Setting[id_extends[6]];
      var10007[id_throws[26]] = (rrIQ)this.id_break[id_catch[17]];
      var10007[id_throws[27]] = (rrIz_1)this.id_break[id_catch[18]];
      var10001[var20] = new GroupSetting(var10006, var10007);
      byte var21 = id_extends[7];
      var10006 = id_protected[22];
      var10007 = new Setting[id_throws[28]];
      var10007[id_throws[29]] = (rrIQ)this.id_break[id_catch[19]];
      var10001[var21] = new GroupSetting(var10006, var10007);
      byte var22 = id_extends[8];
      var10006 = id_protected[23];
      var10007 = new Setting[id_extends[9]];
      var10007[id_throws[30]] = (rrIm_1)this.id_break[id_catch[20]];
      var10007[id_throws[31]] = (rrIm_1)this.id_break[id_catch[21]];
      var10007[id_extends[10]] = (rrIk_1)this.id_break[id_catch[22]];
      var10001[var22] = new GroupSetting(var10006, var10007);
      this.id_class(var10001);
   }

   static {
      ntfClinit();
   }

   private float id_this() {
      this.id_else();
      vm_3 var2 = (vm_3)id_import.id_class[id_catch[59]];
      if (var2 instanceof Fu_1 var1) {
         int var5 = var1.id_synchronized;
         int var3 = var1.id_return;
         int var4 = (int)id_import.id_else().id_return();
         return (float)Math.max(var5, var3) + (float)(var4 - id_throws[33]) * id_private[30];
      } else {
         return ((rrIm_1)this.id_break[id_catch[60]]).id_byte();
      }
   }

   private rVr_1 id_class(an_3 var1) {
      this.id_else();
      if (var1 instanceof cG_2 var2 && ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_catch[62]]).id_class(var2)) {
         int var3 = ((rrIz_1)this.id_break[id_catch[63]]).id_byte();
         return new rVr_1(var3, var3, var3, var3);
      }

      if (((rrIQ)this.id_break[id_catch[64]]).id_byte().equals(id_protected[24])) {
         int var4 = ColorHelper.id_break(ColorHelper.id_class(var1), id_private[31]);
         return var1 instanceof rSi_1 ? new rVr_1(id_finally[0], id_finally[1], id_finally[2], id_finally[3]) : new rVr_1(var4, var4, var4, var4);
      } else {
         return new rVr_1(
            ColorHelper.id_class(id_private[32]),
            ColorHelper.id_class(id_private[33]),
            ColorHelper.id_class(id_private[34]),
            ColorHelper.id_class(id_private[35])
         );
      }
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_else();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_catch[44]]) {
         ((Set)this.id_break[id_catch[45]]).clear();
         ObjectSet var2 = ((gm_3)id_import.id_class[id_catch[46]]).id_return().int2ObjectEntrySet();
         ObjectIterator var3 = var2.iterator();

         while (var3.hasNext()) {
            Entry var4 = (Entry)var3.next();
            an_3 var5 = (an_3)var4.getValue();
            if (this.id_class(var5, (CheckGroup)this.id_break[id_catch[47]])) {
               ((Set)this.id_break[id_catch[48]]).add(var5);
            }
         }

         Float var10 = this.id_this();
         this.id_break[id_catch[49]] = var10;
      }
   }

   private void id_class(Ml_1 var1, rrZO var2, an_3 var3, float var4, float var5, float var6) {
      this.id_else();
      float var7 = var4 / id_private[27];
      if (((rrIk_1)this.id_break[id_catch[55]]).id_class()) {
         String var8 = (int)Math.abs(((cb_3)id_import.id_class[id_catch[56]]).id_implements(var3)) + "m";
         var2.id_class(var1, id_strictfp, var8, var5, var6 + var7 + id_private[28], rrZF.d_);
      }

      if (((rrIk_1)this.id_break[id_catch[57]]).id_class()) {
         var2.id_class(
            var1,
            id_strictfp,
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_catch[58]]).id_private().id_throws().id_break(var3.id_extends()),
            var5,
            var6 - var7 - id_private[29],
            rrZF.d_
         );
      }
   }

   @EventTarget
   public void id_class(rrnB_2 var1) {
      this.id_else();
      if (!((Set)this.id_break[id_catch[23]]).isEmpty()) {
         Ml_1 var2 = var1.id_class();
         float var3 = var1.id_break();
         ((AnimValue)this.id_break[id_catch[24]]).id_break((Float)this.id_break[id_catch[25]]);
         float var4 = ((AnimValue)this.id_break[id_catch[26]]).id_byte();
         float var5 = ((rrIm_1)this.id_break[id_catch[27]]).id_byte();
         float var6 = (float)id_const.id_extends() / id_private[9];
         float var7 = (float)id_const.id_native() / id_private[10];
         rrZO var8 = this.id_byte(((rrIQ)this.id_break[id_catch[28]]).id_byte());
         rrfD_2.id_byte((lD_2)rrfD_2.id_class[id_catch[29]]);
         rrfD_2.id_throws((lD_2)rrfD_2.id_class[id_catch[30]]);
         var8.id_break(id_strictfp);
         id_import.A().id_class((rqO_2)id_byte[id_catch[31]]);
         float var9 = (Float)((cb_3)id_import.id_class[id_catch[32]]).id_throws[id_catch[33]] * id_private[11];
         float var10 = rfU_2.id_break(var9);
         float var11 = rfU_2.id_class(var9);
         float var12 = -var5 / id_private[12];

         for (an_3 var14 : (Set)this.id_break[id_catch[34]]) {
            float var15 = (float)(rrjZ_2.id_protected(var14, var3) - rrjZ_2.id_protected((cb_3)id_import.id_class[id_catch[35]], var3));
            float var16 = (float)(rrjZ_2.id_byte(var14, var3) - rrjZ_2.id_byte((cb_3)id_import.id_class[id_catch[36]], var3));
            float var17 = -(var16 * var10 - var15 * var11);
            float var18 = -(var15 * var10 + var16 * var11);
            float var19 = (float)(Math.atan2((double)var17, (double)var18) * id_implements[0]);
            float var20 = (float)Math.toRadians((double)var19);
            float var21 = var4 / id_private[13];
            float var22 = var21 * rfU_2.id_break(var20) + var6;
            float var23 = var21 * rfU_2.id_class(var20) + var7;
            var2.id_class();
            var2.id_class((double)var22, (double)var23, id_implements[1]);
            this.id_class(var2, var8, var14, var5, id_private[14], id_private[15]);
            if (var14 instanceof iB_2 var24 && ((rrIk_1)this.id_break[id_catch[37]]).id_class()) {
               this.id_class(var2, var24, var5, id_private[16], var12);
            }

            var2.id_class(rje_3.id_case.id_byte(var19 + id_private[17]));
            this.id_class(var2, var14, var5);
            var2.id_break();
         }

         boolean var25 = ((rrIk_1)this.id_break[id_catch[38]]).id_class();
         if (var25) {
            GL11.glBlendFunc(id_catch[39], id_throws[32]);
         }

         rrfD_2.id_catch((lD_2)rrfD_2.id_class[id_catch[40]]);
         if (var25) {
            GL11.glBlendFunc(id_catch[41], id_catch[42]);
         }

         rrfD_2.id_private((lD_2)rrfD_2.id_class[id_catch[43]]);
         var8.id_byte(id_strictfp);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4752496285503973076L;
   }

   private void id_class(Ml_1 var1, an_3 var2, float var3) {
      rVr_1 var4 = this.id_class(var2);
      rrfD_2.id_break(var1, (lD_2)rrfD_2.id_class[id_catch[51]], var3, var4.id_class(), var4.id_break(), var4.id_byte(), var4.id_byte());
   }

   private void id_class(Ml_1 var1, iB_2 var2, float var3, float var4, float var5) {
      float var6 = rrjZ_2.id_class(var2);
      float var7 = var3 / id_private[18];
      float var8 = var4 - var7 - id_private[19];
      float var9 = id_private[20];
      float var10 = var3 + id_private[21];
      float var11 = var10 * var6;
      rrfD_2.id_class(
         var1,
         (lD_2)rrfD_2.id_class[id_catch[52]],
         var8 - id_private[22],
         var5 - id_private[23],
         var9 + id_private[24],
         var10 + id_private[25],
         ColorHelper.id_break(rrZF.e_, Math.min(id_catch[53], id_extends[11]))
      );
      rrfD_2.id_class(
         var1, (lD_2)rrfD_2.id_class[id_catch[54]], var8, var5 + var10 - var11, var9, var11, ColorHelper.id_break(ColorHelper.id_class(var2), id_private[26])
      );
   }

   private boolean id_class(an_3 var1, CheckGroup var2) {
      return var1 != null && var1 != (cb_3)id_import.id_class[id_catch[61]] && var1.Pu() ? rrff_3.id_class(var1, var2) : id_throws[34];
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
      ((Set)this.id_break[id_catch[50]]).clear();
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
      Object[] var0 = new Object[]{new rqO_2(id_protected[26])};
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

package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.IntSupplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;

public class BlockEsp extends Module implements rrqe_3 {
   public Object[] id_break;
   private static int[] id_protected;
   private static float[] id_throws;
   public static Object[] id_byte;
   private static byte[] id_catch;
   private static boolean[] id_private;
   private static short[] id_implements;
   private static String[] id_finally;

   public BlockEsp() {
      super(id_finally[0], id_finally[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_implements[0]]);
      this.id_super();
      CopyOnWriteArraySet var5 = new CopyOnWriteArraySet();
      this.id_break[id_implements[1]] = var5;
      HashSet var6 = new HashSet();
      this.id_break[id_implements[2]] = var6;
      ((rrqY_2)rrqY_2.staticFields0d81573182c03565b5bb298419afe0b7[id_implements[3]]).id_class(this);
      Setting[] var10001 = new Setting[id_catch[0]];
      var10001[id_private[0]] = (rrIk_1)id_byte[id_implements[4]];
      var10001[id_private[1]] = (rrIz_1)id_byte[id_implements[5]];
      var10001[id_catch[1]] = (rrIk_1)id_byte[id_implements[6]];
      var10001[id_catch[2]] = (rrIz_1)id_byte[id_implements[7]];
      var10001[id_catch[3]] = (rrIk_1)id_byte[id_implements[8]];
      var10001[id_catch[4]] = (rrIz_1)id_byte[id_implements[9]];
      var10001[id_catch[5]] = (rrIk_1)id_byte[id_implements[10]];
      var10001[id_catch[6]] = (rrIz_1)id_byte[id_implements[11]];
      var10001[id_catch[7]] = (rrIk_1)id_byte[id_implements[12]];
      var10001[id_catch[8]] = (rrIz_1)id_byte[id_implements[13]];
      var10001[id_catch[9]] = (rrIk_1)id_byte[id_implements[14]];
      var10001[id_catch[10]] = (rrIz_1)id_byte[id_implements[15]];
      var10001[id_catch[11]] = (rrIk_1)id_byte[id_implements[16]];
      var10001[id_catch[12]] = (rrIz_1)id_byte[id_implements[17]];
      this.id_class(var10001);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_protected = new int[]{-65281, -65281, -65281, -65281, -65281, -65281, -65281};
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_super();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_implements[28]]) {
         if (((Set)this.id_break[id_implements[29]]).isEmpty()) {
            return;
         }

         ((Set)this.id_break[id_implements[30]])
            .removeIf(
               var0 -> ((gm_3)id_import.id_class[id_implements[62]]).id_byte(var0.id_protected()).id_break() != var0.id_break().id_break()
                     ? id_private[13]
                     : id_private[14]
            );
      }
   }

   @EventTarget
   public void id_class(RenderEvent var1) {
      this.id_super();
      Ml_1 var2 = var1.id_class();
      float var3 = var1.id_byte();
      var2.id_class();
      GL11.glEnable(id_implements[18]);
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableBlend();
      RenderSystem.lineWidth(id_throws[0]);
      RenderSystem.disableTexture();
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(id_private[2]);
      id_strictfp.id_class(id_private[3], ju_3.id_this);
      double var4 = id_void.id_case();
      double var6 = id_void.id_catch();
      double var8 = id_void.id_private();
      ObjectSet var10 = ((gm_3)id_import.id_class[id_implements[19]]).id_return().int2ObjectEntrySet();
      ObjectIterator var11 = var10.iterator();

      while (var11.hasNext()) {
         Entry var12 = (Entry)var11.next();
         an_3 var13 = (an_3)var12.getValue();
         rfH_2 var14 = var13.Bs();
         if (this.id_class(var13) && this.id_class(var13.rN())) {
            IntSupplier var15 = ((rrqK_2)this.id_break[id_implements[20]]).id_class();
            rrfD_2.id_class(var2, (float)((double)var14.b_() - var4), (float)((double)var14.c_() - var6), (float)((double)var14.d_() - var8), var15.getAsInt());
         }
      }

      for (ryO_2 var26 : ((gm_3)id_import.id_class[id_implements[21]]).id_case) {
         rfH_2 var28 = var26.id_char();
         double var30 = (double)var28.b_();
         double var16 = (double)var28.c_();
         double var18 = (double)var28.d_();
         if (this.id_class(var26)) {
            xc_3 var20 = var26.id_abstract();
            rjC_2 var21 = rrjc_3.id_class(var26, var28, var20, var3);
            if (var21 != null) {
               rfl_3 var22 = var21.id_class().id_protected(var30, var16, var18);
               if (this.id_class(var22)) {
                  IntSupplier var23 = ((rrqK_2)this.id_break[id_implements[22]]).id_class();
                  rrfD_2.id_class(var2, var22.id_protected(-var4, -var6, -var8), var23.getAsInt());
               }
            }
         }
      }

      for (rrqD_2 var27 : (Set)this.id_break[id_implements[23]]) {
         rjU_2 var29 = var27.id_byte();
         double var31 = var29.id_class();
         double var32 = var29.id_break();
         double var33 = var29.id_byte();
         rfl_3 var34 = null;
         xd_3 var35 = var27.id_break().id_break();
         if (var35 == xu_3.bD) {
            if (((gm_3)id_import.id_class[id_implements[24]]).id_class(var27.id_protected()) instanceof ryr_3 var37) {
               var34 = var37.id_class(var37.id_abstract(), var3).id_protected(var31, var32, var33);
            }
         } else {
            var34 = rrjc_3.id_class(var35.id_continue(), var27.id_protected()).id_protected(var31, var32, var33);
         }

         if (var34 != null && this.id_class(var34)) {
            rrfD_2.id_class(var2, var34.id_protected(-var4, -var6, -var8), var27.id_break().id_class());
         }
      }

      id_default.id_break();
      RenderSystem.enableTexture();
      RenderSystem.enableDepthTest();
      RenderSystem.depthMask(id_private[4]);
      RenderSystem.disableBlend();
      GL11.glDisable(id_implements[25]);
      var2.id_break();
   }

   @Override
   public void id_class(rrqU_2 var1, boolean var2) {
      this.id_super();
      if (var2) {
         ((Set)this.id_break[id_implements[38]]).clear();
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2070268186;
   }

   private boolean id_class(ao_3 var1) {
      this.id_super();
      if (((rrIk_1)id_byte[id_implements[40]]).id_class() && var1 instanceof rHU) {
         rrqK_2 var8 = (rrqK_2)rrqK_2.staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[id_implements[41]];
         this.id_break[id_implements[42]] = var8;
         return id_private[5];
      } else if (((rrIk_1)id_byte[id_implements[43]]).id_class() && var1 instanceof ryr_3) {
         rrqK_2 var9 = (rrqK_2)rrqK_2.staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[id_implements[44]];
         this.id_break[id_implements[45]] = var9;
         return id_private[6];
      } else if (((rrIk_1)id_byte[id_implements[46]]).id_class() && var1 instanceof rHw_1) {
         rrqK_2 var10 = (rrqK_2)rrqK_2.staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[id_implements[47]];
         this.id_break[id_implements[48]] = var10;
         return id_private[7];
      } else if (((rrIk_1)id_byte[id_implements[49]]).id_class() && var1 instanceof rHM) {
         rrqK_2 var11 = (rrqK_2)rrqK_2.staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[id_implements[50]];
         this.id_break[id_implements[51]] = var11;
         return id_private[8];
      } else if (((rrIk_1)id_byte[id_implements[52]]).id_class() && var1 instanceof rsJ_2) {
         rrqK_2 var12 = (rrqK_2)rrqK_2.staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[id_implements[53]];
         this.id_break[id_implements[54]] = var12;
         return id_private[9];
      } else if (((rrIk_1)id_byte[id_implements[55]]).id_class() && var1 instanceof jz_3) {
         rrqK_2 var13 = (rrqK_2)rrqK_2.staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[id_implements[56]];
         this.id_break[id_implements[57]] = var13;
         return id_private[10];
      } else {
         if (((rrIk_1)id_byte[id_implements[58]]).id_class() && var1 instanceof rys_3 var2) {
            rfH_2 var3 = var2.id_char();
            if (!((Set)this.id_break[id_implements[59]]).contains(var3) && rrjQ_2.id_class(var3)) {
               rrqK_2 var14 = (rrqK_2)rrqK_2.staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[id_implements[60]];
               this.id_break[id_implements[61]] = var14;
               return id_private[11];
            }
         }

         return id_private[12];
      }
   }

   @Override
   public void id_class(boolean var1) {
      super.id_class(var1);
      ((yX_2)id_import.id_class[id_implements[33]]).id_throws();
      if (var1) {
         rrfu_3.id_byte(
            rrfu_3.id_class((Module)this)
               + "Вы можете добавить свой блок через команду '"
               + (String)C_class.id_instanceof().id_protected.id_class[id_implements[34]]
               + "blockesp'"
         );
      }
   }

   private boolean id_class(rfl_3 var1) {
      return ((yX_2)id_import.id_class[id_implements[39]]).id_static().id_class(var1);
   }

   @EventTarget
   public void id_class(rrLp_1 var1) {
      this.id_super();
      if (var1.id_case() == (rrLq_1)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[id_implements[31]]) {
         rfH_2 var2 = var1.id_class();
         if (rrjQ_2.id_class(var2)) {
            ((Set)this.id_break[id_implements[32]]).add(var2);
         }
      }
   }

   @EventTarget
   public void id_class(rrnW_2 var1) {
      this.id_super();

      for (rrqU_2 var3 : ((rrqY_2)rrqY_2.staticFields0d81573182c03565b5bb298419afe0b7[id_implements[26]]).id_byte()) {
         if (var1.id_class() == var3.id_break()) {
            ((Set)this.id_break[id_implements[27]]).add(new rrqD_2(var3, var1.id_break(), var1.id_byte()));
            break;
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8390297487855968903L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{88, 27, 111, -5, 90, 9, -116, 85}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_super();
      super.id_throws(var1);
      ((Set)this.id_break[id_implements[35]]).clear();
      ((Set)this.id_break[id_implements[36]]).clear();
   }

   private static void id_goto() {
      id_throws = new float[]{1.5F};
   }

   private static void id_continue() {
      id_finally = new String[]{
         new String("Block ESP"),
         new String("WallHack на блоки"),
         new String("Спавнера"),
         new String("Шалкеры"),
         new String("Сундуки"),
         new String("Бочки"),
         new String("Вагонетки"),
         new String("Диспенсеры"),
         new String("Подарки"),
         new String("Цвет спавнеров"),
         new String("Цвет шалкеров"),
         new String("Цвет сундуков"),
         new String("Цвет бочек"),
         new String("Цвет вагонеток"),
         new String("Цвет диспенсеров"),
         new String("Цвет подарков")
      };
   }

   private static void id_else() {
      id_implements = new short[]{
         2,
         1,
         2,
         0,
         0,
         7,
         1,
         8,
         2,
         9,
         3,
         10,
         4,
         11,
         5,
         12,
         6,
         13,
         2848,
         56,
         0,
         56,
         0,
         1,
         56,
         2848,
         0,
         1,
         0,
         1,
         1,
         2,
         2,
         8,
         0,
         1,
         2,
         1,
         1,
         8,
         0,
         0,
         0,
         1,
         1,
         0,
         2,
         2,
         0,
         3,
         6,
         0,
         4,
         3,
         0,
         5,
         4,
         0,
         6,
         2,
         5,
         0,
         56
      };
   }

   @Override
   public void id_new() {
      this.id_super();
      ((Set)this.id_break[id_implements[37]]).clear();
   }

   private static void id_return() {
      id_catch = new byte[]{14, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 2, 9, 3, 10, 4, 11, 5, 12, 6, 13, 3, 14};
   }

   private void id_super() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
      }
   }

   private static void id_while() {
      id_private = new boolean[]{
         false,
         true,
         false,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         true
      };
   }

   private static void id_public() {
      Object[] var0 = new Object[14];
      var0[0] = new rrIk_1(id_finally[2], true);
      var0[1] = new rrIk_1(id_finally[3], false);
      var0[2] = new rrIk_1(id_finally[4], false);
      var0[3] = new rrIk_1(id_finally[5], false);
      var0[4] = new rrIk_1(id_finally[6], false);
      var0[5] = new rrIk_1(id_finally[7], false);
      var0[6] = new rrIk_1(id_finally[8], false);
      var0[7] = new rrIz_1(id_finally[9], -65281);
      var0[8] = (new rrIz_1(id_finally[10], -65281)).id_class(((rrIk_1)var0[1])::id_class);
      var0[9] = (new rrIz_1(id_finally[11], -65281)).id_class(((rrIk_1)var0[2])::id_class);
      var0[10] = (new rrIz_1(id_finally[12], -65281)).id_class(((rrIk_1)var0[3])::id_class);
      var0[11] = (new rrIz_1(id_finally[13], -65281)).id_class(((rrIk_1)var0[4])::id_class);
      var0[12] = (new rrIz_1(id_finally[14], -65281)).id_class(((rrIk_1)var0[5])::id_class);
      var0[13] = (new rrIz_1(id_finally[15], -65281)).id_class(((rrIk_1)var0[6])::id_class);
      id_byte = var0;
   }
}

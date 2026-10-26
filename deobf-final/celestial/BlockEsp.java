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
   public Object[] break_;
   private static int[] protected_;
   private static float[] throws_;
   public static Object[] byte_;
   private static byte[] catch_;
   private static boolean[] private_;
   private static short[] implements_;
   private static String[] finally_;

   public BlockEsp() {
      super("Block ESP", "WallHack на блоки", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[2]);
      this.super_();
      CopyOnWriteArraySet var5 = new CopyOnWriteArraySet();
      this.break_[1] = var5;
      HashSet var6 = new HashSet();
      this.break_[2] = var6;
      ((rrqY_2)rrqY_2.staticFields0d81573182c03565b5bb298419afe0b7[0]).class_(this);
      this.class_(
         new Setting[]{
            (rrIk_1)byte_[0],
            (rrIz_1)byte_[7],
            (rrIk_1)byte_[1],
            (rrIz_1)byte_[8],
            (rrIk_1)byte_[2],
            (rrIz_1)byte_[9],
            (rrIk_1)byte_[3],
            (rrIz_1)byte_[10],
            (rrIk_1)byte_[4],
            (rrIz_1)byte_[11],
            (rrIk_1)byte_[5],
            (rrIz_1)byte_[12],
            (rrIk_1)byte_[6],
            (rrIz_1)byte_[13]
         }
      );
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      protected_ = new int[]{-65281, -65281, -65281, -65281, -65281, -65281, -65281};
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.super_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (((Set)this.break_[1]).isEmpty()) {
            return;
         }

         ((Set)this.break_[1]).removeIf(var0 -> ((gm_3)import_.class_[56]).byte_(var0.protected_()).break_() != var0.break_().break_() ? true : private_[14]);
      }
   }

   @EventTarget
   public void class_(RenderEvent var1) {
      this.super_();
      Ml_1 var2 = var1.class_();
      float var3 = var1.byte_();
      var2.class_();
      GL11.glEnable(2848);
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableBlend();
      RenderSystem.lineWidth(1.5F);
      RenderSystem.disableTexture();
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      strictfp_.class_(1, ju_3.this_);
      double var4 = void_.case_();
      double var6 = void_.catch_();
      double var8 = void_.private_();
      ObjectSet var10 = ((gm_3)import_.class_[56]).return_().int2ObjectEntrySet();
      ObjectIterator var11 = var10.iterator();

      while (var11.hasNext()) {
         Entry var12 = (Entry)var11.next();
         an_3 var13 = (an_3)var12.getValue();
         rfH_2 var14 = var13.Bs();
         if (this.class_(var13) && this.class_(var13.rN())) {
            IntSupplier var15 = ((rrqK_2)this.break_[0]).class_();
            rrfD_2.class_(var2, (float)((double)var14.b_() - var4), (float)((double)var14.c_() - var6), (float)((double)var14.d_() - var8), var15.getAsInt());
         }
      }

      for (ryO_2 var26 : ((gm_3)import_.class_[56]).case_) {
         rfH_2 var28 = var26.char_();
         double var30 = (double)var28.b_();
         double var16 = (double)var28.c_();
         double var18 = (double)var28.d_();
         if (this.class_(var26)) {
            xc_3 var20 = var26.abstract_();
            rjC_2 var21 = rrjc_3.class_(var26, var28, var20, var3);
            if (var21 != null) {
               rfl_3 var22 = var21.class_().protected_(var30, var16, var18);
               if (this.class_(var22)) {
                  IntSupplier var23 = ((rrqK_2)this.break_[0]).class_();
                  rrfD_2.class_(var2, var22.protected_(-var4, -var6, -var8), var23.getAsInt());
               }
            }
         }
      }

      for (rrqD_2 var27 : (Set)this.break_[1]) {
         rjU_2 var29 = var27.byte_();
         double var31 = var29.class_();
         double var32 = var29.break_();
         double var33 = var29.byte_();
         rfl_3 var34 = null;
         xd_3 var35 = var27.break_().break_();
         if (var35 == xu_3.bD) {
            if (((gm_3)import_.class_[56]).class_(var27.protected_()) instanceof ryr_3 var37) {
               var34 = var37.class_(var37.abstract_(), var3).protected_(var31, var32, var33);
            }
         } else {
            var34 = rrjc_3.class_(var35.continue_(), var27.protected_()).protected_(var31, var32, var33);
         }

         if (var34 != null && this.class_(var34)) {
            rrfD_2.class_(var2, var34.protected_(-var4, -var6, -var8), var27.break_().class_());
         }
      }

      default_.break_();
      RenderSystem.enableTexture();
      RenderSystem.enableDepthTest();
      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      GL11.glDisable(2848);
      var2.break_();
   }

   @Override
   public void class_(rrqU_2 var1, boolean var2) {
      this.super_();
      if (var2) {
         ((Set)this.break_[1]).clear();
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2070268186;
   }

   private boolean class_(ao_3 var1) {
      this.super_();
      if (((rrIk_1)byte_[0]).class_() && var1 instanceof rHU) {
         rrqK_2 var8 = (rrqK_2)rrqK_2.staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[0];
         this.break_[0] = var8;
         return true;
      } else if (((rrIk_1)byte_[1]).class_() && var1 instanceof ryr_3) {
         rrqK_2 var9 = (rrqK_2)rrqK_2.staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[1];
         this.break_[0] = var9;
         return true;
      } else if (((rrIk_1)byte_[2]).class_() && var1 instanceof rHw_1) {
         rrqK_2 var10 = (rrqK_2)rrqK_2.staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[2];
         this.break_[0] = var10;
         return true;
      } else if (((rrIk_1)byte_[3]).class_() && var1 instanceof rHM) {
         rrqK_2 var11 = (rrqK_2)rrqK_2.staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[6];
         this.break_[0] = var11;
         return true;
      } else if (((rrIk_1)byte_[4]).class_() && var1 instanceof rsJ_2) {
         rrqK_2 var12 = (rrqK_2)rrqK_2.staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[3];
         this.break_[0] = var12;
         return true;
      } else if (((rrIk_1)byte_[5]).class_() && var1 instanceof jz_3) {
         rrqK_2 var13 = (rrqK_2)rrqK_2.staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[4];
         this.break_[0] = var13;
         return true;
      } else {
         if (((rrIk_1)byte_[6]).class_() && var1 instanceof rys_3 var2) {
            rfH_2 var3 = var2.char_();
            if (!((Set)this.break_[2]).contains(var3) && rrjQ_2.class_(var3)) {
               rrqK_2 var14 = (rrqK_2)rrqK_2.staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[5];
               this.break_[0] = var14;
               return true;
            }
         }

         return private_[12];
      }
   }

   @Override
   public void class_(boolean var1) {
      super.class_(var1);
      ((yX_2)import_.class_[8]).throws_();
      if (var1) {
         rrfu_3.byte_(
            rrfu_3.class_((Module)this) + "Вы можете добавить свой блок через команду '" + (String)C_class.instanceof_().protected_.class_[0] + "blockesp'"
         );
      }
   }

   private boolean class_(rfl_3 var1) {
      return ((yX_2)import_.class_[8]).static_().class_(var1);
   }

   @EventTarget
   public void class_(rrLp_1 var1) {
      this.super_();
      if (var1.case_() == (rrLq_1)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[2]) {
         rfH_2 var2 = var1.class_();
         if (rrjQ_2.class_(var2)) {
            ((Set)this.break_[2]).add(var2);
         }
      }
   }

   @EventTarget
   public void class_(rrnW_2 var1) {
      this.super_();

      for (rrqU_2 var3 : ((rrqY_2)rrqY_2.staticFields0d81573182c03565b5bb298419afe0b7[0]).byte_()) {
         if (var1.class_() == var3.break_()) {
            ((Set)this.break_[1]).add(new rrqD_2(var3, var1.break_(), var1.byte_()));
            break;
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8390297487855968903L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{88, 27, 111, -5, 90, 9, -116, 85}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      this.super_();
      super.throws_(var1);
      ((Set)this.break_[1]).clear();
      ((Set)this.break_[2]).clear();
   }

   private static void goto_() {
      throws_ = new float[]{1.5F};
   }

   private static void continue_() {
      finally_ = new String[]{
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

   private static void else_() {
      implements_ = new short[]{
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
   public void new_() {
      this.super_();
      ((Set)this.break_[1]).clear();
   }

   private static void return_() {
      catch_ = new byte[]{14, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 2, 9, 3, 10, 4, 11, 5, 12, 6, 13, 3, 14};
   }

   private void super_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
      }
   }

   private static void while_() {
      private_ = new boolean[]{
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

   private static void public_() {
      Object[] var0 = new Object[14];
      var0[0] = new rrIk_1("Спавнера", true);
      var0[1] = new rrIk_1("Шалкеры", false);
      var0[2] = new rrIk_1("Сундуки", false);
      var0[3] = new rrIk_1("Бочки", false);
      var0[4] = new rrIk_1("Вагонетки", false);
      var0[5] = new rrIk_1("Диспенсеры", false);
      var0[6] = new rrIk_1("Подарки", false);
      var0[7] = new rrIz_1("Цвет спавнеров", -65281);
      var0[8] = (new rrIz_1("Цвет шалкеров", -65281)).class_(((rrIk_1)var0[1])::class_);
      var0[9] = (new rrIz_1("Цвет сундуков", -65281)).class_(((rrIk_1)var0[2])::class_);
      var0[10] = (new rrIz_1("Цвет бочек", -65281)).class_(((rrIk_1)var0[3])::class_);
      var0[11] = (new rrIz_1("Цвет вагонеток", -65281)).class_(((rrIk_1)var0[4])::class_);
      var0[12] = (new rrIz_1("Цвет диспенсеров", -65281)).class_(((rrIk_1)var0[5])::class_);
      var0[13] = (new rrIz_1("Цвет подарков", -65281)).class_(((rrIk_1)var0[6])::class_);
      byte_ = var0;
   }
}

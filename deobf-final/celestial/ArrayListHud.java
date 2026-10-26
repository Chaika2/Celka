package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ArrayListHud extends Module {
   private static float[] protected_;
   private static String[] throws_;
   private static boolean[] catch_;
   public static Object[] break_;
   private static byte[] private_;
   private static short[] implements_;
   public Object[] byte_;

   public ArrayListHud() {
      super("Array List", "Отображает список включенных\nмодулей", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[2]);
      this.continue_();
      ArrayList var5 = new ArrayList();
      this.byte_[0] = var5;
      rrIk_1 var6 = new rrIk_1("Combat", true);
      this.byte_[1] = var6;
      rrIk_1 var7 = new rrIk_1("Movement", true);
      this.byte_[2] = var7;
      rrIk_1 var8 = new rrIk_1("Render", false);
      this.byte_[3] = var8;
      rrIk_1 var9 = new rrIk_1("Player", true);
      this.byte_[4] = var9;
      rrIk_1 var10 = new rrIk_1("Util", true);
      this.byte_[5] = var10;
      rrIk_1 var11 = new rrIk_1("Свечение", true);
      this.byte_[6] = var11;
      rrIk_1 var12 = new rrIk_1("Маленькие буквы", false).class_("lowercase", (var1, var2) -> {
         this.continue_();
         Boolean var3 = (Boolean)var2.getLeft();
         ((List)this.byte_[0]).forEach(var1x -> var1x.break_(var3));
         this.else_();
      });
      this.byte_[7] = var12;
      rrIm_1 var13 = new rrIm_1("Смещение", 2.0F, 0.0F, 10.0F, 1.0F);
      this.byte_[8] = var13;
      this.class_(
         new Setting[]{
            new rrIc_1("Категории", (rrIk_1)this.byte_[1], (rrIk_1)this.byte_[2], (rrIk_1)this.byte_[3], (rrIk_1)this.byte_[4], (rrIk_1)this.byte_[5]),
            (rrIk_1)this.byte_[7],
            (rrIk_1)this.byte_[6],
            (rrIm_1)this.byte_[8]
         }
      );
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(new OH<>(rrLP.class, var1 -> this.class_(var1)));
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      throws_ = new String[]{
         new String("Array List"),
         new String("Отображает список включенных\nмодулей"),
         new String("Combat"),
         new String("Movement"),
         new String("Render"),
         new String("Player"),
         new String("Util"),
         new String("Свечение"),
         new String("Маленькие буквы"),
         new String("lowercase"),
         new String("Смещение"),
         new String("Категории")
      };
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1704764733;
   }

   public void class_(rrLP var1) {
      this.continue_();

      for (Module var3 : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().g()) {
         ((List)this.byte_[0]).add(new rrqA_2(this, var3));
      }

      this.else_();
   }

   @EventTarget
   public void class_(rrnB_2 var1) {
      this.continue_();
      if (!((Qw_1)import_.class_[20]).R && !((List)this.byte_[0]).isEmpty()) {
         float var2 = protected_[4];
         float var3 = ((rrIm_1)this.byte_[8]).byte_();
         float var4 = ((rrIm_1)this.byte_[8]).byte_() + 5.0F;
         Ml_1 var5 = var1.class_();
         float var6 = const_.volatile_();
         float var10 = var2 / 2.5F;
         int var12 = ColorHelper.class_(0.0F);
         ArrayList var13 = new ArrayList();

         for (rrqA_2 var15 : (List)this.byte_[0]) {
            var15.class_(this.class_((Module)var15.class_[0]));
            if (((AnimValue)var15.class_[1]).case_()) {
               var13.add(var15);
            }
         }

         var5.class_();
         if (((rrIk_1)this.byte_[6]).class_()) {
            for (rrqA_2 var24 : var13) {
               float var8 = (Float)var24.class_[3];
               float var7 = var6 + 120.0F - var8 - var4;
               var7 -= 120.0F * var24.byte_();
               int var11 = ColorHelper.class_(-var3);
               float var9 = var8 + 4.0F;
               rrfD_2.class_(var5, var7, var3, var9 + 2.0F, var2 + 1.0F, 12, var11);
               var3 += var2 * var24.byte_();
            }

            var3 = ((rrIm_1)this.byte_[8]).byte_();
         }

         rrfD_2.throws_((lD_2)break_[0]);
         ((rrZO)break_[1]).break_(strictfp_);

         for (rrqA_2 var25 : var13) {
            float var19 = (Float)var25.class_[3];
            float var17 = var6 + 120.0F - var19 - var4;
            var17 -= 120.0F * var25.byte_();
            int var21 = ColorHelper.class_(-var3);
            float var20 = var19 + 4.0F;
            rrfD_2.class_(var5, (lD_2)break_[0], var17, var3, var20, var2, ColorHelper.break_(rrZF.n_, (int)(225.0F * var25.byte_())));
            rrfD_2.class_(var5, (lD_2)break_[0], var17 + var20, var3, 0.5F, var2, var12, var21);
            var12 = var21;
            ((rrZO)break_[1]).break_(var5, strictfp_, (String)var25.class_[2], (double)(var17 + 2.0F), (double)(var3 + var10), var21, false, false);
            var3 += var2 * var25.byte_();
         }

         rrfD_2.private_((lD_2)break_[0]);
         ((rrZO)break_[1]).byte_(strictfp_);
         var5.break_();
      }
   }

   private boolean class_(Module var1) {
      this.continue_();
      if (!var1.aJ_()) {
         return false;
      } else {
         switch (((int[])rrqL_2.class_[0])[var1.int_().ordinal()]) {
            case 1:
               return ((rrIk_1)this.byte_[1]).class_();
            case 2:
               return ((rrIk_1)this.byte_[2]).class_();
            case 3:
               return !((rrIk_1)this.byte_[3]).class_() && !(var1 instanceof Hud) && !(var1 instanceof Esp2D) ? catch_[15] : catch_[14];
            case 4:
               return ((rrIk_1)this.byte_[4]).class_();
            case 5:
               return ((rrIk_1)this.byte_[5]).class_();
            default:
               return catch_[16];
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7121994137951204165L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-36, -14, -101, -111, 100, 81, -21, 120}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void goto_() {
      catch_ = new boolean[]{true, true, false, true, true, true, false, false, false, true, true, false, false, false, true, false, false, false, false, true};
   }

   private void continue_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[9];
      }
   }

   private void else_() {
      this.continue_();
      ((List)this.byte_[0]).sort(Comparator.comparingDouble(var0 -> (double)(-var0.protected_())));
   }

   private static void new_() {
      protected_ = new float[]{
         2.0F, 0.0F, 10.0F, 1.0F, 10.0F, 5.0F, 2.5F, 0.0F, 120.0F, 120.0F, 4.0F, 2.0F, 1.0F, 120.0F, 120.0F, 4.0F, 225.0F, 0.5F, 2.0F, 0.4F
      };
   }

   private static void return_() {
      Object[] var0 = new Object[]{new lD_2(256), FontManager.class_("montserrat", 13.0F, false), -1.0842022E-19F, 120};
      break_ = var0;
   }

   private static void super_() {
      private_ = new byte[]{4, 5, 2, 3, 4, 2, 3, 12, 9, 4, 2, 3, 120};
   }

   private static void public_() {
      implements_ = new short[]{
         2, 0, 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 7, 6, 8, 0, 0, 0, 20, 0, 8, 8, 0, 0, 1, 6, 3, 8, 0, 1, 3, 0, 0, 1, 2, 0, 1, 0, 1, 2, 3, 4, 5, 0, 0, 256
      };
   }
}

package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvi_1 extends rrvj_1 implements rrTZ {
   private static long[] id_native;
   private static float[] id_volatile;
   public Object[] id_byte;
   private static int[] id_final;
   private static byte[] id_package;
   private static short[] id_int;
   private static boolean[] id_new;
   private static String[] id_continue;
   public static Object[] id_protected;

   public rrvi_1() {
      super("Item Keybinds", () -> 0.0F, () -> 0.0F);
      this.d();
      ArrayList var7 = new ArrayList();
      this.id_byte[0] = var7;
      AnimValue var8 = new AnimValue(0.5F, false).id_package();
      this.id_byte[3] = var8;
      AnimValue var9 = new AnimValue(0.5F, false).id_package();
      this.id_byte[4] = var9;
      Boolean var10 = false;
      this.id_byte[5] = var10;
      Boolean var11 = false;
      this.id_byte[6] = var11;
      ((rrTm_1)rrTm_1.staticFields9ecc5a8aa54b3c499a2c916d8fcc4ea4[0]).id_break(this);

      for (rrHv_1 var2 : ((rrTm_1)rrTm_1.staticFields9ecc5a8aa54b3c499a2c916d8fcc4ea4[0]).id_break()) {
         ((List)this.id_byte[0]).add(new rrFP(var2));
      }

      ((List)this.id_byte[0]).add(new rrFB(this, rdy_3.OW, "Q"));
      ((List)this.id_byte[0]).add(new rrFB(this, rdy_3.Jd, "W"));
      ((List)this.id_byte[0]).add(new rrFB(this, rdy_3.JT, "E"));
      ((List)this.id_byte[0]).add(new rrFB(this, rdy_3.XY, "R"));
      ((List)this.id_byte[0]).add(new rrFB(this, rdy_3.ko, "T"));
      ((List)this.id_byte[0]).add(new rrFB(this, rdy_3.xa, "Y"));
   }

   static {
      ntfClinit();
   }

   private static boolean B() {
      Hud var0 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().w();
      return var0.aJ_() && var0.id_else() ? true : id_new[30];
   }

   private static void J() {
      id_volatile = new float[]{
         0.5F,
         0.5F,
         0.0F,
         0.0F,
         0.001F,
         4.0F,
         150.0F,
         0.0F,
         4.0F,
         0.0F,
         15.0F,
         0.001F,
         4.0F,
         0.0F,
         0.0F,
         0.0F,
         0.001F,
         4.0F,
         150.0F,
         0.0F,
         4.0F,
         0.0F,
         0.0F,
         10.0F,
         5.0F,
         0.0F,
         1.0F,
         0.0F,
         225.0F,
         255.0F,
         1.5F,
         1.0F,
         0.5F,
         0.0F,
         0.0F,
         8.0F,
         2.0F,
         4.0F,
         1.0F,
         0.7F,
         0.5F,
         0.5F,
         8.0F,
         4.5F,
         10.0F,
         2.0F,
         1.0F,
         10.0F,
         0.0F,
         90.0F,
         270.0F,
         180.0F,
         4.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.5F,
         8.0F,
         10.0F,
         4.0F,
         4.0F,
         5.0F,
         150.0F,
         1.5F,
         2.5F,
         4.5F,
         0.5F,
         8.0F,
         0.7F,
         4.0F,
         0.001F
      };
   }

   private static void S() {
      id_continue = new String[]{
         new String("Item Keybinds"), new String("Q"), new String("W"), new String("E"), new String("R"), new String("T"), new String("Y")
      };
   }

   boolean x() {
      return (vm_3)id_import.id_class[73] instanceof FP && !this.h() ? true : id_new[19];
   }

   private static void s() {
      Object[] var0 = new Object[]{0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.689349E19F, 16777215, 0.0F, 300L, -3.689349E19F};
      id_protected = var0;
   }

   private boolean h() {
      this.d();

      for (rrFr_1 var2 : (List)this.id_byte[0]) {
         if (!var2.id_byte() && var2.id_protected()) {
            return true;
         }
      }

      return id_new[21];
   }

   private void d() {
      if (this.id_byte == null) {
         this.id_byte = new Object[7];
         Object[] var1 = this.id_byte;
         var1[1] = 0.0F;
         var1[2] = 0.0F;
         var1[5] = false;
         var1[6] = false;
      }
   }

   @Override
   public void id_class(rrHv_1 var1) {
      this.d();

      for (rrFr_1 var3 : (List)this.id_byte[0]) {
         if (var3 instanceof rrFP && (rrHv_1)((rrFP)var3).id_break[0] == var1) {
            return;
         }
      }

      int var5 = id_new[31];

      for (rrFr_1 var4 : (List)this.id_byte[0]) {
         if (var4.id_byte()) {
            break;
         }

         var5++;
      }

      ((List)this.id_byte[0]).add(var5, new rrFP(var1));
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      this.d();
      super.id_class(var1, var2, var3, var4, var5);
      rrZO var6 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_private();
      boolean var7 = B();
      float var8 = this.id_long();
      long var9 = rqR_2.id_break();
      boolean var11 = this.x();
      if (var11 && !(Boolean)this.id_byte[6]) {
         for (rrFr_1 var13 : (List)this.id_byte[0]) {
            if (!var13.id_byte()) {
               ((AnimValue)var13.id_class[0]).id_class(0.0F);
               var13.id_case();
            }
         }
      }

      Boolean var32 = var11;
      this.id_byte[6] = var32;
      this.id_protected(var7);
      float var33 = this.id_default();
      float var34 = this.id_abstract();
      int var14 = 0;
      int var15 = 0;
      float var16 = 0.0F;
      var6.id_class((lD_2)rrfD_2.id_class[7]);
      rrfD_2.id_throws((lD_2)rrfD_2.id_class[8]);

      for (rrFr_1 var18 : (List)this.id_byte[0]) {
         boolean var19 = var18.id_class(var7);
         boolean var20 = ((AnimValue)var18.id_class[0]).id_byte() > 0.001F ? true : id_new[7];
         var18.id_class(var7, var9);
         if (!var19 && !var20) {
            var18.id_case();
         } else {
            float var21 = (Float)var18.id_class[5];
            if (var15 > 0 && var16 + 4.0F + var21 > 150.0F) {
               var14++;
               var15 = 0;
               var16 = 0.0F;
            }

            float var22 = var16 + (var15 > 0 ? 4.0F : id_volatile[9]);
            float var23 = (float)var14 * 15.0F;
            var18.id_class(var22, var23);
            float var24 = var18.id_catch();
            float var25 = ((AnimValue)var18.id_class[0]).id_byte();
            if (var25 > 0.001F) {
               float var26 = var33 + var18.id_break();
               float var27 = var34 + var18.id_private() + var18.id_class(var9);
               this.id_class(var1, var6, var18, var26, var27, var24, var25, var8);
            }

            var16 += (var15 > 0 ? 4.0F : id_volatile[13]) + var21;
            var15++;
         }
      }

      rrfD_2.id_private((lD_2)rrfD_2.id_class[8]);
      var6.id_byte((lD_2)rrfD_2.id_class[7]);
   }

   private static void id_class(Ml_1 var0, float var1, float var2, float var3, int var4) {
      rrfD_2.id_class(
         var0,
         var1,
         var2,
         var3,
         10.0F,
         var4,
         ColorHelper.id_class(0.0F, var4),
         ColorHelper.id_class(90.0F, var4),
         ColorHelper.id_class(270.0F, var4),
         ColorHelper.id_class(180.0F, var4),
         false,
         4.0F
      );
   }

   private void id_class(Ml_1 var1, rrZO var2, rrFr_1 var3, float var4, float var5, float var6, float var7, float var8) {
      int var9 = (int)(225.0F * var7 * var8);
      int var10 = (int)(255.0F * var7 * var8);
      id_class(var1, var4, var5, var6, var9);
      float var11 = var4 + 1.5F;
      float var12 = var5 + 1.0F;
      rrfD_2.id_class(var1, var3.id_class(), var11, var12, var7 * var8, 0.5F, 0.0F, 0.0F, 0, false, !var3.id_byte() ? true : id_new[25]);
      float var13 = var11 + 8.0F + 2.0F;
      float var14 = 4.0F;
      float var15 = var5 + 1.0F;
      float var16 = var15 + var14;
      int var17 = ColorHelper.id_break(-1, (int)((float)var10 * 0.7F));
      rrfD_2.id_class(var1, (lD_2)rrfD_2.id_class[8], var13, var15, 0.5F, var14, var17, var17, 16777215, 16777215);
      rrfD_2.id_class(var1, (lD_2)rrfD_2.id_class[8], var13, var16, 0.5F, var14, 16777215, 16777215, var17, var17);
      float var18 = var11 + 8.0F + 4.5F;
      float var19 = var5 + (10.0F - (float)var2.id_class()) / 2.0F + 1.0F;
      var1.id_class();
      var2.id_break(var1, (lD_2)rrfD_2.id_class[7], var3.id_implements(), (double)var18, (double)var19, ColorHelper.id_break(rrZF.d_, var10), false, false);
      var1.id_break();
   }

   public void id_class(rrAM var1) {
      this.d();
      rrZO var2 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_private();
      boolean var3 = B();

      for (rrFr_1 var5 : (List)this.id_byte[0]) {
         var5.id_class(var2);
         boolean var6 = var5.id_class(var3);
         ((AnimValue)var5.id_class[0]).id_class(var6 ? 1.0F : id_volatile[27]);
         ((AnimValue)var5.id_class[1]).id_package();
         var5.id_case();
      }

      ((AnimValue)this.id_byte[3]).id_package();
      ((AnimValue)this.id_byte[4]).id_package();
      Boolean var11 = false;
      this.id_byte[5] = var11;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1267787027;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4221913575643560989L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-51, 60, 87, 76, 75, 92, 74, 5}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void M() {
      id_native = new long[]{300L};
   }

   private static void G() {
      id_int = new short[]{
         0,
         3,
         4,
         5,
         6,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         6,
         0,
         0,
         6,
         7,
         8,
         0,
         0,
         5,
         0,
         8,
         7,
         0,
         0,
         5,
         5,
         4,
         3,
         5,
         4,
         3,
         4,
         1,
         3,
         2,
         0,
         0,
         0,
         0,
         0,
         1,
         3,
         4,
         5,
         73,
         0,
         8,
         8,
         7,
         0,
         0,
         0,
         0,
         0,
         1,
         2,
         0,
         0
      };
   }

   @Override
   public float id_implements() {
      this.d();
      return (Float)this.id_byte[1];
   }

   @Override
   public void id_instanceof() {
      this.d();
      super.id_instanceof();
      rrZO var1 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_private();

      for (rrFr_1 var3 : (List)this.id_byte[0]) {
         var3.id_class(var1);
      }
   }

   @Override
   public boolean id_package() {
      this.d();
      if (!B()) {
         return false;
      } else {
         for (rrFr_1 var2 : (List)this.id_byte[0]) {
            if (var2.id_protected()) {
               return true;
            }
         }

         return id_new[34];
      }
   }

   private static void id_throw() {
      id_new = new boolean[]{
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         true
      };
   }

   private static void id_try() {
      id_final = new int[]{16777215, 16777215, 16777215, 16777215, 16777215};
   }

   private void id_protected(boolean var1) {
      this.d();
      float var2 = 0.0F;
      float var3 = 0.0F;
      int var4 = 0;
      int var5 = 0;
      int var6 = -1;

      for (rrFr_1 var8 : (List)this.id_byte[0]) {
         boolean var9 = var8.id_class(var1);
         boolean var10 = ((AnimValue)var8.id_class[0]).id_byte() > 0.001F ? true : id_new[12];
         if (var9 || var10) {
            float var11 = (Float)var8.id_class[5];
            if (var5 > 0 && var3 + 4.0F + var11 > 150.0F) {
               var2 = Math.max(var2, var3);
               var4++;
               var5 = 0;
               var3 = 0.0F;
            }

            if (var4 > var6) {
               var6 = var4;
            }

            var3 += (var5 > 0 ? 4.0F : id_volatile[21]) + var11;
            var5++;
         }
      }

      var2 = Math.max(var2, var3);
      float var20 = Math.max(0.0F, var2);
      float var21 = var6 >= 0 ? (float)(var6 + 1) * 10.0F + (float)var6 * 5.0F : id_volatile[25];
      boolean var22 = var6 >= 0 ? true : id_new[16];
      if (var22 && !(Boolean)this.id_byte[5]) {
         ((AnimValue)this.id_byte[4]).id_package();
         ((AnimValue)this.id_byte[3]).id_package();
      }

      Boolean var16 = var22;
      this.id_byte[5] = var16;
      ((AnimValue)this.id_byte[4]).id_break(var20);
      ((AnimValue)this.id_byte[3]).id_break(var21);
      Float var17 = ((AnimValue)this.id_byte[4]).id_byte();
      this.id_byte[1] = var17;
      Float var18 = ((AnimValue)this.id_byte[3]).id_byte();
      this.id_byte[2] = var18;
   }

   @Override
   public boolean id_protected() {
      return false;
   }

   private static void X() {
      id_package = new byte[]{-1, -1, 7, 2, 5, 6, 17, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
   }

   @Override
   public float ao_() {
      this.d();
      return (Float)this.id_byte[2];
   }

   @Override
   public void at_() {
      super.at_();
      ((rrTm_1)rrTm_1.staticFields9ecc5a8aa54b3c499a2c916d8fcc4ea4[0]).id_class(this);
   }
}

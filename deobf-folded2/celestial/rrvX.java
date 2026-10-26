package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvX extends rrtN_2 {
   private static int[] id_byte;
   private static byte[] id_protected;
   private static String[] id_native;
   private static short[] id_volatile;
   public Object[] id_class;
   public static Object[] id_break;
   private static double[] id_final;
   private static float[] id_package;
   private static boolean[] id_int;

   @Override
   public String id_byte() {
      return "Цвет";
   }

   @Override
   public void id_int() {
      super.id_int();
      this.x();
   }

   public rrvX(rrtH_2 var1, Supplier<Float> var2, Supplier<Float> var3) {
      super(var2, var3, () -> 105.5F, () -> 0.0F);
      this.S();
      rruL var8 = new rruL();
      this.id_class[1] = var8;
      Float var9 = (Float)var2.get();
      this.id_class[2] = var9;
      Float var10 = (Float)var3.get();
      this.id_class[3] = var10;
      this.id_class[0] = var1;
      this.id_class(() -> 60.0F + (this.d() ? 55.0F : id_package[70]));
      this.id_break(var1.id_synchronized().id_byte(), true, true, true);
      this.id_super();
      ((rrtH_2)this.id_class[0]).id_synchronized().id_class("setup_color", (var1x, var2x) -> {
         if ((Boolean)var2x.getRight()) {
            this.id_break((Integer)var2x.getLeft(), true, true, true);
         }
      });
   }

   static {
      ntfClinit();
   }

   private static void F() {
      id_native = new String[]{
         new String("setup_color"),
         new String("Цвет"),
         new String("ColorPickerPopUp"),
         new String("#%08X"),
         new String("#%06X"),
         new String("Успешно!"),
         new String("Ошибка!"),
         new String("#"),
         new String("Успешно!"),
         new String("Ошибка!"),
         new String("Вставить"),
         new String("Копировать"),
         new String("celestial/images/huebar.png")
      };
   }

   private void S() {
      if (this.id_class == null) {
         this.id_class = new Object[13];
         Object[] var1 = this.id_class;
         var1[2] = 0.0F;
         var1[3] = 0.0F;
         var1[4] = 0.0F;
         var1[5] = 0.0F;
         var1[6] = 0.0F;
         var1[7] = 0.0F;
         var1[8] = false;
         var1[9] = false;
         var1[10] = false;
      }
   }

   private void id_this() {
      this.S();

      try {
         String var1 = ((Qj_1)id_import.id_class[id_volatile[59]]).id_class().trim();
         if (var1.startsWith(id_native[7])) {
            var1 = var1.substring(id_int[44]);
         }

         int var2 = (int)Long.parseLong(var1, id_protected[9]);
         if (!((rrtH_2)this.id_class[id_volatile[60]]).id_synchronized().id_class().get()) {
            var2 |= id_byte[3];
         } else if ((var2 & id_byte[4]) == 0) {
            var2 |= id_byte[5];
         }

         this.id_class(var2, id_int[45], id_int[46], id_int[47]);
         ((rruu_1)this.id_class[id_volatile[61]]).id_class(rrum_1.id_class(id_native[8], id_package[54]));
      } catch (Exception var3) {
         ((rruu_1)this.id_class[12]).id_class(rrum_1.id_class("Ошибка!", 1.0F));
      }
   }

   private void x() {
      this.S();
      Boolean var5 = false;
      this.id_class[8] = var5;
      Boolean var6 = false;
      this.id_class[9] = var6;
      Boolean var7 = false;
      this.id_class[10] = var7;
   }

   private static void h() {
      Object[] var0 = new Object[]{new rqO_2("minecraft", "celestial/images/huebar.png"), 60};
      id_break = var0;
   }

   private boolean d() {
      this.S();
      return ((rrtH_2)this.id_class[0]).id_synchronized().id_class().get();
   }

   public void id_class(float var1) {
      this.S();
      Float var6 = var1;
      this.id_class[2] = var6;
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      super.id_class(var1, var2, var3, var4, var5);
      this.id_interface().id_class(var1, () -> this.id_class(var1, var2, var3, var4, false, var5), var2, var3, var4, var5);
   }

   private static void id_class(Ml_1 var0, float var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      int var8 = ColorHelper.id_break((Integer)rrZI.id_break[4], var7);
      rrfD_2.id_class(var0, var1 - var6, var2 - var6, var3 + var6 * 2.0F, var4 + var6 * 2.0F, var5, 1.0F, 1.0F, var8, var8, var8, var8);
   }

   private void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5, boolean var6) {
      this.S();
      RenderSystem.disableBlend();
      RenderSystem.disableAlphaTest();
      double var7 = (double)this.id_long();
      int var9 = (int)(255.0 * var7);
      this.id_class(var1, var9);
      this.id_class(var1, var9, var6);
      if (!var6) {
         this.id_class(var1, var3, var4, var9);
         this.id_break(var1, var3, var9);
         if (this.d()) {
            this.id_class(var1, var3, var9);
         }
      }

      RenderSystem.enableBlend();
      RenderSystem.enableAlphaTest();
      ((rruL)this.id_class[1]).id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5, boolean var6) {
      this.S();
      super.id_class(var1, var2, var3, var4, var5, var6);
      if (this.id_class().id_break((float)var2, (float)var3)) {
         if (var4 == 0) {
            Boolean var11 = true;
            this.id_class[8] = var11;
            return false;
         }

         if (var4 == 2) {
            this.id_class(((rrtH_2)this.id_class[0]).id_synchronized().id_finally(), true, true, true);
            return false;
         }
      } else if (this.id_finally().id_break((float)var2, (float)var3)) {
         if (var4 == 0) {
            Boolean var12 = true;
            this.id_class[9] = var12;
            return false;
         }
      } else if (this.d() && this.id_volatile().id_break((float)var2, (float)var3) && var4 == 0) {
         Boolean var13 = true;
         this.id_class[10] = var13;
         return false;
      }

      return ((rruL)this.id_class[1]).id_class(var1, var2, var3, var4, var5);
   }

   @Override
   public void id_class(int var1, int var2, int var3) {
      super.id_class(var1, var2, var3);
      this.x();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1470347704;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4859996799465379669L;
   }

   public rruv_1 id_class() {
      float var1 = this.id_default();
      float var2 = this.id_abstract();
      float var3 = this.id_implements();
      return new rruv_1(var1 + 5.0F, var2 + 5.0F, var3 - 10.0F, 60.0F);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{31, -27, 117, -98, 77, -20, -12, 62}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_class(Ml_1 var1, int var2, int var3) {
      this.S();
      rruv_1 var4 = this.id_volatile();
      float var5 = var4.id_break();
      float var6 = var4.id_protected();
      float var7 = var4.id_byte();
      float var8 = var4.id_class();
      int var9 = Color.HSBtoRGB((Float)this.id_class[4], (Float)this.id_class[5], (Float)this.id_class[6]);
      if ((Boolean)this.id_class[10]) {
         int var10 = rfU_2.id_class(var2, (int)var5, (int)(var5 + var7));
         Float var15 = ((float)var10 - var5) / var7;
         this.id_class[7] = var15;
         this.id_class(var9, false, false, false);
      }

      float var16 = id_package[14];
      rrfD_2.id_break(
         var1,
         var5 + 1.0F,
         var6 + 1.0F,
         var7 - 2.0F,
         var8 - 2.0F,
         var16,
         var16,
         var16,
         var16,
         ColorHelper.id_break(0, var3),
         ColorHelper.id_break(-16777216, var3),
         ColorHelper.id_break(-1, var3),
         ColorHelper.id_break(-1, var3)
      );
      id_class(var1, var5, var6, var7, var8, 2.0F, 0.5F, var3);
      rrfD_2.id_class(
         var1,
         (double)rfU_2.id_class(var5 + (Float)this.id_class[7] * var7, var5 + 2.0F, var5 + var7 - 2.0F),
         (double)(var6 + var8 / 2.0F),
         8.0F,
         ColorHelper.id_break(rrZF.d_, var3),
         this.id_long()
      );
   }

   private void id_class(int var1, boolean var2, boolean var3, boolean var4) {
      this.S();
      this.id_break(var1, var2, var3, var4);
      int var5 = Math.max(1, var1 >> 16 & 0xFF);
      int var6 = Math.max(1, var1 >> 8 & 0xFF);
      int var7 = Math.max(1, var1 & 0xFF);
      ((rrtH_2)this.id_class[0])
         .id_synchronized()
         .id_class(Integer.valueOf(ColorHelper.id_class(var5, var6, var7, (int)((Float)this.id_class[7] * 255.0F))), false, true);
   }

   private void id_class(Ml_1 var1, int var2) {
      float var3 = this.id_default();
      float var4 = this.id_abstract();
      float var5 = this.id_implements();
      float var6 = this.id_double();
      rrfD_2.id_class(var1, var3, var4, var5, var6, 8.0F, 8.0F, 8.0F, 8.0F, ColorHelper.id_break(rrZF.n_, var2));
   }

   private void id_class(Ml_1 var1, int var2, boolean var3) {
   }

   private void id_class(Ml_1 var1, int var2, int var3, int var4) {
      this.S();
      rruv_1 var5 = this.id_class();
      float var6 = var5.id_break();
      float var7 = var5.id_protected();
      float var8 = var5.id_byte();
      float var9 = var5.id_class();
      if ((Boolean)this.id_class[8]) {
         int var10 = rfU_2.id_class(var2, (int)var6, (int)(var6 + var8));
         int var11 = rfU_2.id_class(var3, (int)var7 + 1, (int)(var7 + var9));
         Float var16 = ((float)var10 - var6) / var8;
         this.id_class[5] = var16;
         Float var17 = 1.0F - ((float)var11 - var7) / var9;
         this.id_class[6] = var17;
         this.id_class(Color.HSBtoRGB((Float)this.id_class[4], (Float)this.id_class[5], (Float)this.id_class[6]), false, false, false);
      }

      float var18 = id_package[1];
      id_class(var1, var6, var7, var8, var9, var18 + 1.0F, 2.0F, var4);
      rrfD_2.id_break(
         var1,
         var6,
         var7,
         var8,
         var9,
         var18,
         var18,
         var18,
         var18,
         ColorHelper.id_break(-1, var4),
         ColorHelper.id_break(402653184, var4),
         ColorHelper.id_break(Color.HSBtoRGB((Float)this.id_class[4], 1.0F, 1.0F), var4),
         ColorHelper.id_break(402653184, var4)
      );
      rrfD_2.id_class(
         var1,
         (double)(var6 + (Float)this.id_class[5] * var8),
         (double)(var7 + (1.0F - (Float)this.id_class[6]) * var9),
         5.0F,
         ColorHelper.id_break(rrZF.d_, var4),
         this.id_long()
      );
   }

   @Override
   public void id_class(Ml_1 var1, float var2) {
      this.S();
      float var3 = 1.0F - var2;
      var1.id_class((double)(var3 * (Float)this.id_class[2]), (double)(var3 * (Float)this.id_class[3]), 0.0);
      var1.id_class(var2, var2, var2);
   }

   private static void m() {
      id_byte = new int[]{402653184, 402653184, -16777216, -16777216, -16777216, -16777216};
   }

   private static void v() {
      id_final = new double[]{255.0, 0.0};
   }

   private static void u() {
      id_int = new boolean[]{
         true,
         true,
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         true,
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         true
      };
   }

   @Override
   public void id_break(rrtu_3 var1, int var2, int var3, int var4, boolean var5, boolean var6) {
      super.id_break(var1, var2, var3, var4, var5, var6);
      this.id_int();
   }

   public void id_break(float var1) {
      this.S();
      Float var6 = var1;
      this.id_class[3] = var6;
   }

   private void id_break(Ml_1 var1, int var2, int var3) {
      this.S();
      rruv_1 var4 = this.id_finally();
      float var5 = var4.id_break();
      float var6 = var4.id_protected();
      float var7 = var4.id_byte();
      float var8 = var4.id_class();
      if ((Boolean)this.id_class[9]) {
         int var9 = rfU_2.id_class(var2, (int)var5, (int)(var5 + var7));
         Float var14 = ((float)var9 - var5) / var7;
         this.id_class[4] = var14;
         this.id_class(Color.HSBtoRGB((Float)this.id_class[4], (Float)this.id_class[5], (Float)this.id_class[6]), false, false, false);
      }

      rrfD_2.id_class(var1, (rqO_2)id_break[0], var5, var6, var7, var8, ColorHelper.id_break(-1, var3));
      id_class(var1, var5, var6, var7, var8, 2.0F, 0.5F, var3);
      rrfD_2.id_class(
         var1,
         (double)rfU_2.id_class(var5 + (Float)this.id_class[4] * var7, var5 + 2.0F, var5 + var7 - 2.0F),
         (double)(var6 + var8 / 2.0F),
         8.0F,
         ColorHelper.id_break(rrZF.d_, var3),
         this.id_long()
      );
   }

   private void id_break(int var1, boolean var2, boolean var3, boolean var4) {
      this.S();
      if (var2) {
         Float var9 = ColorHelper.id_class(var1)[0];
         this.id_class[4] = var9;
      }

      if (var3) {
         Float var10 = ColorHelper.id_class(var1)[1];
         this.id_class[5] = var10;
         Float var11 = ColorHelper.id_class(var1)[2];
         this.id_class[6] = var11;
      }

      if (var4) {
         Float var12 = (float)ColorHelper.id_throws(var1) / 255.0F;
         this.id_class[7] = var12;
      }
   }

   public float id_break() {
      this.S();
      return (Float)this.id_class[7];
   }

   private void W() {
      this.S();

      try {
         int var2 = ((rrtH_2)this.id_class[id_volatile[54]]).id_synchronized().id_byte();
         String var1;
         if (this.d() && ColorHelper.id_throws(var2) < id_volatile[55]) {
            String var4 = id_native[3];
            Object[] var5 = new Object[id_int[40]];
            var5[id_int[41]] = var2;
            var1 = String.format(var4, var5);
         } else {
            String var10000 = id_native[4];
            Object[] var10001 = new Object[id_int[42]];
            var10001[id_int[43]] = var2;
            var1 = String.format(var10000, var10001);
         }

         ((Qj_1)id_import.id_class[id_volatile[56]]).id_class(var1);
         ((rruu_1)this.id_class[id_volatile[57]]).id_class(rrum_1.id_class(id_native[5], id_package[52]));
      } catch (Exception var3) {
         ((rruu_1)this.id_class[11]).id_class(rrum_1.id_class("Ошибка!", 1.0F));
      }
   }

   public rruv_1 id_finally() {
      float var1 = this.id_default();
      float var2 = this.id_abstract();
      float var3 = this.id_implements();
      return new rruv_1(var1 + 5.0F, var2 + 5.0F + 60.0F + 8.0F, var3 - 10.0F, 5.0F);
   }

   @Override
   public String id_catch() {
      return "ColorPickerPopUp";
   }

   private static void G() {
      id_package = new float[]{
         1.0F,
         4.0F,
         1.0F,
         2.0F,
         1.0F,
         1.0F,
         1.0F,
         5.0F,
         2.0F,
         0.5F,
         2.0F,
         2.0F,
         2.0F,
         8.0F,
         1.0F,
         1.0F,
         1.0F,
         2.0F,
         2.0F,
         2.0F,
         0.5F,
         2.0F,
         2.0F,
         2.0F,
         8.0F,
         8.0F,
         8.0F,
         8.0F,
         8.0F,
         2.0F,
         2.0F,
         1.0F,
         1.0F,
         5.0F,
         5.0F,
         10.0F,
         60.0F,
         5.0F,
         5.0F,
         60.0F,
         8.0F,
         10.0F,
         5.0F,
         5.0F,
         5.0F,
         60.0F,
         22.0F,
         10.0F,
         5.0F,
         1.0F,
         255.0F,
         255.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         0.0F,
         3.5F,
         40.0F,
         10.0F,
         60.5F,
         15.0F,
         0.0F,
         3.5F,
         50.5F,
         10.0F,
         5.0F,
         15.0F,
         60.0F,
         55.0F,
         41.0F,
         0.0F,
         105.5F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F
      };
   }

   @Override
   public boolean id_extends() {
      return false;
   }

   private static void id_else() {
      id_protected = new byte[]{2, -1, -1, -1, -1, 2, 2, 16, 8, 16, 13, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 60};
   }

   @Override
   public boolean id_new() {
      return false;
   }

   public float id_package() {
      this.S();
      return (Float)this.id_class[3];
   }

   private void id_super() {
      this.S();
      rruL var10000 = (rruL)this.id_class[1];
      rruF[] var10001 = new rruF[2];
      rruu_1 var5;
      rruu_1 var10006 = var5 = new rrup_1(
            ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_class(),
            () -> "Копировать",
            () -> new rjK_2(this.id_default() + 5.0F, this.id_abstract() + this.id_double() - 15.0F),
            () -> new rjK_2(50.5F, 10.0F),
            () -> new rjK_2(0.0F, 3.5F),
            () -> rrZF.k_,
            () -> new rji_3(
                  (float)((Integer)rrZI.id_break[4]).intValue(),
                  (float)((Integer)rrZI.id_break[4]).intValue(),
                  (float)((Integer)rrZI.id_break[4]).intValue(),
                  (float)((Integer)rrZI.id_break[4]).intValue()
               )
         )
         .<rrup_1>id_break(() -> false)
         .<rrup_1>id_class(this::id_long)
         .id_super();
      this.id_class[11] = var5;
      var10001[0] = new rruF(var10006).id_class(this::W);
      rruu_1 var6;
      var10006 = var6 = new rrup_1(
            ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_class(),
            () -> "Вставить",
            () -> new rjK_2(this.id_default() + 60.5F, this.id_abstract() + this.id_double() - 15.0F),
            () -> new rjK_2(40.0F, 10.0F),
            () -> new rjK_2(0.0F, 3.5F),
            () -> rrZF.k_,
            () -> new rji_3(
                  (float)((Integer)rrZI.id_break[4]).intValue(),
                  (float)((Integer)rrZI.id_break[4]).intValue(),
                  (float)((Integer)rrZI.id_break[4]).intValue(),
                  (float)((Integer)rrZI.id_break[4]).intValue()
               )
         )
         .<rrup_1>id_break(() -> false)
         .<rrup_1>id_class(this::id_long)
         .id_super();
      this.id_class[12] = var6;
      var10001[1] = new rruF(var10006).id_class(this::id_this);
      var10000.id_class(var10001);
   }

   @Override
   public boolean id_protected() {
      return true;
   }

   @Override
   public void id_private() {
      super.id_private();
      this.id_int();
   }

   @Override
   public boolean id_final() {
      return false;
   }

   public rruv_1 id_volatile() {
      float var1 = this.id_default();
      float var2 = this.id_abstract();
      float var3 = this.id_implements();
      return new rruv_1(var1 + 5.0F, var2 + 5.0F + 60.0F + 22.0F, var3 - 10.0F, 5.0F);
   }

   public float id_native() {
      this.S();
      return (Float)this.id_class[2];
   }

   private static void X() {
      id_volatile = new short[]{
         1,
         2,
         3,
         0,
         0,
         1,
         0,
         11,
         0,
         12,
         1,
         8,
         5,
         6,
         4,
         5,
         6,
         4,
         5,
         6,
         9,
         4,
         4,
         5,
         6,
         0,
         4,
         4,
         5,
         6,
         10,
         7,
         7,
         4,
         8,
         0,
         9,
         10,
         1,
         2,
         3,
         0,
         8,
         9,
         10,
         4,
         5,
         6,
         7,
         255,
         255,
         255,
         0,
         7,
         0,
         255,
         23,
         11,
         11,
         23,
         0,
         12,
         12,
         7,
         2,
         3,
         2,
         3,
         4,
         4,
         4,
         4,
         4,
         4,
         4,
         4
      };
   }
}

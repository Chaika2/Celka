package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZi_1 extends GuiComponent {
   private static float[] id_break;
   private static byte[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_class;
   private static short[] id_throws;

   private static void id_int() {
      id_throws = new short[]{
         4,
         5,
         0,
         1,
         6,
         7,
         10,
         11,
         2,
         3,
         0,
         1,
         5,
         2,
         5,
         3,
         4,
         0,
         1,
         0,
         4,
         1,
         1,
         0,
         0,
         1,
         0,
         1,
         5,
         5,
         1,
         4,
         0,
         270,
         180,
         0,
         1,
         0,
         6,
         8,
         7,
         9,
         10,
         11,
         8,
         9,
         1,
         3,
         3,
         3,
         3,
         2,
         2,
         2,
         2
      };
   }

   public rrZi_1(rrZI var1, rrtu_3 var2, ClickGuiScreen var3, Module var4, Supplier<Float> var5, Supplier<Float> var6, int var7, int var8) {
      this.id_else();
      AnimValue var17 = new AnimValue(0.3F, false);
      this.id_class[4] = var17;
      rruL var18 = new rruL();
      this.id_class[5] = var18;
      this.id_class[0] = var1;
      this.id_class[1] = var4;
      this.id_class[6] = var5;
      this.id_class[7] = var6;
      Integer var23 = var7;
      this.id_class[10] = var23;
      Integer var24 = var8;
      this.id_class[11] = var24;
      rrvh_1 var25 = new rrvh_1(this, this::id_extends, this::id_case);
      this.id_class[2] = var25;
      rrvO var26 = new rrvO(this, this::id_extends, this::id_case);
      this.id_class[3] = var26;
      float var9 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_catch().id_break(((Module)this.id_class[1]).id_final());
      Runnable var10 = () -> {
         this.id_else();
         float var3x = rfU_2.id_class((float)var3.id_abstract() - ((rrvh_1)this.id_class[2]).id_implements() - 10.0F, 5.0F, id_const.id_volatile() - 5.0F);
         float var4x = rfU_2.id_class((float)var3.id_finally(), 5.0F, (float)id_const.id_native() - ((rrvh_1)this.id_class[2]).id_double() - 5.0F);
         var2.id_class(((rrvh_1)this.id_class[2]).id_class(var3x, var4x), () -> {
            this.id_else();
            ((rrvh_1)this.id_class[2]).id_class(var2);
         });
      };
      Runnable var11 = () -> {
         this.id_else();
         float var3x = rfU_2.id_class((float)var3.id_abstract() - ((rrvO)this.id_class[3]).id_implements() - 10.0F, 5.0F, id_const.id_volatile() - 5.0F);
         float var4x = rfU_2.id_class((float)var3.id_finally(), 5.0F, (float)id_const.id_native() - ((rrvO)this.id_class[3]).id_double() - 5.0F);
         var2.id_class(((rrvO)this.id_class[3]).id_class(var3x, var4x), () -> {
            this.id_else();
            ((rrvO)this.id_class[3]).id_class(var2);
         });
      };
      Supplier var12 = () -> {
         this.id_else();
         return ((Module)this.id_class[1]).b().stream().anyMatch(Setting::id_private);
      };
      ((rruL)this.id_class[5])
         .id_class(
            new rruF(
                  new rrun_1(
                        () -> rrZL.id_int, () -> new rjK_2(this.id_extends() + var9 + 7.0F, this.id_case() + 3.5F), () -> new rjK_2(8.0F, 8.0F), () -> rrZF.d_
                     )
                     .<rrun_1>id_class(this::id_continue)
                     .id_class(0.2F)
               )
               .id_break(var12)
               .id_class(((rrvh_1)this.id_class[2])::id_static)
               .id_class(var10)
         );
      if (!(var4 instanceof rrnv_3)) {
         ((rruL)this.id_class[5])
            .id_class(
               new rruF(new rrun_1(() -> rrZL.id_protected, () -> {
                     byte var3x = var12.get() ? 17 : id_byte[8];
                     return new rjK_2(this.id_extends() + var9 + (float)var3x, this.id_case() + 3.5F);
                  }, () -> new rjK_2(8.0F, 8.0F), () -> rrZF.d_).<rrun_1>id_class(this::id_continue).id_class(0.2F))
                  .id_class(((rrvO)this.id_class[3])::id_static)
                  .id_class(var11)
            );
      }
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, rruv_1 var5, boolean var6, boolean var7) {
      this.id_else();
      super.id_class(var1, var2, var3, var4, var5, var6, var7);
      float var8 = this.id_extends();
      float var9 = this.id_case();
      int var10 = this.id_catch();
      int var11 = this.id_break();
      AnimValue var12 = (AnimValue)this.id_class[4];
      if (!((rrZI)this.id_class[0]).id_native().id_volatile().id_long()) {
         var12.id_class(((Module)this.id_class[1]).aJ_());
      }

      float var13 = ((rrZI)this.id_class[0]).id_implements().id_class().id_byte();
      int var14 = (int)(255.0F * var13);
      int var15 = ColorHelper.id_break((Integer)rrZI.id_break[4], var14);
      if (!((Module)this.id_class[1]).aJ_()) {
         rrfD_2.id_break(var1, var8, var9, (float)var10, (float)var11, 4.0F, var15, var15, var15, var15);
      }

      if (var12.id_case()) {
         this.id_class(var1, var8, var9, var10, var11, var13);
      }

      if (!((Module)this.id_class[1]).aJ_() || !((rrZI)this.id_class[0]).id_native().id_volatile().id_long()) {
         int var16 = ColorHelper.id_break(rrZF.d_, var14);
         ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0])
            .id_catch()
            .id_protected(var1, ((Module)this.id_class[1]).id_final(), var8 + 5.0F, var9 + 5.0F, var16, false);
         ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0])
            .id_private()
            .id_class(var1, ((Module)this.id_class[1]).ay_(), (double)(var8 + 5.0F), (double)(var9 + 16.0F), var16, false, false);
      }

      ((rruL)this.id_class[5]).id_class(var1, var2, var3, var4, var6, var7);
   }

   @Override
   public rrZN id_class() {
      this.id_else();
      return (rrZI)this.id_class[0];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-20, -93, -51, 17, 42, -7, 18, -12}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_class(Ml_1 var1, float var2, float var3, int var4, int var5, float var6) {
      this.id_else();
      int var7 = (int)(255.0F * ((AnimValue)this.id_class[4]).id_byte() * var6);
      int var8 = ((rrZI)this.id_class[0]).id_finally().indexOf(this) * 100;
      int var9 = ColorHelper.id_class((float)var8, var7);
      int var10 = ColorHelper.id_class((float)(90 + var8), var7);
      int var11 = ColorHelper.id_class((float)(270 + var8), var7);
      int var12 = ColorHelper.id_class((float)(180 + var8), var7);
      if (ClickGuiTheme.id_class()) {
         rrfD_2.id_class(var1, var2, var3 - 2.0F, (float)var4, (float)(var5 + 4), 0.5F, 4, 9, var9, var10, var11, var12, var7);
      }

      rrfD_2.id_break(var1, var2 + 1.0F, var3 + 1.0F, (float)(var4 - 2), (float)(var5 - 2), 4.0F, 4.0F, 4.0F, 4.0F, var9, var10, var11, var12);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -967693744;
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.id_else();
      if (var4 == 0 && super.id_class(var1, var2, var3, var4, var5)) {
         if (((rruL)this.id_class[5]).id_class(var1, var2, var3, var4, var5)) {
            return true;
         } else {
            ((Module)this.id_class[1]).aw_();
            return true;
         }
      } else {
         return id_protected[10];
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7057526812046625856L;
   }

   public void id_class(float var1, float var2) {
      this.id_else();
      Float var7 = var1;
      this.id_class[8] = var7;
      Float var8 = var2;
      this.id_class[9] = var8;
   }

   public int id_break() {
      this.id_else();
      return (Integer)this.id_class[11];
   }

   public int id_catch() {
      this.id_else();
      return (Integer)this.id_class[10];
   }

   public float id_extends() {
      this.id_else();
      return (Float)((Supplier)this.id_class[6]).get() + (Float)this.id_class[8];
   }

   public float id_case() {
      this.id_else();
      return (Float)((Supplier)this.id_class[7]).get() + (Float)this.id_class[9];
   }

   private float id_continue() {
      this.id_else();
      return ((rrZI)this.id_class[0]).id_implements().id_class().id_byte();
   }

   private void id_else() {
      if (this.id_class == null) {
         this.id_class = new Object[12];
         Object[] var1 = this.id_class;
         var1[8] = 0.0F;
         var1[9] = 0.0F;
         var1[10] = 0;
         var1[11] = 0;
      }
   }

   private static void id_new() {
      id_break = new float[]{
         0.3F,
         0.2F,
         0.2F,
         255.0F,
         4.0F,
         5.0F,
         5.0F,
         5.0F,
         16.0F,
         255.0F,
         2.0F,
         0.5F,
         1.0F,
         1.0F,
         4.0F,
         4.0F,
         4.0F,
         4.0F,
         8.0F,
         8.0F,
         3.5F,
         8.0F,
         8.0F,
         7.0F,
         3.5F,
         10.0F,
         5.0F,
         5.0F,
         5.0F,
         5.0F,
         10.0F,
         5.0F,
         5.0F,
         5.0F,
         5.0F,
         0.0F,
         0.0F
      };
   }

   private static void id_package() {
      id_byte = new byte[]{100, 90, 4, 4, 9, 2, 2, 17, 7, 12, 8, 9, 10, 11};
   }

   private static void id_return() {
      id_protected = new boolean[]{false, true, false, true, false, false, false, false, true, true, false, false, false};
   }

   @Override
   public rruv_1 id_protected() {
      return new rruv_1(this.id_extends(), this.id_case(), (float)this.id_catch(), (float)this.id_break());
   }

   public Module id_private() {
      this.id_else();
      return (Module)this.id_class[1];
   }
}

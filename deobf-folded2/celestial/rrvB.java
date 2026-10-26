package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvB extends GuiComponent {
   private static byte[] id_break;
   private static float[] id_byte;
   private static boolean[] id_protected;
   private static short[] id_throws;
   public Object[] id_class;

   private static void id_int() {
      id_byte = new float[]{
         0.3F,
         255.0F,
         5.0F,
         5.0F,
         2.5F,
         2.5F,
         8.0F,
         1.0F,
         1.0F,
         6.0F,
         6.0F,
         6.0F,
         6.0F,
         14.0F,
         13.0F,
         11.0F,
         10.0F,
         3.0F,
         3.0F,
         3.0F,
         3.0F,
         5.5F,
         9.0F,
         5.0F,
         18.0F,
         0.0F,
         0.0F
      };
   }

   public rrvB(rrZf_1 var1, rrvP var2, Supplier<Float> var3, Supplier<Float> var4, int var5, int var6) {
      this.id_volatile();
      AnimValue var11 = new AnimValue(0.3F, false);
      this.id_class[2] = var11;
      this.id_class[0] = var1;
      this.id_class[1] = var2;
      this.id_class[3] = var3;
      this.id_class[4] = var4;
      Integer var16 = var5;
      this.id_class[7] = var16;
      Integer var17 = var6;
      this.id_class[8] = var17;
   }

   static {
      ntfClinit();
   }

   private void id_class(Ml_1 var1, float var2, float var3, int var4) {
      this.id_volatile();
      String var5 = "#" + Integer.toHexString(((rrvP)this.id_class[1]).id_class());
      String var6 = "#" + Integer.toHexString(((rrvP)this.id_class[1]).id_break());
      ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0])
         .id_implements()
         .id_class(var1, var5 + "\n" + var6, (double)(var2 + 5.0F), (double)(var3 + 18.0F), ColorHelper.id_break(rrZF.d_, var4), false, false);
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.id_volatile();
      if (var4 == 0 && super.id_class(var1, var2, var3, var4, var5)) {
         ((ThemeManager)ThemeManager.staticFieldsc3c8b26240a53959b0b3ce0fbbe0f311[0]).id_class((rrvP)this.id_class[1]);
         return true;
      } else {
         return id_protected[3];
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-55, 59, -22, -78, 39, 24, 108, 121}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4054386035585881662L;
   }

   private void id_class(Ml_1 var1, float var2, float var3, int var4, int var5, int var6) {
      this.id_volatile();
      float var7 = var2 + (float)var4 - 14.0F;
      float var8 = var3 + (float)var5 - 13.0F;
      rrfD_2.id_class(var1, var7, var8, 11.0F, 10.0F, 3.0F, 3.0F, 3.0F, 3.0F, ColorHelper.id_break(rrZF.d_, var6));
      ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0])
         .id_native()
         .id_byte(
            var1, String.valueOf(((rrvP)this.id_class[1]).ordinal() + 1), var7 + 5.5F, var3 + (float)var5 - 9.0F, ColorHelper.id_break(rrZF.n_, var6), false
         );
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, rruv_1 var5, boolean var6, boolean var7) {
      this.id_volatile();
      super.id_class(var1, var2, var3, var4, var5, var6, var7);
      float var8 = this.id_private();
      float var9 = this.id_catch();
      int var10 = this.id_case();
      int var11 = this.id_extends();
      if (!((rrZf_1)this.id_class[0]).id_extends().id_volatile().id_long()) {
         ((AnimValue)this.id_class[2])
            .id_class(((rrvP)this.id_class[1]).equals(((ThemeManager)ThemeManager.staticFieldsc3c8b26240a53959b0b3ce0fbbe0f311[0]).id_break()));
      }

      int var12 = (int)(id_byte[1] * ((rrZf_1)this.id_class[0]).id_implements().id_class().id_byte());
      this.id_break(var1, var8, var9, var10, var11, var12);
      ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0])
         .id_native()
         .id_protected(var1, ((rrvP)this.id_class[1]).id_byte(), var8 + 5.0F, var9 + 5.0F, ColorHelper.id_break(rrZF.d_, var12), false);
   }

   @Override
   public rrZN id_class() {
      this.id_volatile();
      return (rrZf_1)this.id_class[0];
   }

   public void id_class(float var1, float var2) {
      this.id_volatile();
      Float var7 = var1;
      this.id_class[5] = var7;
      Float var8 = var2;
      this.id_class[6] = var8;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1686906395;
   }

   public rrvP id_break() {
      this.id_volatile();
      return (rrvP)this.id_class[1];
   }

   private void id_break(Ml_1 var1, float var2, float var3, int var4, int var5, int var6) {
      this.id_volatile();
      MT.id_throws();
      MT.id_package();
      int var7 = ((rrvP)this.id_class[1]).id_class();
      int var8 = ((rrvP)this.id_class[1]).id_class();
      int var9 = ((rrvP)this.id_class[1]).id_break();
      int var10 = ((rrvP)this.id_class[1]).id_break();
      int var11 = (int)((float)var6 * ((AnimValue)this.id_class[2]).id_byte());
      if (var11 > 0) {
         int var12 = ColorHelper.id_break(var7, var11);
         int var13 = ColorHelper.id_break(var8, var11);
         int var14 = ColorHelper.id_break(var9, var11);
         int var15 = ColorHelper.id_break(var10, var11);
         rrfD_2.id_class(var1, var2 - 2.5F, var3 - 2.5F, (float)(var4 + 5), (float)(var5 + 5), 8.0F, 1.0F, 1.0F, var12, var13, var14, var15);
      }

      rrfD_2.id_break(
         var1,
         var2,
         var3,
         (float)var4,
         (float)var5,
         6.0F,
         6.0F,
         6.0F,
         6.0F,
         ColorHelper.id_break(var7, var6),
         ColorHelper.id_break(var9, var6),
         ColorHelper.id_break(var8, var6),
         ColorHelper.id_break(var10, var6)
      );
      this.id_class(var1, var2, var3, var6);
      this.id_class(var1, var2, var3, var4, var5, var6);
      MT.id_final();
      MT.id_protected();
   }

   public float id_catch() {
      this.id_volatile();
      return (Float)((Supplier)this.id_class[4]).get() + (Float)this.id_class[6];
   }

   public int id_extends() {
      this.id_volatile();
      return (Integer)this.id_class[8];
   }

   public int id_case() {
      this.id_volatile();
      return (Integer)this.id_class[7];
   }

   private static void id_new() {
      id_throws = new short[]{2, 0, 1, 3, 4, 7, 8, 0, 2, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 2, 0, 1, 1, 1, 0, 0, 1, 3, 5, 4, 6, 7, 8, 5, 6};
   }

   private static void id_package() {
      id_protected = new boolean[]{false, false, true, false, true, false, false, false, false, false};
   }

   @Override
   public rruv_1 id_protected() {
      return new rruv_1(this.id_private(), this.id_catch(), (float)this.id_case(), (float)this.id_extends());
   }

   public float id_private() {
      this.id_volatile();
      return (Float)((Supplier)this.id_class[3]).get() + (Float)this.id_class[5];
   }

   private void id_volatile() {
      if (this.id_class == null) {
         this.id_class = new Object[9];
         Object[] var1 = this.id_class;
         var1[5] = 0.0F;
         var1[6] = 0.0F;
         var1[7] = 0;
         var1[8] = 0;
      }
   }

   private static void id_native() {
      id_break = new byte[]{5, 5, 9, 5, 6, 7, 8};
   }
}

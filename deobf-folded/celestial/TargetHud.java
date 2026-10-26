package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class TargetHud extends rrvj_1 {
   private static byte[] id_native;
   public Object[] id_byte;
   private static short[] id_volatile;
   private static float[] id_final;
   private static boolean[] id_package;
   private static String[] id_int;
   public static Object[] id_protected;

   public TargetHud() {
      super(id_int[0], () -> 100.0F, () -> 33.0F);
      this.s();
      rrFC var5 = new rrFC();
      this.id_byte[id_volatile[0]] = var5;
      rrFA var6 = new rrFA();
      this.id_byte[1] = var6;
      AnimValue var7 = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_volatile[2]], 0.4F, id_package[0]);
      this.id_byte[2] = var7;
      AnimValue var8 = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_volatile[4]], 0.4F, id_package[1]);
      this.id_byte[3] = var8;
   }

   static {
      ntfClinit();
   }

   private static void B() {
      id_final = new float[]{
         0.4F,
         0.4F,
         10.0F,
         0.0F,
         8.0F,
         4.0F,
         255.0F,
         0.0F,
         255.0F,
         0.0F,
         90.0F,
         270.0F,
         180.0F,
         4.0F,
         5.0F,
         5.0F,
         9.0F,
         33.0F,
         2.0F,
         2.5F,
         2.5F,
         20.0F,
         5.0F,
         1.0F,
         5.0F,
         2.0F,
         2.0F,
         2.0F,
         2.0F,
         1.0F,
         2.0F,
         1.0F,
         10.0F,
         2.0F,
         4.0F,
         4.0F,
         2.0F,
         2.0F,
         0.0F,
         1.0F,
         5.0F,
         2.0F,
         2.0F,
         0.5F,
         2.0F,
         11.0F,
         0.0F,
         33.0F,
         100.0F,
         100.0F,
         33.0F,
         4.0F,
         2.5F
      };
   }

   private static void S() {
      id_package = new boolean[]{false, false, false, true, false, false, false, true, false, true, false, false, true};
   }

   private void s() {
      if (this.id_byte == null) {
         this.id_byte = new Object[5];
         Object[] var1 = this.id_byte;
      }
   }

   private static void h() {
      id_int = new String[]{new String("Target HUD"), new String("HP: Неизвестно"), new String("HP: "), new String(" + "), new String(" AB")};
   }

   private void id_class(Ml_1 var1, iB_2 var2, float var3, float var4, float var5, int var6) {
      boolean var7 = (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2] ? true : id_package[4];
      StreamerMode var8 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_volatile[19]]).id_private().id_throws();
      String var9 = var8.id_break(var2.id_extends());
      ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_volatile[20]])
         .id_case()
         .id_class(var1, var9, var3, var4, var6, var5 * 0.5F + 2.0F);
      ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_volatile[21]])
         .id_native()
         .id_break(var1, this.id_class(var2, var7), (double)var3, (double)(var4 + 11.0F), var6, id_package[5], id_package[6]);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1676626282;
   }

   @Override
   public boolean id_class() {
      return true;
   }

   private String id_class(iB_2 var1, boolean var2) {
      this.s();
      if (var2 && var1 != (cb_3)id_import.id_class[57] && var1.Pp()) {
         return id_int[1];
      } else {
         StringBuilder var3 = new StringBuilder(id_int[2]).append(rql_3.id_class(((AnimValue)this.id_byte[2]).id_byte()));
         if (var1.Sd() > id_final[46] && !var2) {
            var3.append(rgF_2.GRAY).append(id_int[3]).append(rgF_2.YELLOW).append(rql_3.id_class(((AnimValue)this.id_byte[3]).id_byte())).append(id_int[4]);
         }

         return var3.toString();
      }
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      this.s();
      super.id_class(var1, var2, var3, var4, var5);
      iB_2 var6 = this.id_while();
      iB_2 var7 = var6 != null ? var6 : (iB_2)this.id_byte[4];
      if (var7 != null) {
         ((rrFA)this.id_byte[1]).id_class(var7);
         ((AnimValue)this.id_byte[2]).id_break(var7.u_());
         ((AnimValue)this.id_byte[3]).id_break(var7.Sd());
         float var8 = this.id_long();
         float var9 = this.id_default() + this.id_implements();
         float var10 = this.id_abstract() - 8.0F - 4.0F;
         ((rrFA)this.id_byte[1]).id_class(var1, var9, var10, var8);
         this.id_class(var1, var7);
      }
   }

   private void id_class(Ml_1 var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8, int var9, int var10) {
      rrfD_2.id_class(var1, var2, var3, var4 - 1.0F, 5.0F, 2.0F, 2.0F, 2.0F, 2.0F, ColorHelper.id_class(35, var10));
      if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_volatile[16]]).id_private().w().id_goto()) {
         rrfD_2.id_class(var1, var2 - 1.0F, var3 - 2.0F, var5 + 1.0F, 10.0F, 2.0F, 4.0F, var6, var7, var8, var9);
      }

      float var11 = !(var5 < 4.0F) && !(var5 > var4 - 2.0F) ? id_final[38] : 2.0F;
      rrfD_2.id_break(var1, var2, var3, var5 - 1.0F, 5.0F, 2.0F, var11, var11, 2.0F, var6, var7, var8, var9);
   }

   private void id_class(Ml_1 var1, iB_2 var2) {
      this.s();
      float var3 = this.id_default();
      float var4 = this.id_abstract();
      float var5 = this.id_implements();
      float var6 = this.id_long();
      int var7 = (int)rfU_2.id_class(255.0F * var6, id_final[7], 255.0F);
      int var8 = Math.min(var7, 225);
      int var9 = ColorHelper.id_break(rrZF.d_, var7);
      int var10 = ColorHelper.id_class(id_final[9], var8);
      int var11 = ColorHelper.id_class(90.0F, var8);
      int var12 = ColorHelper.id_class(270.0F, var8);
      int var13 = ColorHelper.id_class(180.0F, var8);
      byte var14 = 28;
      float var15 = var3 + (float)var14 + 4.0F;
      float var16 = var4 + 5.0F;
      float var17 = var3 + (float)var14 + 5.0F;
      float var18 = var5 - (float)var14 - 9.0F;
      float var19 = var2.SK();
      float var20 = Math.min(((AnimValue)this.id_byte[2]).id_byte(), var19) / var19 * var18;
      rrfD_2.id_class(var1, var3, var4, var5, 33.0F, var8, var10, var11, var12, var13, id_package[2]);
      this.id_class(var1, var2, var15, var16, var5, var9);
      ((rrFC)this.id_byte[id_volatile[14]])
         .id_class(var1, var2, var3 + 2.0F, var4 + 2.5F, var14, var14, 2.5F, (float)((Integer)var2.id_private[10]).intValue() / 20.0F, (float)var7);
      this.id_class(var1, var17, var4 + (float)var14 - 5.0F, var18, var20, var10, var11, var12, var13, var7);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6168359818072550387L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{99, 59, -93, 1, -125, -128, 9, -126}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void M() {
      id_volatile = new short[]{0, 1, 0, 2, 0, 3, 1, 4, 1, 2, 3, 1, 225, 2, 0, 10, 0, 1, 2, 0, 0, 0, 57, 2, 3, 73, 57, 4, 0, 4, 1};
   }

   private static void G() {
      id_native = new byte[]{28, 35, 5, 7, 2, 3, 5, 4, 2, 5, 6, 5};
   }

   @Override
   public boolean id_package() {
      return this.id_while() != null ? true : id_package[8];
   }

   public iB_2 id_while() {
      this.s();
      if ((vm_3)id_import.id_class[73] instanceof FP) {
         cb_3 var9;
         cb_3 var10000 = var9 = (cb_3)id_import.id_class[57];
         this.id_byte[4] = var9;
         return var10000;
      } else {
         rrvT var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_volatile[28]]).id_private();
         AttackAura var2 = var1.E();
         TriggerBot var3 = var1.id_long();
         iB_2 var4 = var2.id_native();
         if (var4 == null) {
            var4 = var3.id_native();
         }

         if (var4 != null) {
            this.id_byte[4] = var4;
         }

         return var4;
      }
   }

   @Override
   public boolean id_protected() {
      return id_package[10];
   }

   private static void E() {
      Object[] var0 = new Object[]{0.0F, 0.0F, 0.0F, 5, 2, 0.0F, 5};
      id_protected = var0;
   }

   @Override
   public void ar_() {
      this.s();
      super.ar_();
      ((rrFA)this.id_byte[1]).id_break();
   }

   @Override
   public float au_() {
      this.s();
      return ((rrFA)this.id_byte[1]).id_class() ? 10.0F : id_final[3];
   }
}

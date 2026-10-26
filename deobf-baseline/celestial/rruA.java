package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruA extends rruu_1 {
   private static short[] id_byte;
   private static boolean[] id_protected;
   private static int[] id_throws;
   private static byte[] id_case;
   private static float[] id_catch;
   public Object[] id_break;

   private int id_byte(boolean var1) {
      return var1 ? id_case[1] : id_case[2];
   }

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{76, -109, -64, -79, -18, -62, -32, 46}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Supplier<Float> id_int() {
      this.id_synchronized();
      return (Supplier<Float>)this.id_break[id_byte[16]];
   }

   public rruA(Supplier<Boolean> var1, Supplier<rjK_2> var2, Supplier<rjK_2> var3) {
      this.id_synchronized();
      AnimValue var8 = new AnimValue(id_catch[0], id_protected[0]);
      this.id_break[id_byte[0]] = var8;
      Supplier var9 = () -> id_catch[15];
      this.id_break[id_byte[1]] = var9;
      this.id_break[id_byte[2]] = var1;
      this.id_break[id_byte[3]] = var2;
      this.id_break[id_byte[4]] = var3;
      ((AnimValue)this.id_break[id_byte[5]]).id_class((float)this.id_byte((Boolean)((Supplier)this.id_break[id_byte[6]]).get()));
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_catch = new float[]{0.6F, 255.0F, 0.0F, 90.0F, 270.0F, 180.0F, 3.5F, 3.5F, 3.5F, 3.5F, 5.0F, 2.0F, 7.5F, 1.5F, 1.5F, 1.0F};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2022885300;
   }

   @Override
   public Supplier<rjK_2> id_class() {
      this.id_synchronized();
      return (Supplier<rjK_2>)this.id_break[id_byte[12]];
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      this.id_synchronized();
      super.id_class(var1, var2, var3, var4, var5);
      rruv_1 var6 = this.id_catch();
      float var7 = var6.id_break();
      float var8 = var6.id_protected();
      float var9 = var6.id_byte();
      float var10 = var6.id_class();
      boolean var11 = (Boolean)((Supplier)this.id_break[id_byte[8]]).get();
      int var12 = (int)(id_catch[1] * (Float)((Supplier)this.id_break[id_byte[9]]).get());
      int var13 = ColorHelper.id_break(id_throws[0], var12);
      int var14 = var11 ? ColorHelper.id_break(ColorHelper.id_class(id_catch[2]), var12) : var13;
      int var15 = var11 ? ColorHelper.id_break(ColorHelper.id_class(id_catch[3]), var12) : var13;
      int var16 = var11 ? ColorHelper.id_break(ColorHelper.id_class(id_catch[4]), var12) : var13;
      int var17 = var11 ? ColorHelper.id_break(ColorHelper.id_class(id_catch[5]), var12) : var13;
      int var18 = this.id_byte(var11);
      ((AnimValue)this.id_break[id_byte[10]]).id_break((float)var18);
      float var19 = ((AnimValue)this.id_break[id_byte[11]]).id_byte();
      if (ClickGuiTheme.id_class()) {
         rrfD_2.id_class(var1, var7, var8, var9, var10, id_case[0], var14);
      }

      rrfD_2.id_break(var1, var7, var8, var9, var10, id_catch[6], id_catch[7], id_catch[8], id_catch[9], var14, var15, var16, var17);
      rrfD_2.id_class(
         var1,
         (double)(var7 + var9 - id_catch[10] - var19),
         (double)(var8 + var10 / id_catch[11]),
         id_catch[12],
         ColorHelper.id_break(rrZF.d_, var12),
         rrvk_1.id_class()
      );
   }

   public rruA id_class(Supplier<Float> var1) {
      this.id_synchronized();
      this.id_break[id_byte[7]] = var1;
      return this;
   }

   @Override
   public rruv_1 id_break() {
      return super.id_break().id_class(id_catch[13], id_catch[14]);
   }

   private static long id_break(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5698141745170629122L;
   }

   @Override
   public Supplier<rjK_2> id_extends() {
      this.id_synchronized();
      return (Supplier<rjK_2>)this.id_break[id_byte[13]];
   }

   private static void id_continue() {
      id_throws = new int[]{6781311};
   }

   private static void id_else() {
      id_case = new byte[]{6, -1, 8, 5};
   }

   public AnimValue id_new() {
      this.id_synchronized();
      return (AnimValue)this.id_break[id_byte[15]];
   }

   public Supplier<Boolean> id_package() {
      this.id_synchronized();
      return (Supplier<Boolean>)this.id_break[id_byte[14]];
   }

   private static void id_super() {
      id_byte = new short[]{3, 4, 0, 1, 2, 3, 0, 4, 0, 4, 3, 3, 1, 2, 0, 3, 4};
   }

   private static void id_public() {
      id_protected = new boolean[1];
   }

   private void id_synchronized() {
      if (this.id_break == null) {
         this.id_break = new Object[id_case[3]];
         Object[] var1 = this.id_break;
      }
   }
}

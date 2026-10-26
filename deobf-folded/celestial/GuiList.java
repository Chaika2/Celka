package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GuiList extends rrtw_3 {
   public Object[] id_throws;
   private static float[] id_native;
   private static double[] id_volatile;
   private static boolean[] id_final;
   private static byte[] id_package;
   private static short[] id_int;
   private static String[] id_new;

   private static void id_char() {
      id_package = new byte[]{6, 2};
   }

   private static void id_long() {
      id_final = new boolean[]{false, false, true, false, false, true, true, false, true, false, true};
   }

   public GuiList(rrtN_2 var1, rrIc_1 var2, float var3, float var4, float var5, float var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.id_instanceof();
      ArrayList var13 = new ArrayList();
      this.id_throws[id_int[0]] = var13;

      for (rrIk_1 var8 : var2.id_class()) {
         ((List)this.id_throws[id_int[1]]).add(new rrwB_2(var8));
      }
   }

   static {
      ntfClinit();
   }

   private static void id_interface() {
      id_new = new String[]{new String("Нету :(")};
   }

   @Override
   public void id_class(Ml_1 var1, rrtI_2 var2, int var3, int var4) {
      this.id_instanceof();
      float var5 = var2.id_break();
      float var6 = var2.id_byte();
      float var7 = var2.id_throws();
      float var8 = var2.id_class();
      AnimValue var9 = this.id_return();
      float var10 = var9.id_byte();
      int var11 = (int)(255.0F * var10);
      id_class(var1, this, var5, var6, var7, var8);
      rrtF_2.id_class(var1, this, var5 + var7 - 4.0F, var6 + 4.5F, 1.0F, 180.0F + var10 * 180.0F, rrZF.d_, 255);
      float var12 = 10.0F * var10 + 3.0F;

      for (rrwB_2 var14 : this.id_while()) {
         float var15 = var5 + 2.0F;
         float var16 = var6 + var12;
         var14.id_throws().id_class(var14.id_case().id_private());
         var14.id_break().id_class(var14.id_protected());
         float var17 = var14.id_throws().id_byte();
         float var18 = var14.id_break().id_byte();
         if (this.id_return().id_case()) {
            int var19 = ColorHelper.id_class(rrZF.n_, rrZF.d_, var18);
            rrZO var20 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_int[3]]).id_finally();
            var14.id_class(new rruv_1(var5, var16 - 3.0F, var7, (float)(var20.id_class() + 6)));
            rrtF_2.id_protected(var1, this, var20, var14.id_byte(), var15, var16, var19, (int)((float)var11 * var10 * var17));
            var12 += 10.0F * var10 * var17;
            Float var25 = var12;
            this.id_throws[1] = var25;
         }
      }

      this.id_class(var1, var5, var6);
   }

   @Override
   public boolean id_class(rrtu_3 var1, rrtI_2 var2, float var3, float var4, int var5, int var6, int var7) {
      if (!this.id_return().id_case()) {
         return id_final[1];
      } else {
         for (rrwB_2 var9 : this.id_while()) {
            if (var7 == 0 && var9.id_class().id_break((float)var5, (float)var6)) {
               var9.id_case().id_class(Boolean.valueOf(!var9.id_protected() ? true : id_final[3]), id_final[4], true);
               return true;
            }
         }

         return id_final[7];
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6734756814618968853L;
   }

   private void id_class(Ml_1 var1, float var2, float var3) {
      List var4 = this.id_while()
         .stream()
         .filter(rrwB_2::id_protected)
         .map(rrwB_2::id_case)
         .sorted(
            Comparator.comparingInt(
               var0 -> -((int)((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_int[11]]).id_finally().id_break(var0.id_throws()))
            )
         )
         .toList();
      String var5;
      if (var4.isEmpty()) {
         var5 = id_new[0];
      } else {
         var5 = ((rrIk_1)var4.get(id_final[0])).id_throws();
      }

      rrtF_2.id_class(
         var1,
         ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_int[5]]).id_finally(),
         var5,
         var2 + 2.0F,
         var3 + 3.0F,
         rrZF.d_,
         this.id_class(255)
      );
   }

   @Override
   public float id_class(float var1, float var2) {
      this.id_instanceof();
      return (Float)this.id_throws[1] - 2.0F;
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 822310323;
   }

   private void id_instanceof() {
      if (this.id_throws == null) {
         this.id_throws = new Object[2];
         Object[] var1 = this.id_throws;
         var1[1] = id_native[14];
      }
   }

   private static void id_throw() {
      id_int = new short[]{0, 0, 255, 0, 1, 0, 255, 0, 0, 0, 1, 0};
   }

   private static void id_try() {
      id_volatile = new double[]{0.0, 10.0};
   }

   public List<rrwB_2> id_while() {
      this.id_instanceof();
      return ((List)this.id_throws[id_int[9]])
         .stream()
         .filter(var0 -> !var0.id_case().id_private() && !var0.id_throws().id_case() ? id_final[9] : true)
         .toList();
   }

   @Override
   public float id_public() {
      this.id_instanceof();
      rrZO var1 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_int[7]]).id_finally();
      return (float)(
         ((List)this.id_throws[id_int[8]]).stream().mapToDouble(var1x -> (double)var1.id_break(var1x.id_byte())).max().orElse(id_volatile[0]) + 10.0
      );
   }

   @Override
   public List<? extends rrtn_3> id_protected() {
      return this.id_while();
   }

   public static String id_protected(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-105, 77, -84, -64, 24, -57, 127, -125}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_abstract() {
      id_native = new float[]{255.0F, 4.0F, 4.5F, 1.0F, 180.0F, 180.0F, 10.0F, 3.0F, 2.0F, 3.0F, 10.0F, 2.0F, 3.0F, 2.0F, 0.0F};
   }
}

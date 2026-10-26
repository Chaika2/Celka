package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GuiList extends rrtw_3 {
   public Object[] throws_;
   private static float[] native_;
   private static double[] volatile_;
   private static boolean[] final_;
   private static byte[] package_;
   private static short[] int_;
   private static String[] new_;

   private static void char_() {
      package_ = new byte[]{6, 2};
   }

   private static void long_() {
      final_ = new boolean[]{false, false, true, false, false, true, true, false, true, false, true};
   }

   public GuiList(rrtN_2 var1, rrIc_1 var2, float var3, float var4, float var5, float var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.instanceof_();
      ArrayList var13 = new ArrayList();
      this.throws_[0] = var13;

      for (rrIk_1 var8 : var2.class_()) {
         ((List)this.throws_[0]).add(new rrwB_2(var8));
      }
   }

   static {
      ntfClinit();
   }

   private static void interface_() {
      new_ = new String[]{new String("Нету :(")};
   }

   @Override
   public void class_(Ml_1 var1, rrtI_2 var2, int var3, int var4) {
      this.instanceof_();
      float var5 = var2.break_();
      float var6 = var2.byte_();
      float var7 = var2.throws_();
      float var8 = var2.class_();
      AnimValue var9 = this.return_();
      float var10 = var9.byte_();
      int var11 = (int)(255.0F * var10);
      class_(var1, this, var5, var6, var7, var8);
      rrtF_2.class_(var1, this, var5 + var7 - 4.0F, var6 + 4.5F, 1.0F, 180.0F + var10 * 180.0F, rrZF.d_, 255);
      float var12 = 10.0F * var10 + 3.0F;

      for (rrwB_2 var14 : this.while_()) {
         float var15 = var5 + 2.0F;
         float var16 = var6 + var12;
         var14.throws_().class_(var14.case_().private_());
         var14.break_().class_(var14.protected_());
         float var17 = var14.throws_().byte_();
         float var18 = var14.break_().byte_();
         if (this.return_().case_()) {
            int var19 = ColorHelper.class_(rrZF.n_, rrZF.d_, var18);
            rrZO var20 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).finally_();
            var14.class_(new rruv_1(var5, var16 - 3.0F, var7, (float)(var20.class_() + 6)));
            rrtF_2.protected_(var1, this, var20, var14.byte_(), var15, var16, var19, (int)((float)var11 * var10 * var17));
            var12 += 10.0F * var10 * var17;
            Float var25 = var12;
            this.throws_[1] = var25;
         }
      }

      this.class_(var1, var5, var6);
   }

   @Override
   public boolean class_(rrtu_3 var1, rrtI_2 var2, float var3, float var4, int var5, int var6, int var7) {
      if (!this.return_().case_()) {
         return false;
      } else {
         for (rrwB_2 var9 : this.while_()) {
            if (var7 == 0 && var9.class_().break_((float)var5, (float)var6)) {
               var9.case_().class_(Boolean.valueOf(!var9.protected_() ? true : final_[3]), false, true);
               return true;
            }
         }

         return final_[7];
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6734756814618968853L;
   }

   private void class_(Ml_1 var1, float var2, float var3) {
      List var4 = this.while_()
         .stream()
         .filter(rrwB_2::protected_)
         .map(rrwB_2::case_)
         .sorted(
            Comparator.comparingInt(
               var0 -> -((int)((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).finally_().break_(var0.throws_()))
            )
         )
         .toList();
      String var5;
      if (var4.isEmpty()) {
         var5 = "Нету :(";
      } else {
         var5 = ((rrIk_1)var4.get(0)).throws_();
      }

      rrtF_2.class_(
         var1, ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).finally_(), var5, var2 + 2.0F, var3 + 3.0F, rrZF.d_, this.class_(255)
      );
   }

   @Override
   public float class_(float var1, float var2) {
      this.instanceof_();
      return (Float)this.throws_[1] - 2.0F;
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 822310323;
   }

   private void instanceof_() {
      if (this.throws_ == null) {
         this.throws_ = new Object[2];
         Object[] var1 = this.throws_;
         var1[1] = 0.0F;
      }
   }

   private static void throw_() {
      int_ = new short[]{0, 0, 255, 0, 1, 0, 255, 0, 0, 0, 1, 0};
   }

   private static void try_() {
      volatile_ = new double[]{0.0, 10.0};
   }

   public List<rrwB_2> while_() {
      this.instanceof_();
      return ((List)this.throws_[0]).stream().filter(var0 -> !var0.case_().private_() && !var0.throws_().case_() ? final_[9] : final_[8]).toList();
   }

   @Override
   public float public_() {
      this.instanceof_();
      rrZO var1 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).finally_();
      return (float)(((List)this.throws_[0]).stream().mapToDouble(var1x -> (double)var1.break_(var1x.byte_())).max().orElse(0.0) + 10.0);
   }

   @Override
   public List<? extends rrtn_3> protected_() {
      return this.while_();
   }

   public static String protected_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-105, 77, -84, -64, 24, -57, 127, -125}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void abstract_() {
      native_ = new float[]{255.0F, 4.0F, 4.5F, 1.0F, 180.0F, 180.0F, 10.0F, 3.0F, 2.0F, 3.0F, 10.0F, 2.0F, 3.0F, 2.0F, 0.0F};
   }
}

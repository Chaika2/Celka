package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtj_3 extends rrtt_3 {
   private static short[] throws_;
   public Object[] protected_;
   private static float[] native_;
   private static byte[] volatile_;
   private static boolean[] final_;
   private static int[] package_;

   private static void char_() {
      final_ = new boolean[]{false, true, false, false, true, true, false, true, false, true};
   }

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{12, 1, -70, 85, -75, -63, -94, 89}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrtj_3(rrtN_2 var1, rrIc_1 var2, float var3, float var4, float var5, float var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.interface_();
      ArrayList var13 = new ArrayList();
      this.protected_[0] = var13;

      for (rrIk_1 var8 : var2.class_()) {
         ((List)this.protected_[0]).add(new rrwP_2(var8));
      }

      Float var14 = var6;
      this.protected_[1] = var14;
   }

   static {
      ntfClinit();
   }

   private void interface_() {
      if (this.protected_ == null) {
         this.protected_ = new Object[2];
         Object[] var1 = this.protected_;
         var1[1] = 0.0F;
      }
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      if (!super.class_(var1, var2, var3, var4, var5)) {
         return false;
      } else {
         for (rrwP_2 var7 : this.goto_()) {
            if (var4 == 0 && var7.class_().break_((float)var2, (float)var3)) {
               var7.case_().class_(Boolean.valueOf(!var7.protected_() ? true : final_[2]), false, true);
               return true;
            }
         }

         return final_[6];
      }
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4) {
      super.class_(var1, var2, var3, var4);
      this.private_().interface_().class_(var1, () -> this.class_(var1));
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2547471126011272116L;
   }

   private void class_(Ml_1 var1) {
      this.interface_();
      rrZO var2 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).finally_();
      float var3 = this.package_();
      float var4 = this.final_();
      float var5 = this.new_();
      float var6 = var3;
      float var7 = var4 + 10.0F;
      byte var8 = 5;
      byte var9 = 10;
      rrtF_2.protected_(var1, this, var2, this.finally_().throws_(), var3, var4, rrZF.k_, 255);
      float var10 = 0.0F;

      for (rrwP_2 var12 : this.goto_()) {
         rrIk_1 var13 = var12.case_();
         float var14 = var2.break_(var13.throws_());
         float var15 = (float)var2.class_();
         if (var6 + var14 > var3 + var5) {
            var6 = var3;
            var7 += (float)var9;
         }

         var12.class_(new rruv_1(var6, var7, var14, var15).class_(1.0F, 1.0F));
         rruv_1 var16 = var12.class_();
         rrtF_2.protected_(var1, this, var2, var13.throws_(), var6, var7, var13.class_() ? -16711936 : package_[1], throws_[5]);
         var6 += var14 + (float)var8;
         var10 = Math.max(var10, var16.protected_() + var15 - var4);
      }

      Float var21 = var10 + 15.0F;
      this.protected_[1] = var21;
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1138959986;
   }

   private List<rrwP_2> goto_() {
      this.interface_();
      return ((List)this.protected_[0]).stream().filter(var0 -> !var0.case_().private_() && !var0.throws_().case_() ? final_[8] : final_[7]).toList();
   }

   @Override
   public float continue_() {
      this.interface_();
      return (Float)this.protected_[1];
   }

   private static void instanceof_() {
      throws_ = new short[]{0, 0, 1, 0, 255, 255, 1, 1, 0, 0, 0, 1};
   }

   public List<rrwP_2> return_() {
      this.interface_();
      return (List<rrwP_2>)this.protected_[0];
   }

   private static void throw_() {
      volatile_ = new byte[]{5, 10, 2};
   }

   private static void try_() {
      native_ = new float[]{10.0F, 0.0F, 1.0F, 1.0F, 15.0F, 0.0F};
   }

   private static void while_() {
      package_ = new int[]{-16711936, -65536};
   }

   public float public_() {
      this.interface_();
      return (Float)this.protected_[1];
   }

   @Override
   public List<? extends rrtn_3> protected_() {
      this.interface_();
      return (List<? extends rrtn_3>)this.protected_[0];
   }
}

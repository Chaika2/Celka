package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtV_2 extends rrtw_3 {
   private static float[] native_;
   private static boolean[] volatile_;
   private static byte[] final_;
   private static short[] package_;
   private static double[] int_;
   private static String[] new_;
   public Object[] throws_;

   private static void char_() {
      int_ = new double[]{0.0, 10.0};
   }

   public rrtV_2(rrtN_2 var1, rrIQ var2, float var3, float var4, float var5, float var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.try_();
      ArrayList var13 = new ArrayList();
      this.throws_[1] = var13;
      this.throws_[0] = var2;

      for (String var8 : ((rrIQ)this.throws_[0]).class_()) {
         ((List)this.throws_[1]).add(new rrwS_2((rrIQ)this.throws_[0], var8));
      }

      ((rrIQ)this.throws_[0]).class_("swap_modes", (var1x, var2x) -> {
         this.try_();
         this.class_((List<rrwS_2>)this.throws_[1]);
      });
   }

   static {
      ntfClinit();
   }

   private static void interface_() {
      native_ = new float[]{255.0F, 4.0F, 4.5F, 1.0F, 180.0F, 180.0F, 3.0F, 2.0F, 3.0F, 10.0F};
   }

   @Override
   public boolean class_(rrtu_3 var1, rrtI_2 var2, float var3, float var4, int var5, int var6, int var7) {
      this.try_();
      if (!this.return_().case_()) {
         return false;
      } else {
         for (rrwS_2 var9 : (List)this.throws_[1]) {
            if (var7 == 0 && var9.class_().break_((float)var5, (float)var6) && !var9.break_()) {
               ((rrIQ)this.throws_[0]).class_(var9.byte_(), false);
               this.class_((List<rrwS_2>)this.throws_[1]);
               this.class_(false);
               return true;
            }
         }

         return volatile_[4];
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5898667359588185514L;
   }

   private void class_(List<rrwS_2> var1) {
      rrwS_2 var2 = null;

      for (rrwS_2 var4 : var1) {
         if (var4.break_()) {
            var2 = var4;
            break;
         }
      }

      Collections.swap(var1, 0, var1.indexOf(var2));
   }

   @Override
   public void class_(Ml_1 var1, rrtI_2 var2, int var3, int var4) {
      this.try_();
      float var5 = var2.break_();
      float var6 = var2.byte_();
      float var7 = var2.throws_();
      float var8 = var2.class_();
      AnimValue var9 = this.return_();
      float var10 = var9.byte_();
      int var11 = (int)(255.0F * var10);
      class_(var1, this, var5, var6, var7, var8);
      rrtF_2.class_(var1, this, var5 + var7 - 4.0F, var6 + 4.5F, 1.0F, 180.0F + var10 * 180.0F, rrZF.d_, 255);
      float var12 = 3.0F;

      for (rrwS_2 var14 : (List)this.throws_[1]) {
         float var15 = var5 + 2.0F;
         float var16 = var6 + var12;
         boolean var17 = var14.break_();
         if (var17 || var9.case_()) {
            rrZO var18 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).finally_();
            var14.class_(new rruv_1(var5, var16 - 3.0F, var7, (float)(var18.class_() + 6)));
            int var19 = var17 ? 255 : var11;
            rrtF_2.protected_(
               var1, this, ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).finally_(), var14.byte_(), var15, var16, rrZF.d_, var19
            );
            var12 += 10.0F * var10;
         }
      }
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -854956554;
   }

   private static void instanceof_() {
      volatile_ = new boolean[]{false, false, false, true, false, false};
   }

   private static void throw_() {
      package_ = new short[]{1, 0, 0, 1, 0, 0, 255, 1, 0, 255, 0, 1, 0, 1, 1, 1, 0, 1};
   }

   private void try_() {
      if (this.throws_ == null) {
         this.throws_ = new Object[2];
         Object[] var1 = this.throws_;
      }
   }

   private static void while_() {
      final_ = new byte[]{6, 2};
   }

   @Override
   public float public_() {
      this.try_();
      return (float)(
         ((List)this.throws_[1])
               .stream()
               .mapToDouble(var0 -> (double)((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).finally_().break_(var0.byte_()))
               .max()
               .orElse(0.0)
            + 10.0
      );
   }

   public static String protected_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-24, 43, 68, 30, 32, 27, 95, 31}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public List<? extends rrtn_3> protected_() {
      this.try_();
      return (List<? extends rrtn_3>)this.throws_[1];
   }

   private static void abstract_() {
      new_ = new String[]{new String("swap_modes")};
   }
}

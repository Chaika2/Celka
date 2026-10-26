package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFk_1 extends rrFl_1<rrFz_1> {
   private static String[] protected_;
   private static boolean[] throws_;
   public static Object[] class_;
   private static double[] case_;
   private static float[] catch_;
   private static byte[] private_;
   public Object[] break_;
   private static short[] implements_;

   @Override
   public Collection<rrFz_1> byte_() {
      this.final_();
      return (List)this.break_[1];
   }

   private static void int_() {
      case_ = new double[]{140.0};
   }

   public rrFk_1(rrFd_1 var1) {
      this.final_();
      ArrayList var6 = new ArrayList();
      this.break_[1] = var6;
      ArrayList var7 = new ArrayList();
      this.break_[2] = var7;
      rrFN var8 = new rrFN();
      this.break_[3] = var8;
      this.break_[0] = var1;
      ((List)this.break_[1]).add(new rrFc_1(this, "Preview Potion", "999", "**:**"));
   }

   static {
      ntfClinit();
   }

   public void class_(rrAN var1) {
      this.final_();
      rLR var2 = var1.class_();

      for (rrFz_1 var4 : (List)this.break_[1]) {
         if (var4 instanceof rrFQ var5 && var5.private_().class_().equals(var2)) {
            var4.class_(false);
            ((List)this.break_[2]).remove(var4);
            break;
         }
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{40, -71, 69, 58, -115, -36, 8, 64}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void class_(Ml_1 var1, float var2, float var3) {
      this.final_();
      float var4 = ((rrFd_1)this.break_[0]).long_();
      rrZO var5 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).class_();
      this.break_(18.0F);
      float var6 = this.finally_();
      float var7 = this.protected_();
      var5.class_(MinecraftAccessor.strictfp_);
      float var8 = (float)Math.sin((double)System.currentTimeMillis() / 140.0) * 0.5F + 0.5F;
      float var9 = 1.0F;

      for (rrFz_1 var11 : this.byte_()) {
         AnimValue var12 = var11.class_();
         if (var12.case_()) {
            float var13 = var12.byte_();
            float var14 = var12.continue_();
            if (var11 instanceof rrFQ var15) {
               rLY var16 = var15.private_();
               var9 = var16.break_() <= 200 ? var8 : catch_[4];
            }

            int var22 = ColorHelper.break_(rrZF.d_, (int)(255.0F * var9 * var13 * var4));
            float var23 = var7 * 0.8F * var14;
            float var17 = var2 + 3.0F;
            float var18 = var3 + var6 - var23;
            String var19 = var11.protected_();
            String var20 = var11.break_();
            var5.break_(var1, MinecraftAccessor.strictfp_, var19, (double)var17, (double)var18, var22, false, false);
            var5.break_(
               var1,
               MinecraftAccessor.strictfp_,
               var20,
               (double)(var17 + ((rrFd_1)this.break_[0]).implements_() - var5.break_(var20) - 5.0F),
               (double)var18,
               var22,
               false,
               false
            );
            float var21 = var7 * var13;
            var6 += var21;
            this.class_(var21);
         }
      }

      var5.byte_(MinecraftAccessor.strictfp_);
   }

   public void class_(rrFK var1) {
      this.final_();
      ((List)this.break_[1]).removeIf(var0 -> !var0.byte_() ? true : throws_[10]);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1938109630191114692L;
   }

   public float class_(rrFz_1 var1) {
      String var2 = var1.protected_() + var1.break_();
      return ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).class_().break_(var2) + 15.0F;
   }

   public void class_(rrLI var1) {
      this.final_();
      rLY var2 = var1.break_();
      rLR var3 = var2.class_();

      for (rrFz_1 var5 : (List)this.break_[1]) {
         if (var5 instanceof rrFQ var6 && var6.private_().class_().equals(var3)) {
            var6.class_(var2);
            break;
         }
      }
   }

   public List<rrFz_1> class_() {
      this.final_();
      return (List<rrFz_1>)this.break_[2];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2048181643;
   }

   public void class_(rrLC var1) {
      this.final_();
      rLY var2 = var1.break_();
      rrFQ var3 = new rrFQ(var2);
      ((List)this.break_[1]).remove(var3);
      ((List)this.break_[1]).add(var3);
      if (((List)this.break_[1]).size() > 1) {
         ((List)this.break_[1]).sort((Comparator)this.break_[3]);
      }
   }

   public rrFd_1 break_() {
      this.final_();
      return (rrFd_1)this.break_[0];
   }

   @Override
   public void throws_() {
      this.final_();
      super.throws_();
      Collection var1 = this.byte_();
      Boolean var11 = false;
      this.break_[4] = var11;
      ((List)this.break_[2]).clear();
      if (!var1.isEmpty()) {
         Iterator var2 = var1.iterator();

         while (var2.hasNext()) {
            rrFz_1 var3 = (rrFz_1)var2.next();
            AnimValue var4 = var3.class_();
            boolean var5 = var3.byte_();
            if (!var5 && var4.catch_()) {
               var2.remove();
            } else {
               if (var3 instanceof rrFQ) {
                  rrFQ var6 = (rrFQ)var3;
                  if ((cb_3)MinecraftAccessor.import_.class_[57] != null && !((cb_3)MinecraftAccessor.import_.class_[57]).break_(var6.private_().class_())) {
                     var6.class_(false);
                  }

                  var6.catch_();
               }

               if (var3.throws_()) {
                  ((List)this.break_[2]).add(var3);
                  if (!var5) {
                     Boolean var12 = true;
                     this.break_[4] = var12;
                  }
               }
            }
         }
      }
   }

   public void catch_() {
      this.final_();

      for (rrFz_1 var2 : (List)this.break_[1]) {
         var2.class_(var2.throws_());
      }
   }

   private static void extends_() {
      Object[] var0 = new Object[]{new rrFW()};
      class_ = var0;
   }

   public Comparator<rrFz_1> case_() {
      this.final_();
      return (Comparator<rrFz_1>)this.break_[3];
   }

   private static void continue_() {
      catch_ = new float[]{18.0F, 0.5F, 0.5F, 1.0F, 1.0F, 255.0F, 0.8F, 3.0F, 5.0F, 15.0F, 10.0F};
   }

   public List<rrFz_1> implements_() {
      this.final_();
      return (List<rrFz_1>)this.break_[1];
   }

   private static void new_() {
      protected_ = new String[]{new String("Preview Potion"), new String("999"), new String("**:**")};
   }

   private static void package_() {
      throws_ = new boolean[]{false, false, false, false, false, false, true, true, false, true, false, false, false, true};
   }

   @Override
   public float protected_() {
      return 10.0F;
   }

   public boolean private_() {
      this.final_();
      return (Boolean)this.break_[4];
   }

   private void final_() {
      if (this.break_ == null) {
         this.break_ = new Object[5];
         Object[] var1 = this.break_;
         var1[4] = false;
      }
   }

   private static void volatile_() {
      implements_ = new short[]{1, 2, 3, 0, 1, 0, 0, 200, 0, 1, 4, 2, 57, 57, 2, 4, 1, 1, 1, 1, 3, 1, 2, 1, 1, 1, 0, 2, 4, 0, 1, 3};
   }

   private static void native_() {
      private_ = new byte[]{5, 4};
   }
}

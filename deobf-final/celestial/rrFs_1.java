package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFs_1 extends rrFl_1<rrFE> {
   private static String[] break_;
   private static boolean[] protected_;
   private static short[] throws_;
   public Object[] class_;
   private static byte[] case_;
   private static float[] catch_;

   @Override
   public Collection<rrFE> byte_() {
      this.case_();
      return (List)this.class_[1];
   }

   public rrFs_1(rrFS var1) {
      this.case_();
      ArrayList var8 = new ArrayList();
      this.class_[1] = var8;
      ArrayList var9 = new ArrayList();
      this.class_[2] = var9;
      this.class_[0] = var1;

      for (Module var3 : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().g()) {
         ((List)this.class_[1]).add(new rrFG(var3));
      }

      ((List)this.class_[1]).add(new rrFb_1(this, "Preview Bind", "[Key]"));
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1852312837382707362L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 889938662;
   }

   public float class_(rrFE var1) {
      String var2 = var1.byte_() + var1.break_();
      return ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).class_().break_(var2) + 15.0F;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{86, -109, 35, 111, 12, -8, 14, -77}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void class_(Ml_1 var1, float var2, float var3) {
      this.case_();
      float var4 = ((rrFS)this.class_[0]).long_();
      rrZO var5 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).class_();
      this.break_(18.0F);
      float var6 = this.finally_();
      float var7 = this.protected_();
      var5.class_(MinecraftAccessor.strictfp_);

      for (rrFE var9 : this.byte_()) {
         AnimValue var10 = var9.class_();
         var9.class_(var9.throws_());
         if (var10.case_()) {
            float var11 = var10.byte_();
            float var12 = var10.continue_();
            float var13 = var7 * 0.8F * var12;
            float var14 = var2 + 3.0F;
            float var15 = var3 + var6 - var13;
            int var16 = ColorHelper.break_(rrZF.d_, (int)(255.0F * var11 * var4));
            String var17 = var9.byte_();
            String var18 = var9.break_();
            var5.break_(var1, MinecraftAccessor.strictfp_, var17, (double)var14, (double)var15, var16, false, false);
            var5.break_(
               var1,
               MinecraftAccessor.strictfp_,
               var18,
               (double)(var14 + ((rrFS)this.class_[0]).implements_() - var5.break_(var18) - 5.0F),
               (double)var15,
               var16,
               false,
               false
            );
            float var19 = var7 * var11;
            var6 += var19;
            this.class_(var19);
         }
      }

      var5.byte_(MinecraftAccessor.strictfp_);
   }

   public List<rrFE> class_() {
      this.case_();
      return (List<rrFE>)this.class_[2];
   }

   public boolean break_() {
      this.case_();
      return (Boolean)this.class_[3];
   }

   @Override
   public void throws_() {
      this.case_();
      super.throws_();
      Collection var1 = this.byte_();
      Boolean var8 = false;
      this.class_[3] = var8;
      ((List)this.class_[2]).clear();
      if (!var1.isEmpty()) {
         for (rrFE var3 : var1) {
            if (var3.throws_()) {
               ((List)this.class_[2]).add(var3);
               if (!var3.protected_()) {
                  Boolean var9 = true;
                  this.class_[3] = var9;
               }
            }
         }
      }
   }

   private static void catch_() {
      protected_ = new boolean[]{false, false, false, false, false, true, false};
   }

   private static void extends_() {
      case_ = new byte[]{4, 3};
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
         var1[3] = false;
      }
   }

   private static void implements_() {
      catch_ = new float[]{18.0F, 0.8F, 3.0F, 255.0F, 5.0F, 15.0F, 10.0F};
   }

   @Override
   public float protected_() {
      return 10.0F;
   }

   private static void private_() {
      throws_ = new short[]{1, 2, 0, 0, 1, 1, 0, 0, 0, 3, 2, 2, 3, 1, 0, 2, 3};
   }

   private static void native_() {
      break_ = new String[]{new String("Preview Bind"), new String("[Key]")};
   }
}

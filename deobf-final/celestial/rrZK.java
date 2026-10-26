package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZK extends rrZN implements rrZT, rrZq_1<GuiComponent> {
   private static double[] protected_;
   private static boolean[] throws_;
   public Object[] break_;
   private static short[] case_;
   private static float[] catch_;
   public static Object[] byte_;
   private static byte[] private_;

   @Override
   public void byte_(int var1, int var2, int var3) {
      super.byte_(var1, var2, var3);
      this.byte_().forEach(var3x -> var3x.break_(var1, var2, var3));
   }

   @Override
   public List<GuiComponent> byte_() {
      this.package_();
      rrtY_2 var1 = ((rrvJ)this.break_[1]).finally_().extends_();
      rrfq_3 var2 = ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).byte_();
      Predicate var3 = var2x -> {
         if (var2x instanceof rrZY var3x) {
            rrNd_1 var4 = var3x.break_();
            if (var2 != null && var4.finally_() != null && var4.finally_() != var2) {
               return false;
            } else if (var1.new_()) {
               return true;
            } else {
               String var5 = var4.case_();
               String var6 = var1.final_();
               return var5.toLowerCase().contains(var6.toLowerCase());
            }
         } else {
            return throws_[12];
         }
      };
      return ((List)this.break_[2]).stream().filter(var3).toList();
   }

   private static void int_() {
      Object[] var0 = new Object[]{15, 26, 32};
      byte_ = var0;
   }

   public rrZK(rrvJ var1, rrtu_3 var2, float var3, float var4) {
      this.package_();
      ArrayList var16 = new ArrayList();
      this.break_[2] = var16;
      rruL var17 = new rruL();
      this.break_[3] = var17;
      this.break_[1] = var1;
      Float var19 = var3;
      this.break_[0] = var19;
      rrZl_1 var20 = new rrZl_1(new rrZH(0.5F));
      this.break_[4] = var20;
      ClickGuiScreen var5 = var1.volatile_();
      Supplier var6 = () -> (float)var5.abstract_() + var3;
      Supplier var7 = () -> (float)var5.finally_() + var4;
      float var8 = 363.0F - var3 - 7.0F;
      float var9 = 26.0F;

      for (rrNd_1 var11 : ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).extends_()) {
         ((List)this.break_[2]).add(new rrZY(this, var11, var2, var5, var6, var7, var8, var9));
      }
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, double var4, boolean var6) {
      this.package_();
      ClickGuiScreen var7 = ((rrvJ)this.break_[1]).volatile_();
      int var8 = volatile_();
      int var9 = class_(var8);
      boolean var10 = this.class_(
         (Integer)rrvk_1.class_[0],
         (Integer)rrvk_1.class_[1],
         (float)var7.abstract_() + (Float)this.break_[0],
         (float)(var7.finally_() + var8),
         363.0F - (Float)this.break_[0] - 5.0F,
         (float)var9
      );
      ((rrZl_1)this.break_[4]).extends_().class_(var10 && super.class_(var1, var2, var3, var4, var6) ? true : throws_[7], var4, 25.0);
      this.byte_().forEach(var7x -> var7x.class_(var1, var2, var3, var4, var10, var6));
      return false;
   }

   @Override
   public void class_(Category var1, Category var2) {
      this.package_();
      super.class_(var1, var2);
      ((List)this.break_[2]).forEach(var2x -> var2x.class_(var1, var2));
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      super.class_(var1, var2, var3);
      return this.byte_().stream().anyMatch(var3x -> var3x.class_(var1, var2, var3));
   }

   @Override
   public boolean class_(Ml_1 var1, rrtu_3 var2, float var3, float var4, float var5, float var6, int var7, int var8, boolean var9) {
      this.package_();
      rrZH var10 = ((rrZl_1)this.break_[4]).extends_();
      int var11 = this.break_();
      int var12 = volatile_();
      int var13 = class_(var12);
      this.implements_()
         .class_(
            () -> {
               this.package_();
               List var13x = this.byte_();
               AnimValue var14 = this.implements_().class_();
               float var15 = 0.0F;
               var14.class_(!this.ai_() ? true : throws_[14]);
               var10.class_((float)var11, (float)(var13 + 5));
               float var16 = var14.byte_();
               float var17 = (1.0F - var16) * 5.0F;

               for (int var18 = 0; var18 < var13x.size(); var18++) {
                  GuiComponent var19 = (GuiComponent)var13x.get(var18);
                  if (var19 instanceof rrZY var20) {
                     var20.class_(false);
                     if (var18 == 0 || var13x.get(var18 - 1) instanceof rrZY var21 && var21.break_().continue_() != var20.break_().continue_()) {
                        var20.class_(true);
                     }

                     var15 += (float)var12;
                     if (var20.volatile_()) {
                        var15 += 15.0F;
                     }

                     var20.break_(var15 + var10.case_() + var17);
                     AnimValue var24 = var20.private_();
                     var24.class_(!var20.private_().new_() ? true : throws_[20]);
                  }

                  rruv_1 var23 = var19.protected_();
                  var19.break_(var1, var2, var7, var8, var23, var9, false);
                  if (!(var23.protected_() < var4) && !(var23.protected_() > var4 + (float)var13 + (float)var12 + 10.0F)) {
                     var19.class_(var1, var2, var7, var8, var23, var9, false);
                  }
               }

               this.implements_()
                  .class_(
                     var1,
                     (rrZl_1)this.break_[4],
                     var2,
                     var3 + var5 - 9.0F,
                     var4 + 10.0F + (float)var12,
                     var7,
                     var8,
                     5.0F,
                     (float)(var13 - 7),
                     (float)(var11 - 12),
                     255,
                     var9
                  );
            },
            var1,
            var3 + 100.0F + 1.0F,
            var4,
            262.0F,
            299.0F
         );
      rrvJ.class_(var1, var10, var3 + 100.0F + 1.0F, var4 + 30.0F + 4.0F, var4 + (float)var13 + (float)var12 - 10.0F, 253.0F, 20.0F);
      ((rruL)this.break_[3]).class_(var1, var2, var7, var8, var9, false);
      return true;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 247219459095133036L;
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.package_();
      if (((rruL)this.break_[3]).class_(var1, var2, var3, var4, var5)) {
         this.throws_();
      }

      if (!this.class_(var2, var3)) {
         this.throws_();
         return false;
      } else if (!super.class_(var1, var2, var3, var4, var5)) {
         return false;
      } else {
         ((rrZl_1)this.break_[4]).class_(var1, var2, var3, var4, var5);
         List var6 = this.byte_();

         for (int var7 = var6.size() - 1; var7 >= 0; var7--) {
            GuiComponent var8 = (GuiComponent)var6.get(var7);
            var8.class_(var1, var2, var3, var4, var5);
         }

         return throws_[5];
      }
   }

   public boolean class_(int var1, int var2) {
      this.package_();
      ClickGuiScreen var3 = ((rrvJ)this.break_[1]).volatile_();
      int var4 = var3.abstract_();
      int var5 = var3.finally_();
      return this.class_(var1, var2, (float)(var4 + 100), (float)(var5 + 30 + 4), 263.0F, 266.0F);
   }

   private static int class_(int var0) {
      return 300 - var0 - 10;
   }

   @Override
   public boolean class_(char var1, int var2) {
      super.class_(var1, var2);
      return this.byte_().stream().anyMatch(var2x -> var2x.class_(var1, var2));
   }

   @Override
   public int break_() {
      List var1 = this.byte_();
      int var2 = 0;

      for (GuiComponent var4 : var1) {
         if (var4 instanceof rrZY) {
            rrZY var5 = (rrZY)var4;
            if (var5.volatile_()) {
               var2 += 15;
            }

            var2 += (int)(var4.protected_().class_() + 6.0F);
         }
      }

      return var2 + 6;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{45, -12, 104, -2, -74, 10, 104, -118}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void break_(int var1, int var2, int var3) {
      this.package_();
      super.break_(var1, var2, var3);
      ((rrZl_1)this.break_[4]).break_(var1, var2, var3);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1859741664;
   }

   @Override
   public void throws_() {
      super.throws_();
      this.byte_().forEach(GuiComponent::an_);
   }

   private static void finally_() {
      protected_ = new double[]{25.0};
   }

   @Override
   public void catch_() {
      this.package_();
      super.catch_();
      ((List)this.break_[2]).forEach(GuiComponent::am_);
   }

   private static void extends_() {
      case_ = new short[]{2, 3, 1, 0, 4, 0, 2, 4, 3, 3, 4, 1, 0, 1, 0, 0, 4, 1, 0, 2, 4, 2, 2, 4, 2, 2, 4, 1, 300, 4, 255};
   }

   @Override
   public rrZl_1 case_() {
      this.package_();
      return (rrZl_1)this.break_[4];
   }

   private static void new_() {
      private_ = new byte[]{6, 100, 30, 4, 32, 10, 5, 7, 12, 5, 3, 15, 26, 2, 32};
   }

   private void package_() {
      if (this.break_ == null) {
         this.break_ = new Object[5];
         Object[] var1 = this.break_;
         var1[0] = 0.0F;
      }
   }

   @Override
   public void protected_() {
      this.package_();
      super.protected_();
      ((List)this.break_[2]).forEach(GuiComponent::al_);
   }

   @Override
   public void private_() {
      this.package_();
      super.private_();
      ((rrZl_1)this.break_[4]).private_();
      ((List)this.break_[2]).forEach(GuiComponent::final_);
   }

   private static void final_() {
      catch_ = new float[]{
         0.5F,
         363.0F,
         7.0F,
         26.0F,
         100.0F,
         1.0F,
         262.0F,
         299.0F,
         100.0F,
         1.0F,
         30.0F,
         4.0F,
         10.0F,
         253.0F,
         20.0F,
         363.0F,
         5.0F,
         6.0F,
         263.0F,
         266.0F,
         0.0F,
         1.0F,
         5.0F,
         15.0F,
         10.0F,
         9.0F,
         10.0F,
         5.0F,
         0.0F
      };
   }

   private static int volatile_() {
      return 32;
   }

   private static void native_() {
      throws_ = new boolean[]{
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         true
      };
   }

   @Override
   public rdn_3 ag_() {
      for (GuiComponent var2 : this.byte_()) {
         rdn_3 var3 = var2.byte_();
         if (var3 != null) {
            return var3;
         }
      }

      return null;
   }
}

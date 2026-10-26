package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZw_1 extends rrZN implements rrZT, rrZq_1<rrZa_1> {
   private static short[] protected_;
   private static String[] throws_;
   public Object[] break_;
   private static double[] case_;
   private static float[] catch_;
   public static Object[] byte_;
   private static boolean[] private_;
   private static byte[] implements_;

   private static void char_() {
      protected_ = new short[]{
         1, 2, 4, 0, 5, 3, 0, 0, 1, 2, 0, 300, 3, 0, 4, 2, 0, 2, 3, 0, 0, 1, 5, 5, 3, 1, 1, 3, 4, 1, 1, 3, 1, 3, 1, 1, 1, 1, 1, 1, 1, 0, 3, 255, 0, 4, 0, 0
      };
   }

   @Override
   public List<rrZa_1> byte_() {
      this.volatile_();
      Predicate var1 = var1x -> {
         this.volatile_();
         rrIX var2 = var1x.extends_();
         rrtY_2 var3 = ((rrvJ)this.break_[0]).finally_().extends_();
         String var4 = var3.final_();
         String var5 = var2.class_();
         String var6 = var2.protected_();
         if (var3.new_()) {
            return true;
         } else {
            String var7 = var4.trim().toLowerCase();
            return !var5.toLowerCase().contains(var7) && !var6.toLowerCase().contains(var7) ? private_[18] : private_[17];
         }
      };
      return ((List)this.break_[1]).stream().filter(var1).toList();
   }

   @Override
   public void byte_(int var1, int var2, int var3) {
      super.byte_(var1, var2, var3);
      this.byte_().forEach(var3x -> var3x.break_(var1, var2, var3));
   }

   public rrZa_1 byte_(String var1) {
      this.volatile_();
      return ((List)this.break_[1]).stream().filter(var1x -> var1x.extends_().class_().equals(var1)).findFirst().orElse(null);
   }

   public rrZw_1(rrvJ var1, float var2, float var3) {
      this.volatile_();
      ArrayList var15 = new ArrayList();
      this.break_[1] = var15;
      rruL var16 = new rruL();
      this.break_[2] = var16;
      AnimValue var17 = new AnimValue(0.5F, false);
      this.break_[4] = var17;
      this.break_[0] = var1;
      Float var19 = var2;
      this.break_[5] = var19;
      rrZl_1 var20 = new rrZl_1(new rrZH(0.5F));
      this.break_[3] = var20;
      Supplier var4 = () -> (float)var1.volatile_().abstract_() + var2;
      Supplier var5 = () -> (float)var1.volatile_().finally_() + var3;
      float var6 = 363.0F - var2 - 7.0F;
      float var7 = 26.0F;
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).catch_().class_(new rrZD(this, var4, var5, var6, var7), new rrZU());

      for (rrIX var9 : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).catch_().break_()) {
         rrZa_1 var10 = new rrZa_1(this, var9, var4, var5, var6, var7);
         var10.private_();
         ((List)this.break_[1]).add(var10);
      }

      this.class_(var4, var5, var6);
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      throws_ = new String[]{new String("Create")};
   }

   @Override
   public void class_(Category var1, Category var2) {
      this.volatile_();
      super.class_(var1, var2);
      ((AnimValue)this.break_[4]).extends_();
      ((List)this.break_[1]).forEach(var2x -> var2x.class_(var1, var2));
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4822521452054783750L;
   }

   @Override
   public boolean class_(Ml_1 var1, rrtu_3 var2, float var3, float var4, float var5, float var6, int var7, int var8, boolean var9) {
      this.volatile_();
      rrZH var10 = ((rrZl_1)this.break_[3]).extends_();
      int var11 = this.break_();
      int var12 = try_();
      int var13 = class_(var12);
      this.implements_()
         .class_(
            () -> {
               this.volatile_();
               List var13x = this.byte_();
               AnimValue var14x = this.implements_().class_();
               float var15 = 0.0F;
               var14x.class_(!this.ai_() ? true : private_[20]);
               var10.class_((float)var11, (float)(var13 + 5));
               float var16 = (1.0F - var14x.byte_()) * 5.0F;

               for (rrZa_1 var18 : var13x) {
                  AnimValue var19 = var18.volatile_();
                  var19.class_(!var19.new_() ? true : private_[22]);
                  var15 += (float)var12 * var19.byte_();
                  var18.class_(var15 + var10.case_() + var16);
                  AnimValue var20 = var18.package_();
                  var20.class_(!var18.package_().new_() ? true : private_[24]);
               }

               for (int var21 = var13x.size() - 1; var21 >= 0; var21--) {
                  rrZa_1 var22 = (rrZa_1)var13x.get(var21);
                  rruv_1 var23 = var22.protected_();
                  if (!(var23.protected_() < var4) && !(var23.protected_() > var4 + (float)var13 + (float)var12 + 10.0F)) {
                     var22.class_(var1, var2, var7, var8, var23, var9, false);
                  }
               }

               this.implements_()
                  .class_(
                     var1,
                     (rrZl_1)this.break_[3],
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
      AnimValue var14 = ((rrvJ)this.break_[0]).finally_().finally_();
      ((AnimValue)this.break_[4]).class_(var14.protected_());
      ((rruL)this.break_[2]).class_(var1, var2, var7, var8, var9, false);
      return true;
   }

   private void class_(Supplier<Float> var1, Supplier<Float> var2, float var3) {
      this.volatile_();
      Runnable var4 = () -> {
         int var0 = 1;
         String var1x = "NewConfig" + var0;

         while (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).catch_().byte_(var1x)) {
            var1x = "NewConfig" + ++var0;
         }

         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).catch_().byte_(var1x, true);
      };
      Supplier var5 = () -> new rji_3(
            (float)ColorHelper.class_(0.0F), (float)ColorHelper.class_(90.0F), (float)ColorHelper.class_(270.0F), (float)ColorHelper.class_(180.0F)
         );
      ((rruL)this.break_[2])
         .class_(
            new rruF(
                  new rruH(
                        () -> rrZL.case_,
                        () -> new rjK_2(4.0F, 2.0F),
                        () -> new rjK_2(8.0F, 8.0F),
                        () -> rrZF.d_,
                        ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).finally_(),
                        () -> "Create",
                        () -> new rjK_2((Float)var1.get() + var3 - 81.0F, (Float)var2.get()),
                        () -> new rjK_2(47.0F, 12.0F),
                        () -> new rjK_2(16.5F, 4.5F),
                        () -> rrZF.d_,
                        var5
                     )
                     .<rrup_1>break_(ClickGuiTheme::class_)
                     .class_(() -> {
                        this.volatile_();
                        return ((AnimValue)this.break_[4]).byte_() * this.implements_().class_().byte_();
                     })
               )
               .class_(() -> {
                  this.volatile_();
                  ((rrvJ)this.break_[0]).finally_().extends_().int_();
                  var4.run();
               })
         );
   }

   @Override
   public boolean class_(char var1, int var2) {
      return this.byte_().stream().anyMatch(var2x -> var2x.class_(var1, var2));
   }

   public void class_(int var1, rrZa_1 var2) {
      this.volatile_();
      ((List)this.break_[1]).add(var1, var2);
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.volatile_();
      ClickGuiScreen var6 = ((rrvJ)this.break_[0]).volatile_();
      int var7 = var6.abstract_();
      int var8 = var6.finally_();
      ((rruL)this.break_[2]).class_(var1, var2, var3, var4, var5);
      if (!this.class_(var2, var3, (float)(var7 + 100), (float)(var8 + 30 + 4), 263.0F, 266.0F)) {
         this.throws_();
         return false;
      } else if (!super.class_(var1, var2, var3, var4, var5)) {
         return false;
      } else {
         ((rrZl_1)this.break_[3]).class_(var1, var2, var3, var4, var5);
         List var9 = this.byte_();

         for (int var10 = var9.size() - 1; var10 >= 0; var10--) {
            rrZa_1 var11 = (rrZa_1)var9.get(var10);
            var11.class_(var1, var2, var3, var4, var5);
         }

         return private_[10];
      }
   }

   private static int class_(int var0) {
      return 300 - var0 - 10;
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, double var4, boolean var6) {
      this.volatile_();
      ClickGuiScreen var7 = ((rrvJ)this.break_[0]).volatile_();
      int var8 = try_();
      int var9 = class_(var8);
      boolean var10 = this.class_(
         (Integer)rrvk_1.class_[0],
         (Integer)rrvk_1.class_[1],
         (float)var7.abstract_() + (Float)this.break_[5],
         (float)(var7.finally_() + var8),
         363.0F - (Float)this.break_[5] - 5.0F,
         (float)var9
      );
      ((rrZl_1)this.break_[3]).extends_().class_(var10 && super.class_(var1, var2, var3, var4, var6) ? true : private_[12], var4, 25.0);
      this.byte_().forEach(var7x -> var7x.class_(var1, var2, var3, var4, var10, var6));
      return false;
   }

   public void class_(rrZa_1 var1) {
      this.volatile_();
      ((List)this.break_[1]).add(var1);
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      return this.byte_().stream().anyMatch(var3x -> var3x.class_(var1, var2, var3));
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1690198399;
   }

   public void break_(rrZa_1 var1) {
      this.volatile_();
      ((List)this.break_[1]).remove(var1);
   }

   @Override
   public int break_() {
      List var1 = this.byte_();
      return var1.stream().mapToInt(var0 -> (int)(var0.catch_() + 6.0F)).sum() + 6;
   }

   @Override
   public void break_(int var1, int var2, int var3) {
      this.volatile_();
      ((rrZl_1)this.break_[3]).break_(var1, var2, var3);
   }

   public void break_(String var1) {
      this.volatile_();
      ((List)this.break_[1]).remove(this.byte_(var1));
   }

   @Override
   public void throws_() {
      this.byte_().forEach(rrZa_1::an_);
   }

   public List<rrZa_1> finally_() {
      this.volatile_();
      return (List<rrZa_1>)this.break_[1];
   }

   @Override
   public void catch_() {
      this.volatile_();
      super.catch_();
      ((List)this.break_[1]).forEach(rrZa_1::am_);
   }

   public List<rrZa_1> extends_() {
      this.volatile_();
      return ((List)this.break_[1]).stream().filter(var0 -> !var0.package_().new_() ? true : private_[15]).toList();
   }

   private static void goto_() {
      case_ = new double[]{25.0};
   }

   @Override
   public rrZl_1 case_() {
      this.volatile_();
      return (rrZl_1)this.break_[3];
   }

   private static void instanceof_() {
      implements_ = new byte[]{2, 32, 10, 100, 30, 4, 6, 5, 7, 12, 6, 5, 2, 26, 32};
   }

   private static void return_() {
      private_ = new boolean[]{
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         true
      };
   }

   private static int try_() {
      return 32;
   }

   private static void public_() {
      Object[] var0 = new Object[]{26, 32};
      byte_ = var0;
   }

   @Override
   public void protected_() {
      this.volatile_();
      super.protected_();
      ((List)this.break_[1]).forEach(rrZa_1::al_);
   }

   public static String protected_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{103, -62, -97, -52, 93, -61, 127, -77}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void private_() {
      this.volatile_();
      super.private_();
      ((rrZl_1)this.break_[3]).private_();
      ((List)this.break_[1]).forEach(GuiComponent::final_);
   }

   private void volatile_() {
      if (this.break_ == null) {
         this.break_ = new Object[6];
         Object[] var1 = this.break_;
         var1[5] = 0.0F;
      }
   }

   private static void synchronized_() {
      catch_ = new float[]{
         0.5F,
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
         263.0F,
         266.0F,
         363.0F,
         5.0F,
         6.0F,
         0.0F,
         1.0F,
         5.0F,
         10.0F,
         9.0F,
         10.0F,
         5.0F,
         16.5F,
         4.5F,
         47.0F,
         12.0F,
         81.0F,
         8.0F,
         8.0F,
         4.0F,
         2.0F,
         0.0F,
         90.0F,
         270.0F,
         180.0F,
         0.0F
      };
   }
}

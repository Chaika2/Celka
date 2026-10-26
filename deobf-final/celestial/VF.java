package celestial;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class VF extends QF {
   protected final float rF;
   protected final double rL;
   protected double rA;
   protected Function<Qw_1, Double> rn;
   protected BiConsumer<Qw_1, Double> rC;
   protected BiFunction<Qw_1, VF, rgP_2> rl;
   protected double[] rH;

   public double byte_(double var1) {
      return this.protected_(rfU_2.protected_(rfU_2.class_(var1, 0.0, 1.0), this.rL, this.rA));
   }

   public VF(String var1, double var2, double var4, float var6, Function<Qw_1, Double> var7, BiConsumer<Qw_1, Double> var8, BiFunction<Qw_1, VF, rgP_2> var9) {
      super(var1);
      this.rL = var2;
      this.rA = var4;
      this.rF = var6;
      this.rn = var7;
      this.rC = var8;
      this.rl = var9;
   }

   public VF(String var1, double var2, double var4, double[] var6, Function<Qw_1, Double> var7, BiConsumer<Qw_1, Double> var8, BiFunction<Qw_1, VF, rgP_2> var9) {
      super(var1);
      this.rL = var2;
      this.rA = var4;
      this.rF = 0.0F;
      this.rn = var7;
      this.rC = var8;
      this.rl = var9;
      this.rH = var6;
      if (var6 != null) {
         var6 = (double[])var6.clone();
         Arrays.sort(var6);
      }
   }

   public void class_(Qw_1 var1, double var2) {
      this.rC.accept(var1, var2);
   }

   public double class_(Qw_1 var1) {
      return this.rn.apply(var1);
   }

   @Override
   public LZ class_(Qw_1 var1, int var2, int var3, int var4) {
      return new VL(this, var1, var2, var3, var4, 20, this);
   }

   public void break_(float var1) {
      this.rA = (double)var1;
   }

   public rgP_2 break_(Qw_1 var1) {
      return this.rl.apply(var1, this);
   }

   public double break_(double var1) {
      return rfU_2.class_((this.protected_(var1) - this.rL) / (this.rA - this.rL), 0.0, 1.0);
   }

   public double throws_() {
      return this.rL;
   }

   public double case_() {
      return this.rA;
   }

   private double protected_(double var1) {
      if (this.rF > 0.0F) {
         var1 = (double)(this.rF * (float)Math.round(var1 / (double)this.rF));
      }

      if (this.rH != null) {
         for (int var3 = 0; var3 < this.rH.length; var3++) {
            double var4 = var3 <= 0 ? -Double.MAX_VALUE : (this.rH[var3 - 1] + this.rH[var3]) / 2.0;
            double var6 = var3 >= this.rH.length - 1 ? Double.MAX_VALUE : (this.rH[var3] + this.rH[var3 + 1]) / 2.0;
            if (rrbb_3.break_(var1, var4, var6)) {
               var1 = this.rH[var3];
               break;
            }
         }
      }

      return rfU_2.class_(var1, this.rL, this.rA);
   }
}

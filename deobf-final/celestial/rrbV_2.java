package celestial;

import java.util.HashSet;
import java.util.Set;

public class rrbV_2 {
   private an_3 class_ = null;
   private double break_ = 0.0;
   private double byte_ = -2.1474836E9F;
   private double protected_ = -2.1474836E9F;
   private double throws_ = -2.1474836E9F;
   private int case_ = 0;
   private long catch_ = 0L;
   private Set<rfH_2> private_ = new HashSet<>();
   private rfw_3 implements_ = new rfw_3();

   public double byte_() {
      return this.protected_;
   }

   public rrbV_2(an_3 var1) {
      this.class_ = var1;
      this.break_ = (double)var1.Bx();
   }

   @Override
   public String toString() {
      return "Entity: " + this.class_ + ", offsetY: " + this.break_;
   }

   public void class_(yX_2 var1) {
      if (rrbb_3.rA()) {
         long var2 = System.currentTimeMillis();
         if (var2 < this.catch_ + 500L) {
            return;
         }

         this.catch_ = var2;
      }

      double var37 = this.class_.rx() - 0.5;
      double var4 = this.class_.re() - 0.5 + this.break_;
      double var6 = this.class_.BO() - 0.5;
      int var8 = rrbg_3.class_(this.class_);
      double var9 = var37 - this.byte_;
      double var11 = var4 - this.protected_;
      double var13 = var6 - this.throws_;
      double var15 = 0.1;
      if (!(Math.abs(var9) <= var15) || !(Math.abs(var11) <= var15) || !(Math.abs(var13) <= var15) || this.case_ != var8) {
         this.byte_ = var37;
         this.protected_ = var4;
         this.throws_ = var6;
         this.case_ = var8;
         HashSet var17 = new HashSet();
         if (var8 > 0) {
            rpr_3 var18 = (rfU_2.byte_(var37) & 15) >= 8 ? rpr_3.EAST : rpr_3.WEST;
            rpr_3 var19 = (rfU_2.byte_(var4) & 15) >= 8 ? rpr_3.UP : rpr_3.DOWN;
            rpr_3 var20 = (rfU_2.byte_(var6) & 15) >= 8 ? rpr_3.SOUTH : rpr_3.NORTH;
            rfH_2 var21 = new rfH_2(var37, var4, var6);
            yQ_2 var22 = var1.class_(var21);
            rfH_2 var23 = this.class_(var22, var21, var18);
            yQ_2 var24 = var1.class_(var23);
            rfH_2 var25 = this.class_(var22, var21, var20);
            yQ_2 var26 = var1.class_(var25);
            rfH_2 var27 = this.class_(var24, var23, var20);
            yQ_2 var28 = var1.class_(var27);
            rfH_2 var29 = this.class_(var22, var21, var19);
            yQ_2 var30 = var1.class_(var29);
            rfH_2 var31 = this.class_(var30, var29, var18);
            yQ_2 var32 = var1.class_(var31);
            rfH_2 var33 = this.class_(var30, var29, var20);
            yQ_2 var34 = var1.class_(var33);
            rfH_2 var35 = this.class_(var32, var31, var20);
            yQ_2 var36 = var1.class_(var35);
            this.class_(var22, this.private_, var17);
            this.class_(var24, this.private_, var17);
            this.class_(var26, this.private_, var17);
            this.class_(var28, this.private_, var17);
            this.class_(var30, this.private_, var17);
            this.class_(var32, this.private_, var17);
            this.class_(var34, this.private_, var17);
            this.class_(var36, this.private_, var17);
         }

         this.break_(var1);
         this.private_ = var17;
      }
   }

   private rfH_2 class_(yQ_2 var1, rfH_2 var2, rpr_3 var3) {
      return var1 != null ? var1.class_(var3) : var2.class_(var3, 16);
   }

   public an_3 class_() {
      return this.class_;
   }

   private void class_(yQ_2 var1, Set<rfH_2> var2, Set<rfH_2> var3) {
      if (var1 != null) {
         yZ_2 var4 = var1.byte_();
         if (var4 != null && !var4.class_()) {
            var1.class_(false);
         }

         rfH_2 var5 = var1.throws_().int_();
         if (var2 != null) {
            var2.remove(var5);
         }

         if (var3 != null) {
            var3.add(var5);
         }
      }
   }

   public double break_() {
      return this.byte_;
   }

   public void break_(yX_2 var1) {
      for (rfH_2 var3 : this.private_) {
         yQ_2 var4 = var1.class_(var3);
         this.class_(var4, (Set<rfH_2>)null, (Set<rfH_2>)null);
      }
   }

   public int throws_() {
      return this.case_;
   }

   public double case_() {
      return this.break_;
   }

   public double protected_() {
      return this.throws_;
   }
}

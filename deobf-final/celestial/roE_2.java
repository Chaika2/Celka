package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class roE_2 {
   private final List<roS_2> class_ = Lists.newArrayList();
   private double byte_ = 0.2;
   private double protected_ = 5.0;
   private int throws_ = 15;
   private int case_ = 5;
   private double catch_;
   private double private_;
   int implements_ = 29999984;
   private roG_2 finally_ = new roO_2(this, 6.0E7);
   public static final roM_2 break_ = new roM_2(0.0, 0.0, 0.2, 5.0, 5, 15, 6.0E7, 0L, 0.0);

   public rjC_2 byte_() {
      return this.finally_.volatile_();
   }

   public void byte_(int var1) {
      this.case_ = var1;

      for (roS_2 var3 : this.native_()) {
         var3.break_(this, var1);
      }
   }

   public void byte_(double var1) {
      this.byte_ = var1;

      for (roS_2 var4 : this.native_()) {
         var4.break_(this, var1);
      }
   }

   public double int_() {
      return this.finally_.case_();
   }

   public roM_2 this_() {
      return new roM_2(this);
   }

   public void class_(roS_2 var1) {
      this.class_.add(var1);
   }

   public boolean class_(rfl_3 var1) {
      return var1.protected_ > this.throws_() && var1.class_ < this.catch_() && var1.case_ > this.case_() && var1.byte_ < this.private_();
   }

   public void class_(int var1) {
      this.implements_ = var1;
      this.finally_.finally_();
   }

   public void class_(double var1, double var3, long var5) {
      this.finally_ = (roG_2)(var1 == var3 ? new roO_2(this, var3) : new rob_3(this, var1, var3, var5));

      for (roS_2 var8 : this.native_()) {
         var8.class_(this, var1, var3, var5);
      }
   }

   public double class_(an_3 var1) {
      return this.class_(var1.rx(), var1.BO());
   }

   public void class_(double var1) {
      this.finally_ = new roO_2(this, var1);

      for (roS_2 var4 : this.native_()) {
         var4.class_(this, var1);
      }
   }

   public void class_(roM_2 var1) {
      this.break_(var1.class_(), var1.break_());
      this.byte_(var1.byte_());
      this.break_(var1.protected_());
      this.byte_(var1.throws_());
      this.break_(var1.case_());
      if (var1.private_() > 0L) {
         this.class_(var1.catch_(), var1.implements_(), var1.private_());
      } else {
         this.class_(var1.catch_());
      }
   }

   public boolean class_(rfH_2 var1) {
      return (double)(var1.b_() + 1) > this.throws_()
         && (double)var1.b_() < this.catch_()
         && (double)(var1.d_() + 1) > this.case_()
         && (double)var1.d_() < this.private_();
   }

   public boolean class_(rfj_3 var1) {
      return (double)var1.protected_() > this.throws_()
         && (double)var1.break_() < this.catch_()
         && (double)var1.throws_() > this.case_()
         && (double)var1.byte_() < this.private_();
   }

   public double class_(double var1, double var3) {
      double var5 = var3 - this.case_();
      double var7 = this.private_() - var3;
      double var9 = var1 - this.throws_();
      double var11 = this.catch_() - var1;
      double var13 = Math.min(var9, var11);
      var13 = Math.min(var13, var5);
      return Math.min(var13, var7);
   }

   public double class_() {
      return this.catch_;
   }

   public void break_(double var1) {
      this.protected_ = var1;

      for (roS_2 var4 : this.native_()) {
         var4.byte_(this, var1);
      }
   }

   public double break_() {
      return this.private_;
   }

   public void break_(double var1, double var3) {
      this.catch_ = var1;
      this.private_ = var3;
      this.finally_.extends_();

      for (roS_2 var6 : this.native_()) {
         var6.class_(this, var1, var3);
      }
   }

   public void break_(int var1) {
      this.throws_ = var1;

      for (roS_2 var3 : this.native_()) {
         var3.class_(this, var1);
      }
   }

   public double throws_() {
      return this.finally_.class_();
   }

   public long finally_() {
      return this.finally_.catch_();
   }

   public double catch_() {
      return this.finally_.break_();
   }

   public double extends_() {
      return this.finally_.private_();
   }

   public double case_() {
      return this.finally_.byte_();
   }

   public int continue_() {
      return this.case_;
   }

   public double implements_() {
      return this.finally_.throws_();
   }

   public int new_() {
      return this.throws_;
   }

   public double package_() {
      return this.byte_;
   }

   public void super_() {
      this.finally_ = this.finally_.native_();
   }

   public roB_2 protected_() {
      return this.finally_.implements_();
   }

   public double private_() {
      return this.finally_.protected_();
   }

   public double final_() {
      return this.protected_;
   }

   public int volatile_() {
      return this.implements_;
   }

   protected List<roS_2> native_() {
      return Lists.newArrayList(this.class_);
   }
}

package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class rLC {
   private final List<rLq_1> class_;
   private rLq_1[] break_ = new rLq_1[0];
   private rLq_1[] byte_ = new rLq_1[0];
   private Set<rLv_1> protected_;
   private int throws_;
   private final rfH_2 case_;
   private final float catch_;
   private final boolean private_;

   public boolean byte_() {
      return this.throws_ >= this.class_.size();
   }

   public void byte_(int var1) {
      this.throws_ = var1;
   }

   public rLC(List<rLq_1> var1, rfH_2 var2, boolean var3) {
      this.class_ = var1;
      this.case_ = var2;
      this.catch_ = var1.isEmpty() ? Float.MAX_VALUE : this.class_.get(this.class_.size() - 1).class_(this.case_);
      this.private_ = var3;
   }

   @Override
   public String toString() {
      return "Path(length=" + this.class_.size() + ")";
   }

   public boolean class_(rLC var1) {
      if (var1 == null) {
         return false;
      } else if (var1.class_.size() != this.class_.size()) {
         return false;
      } else {
         for (int var2 = 0; var2 < this.class_.size(); var2++) {
            rLq_1 var3 = this.class_.get(var2);
            rLq_1 var4 = var1.class_.get(var2);
            if (var3.class_ != var4.class_ || var3.break_ != var4.break_ || var3.byte_ != var4.byte_) {
               return false;
            }
         }

         return true;
      }
   }

   public rjU_2 class_(an_3 var1) {
      return this.class_(var1, this.throws_);
   }

   public rjU_2 class_(an_3 var1, int var2) {
      rLq_1 var3 = this.class_.get(var2);
      double var4 = (double)var3.class_ + (double)((int)(var1.PN() + 1.0F)) * 0.5;
      double var6 = (double)var3.break_;
      double var8 = (double)var3.byte_ + (double)((int)(var1.PN() + 1.0F)) * 0.5;
      return new rjU_2(var4, var6, var8);
   }

   public static rLC class_(ruu_3 var0) {
      boolean var1 = var0.readBoolean();
      int var2 = var0.readInt();
      int var3 = var0.readInt();
      HashSet var4 = Sets.newHashSet();

      for (int var5 = 0; var5 < var3; var5++) {
         var4.add(rLv_1.class_(var0));
      }

      rfH_2 var11 = new rfH_2(var0.readInt(), var0.readInt(), var0.readInt());
      ArrayList var6 = Lists.newArrayList();
      int var7 = var0.readInt();

      for (int var8 = 0; var8 < var7; var8++) {
         var6.add(rLq_1.break_(var0));
      }

      rLq_1[] var12 = new rLq_1[var0.readInt()];

      for (int var9 = 0; var9 < var12.length; var9++) {
         var12[var9] = rLq_1.break_(var0);
      }

      rLq_1[] var13 = new rLq_1[var0.readInt()];

      for (int var10 = 0; var10 < var13.length; var10++) {
         var13[var10] = rLq_1.break_(var0);
      }

      rLC var14 = new rLC(var6, var11, var1);
      var14.break_ = var12;
      var14.byte_ = var13;
      var14.protected_ = var4;
      var14.throws_ = var2;
      return var14;
   }

   public void class_() {
      this.throws_++;
   }

   public void class_(int var1, rLq_1 var2) {
      this.class_.set(var1, var2);
   }

   public rLq_1 class_(int var1) {
      return this.class_.get(var1);
   }

   public boolean break_() {
      return this.throws_ <= 0;
   }

   public void break_(int var1) {
      if (this.class_.size() > var1) {
         this.class_.subList(var1, this.class_.size()).clear();
      }
   }

   public int throws_() {
      return this.class_.size();
   }

   public boolean finally_() {
      return this.private_;
   }

   public rfH_2 catch_() {
      return this.class_.get(this.throws_).byte_();
   }

   public rLq_1[] extends_() {
      return this.break_;
   }

   public int case_() {
      return this.throws_;
   }

   public rLq_1 implements_() {
      return this.throws_ > 0 ? this.class_.get(this.throws_ - 1) : null;
   }

   public rLq_1 protected_() {
      return !this.class_.isEmpty() ? this.class_.get(this.class_.size() - 1) : null;
   }

   public rfH_2 protected_(int var1) {
      return this.class_.get(var1).byte_();
   }

   public rLq_1 private_() {
      return this.class_.get(this.throws_);
   }

   public float final_() {
      return this.catch_;
   }

   public rfH_2 volatile_() {
      return this.case_;
   }

   public rLq_1[] native_() {
      return this.byte_;
   }
}

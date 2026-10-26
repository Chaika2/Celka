package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class ryR_2 {
   private final List<ryV_2> class_ = Lists.newArrayList();
   private final iB_2 break_;
   private int byte_;
   private int protected_;
   private int throws_;
   private boolean case_;
   private boolean catch_;
   private String private_;

   public iB_2 byte_() {
      iB_2 var1 = null;
      rhd_3 var2 = null;
      float var3 = 0.0F;
      float var4 = 0.0F;

      for (ryV_2 var6 : this.class_) {
         if (var6.class_().extends_() instanceof rhd_3 && (var2 == null || var6.break_() > var4)) {
            var4 = var6.break_();
            var2 = (rhd_3)var6.class_().extends_();
         }

         if (var6.class_().extends_() instanceof iB_2 && (var1 == null || var6.break_() > var3)) {
            var3 = var6.break_();
            var1 = (iB_2)var6.class_().extends_();
         }
      }

      return (iB_2)(var2 != null && var4 >= var3 / 3.0F ? var2 : var1);
   }

   public ryR_2(iB_2 var1) {
      this.break_ = var1;
   }

   private String class_(ryV_2 var1) {
      return var1.protected_() == null ? "generic" : var1.protected_();
   }

   public void class_(rye_3 var1, float var2, float var3) {
      this.throws_();
      this.class_();
      ryV_2 var4 = new ryV_2(var1, (Integer)this.break_.throws_[41], var2, var3, this.private_, (Float)this.break_.throws_[31]);
      this.class_.add(var4);
      this.byte_ = (Integer)this.break_.throws_[41];
      this.catch_ = true;
      if (var4.byte_() && !this.case_ && this.break_.BM()) {
         this.case_ = true;
         this.protected_ = (Integer)this.break_.throws_[41];
         this.throws_ = this.protected_;
         this.break_.Sj();
      }
   }

   public void class_() {
      this.private_();
      Optional var1 = this.break_.SP();
      if (var1.isPresent()) {
         xc_3 var2 = ((rYB)this.break_.throws_[7]).byte_((rfH_2)var1.get());
         if (var2.class_(xu_3.PJ) || var2.class_(rls_3.static_)) {
            this.private_ = "ladder";
         } else if (var2.class_(xu_3.BD)) {
            this.private_ = "vines";
         } else if (var2.class_(xu_3.XC) || var2.class_(xu_3.Xl)) {
            this.private_ = "weeping_vines";
         } else if (var2.class_(xu_3.XH) || var2.class_(xu_3.Xy)) {
            this.private_ = "twisting_vines";
         } else if (var2.class_(xu_3.hU)) {
            this.private_ = "scaffolding";
         } else {
            this.private_ = "other_climbable";
         }
      } else if (this.break_.rT()) {
         this.private_ = "water";
      }
   }

   public rgP_2 break_() {
      if (this.class_.isEmpty()) {
         return new rgn_3("death.attack.generic", this.break_.L_());
      } else {
         ryV_2 var1 = this.catch_();
         ryV_2 var2 = this.class_.get(this.class_.size() - 1);
         rgP_2 var3 = var2.throws_();
         an_3 var4 = var2.class_().extends_();
         Object var5;
         if (var1 != null && var2.class_() == rye_3.extends_) {
            rgP_2 var6 = var1.throws_();
            if (var1.class_() == rye_3.extends_ || var1.class_() == rye_3.volatile_) {
               var5 = new rgn_3("death.fell.accident." + this.class_(var1), this.break_.L_());
            } else if (var6 != null && (var3 == null || !var6.equals(var3))) {
               an_3 var9 = var1.class_().extends_();
               rdn_3 var8 = var9 instanceof iB_2 ? ((iB_2)var9).ss() : rdn_3.break_;
               if (!var8.class_() && var8.this_()) {
                  var5 = new rgn_3("death.fell.assist.item", this.break_.L_(), var6, var8.throw_());
               } else {
                  var5 = new rgn_3("death.fell.assist", this.break_.L_(), var6);
               }
            } else if (var3 != null) {
               rdn_3 var7 = var4 instanceof iB_2 ? ((iB_2)var4).ss() : rdn_3.break_;
               if (!var7.class_() && var7.this_()) {
                  var5 = new rgn_3("death.fell.finish.item", this.break_.L_(), var3, var7.throw_());
               } else {
                  var5 = new rgn_3("death.fell.finish", this.break_.L_(), var3);
               }
            } else {
               var5 = new rgn_3("death.fell.killer", this.break_.L_());
            }
         } else {
            var5 = var2.class_().class_(this.break_);
         }

         return (rgP_2)var5;
      }
   }

   public void throws_() {
      int var1 = this.case_ ? 300 : 100;
      if (this.catch_ && (!this.break_.BM() || (Integer)this.break_.throws_[41] - this.byte_ > var1)) {
         boolean var2 = this.case_;
         this.catch_ = false;
         this.case_ = false;
         this.throws_ = (Integer)this.break_.throws_[41];
         if (var2) {
            this.break_.sh();
         }

         this.class_.clear();
      }
   }

   private ryV_2 catch_() {
      ryV_2 var1 = null;
      ryV_2 var2 = null;
      float var3 = 0.0F;
      float var4 = 0.0F;

      for (int var5 = 0; var5 < this.class_.size(); var5++) {
         ryV_2 var6 = this.class_.get(var5);
         ryV_2 var7 = var5 > 0 ? this.class_.get(var5 - 1) : null;
         if ((var6.class_() == rye_3.extends_ || var6.class_() == rye_3.volatile_) && var6.case_() > 0.0F && (var1 == null || var6.case_() > var4)) {
            if (var5 > 0) {
               var1 = var7;
            } else {
               var1 = var6;
            }

            var4 = var6.case_();
         }

         if (var6.protected_() != null && (var2 == null || var6.break_() > var3)) {
            var2 = var6;
            var3 = var6.break_();
         }
      }

      if (var4 > 5.0F && var1 != null) {
         return var1;
      } else {
         return var3 > 5.0F && var2 != null ? var2 : null;
      }
   }

   public iB_2 case_() {
      return this.break_;
   }

   public int protected_() {
      return this.case_ ? (Integer)this.break_.throws_[41] - this.protected_ : this.throws_ - this.protected_;
   }

   private void private_() {
      this.private_ = null;
   }
}

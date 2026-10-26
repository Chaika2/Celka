package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class OY {
   private final OT class_;
   private final OY break_;
   private final OY byte_;
   private final int protected_;
   private final List<OY> throws_ = Lists.newArrayList();
   private OY case_;
   private OY catch_;
   private int private_;
   private float implements_;
   private float finally_;
   private float extends_;
   private float native_;

   private OY byte_() {
      if (this.catch_ != null) {
         return this.catch_;
      } else {
         return !this.throws_.isEmpty() ? this.throws_.get(0) : null;
      }
   }

   public OY(OT var1, OY var2, OY var3, int var4, int var5) {
      if (var1.byte_() == null) {
         throw new IllegalArgumentException("Can't position an invisible advancement!");
      } else {
         this.class_ = var1;
         this.break_ = var2;
         this.byte_ = var3;
         this.protected_ = var4;
         this.case_ = this;
         this.private_ = var5;
         this.implements_ = -1.0F;
         OY var6 = null;

         for (OT var8 : var1.throws_()) {
            var6 = this.class_(var8, var6);
         }
      }
   }

   private OY class_(OT var1, OY var2) {
      if (var1.byte_() != null) {
         var2 = new OY(var1, this, var2, this.throws_.size() + 1, this.private_ + 1);
         this.throws_.add(var2);
      } else {
         for (OT var4 : var1.throws_()) {
            var2 = this.class_(var4, var2);
         }
      }

      return var2;
   }

   public static void class_(OT var0) {
      if (var0.byte_() == null) {
         throw new IllegalArgumentException("Can't position children of an invisible root!");
      } else {
         OY var1 = new OY(var0, (OY)null, (OY)null, 1, 0);
         var1.class_();
         float var2 = var1.class_(0.0F, 0, var1.implements_);
         if (var2 < 0.0F) {
            var1.class_(-var2);
         }

         var1.throws_();
      }
   }

   private OY class_(OY var1) {
      if (this.byte_ == null) {
         return var1;
      } else {
         OY var2 = this;
         OY var3 = this;
         OY var4 = this.byte_;
         OY var5 = this.break_.throws_.get(0);
         float var6 = this.finally_;
         float var7 = this.finally_;
         float var8 = var4.finally_;

         float var9;
         for (var9 = var5.finally_; var4.protected_() != null && var2.byte_() != null; var7 += var3.finally_) {
            var4 = var4.protected_();
            var2 = var2.byte_();
            var5 = var5.byte_();
            var3 = var3.protected_();
            var3.case_ = this;
            float var10 = var4.implements_ + var8 - (var2.implements_ + var6) + 1.0F;
            if (var10 > 0.0F) {
               var4.class_(this, var1).class_(this, var10);
               var6 += var10;
               var7 += var10;
            }

            var8 += var4.finally_;
            var6 += var2.finally_;
            var9 += var5.finally_;
         }

         if (var4.protected_() != null && var3.protected_() == null) {
            var3.catch_ = var4.protected_();
            var3.finally_ += var8 - var7;
         } else {
            if (var2.byte_() != null && var5.byte_() == null) {
               var5.catch_ = var2.byte_();
               var5.finally_ += var6 - var9;
            }

            var1 = this;
         }

         return var1;
      }
   }

   private void class_(OY var1, float var2) {
      float var3 = (float)(var1.protected_ - this.protected_);
      if (var3 != 0.0F) {
         var1.extends_ -= var2 / var3;
         this.extends_ += var2 / var3;
      }

      var1.native_ += var2;
      var1.implements_ += var2;
      var1.finally_ += var2;
   }

   private OY class_(OY var1, OY var2) {
      return this.case_ != null && var1.break_.throws_.contains(this.case_) ? this.case_ : var2;
   }

   private float class_(float var1, int var2, float var3) {
      this.implements_ += var1;
      this.private_ = var2;
      if (this.implements_ < var3) {
         var3 = this.implements_;
      }

      for (OY var5 : this.throws_) {
         var3 = var5.class_(var1 + this.finally_, var2 + 1, var3);
      }

      return var3;
   }

   private void class_(float var1) {
      this.implements_ += var1;

      for (OY var3 : this.throws_) {
         var3.class_(var1);
      }
   }

   private void class_() {
      if (this.throws_.isEmpty()) {
         if (this.byte_ != null) {
            this.implements_ = this.byte_.implements_ + 1.0F;
         } else {
            this.implements_ = 0.0F;
         }
      } else {
         OY var1 = null;

         for (OY var3 : this.throws_) {
            var3.class_();
            var1 = var3.class_(var1 == null ? var3 : var1);
         }

         this.break_();
         float var4 = (this.throws_.get(0).implements_ + this.throws_.get(this.throws_.size() - 1).implements_) / 2.0F;
         if (this.byte_ != null) {
            this.implements_ = this.byte_.implements_ + 1.0F;
            this.finally_ = this.implements_ - var4;
         } else {
            this.implements_ = var4;
         }
      }
   }

   private void break_() {
      float var1 = 0.0F;
      float var2 = 0.0F;

      for (int var3 = this.throws_.size() - 1; var3 >= 0; var3--) {
         OY var4 = this.throws_.get(var3);
         var4.implements_ += var1;
         var4.finally_ += var1;
         var2 += var4.extends_;
         var1 += var4.native_ + var2;
      }
   }

   private void throws_() {
      if (this.class_.byte_() != null) {
         this.class_.byte_().class_((float)this.private_, this.implements_);
      }

      if (!this.throws_.isEmpty()) {
         for (OY var2 : this.throws_) {
            var2.throws_();
         }
      }
   }

   private OY protected_() {
      if (this.catch_ != null) {
         return this.catch_;
      } else {
         return !this.throws_.isEmpty() ? this.throws_.get(this.throws_.size() - 1) : null;
      }
   }
}

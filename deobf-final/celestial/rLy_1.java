package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class rLy_1 {
   protected final is_3 break_;
   protected final rYB byte_;
   protected rLC protected_;
   protected double throws_;
   protected int case_;
   protected int catch_;
   protected rjU_2 private_ = rjU_2.class_;
   protected rja_3 implements_ = rja_3.case_;
   protected long finally_;
   protected long extends_;
   protected double native_;
   protected float volatile_ = 0.5F;
   protected boolean final_;
   protected long package_;
   protected rLn_1 int_;
   private rfH_2 class_;
   private int new_;
   private float continue_ = 1.0F;
   private final rLl_1 super_;
   private boolean this_;

   public void byte_(boolean var1) {
      this.int_.byte_(var1);
   }

   protected abstract rjU_2 byte_();

   public rLn_1 int_() {
      return this.int_;
   }

   public rLy_1(is_3 var1, rYB var2) {
      this.break_ = var1;
      this.byte_ = var2;
      int var3 = rfU_2.byte_(var1.class_(iQ_2.break_) * 16.0);
      this.super_ = this.class_(var3);
   }

   public void class_() {
      this.case_++;
      if (this.final_) {
         this.implements_();
      }

      if (!this.native_()) {
         if (this.break_()) {
            this.extends_();
         } else if (this.protected_ != null && !this.protected_.byte_()) {
            rjU_2 var1 = this.byte_();
            rjU_2 var2 = this.protected_.class_(this.break_);
            if (var1.byte_ > var2.byte_
               && !this.break_.BL()
               && rfU_2.byte_(var1.break_) == rfU_2.byte_(var2.break_)
               && rfU_2.byte_(var1.protected_) == rfU_2.byte_(var2.protected_)) {
               this.protected_.class_();
            }
         }

         ruP_2.class_(this.byte_, this.break_, this.protected_, this.volatile_);
         if (!this.native_()) {
            rjU_2 var3 = this.protected_.class_(this.break_);
            rfH_2 var4 = new rfH_2(var3);
            this.break_
               .super_()
               .class_(var3.break_, this.byte_.byte_(var4.break_()).catch_() ? var3.byte_ : rLf_1.class_(this.byte_, var4), var3.protected_, this.throws_);
         }
      }
   }

   public boolean class_(rLC var1, double var2) {
      if (var1 == null) {
         this.protected_ = null;
         return false;
      } else {
         if (!var1.class_(this.protected_)) {
            this.protected_ = var1;
         }

         if (this.native_()) {
            return false;
         } else {
            this.protected_();
            if (this.protected_.throws_() <= 0) {
               return false;
            } else {
               this.throws_ = var2;
               rjU_2 var4 = this.byte_();
               this.catch_ = this.case_;
               this.private_ = var4;
               return true;
            }
         }
      }
   }

   public boolean class_(an_3 var1, double var2) {
      rLC var4 = this.class_(var1, 1);
      return var4 != null && this.class_(var4, var2);
   }

   public boolean class_(double var1, double var3, double var5, double var7) {
      return this.class_(this.class_(var1, var3, var5, 1), var7);
   }

   public rLC class_(an_3 var1, int var2) {
      return this.class_(ImmutableSet.of(var1.Bs()), 16, true, var2);
   }

   protected rLC class_(Set<rfH_2> var1, int var2, boolean var3, int var4) {
      if (var1.isEmpty()) {
         return null;
      } else if (this.break_.re() < 0.0) {
         return null;
      } else if (!this.break_()) {
         return null;
      } else if (this.protected_ != null && !this.protected_.byte_() && var1.contains(this.class_)) {
         return this.protected_;
      } else {
         float var5 = (float)this.break_.class_(iQ_2.break_);
         rfH_2 var6 = var3 ? this.break_.Bs().final_() : this.break_.Bs();
         int var7 = (int)(var5 + (float)var2);
         rRU var8 = new rRU(this.byte_, var6.break_(-var7, -var7, -var7), var6.break_(var7, var7, var7));
         rLC var9 = this.super_.class_(var8, this.break_, var1, var5, var4, this.continue_);
         if (var9 != null && var9.volatile_() != null) {
            this.class_ = var9.volatile_();
            this.new_ = var4;
            this.super_();
         }

         return var9;
      }
   }

   protected abstract boolean class_(rjU_2 var1, rjU_2 var2, int var3, int var4, int var5);

   protected void class_(rjU_2 var1) {
      if (this.case_ - this.catch_ > 100) {
         if (var1.implements_(this.private_) < 2.25) {
            this.this_ = true;
            this.final_();
         } else {
            this.this_ = false;
         }

         this.catch_ = this.case_;
         this.private_ = var1;
      }

      if (this.protected_ != null && !this.protected_.byte_()) {
         rfH_2 var2 = this.protected_.catch_();
         if (var2.equals(this.implements_)) {
            this.finally_ = this.finally_ + (rqR_2.break_() - this.extends_);
         } else {
            this.implements_ = var2;
            double var3 = var1.case_(rjU_2.protected_(this.implements_));
            this.native_ = this.break_.sB() > 0.0F ? var3 / (double)this.break_.sB() * 1000.0 : 0.0;
         }

         if (this.native_ > 0.0 && (double)this.finally_ > this.native_ * 3.0) {
            this.throws_();
         }

         this.extends_ = rqR_2.break_();
      }
   }

   public boolean class_(rfH_2 var1) {
      rfH_2 var2 = var1.break_();
      return this.byte_.byte_(var2).implements_(this.byte_, var2);
   }

   public rLC class_(Stream<rfH_2> var1, int var2) {
      return this.class_(var1.collect(Collectors.toSet()), 8, false, var2);
   }

   public final rLC class_(double var1, double var3, double var5, int var7) {
      return this.class_(new rfH_2(var1, var3, var5), var7);
   }

   protected abstract rLl_1 class_(int var1);

   public void class_(double var1) {
      this.throws_ = var1;
   }

   public rLC class_(rfH_2 var1, int var2) {
      return this.class_(ImmutableSet.of(var1), 8, false, var2);
   }

   public rLC class_(Set<rfH_2> var1, int var2) {
      return this.class_(var1, 8, false, var2);
   }

   public void class_(float var1) {
      this.continue_ = var1;
   }

   public void break_(rfH_2 var1) {
      if (this.protected_ != null && !this.protected_.byte_() && this.protected_.throws_() != 0) {
         rLq_1 var2 = this.protected_.protected_();
         rjU_2 var3 = new rjU_2(
            ((double)var2.class_ + this.break_.rx()) / 2.0, ((double)var2.break_ + this.break_.re()) / 2.0, ((double)var2.byte_ + this.break_.BO()) / 2.0
         );
         if (var1.class_(var3, (double)(this.protected_.throws_() - this.protected_.case_()))) {
            this.implements_();
         }
      }
   }

   protected abstract boolean break_();

   private boolean break_(rjU_2 var1) {
      if (this.protected_.case_() + 1 >= this.protected_.throws_()) {
         return false;
      } else {
         rjU_2 var2 = rjU_2.protected_(this.protected_.catch_());
         if (!var1.class_(var2, 2.0)) {
            return false;
         } else {
            rjU_2 var3 = rjU_2.protected_(this.protected_.protected_(this.protected_.case_() + 1));
            rjU_2 var4 = var3.protected_(var2);
            rjU_2 var5 = var1.protected_(var2);
            return var4.break_(var5) > 0.0;
         }
      }
   }

   private void throws_() {
      this.super_();
      this.final_();
   }

   public rLC finally_() {
      return this.protected_;
   }

   public rfH_2 catch_() {
      return this.class_;
   }

   protected void extends_() {
      rjU_2 var1 = this.byte_();
      this.volatile_ = this.break_.PN() > 0.75F ? this.break_.PN() / 2.0F : 0.75F - this.break_.PN() / 2.0F;
      rfH_2 var2 = this.protected_.catch_();
      double var3 = Math.abs(this.break_.rx() - ((double)var2.b_() + 0.5));
      double var5 = Math.abs(this.break_.re() - (double)var2.c_());
      double var7 = Math.abs(this.break_.BO() - ((double)var2.d_() + 0.5));
      boolean var9 = var3 < (double)this.volatile_ && var7 < (double)this.volatile_ && var5 < 1.0;
      if (var9 || this.break_.break_(this.protected_.private_().native_) && this.break_(var1)) {
         this.protected_.class_();
      }

      this.class_(var1);
   }

   public void case_() {
      this.continue_ = 1.0F;
   }

   public boolean continue_() {
      return this.this_;
   }

   public void implements_() {
      if (this.byte_.r() - this.package_ > 20L) {
         if (this.class_ != null) {
            this.protected_ = null;
            this.protected_ = this.class_(this.class_, this.new_);
            this.package_ = this.byte_.r();
            this.final_ = false;
         }
      } else {
         this.final_ = true;
      }
   }

   public boolean new_() {
      return this.int_.throws_();
   }

   protected boolean package_() {
      return this.break_.Pa() || this.break_.ry();
   }

   private void super_() {
      this.implements_ = rja_3.case_;
      this.finally_ = 0L;
      this.native_ = 0.0;
      this.this_ = false;
   }

   protected void protected_() {
      if (this.protected_ != null) {
         for (int var1 = 0; var1 < this.protected_.throws_(); var1++) {
            rLq_1 var2 = this.protected_.class_(var1);
            rLq_1 var3 = var1 + 1 < this.protected_.throws_() ? this.protected_.class_(var1 + 1) : null;
            xc_3 var4 = this.byte_.byte_(new rfH_2(var2.class_, var2.break_, var2.byte_));
            if (var4.class_(xu_3.Sb)) {
               this.protected_.class_(var1, var2.class_(var2.class_, var2.break_ + 1, var2.byte_));
               if (var3 != null && var2.break_ >= var3.break_) {
                  this.protected_.class_(var1 + 1, var2.class_(var3.class_, var2.break_ + 1, var3.byte_));
               }
            }
         }
      }
   }

   public boolean private_() {
      return this.final_;
   }

   public void final_() {
      this.protected_ = null;
   }

   public boolean volatile_() {
      return !this.native_();
   }

   public boolean native_() {
      return this.protected_ == null || this.protected_.byte_();
   }
}

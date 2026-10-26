package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class rJD extends rJr_1 {
   private final rpq_3 protected_;
   private final rpj_3 catch_ = rpj_3.class_();
   private final rYB private_;
   private List<rWu_1> implements_ = Lists.newArrayList();
   private rdn_3 finally_ = rdn_3.break_;
   long extends_;
   final rJY class_;
   final rJY break_;
   Runnable native_ = () -> {
   };
   public final rXu_1 byte_ = new rJU(this, 1);
   final rXd_1 volatile_ = new rXd_1();

   public int byte_() {
      return this.implements_.size();
   }

   public rJD(int var1, rhz_3 var2) {
      this(var1, var2, rpq_3.class_);
   }

   public rJD(int var1, rhz_3 var2, rpq_3 var3) {
      super(rJP.public_, var1);
      this.protected_ = var3;
      this.private_ = (rYB)var2.throws_.throws_[7];
      this.class_ = this.break_(new rJY(this.byte_, 0, 20, 33));
      this.break_ = this.break_(new rJe_1(this, this.volatile_, 1, 143, 33, var3));

      for (int var4 = 0; var4 < 3; var4++) {
         for (int var5 = 0; var5 < 9; var5++) {
            this.break_(new rJY(var2, var5 + var4 * 9 + 9, 8 + var5 * 18, 84 + var4 * 18));
         }
      }

      for (int var6 = 0; var6 < 9; var6++) {
         this.break_(new rJY(var2, var6, 8 + var6 * 18, 142));
      }

      this.class_(this.catch_);
   }

   public void class_(Runnable var1) {
      this.native_ = var1;
   }

   @Override
   public void class_(rXu_1 var1) {
      rdn_3 var2 = this.class_.class_();
      if (var2.break_() != this.finally_.break_()) {
         this.finally_ = var2.implements_();
         this.class_(var1, var2);
      }
   }

   private void class_(rXu_1 var1, rdn_3 var2) {
      this.implements_.clear();
      this.catch_.class_(-1);
      this.break_.break_(rdn_3.break_);
      if (!var2.class_()) {
         this.implements_ = this.private_.implements_().break_(rkj_3.case_, var1, this.private_);
      }
   }

   @Override
   public boolean class_(rdn_3 var1, rJY var2) {
      return var2.byte_ != this.volatile_ && super.class_(var1, var2);
   }

   @Override
   public rdn_3 class_(rhd_3 var1, int var2) {
      rdn_3 var3 = rdn_3.break_;
      rJY var4 = this.throws_.get(var2);
      if (var4 != null && var4.break_()) {
         rdn_3 var5 = var4.class_();
         rdb_3 var6 = var5.break_();
         var3 = var5.implements_();
         if (var2 == 1) {
            var6.break_(var5, (rYB)var1.throws_[7], var1);
            if (!this.class_(var5, 2, 38, true)) {
               return rdn_3.break_;
            }

            var4.class_(var5, var3);
         } else if (var2 == 0) {
            if (!this.class_(var5, 2, 38, false)) {
               return rdn_3.break_;
            }
         } else if (this.private_.implements_().class_(rkj_3.case_, new rXA(var5), this.private_).isPresent()) {
            if (!this.class_(var5, 0, 1, false)) {
               return rdn_3.break_;
            }
         } else if (var2 >= 2 && var2 < 29) {
            if (!this.class_(var5, 29, 38, false)) {
               return rdn_3.break_;
            }
         } else if (var2 >= 29 && var2 < 38 && !this.class_(var5, 2, 29, false)) {
            return rdn_3.break_;
         }

         if (var5.class_()) {
            var4.break_(rdn_3.break_);
         }

         var4.byte_();
         if (var5.char_() == var3.char_()) {
            return rdn_3.break_;
         }

         var4.class_(var1, var5);
         this.native_();
      }

      return var3;
   }

   public int class_() {
      return this.catch_.break_();
   }

   @Override
   public boolean class_(rhd_3 var1) {
      return class_(this.protected_, var1, xu_3.XG);
   }

   @Override
   public boolean break_(rhd_3 var1, int var2) {
      if (this.protected_(var2)) {
         this.catch_.class_(var2);
         this.throws_();
      }

      return true;
   }

   @Override
   public void break_(rhd_3 var1) {
      super.break_(var1);
      this.volatile_.native_(1);
      this.protected_.class_((var2, var3) -> this.class_(var1, (rYB)var1.throws_[7], this.byte_));
   }

   public List<rWu_1> break_() {
      return this.implements_;
   }

   void throws_() {
      if (!this.implements_.isEmpty() && this.protected_(this.catch_.break_())) {
         rWu_1 var1 = this.implements_.get(this.catch_.break_());
         this.volatile_.class_(var1);
         this.break_.break_(var1.class_(this.byte_));
      } else {
         this.break_.break_(rdn_3.break_);
      }

      this.native_();
   }

   @Override
   public rJP<?> finally_() {
      return rJP.public_;
   }

   private boolean protected_(int var1) {
      return var1 >= 0 && var1 < this.implements_.size();
   }

   public boolean protected_() {
      return this.class_.break_() && !this.implements_.isEmpty();
   }
}

package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Predicate;

public class rhz_3 implements rXu_1, rpA_2 {
   public final rqs_3<rdn_3> class_ = rqs_3.class_(36, rdn_3.break_);
   public final rqs_3<rdn_3> break_ = rqs_3.class_(4, rdn_3.break_);
   public final rqs_3<rdn_3> byte_ = rqs_3.class_(1, rdn_3.break_);
   private final List<rqs_3<rdn_3>> case_ = ImmutableList.of(this.class_, this.break_, this.byte_);
   public int protected_;
   public final rhd_3 throws_;
   private rdn_3 catch_ = rdn_3.break_;
   private int private_;

   public int byte_(rdn_3 var1) {
      for (int var2 = 0; var2 < this.class_.size(); var2++) {
         rdn_3 var3 = this.class_.get(var2);
         if (!this.class_.get(var2).class_() && this.break_(var1, this.class_.get(var2)) && !this.class_.get(var2).case_() && !var3.public_() && !var3.this_()) {
            return var2;
         }
      }

      return -1;
   }

   @Override
   public boolean byte_(rhd_3 var1) {
      return this.throws_.throws_[27] ? false : !(var1.int_(this.throws_) > 64.0);
   }

   public rdn_3 byte_(int var1) {
      return this.break_.get(var1);
   }

   public rdn_3 byte_() {
      return break_(this.protected_) ? this.class_.get(this.protected_) : rdn_3.break_;
   }

   private int byte_(int var1, rdn_3 var2) {
      rdb_3 var3 = var2.break_();
      int var4 = var2.char_();
      rdn_3 var5 = this.extends_(var1);
      if (var5.class_()) {
         var5 = new rdn_3(var3, 0);
         if (var2.final_()) {
            var5.byte_(var2.package_().catch_());
         }

         this.break_(var1, var5);
      }

      int var6 = var4;
      if (var4 > var5.byte_() - var5.char_()) {
         var6 = var5.byte_() - var5.char_();
      }

      if (var6 > this.ab_() - var5.char_()) {
         var6 = this.ab_() - var5.char_();
      }

      if (var6 == 0) {
         return var4;
      } else {
         var4 -= var6;
         var5.case_(var6);
         var5.protected_(5);
         return var4;
      }
   }

   public rhz_3(rhd_3 var1) {
      this.throws_ = var1;
   }

   private boolean class_(rdn_3 var1, rdn_3 var2) {
      return !var1.class_() && this.break_(var1, var2) && var1.protected_() && var1.char_() < var1.byte_() && var1.char_() < this.ab_();
   }

   public void class_(rWr_1 var1) {
      for (rdn_3 var3 : this.class_) {
         var1.class_(var3);
      }
   }

   public boolean class_(rlb_3<rdb_3> var1) {
      for (List var3 : this.case_) {
         for (rdn_3 var5 : var3) {
            if (!var5.class_() && var1.class_(var5.break_())) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean class_(int var1, rdn_3 var2) {
      if (var2.class_()) {
         return false;
      } else {
         try {
            if (var2.case_()) {
               if (var1 == -1) {
                  var1 = this.throws_();
               }

               if (var1 >= 0) {
                  this.class_.set(var1, var2.implements_());
                  this.class_.get(var1).protected_(5);
                  var2.throws_(0);
                  return true;
               } else if (((rhx_3)this.throws_.implements_[18]).protected_) {
                  var2.throws_(0);
                  return true;
               } else {
                  return false;
               }
            } else {
               int var3;
               do {
                  var3 = var2.char_();
                  if (var1 == -1) {
                     var2.throws_(this.finally_(var2));
                  } else {
                     var2.throws_(this.byte_(var1, var2));
                  }
               } while (!var2.class_() && var2.char_() < var3);

               if (var2.char_() == var3 && ((rhx_3)this.throws_.implements_[18]).protected_) {
                  var2.throws_(0);
                  return true;
               } else {
                  return var2.char_() < var3;
               }
            }
         } catch (Throwable var6) {
            KY var4 = KY.class_(var6, "Adding item to inventory");
            Ko_1 var5 = var4.class_("Item being added");
            var5.class_("Item ID", rdb_3.class_(var2.break_()));
            var5.class_("Item data", var2.catch_());
            var5.class_("Item name", () -> var2.continue_().getString());
            throw new KU(var4);
         }
      }
   }

   public void class_(rye_3 var1, float var2) {
      if (!(var2 <= 0.0F)) {
         var2 /= 4.0F;
         if (var2 < 1.0F) {
            var2 = 1.0F;
         }

         for (int var3 = 0; var3 < this.break_.size(); var3++) {
            rdn_3 var4 = this.break_.get(var3);
            if ((!var1.int_() || !var4.break_().else_()) && var4.break_() instanceof rxS_2) {
               int var5 = var3;
               var4.class_((int)var2, this.throws_, var1x -> var1x.break_(rXQ.class_(rXN.ARMOR, var5)));
            }
         }
      }
   }

   public void class_(rYB var1, rdn_3 var2) {
      if (!var1.continue_) {
         while (!var2.class_()) {
            int var3 = this.protected_(var2);
            if (var3 == -1) {
               var3 = this.throws_();
            }

            if (var3 == -1) {
               this.throws_.class_(var2, false);
               break;
            }

            int var4 = var2.byte_() - this.extends_(var3).char_();
            if (this.class_(var3, var2.class_(var4))) {
               ((rhN_2)this.throws_).class_.class_(new rFM(-2, var3, this.extends_(var3)));
            }
         }
      }
   }

   @Override
   public rdn_3 class_(int var1, int var2) {
      rqs_3 var3 = null;

      for (rqs_3 var5 : this.case_) {
         if (var1 < var5.size()) {
            var3 = var5;
            break;
         }

         var1 -= var5.size();
      }

      return var3 != null && !((rdn_3)var3.get(var1)).class_() ? rXC.class_(var3, var1, var2) : rdn_3.break_;
   }

   public float class_(xc_3 var1) {
      return this.class_(this.class_.get(this.protected_), var1);
   }

   public rcy_3 class_(rcy_3 var1) {
      for (int var2 = 0; var2 < this.class_.size(); var2++) {
         if (!this.class_.get(var2).class_()) {
            rcd_3 var3 = new rcd_3();
            var3.class_("Slot", (byte)var2);
            this.class_.get(var2).break_(var3);
            var1.add(var3);
         }
      }

      for (int var4 = 0; var4 < this.break_.size(); var4++) {
         if (!this.break_.get(var4).class_()) {
            rcd_3 var6 = new rcd_3();
            var6.class_("Slot", (byte)(var4 + 100));
            this.break_.get(var4).break_(var6);
            var1.add(var6);
         }
      }

      for (int var5 = 0; var5 < this.byte_.size(); var5++) {
         if (!this.byte_.get(var5).class_()) {
            rcd_3 var7 = new rcd_3();
            var7.class_("Slot", (byte)(var5 + 150));
            this.byte_.get(var5).break_(var7);
            var1.add(var7);
         }
      }

      return var1;
   }

   public void class_(int var1) {
      this.protected_ = this.case_();
      rdn_3 var2 = this.class_.get(this.protected_);
      this.class_.set(this.protected_, this.class_.get(var1));
      this.class_.set(var1, var2);
   }

   public void class_(rdn_3 var1) {
      int var2 = this.break_(var1);
      if (break_(var2)) {
         this.protected_ = var2;
      } else if (var2 == -1) {
         this.protected_ = this.case_();
         if (!this.class_.get(this.protected_).class_()) {
            int var3 = this.throws_();
            if (var3 != -1) {
               this.class_.set(var3, this.class_.get(this.protected_));
            }
         }

         this.class_.set(this.protected_, var1);
      } else {
         this.class_(var2);
      }
   }

   public int class_(Predicate<rdn_3> var1, int var2, rXu_1 var3) {
      int var4 = 0;
      boolean var5 = var2 == 0;
      var4 += rXC.class_(this, var1, var2 - var4, var5);
      var4 += rXC.class_(var3, var1, var2 - var4, var5);
      var4 += rXC.class_(this.catch_, var1, var2 - var4, var5);
      if (this.catch_.class_()) {
         this.catch_ = rdn_3.break_;
      }

      return var4;
   }

   public void class_(double var1) {
      if (var1 > 0.0) {
         var1 = 1.0;
      }

      if (var1 < 0.0) {
         var1 = -1.0;
      }

      this.protected_ = (int)((double)this.protected_ - var1);

      while (this.protected_ < 0) {
         this.protected_ += 9;
      }

      while (this.protected_ >= 9) {
         this.protected_ -= 9;
      }
   }

   public void class_(rhz_3 var1) {
      for (int var2 = 0; var2 < this.else_(); var2++) {
         this.break_(var2, var1.extends_(var2));
      }

      this.protected_ = var1.protected_;
   }

   public float class_(rdn_3 var1, xc_3 var2) {
      return var1 == null ? this.class_(var2) : var1.class_(var2);
   }

   @Override
   public rgP_2 g() {
      return new rgn_3("container.inventory");
   }

   @Override
   public void break_() {
      this.private_++;
   }

   public int break_(rdn_3 var1) {
      for (int var2 = 0; var2 < this.class_.size(); var2++) {
         if (!this.class_.get(var2).class_() && this.break_(var1, this.class_.get(var2))) {
            return var2;
         }
      }

      return -1;
   }

   public static boolean break_(int var0) {
      return var0 >= 0 && var0 < 9;
   }

   public void break_(rcy_3 var1) {
      this.class_.clear();
      this.break_.clear();
      this.byte_.clear();

      for (int var2 = 0; var2 < var1.size(); var2++) {
         rcd_3 var3 = var1.class_(var2);
         int var4 = var3.case_("Slot") & 255;
         rdn_3 var5 = rdn_3.class_(var3);
         if (!var5.class_()) {
            if (var4 >= 0 && var4 < this.class_.size()) {
               this.class_.set(var4, var5);
            } else if (var4 >= 100 && var4 < this.break_.size() + 100) {
               this.break_.set(var4 - 100, var5);
            } else if (var4 >= 150 && var4 < this.byte_.size() + 150) {
               this.byte_.set(var4 - 150, var5);
            }
         }
      }
   }

   @Override
   public void break_(int var1, rdn_3 var2) {
      rqs_3 var3 = null;

      for (rqs_3 var5 : this.case_) {
         if (var1 < var5.size()) {
            var3 = var5;
            break;
         }

         var1 -= var5.size();
      }

      if (var3 != null) {
         var3.set(var1, var2);
      }
   }

   private boolean break_(rdn_3 var1, rdn_3 var2) {
      return var1.break_() == var2.break_() && rdn_3.class_(var1, var2);
   }

   public boolean throws_(rdn_3 var1) {
      return this.class_(-1, var1);
   }

   public int throws_() {
      for (int var1 = 0; var1 < this.class_.size(); var1++) {
         if (this.class_.get(var1).class_()) {
            return var1;
         }
      }

      return -1;
   }

   private int finally_(rdn_3 var1) {
      int var2 = this.protected_(var1);
      if (var2 == -1) {
         var2 = this.throws_();
      }

      return var2 == -1 ? var1.char_() : this.byte_(var2, var1);
   }

   public rdn_3 finally_() {
      return this.catch_;
   }

   public void catch_(rdn_3 var1) {
      for (rqs_3 var3 : this.case_) {
         for (int var4 = 0; var4 < var3.size(); var4++) {
            if (var3.get(var4) == var1) {
               var3.set(var4, rdn_3.break_);
               break;
            }
         }
      }
   }

   public void catch_() {
      for (rqs_3 var2 : this.case_) {
         for (int var3 = 0; var3 < var2.size(); var3++) {
            if (!((rdn_3)var2.get(var3)).class_()) {
               ((rdn_3)var2.get(var3)).class_((rYB)this.throws_.throws_[7], this.throws_, var3, this.protected_ == var3);
            }
         }
      }
   }

   public List<rqs_3<rdn_3>> extends_() {
      return this.case_;
   }

   private int extends_(rdn_3 var1) {
      int var2 = this.protected_(var1);
      if (var2 == -1) {
         var2 = this.throws_();
      }

      return var2 == -1 ? var1.char_() : this.protected_(var2, var1);
   }

   @Override
   public rdn_3 extends_(int var1) {
      rqs_3 var2 = null;

      for (rqs_3 var4 : this.case_) {
         if (var1 < var4.size()) {
            var2 = var4;
            break;
         }

         var1 -= var4.size();
      }

      return var2 == null ? rdn_3.break_ : (rdn_3)var2.get(var1);
   }

   public int case_() {
      for (int var1 = 0; var1 < 9; var1++) {
         int var2 = (this.protected_ + var1) % 9;
         if (this.class_.get(var2).class_()) {
            return var2;
         }
      }

      for (int var3 = 0; var3 < 9; var3++) {
         int var4 = (this.protected_ + var3) % 9;
         if (!this.class_.get(var4).public_()) {
            return var4;
         }
      }

      return this.protected_;
   }

   public boolean case_(rdn_3 var1) {
      if (var1.class_()) {
         return false;
      } else {
         try {
            var1 = var1.implements_();
            if (var1.case_()) {
               int var7 = this.throws_();
               if (var7 >= 0) {
                  var1.throws_(0);
                  return true;
               } else if (((rhx_3)this.throws_.implements_[18]).protected_) {
                  var1.throws_(0);
                  return true;
               } else {
                  return false;
               }
            } else {
               int var2;
               do {
                  var2 = var1.char_();
                  var1.throws_(this.extends_(var1));
               } while (!var1.class_() && var1.char_() < var2);

               if (var1.char_() == var2 && ((rhx_3)this.throws_.implements_[18]).protected_) {
                  var1.throws_(0);
                  return true;
               } else {
                  return var1.char_() < var2;
               }
            }
         } catch (Throwable var6) {
            KY var3 = KY.class_(var6, "Adding item to inventory");
            Ko_1 var4 = var3.class_("Item being added");
            var4.class_("Item ID", rdb_3.class_(var1.break_()));
            var4.class_("Item data", var1.catch_());
            rdn_3 var5 = var1;
            var4.class_("Item name", () -> var5.continue_().getString());
            throw new KU(var3);
         }
      }
   }

   @Override
   public int else_() {
      return this.class_.size() + this.break_.size() + this.byte_.size();
   }

   public int implements_() {
      return this.private_;
   }

   public boolean implements_(rdn_3 var1) {
      for (List var3 : this.case_) {
         for (rdn_3 var5 : var3) {
            if (!var5.class_() && var5.class_(var1)) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean return_() {
      for (rdn_3 var2 : this.class_) {
         if (!var2.class_()) {
            return false;
         }
      }

      for (rdn_3 var5 : this.break_) {
         if (!var5.class_()) {
            return false;
         }
      }

      for (rdn_3 var6 : this.byte_) {
         if (!var6.class_()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void public_() {
      for (List var2 : this.case_) {
         var2.clear();
      }
   }

   public static int protected_() {
      return 9;
   }

   public int protected_(rdn_3 var1) {
      if (this.class_(this.extends_(this.protected_), var1)) {
         return this.protected_;
      } else if (this.class_(this.extends_(40), var1)) {
         return 40;
      } else {
         for (int var2 = 0; var2 < this.class_.size(); var2++) {
            if (this.class_(this.class_.get(var2), var1)) {
               return var2;
            }
         }

         return -1;
      }
   }

   private int protected_(int var1, rdn_3 var2) {
      rdb_3 var3 = var2.break_();
      int var4 = var2.char_();
      rdn_3 var5 = this.extends_(var1);
      if (var5.class_()) {
         var5 = new rdn_3(var3, 0);
         if (var2.final_()) {
            var5.byte_(var2.package_().catch_());
         }
      }

      int var6 = var4;
      if (var4 > var5.byte_() - var5.char_()) {
         var6 = var5.byte_() - var5.char_();
      }

      if (var6 > this.ab_() - var5.char_()) {
         var6 = this.ab_() - var5.char_();
      }

      if (var6 != 0) {
         var4 -= var6;
      }

      return var4;
   }

   public void private_(rdn_3 var1) {
      this.catch_ = var1;
   }

   public void private_() {
      for (List var2 : this.case_) {
         for (int var3 = 0; var3 < var2.size(); var3++) {
            rdn_3 var4 = (rdn_3)var2.get(var3);
            if (!var4.class_()) {
               this.throws_.class_(var4, true, false);
               var2.set(var3, rdn_3.break_);
            }
         }
      }
   }

   @Override
   public rdn_3 native_(int var1) {
      rqs_3 var2 = null;

      for (rqs_3 var4 : this.case_) {
         if (var1 < var4.size()) {
            var2 = var4;
            break;
         }

         var1 -= var4.size();
      }

      if (var2 != null && !((rdn_3)var2.get(var1)).class_()) {
         rdn_3 var5 = (rdn_3)var2.get(var1);
         var2.set(var1, rdn_3.break_);
         return var5;
      } else {
         return rdn_3.break_;
      }
   }
}

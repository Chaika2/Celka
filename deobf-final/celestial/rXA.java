package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class rXA implements rXZ, rXu_1 {
   private final int class_;
   private final rqs_3<rdn_3> break_;
   private List<rXm_1> byte_;

   @Override
   public boolean byte_(rhd_3 var1) {
      return true;
   }

   private void byte_(rdn_3 var1) {
      for (int var2 = 0; var2 < this.class_; var2++) {
         rdn_3 var3 = this.extends_(var2);
         if (var3.class_()) {
            this.break_(var2, var1.implements_());
            var1.throws_(0);
            return;
         }
      }
   }

   public rcy_3 byte_() {
      rcy_3 var1 = new rcy_3();

      for (int var2 = 0; var2 < this.else_(); var2++) {
         rdn_3 var3 = this.extends_(var2);
         if (!var3.class_()) {
            var1.add(var3.break_(new rcd_3()));
         }
      }

      return var1;
   }

   public rXA(rdn_3... var1) {
      this.class_ = var1.length;
      this.break_ = rqs_3.class_(rdn_3.break_, var1);
   }

   public rXA(int var1) {
      this.class_ = var1;
      this.break_ = rqs_3.class_(var1, rdn_3.break_);
   }

   @Override
   public String toString() {
      return this.break_.stream().filter(var0 -> !var0.class_()).collect(Collectors.toList()).toString();
   }

   private boolean class_(rdn_3 var1, rdn_3 var2) {
      return var1.break_() == var2.break_() && rdn_3.class_(var1, var2);
   }

   public void class_(rXm_1 var1) {
      if (this.byte_ == null) {
         this.byte_ = Lists.newArrayList();
      }

      this.byte_.add(var1);
   }

   public void class_(rcy_3 var1) {
      for (int var2 = 0; var2 < var1.size(); var2++) {
         rdn_3 var3 = rdn_3.class_(var1.class_(var2));
         if (!var3.class_()) {
            this.class_(var3);
         }
      }
   }

   @Override
   public void class_(rWr_1 var1) {
      for (rdn_3 var3 : this.break_) {
         var1.break_(var3);
      }
   }

   public rdn_3 class_(rdb_3 var1, int var2) {
      rdn_3 var3 = new rdn_3(var1, 0);

      for (int var4 = this.class_ - 1; var4 >= 0; var4--) {
         rdn_3 var5 = this.extends_(var4);
         if (var5.break_().equals(var1)) {
            int var6 = var2 - var3.char_();
            rdn_3 var7 = var5.class_(var6);
            var3.case_(var7.char_());
            if (var3.char_() == var2) {
               break;
            }
         }
      }

      if (!var3.class_()) {
         this.break_();
      }

      return var3;
   }

   public rdn_3 class_(rdn_3 var1) {
      rdn_3 var2 = var1.implements_();
      this.protected_(var2);
      if (var2.class_()) {
         return rdn_3.break_;
      } else {
         this.byte_(var2);
         return var2.class_() ? rdn_3.break_ : var2;
      }
   }

   @Override
   public rdn_3 class_(int var1, int var2) {
      rdn_3 var3 = rXC.class_(this.break_, var1, var2);
      if (!var3.class_()) {
         this.break_();
      }

      return var3;
   }

   public boolean break_(rdn_3 var1) {
      boolean var2 = false;

      for (rdn_3 var4 : this.break_) {
         if (var4.class_() || this.class_(var4, var1) && var4.char_() < var4.byte_()) {
            var2 = true;
            break;
         }
      }

      return var2;
   }

   public void break_(rXm_1 var1) {
      this.byte_.remove(var1);
   }

   @Override
   public void break_(int var1, rdn_3 var2) {
      this.break_.set(var1, var2);
      if (!var2.class_() && var2.char_() > this.ab_()) {
         var2.throws_(this.ab_());
      }

      this.break_();
   }

   private void break_(rdn_3 var1, rdn_3 var2) {
      int var3 = Math.min(this.ab_(), var2.byte_());
      int var4 = Math.min(var1.char_(), var3 - var2.char_());
      if (var4 > 0) {
         var2.case_(var4);
         var1.catch_(var4);
         this.break_();
      }
   }

   @Override
   public void break_() {
      if (this.byte_ != null) {
         for (rXm_1 var2 : this.byte_) {
            var2.class_(this);
         }
      }
   }

   @Override
   public rdn_3 extends_(int var1) {
      return var1 >= 0 && var1 < this.break_.size() ? this.break_.get(var1) : rdn_3.break_;
   }

   @Override
   public int else_() {
      return this.class_;
   }

   @Override
   public boolean return_() {
      for (rdn_3 var2 : this.break_) {
         if (!var2.class_()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void public_() {
      this.break_.clear();
      this.break_();
   }

   private void protected_(rdn_3 var1) {
      for (int var2 = 0; var2 < this.class_; var2++) {
         rdn_3 var3 = this.extends_(var2);
         if (this.class_(var3, var1)) {
            this.break_(var1, var3);
            if (var1.class_()) {
               return;
            }
         }
      }
   }

   public List<rdn_3> protected_() {
      List var1 = this.break_.stream().filter(var0 -> !var0.class_()).collect(Collectors.toList());
      this.public_();
      return var1;
   }

   @Override
   public rdn_3 native_(int var1) {
      rdn_3 var2 = this.break_.get(var1);
      if (var2.class_()) {
         return rdn_3.break_;
      } else {
         this.break_.set(var1, rdn_3.break_);
         return var2;
      }
   }
}

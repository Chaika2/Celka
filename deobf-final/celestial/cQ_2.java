package celestial;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.suggestion.Suggestion;
import java.util.List;

public class cQ_2 {
   private final HZ break_;
   private final String byte_;
   private final List<Suggestion> protected_;
   private int throws_;
   private int case_;
   private rjK_2 catch_;
   private boolean private_;
   private int implements_;

   String byte_() {
      this.implements_ = this.case_;
      Suggestion var1 = this.protected_.get(this.case_);
      Message var2 = var1.getTooltip();
      return var2 != null
         ? jI_2.class_("narration.suggestion.tooltip", this.case_ + 1, this.protected_.size(), var1.getText(), var2.getString())
         : jI_2.class_("narration.suggestion", this.case_ + 1, this.protected_.size(), var1.getText());
   }

   cQ_2(int var1, int var2, int var3, List<Suggestion> var4, boolean var5, boolean var6) {
      this.class_ = var1;
      this.catch_ = rjK_2.class_;
      int var7 = var2 - 1;
      int var8 = var1.volatile_ ? var3 - 3 - Math.min(var5.size(), var1.native_) * 12 : var3;
      this.break_ = new HZ(var7, var8, var4 + 1, Math.min(var5.size(), var1.native_) * 12);
      this.byte_ = var1.catch_.private_();
      this.implements_ = var6 ? -1 : 0;
      this.protected_ = var5;
      this.break_(0);
   }

   public void class_(int var1) {
      this.break_(this.case_ + var1);
      int var2 = this.throws_;
      int var3 = this.throws_ + this.class_.native_ - 1;
      if (this.case_ < var2) {
         this.throws_ = rfU_2.class_(this.case_, 0, Math.max(this.protected_.size() - this.class_.native_, 0));
      } else if (this.case_ > var3) {
         this.throws_ = rfU_2.class_(this.case_ + this.class_.extends_ - this.class_.native_, 0, Math.max(this.protected_.size() - this.class_.native_, 0));
      }
   }

   public void class_() {
      Suggestion var1 = this.protected_.get(this.case_);
      this.class_.synchronized_ = true;
      this.class_.catch_.class_(var1.apply(this.byte_));
      int var2 = var1.getRange().getStart() + var1.getText().length();
      this.class_.catch_.private_(var2);
      this.class_.catch_.native_(var2);
      this.break_(this.case_);
      this.class_.synchronized_ = false;
      this.private_ = true;
   }

   public void class_(Ml_1 var1, int var2, int var3) {
      int var4 = Math.min(this.protected_.size(), this.class_.native_);
      int var5 = -5592406;
      boolean var6 = this.throws_ > 0;
      boolean var7 = this.protected_.size() > this.throws_ + var4;
      boolean var8 = var6 || var7;
      boolean var9 = this.catch_.byte_ != (float)var2 || this.catch_.protected_ != (float)var3;
      if (var9) {
         this.catch_ = new rjK_2((float)var2, (float)var3);
      }

      if (var8) {
         ch_3.class_(var1, this.break_.class_(), this.break_.break_() - 1, this.break_.class_() + this.break_.byte_(), this.break_.break_(), this.class_.final_);
         ch_3.class_(
            var1,
            this.break_.class_(),
            this.break_.break_() + this.break_.protected_(),
            this.break_.class_() + this.break_.byte_(),
            this.break_.break_() + this.break_.protected_() + 1,
            this.class_.final_
         );
         if (var6) {
            for (int var10 = 0; var10 < this.break_.byte_(); var10++) {
               if (var10 % 2 == 0) {
                  ch_3.class_(var1, this.break_.class_() + var10, this.break_.break_() - 1, this.break_.class_() + var10 + 1, this.break_.break_(), -1);
               }
            }
         }

         if (var7) {
            for (int var13 = 0; var13 < this.break_.byte_(); var13++) {
               if (var13 % 2 == 0) {
                  ch_3.class_(
                     var1,
                     this.break_.class_() + var13,
                     this.break_.break_() + this.break_.protected_(),
                     this.break_.class_() + var13 + 1,
                     this.break_.break_() + this.break_.protected_() + 1,
                     -1
                  );
               }
            }
         }
      }

      boolean var14 = false;

      for (int var11 = 0; var11 < var4; var11++) {
         Suggestion var12 = this.protected_.get(var11 + this.throws_);
         ch_3.class_(
            var1,
            this.break_.class_(),
            this.break_.break_() + 12 * var11,
            this.break_.class_() + this.break_.byte_(),
            this.break_.break_() + 12 * var11 + 12,
            this.class_.final_
         );
         if (var2 > this.break_.class_()
            && var2 < this.break_.class_() + this.break_.byte_()
            && var3 > this.break_.break_() + 12 * var11
            && var3 < this.break_.break_() + 12 * var11 + 12) {
            if (var9) {
               this.break_(var11 + this.throws_);
            }

            var14 = true;
         }

         this.class_
            .private_
            .class_(
               var1,
               var12.getText(),
               (float)(this.break_.class_() + 1),
               (float)(this.break_.break_() + 2 + 12 * var11),
               var11 + this.throws_ == this.case_ ? -256 : -5592406
            );
      }

      if (var14) {
         Message var15 = this.protected_.get(this.case_).getTooltip();
         if (var15 != null) {
            this.class_.case_.class_(var1, rgv_3.class_(var15), var2, var3);
         }
      }
   }

   public boolean class_(double var1) {
      int var3 = (int)(
         ((Qi_1)this.class_.throws_.class_[22]).byte_() * (double)this.class_.throws_.else_().super_() / (double)this.class_.throws_.else_().new_()
      );
      int var4 = (int)(
         ((Qi_1)this.class_.throws_.class_[22]).protected_() * (double)this.class_.throws_.else_().this_() / (double)this.class_.throws_.else_().continue_()
      );
      if (this.break_.class_(var3, var4)) {
         this.throws_ = rfU_2.class_((int)((double)this.throws_ - var1), 0, Math.max(this.protected_.size() - this.class_.native_, 0));
         return true;
      } else {
         return false;
      }
   }

   public boolean class_(int var1, int var2, int var3) {
      if (!this.break_.class_(var1, var2)) {
         return false;
      } else {
         int var4 = (var2 - this.break_.break_()) / 12 + this.throws_;
         if (var4 >= 0 && var4 < this.protected_.size()) {
            this.break_(var4);
            this.class_();
         }

         return true;
      }
   }

   public void break_() {
      this.class_.this_ = null;
   }

   public boolean break_(int var1, int var2, int var3) {
      if (var1 == 265) {
         this.class_(-1);
         this.private_ = false;
         return true;
      } else if (var1 == 264) {
         this.class_(1);
         this.private_ = false;
         return true;
      } else if (var1 == 258) {
         if (this.private_) {
            this.class_(vm_3.synchronized_() ? -1 : 1);
         }

         this.class_();
         return true;
      } else if (var1 == 256) {
         this.break_();
         return true;
      } else {
         return false;
      }
   }

   public void break_(int var1) {
      this.case_ = var1;
      if (this.case_ < 0) {
         this.case_ = this.case_ + this.protected_.size();
      }

      if (this.case_ >= this.protected_.size()) {
         this.case_ = this.case_ - this.protected_.size();
      }

      Suggestion var2 = this.protected_.get(this.case_);
      this.class_.catch_.byte_(cW_2.class_(this.class_.catch_.private_(), var2.apply(this.byte_)));
   }
}

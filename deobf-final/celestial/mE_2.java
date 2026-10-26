package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class mE_2 {
   private final List<mJ_2> class_ = Lists.newArrayListWithCapacity(20);
   private mJ_2 break_;
   private final mb_3 byte_ = new mb_3();
   private QY protected_;
   private final List<mS_2> throws_ = Lists.newArrayList();
   private List<mG_2> case_;
   private Lm_1 catch_;
   private Lm_1 private_;
   private int implements_;
   private int finally_;
   private rkU_2 extends_;
   private rkw_3<?> native_;
   private mG_2 volatile_;

   public void byte_() {
      this.byte_.class_(false);
   }

   public mE_2() {
      for (int var1 = 0; var1 < 20; var1++) {
         this.class_.add(new mJ_2());
      }
   }

   public void class_(Ml_1 var1, int var2, int var3, int var4, int var5, float var6) {
      if (this.implements_ > 1) {
         String var7 = this.finally_ + 1 + "/" + this.implements_;
         int var8 = ((cm_3)this.protected_.class_[15]).break_(var7);
         ((cm_3)this.protected_.class_[15]).break_(var1, var7, (float)(var2 - var8 / 2 + 73), (float)(var3 + 141), -1);
      }

      this.break_ = null;

      for (mJ_2 var10 : this.class_) {
         var10.class_(var1, var4, var5, var6);
         if (var10.new_ && var10.B_()) {
            this.break_ = var10;
         }
      }

      this.private_.class_(var1, var4, var5, var6);
      this.catch_.class_(var1, var4, var5, var6);
      this.byte_.class_(var1, var4, var5, var6);
   }

   public void class_(Ml_1 var1, int var2, int var3) {
      if ((vm_3)this.protected_.class_[73] != null && this.break_ != null && !this.byte_.throws_()) {
         ((vm_3)this.protected_.class_[73]).class_(var1, this.break_.class_((vm_3)this.protected_.class_[73]), var2, var3);
      }
   }

   public rkw_3<?> class_() {
      return this.native_;
   }

   public void class_(List<rkw_3<?>> var1) {
      for (mS_2 var3 : this.throws_) {
         var3.class_(var1);
      }
   }

   public boolean class_(double var1, double var3, int var5, int var6, int var7, int var8, int var9) {
      this.native_ = null;
      this.volatile_ = null;
      if (this.byte_.throws_()) {
         if (this.byte_.break_(var1, var3, var5)) {
            this.native_ = this.byte_.protected_();
            this.volatile_ = this.byte_.class_();
         } else {
            this.byte_.class_(false);
         }

         return true;
      } else if (this.catch_.break_(var1, var3, var5)) {
         this.finally_++;
         this.case_();
         return true;
      } else if (this.private_.break_(var1, var3, var5)) {
         this.finally_--;
         this.case_();
         return true;
      } else {
         for (mJ_2 var11 : this.class_) {
            if (var11.break_(var1, var3, var5)) {
               if (var5 == 0) {
                  this.native_ = var11.throws_();
                  this.volatile_ = var11.class_();
               } else if (var5 == 1 && !this.byte_.throws_() && !var11.protected_()) {
                  this.byte_
                     .class_(this.protected_, var11.class_(), var11.volatile_, var11.final_, var6 + var8 / 2, var7 + 13 + var9 / 2, (float)var11.case_());
               }

               return true;
            }
         }

         return false;
      }
   }

   public void class_(ms_3 var1) {
      this.throws_.remove(var1);
      this.throws_.add(var1);
   }

   public void class_(QY var1, int var2, int var3) {
      this.protected_ = var1;
      this.extends_ = ((cb_3)var1.class_[57]).Z();

      for (int var4 = 0; var4 < this.class_.size(); var4++) {
         this.class_.get(var4).class_(var2 + 11 + 25 * (var4 % 5), var3 + 31 + 25 * (var4 / 5));
      }

      this.catch_ = new Lm_1(var2 + 93, var3 + 137, 12, 17, false);
      this.catch_.class_(1, 208, 13, 18, ms_3.class_);
      this.private_ = new Lm_1(var2 + 38, var3 + 137, 12, 17, true);
      this.private_.class_(1, 208, 13, 18, ms_3.class_);
   }

   public void class_(List<mG_2> var1, boolean var2) {
      this.case_ = var1;
      this.implements_ = (int)Math.ceil((double)var1.size() / 20.0);
      if (this.implements_ <= this.finally_ || var2) {
         this.finally_ = 0;
      }

      this.case_();
   }

   public mG_2 break_() {
      return this.volatile_;
   }

   public rkU_2 throws_() {
      return this.extends_;
   }

   private void catch_() {
      this.catch_.new_ = this.implements_ > 1 && this.finally_ < this.implements_ - 1;
      this.private_.new_ = this.implements_ > 1 && this.finally_ > 0;
   }

   private void case_() {
      int var1 = 20 * this.finally_;

      for (int var2 = 0; var2 < this.class_.size(); var2++) {
         mJ_2 var3 = this.class_.get(var2);
         if (var1 + var2 < this.case_.size()) {
            mG_2 var4 = this.case_.get(var1 + var2);
            var3.class_(var4, this);
            var3.new_ = true;
         } else {
            var3.new_ = false;
         }
      }

      this.catch_();
   }

   public QY protected_() {
      return this.protected_;
   }
}

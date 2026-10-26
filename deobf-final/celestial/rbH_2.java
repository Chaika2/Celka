package celestial;

import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;

public class rbH_2 extends rbq_3 {
   private int byte_;
   private List<rfH_2> protected_;
   private rLC throws_;
   private int case_;

   @Override
   public void byte_() {
      this.byte_ = 0;
      this.case_ = 0;
      super.byte_();
   }

   private void byte_(rfH_2 var1) {
      this.protected_.add(var1);

      while (this.protected_.size() > 3) {
         this.protected_.remove(0);
      }
   }

   rbH_2(rbF_2 var1) {
      super(var1);
      this.class_ = var1;
      this.byte_ = ((rYB)this.class_.throws_[7]).int_.nextInt(10);
      this.protected_ = Lists.newArrayList();
      this.throws_ = null;
      this.class_(EnumSet.of(rBW.MOVE));
   }

   private boolean class_(rfH_2 var1) {
      rbF_2.case_(this.class_).class_(10.0F);
      rbF_2.catch_(this.class_).class_((double)var1.b_(), (double)var1.c_(), (double)var1.d_(), 1.0);
      return rbF_2.private_(this.class_).finally_() != null && rbF_2.implements_(this.class_).finally_().finally_();
   }

   boolean break_(rfH_2 var1) {
      return this.protected_.contains(var1);
   }

   @Override
   public void throws_() {
      if (this.class_.abstract_ != null) {
         this.byte_++;
         if (this.byte_ > 600) {
            this.extends_();
         } else if (!rbF_2.byte_(this.class_).volatile_()) {
            if (!this.class_.break_(this.class_.abstract_, 16)) {
               if (this.class_.native_(this.class_.abstract_)) {
                  this.native_();
               } else {
                  this.class_.finally_(this.class_.abstract_);
               }
            } else {
               boolean var1 = this.class_(this.class_.abstract_);
               if (!var1) {
                  this.extends_();
               } else if (this.throws_ != null && rbF_2.protected_(this.class_).finally_().class_(this.throws_)) {
                  this.case_++;
                  if (this.case_ > 60) {
                     this.native_();
                     this.case_ = 0;
                  }
               } else {
                  this.throws_ = rbF_2.throws_(this.class_).finally_();
               }
            }
         }
      }
   }

   void finally_() {
      this.protected_.clear();
   }

   @Override
   public boolean catch_() {
      return this.class_.abstract_ != null
         && !this.class_.k()
         && this.class_.sF()
         && !this.protected_(this.class_.abstract_)
         && ((rYB)this.class_.throws_[7]).byte_(this.class_.abstract_).class_(rls_3.k);
   }

   private void extends_() {
      if (this.class_.abstract_ != null) {
         this.byte_(this.class_.abstract_);
      }

      this.native_();
   }

   @Override
   public void protected_() {
      this.byte_ = 0;
      this.case_ = 0;
      rbF_2.class_(this.class_).final_();
      rbF_2.break_(this.class_).case_();
   }

   private boolean protected_(rfH_2 var1) {
      if (this.class_.break_(var1, 2)) {
         return true;
      } else {
         rLC var2 = rbF_2.finally_(this.class_).finally_();
         return var2 != null && var2.volatile_().equals(var1) && var2.finally_() && var2.byte_();
      }
   }

   @Override
   public boolean private_() {
      return this.catch_();
   }

   private void native_() {
      this.class_.abstract_ = null;
      this.class_.throw_ = 200;
   }
}

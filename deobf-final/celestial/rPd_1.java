package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;

public class rPd_1 extends rPm_1<rsq_3> {
   private rdn_3 class_;
   private final List<rdn_3> byte_ = Lists.newArrayList();
   private int protected_;
   private int throws_;
   private int case_;

   private iB_2 byte_(rsq_3 var1) {
      iZ_2 var2 = var1.SF();
      iB_2 var3 = var2.byte_(il_3.new_).get();
      var2.class_(il_3.final_, new rfY_2(var3, true));
      return var3;
   }

   public void byte_(rrEm_1 var1, rsq_3 var2, long var3) {
      iB_2 var5 = this.byte_(var2);
      this.class_(var5, var2);
      if (!this.byte_.isEmpty()) {
         this.protected_(var2);
      } else {
         var2.class_(rXQ.MAINHAND, rdn_3.break_);
         this.case_ = Math.min(this.case_, 40);
      }

      this.case_--;
   }

   public rPd_1(int var1, int var2) {
      super(ImmutableMap.of(il_3.new_, iC_2.VALUE_PRESENT), var1, var2);
   }

   private void class_(rsq_3 var1) {
      var1.class_(rXQ.MAINHAND, this.byte_.get(0));
   }

   private boolean class_(rdI_2 var1) {
      return rdn_3.byte_(this.class_, var1.break_()) || rdn_3.byte_(this.class_, var1.byte_());
   }

   public boolean class_(rrEm_1 var1, rsq_3 var2) {
      iZ_2 var3 = var2.SF();
      if (!var3.byte_(il_3.new_).isPresent()) {
         return false;
      } else {
         iB_2 var4 = var3.byte_(il_3.new_).get();
         return var4.BC() == aI_2.rM && var2.BM() && var4.BM() && !var2.n_() && var2.int_(var4) <= 17.0;
      }
   }

   public boolean class_(rrEm_1 var1, rsq_3 var2, long var3) {
      return this.class_(var1, var2) && this.case_ > 0 && var2.SF().byte_(il_3.new_).isPresent();
   }

   private void class_(iB_2 var1, rsq_3 var2) {
      boolean var3 = false;
      rdn_3 var4 = var1.ss();
      if (this.class_ == null || !rdn_3.byte_(this.class_, var4)) {
         this.class_ = var4;
         var3 = true;
         this.byte_.clear();
      }

      if (var3 && !this.class_.class_()) {
         this.break_(var2);
         if (!this.byte_.isEmpty()) {
            this.case_ = 900;
            this.class_(var2);
         }
      }
   }

   private void break_(rsq_3 var1) {
      for (rdI_2 var3 : var1.break_()) {
         if (!var3.int_() && this.class_(var3)) {
            this.byte_.add(var3.protected_());
         }
      }
   }

   public void break_(rrEm_1 var1, rsq_3 var2, long var3) {
      super.protected_(var1, var2, var3);
      this.byte_(var2);
      this.protected_ = 0;
      this.throws_ = 0;
      this.case_ = 40;
   }

   public void protected_(rrEm_1 var1, rsq_3 var2, long var3) {
      super.break_(var1, var2, var3);
      var2.SF().break_(il_3.new_);
      var2.class_(rXQ.MAINHAND, rdn_3.break_);
      this.class_ = null;
   }

   private void protected_(rsq_3 var1) {
      if (this.byte_.size() >= 2 && ++this.protected_ >= 40) {
         this.throws_++;
         this.protected_ = 0;
         if (this.throws_ > this.byte_.size() - 1) {
            this.throws_ = 0;
         }

         var1.class_(rXQ.MAINHAND, this.byte_.get(this.throws_));
      }
   }
}

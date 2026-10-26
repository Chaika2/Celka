package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;

public class rrm_3 extends rPm_1<rsq_3> {
   private rfH_2 class_;
   private long byte_;
   private int protected_;
   private final List<rfH_2> throws_ = Lists.newArrayList();

   protected void byte_(rrEm_1 var1, rsq_3 var2, long var3) {
      if (this.class_ == null || this.class_.class_(var2.Ps(), 1.0)) {
         if (this.class_ != null && var3 > this.byte_) {
            xc_3 var5 = var1.byte_(this.class_);
            xd_3 var6 = var5.break_();
            xd_3 var7 = var1.byte_(this.class_.break_()).break_();
            if (var6 instanceof dO_2 && ((dO_2)var6).implements_(var5)) {
               var1.class_(this.class_, true, var2);
            }

            if (var5.catch_() && var7 instanceof dy_3 && var2.sF()) {
               rXA var8 = var2.sd();

               for (int var9 = 0; var9 < var8.else_(); var9++) {
                  rdn_3 var10 = var8.extends_(var9);
                  boolean var11 = false;
                  if (!var10.class_()) {
                     if (var10.break_() == rdy_3.hP) {
                        var1.class_(this.class_, xu_3.PB.continue_(), 3);
                        var11 = true;
                     } else if (var10.break_() == rdy_3.dE) {
                        var1.class_(this.class_, xu_3.sP.continue_(), 3);
                        var11 = true;
                     } else if (var10.break_() == rdy_3.ds) {
                        var1.class_(this.class_, xu_3.sr.continue_(), 3);
                        var11 = true;
                     } else if (var10.break_() == rdy_3.kJ) {
                        var1.class_(this.class_, xu_3.bT.continue_(), 3);
                        var11 = true;
                     }
                  }

                  if (var11) {
                     var1.class_((rhd_3)null, (double)this.class_.b_(), (double)this.class_.c_(), (double)this.class_.d_(), rqn_3.PZ, rqL_2.BLOCKS, 1.0F, 1.0F);
                     var10.catch_(1);
                     if (var10.class_()) {
                        var8.break_(var9, rdn_3.break_);
                     }
                     break;
                  }
               }
            }

            if (var6 instanceof dO_2 && !((dO_2)var6).implements_(var5)) {
               this.throws_.remove(this.class_);
               this.class_ = this.class_(var1);
               if (this.class_ != null) {
                  this.byte_ = var3 + 20L;
                  var2.SF().class_(il_3.volatile_, new iH_2(new rfI_2(this.class_), 0.5F, 1));
                  var2.SF().class_(il_3.final_, new rfI_2(this.class_));
               }
            }
         }

         this.protected_++;
      }
   }

   public rrm_3() {
      super(ImmutableMap.of(il_3.final_, iC_2.VALUE_ABSENT, il_3.volatile_, iC_2.VALUE_ABSENT, il_3.case_, iC_2.VALUE_PRESENT));
   }

   private rfH_2 class_(rrEm_1 var1) {
      return this.throws_.isEmpty() ? null : this.throws_.get(var1.long_().nextInt(this.throws_.size()));
   }

   protected boolean class_(rrEm_1 var1, rsq_3 var2) {
      if (!var1.B().break_(rRu_1.break_)) {
         return false;
      } else if (var2.su().break_() != rsT_2.case_) {
         return false;
      } else {
         rfw_3 var3 = var2.Bs().new_();
         this.throws_.clear();

         for (int var4 = -1; var4 <= 1; var4++) {
            for (int var5 = -1; var5 <= 1; var5++) {
               for (int var6 = -1; var6 <= 1; var6++) {
                  var3.break_(var2.rx() + (double)var4, var2.re() + (double)var5, var2.BO() + (double)var6);
                  if (this.class_(var3, var1)) {
                     this.throws_.add(new rfH_2(var3));
                  }
               }
            }
         }

         this.class_ = this.class_(var1);
         return this.class_ != null;
      }
   }

   private boolean class_(rfH_2 var1, rrEm_1 var2) {
      xc_3 var3 = var2.byte_(var1);
      xd_3 var4 = var3.break_();
      xd_3 var5 = var2.byte_(var1.break_()).break_();
      return var4 instanceof dO_2 && ((dO_2)var4).implements_(var3) || var3.catch_() && var5 instanceof dy_3;
   }

   protected void class_(rrEm_1 var1, rsq_3 var2, long var3) {
      if (var3 > this.byte_ && this.class_ != null) {
         var2.SF().class_(il_3.final_, new rfI_2(this.class_));
         var2.SF().class_(il_3.volatile_, new iH_2(new rfI_2(this.class_), 0.5F, 1));
      }
   }

   protected void break_(rrEm_1 var1, rsq_3 var2, long var3) {
      var2.SF().break_(il_3.final_);
      var2.SF().break_(il_3.volatile_);
      this.protected_ = 0;
      this.byte_ = var3 + 40L;
   }

   protected boolean protected_(rrEm_1 var1, rsq_3 var2, long var3) {
      return this.protected_ < 200;
   }
}

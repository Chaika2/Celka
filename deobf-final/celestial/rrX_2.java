package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rrX_2 extends rPm_1<rsq_3> {
   private long class_;
   private long byte_;
   private int protected_;
   private Optional<rfH_2> throws_ = Optional.empty();

   protected void byte_(rrEm_1 var1, rsq_3 var2, long var3) {
      var2.class_(rXQ.MAINHAND, rdn_3.break_);
      this.byte_ = (long)((Integer)var2.throws_[41]).intValue();
   }

   public rrX_2() {
      super(ImmutableMap.of(il_3.final_, iC_2.VALUE_ABSENT, il_3.volatile_, iC_2.VALUE_ABSENT));
   }

   protected boolean class_(rrEm_1 var1, rsq_3 var2, long var3) {
      return this.protected_ < 80 && this.throws_.isPresent();
   }

   protected boolean class_(rrEm_1 var1, rsq_3 var2) {
      if ((Integer)var2.throws_[41] % 10 == 0 && (this.byte_ == 0L || this.byte_ + 160L <= (long)((Integer)var2.throws_[41]).intValue())) {
         if (var2.sd().class_(rdy_3.Xg) <= 0) {
            return false;
         } else {
            this.throws_ = this.break_(var1, var2);
            return this.throws_.isPresent();
         }
      } else {
         return false;
      }
   }

   private boolean class_(rfH_2 var1, rrEm_1 var2) {
      xc_3 var3 = var2.byte_(var1);
      xd_3 var4 = var3.break_();
      return var4 instanceof dO_2 && !((dO_2)var4).implements_(var3);
   }

   private void class_(rsq_3 var1) {
      this.throws_.ifPresent(var1x -> {
         rfI_2 var2 = new rfI_2(var1x);
         var1.SF().class_(il_3.final_, var2);
         var1.SF().class_(il_3.volatile_, new iH_2(var2, 0.5F, 1));
      });
   }

   private Optional<rfH_2> break_(rrEm_1 var1, rsq_3 var2) {
      rfw_3 var3 = new rfw_3();
      Optional var4 = Optional.empty();
      int var5 = 0;

      for (int var6 = -1; var6 <= 1; var6++) {
         for (int var7 = -1; var7 <= 1; var7++) {
            for (int var8 = -1; var8 <= 1; var8++) {
               var3.class_(var2.Bs(), var6, var7, var8);
               if (this.class_(var3, var1)) {
                  if (var1.int_.nextInt(++var5) == 0) {
                     var4 = Optional.of(var3.int_());
                  }
               }
            }
         }
      }

      return var4;
   }

   protected void break_(rrEm_1 var1, rsq_3 var2, long var3) {
      this.class_(var2);
      var2.class_(rXQ.MAINHAND, new rdn_3(rdy_3.Xg));
      this.class_ = var3;
      this.protected_ = 0;
   }

   protected void protected_(rrEm_1 var1, rsq_3 var2, long var3) {
      rfH_2 var5 = this.throws_.get();
      if (var3 >= this.class_ && var5.class_(var2.Ps(), 1.0)) {
         rdn_3 var6 = rdn_3.break_;
         rXA var7 = var2.sd();
         int var8 = var7.else_();

         for (int var9 = 0; var9 < var8; var9++) {
            rdn_3 var10 = var7.extends_(var9);
            if (var10.break_() == rdy_3.Xg) {
               var6 = var10;
               break;
            }
         }

         if (!var6.class_() && rxW_2.class_(var6, var1, var5)) {
            var1.byte_(2005, var5, 0);
            this.throws_ = this.break_(var1, var2);
            this.class_(var2);
            this.class_ = var3 + 40L;
         }

         this.protected_++;
      }
   }
}

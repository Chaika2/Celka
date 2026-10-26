package celestial;

import com.google.common.collect.ImmutableMap;

public class rPJ<E extends is_3 & aY_2, T extends iB_2> extends rPm_1<E> {
   private int class_;
   private rPx_1 byte_ = rPx_1.UNCHARGED;

   protected void byte_(rrEm_1 var1, E var2, long var3) {
      if (var2.return_()) {
         var2.throw_();
      }

      if (var2.class_(rdy_3.kU)) {
         ((aY_2)var2).break_(false);
         rxm_3.class_(var2.sX(), false);
      }
   }

   public rPJ() {
      super(ImmutableMap.of(il_3.final_, iC_2.REGISTERED, il_3.package_, iC_2.VALUE_PRESENT), 1200);
   }

   protected boolean class_(rrEm_1 var1, E var2) {
      iB_2 var3 = class_(var2);
      return var2.class_(rdy_3.kU) && iA_2.byte_(var2, var3) && iA_2.class_(var2, var3, 0);
   }

   private static iB_2 class_(iB_2 var0) {
      return var0.SF().byte_(il_3.package_).get();
   }

   protected boolean class_(rrEm_1 var1, E var2, long var3) {
      return var2.SF().class_(il_3.package_) && this.class_(var1, (E)var2);
   }

   private void class_(E var1, iB_2 var2) {
      if (this.byte_ == rPx_1.UNCHARGED) {
         var1.break_(rhj_3.class_(var1, rdy_3.kU));
         this.byte_ = rPx_1.CHARGING;
         ((aY_2)var1).break_(true);
      } else if (this.byte_ == rPx_1.CHARGING) {
         if (!var1.return_()) {
            this.byte_ = rPx_1.UNCHARGED;
         }

         int var3 = var1.SU();
         rdn_3 var4 = var1.sX();
         if (var3 >= rxm_3.private_(var4)) {
            var1.SC();
            this.byte_ = rPx_1.CHARGED;
            this.class_ = 20 + var1.Sa().nextInt(20);
            ((aY_2)var1).break_(false);
         }
      } else if (this.byte_ == rPx_1.CHARGED) {
         this.class_--;
         if (this.class_ == 0) {
            this.byte_ = rPx_1.READY_TO_ATTACK;
         }
      } else if (this.byte_ == rPx_1.READY_TO_ATTACK) {
         ((aa_3)var1).break_(var2, 1.0F);
         rdn_3 var5 = var1.protected_(rhj_3.class_(var1, rdy_3.kU));
         rxm_3.class_(var5, false);
         this.byte_ = rPx_1.UNCHARGED;
      }
   }

   private void break_(is_3 var1, iB_2 var2) {
      var1.SF().class_(il_3.final_, new rfY_2(var2, true));
   }

   protected void break_(rrEm_1 var1, E var2, long var3) {
      iB_2 var5 = class_(var2);
      this.break_(var2, var5);
      this.class_((E)var2, var5);
   }
}

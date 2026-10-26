package celestial;

import java.util.List;

public class rdU_2 extends rdb_3 {
   @Override
   public rkc_3 byte_(rdn_3 var1) {
      return rkc_3.DRINK;
   }

   public rdU_2(rdO_2 var1) {
      super(var1);
   }

   @Override
   public void class_(rdX_2 var1, rqs_3<rdn_3> var2) {
      if (this.class_(var1)) {
         for (rLi_1 var4 : rVL.double_) {
            if (var4 != rAS.class_) {
               var2.add(rAB.class_(new rdn_3(this), var4));
            }
         }
      }
   }

   @Override
   public rym_3<rdn_3> class_(rYB var1, rhd_3 var2, rpm_3 var3) {
      return rpO_2.class_(var1, var2, var3);
   }

   @Override
   public void class_(rdn_3 var1, rYB var2, List<rgP_2> var3, VD var4) {
      rAB.class_(var1, var3, 1.0F);
   }

   @Override
   public rdn_3 class_(rdn_3 var1, rYB var2, iB_2 var3) {
      rhd_3 var4 = var3 instanceof rhd_3 ? (rhd_3)var3 : null;
      if (var4 instanceof rhN_2) {
         Oo_1.while_.class_((rhN_2)var4, var1);
      }

      if (!var2.continue_) {
         for (rLY var6 : rAB.class_(var1)) {
            if (var6.class_().class_()) {
               var6.class_().class_(var4, var4, var3, var6.byte_(), 1.0);
            } else {
               var3.break_(new rLY(var6));
            }
         }
      }

      if (var4 != null) {
         var4.class_(rlB_2.byte_.break_(this));
         if (!((rhx_3)var4.implements_[18]).protected_) {
            var1.catch_(1);
         }
      }

      if (var4 == null || !((rhx_3)var4.implements_[18]).protected_) {
         if (var1.class_()) {
            return new rdn_3(rdy_3.Jn);
         }

         if (var4 != null) {
            ((rhz_3)var4.implements_[1]).throws_(new rdn_3(rdy_3.Jn));
         }
      }

      return var1;
   }

   @Override
   public int break_(rdn_3 var1) {
      return 32;
   }

   @Override
   public boolean throws_(rdn_3 var1) {
      return super.throws_(var1) || !rAB.class_(var1).isEmpty();
   }

   @Override
   public String case_(rdn_3 var1) {
      return rAB.protected_(var1).break_(this.break_() + ".effect.");
   }

   @Override
   public rdn_3 continue_() {
      return rAB.class_(super.continue_(), rAS.break_);
   }
}

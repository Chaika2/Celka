package celestial;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class dj_3 extends xd_3 implements kh_3 {
   public static final rCm_1 volatile_ = rCT.A;
   protected final rXB final_;
   private final List<rXE> int_;
   public static final rjC_2 package_ = xd_3.class_(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);

   protected dj_3(rXB var1, Jq_1 var2) {
      super(var2);
      this.final_ = var1;
      this.int_ = Lists.newArrayList();
      this.int_.add(var1.class_(false));

      for (int var3 = 1; var3 < 8; var3++) {
         this.int_.add(var1.class_(8 - var3, false));
      }

      this.int_.add(var1.class_(8, true));
      this.extends_(this.abstract_.break_().class_(volatile_, Integer.valueOf(0)));
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      if (this.class_(var2, var3, var1)) {
         var2.extends_().class_(var3, var1.volatile_().class_(), this.final_.class_(var2));
      }
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var1.volatile_().break_() || var3.volatile_().break_()) {
         var4.extends_().class_(var5, var1.volatile_().class_(), this.final_.class_(var4));
      }

      return super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (this.class_(var2, var3, var1)) {
         var2.extends_().class_(var3, var1.volatile_().class_(), this.final_.class_(var2));
      }
   }

   @Override
   public List<rdn_3> class_(xc_3 var1, rzP_2 var2) {
      return Collections.emptyList();
   }

   private boolean class_(rYB var1, rfH_2 var2, xc_3 var3) {
      if (this.final_.class_(rlG_2.byte_)) {
         boolean var4 = var1.byte_(var2.break_()).class_(xu_3.Po);

         for (rpr_3 var8 : rpr_3.values()) {
            if (var8 != rpr_3.DOWN) {
               rfH_2 var9 = var2.break_(var8);
               if (var1.break_(var9).class_(rlG_2.break_)) {
                  xd_3 var10 = var1.break_(var2).break_() ? xu_3.rg : xu_3.volatile_;
                  var1.break_(var2, var10.continue_());
                  this.class_(var1, var2);
                  return false;
               }

               if (var4 && var1.byte_(var9).class_(xu_3.hP)) {
                  var1.break_(var2, xu_3.PK.continue_());
                  this.class_(var1, var2);
                  return false;
               }
            }
         }
      }

      return true;
   }

   private void class_(rRg_1 var1, rfH_2 var2) {
      var1.byte_(1501, var2, 0);
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_);
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return rjw_3.class_();
   }

   @Override
   public void class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      var1.volatile_().break_(var2, var3, var4);
   }

   @Override
   public boolean class_(xc_3 var1, xc_3 var2, rpr_3 var3) {
      return var2.volatile_().class_().class_(this.final_);
   }

   @Override
   public xN_2 class_(xc_3 var1) {
      return xN_2.INVISIBLE;
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return !this.final_.class_(rlG_2.byte_);
   }

   @Override
   public rXs_1 break_(rRg_1 var1, rfH_2 var2, xc_3 var3) {
      if (var3.byte_(volatile_) == 0) {
         var1.class_(var2, xu_3.class_.continue_(), 11);
         return this.final_;
      } else {
         return rXG.class_;
      }
   }

   @Override
   public rjC_2 break_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return var4.class_(package_, var3, true) && var1.byte_(volatile_) == 0 && var4.class_(var2.break_(var3.final_()), this.final_)
         ? package_
         : rjw_3.class_();
   }

   @Override
   public rXE throws_(xc_3 var1) {
      int var2 = var1.byte_(volatile_);
      return this.int_.get(Math.min(var2, 8));
   }

   @Override
   public boolean a_(xc_3 var1) {
      return var1.volatile_().case_();
   }

   @Override
   public boolean a_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return false;
   }
}

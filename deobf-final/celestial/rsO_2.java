package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class rsO_2 extends rsS_2 {
   public rsh_3 catch_;

   public rsO_2(rYB var1, rfH_2 var2, rpr_3 var3, rsh_3 var4) {
      this(var1, var2, var3);
      this.catch_ = var4;
      this.class_(var3);
   }

   public rsO_2(rYB var1, rfH_2 var2, rpr_3 var3) {
      super(aI_2.O, var1, var2);
      ArrayList var4 = Lists.newArrayList();
      int var5 = 0;

      for (rsh_3 var7 : rVL.P) {
         this.catch_ = var7;
         this.class_(var3);
         if (this.throws_()) {
            var4.add(var7);
            int var8 = var7.class_() * var7.break_();
            if (var8 > var5) {
               var5 = var8;
            }
         }
      }

      if (!var4.isEmpty()) {
         Iterator var9 = var4.iterator();

         while (var9.hasNext()) {
            rsh_3 var10 = (rsh_3)var9.next();
            if (var10.class_() * var10.break_() < var5) {
               var9.remove();
            }
         }

         this.catch_ = (rsh_3)var4.get(((Random)this.throws_[40]).nextInt(var4.size()));
      }

      this.class_(var3);
   }

   public rsO_2(aI_2<? extends rsO_2> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void class_(double var1, double var3, double var5, float var7, float var8) {
      this.new_(var1, var3, var5);
   }

   @Override
   public void class_(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      rfH_2 var11 = this.break_.byte_(var1 - this.rx(), var3 - this.re(), var5 - this.BO());
      this.new_((double)var11.b_(), (double)var11.c_(), (double)var11.d_());
   }

   @Override
   public void class_(an_3 var1) {
      if (((rYB)this.throws_[7]).B().break_(rRu_1.catch_)) {
         this.class_(rqn_3.Mj, 1.0F, 1.0F);
         if (var1 instanceof rhd_3 var2 && ((rhx_3)var2.implements_[18]).protected_) {
            return;
         }

         this.class_(rdy_3.hH);
      }
   }

   @Override
   public void class_(rcd_3 var1) {
      var1.class_("Motive", rVL.P.break_(this.catch_).toString());
      var1.class_("Facing", (byte)this.protected_.protected_());
      super.class_(var1);
   }

   @Override
   public void break_(rcd_3 var1) {
      this.catch_ = rVL.P.class_(rqO_2.break_(var1.native_("Motive")));
      this.protected_ = rpr_3.break_(var1.case_("Facing"));
      super.break_(var1);
      this.class_(this.protected_);
   }

   @Override
   public int catch_() {
      return this.catch_ == null ? 1 : this.catch_.break_();
   }

   @Override
   public int case_() {
      return this.catch_ == null ? 1 : this.catch_.class_();
   }

   @Override
   public void private_() {
      this.class_(rqn_3.MV, 1.0F, 1.0F);
   }

   @Override
   public ruS_2<?> p_() {
      return new rFx_1(this);
   }
}

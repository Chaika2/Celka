package celestial;

import java.util.List;

public class rJo_1 extends rXy_1 {
   private final rYB catch_;
   private rWW private_;
   private final List<rWW> implements_;

   public rJo_1(int var1, rhz_3 var2) {
      this(var1, var2, rpq_3.class_);
   }

   public rJo_1(int var1, rhz_3 var2, rpq_3 var3) {
      super(rJP.else_, var1, var2, var3);
      this.catch_ = (rYB)var2.throws_.throws_[7];
      this.implements_ = this.catch_.implements_().class_(rkj_3.catch_);
   }

   @Override
   protected boolean class_(rdn_3 var1) {
      return this.implements_.stream().anyMatch(var1x -> var1x.class_(var1));
   }

   @Override
   public void class_() {
      List var1 = this.catch_.implements_().break_(rkj_3.catch_, this.break_, this.catch_);
      if (var1.isEmpty()) {
         this.class_.break_(0, rdn_3.break_);
      } else {
         this.private_ = (rWW)var1.get(0);
         rdn_3 var2 = this.private_.class_(this.break_);
         this.class_.class_(this.private_);
         this.class_.break_(0, var2);
      }
   }

   @Override
   public boolean class_(rdn_3 var1, rJY var2) {
      return var2.byte_ != this.class_ && super.class_(var1, var2);
   }

   @Override
   protected boolean class_(xc_3 var1) {
      return var1.class_(xu_3.XE);
   }

   @Override
   protected boolean class_(rhd_3 var1, boolean var2) {
      return this.private_ != null && this.private_.class_(this.break_, this.catch_);
   }

   @Override
   protected rdn_3 class_(rhd_3 var1, rdn_3 var2) {
      var2.class_((rYB)var1.throws_[7], var1, var2.char_());
      this.class_.class_(var1);
      this.protected_(0);
      this.protected_(1);
      this.byte_.class_((var0, var1x) -> var0.byte_(1044, var1x, 0));
      return var2;
   }

   private void protected_(int var1) {
      rdn_3 var2 = this.break_.extends_(var1);
      var2.catch_(1);
      this.break_.break_(var1, var2);
   }
}

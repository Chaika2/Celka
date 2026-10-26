package celestial;

import java.util.List;

public class rSP<T extends is_3 & ag_3> extends rBk_1 {
   private final T class_;
   private final boolean break_;
   private int byte_;

   @Override
   public void byte_() {
      this.byte_ = this.class_.Sb();
      this.class_.case_();
      if (this.break_) {
         this.private_().stream().filter(var1 -> var1 != this.class_).map(var0 -> (ag_3)var0).forEach(ag_3::case_);
      }

      super.byte_();
   }

   public rSP(T var1, boolean var2) {
      this.class_ = (T)var1;
      this.break_ = var2;
   }

   @Override
   public boolean class_() {
      return ((rYB)this.class_.throws_[7]).B().break_(rRu_1.long_) && this.catch_();
   }

   private boolean catch_() {
      return this.class_.Sr() != null && this.class_.Sr().BC() == aI_2.rM && this.class_.Sb() > this.byte_;
   }

   private List<is_3> private_() {
      double var1 = this.class_.class_(iQ_2.break_);
      rfl_3 var3 = rfl_3.class_(this.class_.Ps()).byte_(var1, 10.0, var1);
      return ((rYB)this.class_.throws_[7]).break_((Class<? extends is_3>)this.class_.getClass(), var3);
   }
}

package celestial;

import java.util.function.Consumer;

public class UG {
   private final rdb_3 class_;
   private final rkg_3 break_;
   private final int byte_;
   private final Ot_1 protected_ = Ot_1.class_();
   private String throws_;
   private final rkf_3<?> case_;

   public UG(rkf_3<?> var1, rkg_3 var2, rpL_2 var3, int var4) {
      this.case_ = var1;
      this.class_ = var3.case_();
      this.break_ = var2;
      this.byte_ = var4;
   }

   public void class_(Consumer<Dw_1> var1, String var2) {
      rqO_2 var3 = rVL.for_.break_(this.class_);
      if (new rqO_2(var2).equals(var3)) {
         throw new IllegalStateException("Single Item Recipe " + var2 + " should remove its 'save' argument");
      } else {
         this.class_(var1, new rqO_2(var2));
      }
   }

   public void class_(Consumer<Dw_1> var1, rqO_2 var2) {
      this.class_(var2);
      this.protected_.class_(new rqO_2("recipes/root")).class_("has_the_recipe", XD.class_(var2)).class_(OR.class_(var2)).class_(hS_2.break_);
      var1.accept(
         new Ub_1(
            var2,
            this.case_,
            this.throws_ == null ? "" : this.throws_,
            this.break_,
            this.class_,
            this.byte_,
            this.protected_,
            new rqO_2(var2.byte_(), "recipes/" + this.class_.new_().break_() + "/" + var2.break_())
         )
      );
   }

   private void class_(rqO_2 var1) {
      if (this.protected_.byte_().isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + var1);
      }
   }

   public UG class_(String var1, hr_3 var2) {
      this.protected_.class_(var1, var2);
      return this;
   }

   public static UG class_(rkg_3 var0, rpL_2 var1, int var2) {
      return new UG(rkf_3.this_, var0, var1, var2);
   }

   public static UG class_(rkg_3 var0, rpL_2 var1) {
      return new UG(rkf_3.this_, var0, var1, 1);
   }
}

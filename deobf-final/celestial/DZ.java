package celestial;

import java.util.function.Consumer;

public class DZ {
   private final rdb_3 class_;
   private final rkg_3 break_;
   private final float byte_;
   private final int protected_;
   private final Ot_1 throws_ = Ot_1.class_();
   private String case_;
   private final rkl_3<?> catch_;

   private DZ(rpL_2 var1, rkg_3 var2, float var3, int var4, rkl_3<?> var5) {
      this.class_ = var1.case_();
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.catch_ = var5;
   }

   public void class_(Consumer<Dw_1> var1) {
      this.class_(var1, rVL.for_.break_(this.class_));
   }

   public void class_(Consumer<Dw_1> var1, String var2) {
      rqO_2 var3 = rVL.for_.break_(this.class_);
      rqO_2 var4 = new rqO_2(var2);
      if (var4.equals(var3)) {
         throw new IllegalStateException("Recipe " + var4 + " should remove its 'save' argument");
      } else {
         this.class_(var1, var4);
      }
   }

   public void class_(Consumer<Dw_1> var1, rqO_2 var2) {
      this.class_(var2);
      this.throws_.class_(new rqO_2("recipes/root")).class_("has_the_recipe", XD.class_(var2)).class_(OR.class_(var2)).class_(hS_2.break_);
      var1.accept(
         new Dv_1(
            var2,
            this.case_ == null ? "" : this.case_,
            this.break_,
            this.class_,
            this.byte_,
            this.protected_,
            this.throws_,
            new rqO_2(var2.byte_(), "recipes/" + this.class_.new_().break_() + "/" + var2.break_()),
            (rkf_3<? extends rkv_3>)this.catch_
         )
      );
   }

   private void class_(rqO_2 var1) {
      if (this.throws_.byte_().isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + var1);
      }
   }

   public static DZ class_(rkg_3 var0, rpL_2 var1, float var2, int var3, rkl_3<?> var4) {
      return new DZ(var1, var0, var2, var3, var4);
   }

   public static DZ class_(rkg_3 var0, rpL_2 var1, float var2, int var3) {
      return class_(var0, var1, var2, var3, rkf_3.new_);
   }

   public DZ class_(String var1, hr_3 var2) {
      this.throws_.class_(var1, var2);
      return this;
   }

   public static DZ break_(rkg_3 var0, rpL_2 var1, float var2, int var3) {
      return class_(var0, var1, var2, var3, rkf_3.int_);
   }
}

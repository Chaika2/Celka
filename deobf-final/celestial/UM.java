package celestial;

import java.util.function.Consumer;

public class UM {
   private final rkg_3 class_;
   private final rkg_3 break_;
   private final rdb_3 byte_;
   private final Ot_1 protected_ = Ot_1.class_();
   private final rkf_3<?> throws_;

   public UM(rkf_3<?> var1, rkg_3 var2, rkg_3 var3, rdb_3 var4) {
      this.throws_ = var1;
      this.class_ = var2;
      this.break_ = var3;
      this.byte_ = var4;
   }

   public void class_(Consumer<Dw_1> var1, String var2) {
      this.class_(var1, new rqO_2(var2));
   }

   public void class_(Consumer<Dw_1> var1, rqO_2 var2) {
      this.class_(var2);
      this.protected_.class_(new rqO_2("recipes/root")).class_("has_the_recipe", XD.class_(var2)).class_(OR.class_(var2)).class_(hS_2.break_);
      var1.accept(
         new UO(
            var2,
            this.throws_,
            this.class_,
            this.break_,
            this.byte_,
            this.protected_,
            new rqO_2(var2.byte_(), "recipes/" + this.byte_.new_().break_() + "/" + var2.break_())
         )
      );
   }

   private void class_(rqO_2 var1) {
      if (this.protected_.byte_().isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + var1);
      }
   }

   public UM class_(String var1, hr_3 var2) {
      this.protected_.class_(var1, var2);
      return this;
   }

   public static UM class_(rkg_3 var0, rkg_3 var1, rdb_3 var2) {
      return new UM(rkf_3.else_, var0, var1, var2);
   }
}

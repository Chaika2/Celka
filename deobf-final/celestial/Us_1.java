package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Us_1 {
   private static final Logger class_ = LogManager.getLogger();
   private final rdb_3 break_;
   private final int byte_;
   private final List<rkg_3> protected_ = Lists.newArrayList();
   private final Ot_1 throws_ = Ot_1.class_();
   private String case_;

   public Us_1(rpL_2 var1, int var2) {
      this.break_ = var1.case_();
      this.byte_ = var2;
   }

   public void class_(Consumer<Dw_1> var1, String var2) {
      rqO_2 var3 = rVL.for_.break_(this.break_);
      if (new rqO_2(var2).equals(var3)) {
         throw new IllegalStateException("Shapeless Recipe " + var2 + " should remove its 'save' argument");
      } else {
         this.class_(var1, new rqO_2(var2));
      }
   }

   public void class_(Consumer<Dw_1> var1) {
      this.class_(var1, rVL.for_.break_(this.break_));
   }

   public Us_1 class_(String var1) {
      this.case_ = var1;
      return this;
   }

   public Us_1 class_(String var1, hr_3 var2) {
      this.throws_.class_(var1, var2);
      return this;
   }

   public void class_(Consumer<Dw_1> var1, rqO_2 var2) {
      this.class_(var2);
      this.throws_.class_(new rqO_2("recipes/root")).class_("has_the_recipe", XD.class_(var2)).class_(OR.class_(var2)).class_(hS_2.break_);
      var1.accept(
         new UE(
            var2,
            this.break_,
            this.byte_,
            this.case_ == null ? "" : this.case_,
            this.protected_,
            this.throws_,
            new rqO_2(var2.byte_(), "recipes/" + this.break_.new_().break_() + "/" + var2.break_())
         )
      );
   }

   private void class_(rqO_2 var1) {
      if (this.throws_.byte_().isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + var1);
      }
   }

   public Us_1 class_(rkg_3 var1, int var2) {
      for (int var3 = 0; var3 < var2; var3++) {
         this.protected_.add(var1);
      }

      return this;
   }

   public Us_1 class_(rlb_3<rdb_3> var1) {
      return this.class_(rkg_3.class_(var1));
   }

   public static Us_1 class_(rpL_2 var0, int var1) {
      return new Us_1(var0, var1);
   }

   public static Us_1 class_(rpL_2 var0) {
      return new Us_1(var0, 1);
   }

   public Us_1 class_(rkg_3 var1) {
      return this.class_(var1, 1);
   }

   public Us_1 break_(rpL_2 var1) {
      return this.break_(var1, 1);
   }

   public Us_1 break_(rpL_2 var1, int var2) {
      for (int var3 = 0; var3 < var2; var3++) {
         this.class_(rkg_3.class_(var1));
      }

      return this;
   }
}

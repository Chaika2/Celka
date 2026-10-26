package celestial;

import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public abstract class rgZ_2 implements rVi_1 {
   protected final List<rgP_2> case_ = Lists.newArrayList();
   private rpl_3 byte_ = rpl_3.class_;
   private rgX_2 protected_;
   private rgc_3 throws_ = rgc_3.class_;

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rgZ_2 var2) ? false : this.case_.equals(var2.case_) && Objects.equals(this.class_(), var2.class_());
      }
   }

   @Override
   public String toString() {
      return "BaseComponent{style=" + this.throws_ + ", siblings=" + this.case_ + "}";
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.class_(), this.case_);
   }

   @Override
   public rVi_1 class_(rgc_3 var1) {
      this.throws_ = var1;
      return this;
   }

   @Override
   public rgc_3 class_() {
      return this.throws_;
   }

   @Override
   public rVi_1 class_(int var1, rgP_2 var2) {
      this.case_.add(var1, var2);
      return this;
   }

   @Override
   public rVi_1 class_(int var1, Collection<rgP_2> var2) {
      this.case_.addAll(var1, var2);
      return this;
   }

   @Override
   public rVi_1 class_(rgP_2 var1) {
      this.case_.add(var1);
      return this;
   }

   @Override
   public String break_() {
      return "";
   }

   public abstract rgZ_2 finally_();

   @Override
   public rpl_3 catch_() {
      rgX_2 var1 = rgX_2.byte_();
      if (this.protected_ != var1) {
         this.byte_ = var1.class_(this);
         this.protected_ = var1;
      }

      return this.byte_;
   }

   @Override
   public final rVi_1 case_() {
      rgZ_2 var1 = this.finally_();
      var1.case_.addAll(this.case_);
      var1.class_(this.throws_);
      return var1;
   }

   @Override
   public List<rgP_2> protected_() {
      return this.case_;
   }
}

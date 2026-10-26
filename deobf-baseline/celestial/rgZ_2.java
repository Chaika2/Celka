package celestial;

import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public abstract class rgZ_2 implements rVi_1 {
   protected final List<rgP_2> id_case = Lists.newArrayList();
   private rpl_3 id_byte = rpl_3.id_class;
   private rgX_2 id_protected;
   private rgc_3 id_throws = rgc_3.id_class;

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rgZ_2 var2) ? false : this.id_case.equals(var2.id_case) && Objects.equals(this.id_class(), var2.id_class());
      }
   }

   @Override
   public String toString() {
      return "BaseComponent{style=" + this.id_throws + ", siblings=" + this.id_case + "}";
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.id_class(), this.id_case);
   }

   @Override
   public rVi_1 id_class(rgc_3 var1) {
      this.id_throws = var1;
      return this;
   }

   @Override
   public rgc_3 id_class() {
      return this.id_throws;
   }

   @Override
   public rVi_1 id_class(int var1, rgP_2 var2) {
      this.id_case.add(var1, var2);
      return this;
   }

   @Override
   public rVi_1 id_class(int var1, Collection<rgP_2> var2) {
      this.id_case.addAll(var1, var2);
      return this;
   }

   @Override
   public rVi_1 id_class(rgP_2 var1) {
      this.id_case.add(var1);
      return this;
   }

   @Override
   public String id_break() {
      return "";
   }

   public abstract rgZ_2 id_finally();

   @Override
   public rpl_3 id_catch() {
      rgX_2 var1 = rgX_2.id_byte();
      if (this.id_protected != var1) {
         this.id_byte = var1.id_class(this);
         this.id_protected = var1;
      }

      return this.id_byte;
   }

   @Override
   public final rVi_1 id_case() {
      rgZ_2 var1 = this.id_finally();
      var1.id_case.addAll(this.id_case);
      var1.id_class(this.id_throws);
      return var1;
   }

   @Override
   public List<rgP_2> id_protected() {
      return this.id_case;
   }
}

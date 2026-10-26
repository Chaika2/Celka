package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class OT {
   private final OT class_;
   private final OU break_;
   private final Og_1 byte_;
   private final rqO_2 protected_;
   private final Map<String, OK> throws_;
   private final String[][] case_;
   private final Set<OT> catch_ = Sets.newLinkedHashSet();
   private final rgP_2 private_;

   public OU byte_() {
      return this.break_;
   }

   public OT(rqO_2 var1, OT var2, OU var3, Og_1 var4, Map<String, OK> var5, String[][] var6) {
      this.protected_ = var1;
      this.break_ = var3;
      this.throws_ = ImmutableMap.copyOf(var5);
      this.class_ = var2;
      this.byte_ = var4;
      this.case_ = var6;
      if (var2 != null) {
         var2.class_(this);
      }

      if (var3 == null) {
         this.private_ = new rgN_2(var1.toString());
      } else {
         rgP_2 var7 = var3.class_();
         rgF_2 var8 = var3.throws_().byte_();
         rVi_1 var9 = rgv_3.class_(var7.case_(), rgc_3.class_.class_(var8)).break_("\n").class_(var3.break_());
         rVi_1 var10 = var7.case_().class_(var1x -> var1x.class_(new rgy_3(rgp_3.class_, var9)));
         this.private_ = rgv_3.class_((rgP_2)var10).class_(var8);
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof OT var2) ? false : this.protected_.equals(var2.protected_);
      }
   }

   @Override
   public String toString() {
      return "SimpleAdvancement{id="
         + this.private_()
         + ", parent="
         + (this.class_ == null ? "null" : this.class_.private_())
         + ", display="
         + this.break_
         + ", rewards="
         + this.byte_
         + ", criteria="
         + this.throws_
         + ", requirements="
         + Arrays.deepToString(this.case_)
         + "}";
   }

   @Override
   public int hashCode() {
      return this.protected_.hashCode();
   }

   public void class_(OT var1) {
      this.catch_.add(var1);
   }

   public Ot_1 class_() {
      return new Ot_1(this.class_ == null ? null : this.class_.private_(), this.break_, this.byte_, this.throws_, this.case_);
   }

   public OT break_() {
      return this.class_;
   }

   public Iterable<OT> throws_() {
      return this.catch_;
   }

   public rgP_2 finally_() {
      return this.private_;
   }

   public int catch_() {
      return this.case_.length;
   }

   public Map<String, OK> case_() {
      return this.throws_;
   }

   public String[][] implements_() {
      return this.case_;
   }

   public Og_1 protected_() {
      return this.byte_;
   }

   public rqO_2 private_() {
      return this.protected_;
   }
}

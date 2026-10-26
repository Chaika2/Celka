package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;

public class rDF {
   public final rKi_1 class_;
   public final rKi_1 break_;
   private final rrPR byte_;
   private final rrsN_2 protected_;
   private final rDQ throws_;
   private List<rrsk_3> case_ = ImmutableList.of();
   private int catch_;
   private boolean private_;
   private rKv_1 implements_ = rKv_1.OCEAN_FLOOR;

   public rDF(rKi_1 var1, rKi_1 var2, rrPR var3, rrsN_2 var4, rDQ var5) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
   }

   public rDF class_(rKv_1 var1) {
      this.implements_ = var1;
      return this;
   }

   public rDF class_() {
      this.private_ = true;
      return this;
   }

   public rDF class_(int var1) {
      this.catch_ = var1;
      return this;
   }

   public rDF class_(List<rrsk_3> var1) {
      this.case_ = var1;
      return this;
   }

   public rDv_1 break_() {
      return new rDv_1(this.class_, this.break_, this.byte_, this.protected_, this.throws_, this.case_, this.catch_, this.private_, this.implements_);
   }
}

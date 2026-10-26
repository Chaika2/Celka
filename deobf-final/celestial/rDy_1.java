package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class rDy_1 {
   private final rKi_1 class_;
   private final rKY break_;
   private Set<xd_3> byte_ = ImmutableSet.of();
   private Set<xc_3> protected_ = ImmutableSet.of();
   private int throws_ = 64;
   private int case_ = 7;
   private int catch_ = 3;
   private int private_ = 7;
   private boolean implements_;
   private boolean finally_ = true;
   private boolean extends_ = false;

   public rDy_1 byte_(int var1) {
      this.catch_ = var1;
      return this;
   }

   public rDy_1 byte_() {
      this.extends_ = true;
      return this;
   }

   public rDy_1(rKi_1 var1, rKY var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public rDy_1 class_(Set<xd_3> var1) {
      this.byte_ = var1;
      return this;
   }

   public rDy_1 class_() {
      this.implements_ = true;
      return this;
   }

   public rDy_1 class_(int var1) {
      this.throws_ = var1;
      return this;
   }

   public rDy_1 break_() {
      this.finally_ = false;
      return this;
   }

   public rDy_1 break_(int var1) {
      this.case_ = var1;
      return this;
   }

   public rDy_1 break_(Set<xc_3> var1) {
      this.protected_ = var1;
      return this;
   }

   public rDy_1 protected_(int var1) {
      this.private_ = var1;
      return this;
   }

   public rDH protected_() {
      return new rDH(
         this.class_,
         this.break_,
         this.byte_,
         this.protected_,
         this.throws_,
         this.case_,
         this.catch_,
         this.private_,
         this.implements_,
         this.finally_,
         this.extends_
      );
   }
}

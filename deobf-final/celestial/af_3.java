package celestial;

import com.google.common.collect.ImmutableSet;

public class af_3<T extends an_3> {
   private final aj_3<T> class_;
   private final aH_2 break_;
   private ImmutableSet<xd_3> byte_ = ImmutableSet.of();
   private boolean protected_ = true;
   private boolean throws_ = true;
   private boolean case_;
   private boolean catch_;
   private int private_ = 5;
   private int implements_ = 3;
   private ap_3 finally_ = ap_3.break_(0.6F, 1.8F);

   public af_3<T> byte_() {
      this.case_ = true;
      return this;
   }

   private af_3(aj_3<T> var1, aH_2 var2) {
      this.class_ = var1;
      this.break_ = var2;
      this.catch_ = var2 == aH_2.CREATURE || var2 == aH_2.MISC;
   }

   public static <T extends an_3> af_3<T> class_(aj_3<T> var0, aH_2 var1) {
      return new af_3<>(var0, var1);
   }

   public af_3<T> class_(xd_3... var1) {
      this.byte_ = ImmutableSet.copyOf(var1);
      return this;
   }

   public af_3<T> class_(int var1) {
      this.private_ = var1;
      return this;
   }

   public aI_2<T> class_(String var1) {
      if (this.protected_) {
         rqR_2.class_(rTC.package_, var1);
      }

      return new aI_2<>(
         this.class_, this.break_, this.protected_, this.throws_, this.case_, this.catch_, this.byte_, this.finally_, this.private_, this.implements_
      );
   }

   public af_3<T> class_(float var1, float var2) {
      this.finally_ = ap_3.break_(var1, var2);
      return this;
   }

   public af_3<T> class_() {
      this.throws_ = false;
      return this;
   }

   public static <T extends an_3> af_3<T> class_(aH_2 var0) {
      return new af_3<>((var0x, var1) -> null, var0);
   }

   public af_3<T> break_() {
      this.protected_ = false;
      return this;
   }

   public af_3<T> break_(int var1) {
      this.implements_ = var1;
      return this;
   }

   public af_3<T> protected_() {
      this.catch_ = true;
      return this;
   }
}

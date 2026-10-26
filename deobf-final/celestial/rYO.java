package celestial;

public class rYO {
   private rYJ class_;
   private rYh_1 break_;
   private Float byte_;
   private Float protected_;
   private Float throws_;
   private rYx_1 case_ = rYx_1.NONE;
   private Float catch_;
   private rYW private_;
   private rYt_1 implements_;
   private rYv_1 finally_;

   public rYO byte_(float var1) {
      this.throws_ = var1;
      return this;
   }

   @Override
   public String toString() {
      return "BiomeBuilder{\nprecipitation="
         + this.class_
         + ",\nbiomeCategory="
         + this.break_
         + ",\ndepth="
         + this.byte_
         + ",\nscale="
         + this.protected_
         + ",\ntemperature="
         + this.throws_
         + ",\ntemperatureModifier="
         + this.case_
         + ",\ndownfall="
         + this.catch_
         + ",\nspecialEffects="
         + this.private_
         + ",\nmobSpawnSettings="
         + this.implements_
         + ",\ngenerationSettings="
         + this.finally_
         + ",\n}";
   }

   public rYO class_(rYW var1) {
      this.private_ = var1;
      return this;
   }

   public rYO class_(rYt_1 var1) {
      this.implements_ = var1;
      return this;
   }

   public rYO class_(rYv_1 var1) {
      this.finally_ = var1;
      return this;
   }

   public rYO class_(rYx_1 var1) {
      this.case_ = var1;
      return this;
   }

   public rYG class_() {
      if (this.class_ != null
         && this.break_ != null
         && this.byte_ != null
         && this.protected_ != null
         && this.throws_ != null
         && this.catch_ != null
         && this.private_ != null
         && this.implements_ != null
         && this.finally_ != null) {
         return new rYG(
            new rYX(this.class_, this.throws_, this.case_, this.catch_),
            this.break_,
            this.byte_,
            this.protected_,
            this.private_,
            this.finally_,
            this.implements_
         );
      } else {
         throw new IllegalStateException("You are missing parameters to build a proper biome\n" + this);
      }
   }

   public rYO class_(rYJ var1) {
      this.class_ = var1;
      return this;
   }

   public rYO class_(rYh_1 var1) {
      this.break_ = var1;
      return this;
   }

   public rYO class_(float var1) {
      this.byte_ = var1;
      return this;
   }

   public rYO break_(float var1) {
      this.protected_ = var1;
      return this;
   }

   public rYO protected_(float var1) {
      this.catch_ = var1;
      return this;
   }
}

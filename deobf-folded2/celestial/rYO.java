package celestial;

public class rYO {
   private rYJ id_class;
   private rYh_1 id_break;
   private Float id_byte;
   private Float id_protected;
   private Float id_throws;
   private rYx_1 id_case = rYx_1.NONE;
   private Float id_catch;
   private rYW id_private;
   private rYt_1 id_implements;
   private rYv_1 id_finally;

   public rYO id_byte(float var1) {
      this.id_throws = var1;
      return this;
   }

   @Override
   public String toString() {
      return "BiomeBuilder{\nprecipitation="
         + this.id_class
         + ",\nbiomeCategory="
         + this.id_break
         + ",\ndepth="
         + this.id_byte
         + ",\nscale="
         + this.id_protected
         + ",\ntemperature="
         + this.id_throws
         + ",\ntemperatureModifier="
         + this.id_case
         + ",\ndownfall="
         + this.id_catch
         + ",\nspecialEffects="
         + this.id_private
         + ",\nmobSpawnSettings="
         + this.id_implements
         + ",\ngenerationSettings="
         + this.id_finally
         + ",\n}";
   }

   public rYO id_class(rYW var1) {
      this.id_private = var1;
      return this;
   }

   public rYO id_class(rYt_1 var1) {
      this.id_implements = var1;
      return this;
   }

   public rYO id_class(rYv_1 var1) {
      this.id_finally = var1;
      return this;
   }

   public rYO id_class(rYx_1 var1) {
      this.id_case = var1;
      return this;
   }

   public rYG id_class() {
      if (this.id_class != null
         && this.id_break != null
         && this.id_byte != null
         && this.id_protected != null
         && this.id_throws != null
         && this.id_catch != null
         && this.id_private != null
         && this.id_implements != null
         && this.id_finally != null) {
         return new rYG(
            new rYX(this.id_class, this.id_throws, this.id_case, this.id_catch),
            this.id_break,
            this.id_byte,
            this.id_protected,
            this.id_private,
            this.id_finally,
            this.id_implements
         );
      } else {
         throw new IllegalStateException("You are missing parameters to build a proper biome\n" + this);
      }
   }

   public rYO id_class(rYJ var1) {
      this.id_class = var1;
      return this;
   }

   public rYO id_class(rYh_1 var1) {
      this.id_break = var1;
      return this;
   }

   public rYO id_class(float var1) {
      this.id_byte = var1;
      return this;
   }

   public rYO id_break(float var1) {
      this.id_protected = var1;
      return this;
   }

   public rYO id_protected(float var1) {
      this.id_catch = var1;
      return this;
   }
}

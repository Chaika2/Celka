package celestial;

public interface rruG {
   float id_byte(float var1);

   float id_class(float var1);

   default rrub_1 id_break(float var1) {
      return new rrub_1(this.id_class(var1), this.id_protected(var1), this.id_byte(var1));
   }

   float id_protected(float var1);
}

package celestial;

public interface rRp_1 extends rRq_1 {
   default int id_class(rfH_2 var1, int var2) {
      return this.id_class().id_break(var1, var2);
   }

   default int id_class(rRo_1 var1, rfH_2 var2) {
      return this.id_class().id_class(var1).id_class(var2);
   }

   int id_class(rfH_2 var1, rrsC_2 var2);

   rrse_3 id_class();

   float id_class(rpr_3 var1, boolean var2);

   default boolean id_case(rfH_2 var1) {
      return this.id_class(rRo_1.SKY, var1) >= this.id_while();
   }
}

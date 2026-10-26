package celestial;

public interface rRp_1 extends rRq_1 {
   default int class_(rfH_2 var1, int var2) {
      return this.class_().break_(var1, var2);
   }

   default int class_(rRo_1 var1, rfH_2 var2) {
      return this.class_().class_(var1).class_(var2);
   }

   int class_(rfH_2 var1, rrsC_2 var2);

   rrse_3 class_();

   float class_(rpr_3 var1, boolean var2);

   default boolean case_(rfH_2 var1) {
      return this.class_(rRo_1.SKY, var1) >= this.while_();
   }
}

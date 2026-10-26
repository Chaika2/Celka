package celestial;

class eO_2 extends ed_3 {
   @Override
   protected float id_byte() {
      return super.id_byte() * 1.25F;
   }

   eO_2(eM_2 var1) {
   }

   @Override
   protected rhf_3 id_class(rYB var1, eX_2 var2, rdn_3 var3) {
      return rqR_2.id_class(new rhI_2(var1, var2.id_class(), var2.id_break(), var2.id_byte()), var1x -> var1x.id_break(var3));
   }

   @Override
   protected float id_break() {
      return super.id_break() * 0.5F;
   }
}

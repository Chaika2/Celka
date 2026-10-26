package celestial;

public class rOa_1 extends rOK {
   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      super.id_byte(var1);
      return rqn_3.Pa;
   }

   public rOa_1(aI_2<? extends rOa_1> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   protected rqA_2 sp() {
      super.sp();
      return rqn_3.PK;
   }

   @Override
   public boolean id_class(rbZ_2 var1) {
      if (var1 == this) {
         return false;
      } else {
         return !(var1 instanceof rOa_1) && !(var1 instanceof rOi_1) ? false : this.sj() && ((rOD)var1).sj();
      }
   }

   @Override
   public au_3 id_class(rrEm_1 var1, au_3 var2) {
      aI_2 var3 = var2 instanceof rOi_1 ? aI_2.G : aI_2.id_package;
      rOD var4 = (rOD)var3.id_class(var1);
      this.id_class(var2, var4);
      return var4;
   }

   @Override
   protected rqA_2 id_static() {
      super.id_static();
      return rqn_3.Po;
   }

   @Override
   protected rqA_2 Bt() {
      super.Bt();
      return rqn_3.PU;
   }

   @Override
   protected rqA_2 sy() {
      return rqn_3.Pe;
   }
}

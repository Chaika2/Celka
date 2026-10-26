package celestial;

public class dI_2 extends xF_2 {
   protected static final rjC_2 id_volatile = xd_3.id_class(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final rLR id_final;
   private final int id_package;

   @Override
   public Jp_1 id_byte() {
      return Jp_1.XZ;
   }

   public dI_2(rLR var1, int var2, Jq_1 var3) {
      super(var3);
      this.id_final = var1;
      if (var1.id_class()) {
         this.id_package = var2;
      } else {
         this.id_package = var2 * 20;
      }
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      rjU_2 var5 = var1.id_class(var3);
      return id_volatile.id_class(var5.id_break, var5.id_byte, var5.id_protected);
   }

   public rLR id_break() {
      return this.id_final;
   }

   public int id_implements() {
      return this.id_package;
   }
}

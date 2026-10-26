package celestial;

public class pn_3 extends qc_3<rbR_2, tv_3<rbR_2>> {
   private static final rqO_2 id_class = new rqO_2("textures/entity/chicken.png");

   public pn_3(pg_3 var1) {
      super(var1, new tv_3<>(), 0.3F);
   }

   public rqO_2 id_class(rbR_2 var1) {
      return id_class;
   }

   protected float id_class(rbR_2 var1, float var2) {
      float var3 = rfU_2.id_catch(var2, var1.id_synchronized, var1.id_super);
      float var4 = rfU_2.id_catch(var2, var1.id_else, var1.id_this);
      return (rfU_2.id_class(var3) + 1.0F) * var4;
   }
}

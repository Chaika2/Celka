package celestial;

public class qF_2 extends qc_3<rMR, ws_3> {
   public static final rqO_2[] id_class = new rqO_2[]{
      new rqO_2("textures/entity/parrot/parrot_red_blue.png"),
      new rqO_2("textures/entity/parrot/parrot_blue.png"),
      new rqO_2("textures/entity/parrot/parrot_green.png"),
      new rqO_2("textures/entity/parrot/parrot_yellow_blue.png"),
      new rqO_2("textures/entity/parrot/parrot_grey.png")
   };

   public qF_2(pg_3 var1) {
      super(var1, new ws_3(), 0.3F);
   }

   public rqO_2 id_class(rMR var1) {
      return id_class[var1.sJ()];
   }

   public float id_class(rMR var1, float var2) {
      float var3 = rfU_2.id_catch(var2, var1.id_synchronized, var1.id_super);
      float var4 = rfU_2.id_catch(var2, var1.id_else, var1.id_this);
      return (rfU_2.id_class(var3) + 1.0F) * var4;
   }
}

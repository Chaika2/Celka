package celestial;

public class qF_2 extends qc_3<rMR, ws_3> {
   public static final rqO_2[] class_ = new rqO_2[]{
      new rqO_2("textures/entity/parrot/parrot_red_blue.png"),
      new rqO_2("textures/entity/parrot/parrot_blue.png"),
      new rqO_2("textures/entity/parrot/parrot_green.png"),
      new rqO_2("textures/entity/parrot/parrot_yellow_blue.png"),
      new rqO_2("textures/entity/parrot/parrot_grey.png")
   };

   public qF_2(pg_3 var1) {
      super(var1, new ws_3(), 0.3F);
   }

   public rqO_2 class_(rMR var1) {
      return class_[var1.sJ()];
   }

   public float class_(rMR var1, float var2) {
      float var3 = rfU_2.catch_(var2, var1.synchronized_, var1.super_);
      float var4 = rfU_2.catch_(var2, var1.else_, var1.this_);
      return (rfU_2.class_(var3) + 1.0F) * var4;
   }
}

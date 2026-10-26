package celestial;

public abstract class Tz_1<T extends an_3, M extends tp_3<T>> extends Tf_1<T, M> {
   public Tz_1(qE_2<T, M> var1) {
      super(var1);
   }

   @Override
   public void id_class(Ml_1 var1, Hx_1 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      Ok_1 var11 = var2.getBuffer(this.id_class());
      if (rrbb_3.rs()) {
         rrdZ.id_double();
      }

      rrbb_3.z().id_case = true;
      this.id_byte().id_class(var1, var11, 15728640, fZ_2.id_class, 1.0F, 1.0F, 1.0F, 1.0F);
      rrbb_3.z().id_case = false;
      if (rrbb_3.rs()) {
         rrdZ.id_switch();
      }
   }

   public abstract HU id_class();
}

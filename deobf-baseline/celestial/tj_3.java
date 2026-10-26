package celestial;

public class tj_3<T extends rOK> extends tV_2<T> {
   private final Iq_1 id_byte = new Iq_1(this, 26, 21);
   private final Iq_1 id_protected;

   public tj_3(float var1) {
      super(var1);
      this.id_byte.id_class(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      this.id_protected = new Iq_1(this, 26, 21);
      this.id_protected.id_class(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      this.id_byte.id_catch = (float) (-Math.PI / 2);
      this.id_protected.id_catch = (float) (Math.PI / 2);
      this.id_byte.id_class(6.0F, -8.0F, 0.0F);
      this.id_protected.id_class(-6.0F, -8.0F, 0.0F);
      this.id_class.id_break(this.id_byte);
      this.id_class.id_break(this.id_protected);
   }

   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.id_class((T)var1, var2, var3, var4, var5, var6);
      if (var1.sJ()) {
         this.id_byte.id_finally = true;
         this.id_protected.id_finally = true;
      } else {
         this.id_byte.id_finally = false;
         this.id_protected.id_finally = false;
      }
   }

   @Override
   protected void id_class(Iq_1 var1) {
      Iq_1 var2 = new Iq_1(this, 0, 12);
      var2.id_class(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      var2.id_class(1.25F, -10.0F, 4.0F);
      Iq_1 var3 = new Iq_1(this, 0, 12);
      var3.id_class(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      var3.id_class(-1.25F, -10.0F, 4.0F);
      var2.id_case = (float) (Math.PI / 12);
      var2.id_private = (float) (Math.PI / 12);
      var3.id_case = (float) (Math.PI / 12);
      var3.id_private = (float) (-Math.PI / 12);
      var1.id_break(var2);
      var1.id_break(var3);
   }
}

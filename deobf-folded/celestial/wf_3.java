package celestial;

public class wf_3<T extends an_3> extends wI_2<T> {
   private boolean id_finally;
   private final Iq_1 id_extends = new Iq_1(this).id_break(64, 128);

   public wf_3(float var1) {
      super(var1, 64, 128);
      this.id_extends.id_class(0.0F, -2.0F, 0.0F);
      this.id_extends.id_class(0, 0).id_class(0.0F, 3.0F, -6.75F, 1.0F, 1.0F, 1.0F, -0.25F);
      this.id_implements.id_break(this.id_extends);
      this.id_class = new Iq_1(this).id_break(64, 128);
      this.id_class.id_class(0.0F, 0.0F, 0.0F);
      this.id_class.id_class(0, 0).id_class(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, var1);
      this.id_break = new Iq_1(this).id_break(64, 128);
      this.id_break.id_class(-5.0F, -10.03125F, -5.0F);
      this.id_break.id_class(0, 64).id_class(0.0F, 0.0F, 0.0F, 10.0F, 2.0F, 10.0F);
      this.id_class.id_break(this.id_break);
      this.id_class.id_break(this.id_implements);
      Iq_1 var2 = new Iq_1(this).id_break(64, 128);
      var2.id_class(1.75F, -4.0F, 2.0F);
      var2.id_class(0, 76).id_class(0.0F, 0.0F, 0.0F, 7.0F, 4.0F, 7.0F);
      var2.id_case = -0.05235988F;
      var2.id_private = 0.02617994F;
      this.id_break.id_break(var2);
      Iq_1 var3 = new Iq_1(this).id_break(64, 128);
      var3.id_class(1.75F, -4.0F, 2.0F);
      var3.id_class(0, 87).id_class(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F);
      var3.id_case = -0.10471976F;
      var3.id_private = 0.05235988F;
      var2.id_break(var3);
      Iq_1 var4 = new Iq_1(this).id_break(64, 128);
      var4.id_class(1.75F, -2.0F, 2.0F);
      var4.id_class(0, 95).id_class(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.25F);
      var4.id_case = (float) (-Math.PI / 15);
      var4.id_private = 0.10471976F;
      var3.id_break(var4);
   }

   @Override
   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.id_class((T)var1, var2, var3, var4, var5, var6);
      this.id_implements.id_class(0.0F, -2.0F, 0.0F);
      float var7 = 0.01F * (float)(var1.V() % 10);
      this.id_implements.id_case = rfU_2.id_class((float)((Integer)var1.id_throws[41]).intValue() * var7) * 4.5F * (float) (Math.PI / 180.0);
      this.id_implements.id_catch = 0.0F;
      this.id_implements.id_private = rfU_2.id_break((float)((Integer)var1.id_throws[41]).intValue() * var7) * 2.5F * (float) (Math.PI / 180.0);
      if (this.id_finally) {
         this.id_implements.id_class(0.0F, 1.0F, -1.5F);
         this.id_implements.id_case = -0.9F;
      }
   }

   public void id_break(boolean var1) {
      this.id_finally = var1;
   }

   public Iq_1 id_break() {
      return this.id_implements;
   }
}

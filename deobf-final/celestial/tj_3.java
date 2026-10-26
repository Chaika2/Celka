package celestial;

public class tj_3<T extends rOK> extends tV_2<T> {
   private final Iq_1 byte_ = new Iq_1(this, 26, 21);
   private final Iq_1 protected_;

   public tj_3(float var1) {
      super(var1);
      this.byte_.class_(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      this.protected_ = new Iq_1(this, 26, 21);
      this.protected_.class_(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      this.byte_.catch_ = (float) (-Math.PI / 2);
      this.protected_.catch_ = (float) (Math.PI / 2);
      this.byte_.class_(6.0F, -8.0F, 0.0F);
      this.protected_.class_(-6.0F, -8.0F, 0.0F);
      this.class_.break_(this.byte_);
      this.class_.break_(this.protected_);
   }

   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.class_((T)var1, var2, var3, var4, var5, var6);
      if (var1.sJ()) {
         this.byte_.finally_ = true;
         this.protected_.finally_ = true;
      } else {
         this.byte_.finally_ = false;
         this.protected_.finally_ = false;
      }
   }

   @Override
   protected void class_(Iq_1 var1) {
      Iq_1 var2 = new Iq_1(this, 0, 12);
      var2.class_(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      var2.class_(1.25F, -10.0F, 4.0F);
      Iq_1 var3 = new Iq_1(this, 0, 12);
      var3.class_(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      var3.class_(-1.25F, -10.0F, 4.0F);
      var2.case_ = (float) (Math.PI / 12);
      var2.private_ = (float) (Math.PI / 12);
      var3.case_ = (float) (Math.PI / 12);
      var3.private_ = (float) (-Math.PI / 12);
      var1.break_(var2);
      var1.break_(var3);
   }
}

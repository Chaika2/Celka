package celestial;

public class rfw_3 extends rfH_2 {
   public rfw_3 byte_(int var1, int var2, int var3) {
      return this.class_(this.b_() + var1, this.c_() + var2, this.d_() + var3);
   }

   public rfw_3 byte_(rpr_3 var1, int var2) {
      return this.class_(this.b_() + var1.implements_() * var2, this.c_() + var1.finally_() * var2, this.d_() + var1.extends_() * var2);
   }

   @Override
   public rfH_2 byte_(double var1, double var3, double var5) {
      return super.byte_(var1, var3, var5).int_();
   }

   @Override
   public rfH_2 int_() {
      return new rfH_2(this);
   }

   public rfw_3() {
      this(0, 0, 0);
   }

   public rfw_3(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public rfw_3(double var1, double var3, double var5) {
      this(rfU_2.byte_(var1), rfU_2.byte_(var3), rfU_2.byte_(var5));
   }

   public rfw_3 class_(rja_3 var1, rpr_3 var2) {
      return this.class_(var1.b_() + var2.implements_(), var1.c_() + var2.finally_(), var1.d_() + var2.extends_());
   }

   public rfw_3 class_(rja_3 var1, int var2, int var3, int var4) {
      return this.class_(var1.b_() + var2, var1.c_() + var3, var1.d_() + var4);
   }

   public rfw_3 class_(ryF_2 var1, int var2, int var3, int var4) {
      return this.class_(var1.class_(var2, var3, var4, rpB_2.X), var1.class_(var2, var3, var4, rpB_2.Y), var1.class_(var2, var3, var4, rpB_2.Z));
   }

   public rfw_3 class_(rpr_3 var1) {
      return this.byte_(var1, 1);
   }

   public rfw_3 class_(rpB_2 var1, int var2, int var3) {
      switch (var1) {
         case X:
            return this.class_(rfU_2.class_(this.b_(), var2, var3), this.c_(), this.d_());
         case Y:
            return this.class_(this.b_(), rfU_2.class_(this.c_(), var2, var3), this.d_());
         case Z:
            return this.class_(this.b_(), this.c_(), rfU_2.class_(this.d_(), var2, var3));
         default:
            throw new IllegalStateException("Unable to clamp axis " + var1);
      }
   }

   @Override
   public rfH_2 class_(rpB_2 var1, int var2) {
      return super.class_(var1, var2).int_();
   }

   @Override
   public rfH_2 class_(rqd_3 var1) {
      return super.class_(var1).int_();
   }

   public rfw_3 class_(int var1, int var2, int var3) {
      this.a_(var1);
      this.b_(var2);
      this.c_(var3);
      return this;
   }

   @Override
   public rfH_2 class_(rpr_3 var1, int var2) {
      return super.class_(var1, var2).int_();
   }

   public rfw_3 class_(rja_3 var1) {
      return this.class_(var1.b_(), var1.c_(), var1.d_());
   }

   @Override
   public rfH_2 break_(int var1, int var2, int var3) {
      return super.break_(var1, var2, var3).int_();
   }

   public rfw_3 break_(double var1, double var3, double var5) {
      return this.class_(rfU_2.byte_(var1), rfU_2.byte_(var3), rfU_2.byte_(var5));
   }

   public rfw_3 case_(long var1) {
      return this.class_(class_(var1), break_(var1), byte_(var1));
   }

   public rfw_3 case_(rja_3 var1) {
      return this.class_(this.b_() + var1.b_(), this.c_() + var1.c_(), this.d_() + var1.d_());
   }

   @Override
   public void a_(int var1) {
      super.a_(var1);
   }

   @Override
   public void c_(int var1) {
      super.c_(var1);
   }

   @Override
   public void b_(int var1) {
      super.b_(var1);
   }
}

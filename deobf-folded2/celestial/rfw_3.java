package celestial;

public class rfw_3 extends rfH_2 {
   public rfw_3 id_byte(int var1, int var2, int var3) {
      return this.id_class(this.b_() + var1, this.c_() + var2, this.d_() + var3);
   }

   public rfw_3 id_byte(rpr_3 var1, int var2) {
      return this.id_class(this.b_() + var1.id_implements() * var2, this.c_() + var1.id_finally() * var2, this.d_() + var1.id_extends() * var2);
   }

   @Override
   public rfH_2 id_byte(double var1, double var3, double var5) {
      return super.id_byte(var1, var3, var5).id_int();
   }

   @Override
   public rfH_2 id_int() {
      return new rfH_2(this);
   }

   public rfw_3() {
      this(0, 0, 0);
   }

   public rfw_3(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public rfw_3(double var1, double var3, double var5) {
      this(rfU_2.id_byte(var1), rfU_2.id_byte(var3), rfU_2.id_byte(var5));
   }

   public rfw_3 id_class(rja_3 var1, rpr_3 var2) {
      return this.id_class(var1.b_() + var2.id_implements(), var1.c_() + var2.id_finally(), var1.d_() + var2.id_extends());
   }

   public rfw_3 id_class(rja_3 var1, int var2, int var3, int var4) {
      return this.id_class(var1.b_() + var2, var1.c_() + var3, var1.d_() + var4);
   }

   public rfw_3 id_class(ryF_2 var1, int var2, int var3, int var4) {
      return this.id_class(var1.id_class(var2, var3, var4, rpB_2.X), var1.id_class(var2, var3, var4, rpB_2.Y), var1.id_class(var2, var3, var4, rpB_2.Z));
   }

   public rfw_3 id_class(rpr_3 var1) {
      return this.id_byte(var1, 1);
   }

   public rfw_3 id_class(rpB_2 var1, int var2, int var3) {
      switch (var1) {
         case X:
            return this.id_class(rfU_2.id_class(this.b_(), var2, var3), this.c_(), this.d_());
         case Y:
            return this.id_class(this.b_(), rfU_2.id_class(this.c_(), var2, var3), this.d_());
         case Z:
            return this.id_class(this.b_(), this.c_(), rfU_2.id_class(this.d_(), var2, var3));
         default:
            throw new IllegalStateException("Unable to clamp axis " + var1);
      }
   }

   @Override
   public rfH_2 id_class(rpB_2 var1, int var2) {
      return super.id_class(var1, var2).id_int();
   }

   @Override
   public rfH_2 id_class(rqd_3 var1) {
      return super.id_class(var1).id_int();
   }

   public rfw_3 id_class(int var1, int var2, int var3) {
      this.a_(var1);
      this.b_(var2);
      this.c_(var3);
      return this;
   }

   @Override
   public rfH_2 id_class(rpr_3 var1, int var2) {
      return super.id_class(var1, var2).id_int();
   }

   public rfw_3 id_class(rja_3 var1) {
      return this.id_class(var1.b_(), var1.c_(), var1.d_());
   }

   @Override
   public rfH_2 id_break(int var1, int var2, int var3) {
      return super.id_break(var1, var2, var3).id_int();
   }

   public rfw_3 id_break(double var1, double var3, double var5) {
      return this.id_class(rfU_2.id_byte(var1), rfU_2.id_byte(var3), rfU_2.id_byte(var5));
   }

   public rfw_3 id_case(long var1) {
      return this.id_class(id_class(var1), id_break(var1), id_byte(var1));
   }

   public rfw_3 id_case(rja_3 var1) {
      return this.id_class(this.b_() + var1.b_(), this.c_() + var1.c_(), this.d_() + var1.d_());
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

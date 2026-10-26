package celestial;

public class rrGi_1 extends rfH_2 {
   private int id_class;
   private int id_break;
   private int id_catch;
   private int id_private;
   private rrGi_1[] id_implements;
   private boolean id_finally;

   public static Iterable id_byte(rfH_2 var0, rfH_2 var1) {
      rfH_2 var2 = new rfH_2(Math.min(var0.b_(), var1.b_()), Math.min(var0.c_(), var1.c_()), Math.min(var0.d_(), var1.d_()));
      rfH_2 var3 = new rfH_2(Math.max(var0.b_(), var1.b_()), Math.max(var0.c_(), var1.c_()), Math.max(var0.d_(), var1.d_()));
      return new rrbr_3(var2, var3);
   }

   @Override
   public rfH_2 id_int() {
      return new rfH_2(this.id_class, this.id_break, this.id_catch);
   }

   public rrGi_1(int var1, int var2, int var3, int var4) {
      super(0, 0, 0);
      this.id_class = var1;
      this.id_break = var2;
      this.id_catch = var3;
      this.id_private = var4;
   }

   public rrGi_1() {
      this(0, 0, 0, 0);
   }

   public rrGi_1(int var1, int var2, int var3) {
      this(var1, var2, var3, 0);
   }

   public rrGi_1(double var1, double var3, double var5) {
      this(rfU_2.id_byte(var1), rfU_2.id_byte(var3), rfU_2.id_byte(var5));
   }

   public void id_class(rfH_2 var1, rpr_3 var2, rpr_3 var3) {
      this.id_class = var1.b_() + var2.id_implements() + var3.id_implements();
      this.id_break = var1.c_() + var2.id_finally() + var3.id_finally();
      this.id_catch = var1.d_() + var2.id_extends() + var3.id_extends();
   }

   public void id_class(rfH_2 var1, rpr_3 var2) {
      this.id_class = var1.b_() + var2.id_implements();
      this.id_break = var1.c_() + var2.id_finally();
      this.id_catch = var1.d_() + var2.id_extends();
   }

   @Override
   public rfH_2 id_class(rpr_3 var1, int var2) {
      return var2 == 1 ? this.id_break(var1) : super.id_class(var1, var2).id_int();
   }

   public void id_class(int var1, int var2, int var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_catch = var3;
      this.id_finally = true;
   }

   @Override
   public rfH_2 id_break(rpr_3 var1) {
      if (this.id_private <= 0) {
         return super.id_class(var1, 1).id_int();
      } else {
         if (this.id_implements == null) {
            this.id_implements = new rrGi_1[rpr_3.VALUES.length];
         }

         if (this.id_finally) {
            this.id_finally();
         }

         int var2 = var1.id_byte();
         rrGi_1 var3 = this.id_implements[var2];
         if (var3 == null) {
            int var4 = this.id_class + var1.id_implements();
            int var5 = this.id_break + var1.id_finally();
            int var6 = this.id_catch + var1.id_extends();
            var3 = new rrGi_1(var4, var5, var6, this.id_private - 1);
            this.id_implements[var2] = var3;
         }

         return var3;
      }
   }

   public void id_break(double var1, double var3, double var5) {
      this.id_class(rfU_2.id_byte(var1), rfU_2.id_byte(var3), rfU_2.id_byte(var5));
   }

   private void id_finally() {
      for (int var1 = 0; var1 < 6; var1++) {
         rrGi_1 var2 = this.id_implements[var1];
         if (var2 != null) {
            rpr_3 var3 = rpr_3.VALUES[var1];
            int var4 = this.id_class + var3.id_implements();
            int var5 = this.id_break + var3.id_finally();
            int var6 = this.id_catch + var3.id_extends();
            var2.id_class(var4, var5, var6);
         }
      }

      this.id_finally = false;
   }

   @Override
   public int c_() {
      return this.id_break;
   }

   @Override
   public int b_() {
      return this.id_class;
   }

   @Override
   public int d_() {
      return this.id_catch;
   }
}

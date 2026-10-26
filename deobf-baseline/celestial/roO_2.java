package celestial;

class roO_2 implements roG_2 {
   private final double id_break;
   private double id_byte;
   private double id_protected;
   private double id_throws;
   private double id_case;
   private rjC_2 id_catch;

   @Override
   public double id_byte() {
      return this.id_protected;
   }

   public roO_2(roE_2 var1, double var2) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_final();
   }

   @Override
   public double id_class() {
      return this.id_byte;
   }

   @Override
   public double id_break() {
      return this.id_throws;
   }

   @Override
   public double id_throws() {
      return this.id_break;
   }

   @Override
   public void id_finally() {
      this.id_final();
   }

   @Override
   public long id_catch() {
      return 0L;
   }

   @Override
   public void id_extends() {
      this.id_final();
   }

   @Override
   public double id_case() {
      return 0.0;
   }

   @Override
   public roB_2 id_implements() {
      return roB_2.STATIONARY;
   }

   @Override
   public double id_protected() {
      return this.id_case;
   }

   @Override
   public double id_private() {
      return this.id_break;
   }

   private void id_final() {
      this.id_byte = Math.max(this.id_class.id_class() - this.id_break / 2.0, (double)(-this.id_class.id_implements));
      this.id_protected = Math.max(this.id_class.id_break() - this.id_break / 2.0, (double)(-this.id_class.id_implements));
      this.id_throws = Math.min(this.id_class.id_class() + this.id_break / 2.0, (double)this.id_class.id_implements);
      this.id_case = Math.min(this.id_class.id_break() + this.id_break / 2.0, (double)this.id_class.id_implements);
      this.id_catch = rjw_3.id_class(
         rjw_3.id_class,
         rjw_3.id_class(
            Math.floor(this.id_class()),
            Double.NEGATIVE_INFINITY,
            Math.floor(this.id_byte()),
            Math.ceil(this.id_break()),
            Double.POSITIVE_INFINITY,
            Math.ceil(this.id_protected())
         ),
         rjN_2.id_throws
      );
   }

   @Override
   public rjC_2 id_volatile() {
      return this.id_catch;
   }

   @Override
   public roG_2 id_native() {
      return this;
   }
}

package celestial;

public class NO extends cr_3 {
   private int id_class;
   private int id_package;

   @Override
   public void id_byte() {
      if (this.id_package < 0) {
         this.id_super();
      }

      this.id_package = this.id_package + this.id_class;
      this.id_throws = rfU_2.id_class((float)this.id_package / 40.0F, 0.0F, 1.0F);
   }

   public NO(rqA_2 var1) {
      super(var1, rqL_2.AMBIENT);
      this.id_finally = true;
      this.id_extends = 0;
      this.id_throws = 1.0F;
      this.id_final = true;
   }

   public void id_class() {
      this.id_package = Math.min(this.id_package, 40);
      this.id_class = -1;
   }

   public void id_break() {
      this.id_package = Math.max(0, this.id_package);
      this.id_class = 1;
   }
}

package celestial;

public abstract class Nb_1 extends cr_3 {
   protected final rbF_2 id_class;
   private boolean id_package;

   @Override
   public void id_byte() {
      boolean var1 = this.id_break();
      if (var1 && !this.id_continue()) {
         QY.id_instanceof().c().id_class((Nm_1)this.id_class());
         this.id_package = true;
      }

      if (!(Boolean)this.id_class.id_throws[27] && !this.id_package) {
         this.id_catch = (double)((float)this.id_class.rx());
         this.id_private = (double)((float)this.id_class.re());
         this.id_implements = (double)((float)this.id_class.BO());
         float var2 = rfU_2.id_class(an_3.id_case(this.id_class.rv()));
         if ((double)var2 >= 0.01) {
            this.id_case = rfU_2.id_catch(rfU_2.id_class(var2, this.id_this(), this.id_else()), this.id_this(), this.id_else());
            this.id_throws = rfU_2.id_catch(rfU_2.id_class(var2, 0.0F, 0.5F), 0.0F, 1.2F);
         } else {
            this.id_case = 0.0F;
            this.id_throws = 0.0F;
         }
      } else {
         this.id_super();
      }
   }

   public Nb_1(rbF_2 var1, rqA_2 var2, rqL_2 var3) {
      super(var2, var3);
      this.id_class = var1;
      this.id_catch = (double)((float)var1.rx());
      this.id_private = (double)((float)var1.re());
      this.id_implements = (double)((float)var1.BO());
      this.id_finally = true;
      this.id_extends = 0;
      this.id_throws = 0.0F;
   }

   private float id_this() {
      return this.id_class.n_() ? 1.1F : 0.7F;
   }

   protected abstract cr_3 id_class();

   protected abstract boolean id_break();

   @Override
   public boolean id_throws() {
      return !this.id_class.BF();
   }

   private float id_else() {
      return this.id_class.n_() ? 1.5F : 1.1F;
   }

   @Override
   public boolean id_protected() {
      return true;
   }
}

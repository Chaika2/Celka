package celestial;

public class rLZ extends rLA {
   private rfH_2 id_class;

   public rLZ(is_3 var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void id_class() {
      if (!this.id_native()) {
         super.id_class();
      } else if (this.id_class != null) {
         if (this.id_class.id_class(this.id_break.Ps(), (double)this.id_break.PN())
            || this.id_break.re() > (double)this.id_class.c_()
               && new rfH_2((double)this.id_class.b_(), this.id_break.re(), (double)this.id_class.d_())
                  .id_class(this.id_break.Ps(), (double)this.id_break.PN())) {
            this.id_class = null;
         } else {
            this.id_break.id_super().id_class((double)this.id_class.b_(), (double)this.id_class.c_(), (double)this.id_class.d_(), this.id_throws);
         }
      }
   }

   @Override
   public boolean id_class(an_3 var1, double var2) {
      rLC var4 = this.id_class(var1, 0);
      if (var4 != null) {
         return this.id_class(var4, var2);
      } else {
         this.id_class = var1.Bs();
         this.id_throws = var2;
         return true;
      }
   }

   @Override
   public rLC id_class(an_3 var1, int var2) {
      this.id_class = var1.Bs();
      return super.id_class(var1, var2);
   }

   @Override
   public rLC id_class(rfH_2 var1, int var2) {
      this.id_class = var1;
      return super.id_class(var1, var2);
   }
}

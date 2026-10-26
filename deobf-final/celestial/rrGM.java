package celestial;

public class rrGM {
   public final rhd_3 class_;
   private boolean protected_;
   private int throws_;
   private int case_;
   private int catch_;
   private int private_;
   private int implements_;
   public int break_;

   public rrGM(rrGb_1 var1, rhd_3 var2) {
      this.byte_ = var1;
      this.protected_ = true;
      this.catch_ = 127;
      this.private_ = 127;
      this.class_ = var2;
   }

   public ruS_2<?> class_(rdn_3 var1) {
      if (this.protected_) {
         this.protected_ = false;
         return new rvF_2(
            rxI_2.protected_(var1),
            this.byte_.case_,
            this.byte_.protected_,
            this.byte_.private_,
            this.byte_.finally_.values(),
            this.byte_.catch_,
            this.throws_,
            this.case_,
            this.catch_ + 1 - this.throws_,
            this.private_ + 1 - this.case_
         );
      } else {
         return this.implements_++ % 5 == 0
            ? new rvF_2(
               rxI_2.protected_(var1),
               this.byte_.case_,
               this.byte_.protected_,
               this.byte_.private_,
               this.byte_.finally_.values(),
               this.byte_.catch_,
               0,
               0,
               0,
               0
            )
            : null;
      }
   }

   public void class_(int var1, int var2) {
      if (this.protected_) {
         this.throws_ = Math.min(this.throws_, var1);
         this.case_ = Math.min(this.case_, var2);
         this.catch_ = Math.max(this.catch_, var1);
         this.private_ = Math.max(this.private_, var2);
      } else {
         this.protected_ = true;
         this.throws_ = var1;
         this.case_ = var2;
         this.catch_ = var1;
         this.private_ = var2;
      }
   }
}

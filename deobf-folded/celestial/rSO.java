package celestial;

import java.util.EnumSet;

public class rSO extends rBk_1 {
   private static final ay_3 id_byte = new ay_3().id_class(10.0).id_class().id_break().id_protected().id_byte();
   protected final aA_2 id_class;
   private final double id_protected;
   private double id_throws;
   private double id_case;
   private double id_catch;
   private double id_private;
   private double id_implements;
   protected rhd_3 id_break;
   private int id_finally;
   private boolean id_extends;
   private final rkg_3 id_native;
   private final boolean id_volatile;

   @Override
   public void id_byte() {
      this.id_throws = this.id_break.rx();
      this.id_case = this.id_break.re();
      this.id_catch = this.id_break.BO();
      this.id_extends = true;
   }

   public rSO(aA_2 var1, double var2, rkg_3 var4, boolean var5) {
      this(var1, var2, var5, var4);
   }

   public rSO(aA_2 var1, double var2, boolean var4, rkg_3 var5) {
      this.id_class = var1;
      this.id_protected = var2;
      this.id_native = var5;
      this.id_volatile = var4;
      this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
      if (!(var1.id_public() instanceof rLA) && !(var1.id_public() instanceof rLL)) {
         throw new IllegalArgumentException("Unsupported mob type for TemptGoal");
      }
   }

   @Override
   public boolean id_class() {
      if (this.id_finally > 0) {
         this.id_finally--;
         return false;
      } else {
         this.id_break = ((rYB)this.id_class.id_throws[7]).id_class(id_byte, this.id_class);
         return this.id_break == null ? false : this.id_class(this.id_break.ss()) || this.id_class(this.id_break.Sn());
      }
   }

   protected boolean id_class(rdn_3 var1) {
      return this.id_native.id_class(var1);
   }

   @Override
   public boolean id_break() {
      if (this.id_catch()) {
         if (this.id_class.id_int(this.id_break) < 36.0) {
            if (this.id_break.id_class(this.id_throws, this.id_case, this.id_catch) > 0.010000000000000002) {
               return false;
            }

            if (Math.abs((double)((Float)this.id_break.id_throws[16]).floatValue() - this.id_private) > 5.0
               || Math.abs((double)((Float)this.id_break.id_throws[15]).floatValue() - this.id_implements) > 5.0) {
               return false;
            }
         } else {
            this.id_throws = this.id_break.rx();
            this.id_case = this.id_break.re();
            this.id_catch = this.id_break.BO();
         }

         this.id_private = (double)((Float)this.id_break.id_throws[16]).floatValue();
         this.id_implements = (double)((Float)this.id_break.id_throws[15]).floatValue();
      }

      return this.id_class();
   }

   @Override
   public void id_throws() {
      this.id_class.id_continue().id_class(this.id_break, (float)(this.id_class.S() + 20), (float)this.id_class.r());
      if (this.id_class.id_int(this.id_break) < 6.25) {
         this.id_class.id_public().id_final();
      } else {
         this.id_class.id_public().id_class(this.id_break, this.id_protected);
      }
   }

   protected boolean id_catch() {
      return this.id_volatile;
   }

   @Override
   public void id_protected() {
      this.id_break = null;
      this.id_class.id_public().id_final();
      this.id_finally = 100;
      this.id_extends = false;
   }

   public boolean id_private() {
      return this.id_extends;
   }
}

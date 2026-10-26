package celestial;

import java.util.EnumSet;

public class rBA extends rBk_1 {
   protected final is_3 id_class;
   protected an_3 id_break;
   protected final float id_byte;
   private int id_catch;
   protected final float id_protected;
   protected final Class<? extends iB_2> id_throws;
   protected final ay_3 id_case;

   @Override
   public void id_byte() {
      this.id_catch = 40 + this.id_class.Sa().nextInt(40);
   }

   public rBA(is_3 var1, Class<? extends iB_2> var2, float var3) {
      this(var1, var2, var3, 0.02F);
   }

   public rBA(is_3 var1, Class<? extends iB_2> var2, float var3, float var4) {
      this.id_class = var1;
      this.id_throws = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_class(EnumSet.of(rBW.LOOK));
      if (var2 == rhd_3.class) {
         this.id_case = new ay_3().id_class((double)var3).id_break().id_class().id_protected().id_class(var1x -> rpJ_2.id_break(var1).test(var1x));
      } else {
         this.id_case = new ay_3().id_class((double)var3).id_break().id_class().id_protected();
      }
   }

   @Override
   public boolean id_class() {
      if (this.id_class.Sa().nextFloat() >= this.id_protected) {
         return false;
      } else {
         if (this.id_class.I_() != null) {
            this.id_break = this.id_class.I_();
         }

         if (this.id_throws == rhd_3.class) {
            this.id_break = ((rYB)this.id_class.id_throws[7]).id_class(this.id_case, this.id_class, this.id_class.rx(), this.id_class.rH(), this.id_class.BO());
         } else {
            this.id_break = ((rYB)this.id_class.id_throws[7])
               .id_break(
                  this.id_throws,
                  this.id_case,
                  this.id_class,
                  this.id_class.rx(),
                  this.id_class.rH(),
                  this.id_class.BO(),
                  this.id_class.rN().id_byte((double)this.id_byte, 3.0, (double)this.id_byte)
               );
         }

         return this.id_break != null;
      }
   }

   @Override
   public boolean id_break() {
      if (!this.id_break.BM()) {
         return false;
      } else {
         return this.id_class.id_int(this.id_break) > (double)(this.id_byte * this.id_byte) ? false : this.id_catch > 0;
      }
   }

   @Override
   public void id_throws() {
      this.id_class.id_continue().id_class(this.id_break.rx(), this.id_break.rH(), this.id_break.BO());
      this.id_catch--;
   }

   @Override
   public void id_protected() {
      this.id_break = null;
   }
}

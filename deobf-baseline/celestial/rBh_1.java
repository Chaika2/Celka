package celestial;

import java.util.List;

public class rBh_1 extends rBk_1 {
   private int id_class;
   private final aA_2 id_break;
   private rhd_3 id_byte;
   private rPe_1 id_protected;

   @Override
   public void id_byte() {
      for (rSK var2 : ((rYB)this.id_break.id_throws[7]).id_class(rSK.class, this.id_break.rN().id_class(5.0))) {
         if (var2.rU() != null && var2.rU() instanceof rhd_3) {
            this.id_byte = (rhd_3)var2.rU();
            break;
         }
      }

      this.id_class = 0;
      this.id_protected = rPe_1.GO_TO_BOAT;
   }

   public rBh_1(aA_2 var1) {
      this.id_break = var1;
   }

   @Override
   public boolean id_class() {
      List var1 = ((rYB)this.id_break.id_throws[7]).id_class(rSK.class, this.id_break.rN().id_class(5.0));
      boolean var2 = false;

      for (rSK var4 : var1) {
         an_3 var5 = var4.rU();
         if (var5 instanceof rhd_3
            && (rfU_2.id_throws((Float)((rhd_3)var5).id_private[42]) > 0.0F || rfU_2.id_throws((Float)((rhd_3)var5).id_private[44]) > 0.0F)) {
            var2 = true;
            break;
         }
      }

      return this.id_byte != null && (rfU_2.id_throws((Float)this.id_byte.id_private[42]) > 0.0F || rfU_2.id_throws((Float)this.id_byte.id_private[44]) > 0.0F)
         || var2;
   }

   @Override
   public boolean id_break() {
      return this.id_byte != null
         && this.id_byte.Pm()
         && (rfU_2.id_throws((Float)this.id_byte.id_private[42]) > 0.0F || rfU_2.id_throws((Float)this.id_byte.id_private[44]) > 0.0F);
   }

   @Override
   public void id_throws() {
      boolean var1 = rfU_2.id_throws((Float)this.id_byte.id_private[42]) > 0.0F || rfU_2.id_throws((Float)this.id_byte.id_private[44]) > 0.0F;
      float var2 = this.id_protected == rPe_1.GO_IN_BOAT_DIRECTION ? (var1 ? 0.01F : 0.0F) : 0.015F;
      this.id_break
         .id_class(
            var2,
            new rjU_2(
               (double)((Float)this.id_break.id_private[42]).floatValue(),
               (double)((Float)this.id_break.id_private[43]).floatValue(),
               (double)((Float)this.id_break.id_private[44]).floatValue()
            )
         );
      this.id_break.id_class(iG_2.SELF, this.id_break.rv());
      if (--this.id_class <= 0) {
         this.id_class = 10;
         if (this.id_protected == rPe_1.GO_TO_BOAT) {
            rfH_2 var3 = this.id_byte.Bs().id_break(this.id_byte.Pg().id_case());
            var3 = var3.id_break(0, -1, 0);
            this.id_break.id_public().id_class((double)var3.b_(), (double)var3.c_(), (double)var3.d_(), 1.0);
            if (this.id_break.id_implements(this.id_byte) < 4.0F) {
               this.id_class = 0;
               this.id_protected = rPe_1.GO_IN_BOAT_DIRECTION;
            }
         } else if (this.id_protected == rPe_1.GO_IN_BOAT_DIRECTION) {
            rpr_3 var6 = this.id_byte.rS();
            rfH_2 var4 = this.id_byte.Bs().id_class(var6, 10);
            this.id_break.id_public().id_class((double)var4.b_(), (double)(var4.c_() - 1), (double)var4.d_(), 1.0);
            if (this.id_break.id_implements(this.id_byte) > 12.0F) {
               this.id_class = 0;
               this.id_protected = rPe_1.GO_TO_BOAT;
            }
         }
      }
   }

   @Override
   public void id_protected() {
      this.id_byte = null;
   }

   @Override
   public boolean J_() {
      return true;
   }
}

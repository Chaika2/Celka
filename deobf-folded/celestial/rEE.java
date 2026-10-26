package celestial;

import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

class rEE extends rBk_1 {
   private final rEB id_class;
   private final double id_break;
   private rfH_2 id_byte;
   private final List<rfH_2> id_protected = Lists.newArrayList();
   private final int id_throws;
   private boolean id_case;

   @Override
   public void id_byte() {
      super.id_byte();
      this.id_class.id_native(0);
      this.id_class.id_public().id_class((double)this.id_byte.b_(), (double)this.id_byte.c_(), (double)this.id_byte.d_(), this.id_break);
      this.id_case = false;
   }

   public rEE(rEB var1, double var2, int var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_throws = var4;
      this.id_class(EnumSet.of(rBW.MOVE));
   }

   private boolean id_class(rfH_2 var1) {
      for (rfH_2 var3 : this.id_protected) {
         if (Objects.equals(var1, var3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public boolean id_class() {
      this.id_finally();
      return this.id_catch() && this.id_private() && this.id_class.I_() == null;
   }

   @Override
   public boolean id_break() {
      return this.id_class.id_public().id_native()
         ? false
         : this.id_class.I_() == null && !this.id_byte.id_class(this.id_class.Ps(), (double)(this.id_class.PN() + (float)this.id_throws)) && !this.id_case;
   }

   @Override
   public void id_throws() {
      if (this.id_class.id_public().id_native()) {
         rjU_2 var1 = rjU_2.id_protected(this.id_byte);
         rjU_2 var2 = iX_2.id_class(this.id_class, 16, 7, var1, (float) (Math.PI / 10));
         if (var2 == null) {
            var2 = iX_2.id_break(this.id_class, 8, 7, var1);
         }

         if (var2 == null) {
            this.id_case = true;
            return;
         }

         this.id_class.id_public().id_class(var2.id_break, var2.id_byte, var2.id_protected, this.id_break);
      }
   }

   private void id_finally() {
      if (this.id_protected.size() > 2) {
         this.id_protected.remove(0);
      }
   }

   private boolean id_catch() {
      return this.id_class.sd() && !this.id_class.sx().id_class();
   }

   @Override
   public void id_protected() {
      if (this.id_byte.id_class(this.id_class.Ps(), (double)this.id_throws)) {
         this.id_protected.add(this.id_byte);
      }
   }

   private boolean id_private() {
      rrEm_1 var1 = (rrEm_1)((rYB)this.id_class.id_throws[7]);
      rfH_2 var2 = this.id_class.Bs();
      Optional var3 = var1.d().id_class(var0 -> var0 == rRP.id_continue, this::id_class, rRr_1.ANY, var2, 48, rEB.id_case(this.id_class));
      if (!var3.isPresent()) {
         return false;
      } else {
         this.id_byte = ((rfH_2)var3.get()).id_int();
         return true;
      }
   }
}

package celestial;

import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class rHW extends ryO_2 implements rHf_1 {
   private long id_protected;
   public int id_class;
   public boolean id_break;
   public rpr_3 id_byte;
   private List<iB_2> id_throws;
   private boolean id_case;
   private int id_catch;

   public rHW() {
      super(ryW_2.id_interface);
   }

   private void id_class(rYB var1) {
      if (!var1.id_continue) {
         this.id_throws.stream().filter(this::id_class).forEach(this::id_break);
      }
   }

   private boolean id_class(iB_2 var1) {
      return var1.BM() && !(Boolean)var1.id_throws[27] && this.id_char().id_class(var1.Ps(), 48.0) && var1.BC().id_class(rlE_2.id_byte);
   }

   public void id_class(rpr_3 var1) {
      rfH_2 var2 = this.id_char();
      this.id_byte = var1;
      if (this.id_break) {
         this.id_class = 0;
      } else {
         this.id_break = true;
      }

      this.id_extends.id_class(var2, this.id_abstract().id_break(), 1, var1.id_byte());
   }

   private void id_break(iB_2 var1) {
      var1.id_break(new rLY(rLD.id_public, 60));
   }

   private void id_break(rYB var1) {
      if (var1.id_continue) {
         rfH_2 var2 = this.id_char();
         MutableInt var3 = new MutableInt(16700985);
         int var4 = (int)this.id_throws.stream().filter(var1x -> var2.id_class(var1x.Ps(), 48.0)).count();
         this.id_throws
            .stream()
            .filter(this::id_class)
            .forEach(
               var4x -> {
                  float var5 = 1.0F;
                  float var6 = rfU_2.id_class(
                     (var4x.rx() - (double)var2.b_()) * (var4x.rx() - (double)var2.b_()) + (var4x.BO() - (double)var2.d_()) * (var4x.BO() - (double)var2.d_())
                  );
                  double var7 = (double)((float)var2.b_() + 0.5F) + (double)(1.0F / var6) * (var4x.rx() - (double)var2.b_());
                  double var9 = (double)((float)var2.d_() + 0.5F) + (double)(1.0F / var6) * (var4x.BO() - (double)var2.d_());
                  int var11 = rfU_2.id_class((var4 - 21) / -2, 3, 15);

                  for (int var12 = 0; var12 < var11; var12++) {
                     int var13 = var3.addAndGet(5);
                     double var14 = (double)ryj_3.id_break(var13) / 255.0;
                     double var16 = (double)ryj_3.id_byte(var13) / 255.0;
                     double var18 = (double)ryj_3.id_protected(var13) / 255.0;
                     var1.id_class(rLQ.id_else, var7, (double)((float)var2.c_() + 0.5F), var9, var14, var16, var18);
                  }
               }
            );
      }
   }

   @Override
   public void id_throws() {
      if (this.id_break) {
         this.id_class++;
      }

      if (this.id_class >= 50) {
         this.id_break = false;
         this.id_class = 0;
      }

      if (this.id_class >= 5 && this.id_catch == 0 && this.id_finally()) {
         this.id_case = true;
         this.id_catch();
      }

      if (this.id_case) {
         if (this.id_catch < 40) {
            this.id_catch++;
         } else {
            this.id_class(this.id_extends);
            this.id_break(this.id_extends);
            this.id_case = false;
         }
      }
   }

   private boolean id_finally() {
      rfH_2 var1 = this.id_char();

      for (iB_2 var3 : this.id_throws) {
         if (var3.BM() && !(Boolean)var3.id_throws[27] && var1.id_class(var3.Ps(), 32.0) && var3.BC().id_class(rlE_2.id_byte)) {
            return true;
         }
      }

      return false;
   }

   private void id_catch() {
      this.id_extends.id_class((rhd_3)null, this.id_char(), rqn_3.g, rqL_2.BLOCKS, 1.0F, 1.0F);
   }

   private void id_private() {
      rfH_2 var1 = this.id_char();
      if (this.id_extends.r() > this.id_protected + 60L || this.id_throws == null) {
         this.id_protected = this.id_extends.r();
         rfl_3 var2 = new rfl_3(var1).id_class(48.0);
         this.id_throws = this.id_extends.id_class(iB_2.class, var2);
      }

      if (!this.id_extends.id_continue) {
         for (iB_2 var3 : this.id_throws) {
            if (var3.BM() && !(Boolean)var3.id_throws[27] && var1.id_class(var3.Ps(), 32.0)) {
               var3.SF().id_class(il_3.id_throw, this.id_extends.r());
            }
         }
      }
   }

   @Override
   public boolean a_(int var1, int var2) {
      if (var1 == 1) {
         this.id_private();
         this.id_catch = 0;
         this.id_byte = rpr_3.id_class(var2);
         this.id_class = 0;
         this.id_break = true;
         return true;
      } else {
         return super.a_(var1, var2);
      }
   }
}

package celestial;

import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;

public class rbH_2 extends rbq_3 {
   private int id_byte;
   private List<rfH_2> id_protected;
   private rLC id_throws;
   private int id_case;

   @Override
   public void id_byte() {
      this.id_byte = 0;
      this.id_case = 0;
      super.id_byte();
   }

   private void id_byte(rfH_2 var1) {
      this.id_protected.add(var1);

      while (this.id_protected.size() > 3) {
         this.id_protected.remove(0);
      }
   }

   rbH_2(rbF_2 var1) {
      super(var1);
      this.id_class = var1;
      this.id_byte = ((rYB)this.id_class.id_throws[7]).id_int.nextInt(10);
      this.id_protected = Lists.newArrayList();
      this.id_throws = null;
      this.id_class(EnumSet.of(rBW.MOVE));
   }

   private boolean id_class(rfH_2 var1) {
      rbF_2.id_case(this.id_class).id_class(10.0F);
      rbF_2.id_catch(this.id_class).id_class((double)var1.b_(), (double)var1.c_(), (double)var1.d_(), 1.0);
      return rbF_2.id_private(this.id_class).id_finally() != null && rbF_2.id_implements(this.id_class).id_finally().id_finally();
   }

   boolean id_break(rfH_2 var1) {
      return this.id_protected.contains(var1);
   }

   @Override
   public void id_throws() {
      if (this.id_class.id_abstract != null) {
         this.id_byte++;
         if (this.id_byte > 600) {
            this.id_extends();
         } else if (!rbF_2.id_byte(this.id_class).id_volatile()) {
            if (!this.id_class.id_break(this.id_class.id_abstract, 16)) {
               if (this.id_class.id_native(this.id_class.id_abstract)) {
                  this.id_native();
               } else {
                  this.id_class.id_finally(this.id_class.id_abstract);
               }
            } else {
               boolean var1 = this.id_class(this.id_class.id_abstract);
               if (!var1) {
                  this.id_extends();
               } else if (this.id_throws != null && rbF_2.id_protected(this.id_class).id_finally().id_class(this.id_throws)) {
                  this.id_case++;
                  if (this.id_case > 60) {
                     this.id_native();
                     this.id_case = 0;
                  }
               } else {
                  this.id_throws = rbF_2.id_throws(this.id_class).id_finally();
               }
            }
         }
      }
   }

   void id_finally() {
      this.id_protected.clear();
   }

   @Override
   public boolean id_catch() {
      return this.id_class.id_abstract != null
         && !this.id_class.k()
         && this.id_class.sF()
         && !this.id_protected(this.id_class.id_abstract)
         && ((rYB)this.id_class.id_throws[7]).id_byte(this.id_class.id_abstract).id_class(rls_3.k);
   }

   private void id_extends() {
      if (this.id_class.id_abstract != null) {
         this.id_byte(this.id_class.id_abstract);
      }

      this.id_native();
   }

   @Override
   public void id_protected() {
      this.id_byte = 0;
      this.id_case = 0;
      rbF_2.id_class(this.id_class).id_final();
      rbF_2.id_break(this.id_class).id_case();
   }

   private boolean id_protected(rfH_2 var1) {
      if (this.id_class.id_break(var1, 2)) {
         return true;
      } else {
         rLC var2 = rbF_2.id_finally(this.id_class).id_finally();
         return var2 != null && var2.id_volatile().equals(var1) && var2.id_finally() && var2.id_byte();
      }
   }

   @Override
   public boolean id_private() {
      return this.id_catch();
   }

   private void id_native() {
      this.id_class.id_abstract = null;
      this.id_class.id_throw = 200;
   }
}

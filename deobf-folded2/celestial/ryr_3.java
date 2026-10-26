package celestial;

import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class ryr_3 extends rHK implements rHf_1, rXF {
   private static final int[] id_class = IntStream.range(0, 27).toArray();
   private rqs_3<rdn_3> id_break = rqs_3.id_class(27, rdn_3.id_break);
   private int id_byte;
   private ryB_2 id_case = ryB_2.CLOSED;
   private float id_catch;
   private float id_private;
   @Nullable
   private rxL_2 id_implements;
   private boolean id_finally;

   public ryr_3(@Nullable rxL_2 var1) {
      super(ryW_2.id_return);
      this.id_implements = var1;
   }

   public ryr_3() {
      this((rxL_2)null);
      this.id_finally = true;
   }

   @Override
   protected void id_class(rqs_3<rdn_3> var1) {
      this.id_break = var1;
   }

   @Override
   public void id_class(xc_3 var1, rcd_3 var2) {
      super.id_class(var1, var2);
      this.id_protected(var2);
   }

   public float id_class(float var1) {
      return rfU_2.id_catch(var1, this.id_private, this.id_catch);
   }

   @Override
   public boolean id_class(int var1, rdn_3 var2, @Nullable rpr_3 var3) {
      return !(xd_3.id_class(var2.id_break()) instanceof Wp_1);
   }

   @Override
   public int[] id_class(rpr_3 var1) {
      return id_class;
   }

   @Override
   protected rJr_1 id_class(int var1, rhz_3 var2) {
      return new rJV(var1, var2, this);
   }

   @Override
   public rcd_3 id_class(rcd_3 var1) {
      super.id_class(var1);
      return this.id_throws(var1);
   }

   public rfl_3 id_class(xc_3 var1, float var2) {
      return this.id_class(var1.id_byte(Wp_1.id_volatile), var2);
   }

   public rfl_3 id_class(rpr_3 var1, float var2) {
      float var3 = this.id_class(var2);
      return rjw_3.id_break()
         .id_class()
         .id_break(
            (double)(0.5F * var3 * (float)var1.id_implements()),
            (double)(0.5F * var3 * (float)var1.id_finally()),
            (double)(0.5F * var3 * (float)var1.id_extends())
         );
   }

   @Override
   public void id_break(rhd_3 var1) {
      if (!var1.id_native()) {
         this.id_byte--;
         this.id_extends.id_class(this.id_native, this.id_abstract().id_break(), 1, this.id_byte);
         if (this.id_byte <= 0) {
            this.id_extends.id_class((rhd_3)null, this.id_native, rqn_3.JO, rqL_2.BLOCKS, 0.5F, this.id_extends.id_int.nextFloat() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public boolean id_break(int var1, rdn_3 var2, rpr_3 var3) {
      return true;
   }

   private rfl_3 id_break(rpr_3 var1, float var2) {
      rpr_3 var3 = var1.id_case();
      return this.id_class(var1, var2).id_class((double)var3.id_implements(), (double)var3.id_finally(), (double)var3.id_extends());
   }

   public rcd_3 id_throws(rcd_3 var1) {
      if (!this.id_byte(var1)) {
         rXC.id_class(var1, this.id_break, false);
      }

      return var1;
   }

   @Override
   public void id_throws() {
      this.id_catch();
      if (this.id_case == ryB_2.OPENING || this.id_case == ryB_2.CLOSING) {
         this.id_native();
      }
   }

   @Nullable
   public rxL_2 id_finally() {
      if (this.id_finally) {
         this.id_implements = Wp_1.id_class(this.id_abstract().id_break());
         this.id_finally = false;
      }

      return this.id_implements;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected void id_catch() {
      this.id_private = this.id_catch;
      switch (this.id_case) {
         case CLOSED:
            this.id_catch = 0.0F;
            break;
         case OPENING:
            this.id_catch += 0.1F;
            if (this.id_catch >= 1.0F) {
               this.id_native();
               this.id_case = ryB_2.OPENED;
               this.id_catch = 1.0F;
               this.id_volatile();
            }
            break;
         case CLOSING:
            this.id_catch -= 0.1F;
            if (this.id_catch <= 0.0F) {
               this.id_case = ryB_2.CLOSED;
               this.id_catch = 0.0F;
               this.id_volatile();
            }
            break;
         case OPENED:
            this.id_catch = 1.0F;
      }
   }

   public boolean id_extends() {
      return this.id_case == ryB_2.CLOSED;
   }

   @Override
   public int id_else() {
      return this.id_break.size();
   }

   public void id_protected(rcd_3 var1) {
      this.id_break = rqs_3.id_class(this.id_else(), rdn_3.id_break);
      if (!this.id_break(var1) && var1.id_byte("Items", 9)) {
         rXC.id_break(var1, this.id_break);
      }
   }

   public ryB_2 id_private() {
      return this.id_case;
   }

   private void id_volatile() {
      this.id_abstract().id_class(this.id_while(), this.id_char(), 3);
   }

   private void id_native() {
      xc_3 var1 = this.id_extends.id_byte(this.id_char());
      if (var1.id_break() instanceof Wp_1) {
         rpr_3 var2 = var1.id_byte(Wp_1.id_volatile);
         rfl_3 var3 = this.id_break(var2, 1.0F).id_class(this.id_native);
         List var4 = this.id_extends.id_class((an_3)null, var3);
         if (!var4.isEmpty()) {
            for (int var5 = 0; var5 < var4.size(); var5++) {
               an_3 var6 = (an_3)var4.get(var5);
               if (var6.r_() != Qs_1.IGNORE) {
                  double var7 = 0.0;
                  double var9 = 0.0;
                  double var11 = 0.0;
                  rfl_3 var13 = var6.rN();
                  switch (var2.id_final()) {
                     case X:
                        if (var2.id_throws() == rpG_2.POSITIVE) {
                           var7 = var3.id_protected - var13.id_class;
                        } else {
                           var7 = var13.id_protected - var3.id_class;
                        }

                        var7 += 0.01;
                        break;
                     case Y:
                        if (var2.id_throws() == rpG_2.POSITIVE) {
                           var9 = var3.id_throws - var13.id_break;
                        } else {
                           var9 = var13.id_throws - var3.id_break;
                        }

                        var9 += 0.01;
                        break;
                     case Z:
                        if (var2.id_throws() == rpG_2.POSITIVE) {
                           var11 = var3.id_case - var13.id_byte;
                        } else {
                           var11 = var13.id_case - var3.id_byte;
                        }

                        var11 += 0.01;
                  }

                  var6.id_class(
                     iG_2.SHULKER_BOX, new rjU_2(var7 * (double)var2.id_implements(), var9 * (double)var2.id_finally(), var11 * (double)var2.id_extends())
                  );
               }
            }
         }
      }
   }

   @Override
   public boolean a_(int var1, int var2) {
      if (var1 == 1) {
         this.id_byte = var2;
         if (var2 == 0) {
            this.id_case = ryB_2.CLOSING;
            this.id_volatile();
         }

         if (var2 == 1) {
            this.id_case = ryB_2.OPENING;
            this.id_volatile();
         }

         return true;
      } else {
         return super.a_(var1, var2);
      }
   }

   @Override
   protected rqs_3<rdn_3> ad_() {
      return this.id_break;
   }

   @Override
   public void b_(rhd_3 var1) {
      if (!var1.id_native()) {
         if (this.id_byte < 0) {
            this.id_byte = 0;
         }

         this.id_byte++;
         this.id_extends.id_class(this.id_native, this.id_abstract().id_break(), 1, this.id_byte);
         if (this.id_byte == 1) {
            this.id_extends.id_class((rhd_3)null, this.id_native, rqn_3.Jh, rqL_2.BLOCKS, 0.5F, this.id_extends.id_int.nextFloat() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected rgP_2 X_() {
      return new rgn_3("container.shulkerBox");
   }
}

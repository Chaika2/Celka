package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;

public class rbd_3 extends rbM_2 {
   protected static final ImmutableList<rrP_2<? extends rrr_3<? super rbd_3>>> id_protected = ImmutableList.of(
      rrP_2.id_byte, rrP_2.id_protected, rrP_2.id_break, rrP_2.id_case, rrP_2.id_native
   );
   protected static final ImmutableList<il_3<?>> id_super = ImmutableList.of(
      il_3.id_final,
      il_3.id_synchronized,
      il_3.id_catch,
      il_3.id_private,
      il_3.id_extends,
      il_3.id_native,
      il_3.s,
      il_3.S,
      il_3.id_public,
      il_3.id_goto,
      il_3.id_volatile,
      il_3.id_interface,
      new il_3[]{il_3.id_package, il_3.id_int, il_3.id_new, il_3.id_this, il_3.id_short, il_3.id_import, il_3.id_break}
   );

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.hX;
   }

   @Override
   protected void id_double() {
      this.SF().id_class((rrEm_1)((rYB)this.id_throws[7]), this);
      rbx_3.id_break(this);
      rbx_3.id_byte(this);
      super.id_double();
   }

   public rbd_3(aI_2<? extends rbd_3> var1, rYB var2) {
      super(var1, var2);
      this.id_finally = 20;
   }

   @Override
   protected void id_class(rRh_1 var1) {
      this.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.Ol));
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      rbx_3.id_class(this);
      this.id_class(var2);
      return super.id_class(var1, var2, var3, var4, var5);
   }

   @Override
   protected iZ_2<?> id_class(Dynamic<?> var1) {
      return rbx_3.id_class(this, this.SV().id_class(var1));
   }

   @Override
   public rbJ_2 sd() {
      return this.v() && this.sk() ? rbJ_2.ATTACKING_WITH_MELEE_WEAPON : rbJ_2.DEFAULT;
   }

   @Override
   protected void id_break(rfH_2 var1, xc_3 var2) {
      this.id_class(rqn_3.hJ, 0.15F, 1.0F);
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      boolean var3 = super.id_break(var1, var2);
      if (((rYB)this.id_throws[7]).id_continue) {
         return false;
      } else {
         if (var3 && var1.id_extends() instanceof iB_2) {
            rbx_3.id_class(this, (iB_2)var1.id_extends());
         }

         return var3;
      }
   }

   @Override
   public boolean id_throws() {
      return false;
   }

   @Override
   public boolean id_implements(rdn_3 var1) {
      return var1.id_break() == rdy_3.Ol ? super.id_implements(var1) : false;
   }

   @Override
   protected rqA_2 id_static() {
      return rqn_3.hM;
   }

   public static iz_3 sz() {
      return rEi_1.sm().id_class(iQ_2.id_class, 50.0).id_class(iQ_2.id_protected, 0.35F).id_class(iQ_2.id_case, 7.0);
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.hh;
   }

   @Override
   public iZ_2<rbd_3> SF() {
      return (iZ_2<rbd_3>)super.SF();
   }

   @Override
   protected void sW() {
      this.id_class(rqn_3.hx, 1.0F, this.SN());
   }

   @Override
   protected iF_2<rbd_3> SV() {
      return iZ_2.id_class(id_super, id_protected);
   }

   protected void sQ() {
      this.id_class(rqn_3.hO, 1.0F, this.SN());
   }
}

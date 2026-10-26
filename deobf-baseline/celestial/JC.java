package celestial;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public abstract class JC extends rCn_1<xd_3, xc_3> {
   private final int id_break;
   private final boolean id_throws;
   private final boolean id_case;
   private final QP id_catch;
   private final QS id_private;
   private final float id_implements;
   private final boolean id_finally;
   private final boolean id_extends;
   private final Jy_1 id_native;
   private final Jy_1 id_volatile;
   private final Jy_1 id_final;
   private final Jy_1 id_package;
   private final Jy_1 id_int;
   protected Jl_1 id_class;

   public rjC_2 id_byte(rRq_1 var1, rfH_2 var2) {
      return this.id_break().id_class(this.id_int(), var1, var2);
   }

   public rjC_2 id_byte(rRq_1 var1, rfH_2 var2, rjm_3 var3) {
      return this.id_break().id_byte(this.id_int(), var1, var2, var3);
   }

   public int id_byte(rRq_1 var1, rfH_2 var2, rpr_3 var3) {
      return this.id_break().id_break(this.id_int(), var1, var2, var3);
   }

   public QP id_byte() {
      return this.id_catch;
   }

   public boolean id_int(rRq_1 var1, rfH_2 var2) {
      return this.id_package.test(this.id_int(), var1, var2);
   }

   protected abstract xc_3 id_int();

   protected JC(xd_3 var1, ImmutableMap<rCZ<?>, Comparable<?>> var2, MapCodec<xc_3> var3) {
      super(var1, var2, var3);
      Jq_1 var4 = var1.id_extends;
      this.id_break = var4.id_throws.applyAsInt(this.id_int());
      this.id_throws = var1.id_break(this.id_int());
      this.id_case = var4.id_package;
      this.id_catch = var4.id_class;
      this.id_private = var4.id_break.apply(this.id_int());
      this.id_implements = var4.id_catch;
      this.id_finally = var4.id_private;
      this.id_extends = var4.id_final;
      this.id_native = var4.id_new;
      this.id_volatile = var4.id_continue;
      this.id_final = var4.id_super;
      this.id_package = var4.id_this;
      this.id_int = var4.id_else;
   }

   public final void id_class(rRg_1 var1, rfH_2 var2, int var3) {
      this.id_class(var1, var2, var3, 512);
   }

   public final void id_class(rRg_1 var1, rfH_2 var2, int var3, int var4) {
      this.id_break();
      rfw_3 var5 = new rfw_3();

      for (rpr_3 var9 : JA.id_class) {
         var5.id_class(var2, var9);
         xc_3 var10 = var1.id_byte(var5);
         xc_3 var11 = var10.id_class(var9.id_case(), this.id_int(), var1, var5, var2);
         xd_3.id_class(var10, var11, var1, var5, var3, var4);
      }
   }

   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, boolean var4) {
      this.id_break().id_class(this.id_int(), var1, var2, var3, var4);
   }

   public void id_class(rrEm_1 var1, rfH_2 var2, Random var3) {
      this.id_break().id_break(this.id_int(), var1, var2, var3);
   }

   public void id_class(rYB var1, rfH_2 var2, an_3 var3) {
      this.id_break().id_class(this.id_int(), var1, var2, var3);
   }

   public void id_class(rrEm_1 var1, rfH_2 var2, rdn_3 var3) {
      this.id_break().id_class(this.id_int(), var1, var2, var3);
   }

   public final boolean id_class(rRq_1 var1, rfH_2 var2, an_3 var3, rpr_3 var4) {
      return xd_3.id_class(this.id_break(var1, var2, rjm_3.id_class(var3)), var4);
   }

   public final boolean id_class(rRq_1 var1, rfH_2 var2, an_3 var3) {
      return this.id_class(var1, var2, var3, rpr_3.UP);
   }

   public rjC_2 id_class(rRq_1 var1, rfH_2 var2, rjm_3 var3) {
      return this.id_break().id_class(this.id_int(), var1, var2, var3);
   }

   public rjU_2 id_class(rfH_2 var1) {
      Jp_1 var2 = this.id_break().id_byte();
      if (var2 == Jp_1.NONE) {
         return rjU_2.id_class;
      } else {
         long var3 = rfU_2.id_byte(var1.b_(), 0, var1.d_());
         return new rjU_2(
            ((double)((float)(var3 & 15L) / 15.0F) - 0.5) * 0.5,
            var2 == Jp_1.XYZ ? ((double)((float)(var3 >> 4 & 15L) / 15.0F) - 1.0) * 0.2 : 0.0,
            ((double)((float)(var3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5
         );
      }
   }

   public boolean id_class(rYB var1, rfH_2 var2, int var3, int var4) {
      return this.id_break().id_class(this.id_int(), var1, var2, var3, var4);
   }

   public void id_class(rYB var1, rfH_2 var2, xd_3 var3, rfH_2 var4, boolean var5) {
      this.id_break().id_class(this.id_int(), var1, var2, var3, var4, var5);
   }

   public boolean id_class(rlb_3<xd_3> var1, Predicate<JC> var2) {
      return this.id_break().id_class(var1) && var2.test(this);
   }

   public boolean id_class(rlb_3<xd_3> var1) {
      return this.id_break().id_class(var1);
   }

   public boolean id_class(rRR var1, rfH_2 var2) {
      return this.id_break().id_class(this.id_int(), var1, var2);
   }

   public boolean id_class(rXs_1 var1) {
      return this.id_break().id_class(this.id_int(), var1);
   }

   public boolean id_class(xd_3 var1) {
      return this.id_break().id_break(var1);
   }

   public void id_class(rYB var1, xc_3 var2, rff_3 var3, rhf_3 var4) {
      this.id_break().id_class(var1, var2, var3, var4);
   }

   public boolean id_class(rRq_1 var1, rfH_2 var2, rpr_3 var3, ryH_2 var4) {
      return this.id_class != null ? this.id_class.id_class(var3, var4) : var4.id_class(this.id_int(), var1, var2, var3);
   }

   public List<rdn_3> id_class(rzP_2 var1) {
      return this.id_break().id_class(this.id_int(), var1);
   }

   public ryZ_2 id_class(rYB var1, rhd_3 var2, rpm_3 var3, rff_3 var4) {
      return this.id_break().id_class(this.id_int(), var1, var4.id_class(), var2, var3, var4);
   }

   public void id_class(rYB var1, rfH_2 var2, rhd_3 var3) {
      this.id_break().id_class(this.id_int(), var1, var2, var3);
   }

   public xc_3 id_class(rpr_3 var1, xc_3 var2, rRg_1 var3, rfH_2 var4, rfH_2 var5) {
      return this.id_break().id_class(this.id_int(), var1, var2, var3, var4, var5);
   }

   public boolean id_class(rRq_1 var1, rfH_2 var2, rLT var3) {
      return this.id_break().id_class(this.id_int(), var1, var2, var3);
   }

   public boolean id_class(rxx_3 var1) {
      return this.id_break().id_class(this.id_int(), var1);
   }

   public boolean id_class(rRq_1 var1, rfH_2 var2) {
      return this.id_class != null ? this.id_class.id_catch : this.id_break().a_(this.id_int(), var1, var2);
   }

   public xc_3 id_class(rpa_3 var1) {
      return this.id_break().id_class(this.id_int(), var1);
   }

   public float id_class(rhd_3 var1, rdn_3 var2, rRq_1 var3, rfH_2 var4) {
      return this.id_break().id_class(this.id_int(), var1, var2, var3, var4);
   }

   public float id_class(rhd_3 var1, rRq_1 var2, rfH_2 var3) {
      return this.id_break().id_class(this.id_int(), var1, var2, var3);
   }

   public boolean id_class(rRq_1 var1, rfH_2 var2, aI_2<?> var3) {
      return this.id_break().id_extends.id_int.test(this.id_int(), var1, var2, var3);
   }

   public int id_class(rYB var1, rfH_2 var2) {
      return this.id_break().id_break(this.id_int(), var1, var2);
   }

   public boolean id_class(xc_3 var1, rpr_3 var2) {
      return this.id_break().id_class(this.id_int(), var1, var2);
   }

   public xc_3 id_class(rqd_3 var1) {
      return this.id_break().id_class(this.id_int(), var1);
   }

   public rjC_2 id_class(rRq_1 var1, rfH_2 var2, rpr_3 var3) {
      return this.id_class != null && this.id_class.id_implements != null
         ? this.id_class.id_implements[var3.ordinal()]
         : rjw_3.id_class(this.id_byte(var1, var2), var3);
   }

   public void id_class() {
      if (!this.id_break().id_super()) {
         this.id_class = new Jl_1(this.id_int());
      }
   }

   public void id_break(rRg_1 var1, rfH_2 var2, int var3, int var4) {
      this.id_break().id_class(this.id_int(), var1, var2, var3, var4);
   }

   public void id_break(rYB var1, rfH_2 var2, xc_3 var3, boolean var4) {
      this.id_break().id_break(this.id_int(), var1, var2, var3, var4);
   }

   public rJZ id_break(rYB var1, rfH_2 var2) {
      return this.id_break().id_class(this.id_int(), var1, var2);
   }

   public void id_break(rrEm_1 var1, rfH_2 var2, Random var3) {
      this.id_break().id_class(this.id_int(), var1, var2, var3);
   }

   public long id_break(rfH_2 var1) {
      return this.id_break().id_class(this.id_int(), var1);
   }

   public int id_break(rRq_1 var1, rfH_2 var2) {
      return this.id_class != null ? this.id_class.id_private : this.id_break().id_protected(this.id_int(), var1, var2);
   }

   public int id_break(rRq_1 var1, rfH_2 var2, rpr_3 var3) {
      return this.id_break().id_class(this.id_int(), var1, var2, var3);
   }

   public rjC_2 id_break(rRq_1 var1, rfH_2 var2, rjm_3 var3) {
      return this.id_break().id_break(this.id_int(), var1, var2, var3);
   }

   public xd_3 id_break() {
      return this.id_byte;
   }

   public final void id_break(rRg_1 var1, rfH_2 var2, int var3) {
      this.id_break(var1, var2, var3, 512);
   }

   public boolean id_throws(rRq_1 var1, rfH_2 var2) {
      return this.id_int.test(this.id_int(), var1, var2);
   }

   public boolean id_throws() {
      return this.id_throws;
   }

   public rjC_2 id_finally(rRq_1 var1, rfH_2 var2) {
      return this.id_class(var1, var2, rjm_3.id_break());
   }

   public boolean id_finally() {
      return this.id_break().id_case(this.id_int());
   }

   public boolean id_catch() {
      return this.id_case;
   }

   public boolean id_catch(rRq_1 var1, rfH_2 var2) {
      return this.id_native.test(this.id_int(), var1, var2);
   }

   public Qs_1 id_extends() {
      return this.id_break().id_protected(this.id_int());
   }

   public rjC_2 id_extends(rRq_1 var1, rfH_2 var2) {
      return this.id_class != null ? this.id_class.id_break : this.id_break(var1, var2, rjm_3.id_break());
   }

   public int id_case() {
      return this.id_break;
   }

   public float id_case(rRq_1 var1, rfH_2 var2) {
      return this.id_break().id_throws(this.id_int(), var1, var2);
   }

   public boolean id_implements(rRq_1 var1, rfH_2 var2) {
      if (this.id_class != null) {
         return this.id_class.id_class;
      } else {
         xc_3 var3 = this.id_int();
         return var3.id_native() ? xd_3.id_class(var3.id_byte(var1, var2)) : false;
      }
   }

   public boolean id_implements() {
      return this.id_break().id_byte(this.id_int());
   }

   public boolean id_new(rRq_1 var1, rfH_2 var2) {
      return this.id_class != null ? this.id_class.id_protected : xd_3.id_class(this.id_extends(var1, var2));
   }

   public boolean id_new() {
      return this.id_finally;
   }

   public zr_3 id_package() {
      return this.id_break().id_native(this.id_int());
   }

   public boolean id_package(rRq_1 var1, rfH_2 var2) {
      return this.id_final.test(this.id_int(), var1, var2);
   }

   public boolean id_protected() {
      return this.id_class == null || this.id_class.id_byte;
   }

   public boolean id_protected(rRq_1 var1, rfH_2 var2, rpr_3 var3) {
      return this.id_class(var1, var2, var3, ryH_2.FULL);
   }

   public QS id_protected(rRq_1 var1, rfH_2 var2) {
      return this.id_private;
   }

   public xN_2 id_private() {
      return this.id_break().id_class(this.id_int());
   }

   public float id_private(rRq_1 var1, rfH_2 var2) {
      return this.id_implements;
   }

   public boolean id_final() {
      return this.id_break().a_(this.id_int());
   }

   public boolean id_final(rRq_1 var1, rfH_2 var2) {
      return this.id_volatile.test(this.id_int(), var1, var2);
   }

   public rXE id_volatile() {
      return this.id_break().id_throws(this.id_int());
   }

   public rjC_2 id_volatile(rRq_1 var1, rfH_2 var2) {
      return this.id_break().id_byte(this.id_int(), var1, var2);
   }

   public rjC_2 id_native(rRq_1 var1, rfH_2 var2) {
      return this.id_break().id_break(this.id_int(), var1, var2);
   }

   public boolean id_native() {
      return this.id_extends;
   }
}

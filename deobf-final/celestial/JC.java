package celestial;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public abstract class JC extends rCn_1<xd_3, xc_3> {
   private final int break_;
   private final boolean throws_;
   private final boolean case_;
   private final QP catch_;
   private final QS private_;
   private final float implements_;
   private final boolean finally_;
   private final boolean extends_;
   private final Jy_1 native_;
   private final Jy_1 volatile_;
   private final Jy_1 final_;
   private final Jy_1 package_;
   private final Jy_1 int_;
   protected Jl_1 class_;

   public rjC_2 byte_(rRq_1 var1, rfH_2 var2) {
      return this.break_().class_(this.int_(), var1, var2);
   }

   public rjC_2 byte_(rRq_1 var1, rfH_2 var2, rjm_3 var3) {
      return this.break_().byte_(this.int_(), var1, var2, var3);
   }

   public int byte_(rRq_1 var1, rfH_2 var2, rpr_3 var3) {
      return this.break_().break_(this.int_(), var1, var2, var3);
   }

   public QP byte_() {
      return this.catch_;
   }

   public boolean int_(rRq_1 var1, rfH_2 var2) {
      return this.package_.test(this.int_(), var1, var2);
   }

   protected abstract xc_3 int_();

   protected JC(xd_3 var1, ImmutableMap<rCZ<?>, Comparable<?>> var2, MapCodec<xc_3> var3) {
      super(var1, var2, var3);
      Jq_1 var4 = var1.extends_;
      this.break_ = var4.throws_.applyAsInt(this.int_());
      this.throws_ = var1.break_(this.int_());
      this.case_ = var4.package_;
      this.catch_ = var4.class_;
      this.private_ = var4.break_.apply(this.int_());
      this.implements_ = var4.catch_;
      this.finally_ = var4.private_;
      this.extends_ = var4.final_;
      this.native_ = var4.new_;
      this.volatile_ = var4.continue_;
      this.final_ = var4.super_;
      this.package_ = var4.this_;
      this.int_ = var4.else_;
   }

   public final void class_(rRg_1 var1, rfH_2 var2, int var3) {
      this.class_(var1, var2, var3, 512);
   }

   public final void class_(rRg_1 var1, rfH_2 var2, int var3, int var4) {
      this.break_();
      rfw_3 var5 = new rfw_3();

      for (rpr_3 var9 : JA.class_) {
         var5.class_(var2, var9);
         xc_3 var10 = var1.byte_(var5);
         xc_3 var11 = var10.class_(var9.case_(), this.int_(), var1, var5, var2);
         xd_3.class_(var10, var11, var1, var5, var3, var4);
      }
   }

   public void class_(rYB var1, rfH_2 var2, xc_3 var3, boolean var4) {
      this.break_().class_(this.int_(), var1, var2, var3, var4);
   }

   public void class_(rrEm_1 var1, rfH_2 var2, Random var3) {
      this.break_().break_(this.int_(), var1, var2, var3);
   }

   public void class_(rYB var1, rfH_2 var2, an_3 var3) {
      this.break_().class_(this.int_(), var1, var2, var3);
   }

   public void class_(rrEm_1 var1, rfH_2 var2, rdn_3 var3) {
      this.break_().class_(this.int_(), var1, var2, var3);
   }

   public final boolean class_(rRq_1 var1, rfH_2 var2, an_3 var3, rpr_3 var4) {
      return xd_3.class_(this.break_(var1, var2, rjm_3.class_(var3)), var4);
   }

   public final boolean class_(rRq_1 var1, rfH_2 var2, an_3 var3) {
      return this.class_(var1, var2, var3, rpr_3.UP);
   }

   public rjC_2 class_(rRq_1 var1, rfH_2 var2, rjm_3 var3) {
      return this.break_().class_(this.int_(), var1, var2, var3);
   }

   public rjU_2 class_(rfH_2 var1) {
      Jp_1 var2 = this.break_().byte_();
      if (var2 == Jp_1.NONE) {
         return rjU_2.class_;
      } else {
         long var3 = rfU_2.byte_(var1.b_(), 0, var1.d_());
         return new rjU_2(
            ((double)((float)(var3 & 15L) / 15.0F) - 0.5) * 0.5,
            var2 == Jp_1.XYZ ? ((double)((float)(var3 >> 4 & 15L) / 15.0F) - 1.0) * 0.2 : 0.0,
            ((double)((float)(var3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5
         );
      }
   }

   public boolean class_(rYB var1, rfH_2 var2, int var3, int var4) {
      return this.break_().class_(this.int_(), var1, var2, var3, var4);
   }

   public void class_(rYB var1, rfH_2 var2, xd_3 var3, rfH_2 var4, boolean var5) {
      this.break_().class_(this.int_(), var1, var2, var3, var4, var5);
   }

   public boolean class_(rlb_3<xd_3> var1, Predicate<JC> var2) {
      return this.break_().class_(var1) && var2.test(this);
   }

   public boolean class_(rlb_3<xd_3> var1) {
      return this.break_().class_(var1);
   }

   public boolean class_(rRR var1, rfH_2 var2) {
      return this.break_().class_(this.int_(), var1, var2);
   }

   public boolean class_(rXs_1 var1) {
      return this.break_().class_(this.int_(), var1);
   }

   public boolean class_(xd_3 var1) {
      return this.break_().break_(var1);
   }

   public void class_(rYB var1, xc_3 var2, rff_3 var3, rhf_3 var4) {
      this.break_().class_(var1, var2, var3, var4);
   }

   public boolean class_(rRq_1 var1, rfH_2 var2, rpr_3 var3, ryH_2 var4) {
      return this.class_ != null ? this.class_.class_(var3, var4) : var4.class_(this.int_(), var1, var2, var3);
   }

   public List<rdn_3> class_(rzP_2 var1) {
      return this.break_().class_(this.int_(), var1);
   }

   public ryZ_2 class_(rYB var1, rhd_3 var2, rpm_3 var3, rff_3 var4) {
      return this.break_().class_(this.int_(), var1, var4.class_(), var2, var3, var4);
   }

   public void class_(rYB var1, rfH_2 var2, rhd_3 var3) {
      this.break_().class_(this.int_(), var1, var2, var3);
   }

   public xc_3 class_(rpr_3 var1, xc_3 var2, rRg_1 var3, rfH_2 var4, rfH_2 var5) {
      return this.break_().class_(this.int_(), var1, var2, var3, var4, var5);
   }

   public boolean class_(rRq_1 var1, rfH_2 var2, rLT var3) {
      return this.break_().class_(this.int_(), var1, var2, var3);
   }

   public boolean class_(rxx_3 var1) {
      return this.break_().class_(this.int_(), var1);
   }

   public boolean class_(rRq_1 var1, rfH_2 var2) {
      return this.class_ != null ? this.class_.catch_ : this.break_().a_(this.int_(), var1, var2);
   }

   public xc_3 class_(rpa_3 var1) {
      return this.break_().class_(this.int_(), var1);
   }

   public float class_(rhd_3 var1, rdn_3 var2, rRq_1 var3, rfH_2 var4) {
      return this.break_().class_(this.int_(), var1, var2, var3, var4);
   }

   public float class_(rhd_3 var1, rRq_1 var2, rfH_2 var3) {
      return this.break_().class_(this.int_(), var1, var2, var3);
   }

   public boolean class_(rRq_1 var1, rfH_2 var2, aI_2<?> var3) {
      return this.break_().extends_.int_.test(this.int_(), var1, var2, var3);
   }

   public int class_(rYB var1, rfH_2 var2) {
      return this.break_().break_(this.int_(), var1, var2);
   }

   public boolean class_(xc_3 var1, rpr_3 var2) {
      return this.break_().class_(this.int_(), var1, var2);
   }

   public xc_3 class_(rqd_3 var1) {
      return this.break_().class_(this.int_(), var1);
   }

   public rjC_2 class_(rRq_1 var1, rfH_2 var2, rpr_3 var3) {
      return this.class_ != null && this.class_.implements_ != null ? this.class_.implements_[var3.ordinal()] : rjw_3.class_(this.byte_(var1, var2), var3);
   }

   public void class_() {
      if (!this.break_().super_()) {
         this.class_ = new Jl_1(this.int_());
      }
   }

   public void break_(rRg_1 var1, rfH_2 var2, int var3, int var4) {
      this.break_().class_(this.int_(), var1, var2, var3, var4);
   }

   public void break_(rYB var1, rfH_2 var2, xc_3 var3, boolean var4) {
      this.break_().break_(this.int_(), var1, var2, var3, var4);
   }

   public rJZ break_(rYB var1, rfH_2 var2) {
      return this.break_().class_(this.int_(), var1, var2);
   }

   public void break_(rrEm_1 var1, rfH_2 var2, Random var3) {
      this.break_().class_(this.int_(), var1, var2, var3);
   }

   public long break_(rfH_2 var1) {
      return this.break_().class_(this.int_(), var1);
   }

   public int break_(rRq_1 var1, rfH_2 var2) {
      return this.class_ != null ? this.class_.private_ : this.break_().protected_(this.int_(), var1, var2);
   }

   public int break_(rRq_1 var1, rfH_2 var2, rpr_3 var3) {
      return this.break_().class_(this.int_(), var1, var2, var3);
   }

   public rjC_2 break_(rRq_1 var1, rfH_2 var2, rjm_3 var3) {
      return this.break_().break_(this.int_(), var1, var2, var3);
   }

   public xd_3 break_() {
      return this.byte_;
   }

   public final void break_(rRg_1 var1, rfH_2 var2, int var3) {
      this.break_(var1, var2, var3, 512);
   }

   public boolean throws_(rRq_1 var1, rfH_2 var2) {
      return this.int_.test(this.int_(), var1, var2);
   }

   public boolean throws_() {
      return this.throws_;
   }

   public rjC_2 finally_(rRq_1 var1, rfH_2 var2) {
      return this.class_(var1, var2, rjm_3.break_());
   }

   public boolean finally_() {
      return this.break_().case_(this.int_());
   }

   public boolean catch_() {
      return this.case_;
   }

   public boolean catch_(rRq_1 var1, rfH_2 var2) {
      return this.native_.test(this.int_(), var1, var2);
   }

   public Qs_1 extends_() {
      return this.break_().protected_(this.int_());
   }

   public rjC_2 extends_(rRq_1 var1, rfH_2 var2) {
      return this.class_ != null ? this.class_.break_ : this.break_(var1, var2, rjm_3.break_());
   }

   public int case_() {
      return this.break_;
   }

   public float case_(rRq_1 var1, rfH_2 var2) {
      return this.break_().throws_(this.int_(), var1, var2);
   }

   public boolean implements_(rRq_1 var1, rfH_2 var2) {
      if (this.class_ != null) {
         return this.class_.class_;
      } else {
         xc_3 var3 = this.int_();
         return var3.native_() ? xd_3.class_(var3.byte_(var1, var2)) : false;
      }
   }

   public boolean implements_() {
      return this.break_().byte_(this.int_());
   }

   public boolean new_(rRq_1 var1, rfH_2 var2) {
      return this.class_ != null ? this.class_.protected_ : xd_3.class_(this.extends_(var1, var2));
   }

   public boolean new_() {
      return this.finally_;
   }

   public zr_3 package_() {
      return this.break_().native_(this.int_());
   }

   public boolean package_(rRq_1 var1, rfH_2 var2) {
      return this.final_.test(this.int_(), var1, var2);
   }

   public boolean protected_() {
      return this.class_ == null || this.class_.byte_;
   }

   public boolean protected_(rRq_1 var1, rfH_2 var2, rpr_3 var3) {
      return this.class_(var1, var2, var3, ryH_2.FULL);
   }

   public QS protected_(rRq_1 var1, rfH_2 var2) {
      return this.private_;
   }

   public xN_2 private_() {
      return this.break_().class_(this.int_());
   }

   public float private_(rRq_1 var1, rfH_2 var2) {
      return this.implements_;
   }

   public boolean final_() {
      return this.break_().a_(this.int_());
   }

   public boolean final_(rRq_1 var1, rfH_2 var2) {
      return this.volatile_.test(this.int_(), var1, var2);
   }

   public rXE volatile_() {
      return this.break_().throws_(this.int_());
   }

   public rjC_2 volatile_(rRq_1 var1, rfH_2 var2) {
      return this.break_().byte_(this.int_(), var1, var2);
   }

   public rjC_2 native_(rRq_1 var1, rfH_2 var2) {
      return this.break_().break_(this.int_(), var1, var2);
   }

   public boolean native_() {
      return this.extends_;
   }
}

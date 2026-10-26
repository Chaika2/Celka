package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class rrI_2 extends rPm_1<rsq_3> {
   private static final Map<rsT_2, rqO_2> class_ = rqR_2.class_(Maps.newHashMap(), var0 -> {
      var0.put(rsT_2.break_, rzl_3.z);
      var0.put(rsT_2.byte_, rzl_3.Q);
      var0.put(rsT_2.protected_, rzl_3.N);
      var0.put(rsT_2.throws_, rzl_3.c);
      var0.put(rsT_2.case_, rzl_3.u);
      var0.put(rsT_2.catch_, rzl_3.m);
      var0.put(rsT_2.private_, rzl_3.Z);
      var0.put(rsT_2.implements_, rzl_3.v);
      var0.put(rsT_2.finally_, rzl_3.F);
      var0.put(rsT_2.extends_, rzl_3.L);
      var0.put(rsT_2.volatile_, rzl_3.A);
      var0.put(rsT_2.final_, rzl_3.n);
      var0.put(rsT_2.package_, rzl_3.C);
   });
   private int byte_ = 600;
   private boolean protected_;
   private long throws_;

   protected void byte_(rrEm_1 var1, rsq_3 var2, long var3) {
      rhd_3 var5 = this.byte_(var2).get();
      iA_2.class_(var2, var5);
      if (this.class_(var2, var5)) {
         if (var3 - this.throws_ > 20L) {
            this.class_(var2, (iB_2)var5);
            this.protected_ = true;
         }
      } else {
         iA_2.class_(var2, var5, 0.5F, 5);
      }
   }

   private Optional<rhd_3> byte_(rsq_3 var1) {
      return var1.SF().byte_(il_3.extends_).filter(this::class_);
   }

   public rrI_2(int var1) {
      super(ImmutableMap.of(il_3.volatile_, iC_2.REGISTERED, il_3.final_, iC_2.REGISTERED, il_3.new_, iC_2.REGISTERED, il_3.extends_, iC_2.VALUE_PRESENT), var1);
   }

   private boolean class_(rsq_3 var1, rhd_3 var2) {
      rfH_2 var3 = var2.Bs();
      rfH_2 var4 = var1.Bs();
      return var4.class_(var3, 5.0);
   }

   private boolean class_(rhd_3 var1) {
      return var1.break_(rLD.abstract_);
   }

   protected boolean class_(rrEm_1 var1, rsq_3 var2) {
      if (!this.break_(var2)) {
         return false;
      } else if (this.byte_ > 0) {
         this.byte_--;
         return false;
      } else {
         return true;
      }
   }

   private List<rdn_3> class_(rsq_3 var1) {
      if (var1.n_()) {
         return ImmutableList.of(new rdn_3(rdy_3.rd));
      } else {
         rsT_2 var2 = var1.su().break_();
         if (class_.containsKey(var2)) {
            rzL_2 var3 = ((rYB)var1.throws_[7]).const_().o().class_(class_.get(var2));
            rzP_2 var4 = new rzP_2((rrEm_1)((rYB)var1.throws_[7])).class_(rzQ_2.case_, var1.Ps()).class_(rzQ_2.class_, var1).class_(var1.Sa());
            return var3.class_(var4.class_(rzz_3.catch_));
         } else {
            return ImmutableList.of(new rdn_3(rdy_3.hP));
         }
      }
   }

   private void class_(rsq_3 var1, iB_2 var2) {
      for (rdn_3 var4 : this.class_(var1)) {
         iA_2.class_(var1, var4, var2.Ps());
      }
   }

   private static int class_(rrEm_1 var0) {
      return 600 + var0.int_.nextInt(6001);
   }

   protected void class_(rrEm_1 var1, rsq_3 var2, long var3) {
      this.protected_ = false;
      this.throws_ = var3;
      rhd_3 var5 = this.byte_(var2).get();
      var2.SF().class_(il_3.new_, var5);
      iA_2.class_(var2, var5);
   }

   protected boolean break_(rrEm_1 var1, rsq_3 var2, long var3) {
      return this.break_(var2) && !this.protected_;
   }

   private boolean break_(rsq_3 var1) {
      return this.byte_(var1).isPresent();
   }

   protected void protected_(rrEm_1 var1, rsq_3 var2, long var3) {
      this.byte_ = class_(var1);
      var2.SF().break_(il_3.new_);
      var2.SF().break_(il_3.volatile_);
      var2.SF().break_(il_3.final_);
   }
}

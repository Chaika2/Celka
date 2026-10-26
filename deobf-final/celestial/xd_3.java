package celestial;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class xd_3 extends JA implements rpL_2 {
   protected static final Logger interface_ = LogManager.getLogger();
   public static final rqE_2<xc_3> char_ = new rqE_2<>();
   private static final LoadingCache<rjC_2, Boolean> volatile_ = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new xk_3());
   protected final rCF<xd_3, xc_3> abstract_;
   private xc_3 final_;
   private String package_;
   private rdb_3 int_;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<xz_3>> new_ = ThreadLocal.withInitial(() -> {
      xW_2 var0 = new xW_2(2048, 0.25F);
      var0.defaultReturnValue((byte)127);
      return var0;
   });

   public void byte_(rYB var1, rfH_2 var2) {
   }

   public static boolean byte_(xc_3 var0, rRq_1 var1, rfH_2 var2, rpr_3 var3) {
      rfH_2 var4 = var2.break_(var3);
      xc_3 var5 = var1.byte_(var4);
      if (var0.class_(var5, var3)) {
         return false;
      } else if (var5.native_()) {
         xz_3 var6 = new xz_3(var0, var5, var3);
         Object2ByteLinkedOpenHashMap var7 = new_.get();
         byte var8 = var7.getAndMoveToFirst(var6);
         if (var8 != 127) {
            return var8 != 0;
         } else {
            rjC_2 var9 = var0.class_(var1, var2, var3);
            rjC_2 var10 = var5.class_(var1, var4, var3.case_());
            boolean var11 = rjw_3.byte_(var9, var10, rjN_2.throws_);
            if (var7.size() == 2048) {
               var7.removeLastByte();
            }

            var7.putAndMoveToFirst(var6, (byte)(var11 ? 1 : 0));
            return var11;
         }
      } else {
         return true;
      }
   }

   public static boolean byte_(rRq_1 var0, rfH_2 var1) {
      return var0.byte_(var1).class_(var0, var1, rpr_3.UP, ryH_2.RIGID);
   }

   public static boolean byte_(xd_3 var0) {
      return var0 instanceof kZ_2 || var0 == xu_3.Ec || var0 == xu_3.Br || var0 == xu_3.BP || var0 == xu_3.Bg || var0 == xu_3.Pg || var0.class_(rls_3.L);
   }

   public float int_() {
      return this.implements_;
   }

   public xd_3(Jq_1 var1) {
      super(var1);
      rCL var2 = new rCL<>(this);
      this.class_(var2);
      this.abstract_ = var2.class_(xd_3::continue_, xc_3::new);
      this.extends_(this.abstract_.break_());
   }

   @Override
   public String toString() {
      return "Block{" + rVL.strictfp_.break_(this) + "}";
   }

   public void class_(rYB var1, rhd_3 var2, rfH_2 var3, xc_3 var4, ryO_2 var5, rdn_3 var6) {
      var2.class_(rlB_2.class_.break_(this));
      var2.while_(0.005F);
      class_(var4, var1, var3, var5, var2, var6);
   }

   public static void class_(rYB var0, rfH_2 var1, rdn_3 var2) {
      if (!var0.continue_ && !var2.class_() && var0.B().break_(rRu_1.case_)) {
         float var3 = 0.5F;
         double var4 = (double)(var0.int_.nextFloat() * 0.5F) + 0.25;
         double var6 = (double)(var0.int_.nextFloat() * 0.5F) + 0.25;
         double var8 = (double)(var0.int_.nextFloat() * 0.5F) + 0.25;
         rsE_2 var10 = new rsE_2(var0, (double)var1.b_() + var4, (double)var1.c_() + var6, (double)var1.d_() + var8, var2);
         var10.private_();
         var0.a_(var10);
      }
   }

   public static void class_(xc_3 var0, rYB var1, rfH_2 var2, ryO_2 var3, an_3 var4, rdn_3 var5) {
      if (var1 instanceof rrEm_1) {
         class_(var0, (rrEm_1)var1, var2, var3, var4, var5).forEach(var2x -> class_(var1, var2, var2x));
         var0.class_((rrEm_1)var1, var2, var5);
      }
   }

   public void class_(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      if (var4 == (cb_3)QY.instanceof_().class_[57]) {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrAE.class_(var2, var5));
      }
   }

   public boolean class_() {
      return !this.break_.break_() && !this.break_.class_();
   }

   public void class_(rYB var1, rfH_2 var2, an_3 var3) {
   }

   public void class_(rYB var1, rfH_2 var2, rRW var3) {
   }

   public xc_3 class_(rxx_3 var1) {
      return this.continue_();
   }

   protected void class_(rrEm_1 var1, rfH_2 var2, int var3) {
      if (var1.B().break_(rRu_1.case_)) {
         while (var3 > 0) {
            int var4 = rsP_2.class_(var3);
            var3 -= var4;
            var1.a_(new rsP_2(var1, (double)var2.b_() + 0.5, (double)var2.c_() + 0.5, (double)var2.d_() + 0.5, var4));
         }
      }
   }

   public void class_(rYB var1, rfH_2 var2, xc_3 var3, rhd_3 var4) {
      var1.class_(var4, 2001, var2, finally_(var3));
      if (this.class_(rls_3.H)) {
         rbW_2.class_(var4, false);
      }
   }

   public boolean class_(rRW var1) {
      return true;
   }

   protected void class_(rCL<xd_3, xc_3> var1) {
   }

   public void class_(rdn_3 var1, rRq_1 var2, List<rgP_2> var3, VD var4) {
   }

   public void class_(rYB var1, rfH_2 var2, an_3 var3, float var4) {
      var3.class_(var4, 1.0F);
   }

   public void class_(rRq_1 var1, an_3 var2) {
      var2.byte_(var2.rv().throws_(1.0, 0.0, 1.0));
   }

   public rdn_3 class_(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      return new rdn_3(this);
   }

   public void class_(rdX_2 var1, rqs_3<rdn_3> var2) {
      var2.add(new rdn_3(this));
   }

   public static boolean class_(rjC_2 var0, rpr_3 var1) {
      rjC_2 var2 = var0.class_(var1);
      return class_(var2);
   }

   public static xc_3 class_(xc_3 var0, xc_3 var1, rYB var2, rfH_2 var3) {
      rjC_2 var4 = rjw_3.break_(var0.extends_(var2, var3), var1.extends_(var2, var3), rjN_2.byte_)
         .class_((double)var3.b_(), (double)var3.c_(), (double)var3.d_());

      for (an_3 var6 : var2.class_((an_3)null, var4.class_())) {
         double var7 = rjw_3.class_(rpB_2.Y, var6.rN().protected_(0.0, 1.0, 0.0), Stream.of(var4), -1.0);
         var6.case_(var6.rx(), var6.re() + 1.0 + var7, var6.BO());
      }

      return var1;
   }

   public static void class_(xc_3 var0, xc_3 var1, rRg_1 var2, rfH_2 var3, int var4) {
      class_(var0, var1, var2, var3, var4, 512);
   }

   public static boolean class_(rjC_2 var0) {
      return (Boolean)volatile_.getUnchecked(var0);
   }

   public boolean class_(rlb_3<xd_3> var1) {
      return var1.class_(this);
   }

   public static void class_(xc_3 var0, xc_3 var1, rRg_1 var2, rfH_2 var3, int var4, int var5) {
      if (var1 != var0) {
         if (var1.catch_()) {
            if (!var2.import_()) {
               var2.class_(var3, (var4 & 32) == 0, (an_3)null, var5);
            }
         } else {
            var2.class_(var3, var1, var4 & -33, var5);
         }
      }
   }

   public static rjC_2 class_(double var0, double var2, double var4, double var6, double var8, double var10) {
      return rjw_3.class_(var0 / 16.0, var2 / 16.0, var4 / 16.0, var6 / 16.0, var8 / 16.0, var10 / 16.0);
   }

   public static boolean class_(rRR var0, rfH_2 var1, rpr_3 var2) {
      xc_3 var3 = var0.byte_(var1);
      return var2 == rpr_3.DOWN && var3.class_(rls_3.q) ? false : var3.class_(var0, var1, var2, ryH_2.CENTER);
   }

   public static List<rdn_3> class_(xc_3 var0, rrEm_1 var1, rfH_2 var2, ryO_2 var3) {
      rzP_2 var4 = new rzP_2(var1)
         .class_(var1.int_)
         .class_(rzQ_2.case_, rjU_2.class_((rja_3)var2))
         .class_(rzQ_2.implements_, rdn_3.break_)
         .break_(rzQ_2.private_, var3);
      return var0.class_(var4);
   }

   public static List<rdn_3> class_(xc_3 var0, rrEm_1 var1, rfH_2 var2, ryO_2 var3, an_3 var4, rdn_3 var5) {
      rzP_2 var6 = new rzP_2(var1)
         .class_(var1.int_)
         .class_(rzQ_2.case_, rjU_2.class_((rja_3)var2))
         .class_(rzQ_2.implements_, var5)
         .break_(rzQ_2.class_, var4)
         .break_(rzQ_2.private_, var3);
      return var0.class_(var6);
   }

   public static xc_3 class_(int var0) {
      xc_3 var1 = char_.class_(var0);
      return var1 == null ? xu_3.class_.continue_() : var1;
   }

   public static void class_(xc_3 var0, rRg_1 var1, rfH_2 var2, ryO_2 var3) {
      if (var1 instanceof rrEm_1) {
         class_(var0, (rrEm_1)var1, var2, var3).forEach(var2x -> class_((rYB)((rrEm_1)var1), var2, var2x));
         var0.class_((rrEm_1)var1, var2, rdn_3.break_);
      }
   }

   public static xd_3 class_(rdb_3 var0) {
      return var0 instanceof rxJ_2 ? ((rxJ_2)var0).catch_() : xu_3.class_;
   }

   public void class_(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
   }

   public void class_(rRg_1 var1, rfH_2 var2, xc_3 var3) {
   }

   public boolean break_(xd_3 var1) {
      return this == var1;
   }

   public static xd_3 break_(int var0) {
      return rVL.strictfp_.class_(var0);
   }

   public static xc_3 break_(xc_3 var0, rRg_1 var1, rfH_2 var2) {
      xc_3 var3 = var0;
      rfw_3 var4 = new rfw_3();

      for (rpr_3 var8 : class_) {
         var4.class_(var2, var8);
         var3 = var3.class_(var8, var1.byte_(var4), var1, var2, var4);
      }

      return var3;
   }

   public static int finally_(xc_3 var0) {
      if (var0 == null) {
         return 0;
      } else {
         int var1 = char_.class_(var0);
         return var1 == -1 ? 0 : var1;
      }
   }

   @Override
   protected xd_3 catch_() {
      return this;
   }

   public float extends_() {
      return this.protected_;
   }

   protected final void extends_(xc_3 var1) {
      this.final_ = var1;
   }

   @Override
   public rdb_3 case_() {
      if (this.int_ == null) {
         this.int_ = rdb_3.class_(this);
      }

      return this.int_;
   }

   public final xc_3 continue_() {
      return this.final_;
   }

   public rCF<xd_3, xc_3> new_() {
      return this.abstract_;
   }

   public float package_() {
      return this.private_;
   }

   public boolean super_() {
      return this.finally_;
   }

   public static void protected_(xc_3 var0, rYB var1, rfH_2 var2) {
      if (var1 instanceof rrEm_1) {
         class_(var0, (rrEm_1)var1, var2, (ryO_2)null).forEach(var2x -> class_(var1, var2, var2x));
         var0.class_((rrEm_1)var1, var2, rdn_3.break_);
      }
   }

   public float final_() {
      return this.catch_;
   }

   public String volatile_() {
      if (this.package_ == null) {
         this.package_ = rqR_2.class_("block", rVL.strictfp_.break_(this));
      }

      return this.package_;
   }

   public zr_3 native_(xc_3 var1) {
      return this.case_;
   }

   public rVi_1 native_() {
      return new rgn_3(this.volatile_());
   }

   public boolean a_(xc_3 var1) {
      return this.throws_;
   }

   public boolean a_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return !class_(var1.finally_(var2, var3)) && var1.volatile_().byte_();
   }
}

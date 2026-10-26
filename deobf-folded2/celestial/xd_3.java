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
   protected static final Logger id_interface = LogManager.getLogger();
   public static final rqE_2<xc_3> id_char = new rqE_2<>();
   private static final LoadingCache<rjC_2, Boolean> id_volatile = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new xk_3());
   protected final rCF<xd_3, xc_3> id_abstract;
   private xc_3 id_final;
   private String id_package;
   private rdb_3 id_int;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<xz_3>> id_new = ThreadLocal.withInitial(() -> {
      xW_2 var0 = new xW_2(2048, 0.25F);
      var0.defaultReturnValue((byte)127);
      return var0;
   });

   public void id_byte(rYB var1, rfH_2 var2) {
   }

   public static boolean id_byte(xc_3 var0, rRq_1 var1, rfH_2 var2, rpr_3 var3) {
      rfH_2 var4 = var2.id_break(var3);
      xc_3 var5 = var1.id_byte(var4);
      if (var0.id_class(var5, var3)) {
         return false;
      } else if (var5.id_native()) {
         xz_3 var6 = new xz_3(var0, var5, var3);
         Object2ByteLinkedOpenHashMap var7 = id_new.get();
         byte var8 = var7.getAndMoveToFirst(var6);
         if (var8 != 127) {
            return var8 != 0;
         } else {
            rjC_2 var9 = var0.id_class(var1, var2, var3);
            rjC_2 var10 = var5.id_class(var1, var4, var3.id_case());
            boolean var11 = rjw_3.id_byte(var9, var10, rjN_2.id_throws);
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

   public static boolean id_byte(rRq_1 var0, rfH_2 var1) {
      return var0.id_byte(var1).id_class(var0, var1, rpr_3.UP, ryH_2.RIGID);
   }

   public static boolean id_byte(xd_3 var0) {
      return var0 instanceof kZ_2 || var0 == xu_3.Ec || var0 == xu_3.Br || var0 == xu_3.BP || var0 == xu_3.Bg || var0 == xu_3.Pg || var0.id_class(rls_3.L);
   }

   public float id_int() {
      return this.id_implements;
   }

   public xd_3(Jq_1 var1) {
      super(var1);
      rCL var2 = new rCL<>(this);
      this.id_class(var2);
      this.id_abstract = var2.id_class(xd_3::id_continue, xc_3::new);
      this.id_extends(this.id_abstract.id_break());
   }

   @Override
   public String toString() {
      return "Block{" + rVL.id_strictfp.id_break(this) + "}";
   }

   public void id_class(rYB var1, rhd_3 var2, rfH_2 var3, xc_3 var4, ryO_2 var5, rdn_3 var6) {
      var2.id_class(rlB_2.id_class.id_break(this));
      var2.id_while(0.005F);
      id_class(var4, var1, var3, var5, var2, var6);
   }

   public static void id_class(rYB var0, rfH_2 var1, rdn_3 var2) {
      if (!var0.id_continue && !var2.id_class() && var0.B().id_break(rRu_1.id_case)) {
         float var3 = 0.5F;
         double var4 = (double)(var0.id_int.nextFloat() * 0.5F) + 0.25;
         double var6 = (double)(var0.id_int.nextFloat() * 0.5F) + 0.25;
         double var8 = (double)(var0.id_int.nextFloat() * 0.5F) + 0.25;
         rsE_2 var10 = new rsE_2(var0, (double)var1.b_() + var4, (double)var1.c_() + var6, (double)var1.d_() + var8, var2);
         var10.id_private();
         var0.a_(var10);
      }
   }

   public static void id_class(xc_3 var0, rYB var1, rfH_2 var2, ryO_2 var3, an_3 var4, rdn_3 var5) {
      if (var1 instanceof rrEm_1) {
         id_class(var0, (rrEm_1)var1, var2, var3, var4, var5).forEach(var2x -> id_class(var1, var2, var2x));
         var0.id_class((rrEm_1)var1, var2, var5);
      }
   }

   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      if (var4 == (cb_3)QY.id_instanceof().id_class[57]) {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAE.id_class(var2, var5));
      }
   }

   public boolean id_class() {
      return !this.id_break.id_break() && !this.id_break.id_class();
   }

   public void id_class(rYB var1, rfH_2 var2, an_3 var3) {
   }

   public void id_class(rYB var1, rfH_2 var2, rRW var3) {
   }

   public xc_3 id_class(rxx_3 var1) {
      return this.id_continue();
   }

   protected void id_class(rrEm_1 var1, rfH_2 var2, int var3) {
      if (var1.B().id_break(rRu_1.id_case)) {
         while (var3 > 0) {
            int var4 = rsP_2.id_class(var3);
            var3 -= var4;
            var1.a_(new rsP_2(var1, (double)var2.b_() + 0.5, (double)var2.c_() + 0.5, (double)var2.d_() + 0.5, var4));
         }
      }
   }

   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, rhd_3 var4) {
      var1.id_class(var4, 2001, var2, id_finally(var3));
      if (this.id_class(rls_3.H)) {
         rbW_2.id_class(var4, false);
      }
   }

   public boolean id_class(rRW var1) {
      return true;
   }

   protected void id_class(rCL<xd_3, xc_3> var1) {
   }

   public void id_class(rdn_3 var1, rRq_1 var2, List<rgP_2> var3, VD var4) {
   }

   public void id_class(rYB var1, rfH_2 var2, an_3 var3, float var4) {
      var3.id_class(var4, 1.0F);
   }

   public void id_class(rRq_1 var1, an_3 var2) {
      var2.id_byte(var2.rv().id_throws(1.0, 0.0, 1.0));
   }

   public rdn_3 id_class(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      return new rdn_3(this);
   }

   public void id_class(rdX_2 var1, rqs_3<rdn_3> var2) {
      var2.add(new rdn_3(this));
   }

   public static boolean id_class(rjC_2 var0, rpr_3 var1) {
      rjC_2 var2 = var0.id_class(var1);
      return id_class(var2);
   }

   public static xc_3 id_class(xc_3 var0, xc_3 var1, rYB var2, rfH_2 var3) {
      rjC_2 var4 = rjw_3.id_break(var0.id_extends(var2, var3), var1.id_extends(var2, var3), rjN_2.id_byte)
         .id_class((double)var3.b_(), (double)var3.c_(), (double)var3.d_());

      for (an_3 var6 : var2.id_class((an_3)null, var4.id_class())) {
         double var7 = rjw_3.id_class(rpB_2.Y, var6.rN().id_protected(0.0, 1.0, 0.0), Stream.of(var4), -1.0);
         var6.id_case(var6.rx(), var6.re() + 1.0 + var7, var6.BO());
      }

      return var1;
   }

   public static void id_class(xc_3 var0, xc_3 var1, rRg_1 var2, rfH_2 var3, int var4) {
      id_class(var0, var1, var2, var3, var4, 512);
   }

   public static boolean id_class(rjC_2 var0) {
      return (Boolean)id_volatile.getUnchecked(var0);
   }

   public boolean id_class(rlb_3<xd_3> var1) {
      return var1.id_class(this);
   }

   public static void id_class(xc_3 var0, xc_3 var1, rRg_1 var2, rfH_2 var3, int var4, int var5) {
      if (var1 != var0) {
         if (var1.id_catch()) {
            if (!var2.id_import()) {
               var2.id_class(var3, (var4 & 32) == 0, (an_3)null, var5);
            }
         } else {
            var2.id_class(var3, var1, var4 & -33, var5);
         }
      }
   }

   public static rjC_2 id_class(double var0, double var2, double var4, double var6, double var8, double var10) {
      return rjw_3.id_class(var0 / 16.0, var2 / 16.0, var4 / 16.0, var6 / 16.0, var8 / 16.0, var10 / 16.0);
   }

   public static boolean id_class(rRR var0, rfH_2 var1, rpr_3 var2) {
      xc_3 var3 = var0.id_byte(var1);
      return var2 == rpr_3.DOWN && var3.id_class(rls_3.q) ? false : var3.id_class(var0, var1, var2, ryH_2.CENTER);
   }

   public static List<rdn_3> id_class(xc_3 var0, rrEm_1 var1, rfH_2 var2, ryO_2 var3) {
      rzP_2 var4 = new rzP_2(var1)
         .id_class(var1.id_int)
         .id_class(rzQ_2.id_case, rjU_2.id_class((rja_3)var2))
         .id_class(rzQ_2.id_implements, rdn_3.id_break)
         .id_break(rzQ_2.id_private, var3);
      return var0.id_class(var4);
   }

   public static List<rdn_3> id_class(xc_3 var0, rrEm_1 var1, rfH_2 var2, ryO_2 var3, an_3 var4, rdn_3 var5) {
      rzP_2 var6 = new rzP_2(var1)
         .id_class(var1.id_int)
         .id_class(rzQ_2.id_case, rjU_2.id_class((rja_3)var2))
         .id_class(rzQ_2.id_implements, var5)
         .id_break(rzQ_2.id_class, var4)
         .id_break(rzQ_2.id_private, var3);
      return var0.id_class(var6);
   }

   public static xc_3 id_class(int var0) {
      xc_3 var1 = id_char.id_class(var0);
      return var1 == null ? xu_3.id_class.id_continue() : var1;
   }

   public static void id_class(xc_3 var0, rRg_1 var1, rfH_2 var2, ryO_2 var3) {
      if (var1 instanceof rrEm_1) {
         id_class(var0, (rrEm_1)var1, var2, var3).forEach(var2x -> id_class((rYB)((rrEm_1)var1), var2, var2x));
         var0.id_class((rrEm_1)var1, var2, rdn_3.id_break);
      }
   }

   public static xd_3 id_class(rdb_3 var0) {
      return var0 instanceof rxJ_2 ? ((rxJ_2)var0).id_catch() : xu_3.id_class;
   }

   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
   }

   public void id_class(rRg_1 var1, rfH_2 var2, xc_3 var3) {
   }

   public boolean id_break(xd_3 var1) {
      return this == var1;
   }

   public static xd_3 id_break(int var0) {
      return rVL.id_strictfp.id_class(var0);
   }

   public static xc_3 id_break(xc_3 var0, rRg_1 var1, rfH_2 var2) {
      xc_3 var3 = var0;
      rfw_3 var4 = new rfw_3();

      for (rpr_3 var8 : id_class) {
         var4.id_class(var2, var8);
         var3 = var3.id_class(var8, var1.id_byte(var4), var1, var2, var4);
      }

      return var3;
   }

   public static int id_finally(xc_3 var0) {
      if (var0 == null) {
         return 0;
      } else {
         int var1 = id_char.id_class(var0);
         return var1 == -1 ? 0 : var1;
      }
   }

   @Override
   protected xd_3 id_catch() {
      return this;
   }

   public float id_extends() {
      return this.id_protected;
   }

   protected final void id_extends(xc_3 var1) {
      this.id_final = var1;
   }

   @Override
   public rdb_3 id_case() {
      if (this.id_int == null) {
         this.id_int = rdb_3.id_class(this);
      }

      return this.id_int;
   }

   public final xc_3 id_continue() {
      return this.id_final;
   }

   public rCF<xd_3, xc_3> id_new() {
      return this.id_abstract;
   }

   public float id_package() {
      return this.id_private;
   }

   public boolean id_super() {
      return this.id_finally;
   }

   public static void id_protected(xc_3 var0, rYB var1, rfH_2 var2) {
      if (var1 instanceof rrEm_1) {
         id_class(var0, (rrEm_1)var1, var2, (ryO_2)null).forEach(var2x -> id_class(var1, var2, var2x));
         var0.id_class((rrEm_1)var1, var2, rdn_3.id_break);
      }
   }

   public float id_final() {
      return this.id_catch;
   }

   public String id_volatile() {
      if (this.id_package == null) {
         this.id_package = rqR_2.id_class("block", rVL.id_strictfp.id_break(this));
      }

      return this.id_package;
   }

   public zr_3 id_native(xc_3 var1) {
      return this.id_case;
   }

   public rVi_1 id_native() {
      return new rgn_3(this.id_volatile());
   }

   public boolean a_(xc_3 var1) {
      return this.id_throws;
   }

   public boolean a_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return !id_class(var1.id_finally(var2, var3)) && var1.id_volatile().id_byte();
   }
}

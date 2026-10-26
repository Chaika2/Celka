package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SQ extends Pv_1 {
   public Object[] break_;
   private static short[] protected_;
   private static boolean[] throws_;
   private static byte[] case_;
   public static Object[] byte_;

   private static void byte_() {
      throws_ = new boolean[]{true, false, true, false, false, true, false, false, true, false, true, true, true, false};
   }

   public SQ(C_class var1) {
      super(var1);
      this.protected_();
      HashMap var6 = new HashMap();
      this.break_[0] = var6;
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(j_1 var1) {
      this.protected_();
      if (!((Map)this.break_[0]).isEmpty()) {
         if (((Map)this.break_[0]).size() >= (Integer)byte_[1] && ((Ps_1)this.class_[1]).catch_() != null && ((Ps_1)this.class_[1]).case_() != null) {
            HashSet var2 = new HashSet(((Map)this.break_[0]).values());
            SZ var3 = SZ.class_(var2);
            Sz_1 var4 = Sz_1.class_(var2);
            boolean var5 = var3 != null ? true : throws_[1];
            boolean var6 = var4 != null ? true : throws_[3];
            if (var5 || var6) {
               Object var7 = var5 ? new Su_1() : new SN();
               ((Sc_1)var7).class_((Map<rfH_2, xd_3>)this.break_[0]);
               if (((Sc_1)var7).protected_() && !((Sc_1)var7).throws_()) {
                  rfl_3 var8 = ((Sc_1)var7).byte_();
                  if (var5) {
                     ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrnN_2.class_(var3, var8));
                  } else {
                     ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrnQ_2.class_(var4, var8));
                  }
               }
            }
         }

         ((Map)this.break_[0]).clear();
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5875581023000059480L;
   }

   @Override
   public void class_(PacketEvent var1) {
      this.protected_();
      if (var1.break_()
         && (
            (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
               || (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]
         )) {
         rfH_2 var2 = var1.byte_();
         xc_3 var3 = var1.class_();
         if (!var3.catch_()) {
            xd_3 var4 = var3.break_();
            if (((Set)byte_[0]).contains(var4)) {
               ((Map)this.break_[0]).put(var2.int_(), var4);
            }
         }
      }
   }

   private static void class_() {
      case_ = new byte[]{2, 16, 16, 2, 16, 16, 2};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1973028706;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-105, 35, -74, 41, 120, -45, -112, 45}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      protected_ = new short[]{0, 1, 2, 1, 4, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0};
   }

   private static void throws_() {
      Object[] var0 = new Object[2];
      Object[] var2 = new Object[]{
         xu_3.EA,
         xu_3.hY,
         xu_3.EZ,
         xu_3.Pq,
         xu_3.Mn,
         xu_3.PT,
         xu_3.case_,
         xu_3.Jl,
         xu_3.by,
         xu_3.Ge,
         xu_3.catch_,
         xu_3.BJ,
         xu_3.Bd,
         xu_3.Sh,
         xu_3.bg,
         xu_3.hV,
         xu_3.Bs,
         xu_3.Ju,
         xu_3.JI,
         xu_3.bY,
         xu_3.hD,
         xu_3.bV,
         xu_3.SS,
         xu_3.Em,
         xu_3.bs,
         xu_3.Jw,
         xu_3.Ev,
         xu_3.bR,
         xu_3.EH,
         xu_3.hc,
         xu_3.hL,
         xu_3.Jd,
         xu_3.Jk,
         xu_3.PD,
         xu_3.SP,
         xu_3.bH,
         xu_3.Pt,
         xu_3.JF,
         xu_3.By,
         xu_3.hN,
         xu_3.JA,
         xu_3.Jv,
         xu_3.Ei,
         xu_3.Ea,
         xu_3.Bp,
         xu_3.sq,
         xu_3.Jc,
         xu_3.El,
         xu_3.MR,
         xu_3.Ba,
         xu_3.Bq,
         xu_3.JC,
         xu_3.JL,
         xu_3.throws_,
         xu_3.volatile_,
         xu_3.bq,
         xu_3.bp,
         xu_3.Jn,
         xu_3.bS,
         xu_3.hK,
         xu_3.BT,
         xu_3.bX,
         xu_3.sp,
         xu_3.hm,
         xu_3.OJ,
         xu_3.Jy,
         xu_3.sy,
         xu_3.JJ,
         xu_3.bO,
         xu_3.Jm,
         xu_3.hl
      };
      var0[0] = Set.of(var2);
      var0[1] = 2;
      byte_ = var0;
   }

   private void protected_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }
}

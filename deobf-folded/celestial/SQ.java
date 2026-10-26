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
   public Object[] id_break;
   private static short[] id_protected;
   private static boolean[] id_throws;
   private static byte[] id_case;
   public static Object[] id_byte;

   private static void id_byte() {
      id_throws = new boolean[]{true, false, true, false, false, true, false, false, true, false, true, true, true, false};
   }

   public SQ(C_class var1) {
      super(var1);
      this.id_protected();
      HashMap var6 = new HashMap();
      this.id_break[id_protected[0]] = var6;
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(j_1 var1) {
      this.id_protected();
      if (!((Map)this.id_break[id_protected[7]]).isEmpty()) {
         if (((Map)this.id_break[id_protected[8]]).size() >= (Integer)id_byte[1]
            && ((Ps_1)this.id_class[1]).id_catch() != null
            && ((Ps_1)this.id_class[1]).id_case() != null) {
            HashSet var2 = new HashSet(((Map)this.id_break[id_protected[12]]).values());
            SZ var3 = SZ.id_class(var2);
            Sz_1 var4 = Sz_1.id_class(var2);
            boolean var5 = var3 != null ? true : id_throws[1];
            boolean var6 = var4 != null ? true : id_throws[3];
            if (var5 || var6) {
               Object var7 = var5 ? new Su_1() : new SN();
               ((Sc_1)var7).id_class((Map<rfH_2, xd_3>)this.id_break[id_protected[13]]);
               if (((Sc_1)var7).id_protected() && !((Sc_1)var7).id_throws()) {
                  rfl_3 var8 = ((Sc_1)var7).id_byte();
                  if (var5) {
                     ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[14]]).id_finally().id_class(rrnN_2.id_class(var3, var8));
                  } else {
                     ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[15]]).id_finally().id_class(rrnQ_2.id_class(var4, var8));
                  }
               }
            }
         }

         ((Map)this.id_break[id_protected[16]]).clear();
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5875581023000059480L;
   }

   @Override
   public void id_class(PacketEvent var1) {
      this.id_protected();
      if (var1.id_break()
         && (
            (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
               || (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]
         )) {
         rfH_2 var2 = var1.id_byte();
         xc_3 var3 = var1.id_class();
         if (!var3.id_catch()) {
            xd_3 var4 = var3.id_break();
            if (((Set)id_byte[id_protected[5]]).contains(var4)) {
               ((Map)this.id_break[id_protected[6]]).put(var2.id_int(), var4);
            }
         }
      }
   }

   private static void id_class() {
      id_case = new byte[]{2, 16, 16, 2, 16, 16, 2};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1973028706;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-105, 35, -74, 41, 120, -45, -112, 45}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_protected = new short[]{0, 1, 2, 1, 4, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0};
   }

   private static void id_throws() {
      Object[] var0 = new Object[2];
      Object[] var2 = new Object[]{
         xu_3.EA,
         xu_3.hY,
         xu_3.EZ,
         xu_3.Pq,
         xu_3.Mn,
         xu_3.PT,
         xu_3.id_case,
         xu_3.Jl,
         xu_3.by,
         xu_3.Ge,
         xu_3.id_catch,
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
         xu_3.id_throws,
         xu_3.id_volatile,
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
      id_byte = var0;
   }

   private void id_protected() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         Object[] var1 = this.id_break;
      }
   }
}

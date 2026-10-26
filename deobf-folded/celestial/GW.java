package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.sun.javafx.geom.Vec3d;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GW extends bq_3 implements rQ_2 {
   public Object[] id_break;
   public static Object[] id_throws;
   private static String[] id_catch;
   private static byte[] id_private;
   private static short[] id_implements;
   private static double[] id_finally;
   private static boolean[] id_extends;

   private Optional<rqj_3<rU_2, PX>> id_byte(Gm_1 var1) {
      rU_2 var2 = ((Ps_1)this.id_case[1]).id_volatile();
      rU_2 var3 = ((C_class)this.id_case[id_implements[55]]).id_while().id_super();

      for (int var4 = -5; var4 <= 5; var4++) {
         for (int var5 = C_class.id_instanceof().id_for.id_class[id_implements[56]] ? -1 : id_extends[23]; var5 <= 5; var5++) {
            for (int var6 = -5; var6 <= 5; var6++) {
               int var7 = (Integer)var2.id_break[id_implements[57]] + var4;
               int var8 = (Integer)var2.id_break[1] + var5;
               int var9 = (Integer)var2.id_break[2] + var6;
               if (var5 != -1 || var7 != (Integer)var3.id_break[id_implements[60]] || var9 != (Integer)var3.id_break[2]) {
                  xc_3 var10 = var1.id_byte(var7, var8, var9, ((bw_3)var1.id_break[4]).id_class(var7, var8, var9));
                  if (var10 != null) {
                     xc_3 var11 = ((bw_3)var1.id_break[4]).id_class(var7, var8, var9);
                     if (var11.id_break() != xu_3.id_class && !(var11.id_break() instanceof dj_3) && !this.id_class(var11, var10, id_extends[24])) {
                        rU_2 var12 = new rU_2(var7, var8, var9);
                        Optional var13 = PJ.id_class((Ps_1)this.id_case[1], var12, ((Ps_1)this.id_case[1]).id_native().id_case());
                        if (var13.isPresent()) {
                           return Optional.of(new rqj_3<>(var12, ((Px_1)var13.get()).id_class()));
                        }
                     }
                  }
               }
            }
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean id_byte() {
      this.id_new();
      return (rq_3)this.id_break[4] != null ? true : id_extends[22];
   }

   private static int id_byte(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1827979249;
   }

   private static void id_int() {
      id_extends = new boolean[]{
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         true,
         true,
         true,
         false,
         false,
         false,
         true,
         false,
         true,
         true,
         true,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         false,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         true
      };
   }

   public GW(C_class var1) {
      super(var1);
      this.id_new();
      Integer var6 = Integer.valueOf(id_extends[0]);
      this.id_break[11] = var6;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      Object[] var0 = new Object[1];
      Object var10002 = WL.id_new;
      Object var10003 = JV.id_volatile;
      Object var10004 = JV.id_volatile;
      Object var10005 = rCT.b;
      Object var10006 = rCT.R;
      Object var10007 = Wt_1.id_volatile;
      rCZ[] var2 = new rCZ[]{Wt_1.id_final, Wt_1.id_package, Wt_1.id_int, Wt_1.id_new, dN_2.id_final, rCT.b};
      var0[0] = ImmutableSet.of(var10002, var10003, var10004, var10005, var10006, var10007, var2);
      id_throws = var0;
   }

   private rP_2 id_class(rfH_2 var1, Gm_1 var2) {
      if (((Ps_1)this.id_case[1]).id_case().id_byte(var1).id_break() != xu_3.id_class) {
         return new GF(var1);
      } else {
         boolean var3 = ((Ps_1)this.id_case[1]).id_case().id_byte(var1.id_final()).id_break() != xu_3.id_class ? true : id_extends[85];
         xc_3 var4 = ((Ps_1)this.id_case[1]).id_case().id_byte(var1);
         rpr_3[] var5 = (rpr_3[])Ev_1.id_class[id_implements[241]];
         int var6 = var5.length;

         for (int var7 = id_extends[86]; var7 < var6; var7++) {
            rpr_3 var8 = var5[var7];
            if (EF.id_byte((Ps_1)this.id_case[1], var1.id_break(var8)) && this.id_class(var1, var2.id_byte(var1.b_(), var1.c_(), var1.d_(), var4))) {
               return new GZ(var1, var1.id_break(var8), var3);
            }
         }

         return new GF(var1);
      }
   }

   private OptionalInt id_class(xc_3 var1, rff_3 var2, PX var3) {
      for (int var4 = id_extends[34]; var4 < 9; var4++) {
         rdn_3 var5 = ((rhz_3)((Ps_1)this.id_case[1]).id_catch().id_implements[1]).id_class.get(var4);
         if (!var5.id_class() && var5.id_break() instanceof rxJ_2) {
            float var6 = (Float)((Ps_1)this.id_case[1]).id_catch().id_throws[15];
            float var7 = (Float)((Ps_1)this.id_case[1]).id_catch().id_throws[16];
            cb_3 var10000 = ((Ps_1)this.id_case[1]).id_catch();
            Float var14 = var3.id_throws();
            var10000.id_throws[15] = var14;
            var10000 = ((Ps_1)this.id_case[1]).id_catch();
            Float var15 = var3.id_protected();
            var10000.id_throws[16] = var15;
            rxx_3 var8 = new rxx_3(new Gz_1(this, ((Ps_1)this.id_case[1]).id_case(), ((Ps_1)this.id_case[1]).id_catch(), rpm_3.MAIN_HAND, var5, var2));
            xc_3 var9 = ((rxJ_2)var5.id_break()).id_catch().id_class(var8);
            var10000 = ((Ps_1)this.id_case[1]).id_catch();
            Float var16 = var6;
            var10000.id_throws[15] = var16;
            var10000 = ((Ps_1)this.id_case[1]).id_catch();
            Float var17 = var7;
            var10000.id_throws[16] = var17;
            if (this.id_class(var9, var1, true)) {
               return OptionalInt.of(var4);
            }
         }
      }

      return OptionalInt.empty();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8872533028915272022L;
   }

   private rP_2 id_class(Gm_1 var1, List<xc_3> var2) {
      return this.id_class(var1, var2, id_extends[80]);
   }

   @Override
   public boolean id_class(String var1, File var2, rja_3 var3) {
      Optional var4 = ((MG)MG.staticFields4592673f607b3ff2b69d116fa51286d2[id_implements[35]]).id_class(var2);
      if (!var4.isPresent()) {
         return id_extends[13];
      } else {
         rw_3 var5;
         try {
            var5 = ((rR_2)var4.get()).id_class(new FileInputStream(var2));
         } catch (Exception var7) {
            var7.printStackTrace();
            return id_extends[14];
         }

         rq_3 var8 = this.id_class(var3, var5);
         this.id_class(var1, var8, var3);
         return true;
      }
   }

   public boolean id_class(rfH_2 var1, xc_3 var2) {
      rjC_2 var3 = var2.id_extends(((Ps_1)this.id_case[1]).id_case(), var1);
      return !var3.id_break() && !((Ps_1)this.id_case[1]).id_case().id_class(null, var3.id_class((double)var1.b_(), (double)var1.c_(), (double)var1.d_()))
         ? id_extends[30]
         : true;
   }

   @Override
   public void id_class(int var1) {
      this.id_new();
      if (MQ.id_class()) {
         if (MQ.id_break()) {
            String var2 = MQ.id_protected(var1);

            try {
               Mx_1 var3 = new Mx_1(rcW_2.id_class(Files.newInputStream(MQ.id_throws(var1).toPath())), id_extends[17]);
               rja_3 var4 = MQ.id_class(var3, var1);
               Mx_1 var5 = MQ.id_break(var3, var1);
               rq_3 var7 = this.id_class((rja_3)this.id_break[5], var5);
               this.id_class(var2, var7, var4);
            } catch (IOException var6) {
               this.id_case(id_catch[6]);
            }
         } else {
            this.id_case(id_catch[7]);
         }
      } else {
         this.id_case(id_catch[8]);
      }
   }

   private boolean id_class(xc_3 var1, xc_3 var2) {
      if (var1.id_break() != var2.id_break()) {
         return id_extends[91];
      } else {
         boolean var3 = (Boolean)C_class.id_instanceof().id_volatile.id_class[id_implements[265]];
         List var4 = (List)C_class.id_instanceof().Py.id_class[id_implements[266]];
         if (!var3 && var4.isEmpty()) {
            return var1.equals(var2);
         } else {
            ImmutableMap var5 = var1.id_goto();
            ImmutableMap var6 = var2.id_goto();
            UnmodifiableIterator var7 = var5.keySet().iterator();

            while (var7.hasNext()) {
               rCZ var8 = (rCZ)var7.next();
               if (var5.get(var8) != var6.get(var8) && (!var3 || !((Set)id_throws[id_implements[267]]).contains(var8)) && !var4.contains(var8.id_throws())) {
                  return id_extends[92];
               }
            }

            return true;
         }
      }
   }

   @Override
   public rn_3 id_class(boolean var1, boolean var2) {
      return this.id_class(var1, var2, id_extends[44]);
   }

   private static Vec3d[] id_class(rpr_3 var0) {
      switch (((int[])Gu_1.id_class[id_implements[105]])[var0.ordinal()]) {
         case 1:
            Vec3d[] var6 = new Vec3d[5];
            var6[id_extends[36]] = new Vec3d(0.5, 1.0, 0.5);
            var6[1] = new Vec3d(0.1, 1.0, 0.5);
            var6[2] = new Vec3d(0.9, 1.0, 0.5);
            var6[3] = new Vec3d(0.5, 1.0, 0.1);
            var6[4] = new Vec3d(0.5, 1.0, 0.9);
            return var6;
         case 2:
            Vec3d[] var5 = new Vec3d[5];
            var5[id_extends[38]] = new Vec3d(0.5, id_finally[19], 0.5);
            var5[1] = new Vec3d(0.1, id_finally[22], 0.5);
            var5[2] = new Vec3d(0.9, id_finally[25], 0.5);
            var5[3] = new Vec3d(0.5, id_finally[28], 0.1);
            var5[4] = new Vec3d(0.5, id_finally[31], 0.9);
            return var5;
         case 3:
         case 4:
         case 5:
         case 6:
            double var1 = var0.id_implements() == 0 ? 0.5 : (double)(1 + var0.id_implements()) / 2.0;
            double var3 = var0.id_extends() == 0 ? 0.5 : (double)(1 + var0.id_extends()) / 2.0;
            Vec3d[] var10000 = new Vec3d[2];
            var10000[id_extends[42]] = new Vec3d(var1, 0.25, var3);
            var10000[1] = new Vec3d(var1, 0.75, var3);
            return var10000;
         default:
            throw new IllegalStateException();
      }
   }

   @Override
   public void id_class(rfH_2 var1, rfH_2 var2) {
      rfH_2 var3 = new rfH_2(Math.min(var1.b_(), var2.b_()), Math.min(var1.c_(), var2.c_()), Math.min(var1.d_(), var2.d_()));
      int var4 = Math.abs(var1.b_() - var2.b_()) + 1;
      int var5 = Math.abs(var1.c_() - var2.c_()) + 1;
      int var6 = Math.abs(var1.d_() - var2.d_()) + 1;
      this.id_class(id_catch[9], new rp_3(var4, var5, var6, xu_3.id_class.id_continue()), var3);
   }

   boolean id_class(xc_3 var1, xc_3 var2, boolean var3) {
      if (var1 == null || var2 == null) {
         return true;
      } else if (var1.id_break() instanceof dj_3 && (Boolean)C_class.id_instanceof().Pq.id_class[id_implements[268]]) {
         return true;
      } else if (var1.id_break() instanceof Ja_1 && ((List)C_class.id_instanceof().rq.id_class[id_implements[269]]).contains(var2.id_break())) {
         return true;
      } else if (var2.id_break() instanceof Ja_1 && ((List)C_class.id_instanceof().rO.id_class[id_implements[270]]).contains(var1.id_break())) {
         return true;
      } else if (!(var1.id_break() instanceof Ja_1) && (Boolean)C_class.id_instanceof().PK.id_class[id_implements[271]] && !var3) {
         return true;
      } else if (((List)C_class.id_instanceof().S.id_class[id_implements[272]]).contains(var2.id_break()) && !var3) {
         return true;
      } else if (((Map)((Object)C_class.id_instanceof().rg.id_class[id_implements[273]]))
            .getOrDefault(var2.id_break(), Collections.emptyList())
            .contains(var1.id_break())
         && !var3) {
         return true;
      } else {
         return var1.equals(var2) ? true : this.id_class(var1, var2);
      }
   }

   private void id_class(Gm_1 var1) {
      this.id_new();
      HashSet var13 = new HashSet();
      this.id_break[id_implements[211]] = var13;

      for (int var2 = id_extends[76]; var2 < ((rq_3)this.id_break[4]).id_class(); var2++) {
         for (int var3 = id_extends[77]; var3 < ((rq_3)this.id_break[4]).id_byte(); var3++) {
            for (int var4 = id_extends[78]; var4 < ((rq_3)this.id_break[4]).id_break(); var4++) {
               int var5 = var4 + ((rja_3)this.id_break[5]).b_();
               int var6 = var2 + ((rja_3)this.id_break[5]).c_();
               int var7 = var3 + ((rja_3)this.id_break[5]).d_();
               xc_3 var8 = ((bw_3)var1.id_break[4]).id_class(var5, var6, var7);
               if (((rq_3)this.id_break[4]).id_class(var4, var2, var3, var8)) {
                  if (((bw_3)var1.id_break[4]).id_class(var5, var7)) {
                     if (this.id_class(
                        ((bw_3)var1.id_break[4]).id_class(var5, var6, var7),
                        ((rq_3)this.id_break[4]).id_class(var4, var2, var3, var8, (List<xc_3>)this.id_break[10]),
                        id_extends[79]
                     )) {
                        ((LongOpenHashSet)this.id_break[1]).add(rU_2.id_byte(var5, var6, var7));
                     } else {
                        ((HashSet)this.id_break[id_implements[225]]).add(new rU_2(var5, var6, var7));
                        ((LongOpenHashSet)this.id_break[1]).remove(rU_2.id_byte(var5, var6, var7));
                        if (((HashSet)this.id_break[id_implements[227]]).size() > (Integer)C_class.id_instanceof().rv.id_class[id_implements[228]]) {
                           return;
                        }
                     }
                  } else if (!((LongOpenHashSet)this.id_break[1]).contains(rU_2.id_byte(var5, var6, var7))
                     && !((List)C_class.id_instanceof().S.id_class[id_implements[230]])
                        .contains(((rq_3)this.id_break[4]).id_class(var4, var2, var3, var8, (List<xc_3>)this.id_break[10]).id_break())) {
                     ((HashSet)this.id_break[id_implements[233]]).add(new rU_2(var5, var6, var7));
                     if (((HashSet)this.id_break[id_implements[234]]).size() > (Integer)C_class.id_instanceof().rv.id_class[id_implements[235]]) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   private rq_3 id_class(rja_3 var1, rw_3 var2) {
      Object var3 = var2;
      if ((Boolean)C_class.id_instanceof().Bs.id_class[id_implements[36]]) {
         var3 = new ME(var2);
      }

      if ((Boolean)C_class.id_instanceof().Pi.id_class[id_implements[37]]) {
         var3 = new Mb_1((rq_3)var3, var1, ((C_class)this.id_case[id_implements[38]]).E().id_byte());
      }

      return (rq_3)var3;
   }

   private boolean id_class(Collection<xc_3> var1, xc_3 var2) {
      for (xc_3 var4 : var1) {
         if (this.id_class(var4, var2)) {
            return true;
         }
      }

      return id_extends[95];
   }

   public rn_3 id_class(boolean var1, boolean var2, int var3) {
      this.id_new();
      if (var3 > 100) {
         return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_implements[106]]);
      } else {
         List var17 = this.id_break(36);
         this.id_break[10] = var17;
         if (((C_class)this.id_case[id_implements[108]]).id_int().id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[4])) {
            Integer var18 = 5;
            this.id_break[6] = var18;
         } else {
            Integer var19 = (Integer)this.id_break[6] - 1;
            this.id_break[6] = var19;
         }

         ((C_class)this.id_case[id_implements[113]]).id_int().id_class();
         if ((Boolean)this.id_break[7]) {
            return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[2]);
         } else {
            if ((Boolean)C_class.id_instanceof().O.id_class[id_implements[116]]) {
               if ((rq_3)this.id_break[3] == null) {
                  rq_3 var20 = (rq_3)this.id_break[4];
                  this.id_break[3] = var20;
               }

               rq_3 var4 = (rq_3)this.id_break[3];
               int var5;
               int var6;
               if ((Boolean)C_class.id_instanceof().rl.id_class[id_implements[121]]) {
                  var6 = var4.id_class() - 1;
                  var5 = var4.id_class() - (Integer)this.id_break[8] * (Integer)C_class.id_instanceof().id_new.id_class[id_implements[123]];
               } else {
                  var6 = (Integer)this.id_break[8] * (Integer)C_class.id_instanceof().id_new.id_class[id_implements[125]] - 1;
                  var5 = id_extends[48];
               }

               GQ var21 = new GQ(this, var4, var5, var6);
               this.id_break[4] = var21;
            }

            Gm_1 var28 = new Gm_1(this);
            if (!this.id_protected(var28)) {
               if ((Boolean)C_class.id_instanceof().O.id_class[id_implements[127]]
                  && (Integer)this.id_break[8] * (Integer)C_class.id_instanceof().id_new.id_class[id_implements[129]] < (Integer)this.id_break[11]) {
                  this.id_case("Starting layer " + (Integer)this.id_break[8]);
                  Integer var22 = (Integer)this.id_break[8] + 1;
                  this.id_break[8] = var22;
                  return this.id_class(var1, var2, var3 + 1);
               } else {
                  rja_3 var30 = (rja_3)C_class.id_instanceof().BB.id_class[id_implements[134]];
                  int var33 = (Integer)C_class.id_instanceof().id_case.id_class[id_implements[135]];
                  Integer var23 = (Integer)this.id_break[9] + 1;
                  this.id_break[9] = var23;
                  if (var30.equals(new rja_3(id_extends[52], id_extends[53], id_extends[54])) || var33 != -1 && (Integer)this.id_break[9] >= var33) {
                     this.id_case(id_catch[10]);
                     if ((Boolean)C_class.id_instanceof().PM.id_class[id_implements[139]]) {
                        this.id_byte(id_catch[11], id_extends[55]);
                     }

                     this.id_protected();
                     return null;
                  } else {
                     Integer var24 = Integer.valueOf(id_extends[56]);
                     this.id_break[8] = var24;
                     rfH_2 var25 = new rfH_2((rja_3)this.id_break[5]).id_break(var30);
                     this.id_break[5] = var25;
                     if (!(Boolean)C_class.id_instanceof().id_static.id_class[id_implements[143]]) {
                        ((rq_3)this.id_break[4]).id_protected();
                     }

                     this.id_case("Repeating build in vector " + var30 + ", new origin is " + (rja_3)this.id_break[5]);
                     return this.id_class(var1, var2, var3 + 1);
                  }
               }
            } else {
               if ((Boolean)C_class.id_instanceof().rH.id_class[id_implements[146]]) {
                  this.id_super();
               }

               Optional var29 = this.id_byte(var28);
               if (var29.isPresent() && var2 && ((Ps_1)this.id_case[1]).id_catch().BL()) {
                  PX var32 = (PX)((rqj_3)var29.get()).id_break();
                  rU_2 var34 = (rU_2)((rqj_3)var29.get()).id_class();
                  ((C_class)this.id_case[id_implements[148]]).id_private().id_class(var32, true);
                  EF.id_class((Ps_1)this.id_case[1], var28.id_class(var34));
                  if (((Ps_1)this.id_case[1]).id_catch().h()) {
                     ((C_class)this.id_case[id_implements[151]]).id_int().id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[7], true);
                  }

                  if (((Ps_1)this.id_case[1]).id_class(var34) || ((Ps_1)this.id_case[1]).id_protected().id_class(var32)) {
                     ((C_class)this.id_case[id_implements[155]]).id_int().id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[4], true);
                  }

                  return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[2]);
               } else {
                  ArrayList var31 = new ArrayList();
                  Optional var7 = this.id_break(var28, var31);
                  if (var7.isPresent() && var2 && ((Ps_1)this.id_case[1]).id_catch().BL() && (Integer)this.id_break[6] <= 0) {
                     PX var36 = (PX)((GA)var7.get()).id_class[3];
                     ((C_class)this.id_case[id_implements[161]]).id_private().id_class(var36, true);
                     ((rhz_3)((Ps_1)this.id_case[1]).id_catch().id_implements[1]).id_protected = (Integer)((GA)var7.get()).id_class[id_implements[164]];
                     ((C_class)this.id_case[id_implements[165]]).id_int().id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[7], true);
                     if (((Ps_1)this.id_case[1]).id_class((rfH_2)((GA)var7.get()).id_class[1])
                           && ((rff_3)((Ps_1)this.id_case[1]).id_byte()).id_break().equals((rpr_3)((GA)var7.get()).id_class[2])
                        || ((Ps_1)this.id_case[1]).id_protected().id_class(var36)) {
                        ((C_class)this.id_case[id_implements[172]]).id_int().id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5], true);
                     }

                     return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[2]);
                  } else {
                     if ((Boolean)C_class.id_instanceof().z.id_class[id_implements[175]]) {
                        ArrayList var8 = new ArrayList();
                        ArrayList var9 = new ArrayList();

                        label155:
                        for (xc_3 var11 : var31) {
                           for (int var12 = id_extends[64]; var12 < 9; var12++) {
                              if (this.id_class((xc_3)((List)this.id_break[10]).get(var12), var11, true)) {
                                 var8.add(var12);
                                 continue label155;
                              }
                           }

                           var9.add(var11);
                        }

                        label141:
                        for (int var37 = 9; var37 < 36; var37++) {
                           for (xc_3 var39 : var9) {
                              if (this.id_class((xc_3)((List)this.id_break[10]).get(var37), var39, true)) {
                                 if (!((C_class)this.id_case[id_implements[178]]).id_static().id_class(var37, var8::contains)) {
                                    return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
                                 }
                                 break label141;
                              }
                           }
                        }
                     }

                     rP_2 var35 = this.id_class(var28, ((List)this.id_break[10]).subList(id_extends[67], 9));
                     if (var35 == null) {
                        var35 = this.id_class(var28, (List<xc_3>)this.id_break[10], true);
                        if (var35 == null) {
                           if ((Boolean)C_class.id_instanceof().X.id_class[id_implements[182]]
                              && (Boolean)C_class.id_instanceof().O.id_class[id_implements[183]]
                              && (Integer)this.id_break[8] * (Integer)C_class.id_instanceof().id_new.id_class[id_implements[185]]
                                 < ((rq_3)this.id_break[3]).id_class()) {
                              this.id_case("Skipping layer that I cannot construct! Layer #" + (Integer)this.id_break[8]);
                              Integer var26 = (Integer)this.id_break[8] + 1;
                              this.id_break[8] = var26;
                              return this.id_class(var1, var2, var3 + 1);
                           }

                           this.id_case(id_catch[12]);
                           Boolean var27 = true;
                           this.id_break[7] = var27;
                           return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
                        }
                     }

                     return new bR_2(var35, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[4], var28);
                  }
               }
            }
         }
      }
   }

   @Override
   public void id_class(String var1, rq_3 var2, rja_3 var3) {
      this.id_new();
      this.id_break[2] = var1;
      this.id_break[4] = var2;
      Object var17 = null;
      this.id_break[3] = var17;
      boolean var4 = var2 instanceof Mb_1;
      if (!((Map)C_class.id_instanceof().U.id_class[id_implements[4]]).isEmpty()) {
         rV_2 var18 = new rV_2((rq_3)this.id_break[4], (Map<xd_3, List<xd_3>>)((Object)C_class.id_instanceof().U.id_class[id_implements[6]]));
         this.id_break[4] = var18;
      }

      int var5 = var3.b_();
      int var6 = var3.c_();
      int var7 = var3.d_();
      if ((Boolean)C_class.id_instanceof().W.id_class[id_implements[8]]) {
         var5 += var2.id_break();
      }

      if ((Boolean)C_class.id_instanceof().Pt.id_class[id_implements[9]]) {
         var6 += var2.id_class();
      }

      if ((Boolean)C_class.id_instanceof().v.id_class[id_implements[10]]) {
         var7 += var2.id_byte();
      }

      rja_3 var19 = new rja_3(var5, var6, var7);
      this.id_break[5] = var19;
      Boolean var20 = id_extends[1];
      this.id_break[7] = var20;
      Integer var21 = (Integer)C_class.id_instanceof().PQ.id_class[id_implements[13]];
      this.id_break[8] = var21;
      Integer var22 = var2.id_class();
      this.id_break[11] = var22;
      if ((Boolean)C_class.id_instanceof().Pi.id_class[id_implements[16]] && var4) {
         if (((C_class)this.id_case[id_implements[17]]).E().id_byte().length == 0) {
            this.id_case(id_catch[0]);
            Integer var23 = Integer.valueOf(id_extends[2]);
            this.id_break[11] = var23;
         } else if ((Boolean)C_class.id_instanceof().O.id_class[id_implements[19]]) {
            OptionalInt var8 = Stream.of(((C_class)this.id_case[id_implements[20]]).E().id_byte()).mapToInt(var0 -> (Integer)var0.id_class().id_break[1]).min();
            OptionalInt var9 = Stream.of(((C_class)this.id_case[id_implements[21]]).E().id_byte())
               .mapToInt(var0 -> (Integer)var0.id_protected().id_break[1])
               .max();
            if (var8.isPresent() && var9.isPresent()) {
               int var10 = C_class.id_instanceof().rl.id_class[id_implements[22]] ? var6 + var2.id_class() - var9.getAsInt() : var8.getAsInt() - var6;
               Integer var24 = (C_class.id_instanceof().rl.id_class[id_implements[23]] ? var6 + var2.id_class() - var8.getAsInt() : var9.getAsInt() - var6) + 1;
               this.id_break[11] = var24;
               Integer var25 = Math.max((Integer)this.id_break[8], var10 / (Integer)C_class.id_instanceof().id_new.id_class[id_implements[26]]);
               this.id_break[8] = var25;
               String var10001 = id_catch[1];
               Object[] var10002 = new Object[2];
               var10002[id_extends[4]] = var6;
               var10002[1] = var2.id_class();
               this.id_byte(String.format(var10001, var10002));
               var10001 = id_catch[2];
               var10002 = new Object[2];
               var10002[id_extends[6]] = var8.getAsInt();
               var10002[1] = var9.getAsInt();
               this.id_byte(String.format(var10001, var10002));
               var10001 = id_catch[3];
               var10002 = new Object[2];
               var10002[id_extends[8]] = var10;
               var10002[1] = (Integer)this.id_break[11];
               this.id_byte(String.format(var10001, var10002));
            }
         }
      }

      Integer var26 = Integer.valueOf(id_extends[10]);
      this.id_break[9] = var26;
      LongOpenHashSet var27 = new LongOpenHashSet();
      this.id_break[1] = var27;
      Object var28 = null;
      this.id_break[id_implements[31]] = var28;
   }

   @Override
   public String id_class() {
      this.id_new();
      return this.id_break[7] ? id_catch[17] : "Building " + (String)this.id_break[2];
   }

   public xc_3 id_class(int var1, int var2, int var3, xc_3 var4) {
      this.id_new();
      if (!this.id_byte()) {
         return null;
      } else if (!((rq_3)this.id_break[4])
         .id_class(var1 - ((rja_3)this.id_break[5]).b_(), var2 - ((rja_3)this.id_break[5]).c_(), var3 - ((rja_3)this.id_break[5]).d_(), var4)) {
         return null;
      } else {
         xc_3 var5 = ((rq_3)this.id_break[4])
            .id_class(
               var1 - ((rja_3)this.id_break[5]).b_(),
               var2 - ((rja_3)this.id_break[5]).c_(),
               var3 - ((rja_3)this.id_break[5]).d_(),
               var4,
               (List<xc_3>)this.id_break[10]
            );
         return var5.id_break() == xu_3.id_class ? null : var5;
      }
   }

   private rP_2 id_class(Gm_1 var1, List<xc_3> var2, boolean var3) {
      this.id_new();
      ArrayList var4 = new ArrayList();
      ArrayList var5 = new ArrayList();
      ArrayList var6 = new ArrayList();
      ArrayList var7 = new ArrayList();
      HashMap var8 = new HashMap();
      ArrayList var9 = new ArrayList();
      ((HashSet)this.id_break[id_implements[236]])
         .forEach(
            var9x -> {
               xc_3 var10x = ((bw_3)var1.id_break[4]).id_class(var9x);
               if (var10x.id_break() instanceof Ja_1) {
                  xc_3 var11x = var1.id_byte((Integer)var9x.id_break[id_implements[278]], (Integer)var9x.id_break[1], (Integer)var9x.id_break[2], var10x);
                  if (var11x == null) {
                     var9.add(var9x);
                  } else if (this.id_class(
                     var2, var1.id_byte((Integer)var9x.id_break[id_implements[281]], (Integer)var9x.id_break[1], (Integer)var9x.id_break[2], var10x)
                  )) {
                     var4.add(var9x);
                  } else {
                     var8.put(var11x, 1 + var8.getOrDefault(var11x, Integer.valueOf(id_extends[109])));
                  }
               } else if (var10x.id_break() instanceof dj_3) {
                  if (!EF.id_protected(var10x)) {
                     var6.add(var9x);
                  } else {
                     var7.add(var9x);
                  }
               } else {
                  var5.add(var9x);
               }
            }
         );
      var9.forEach(((HashSet)this.id_break[id_implements[237]])::remove);
      ArrayList var10 = new ArrayList();
      var5.forEach(var3x -> var10.add(this.id_break(var3x, var1)));
      ArrayList var11 = new ArrayList();
      var4.forEach(var4x -> {
         if (!var4.contains(var4x.id_case()) && !var4.contains(var4x.id_protected(2))) {
            var11.add(this.id_class(var4x, var1));
         }
      });
      var6.forEach(var1x -> var11.add(new rS_2(var1x.id_class())));
      if (!var11.isEmpty()) {
         return new GL(new rs_3(var11.toArray(new rP_2[id_extends[81]])), new rs_3(var10.toArray(new rP_2[id_extends[82]])));
      } else if (var10.isEmpty()) {
         if (var3 && !var8.isEmpty()) {
            this.id_case(id_catch[13]);
            this.id_case(var8.entrySet().stream().map(var0 -> {
               String var10000 = id_catch[19];
               Object[] var10001 = new Object[2];
               var10001[id_extends[106]] = var0.getValue();
               var10001[1] = var0.getKey();
               return String.format(var10000, var10001);
            }).collect(Collectors.joining(id_catch[14])));
         }

         if (var3 && !var7.isEmpty()) {
            this.id_case(id_catch[15]);
            this.id_case(var7.stream().map(var0 -> {
               String var10000 = id_catch[18];
               Object[] var10001 = new Object[3];
               var10001[id_extends[104]] = (Integer)var0.id_break[id_implements[274]];
               var10001[1] = (Integer)var0.id_break[1];
               var10001[2] = (Integer)var0.id_break[2];
               return String.format(var10000, var10001);
            }).collect(Collectors.joining(id_catch[16])));
         }

         return null;
      } else {
         return new rs_3(var10.toArray(new rP_2[id_extends[83]]));
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{52, 119, -14, 108, 21, -94, 36, -96}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private Optional<GA> id_class(xc_3 var1, int var2, int var3, int var4, bw_3 var5) {
      rpr_3[] var6 = rpr_3.values();
      int var7 = var6.length;

      for (int var8 = id_extends[31]; var8 < var7; var8++) {
         rpr_3 var9 = var6[var8];
         rU_2 var10 = new rU_2(var2, var3, var4).id_class(var9);
         xc_3 var11 = var5.id_class(var10);
         if (!EF.id_break((Integer)var10.id_break[id_implements[77]], (Integer)var10.id_break[1], (Integer)var10.id_break[2], var11, var5)
            && this.id_class(new rU_2(var2, var3, var4), var1)) {
            rjC_2 var12 = var11.id_finally(((Ps_1)this.id_case[1]).id_case(), var10);
            if (!var12.id_break()) {
               rfl_3 var13 = var12.id_class();
               Vec3d[] var14 = id_class(var9);
               int var15 = var14.length;

               for (int var16 = id_extends[32]; var16 < var15; var16++) {
                  Vec3d var17 = var14[var16];
                  double var18 = (double)((Integer)var10.id_break[id_implements[81]]).intValue()
                     + var13.id_class * var17.x
                     + var13.id_protected * (1.0 - var17.x);
                  double var20 = (double)((Integer)var10.id_break[1]).intValue() + var13.id_break * var17.y + var13.id_throws * (1.0 - var17.y);
                  double var22 = (double)((Integer)var10.id_break[2]).intValue() + var13.id_byte * var17.z + var13.id_case * (1.0 - var17.z);
                  PX var24 = PJ.id_class(
                     Ph_1.id_class(((Ps_1)this.id_case[1]).id_catch()), new rjU_2(var18, var20, var22), ((Ps_1)this.id_case[1]).id_protected()
                  );
                  PX var25 = ((C_class)this.id_case[id_implements[86]]).id_private().id_class().id_class(var24);
                  rjG_2 var26 = Ph_1.id_class(((Ps_1)this.id_case[1]).id_catch(), var25, ((Ps_1)this.id_case[1]).id_native().id_case(), true);
                  if (var26 != null && var26.id_byte() == rjM_2.BLOCK && ((rff_3)var26).id_class().equals(var10) && ((rff_3)var26).id_break() == var9.id_case()
                     )
                   {
                     OptionalInt var27 = this.id_class(var1, (rff_3)var26, var25);
                     if (var27.isPresent()) {
                        return Optional.of(new GA(var27.getAsInt(), var10, var9.id_case(), var24));
                     }
                  }
               }
            }
         }
      }

      return Optional.empty();
   }

   private void id_break(Gm_1 var1) {
      this.id_new();
      rU_2 var2 = ((Ps_1)this.id_case[1]).id_volatile();
      int var3 = (Integer)C_class.id_instanceof().Pn.id_class[id_implements[201]];

      for (int var4 = -var3; var4 <= var3; var4++) {
         for (int var5 = -var3; var5 <= var3; var5++) {
            for (int var6 = -var3; var6 <= var3; var6++) {
               int var7 = (Integer)var2.id_break[id_implements[202]] + var4;
               int var8 = (Integer)var2.id_break[1] + var5;
               int var9 = (Integer)var2.id_break[2] + var6;
               xc_3 var10 = var1.id_byte(var7, var8, var9, ((bw_3)var1.id_break[4]).id_class(var7, var8, var9));
               if (var10 != null) {
                  rU_2 var11 = new rU_2(var7, var8, var9);
                  if (this.id_class(((bw_3)var1.id_break[4]).id_class(var7, var8, var9), var10, id_extends[75])) {
                     ((HashSet)this.id_break[id_implements[207]]).remove(var11);
                     ((LongOpenHashSet)this.id_break[1]).add(rU_2.id_class(var11));
                  } else {
                     ((HashSet)this.id_break[id_implements[209]]).add(var11);
                     ((LongOpenHashSet)this.id_break[1]).remove(rU_2.id_class(var11));
                  }
               }
            }
         }
      }
   }

   private rP_2 id_break(rfH_2 var1, Gm_1 var2) {
      return (rP_2)(C_class.id_instanceof().K.id_class[id_implements[243]]
            && ((bw_3)var2.id_break[4]).id_class(var1.id_final()).id_break() instanceof Ja_1
            && ((bw_3)var2.id_break[4]).id_class(var1.id_break(2)).id_break() instanceof Ja_1
         ? new GL(new Gv_1(var1), new GN(this, var1.id_final()))
         : new Gv_1(var1));
   }

   List<xc_3> id_break(int var1) {
      ArrayList var2 = new ArrayList();

      for (int var3 = id_extends[89]; var3 < var1; var3++) {
         rdn_3 var4 = ((rhz_3)((Ps_1)this.id_case[1]).id_catch().id_implements[1]).id_class.get(var3);
         if (!var4.id_class() && var4.id_break() instanceof rxJ_2) {
            xc_3 var5 = ((rxJ_2)var4.id_break())
               .id_catch()
               .id_class(
                  new rxx_3(
                     new Gc_1(
                        this,
                        ((Ps_1)this.id_case[1]).id_case(),
                        ((Ps_1)this.id_case[1]).id_catch(),
                        rpm_3.MAIN_HAND,
                        var4,
                        new rff_3(
                           new rjU_2(
                              ((Ps_1)this.id_case[1]).id_catch().Ps().id_break,
                              ((Ps_1)this.id_case[1]).id_catch().Ps().id_byte,
                              ((Ps_1)this.id_case[1]).id_catch().Ps().id_protected
                           ),
                           rpr_3.UP,
                           ((Ps_1)this.id_case[1]).id_volatile(),
                           id_extends[90]
                        )
                     )
                  )
               );
            if (var5 != null) {
               var2.add(var5);
            } else {
               var2.add(xu_3.id_class.id_continue());
            }
         } else {
            var2.add(xu_3.id_class.id_continue());
         }
      }

      return var2;
   }

   private Optional<GA> id_break(Gm_1 var1, List<xc_3> var2) {
      rU_2 var3 = ((Ps_1)this.id_case[1]).id_volatile();

      for (int var4 = -5; var4 <= 5; var4++) {
         for (int var5 = -5; var5 <= 1; var5++) {
            for (int var6 = -5; var6 <= 5; var6++) {
               int var7 = (Integer)var3.id_break[id_implements[67]] + var4;
               int var8 = (Integer)var3.id_break[1] + var5;
               int var9 = (Integer)var3.id_break[2] + var6;
               xc_3 var10 = var1.id_byte(var7, var8, var9, ((bw_3)var1.id_break[4]).id_class(var7, var8, var9));
               if (var10 != null) {
                  xc_3 var11 = ((bw_3)var1.id_break[4]).id_class(var7, var8, var9);
                  if (EF.id_break(var7, var8, var9, var11, (bw_3)var1.id_break[4])
                     && !this.id_class(var11, var10, id_extends[26])
                     && (var5 != 1 || ((bw_3)var1.id_break[4]).id_class(var7, var8 + 1, var9).id_break() != xu_3.id_class)) {
                     var2.add(var10);
                     Optional var12 = this.id_class(var10, var7, var8, var9, (bw_3)var1.id_break[4]);
                     if (var12.isPresent()) {
                        return var12;
                     }
                  }
               }
            }
         }
      }

      return Optional.empty();
   }

   @Override
   public void id_finally() {
      this.id_new();
      Boolean var5 = id_extends[11];
      this.id_break[7] = var5;
   }

   @Override
   public void id_extends() {
      this.id_new();
      Boolean var5 = true;
      this.id_break[7] = var5;
   }

   private static void id_continue() {
      id_private = new byte[]{
         2,
         2,
         2,
         -5,
         5,
         -1,
         5,
         -5,
         5,
         -1,
         -5,
         5,
         -5,
         -5,
         5,
         9,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         2,
         100,
         36,
         5,
         -1,
         9,
         9,
         36,
         9,
         2,
         3,
         2,
         2,
         2,
         6,
         2,
         3,
         4,
         5,
         12,
         6,
         7,
         8,
         9,
         11
      };
   }

   @Override
   public List<xc_3> id_implements() {
      this.id_new();
      return new ArrayList<>((List)this.id_break[10]);
   }

   private void id_new() {
      if (this.id_break == null) {
         this.id_break = new Object[12];
         Object[] var1 = this.id_break;
         var1[6] = Integer.valueOf(id_extends[116]);
         var1[7] = id_extends[117];
         var1[8] = Integer.valueOf(id_extends[118]);
         var1[9] = Integer.valueOf(id_extends[119]);
         var1[11] = Integer.valueOf(id_extends[120]);
      }
   }

   private static void id_package() {
      id_finally = new double[]{
         1.0,
         1.0,
         1.0,
         0.5,
         1.0,
         0.5,
         0.1,
         1.0,
         0.5,
         0.9,
         1.0,
         0.5,
         0.5,
         1.0,
         0.1,
         0.5,
         1.0,
         0.9,
         0.5,
         0.0,
         0.5,
         0.1,
         0.0,
         0.5,
         0.9,
         0.0,
         0.5,
         0.5,
         0.0,
         0.1,
         0.5,
         0.0,
         0.9,
         0.5,
         2.0,
         0.5,
         2.0,
         0.25,
         0.75,
         200.0
      };
   }

   private void id_super() {
      this.id_new();
      HashSet var1 = new HashSet((HashSet)this.id_break[id_implements[198]]);
      var1.removeIf(
         var1x -> var1x.id_class(
                     ((Ps_1)this.id_case[1]).id_catch().rx(), ((Ps_1)this.id_case[1]).id_catch().re(), ((Ps_1)this.id_case[1]).id_catch().BO(), id_extends[110]
                  )
                  > 200.0
               ? true
               : id_extends[112]
      );
      if (!var1.isEmpty()) {
         this.id_break[id_implements[199]] = var1;
      }
   }

   @Override
   public void id_protected() {
      this.id_new();
      super.id_protected();
      Object var5 = null;
      this.id_break[id_implements[246]] = var5;
      Object var6 = null;
      this.id_break[2] = var6;
      Object var7 = null;
      this.id_break[4] = var7;
      Object var8 = null;
      this.id_break[3] = var8;
      Integer var9 = (Integer)C_class.id_instanceof().PQ.id_class[id_implements[250]];
      this.id_break[8] = var9;
      Integer var10 = Integer.valueOf(id_extends[87]);
      this.id_break[9] = var10;
      Boolean var11 = id_extends[88];
      this.id_break[7] = var11;
      Object var12 = null;
      this.id_break[1] = var12;
   }

   private boolean id_protected(Gm_1 var1) {
      this.id_new();
      if ((HashSet)this.id_break[id_implements[193]] == null) {
         HashSet var6 = new HashSet();
         this.id_break[id_implements[194]] = var6;
         this.id_class(var1);
         if (((HashSet)this.id_break[id_implements[195]]).isEmpty()) {
            return id_extends[72];
         }
      }

      this.id_break(var1);
      if (((HashSet)this.id_break[id_implements[196]]).isEmpty()) {
         this.id_class(var1);
      }

      return !((HashSet)this.id_break[id_implements[197]]).isEmpty() ? true : id_extends[74];
   }

   @Override
   public void id_private() {
      if (Mu_1.id_break()) {
         Optional var1 = Mu_1.id_class();
         if (var1.isPresent()) {
            rw_3 var2 = (rw_3)((rqj_3)var1.get()).id_class();
            rfH_2 var3 = (rfH_2)((rqj_3)var1.get()).id_break();
            Object var4 = C_class.id_instanceof().Bs.id_class[id_implements[39]] ? new ME(var2) : var2;
            if ((Boolean)C_class.id_instanceof().Pi.id_class[id_implements[40]]) {
               var4 = new Mb_1((rq_3)var4, var3, ((C_class)this.id_case[id_implements[41]]).E().id_byte());
            }

            this.id_class(((rw_3)((rqj_3)var1.get()).id_class()).toString(), (rq_3)var4, var3);
         } else {
            this.id_case(id_catch[4]);
         }
      } else {
         this.id_case(id_catch[5]);
      }
   }

   private static void id_final() {
      id_catch = new String[]{
         new String("Poor little kitten forgot to set a selection while BuildOnlySelection is true"),
         new String("Schematic starts at y=%s with height %s"),
         new String("Selection starts at y=%s and ends at y=%s"),
         new String("Considering relevant height %s - %s"),
         new String("No schematic currently open"),
         new String("Schematica is not present"),
         new String("Schematic File could not be loaded."),
         new String("No schematic currently loaded"),
         new String("Litematica is not present"),
         new String("clear area"),
         new String("Процесс завершился"),
         new String("Процесс завершился"),
         new String("Unable to do it. Pausing. resume to resume, cancel to cancel"),
         new String("Missing materials for at least:"),
         new String("\n"),
         new String("Unreplaceable liquids at at least:"),
         new String("\n"),
         new String("Builder Paused"),
         new String("%s %s %s"),
         new String("%sx %s")
      };
   }

   private static void id_volatile() {
      id_implements = new short[]{
         11,
         2,
         4,
         3,
         0,
         4,
         0,
         4,
         0,
         0,
         0,
         5,
         7,
         0,
         8,
         11,
         0,
         0,
         11,
         0,
         0,
         0,
         0,
         0,
         11,
         8,
         0,
         8,
         11,
         9,
         1,
         0,
         7,
         7,
         7,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         5,
         10,
         4,
         4,
         5,
         5,
         5,
         4,
         5,
         5,
         5,
         10,
         1,
         0,
         0,
         0,
         1,
         2,
         0,
         2,
         4,
         4,
         1,
         1,
         1,
         0,
         1,
         2,
         4,
         4,
         4,
         4,
         4,
         1,
         1,
         0,
         1,
         2,
         1,
         0,
         1,
         2,
         1,
         1,
         0,
         1,
         1,
         1,
         1,
         1,
         15,
         1,
         16,
         1,
         15,
         1,
         16,
         1,
         1,
         1,
         15,
         1,
         16,
         0,
         0,
         10,
         0,
         4,
         6,
         6,
         6,
         0,
         7,
         2,
         0,
         3,
         4,
         3,
         3,
         0,
         8,
         0,
         8,
         0,
         4,
         0,
         8,
         0,
         11,
         8,
         8,
         8,
         0,
         0,
         9,
         9,
         9,
         0,
         8,
         5,
         5,
         0,
         4,
         5,
         0,
         1,
         0,
         1,
         1,
         0,
         7,
         1,
         1,
         0,
         4,
         2,
         1,
         6,
         3,
         0,
         1,
         1,
         0,
         0,
         7,
         1,
         1,
         1,
         2,
         1,
         0,
         5,
         2,
         0,
         10,
         10,
         0,
         1,
         10,
         10,
         0,
         0,
         8,
         0,
         3,
         8,
         8,
         8,
         7,
         1,
         4,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         1,
         0,
         0,
         1,
         2,
         4,
         4,
         0,
         1,
         0,
         1,
         0,
         4,
         4,
         4,
         5,
         5,
         5,
         4,
         4,
         4,
         4,
         4,
         10,
         1,
         0,
         1,
         0,
         0,
         1,
         0,
         4,
         10,
         0,
         0,
         0,
         0,
         0,
         1,
         1,
         1,
         0,
         1,
         0,
         4,
         4,
         0,
         2,
         4,
         3,
         0,
         8,
         9,
         7,
         1,
         7,
         2,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         1,
         2,
         4,
         0,
         1,
         2,
         0,
         1,
         2,
         1,
         1,
         1,
         1,
         1,
         0
      };
   }

   @Override
   public boolean id_native() {
      this.id_new();
      return (Boolean)this.id_break[7];
   }
}

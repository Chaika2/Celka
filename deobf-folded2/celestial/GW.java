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
      rU_2 var3 = ((C_class)this.id_case[0]).id_while().id_super();

      for (int var4 = -5; var4 <= 5; var4++) {
         for (int var5 = C_class.id_instanceof().id_for.id_class[0] ? -1 : id_extends[23]; var5 <= 5; var5++) {
            for (int var6 = -5; var6 <= 5; var6++) {
               int var7 = (Integer)var2.id_break[0] + var4;
               int var8 = (Integer)var2.id_break[1] + var5;
               int var9 = (Integer)var2.id_break[2] + var6;
               if (var5 != -1 || var7 != (Integer)var3.id_break[0] || var9 != (Integer)var3.id_break[2]) {
                  xc_3 var10 = var1.id_byte(var7, var8, var9, ((bw_3)var1.id_break[4]).id_class(var7, var8, var9));
                  if (var10 != null) {
                     xc_3 var11 = ((bw_3)var1.id_break[4]).id_class(var7, var8, var9);
                     if (var11.id_break() != xu_3.id_class && !(var11.id_break() instanceof dj_3) && !this.id_class(var11, var10, false)) {
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
      Integer var6 = 0;
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

         for (rpr_3 var8 : (rpr_3[])Ev_1.id_class[0]) {
            if (EF.id_byte((Ps_1)this.id_case[1], var1.id_break(var8)) && this.id_class(var1, var2.id_byte(var1.b_(), var1.c_(), var1.d_(), var4))) {
               return new GZ(var1, var1.id_break(var8), var3);
            }
         }

         return new GF(var1);
      }
   }

   private OptionalInt id_class(xc_3 var1, rff_3 var2, PX var3) {
      for (int var4 = 0; var4 < 9; var4++) {
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
      return this.id_class(var1, var2, false);
   }

   @Override
   public boolean id_class(String var1, File var2, rja_3 var3) {
      Optional var4 = ((MG)MG.staticFields4592673f607b3ff2b69d116fa51286d2[0]).id_class(var2);
      if (!var4.isPresent()) {
         return false;
      } else {
         rw_3 var5;
         try {
            var5 = ((rR_2)var4.get()).id_class(new FileInputStream(var2));
         } catch (Exception var7) {
            var7.printStackTrace();
            return false;
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
         : id_extends[29];
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
               rq_3 var7 = this.id_class((rja_3)this.id_break[id_implements[42]], var5);
               this.id_class(var2, var7, var4);
            } catch (IOException var6) {
               this.id_case("Schematic File could not be loaded.");
            }
         } else {
            this.id_case("No schematic currently loaded");
         }
      } else {
         this.id_case("Litematica is not present");
      }
   }

   private boolean id_class(xc_3 var1, xc_3 var2) {
      if (var1.id_break() != var2.id_break()) {
         return false;
      } else {
         boolean var3 = (Boolean)C_class.id_instanceof().id_volatile.id_class[0];
         List var4 = (List)C_class.id_instanceof().Py.id_class[0];
         if (!var3 && var4.isEmpty()) {
            return var1.equals(var2);
         } else {
            ImmutableMap var5 = var1.id_goto();
            ImmutableMap var6 = var2.id_goto();
            UnmodifiableIterator var7 = var5.keySet().iterator();

            while (var7.hasNext()) {
               rCZ var8 = (rCZ)var7.next();
               if (var5.get(var8) != var6.get(var8) && (!var3 || !((Set)id_throws[0]).contains(var8)) && !var4.contains(var8.id_throws())) {
                  return false;
               }
            }

            return id_extends[93];
         }
      }
   }

   @Override
   public rn_3 id_class(boolean var1, boolean var2) {
      return this.id_class(var1, var2, 0);
   }

   private static Vec3d[] id_class(rpr_3 var0) {
      switch (((int[])Gu_1.id_class[0])[var0.ordinal()]) {
         case 1:
            Vec3d[] var5 = new Vec3d[id_private[16]];
            var5[0] = new Vec3d(0.5, 1.0, 0.5);
            var5[1] = new Vec3d(0.1, 1.0, 0.5);
            var5[2] = new Vec3d(0.9, 1.0, 0.5);
            var5[3] = new Vec3d(0.5, 1.0, 0.1);
            var5[4] = new Vec3d(0.5, 1.0, 0.9);
            return var5;
         case 2:
            Vec3d[] var10000 = new Vec3d[id_private[20]];
            var10000[0] = new Vec3d(0.5, 0.0, 0.5);
            var10000[1] = new Vec3d(0.1, 0.0, 0.5);
            var10000[2] = new Vec3d(0.9, 0.0, 0.5);
            var10000[3] = new Vec3d(0.5, 0.0, 0.1);
            var10000[4] = new Vec3d(0.5, 0.0, 0.9);
            return var10000;
         case 3:
         case 4:
         case 5:
         case 6:
            double var1 = var0.id_implements() == 0 ? 0.5 : (double)(id_extends[40] + var0.id_implements()) / 2.0;
            double var3 = var0.id_extends() == 0 ? 0.5 : (double)(id_extends[41] + var0.id_extends()) / 2.0;
            return new Vec3d[]{new Vec3d(var1, 0.25, var3), new Vec3d(var1, 0.75, var3)};
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
      this.id_class("clear area", new rp_3(var4, var5, var6, xu_3.id_class.id_continue()), var3);
   }

   boolean id_class(xc_3 var1, xc_3 var2, boolean var3) {
      if (var1 == null || var2 == null) {
         return id_extends[96];
      } else if (var1.id_break() instanceof dj_3 && (Boolean)C_class.id_instanceof().Pq.id_class[0]) {
         return true;
      } else if (var1.id_break() instanceof Ja_1 && ((List)C_class.id_instanceof().rq.id_class[0]).contains(var2.id_break())) {
         return true;
      } else if (var2.id_break() instanceof Ja_1 && ((List)C_class.id_instanceof().rO.id_class[0]).contains(var1.id_break())) {
         return true;
      } else if (!(var1.id_break() instanceof Ja_1) && (Boolean)C_class.id_instanceof().PK.id_class[0] && !var3) {
         return true;
      } else if (((List)C_class.id_instanceof().S.id_class[0]).contains(var2.id_break()) && !var3) {
         return true;
      } else if (((Map)((Object)C_class.id_instanceof().rg.id_class[0])).getOrDefault(var2.id_break(), Collections.emptyList()).contains(var1.id_break())
         && !var3) {
         return true;
      } else {
         return var1.equals(var2) ? true : this.id_class(var1, var2);
      }
   }

   private void id_class(Gm_1 var1) {
      this.id_new();
      HashSet var13 = new HashSet();
      this.id_break[0] = var13;

      for (int var2 = 0; var2 < ((rq_3)this.id_break[4]).id_class(); var2++) {
         for (int var3 = 0; var3 < ((rq_3)this.id_break[4]).id_byte(); var3++) {
            for (int var4 = 0; var4 < ((rq_3)this.id_break[4]).id_break(); var4++) {
               int var5 = var4 + ((rja_3)this.id_break[5]).b_();
               int var6 = var2 + ((rja_3)this.id_break[5]).c_();
               int var7 = var3 + ((rja_3)this.id_break[5]).d_();
               xc_3 var8 = ((bw_3)var1.id_break[4]).id_class(var5, var6, var7);
               if (((rq_3)this.id_break[4]).id_class(var4, var2, var3, var8)) {
                  if (((bw_3)var1.id_break[4]).id_class(var5, var7)) {
                     if (this.id_class(
                        ((bw_3)var1.id_break[4]).id_class(var5, var6, var7),
                        ((rq_3)this.id_break[4]).id_class(var4, var2, var3, var8, (List<xc_3>)this.id_break[10]),
                        false
                     )) {
                        ((LongOpenHashSet)this.id_break[1]).add(rU_2.id_byte(var5, var6, var7));
                     } else {
                        ((HashSet)this.id_break[0]).add(new rU_2(var5, var6, var7));
                        ((LongOpenHashSet)this.id_break[1]).remove(rU_2.id_byte(var5, var6, var7));
                        if (((HashSet)this.id_break[0]).size() > (Integer)C_class.id_instanceof().rv.id_class[0]) {
                           return;
                        }
                     }
                  } else if (!((LongOpenHashSet)this.id_break[1]).contains(rU_2.id_byte(var5, var6, var7))
                     && !((List)C_class.id_instanceof().S.id_class[0])
                        .contains(((rq_3)this.id_break[4]).id_class(var4, var2, var3, var8, (List<xc_3>)this.id_break[10]).id_break())) {
                     ((HashSet)this.id_break[0]).add(new rU_2(var5, var6, var7));
                     if (((HashSet)this.id_break[0]).size() > (Integer)C_class.id_instanceof().rv.id_class[0]) {
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
      if ((Boolean)C_class.id_instanceof().Bs.id_class[0]) {
         var3 = new ME(var2);
      }

      if ((Boolean)C_class.id_instanceof().Pi.id_class[0]) {
         var3 = new Mb_1((rq_3)var3, var1, ((C_class)this.id_case[0]).E().id_byte());
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
         return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[0]);
      } else {
         List var17 = this.id_break(36);
         this.id_break[10] = var17;
         if (((C_class)this.id_case[0]).id_int().id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[4])) {
            Integer var18 = 5;
            this.id_break[6] = var18;
         } else {
            Integer var19 = (Integer)this.id_break[6] - 1;
            this.id_break[6] = var19;
         }

         ((C_class)this.id_case[0]).id_int().id_class();
         if ((Boolean)this.id_break[7]) {
            return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[2]);
         } else {
            if ((Boolean)C_class.id_instanceof().O.id_class[0]) {
               if ((rq_3)this.id_break[3] == null) {
                  rq_3 var20 = (rq_3)this.id_break[4];
                  this.id_break[3] = var20;
               }

               rq_3 var4 = (rq_3)this.id_break[3];
               int var5;
               int var6;
               if ((Boolean)C_class.id_instanceof().rl.id_class[0]) {
                  var6 = var4.id_class() - 1;
                  var5 = var4.id_class() - (Integer)this.id_break[8] * (Integer)C_class.id_instanceof().id_new.id_class[0];
               } else {
                  var6 = (Integer)this.id_break[8] * (Integer)C_class.id_instanceof().id_new.id_class[0] - 1;
                  var5 = 0;
               }

               GQ var21 = new GQ(this, var4, var5, var6);
               this.id_break[4] = var21;
            }

            Gm_1 var28 = new Gm_1(this);
            if (!this.id_protected(var28)) {
               if ((Boolean)C_class.id_instanceof().O.id_class[0]
                  && (Integer)this.id_break[8] * (Integer)C_class.id_instanceof().id_new.id_class[0] < (Integer)this.id_break[11]) {
                  this.id_case("Starting layer " + (Integer)this.id_break[8]);
                  Integer var22 = (Integer)this.id_break[8] + 1;
                  this.id_break[8] = var22;
                  return this.id_class(var1, var2, var3 + 1);
               } else {
                  rja_3 var30 = (rja_3)C_class.id_instanceof().BB.id_class[0];
                  int var33 = (Integer)C_class.id_instanceof().id_case.id_class[0];
                  Integer var23 = (Integer)this.id_break[9] + 1;
                  this.id_break[9] = var23;
                  if (var30.equals(new rja_3(0, 0, 0)) || var33 != -1 && (Integer)this.id_break[9] >= var33) {
                     this.id_case("Процесс завершился");
                     if ((Boolean)C_class.id_instanceof().PM.id_class[0]) {
                        this.id_byte("Процесс завершился", false);
                     }

                     this.id_protected();
                     return null;
                  } else {
                     Integer var24 = 0;
                     this.id_break[8] = var24;
                     rfH_2 var25 = new rfH_2((rja_3)this.id_break[5]).id_break(var30);
                     this.id_break[5] = var25;
                     if (!(Boolean)C_class.id_instanceof().id_static.id_class[0]) {
                        ((rq_3)this.id_break[4]).id_protected();
                     }

                     this.id_case("Repeating build in vector " + var30 + ", new origin is " + (rja_3)this.id_break[5]);
                     return this.id_class(var1, var2, var3 + 1);
                  }
               }
            } else {
               if ((Boolean)C_class.id_instanceof().rH.id_class[0]) {
                  this.id_super();
               }

               Optional var29 = this.id_byte(var28);
               if (var29.isPresent() && var2 && ((Ps_1)this.id_case[1]).id_catch().BL()) {
                  PX var32 = (PX)((rqj_3)var29.get()).id_break();
                  rU_2 var34 = (rU_2)((rqj_3)var29.get()).id_class();
                  ((C_class)this.id_case[0]).id_private().id_class(var32, true);
                  EF.id_class((Ps_1)this.id_case[1], var28.id_class(var34));
                  if (((Ps_1)this.id_case[1]).id_catch().h()) {
                     ((C_class)this.id_case[0]).id_int().id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[7], true);
                  }

                  if (((Ps_1)this.id_case[1]).id_class(var34) || ((Ps_1)this.id_case[1]).id_protected().id_class(var32)) {
                     ((C_class)this.id_case[0]).id_int().id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[4], true);
                  }

                  return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[2]);
               } else {
                  ArrayList var31 = new ArrayList();
                  Optional var7 = this.id_break(var28, var31);
                  if (var7.isPresent() && var2 && ((Ps_1)this.id_case[1]).id_catch().BL() && (Integer)this.id_break[6] <= 0) {
                     PX var36 = (PX)((GA)var7.get()).id_class[3];
                     ((C_class)this.id_case[0]).id_private().id_class(var36, true);
                     ((rhz_3)((Ps_1)this.id_case[1]).id_catch().id_implements[1]).id_protected = (Integer)((GA)var7.get()).id_class[0];
                     ((C_class)this.id_case[0]).id_int().id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[7], true);
                     if (((Ps_1)this.id_case[1]).id_class((rfH_2)((GA)var7.get()).id_class[1])
                           && ((rff_3)((Ps_1)this.id_case[1]).id_byte()).id_break().equals((rpr_3)((GA)var7.get()).id_class[2])
                        || ((Ps_1)this.id_case[1]).id_protected().id_class(var36)) {
                        ((C_class)this.id_case[0]).id_int().id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5], true);
                     }

                     return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[2]);
                  } else {
                     if ((Boolean)C_class.id_instanceof().z.id_class[0]) {
                        ArrayList var8 = new ArrayList();
                        ArrayList var9 = new ArrayList();

                        label155:
                        for (xc_3 var11 : var31) {
                           for (int var12 = 0; var12 < 9; var12++) {
                              if (this.id_class((xc_3)((List)this.id_break[10]).get(var12), var11, true)) {
                                 var8.add(var12);
                                 continue label155;
                              }
                           }

                           var9.add(var11);
                        }

                        label141:
                        for (int var37 = id_private[30]; var37 < 36; var37++) {
                           for (xc_3 var39 : var9) {
                              if (this.id_class((xc_3)((List)this.id_break[10]).get(var37), var39, true)) {
                                 if (!((C_class)this.id_case[0]).id_static().id_class(var37, var8::contains)) {
                                    return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
                                 }
                                 break label141;
                              }
                           }
                        }
                     }

                     rP_2 var35 = this.id_class(var28, ((List)this.id_break[10]).subList(0, 9));
                     if (var35 == null) {
                        var35 = this.id_class(var28, (List<xc_3>)this.id_break[10], true);
                        if (var35 == null) {
                           if ((Boolean)C_class.id_instanceof().X.id_class[0]
                              && (Boolean)C_class.id_instanceof().O.id_class[0]
                              && (Integer)this.id_break[8] * (Integer)C_class.id_instanceof().id_new.id_class[0] < ((rq_3)this.id_break[3]).id_class()) {
                              this.id_case("Skipping layer that I cannot construct! Layer #" + (Integer)this.id_break[8]);
                              Integer var26 = (Integer)this.id_break[8] + 1;
                              this.id_break[8] = var26;
                              return this.id_class(var1, var2, var3 + 1);
                           }

                           this.id_case("Unable to do it. Pausing. resume to resume, cancel to cancel");
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
      if (!((Map)C_class.id_instanceof().U.id_class[0]).isEmpty()) {
         rV_2 var18 = new rV_2((rq_3)this.id_break[4], (Map<xd_3, List<xd_3>>)((Object)C_class.id_instanceof().U.id_class[0]));
         this.id_break[4] = var18;
      }

      int var5 = var3.b_();
      int var6 = var3.c_();
      int var7 = var3.d_();
      if ((Boolean)C_class.id_instanceof().W.id_class[0]) {
         var5 += var2.id_break();
      }

      if ((Boolean)C_class.id_instanceof().Pt.id_class[0]) {
         var6 += var2.id_class();
      }

      if ((Boolean)C_class.id_instanceof().v.id_class[0]) {
         var7 += var2.id_byte();
      }

      rja_3 var19 = new rja_3(var5, var6, var7);
      this.id_break[5] = var19;
      Boolean var20 = false;
      this.id_break[7] = var20;
      Integer var21 = (Integer)C_class.id_instanceof().PQ.id_class[0];
      this.id_break[8] = var21;
      Integer var22 = var2.id_class();
      this.id_break[11] = var22;
      if ((Boolean)C_class.id_instanceof().Pi.id_class[0] && var4) {
         if (((C_class)this.id_case[0]).E().id_byte().length == 0) {
            this.id_case("Poor little kitten forgot to set a selection while BuildOnlySelection is true");
            Integer var23 = 0;
            this.id_break[11] = var23;
         } else if ((Boolean)C_class.id_instanceof().O.id_class[0]) {
            OptionalInt var8 = Stream.of(((C_class)this.id_case[0]).E().id_byte()).mapToInt(var0 -> (Integer)var0.id_class().id_break[1]).min();
            OptionalInt var9 = Stream.of(((C_class)this.id_case[0]).E().id_byte()).mapToInt(var0 -> (Integer)var0.id_protected().id_break[1]).max();
            if (var8.isPresent() && var9.isPresent()) {
               int var10 = C_class.id_instanceof().rl.id_class[0] ? var6 + var2.id_class() - var9.getAsInt() : var8.getAsInt() - var6;
               Integer var24 = (C_class.id_instanceof().rl.id_class[0] ? var6 + var2.id_class() - var8.getAsInt() : var9.getAsInt() - var6) + id_extends[3];
               this.id_break[11] = var24;
               Integer var25 = Math.max((Integer)this.id_break[8], var10 / (Integer)C_class.id_instanceof().id_new.id_class[0]);
               this.id_break[8] = var25;
               this.id_byte(String.format("Schematic starts at y=%s with height %s", var6, var2.id_class()));
               this.id_byte(String.format("Selection starts at y=%s and ends at y=%s", var8.getAsInt(), var9.getAsInt()));
               this.id_byte(String.format("Considering relevant height %s - %s", var10, (Integer)this.id_break[11]));
            }
         }
      }

      Integer var26 = 0;
      this.id_break[9] = var26;
      LongOpenHashSet var27 = new LongOpenHashSet();
      this.id_break[1] = var27;
      Object var28 = null;
      this.id_break[0] = var28;
   }

   @Override
   public String id_class() {
      this.id_new();
      return this.id_break[7] ? "Builder Paused" : "Building " + (String)this.id_break[2];
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
      ((HashSet)this.id_break[0]).forEach(var9x -> {
         xc_3 var10x = ((bw_3)var1.id_break[4]).id_class(var9x);
         if (var10x.id_break() instanceof Ja_1) {
            xc_3 var11x = var1.id_byte((Integer)var9x.id_break[0], (Integer)var9x.id_break[1], (Integer)var9x.id_break[2], var10x);
            if (var11x == null) {
               var9.add(var9x);
            } else if (this.id_class(var2, var1.id_byte((Integer)var9x.id_break[0], (Integer)var9x.id_break[1], (Integer)var9x.id_break[2], var10x))) {
               var4.add(var9x);
            } else {
               var8.put(var11x, 1 + var8.getOrDefault(var11x, 0));
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
      });
      var9.forEach(((HashSet)this.id_break[0])::remove);
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
         return new GL(new rs_3(var11.toArray(new rP_2[0])), new rs_3(var10.toArray(new rP_2[0])));
      } else if (var10.isEmpty()) {
         if (var3 && !var8.isEmpty()) {
            this.id_case("Missing materials for at least:");
            this.id_case(var8.entrySet().stream().map(var0 -> String.format("%sx %s", var0.getValue(), var0.getKey())).collect(Collectors.joining("\n")));
         }

         if (var3 && !var7.isEmpty()) {
            this.id_case("Unreplaceable liquids at at least:");
            this.id_case(
               var7.stream()
                  .map(var0 -> String.format("%s %s %s", (Integer)var0.id_break[0], (Integer)var0.id_break[1], (Integer)var0.id_break[2]))
                  .collect(Collectors.joining("\n"))
            );
         }

         return null;
      } else {
         return new rs_3(var10.toArray(new rP_2[0]));
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
      for (rpr_3 var9 : rpr_3.values()) {
         rU_2 var10 = new rU_2(var2, var3, var4).id_class(var9);
         xc_3 var11 = var5.id_class(var10);
         if (!EF.id_break((Integer)var10.id_break[0], (Integer)var10.id_break[1], (Integer)var10.id_break[2], var11, var5)
            && this.id_class(new rU_2(var2, var3, var4), var1)) {
            rjC_2 var12 = var11.id_finally(((Ps_1)this.id_case[1]).id_case(), var10);
            if (!var12.id_break()) {
               rfl_3 var13 = var12.id_class();

               for (Vec3d var17 : id_class(var9)) {
                  double var18 = (double)((Integer)var10.id_break[0]).intValue() + var13.id_class * var17.x + var13.id_protected * (1.0 - var17.x);
                  double var20 = (double)((Integer)var10.id_break[1]).intValue() + var13.id_break * var17.y + var13.id_throws * (1.0 - var17.y);
                  double var22 = (double)((Integer)var10.id_break[2]).intValue() + var13.id_byte * var17.z + var13.id_case * (1.0 - var17.z);
                  PX var24 = PJ.id_class(
                     Ph_1.id_class(((Ps_1)this.id_case[1]).id_catch()), new rjU_2(var18, var20, var22), ((Ps_1)this.id_case[1]).id_protected()
                  );
                  PX var25 = ((C_class)this.id_case[0]).id_private().id_class().id_class(var24);
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
      int var3 = (Integer)C_class.id_instanceof().Pn.id_class[0];

      for (int var4 = -var3; var4 <= var3; var4++) {
         for (int var5 = -var3; var5 <= var3; var5++) {
            for (int var6 = -var3; var6 <= var3; var6++) {
               int var7 = (Integer)var2.id_break[0] + var4;
               int var8 = (Integer)var2.id_break[1] + var5;
               int var9 = (Integer)var2.id_break[2] + var6;
               xc_3 var10 = var1.id_byte(var7, var8, var9, ((bw_3)var1.id_break[4]).id_class(var7, var8, var9));
               if (var10 != null) {
                  rU_2 var11 = new rU_2(var7, var8, var9);
                  if (this.id_class(((bw_3)var1.id_break[4]).id_class(var7, var8, var9), var10, false)) {
                     ((HashSet)this.id_break[0]).remove(var11);
                     ((LongOpenHashSet)this.id_break[1]).add(rU_2.id_class(var11));
                  } else {
                     ((HashSet)this.id_break[0]).add(var11);
                     ((LongOpenHashSet)this.id_break[1]).remove(rU_2.id_class(var11));
                  }
               }
            }
         }
      }
   }

   private rP_2 id_break(rfH_2 var1, Gm_1 var2) {
      return (rP_2)(C_class.id_instanceof().K.id_class[0]
            && ((bw_3)var2.id_break[4]).id_class(var1.id_final()).id_break() instanceof Ja_1
            && ((bw_3)var2.id_break[4]).id_class(var1.id_break(2)).id_break() instanceof Ja_1
         ? new GL(new Gv_1(var1), new GN(this, var1.id_final()))
         : new Gv_1(var1));
   }

   List<xc_3> id_break(int var1) {
      ArrayList var2 = new ArrayList();

      for (int var3 = 0; var3 < var1; var3++) {
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
                           false
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
               int var7 = (Integer)var3.id_break[0] + var4;
               int var8 = (Integer)var3.id_break[1] + var5;
               int var9 = (Integer)var3.id_break[2] + var6;
               xc_3 var10 = var1.id_byte(var7, var8, var9, ((bw_3)var1.id_break[4]).id_class(var7, var8, var9));
               if (var10 != null) {
                  xc_3 var11 = ((bw_3)var1.id_break[4]).id_class(var7, var8, var9);
                  if (EF.id_break(var7, var8, var9, var11, (bw_3)var1.id_break[4])
                     && !this.id_class(var11, var10, false)
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
      Boolean var5 = false;
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
         var1[6] = 0;
         var1[7] = false;
         var1[8] = 0;
         var1[9] = 0;
         var1[11] = 0;
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
      HashSet var1 = new HashSet((HashSet)this.id_break[0]);
      var1.removeIf(
         var1x -> var1x.id_class(
                     ((Ps_1)this.id_case[1]).id_catch().rx(), ((Ps_1)this.id_case[1]).id_catch().re(), ((Ps_1)this.id_case[1]).id_catch().BO(), false
                  )
                  > 200.0
               ? true
               : id_extends[112]
      );
      if (!var1.isEmpty()) {
         this.id_break[0] = var1;
      }
   }

   @Override
   public void id_protected() {
      this.id_new();
      super.id_protected();
      Object var5 = null;
      this.id_break[0] = var5;
      Object var6 = null;
      this.id_break[2] = var6;
      Object var7 = null;
      this.id_break[4] = var7;
      Object var8 = null;
      this.id_break[3] = var8;
      Integer var9 = (Integer)C_class.id_instanceof().PQ.id_class[0];
      this.id_break[8] = var9;
      Integer var10 = 0;
      this.id_break[9] = var10;
      Boolean var11 = false;
      this.id_break[7] = var11;
      Object var12 = null;
      this.id_break[1] = var12;
   }

   private boolean id_protected(Gm_1 var1) {
      this.id_new();
      if ((HashSet)this.id_break[0] == null) {
         HashSet var6 = new HashSet();
         this.id_break[0] = var6;
         this.id_class(var1);
         if (((HashSet)this.id_break[0]).isEmpty()) {
            return false;
         }
      }

      this.id_break(var1);
      if (((HashSet)this.id_break[0]).isEmpty()) {
         this.id_class(var1);
      }

      return !((HashSet)this.id_break[0]).isEmpty() ? true : id_extends[74];
   }

   @Override
   public void id_private() {
      if (Mu_1.id_break()) {
         Optional var1 = Mu_1.id_class();
         if (var1.isPresent()) {
            rw_3 var2 = (rw_3)((rqj_3)var1.get()).id_class();
            rfH_2 var3 = (rfH_2)((rqj_3)var1.get()).id_break();
            Object var4 = C_class.id_instanceof().Bs.id_class[0] ? new ME(var2) : var2;
            if ((Boolean)C_class.id_instanceof().Pi.id_class[0]) {
               var4 = new Mb_1((rq_3)var4, var3, ((C_class)this.id_case[0]).E().id_byte());
            }

            this.id_class(((rw_3)((rqj_3)var1.get()).id_class()).toString(), (rq_3)var4, var3);
         } else {
            this.id_case("No schematic currently open");
         }
      } else {
         this.id_case("Schematica is not present");
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

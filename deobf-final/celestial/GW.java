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
   public Object[] break_;
   public static Object[] throws_;
   private static String[] catch_;
   private static byte[] private_;
   private static short[] implements_;
   private static double[] finally_;
   private static boolean[] extends_;

   private Optional<rqj_3<rU_2, PX>> byte_(Gm_1 var1) {
      rU_2 var2 = ((Ps_1)this.case_[1]).volatile_();
      rU_2 var3 = ((C_class)this.case_[0]).while_().super_();

      for (int var4 = -5; var4 <= 5; var4++) {
         for (int var5 = C_class.instanceof_().for_.class_[0] ? -1 : extends_[23]; var5 <= 5; var5++) {
            for (int var6 = -5; var6 <= 5; var6++) {
               int var7 = (Integer)var2.break_[0] + var4;
               int var8 = (Integer)var2.break_[1] + var5;
               int var9 = (Integer)var2.break_[2] + var6;
               if (var5 != -1 || var7 != (Integer)var3.break_[0] || var9 != (Integer)var3.break_[2]) {
                  xc_3 var10 = var1.byte_(var7, var8, var9, ((bw_3)var1.break_[4]).class_(var7, var8, var9));
                  if (var10 != null) {
                     xc_3 var11 = ((bw_3)var1.break_[4]).class_(var7, var8, var9);
                     if (var11.break_() != xu_3.class_ && !(var11.break_() instanceof dj_3) && !this.class_(var11, var10, false)) {
                        rU_2 var12 = new rU_2(var7, var8, var9);
                        Optional var13 = PJ.class_((Ps_1)this.case_[1], var12, ((Ps_1)this.case_[1]).native_().case_());
                        if (var13.isPresent()) {
                           return Optional.of(new rqj_3<>(var12, ((Px_1)var13.get()).class_()));
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
   public boolean byte_() {
      this.new_();
      return (rq_3)this.break_[4] != null ? true : extends_[22];
   }

   private static int byte_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1827979249;
   }

   private static void int_() {
      extends_ = new boolean[]{
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
      this.new_();
      Integer var6 = 0;
      this.break_[11] = var6;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      Object[] var0 = new Object[1];
      Object var10002 = WL.new_;
      Object var10003 = JV.volatile_;
      Object var10004 = JV.volatile_;
      Object var10005 = rCT.b;
      Object var10006 = rCT.R;
      Object var10007 = Wt_1.volatile_;
      rCZ[] var2 = new rCZ[]{Wt_1.final_, Wt_1.package_, Wt_1.int_, Wt_1.new_, dN_2.final_, rCT.b};
      var0[0] = ImmutableSet.of(var10002, var10003, var10004, var10005, var10006, var10007, var2);
      throws_ = var0;
   }

   private rP_2 class_(rfH_2 var1, Gm_1 var2) {
      if (((Ps_1)this.case_[1]).case_().byte_(var1).break_() != xu_3.class_) {
         return new GF(var1);
      } else {
         boolean var3 = ((Ps_1)this.case_[1]).case_().byte_(var1.final_()).break_() != xu_3.class_ ? true : extends_[85];
         xc_3 var4 = ((Ps_1)this.case_[1]).case_().byte_(var1);

         for (rpr_3 var8 : (rpr_3[])Ev_1.class_[0]) {
            if (EF.byte_((Ps_1)this.case_[1], var1.break_(var8)) && this.class_(var1, var2.byte_(var1.b_(), var1.c_(), var1.d_(), var4))) {
               return new GZ(var1, var1.break_(var8), var3);
            }
         }

         return new GF(var1);
      }
   }

   private OptionalInt class_(xc_3 var1, rff_3 var2, PX var3) {
      for (int var4 = 0; var4 < 9; var4++) {
         rdn_3 var5 = ((rhz_3)((Ps_1)this.case_[1]).catch_().implements_[1]).class_.get(var4);
         if (!var5.class_() && var5.break_() instanceof rxJ_2) {
            float var6 = (Float)((Ps_1)this.case_[1]).catch_().throws_[15];
            float var7 = (Float)((Ps_1)this.case_[1]).catch_().throws_[16];
            cb_3 var10000 = ((Ps_1)this.case_[1]).catch_();
            Float var14 = var3.throws_();
            var10000.throws_[15] = var14;
            var10000 = ((Ps_1)this.case_[1]).catch_();
            Float var15 = var3.protected_();
            var10000.throws_[16] = var15;
            rxx_3 var8 = new rxx_3(new Gz_1(this, ((Ps_1)this.case_[1]).case_(), ((Ps_1)this.case_[1]).catch_(), rpm_3.MAIN_HAND, var5, var2));
            xc_3 var9 = ((rxJ_2)var5.break_()).catch_().class_(var8);
            var10000 = ((Ps_1)this.case_[1]).catch_();
            Float var16 = var6;
            var10000.throws_[15] = var16;
            var10000 = ((Ps_1)this.case_[1]).catch_();
            Float var17 = var7;
            var10000.throws_[16] = var17;
            if (this.class_(var9, var1, true)) {
               return OptionalInt.of(var4);
            }
         }
      }

      return OptionalInt.empty();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8872533028915272022L;
   }

   private rP_2 class_(Gm_1 var1, List<xc_3> var2) {
      return this.class_(var1, var2, false);
   }

   @Override
   public boolean class_(String var1, File var2, rja_3 var3) {
      Optional var4 = ((MG)MG.staticFields4592673f607b3ff2b69d116fa51286d2[0]).class_(var2);
      if (!var4.isPresent()) {
         return false;
      } else {
         rw_3 var5;
         try {
            var5 = ((rR_2)var4.get()).class_(new FileInputStream(var2));
         } catch (Exception var7) {
            var7.printStackTrace();
            return false;
         }

         rq_3 var8 = this.class_(var3, var5);
         this.class_(var1, var8, var3);
         return true;
      }
   }

   public boolean class_(rfH_2 var1, xc_3 var2) {
      rjC_2 var3 = var2.extends_(((Ps_1)this.case_[1]).case_(), var1);
      return !var3.break_() && !((Ps_1)this.case_[1]).case_().class_(null, var3.class_((double)var1.b_(), (double)var1.c_(), (double)var1.d_()))
         ? extends_[30]
         : extends_[29];
   }

   @Override
   public void class_(int var1) {
      this.new_();
      if (MQ.class_()) {
         if (MQ.break_()) {
            String var2 = MQ.protected_(var1);

            try {
               Mx_1 var3 = new Mx_1(rcW_2.class_(Files.newInputStream(MQ.throws_(var1).toPath())), extends_[17]);
               rja_3 var4 = MQ.class_(var3, var1);
               Mx_1 var5 = MQ.break_(var3, var1);
               rq_3 var7 = this.class_((rja_3)this.break_[implements_[42]], var5);
               this.class_(var2, var7, var4);
            } catch (IOException var6) {
               this.case_("Schematic File could not be loaded.");
            }
         } else {
            this.case_("No schematic currently loaded");
         }
      } else {
         this.case_("Litematica is not present");
      }
   }

   private boolean class_(xc_3 var1, xc_3 var2) {
      if (var1.break_() != var2.break_()) {
         return false;
      } else {
         boolean var3 = (Boolean)C_class.instanceof_().volatile_.class_[0];
         List var4 = (List)C_class.instanceof_().Py.class_[0];
         if (!var3 && var4.isEmpty()) {
            return var1.equals(var2);
         } else {
            ImmutableMap var5 = var1.goto_();
            ImmutableMap var6 = var2.goto_();
            UnmodifiableIterator var7 = var5.keySet().iterator();

            while (var7.hasNext()) {
               rCZ var8 = (rCZ)var7.next();
               if (var5.get(var8) != var6.get(var8) && (!var3 || !((Set)throws_[0]).contains(var8)) && !var4.contains(var8.throws_())) {
                  return false;
               }
            }

            return extends_[93];
         }
      }
   }

   @Override
   public rn_3 class_(boolean var1, boolean var2) {
      return this.class_(var1, var2, 0);
   }

   private static Vec3d[] class_(rpr_3 var0) {
      switch (((int[])Gu_1.class_[0])[var0.ordinal()]) {
         case 1:
            Vec3d[] var5 = new Vec3d[private_[16]];
            var5[0] = new Vec3d(0.5, 1.0, 0.5);
            var5[1] = new Vec3d(0.1, 1.0, 0.5);
            var5[2] = new Vec3d(0.9, 1.0, 0.5);
            var5[3] = new Vec3d(0.5, 1.0, 0.1);
            var5[4] = new Vec3d(0.5, 1.0, 0.9);
            return var5;
         case 2:
            Vec3d[] var10000 = new Vec3d[private_[20]];
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
            double var1 = var0.implements_() == 0 ? 0.5 : (double)(extends_[40] + var0.implements_()) / 2.0;
            double var3 = var0.extends_() == 0 ? 0.5 : (double)(extends_[41] + var0.extends_()) / 2.0;
            return new Vec3d[]{new Vec3d(var1, 0.25, var3), new Vec3d(var1, 0.75, var3)};
         default:
            throw new IllegalStateException();
      }
   }

   @Override
   public void class_(rfH_2 var1, rfH_2 var2) {
      rfH_2 var3 = new rfH_2(Math.min(var1.b_(), var2.b_()), Math.min(var1.c_(), var2.c_()), Math.min(var1.d_(), var2.d_()));
      int var4 = Math.abs(var1.b_() - var2.b_()) + 1;
      int var5 = Math.abs(var1.c_() - var2.c_()) + 1;
      int var6 = Math.abs(var1.d_() - var2.d_()) + 1;
      this.class_("clear area", new rp_3(var4, var5, var6, xu_3.class_.continue_()), var3);
   }

   boolean class_(xc_3 var1, xc_3 var2, boolean var3) {
      if (var1 == null || var2 == null) {
         return extends_[96];
      } else if (var1.break_() instanceof dj_3 && (Boolean)C_class.instanceof_().Pq.class_[0]) {
         return true;
      } else if (var1.break_() instanceof Ja_1 && ((List)C_class.instanceof_().rq.class_[0]).contains(var2.break_())) {
         return true;
      } else if (var2.break_() instanceof Ja_1 && ((List)C_class.instanceof_().rO.class_[0]).contains(var1.break_())) {
         return true;
      } else if (!(var1.break_() instanceof Ja_1) && (Boolean)C_class.instanceof_().PK.class_[0] && !var3) {
         return true;
      } else if (((List)C_class.instanceof_().S.class_[0]).contains(var2.break_()) && !var3) {
         return true;
      } else if (((Map)((Object)C_class.instanceof_().rg.class_[0])).getOrDefault(var2.break_(), Collections.emptyList()).contains(var1.break_()) && !var3) {
         return true;
      } else {
         return var1.equals(var2) ? true : this.class_(var1, var2);
      }
   }

   private void class_(Gm_1 var1) {
      this.new_();
      HashSet var13 = new HashSet();
      this.break_[0] = var13;

      for (int var2 = 0; var2 < ((rq_3)this.break_[4]).class_(); var2++) {
         for (int var3 = 0; var3 < ((rq_3)this.break_[4]).byte_(); var3++) {
            for (int var4 = 0; var4 < ((rq_3)this.break_[4]).break_(); var4++) {
               int var5 = var4 + ((rja_3)this.break_[5]).b_();
               int var6 = var2 + ((rja_3)this.break_[5]).c_();
               int var7 = var3 + ((rja_3)this.break_[5]).d_();
               xc_3 var8 = ((bw_3)var1.break_[4]).class_(var5, var6, var7);
               if (((rq_3)this.break_[4]).class_(var4, var2, var3, var8)) {
                  if (((bw_3)var1.break_[4]).class_(var5, var7)) {
                     if (this.class_(
                        ((bw_3)var1.break_[4]).class_(var5, var6, var7),
                        ((rq_3)this.break_[4]).class_(var4, var2, var3, var8, (List<xc_3>)this.break_[10]),
                        false
                     )) {
                        ((LongOpenHashSet)this.break_[1]).add(rU_2.byte_(var5, var6, var7));
                     } else {
                        ((HashSet)this.break_[0]).add(new rU_2(var5, var6, var7));
                        ((LongOpenHashSet)this.break_[1]).remove(rU_2.byte_(var5, var6, var7));
                        if (((HashSet)this.break_[0]).size() > (Integer)C_class.instanceof_().rv.class_[0]) {
                           return;
                        }
                     }
                  } else if (!((LongOpenHashSet)this.break_[1]).contains(rU_2.byte_(var5, var6, var7))
                     && !((List)C_class.instanceof_().S.class_[0])
                        .contains(((rq_3)this.break_[4]).class_(var4, var2, var3, var8, (List<xc_3>)this.break_[10]).break_())) {
                     ((HashSet)this.break_[0]).add(new rU_2(var5, var6, var7));
                     if (((HashSet)this.break_[0]).size() > (Integer)C_class.instanceof_().rv.class_[0]) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   private rq_3 class_(rja_3 var1, rw_3 var2) {
      Object var3 = var2;
      if ((Boolean)C_class.instanceof_().Bs.class_[0]) {
         var3 = new ME(var2);
      }

      if ((Boolean)C_class.instanceof_().Pi.class_[0]) {
         var3 = new Mb_1((rq_3)var3, var1, ((C_class)this.case_[0]).E().byte_());
      }

      return (rq_3)var3;
   }

   private boolean class_(Collection<xc_3> var1, xc_3 var2) {
      for (xc_3 var4 : var1) {
         if (this.class_(var4, var2)) {
            return true;
         }
      }

      return extends_[95];
   }

   public rn_3 class_(boolean var1, boolean var2, int var3) {
      this.new_();
      if (var3 > 100) {
         return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[0]);
      } else {
         List var17 = this.break_(36);
         this.break_[10] = var17;
         if (((C_class)this.case_[0]).int_().class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[4])) {
            Integer var18 = 5;
            this.break_[6] = var18;
         } else {
            Integer var19 = (Integer)this.break_[6] - 1;
            this.break_[6] = var19;
         }

         ((C_class)this.case_[0]).int_().class_();
         if ((Boolean)this.break_[7]) {
            return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[2]);
         } else {
            if ((Boolean)C_class.instanceof_().O.class_[0]) {
               if ((rq_3)this.break_[3] == null) {
                  rq_3 var20 = (rq_3)this.break_[4];
                  this.break_[3] = var20;
               }

               rq_3 var4 = (rq_3)this.break_[3];
               int var5;
               int var6;
               if ((Boolean)C_class.instanceof_().rl.class_[0]) {
                  var6 = var4.class_() - 1;
                  var5 = var4.class_() - (Integer)this.break_[8] * (Integer)C_class.instanceof_().new_.class_[0];
               } else {
                  var6 = (Integer)this.break_[8] * (Integer)C_class.instanceof_().new_.class_[0] - 1;
                  var5 = 0;
               }

               GQ var21 = new GQ(this, var4, var5, var6);
               this.break_[4] = var21;
            }

            Gm_1 var28 = new Gm_1(this);
            if (!this.protected_(var28)) {
               if ((Boolean)C_class.instanceof_().O.class_[0]
                  && (Integer)this.break_[8] * (Integer)C_class.instanceof_().new_.class_[0] < (Integer)this.break_[11]) {
                  this.case_("Starting layer " + (Integer)this.break_[8]);
                  Integer var22 = (Integer)this.break_[8] + 1;
                  this.break_[8] = var22;
                  return this.class_(var1, var2, var3 + 1);
               } else {
                  rja_3 var30 = (rja_3)C_class.instanceof_().BB.class_[0];
                  int var33 = (Integer)C_class.instanceof_().case_.class_[0];
                  Integer var23 = (Integer)this.break_[9] + 1;
                  this.break_[9] = var23;
                  if (var30.equals(new rja_3(0, 0, 0)) || var33 != -1 && (Integer)this.break_[9] >= var33) {
                     this.case_("Процесс завершился");
                     if ((Boolean)C_class.instanceof_().PM.class_[0]) {
                        this.byte_("Процесс завершился", false);
                     }

                     this.protected_();
                     return null;
                  } else {
                     Integer var24 = 0;
                     this.break_[8] = var24;
                     rfH_2 var25 = new rfH_2((rja_3)this.break_[5]).break_(var30);
                     this.break_[5] = var25;
                     if (!(Boolean)C_class.instanceof_().static_.class_[0]) {
                        ((rq_3)this.break_[4]).protected_();
                     }

                     this.case_("Repeating build in vector " + var30 + ", new origin is " + (rja_3)this.break_[5]);
                     return this.class_(var1, var2, var3 + 1);
                  }
               }
            } else {
               if ((Boolean)C_class.instanceof_().rH.class_[0]) {
                  this.super_();
               }

               Optional var29 = this.byte_(var28);
               if (var29.isPresent() && var2 && ((Ps_1)this.case_[1]).catch_().BL()) {
                  PX var32 = (PX)((rqj_3)var29.get()).break_();
                  rU_2 var34 = (rU_2)((rqj_3)var29.get()).class_();
                  ((C_class)this.case_[0]).private_().class_(var32, true);
                  EF.class_((Ps_1)this.case_[1], var28.class_(var34));
                  if (((Ps_1)this.case_[1]).catch_().h()) {
                     ((C_class)this.case_[0]).int_().class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[7], true);
                  }

                  if (((Ps_1)this.case_[1]).class_(var34) || ((Ps_1)this.case_[1]).protected_().class_(var32)) {
                     ((C_class)this.case_[0]).int_().class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[4], true);
                  }

                  return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[2]);
               } else {
                  ArrayList var31 = new ArrayList();
                  Optional var7 = this.break_(var28, var31);
                  if (var7.isPresent() && var2 && ((Ps_1)this.case_[1]).catch_().BL() && (Integer)this.break_[6] <= 0) {
                     PX var36 = (PX)((GA)var7.get()).class_[3];
                     ((C_class)this.case_[0]).private_().class_(var36, true);
                     ((rhz_3)((Ps_1)this.case_[1]).catch_().implements_[1]).protected_ = (Integer)((GA)var7.get()).class_[0];
                     ((C_class)this.case_[0]).int_().class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[7], true);
                     if (((Ps_1)this.case_[1]).class_((rfH_2)((GA)var7.get()).class_[1])
                           && ((rff_3)((Ps_1)this.case_[1]).byte_()).break_().equals((rpr_3)((GA)var7.get()).class_[2])
                        || ((Ps_1)this.case_[1]).protected_().class_(var36)) {
                        ((C_class)this.case_[0]).int_().class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5], true);
                     }

                     return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[2]);
                  } else {
                     if ((Boolean)C_class.instanceof_().z.class_[0]) {
                        ArrayList var8 = new ArrayList();
                        ArrayList var9 = new ArrayList();

                        label155:
                        for (xc_3 var11 : var31) {
                           for (int var12 = 0; var12 < 9; var12++) {
                              if (this.class_((xc_3)((List)this.break_[10]).get(var12), var11, true)) {
                                 var8.add(var12);
                                 continue label155;
                              }
                           }

                           var9.add(var11);
                        }

                        label141:
                        for (int var37 = private_[30]; var37 < 36; var37++) {
                           for (xc_3 var39 : var9) {
                              if (this.class_((xc_3)((List)this.break_[10]).get(var37), var39, true)) {
                                 if (!((C_class)this.case_[0]).static_().class_(var37, var8::contains)) {
                                    return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
                                 }
                                 break label141;
                              }
                           }
                        }
                     }

                     rP_2 var35 = this.class_(var28, ((List)this.break_[10]).subList(0, 9));
                     if (var35 == null) {
                        var35 = this.class_(var28, (List<xc_3>)this.break_[10], true);
                        if (var35 == null) {
                           if ((Boolean)C_class.instanceof_().X.class_[0]
                              && (Boolean)C_class.instanceof_().O.class_[0]
                              && (Integer)this.break_[8] * (Integer)C_class.instanceof_().new_.class_[0] < ((rq_3)this.break_[3]).class_()) {
                              this.case_("Skipping layer that I cannot construct! Layer #" + (Integer)this.break_[8]);
                              Integer var26 = (Integer)this.break_[8] + 1;
                              this.break_[8] = var26;
                              return this.class_(var1, var2, var3 + 1);
                           }

                           this.case_("Unable to do it. Pausing. resume to resume, cancel to cancel");
                           Boolean var27 = true;
                           this.break_[7] = var27;
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
   public void class_(String var1, rq_3 var2, rja_3 var3) {
      this.new_();
      this.break_[2] = var1;
      this.break_[4] = var2;
      Object var17 = null;
      this.break_[3] = var17;
      boolean var4 = var2 instanceof Mb_1;
      if (!((Map)C_class.instanceof_().U.class_[0]).isEmpty()) {
         rV_2 var18 = new rV_2((rq_3)this.break_[4], (Map<xd_3, List<xd_3>>)((Object)C_class.instanceof_().U.class_[0]));
         this.break_[4] = var18;
      }

      int var5 = var3.b_();
      int var6 = var3.c_();
      int var7 = var3.d_();
      if ((Boolean)C_class.instanceof_().W.class_[0]) {
         var5 += var2.break_();
      }

      if ((Boolean)C_class.instanceof_().Pt.class_[0]) {
         var6 += var2.class_();
      }

      if ((Boolean)C_class.instanceof_().v.class_[0]) {
         var7 += var2.byte_();
      }

      rja_3 var19 = new rja_3(var5, var6, var7);
      this.break_[5] = var19;
      Boolean var20 = false;
      this.break_[7] = var20;
      Integer var21 = (Integer)C_class.instanceof_().PQ.class_[0];
      this.break_[8] = var21;
      Integer var22 = var2.class_();
      this.break_[11] = var22;
      if ((Boolean)C_class.instanceof_().Pi.class_[0] && var4) {
         if (((C_class)this.case_[0]).E().byte_().length == 0) {
            this.case_("Poor little kitten forgot to set a selection while BuildOnlySelection is true");
            Integer var23 = 0;
            this.break_[11] = var23;
         } else if ((Boolean)C_class.instanceof_().O.class_[0]) {
            OptionalInt var8 = Stream.of(((C_class)this.case_[0]).E().byte_()).mapToInt(var0 -> (Integer)var0.class_().break_[1]).min();
            OptionalInt var9 = Stream.of(((C_class)this.case_[0]).E().byte_()).mapToInt(var0 -> (Integer)var0.protected_().break_[1]).max();
            if (var8.isPresent() && var9.isPresent()) {
               int var10 = C_class.instanceof_().rl.class_[0] ? var6 + var2.class_() - var9.getAsInt() : var8.getAsInt() - var6;
               Integer var24 = (C_class.instanceof_().rl.class_[0] ? var6 + var2.class_() - var8.getAsInt() : var9.getAsInt() - var6) + extends_[3];
               this.break_[11] = var24;
               Integer var25 = Math.max((Integer)this.break_[8], var10 / (Integer)C_class.instanceof_().new_.class_[0]);
               this.break_[8] = var25;
               this.byte_(String.format("Schematic starts at y=%s with height %s", var6, var2.class_()));
               this.byte_(String.format("Selection starts at y=%s and ends at y=%s", var8.getAsInt(), var9.getAsInt()));
               this.byte_(String.format("Considering relevant height %s - %s", var10, (Integer)this.break_[11]));
            }
         }
      }

      Integer var26 = 0;
      this.break_[9] = var26;
      LongOpenHashSet var27 = new LongOpenHashSet();
      this.break_[1] = var27;
      Object var28 = null;
      this.break_[0] = var28;
   }

   @Override
   public String class_() {
      this.new_();
      return this.break_[7] ? "Builder Paused" : "Building " + (String)this.break_[2];
   }

   public xc_3 class_(int var1, int var2, int var3, xc_3 var4) {
      this.new_();
      if (!this.byte_()) {
         return null;
      } else if (!((rq_3)this.break_[4])
         .class_(var1 - ((rja_3)this.break_[5]).b_(), var2 - ((rja_3)this.break_[5]).c_(), var3 - ((rja_3)this.break_[5]).d_(), var4)) {
         return null;
      } else {
         xc_3 var5 = ((rq_3)this.break_[4])
            .class_(
               var1 - ((rja_3)this.break_[5]).b_(), var2 - ((rja_3)this.break_[5]).c_(), var3 - ((rja_3)this.break_[5]).d_(), var4, (List<xc_3>)this.break_[10]
            );
         return var5.break_() == xu_3.class_ ? null : var5;
      }
   }

   private rP_2 class_(Gm_1 var1, List<xc_3> var2, boolean var3) {
      this.new_();
      ArrayList var4 = new ArrayList();
      ArrayList var5 = new ArrayList();
      ArrayList var6 = new ArrayList();
      ArrayList var7 = new ArrayList();
      HashMap var8 = new HashMap();
      ArrayList var9 = new ArrayList();
      ((HashSet)this.break_[0]).forEach(var9x -> {
         xc_3 var10x = ((bw_3)var1.break_[4]).class_(var9x);
         if (var10x.break_() instanceof Ja_1) {
            xc_3 var11x = var1.byte_((Integer)var9x.break_[0], (Integer)var9x.break_[1], (Integer)var9x.break_[2], var10x);
            if (var11x == null) {
               var9.add(var9x);
            } else if (this.class_(var2, var1.byte_((Integer)var9x.break_[0], (Integer)var9x.break_[1], (Integer)var9x.break_[2], var10x))) {
               var4.add(var9x);
            } else {
               var8.put(var11x, 1 + var8.getOrDefault(var11x, 0));
            }
         } else if (var10x.break_() instanceof dj_3) {
            if (!EF.protected_(var10x)) {
               var6.add(var9x);
            } else {
               var7.add(var9x);
            }
         } else {
            var5.add(var9x);
         }
      });
      var9.forEach(((HashSet)this.break_[0])::remove);
      ArrayList var10 = new ArrayList();
      var5.forEach(var3x -> var10.add(this.break_(var3x, var1)));
      ArrayList var11 = new ArrayList();
      var4.forEach(var4x -> {
         if (!var4.contains(var4x.case_()) && !var4.contains(var4x.protected_(2))) {
            var11.add(this.class_(var4x, var1));
         }
      });
      var6.forEach(var1x -> var11.add(new rS_2(var1x.class_())));
      if (!var11.isEmpty()) {
         return new GL(new rs_3(var11.toArray(new rP_2[0])), new rs_3(var10.toArray(new rP_2[0])));
      } else if (var10.isEmpty()) {
         if (var3 && !var8.isEmpty()) {
            this.case_("Missing materials for at least:");
            this.case_(var8.entrySet().stream().map(var0 -> String.format("%sx %s", var0.getValue(), var0.getKey())).collect(Collectors.joining("\n")));
         }

         if (var3 && !var7.isEmpty()) {
            this.case_("Unreplaceable liquids at at least:");
            this.case_(
               var7.stream()
                  .map(var0 -> String.format("%s %s %s", (Integer)var0.break_[0], (Integer)var0.break_[1], (Integer)var0.break_[2]))
                  .collect(Collectors.joining("\n"))
            );
         }

         return null;
      } else {
         return new rs_3(var10.toArray(new rP_2[0]));
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{52, 119, -14, 108, 21, -94, 36, -96}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private Optional<GA> class_(xc_3 var1, int var2, int var3, int var4, bw_3 var5) {
      for (rpr_3 var9 : rpr_3.values()) {
         rU_2 var10 = new rU_2(var2, var3, var4).class_(var9);
         xc_3 var11 = var5.class_(var10);
         if (!EF.break_((Integer)var10.break_[0], (Integer)var10.break_[1], (Integer)var10.break_[2], var11, var5)
            && this.class_(new rU_2(var2, var3, var4), var1)) {
            rjC_2 var12 = var11.finally_(((Ps_1)this.case_[1]).case_(), var10);
            if (!var12.break_()) {
               rfl_3 var13 = var12.class_();

               for (Vec3d var17 : class_(var9)) {
                  double var18 = (double)((Integer)var10.break_[0]).intValue() + var13.class_ * var17.x + var13.protected_ * (1.0 - var17.x);
                  double var20 = (double)((Integer)var10.break_[1]).intValue() + var13.break_ * var17.y + var13.throws_ * (1.0 - var17.y);
                  double var22 = (double)((Integer)var10.break_[2]).intValue() + var13.byte_ * var17.z + var13.case_ * (1.0 - var17.z);
                  PX var24 = PJ.class_(Ph_1.class_(((Ps_1)this.case_[1]).catch_()), new rjU_2(var18, var20, var22), ((Ps_1)this.case_[1]).protected_());
                  PX var25 = ((C_class)this.case_[0]).private_().class_().class_(var24);
                  rjG_2 var26 = Ph_1.class_(((Ps_1)this.case_[1]).catch_(), var25, ((Ps_1)this.case_[1]).native_().case_(), true);
                  if (var26 != null && var26.byte_() == rjM_2.BLOCK && ((rff_3)var26).class_().equals(var10) && ((rff_3)var26).break_() == var9.case_()) {
                     OptionalInt var27 = this.class_(var1, (rff_3)var26, var25);
                     if (var27.isPresent()) {
                        return Optional.of(new GA(var27.getAsInt(), var10, var9.case_(), var24));
                     }
                  }
               }
            }
         }
      }

      return Optional.empty();
   }

   private void break_(Gm_1 var1) {
      this.new_();
      rU_2 var2 = ((Ps_1)this.case_[1]).volatile_();
      int var3 = (Integer)C_class.instanceof_().Pn.class_[0];

      for (int var4 = -var3; var4 <= var3; var4++) {
         for (int var5 = -var3; var5 <= var3; var5++) {
            for (int var6 = -var3; var6 <= var3; var6++) {
               int var7 = (Integer)var2.break_[0] + var4;
               int var8 = (Integer)var2.break_[1] + var5;
               int var9 = (Integer)var2.break_[2] + var6;
               xc_3 var10 = var1.byte_(var7, var8, var9, ((bw_3)var1.break_[4]).class_(var7, var8, var9));
               if (var10 != null) {
                  rU_2 var11 = new rU_2(var7, var8, var9);
                  if (this.class_(((bw_3)var1.break_[4]).class_(var7, var8, var9), var10, false)) {
                     ((HashSet)this.break_[0]).remove(var11);
                     ((LongOpenHashSet)this.break_[1]).add(rU_2.class_(var11));
                  } else {
                     ((HashSet)this.break_[0]).add(var11);
                     ((LongOpenHashSet)this.break_[1]).remove(rU_2.class_(var11));
                  }
               }
            }
         }
      }
   }

   private rP_2 break_(rfH_2 var1, Gm_1 var2) {
      return (rP_2)(C_class.instanceof_().K.class_[0]
            && ((bw_3)var2.break_[4]).class_(var1.final_()).break_() instanceof Ja_1
            && ((bw_3)var2.break_[4]).class_(var1.break_(2)).break_() instanceof Ja_1
         ? new GL(new Gv_1(var1), new GN(this, var1.final_()))
         : new Gv_1(var1));
   }

   List<xc_3> break_(int var1) {
      ArrayList var2 = new ArrayList();

      for (int var3 = 0; var3 < var1; var3++) {
         rdn_3 var4 = ((rhz_3)((Ps_1)this.case_[1]).catch_().implements_[1]).class_.get(var3);
         if (!var4.class_() && var4.break_() instanceof rxJ_2) {
            xc_3 var5 = ((rxJ_2)var4.break_())
               .catch_()
               .class_(
                  new rxx_3(
                     new Gc_1(
                        this,
                        ((Ps_1)this.case_[1]).case_(),
                        ((Ps_1)this.case_[1]).catch_(),
                        rpm_3.MAIN_HAND,
                        var4,
                        new rff_3(
                           new rjU_2(
                              ((Ps_1)this.case_[1]).catch_().Ps().break_,
                              ((Ps_1)this.case_[1]).catch_().Ps().byte_,
                              ((Ps_1)this.case_[1]).catch_().Ps().protected_
                           ),
                           rpr_3.UP,
                           ((Ps_1)this.case_[1]).volatile_(),
                           false
                        )
                     )
                  )
               );
            if (var5 != null) {
               var2.add(var5);
            } else {
               var2.add(xu_3.class_.continue_());
            }
         } else {
            var2.add(xu_3.class_.continue_());
         }
      }

      return var2;
   }

   private Optional<GA> break_(Gm_1 var1, List<xc_3> var2) {
      rU_2 var3 = ((Ps_1)this.case_[1]).volatile_();

      for (int var4 = -5; var4 <= 5; var4++) {
         for (int var5 = -5; var5 <= 1; var5++) {
            for (int var6 = -5; var6 <= 5; var6++) {
               int var7 = (Integer)var3.break_[0] + var4;
               int var8 = (Integer)var3.break_[1] + var5;
               int var9 = (Integer)var3.break_[2] + var6;
               xc_3 var10 = var1.byte_(var7, var8, var9, ((bw_3)var1.break_[4]).class_(var7, var8, var9));
               if (var10 != null) {
                  xc_3 var11 = ((bw_3)var1.break_[4]).class_(var7, var8, var9);
                  if (EF.break_(var7, var8, var9, var11, (bw_3)var1.break_[4])
                     && !this.class_(var11, var10, false)
                     && (var5 != 1 || ((bw_3)var1.break_[4]).class_(var7, var8 + 1, var9).break_() != xu_3.class_)) {
                     var2.add(var10);
                     Optional var12 = this.class_(var10, var7, var8, var9, (bw_3)var1.break_[4]);
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
   public void finally_() {
      this.new_();
      Boolean var5 = false;
      this.break_[7] = var5;
   }

   @Override
   public void extends_() {
      this.new_();
      Boolean var5 = true;
      this.break_[7] = var5;
   }

   private static void continue_() {
      private_ = new byte[]{
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
   public List<xc_3> implements_() {
      this.new_();
      return new ArrayList<>((List)this.break_[10]);
   }

   private void new_() {
      if (this.break_ == null) {
         this.break_ = new Object[12];
         Object[] var1 = this.break_;
         var1[6] = 0;
         var1[7] = false;
         var1[8] = 0;
         var1[9] = 0;
         var1[11] = 0;
      }
   }

   private static void package_() {
      finally_ = new double[]{
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

   private void super_() {
      this.new_();
      HashSet var1 = new HashSet((HashSet)this.break_[0]);
      var1.removeIf(
         var1x -> var1x.class_(((Ps_1)this.case_[1]).catch_().rx(), ((Ps_1)this.case_[1]).catch_().re(), ((Ps_1)this.case_[1]).catch_().BO(), false) > 200.0
               ? true
               : extends_[112]
      );
      if (!var1.isEmpty()) {
         this.break_[0] = var1;
      }
   }

   @Override
   public void protected_() {
      this.new_();
      super.protected_();
      Object var5 = null;
      this.break_[0] = var5;
      Object var6 = null;
      this.break_[2] = var6;
      Object var7 = null;
      this.break_[4] = var7;
      Object var8 = null;
      this.break_[3] = var8;
      Integer var9 = (Integer)C_class.instanceof_().PQ.class_[0];
      this.break_[8] = var9;
      Integer var10 = 0;
      this.break_[9] = var10;
      Boolean var11 = false;
      this.break_[7] = var11;
      Object var12 = null;
      this.break_[1] = var12;
   }

   private boolean protected_(Gm_1 var1) {
      this.new_();
      if ((HashSet)this.break_[0] == null) {
         HashSet var6 = new HashSet();
         this.break_[0] = var6;
         this.class_(var1);
         if (((HashSet)this.break_[0]).isEmpty()) {
            return false;
         }
      }

      this.break_(var1);
      if (((HashSet)this.break_[0]).isEmpty()) {
         this.class_(var1);
      }

      return !((HashSet)this.break_[0]).isEmpty() ? true : extends_[74];
   }

   @Override
   public void private_() {
      if (Mu_1.break_()) {
         Optional var1 = Mu_1.class_();
         if (var1.isPresent()) {
            rw_3 var2 = (rw_3)((rqj_3)var1.get()).class_();
            rfH_2 var3 = (rfH_2)((rqj_3)var1.get()).break_();
            Object var4 = C_class.instanceof_().Bs.class_[0] ? new ME(var2) : var2;
            if ((Boolean)C_class.instanceof_().Pi.class_[0]) {
               var4 = new Mb_1((rq_3)var4, var3, ((C_class)this.case_[0]).E().byte_());
            }

            this.class_(((rw_3)((rqj_3)var1.get()).class_()).toString(), (rq_3)var4, var3);
         } else {
            this.case_("No schematic currently open");
         }
      } else {
         this.case_("Schematica is not present");
      }
   }

   private static void final_() {
      catch_ = new String[]{
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

   private static void volatile_() {
      implements_ = new short[]{
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
   public boolean native_() {
      this.new_();
      return (Boolean)this.break_[7];
   }
}

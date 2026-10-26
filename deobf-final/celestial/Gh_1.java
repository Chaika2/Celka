package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gh_1 implements PP, rW_2 {
   public static Object[] class_;
   private static String[] throws_;
   public Object[] break_;
   private static boolean[] case_;
   private static byte[] catch_;
   private static double[] private_;
   private static short[] implements_;

   public boolean byte_() {
      return (Boolean)this.break_[13];
   }

   private static void int_() {
      catch_ = new byte[]{3, 2, 10, 10, 3, -1, 3, 2, 2, 2, 3, 2, 2, -3, 3, 2, 2, 3, 3, 2, 3, 14, 2, 3, 6, 7, 13, 3, 2};
   }

   public Gh_1(BO var1, a_1 var2) {
      this.extends_();
      Boolean var7 = true;
      this.break_[7] = var7;
      HashSet var8 = new HashSet();
      this.break_[8] = var8;
      HashSet var9 = new HashSet();
      this.break_[9] = var9;
      HashSet var10 = new HashSet();
      this.break_[10] = var10;
      this.break_[11] = var1;
      Ps_1 var12 = (Ps_1)var1.class_[1];
      this.break_[12] = var12;
      this.break_[0] = var2;
      Integer var14 = 0;
      this.break_[1] = var14;
   }

   static {
      ntfClinit();
   }

   private void this_() {
      ((C_class)((BO)this.break_[11]).class_[0]).int_().class_();
   }

   private boolean class_(rqj_3<Double, rfH_2> var1, double var2) {
      double var4 = (Double)var1.class_();
      if (var4 > var2) {
         if (((a_1)this.break_[0]).catch_().get((Integer)this.break_[1]) instanceof Gs_1) {
            rfH_2 var6 = ((a_1)this.break_[0]).break_().get((Integer)this.break_[1] + 1);
            return Pu_1.break_(((Ps_1)this.break_[12]).catch_(), var6) >= var2 ? true : case_[43];
         } else {
            return case_[44];
         }
      } else {
         return case_[45];
      }
   }

   private static boolean class_(Ps_1 var0, rd_3 var1, rd_3 var2) {
      if (var2 instanceof GP && var2.byte_().equals(var1.byte_())) {
         return true;
      } else if (!EF.class_(var0, var1.implements_().break_(var1.byte_()))) {
         return false;
      } else if (var2 instanceof Gb_1 && var2.byte_().break_().equals(var1.byte_())) {
         return true;
      } else {
         return var2 instanceof GB && C_class.instanceof_().C.class_[0] ? true : case_[106];
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{46, -92, -43, -1, 69, -96, -90, 21}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Gh_1 class_(Gh_1 var1) {
      return var1 == null ? this.new_() : GX.class_((a_1)this.break_[0], (a_1)var1.break_[0], false).map(var2 -> {
         if (!var2.protected_().equals(var1.class_().protected_())) {
            throw new IllegalStateException();
         } else {
            Gh_1 var3 = new Gh_1((BO)this.break_[11], var2);
            Integer var8 = (Integer)this.break_[1];
            var3.break_[1] = var8;
            Double var9 = (Double)this.break_[4];
            var3.break_[4] = var9;
            Integer var10 = (Integer)this.break_[5];
            var3.break_[5] = var10;
            Integer var11 = (Integer)this.break_[3];
            var3.break_[3] = var11;
            return var3;
         }
      }).orElseGet(this::new_);
   }

   private rqj_3<Double, rfH_2> class_(a_1 var1) {
      double var2 = -1.0;
      rfH_2 var4 = null;

      for (rd_3 var6 : var1.catch_()) {
         for (rfH_2 var8 : ((Ev_1)var6).volatile_()) {
            double var9 = Pu_1.class_(((Ps_1)this.break_[12]).catch_(), var8);
            if (var9 < var2 || var2 == -1.0) {
               var2 = var9;
               var4 = var8;
            }
         }
      }

      return new rqj_3<>(var2, var4);
   }

   private static boolean class_(Ps_1 var0, rd_3 var1) {
      double var2 = Math.abs((double)var1.byte_().b_() * ((double)((Integer)var1.break_().break_[2]).intValue() + 0.5 - var0.catch_().Ps().protected_))
         + Math.abs((double)var1.byte_().d_() * ((double)((Integer)var1.break_().break_[0]).intValue() + 0.5 - var0.catch_().Ps().break_));
      if (var2 > 0.1) {
         return false;
      } else {
         rfH_2 var4 = var1.break_().byte_(var1.byte_()).break_(2);
         if (EF.case_(var0, var4)) {
            return true;
         } else {
            double var5 = Math.abs((double)var1.byte_().b_() * ((double)var4.b_() + 0.5 - var0.catch_().Ps().break_))
               + Math.abs((double)var1.byte_().d_() * ((double)var4.d_() + 0.5 - var0.catch_().Ps().protected_));
            return var5 > 0.8 ? true : case_[88];
         }
      }
   }

   @Override
   public a_1 class_() {
      return (a_1)this.break_[0];
   }

   private static boolean class_(Ps_1 var0, Gb_1 var1, Gr_1 var2, rd_3 var3) {
      if (!(Boolean)C_class.instanceof_().PY.class_[0]) {
         return false;
      } else if (!var1.byte_().equals(var2.byte_().break_())) {
         return false;
      } else if (var3.byte_().b_() == var2.byte_().b_() && var3.byte_().d_() == var2.byte_().d_()) {
         if (!EF.break_(var0, var1.implements_().case_())) {
            return false;
         } else if (!EF.break_(var0, var2.implements_().case_())) {
            return false;
         } else if (!((List)var2.new_[8]).isEmpty()) {
            return false;
         } else {
            for (int var4 = case_[95]; var4 < 2; var4++) {
               for (int var5 = 0; var5 < 3; var5++) {
                  Object var6 = var1.break_().final_(var5);
                  if (var4 == 1) {
                     var6 = ((rfH_2)var6).break_(var1.byte_());
                  }

                  if (!EF.case_(var0, (rfH_2)var6)) {
                     return false;
                  }
               }
            }

            if (EF.throws_(var0.case_().byte_(var1.break_().final_(3)))) {
               return false;
            } else {
               return !EF.throws_(var0.case_().byte_(var2.implements_().final_(2))) ? true : case_[101];
            }
         }
      } else {
         return case_[91];
      }
   }

   private rqj_3<rjU_2, rfH_2> class_(Gs_1 var1) {
      rfH_2 var2 = var1.byte_();
      if (var2.c_() < -3) {
         return null;
      } else if (!((List)var1.new_[8]).isEmpty()) {
         return null;
      } else {
         rja_3 var3 = new rja_3(var2.b_(), 0, var2.d_());

         int var4;
         label49:
         for (var4 = (Integer)this.break_[1] + 1; var4 < ((a_1)this.break_[0]).class_() - 1 && var4 < this.break_[1] + 3; var4++) {
            rd_3 var5 = ((a_1)this.break_[0]).catch_().get(var4);
            if (!(var5 instanceof Gb_1) || !var3.equals(var5.byte_())) {
               break;
            }

            for (int var6 = (Integer)var5.implements_().break_[1]; var6 <= var1.break_().break_[1] + 1; var6++) {
               rfH_2 var7 = new rfH_2((Integer)var5.implements_().break_[0], var6, (Integer)var5.implements_().break_[2]);
               if (!EF.case_((Ps_1)this.break_[12], var7)) {
                  break label49;
               }
            }

            if (!EF.break_((Ps_1)this.break_[12], var5.implements_().case_())) {
               break;
            }
         }

         if (--var4 == (Integer)this.break_[1]) {
            return null;
         } else {
            double var9 = (double)(var4 - (Integer)this.break_[1]) - 0.4;
            return new rqj_3<>(
               new rjU_2(
                  (double)var3.b_() * var9 + (double)((Integer)var1.implements_().break_[0]).intValue() + 0.5,
                  (double)((Integer)var1.implements_().break_[1]).intValue(),
                  (double)var3.d_() * var9 + (double)((Integer)var1.implements_().break_[2]).intValue() + 0.5
               ),
               var1.implements_().class_(var3.b_() * (var4 - (Integer)this.break_[1]), 0, var3.d_() * (var4 - (Integer)this.break_[1]))
            );
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1009643304;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3875544986571064132L;
   }

   @Override
   public int break_() {
      return (Integer)this.break_[1];
   }

   public boolean throws_() {
      if ((Integer)this.break_[1] == ((a_1)this.break_[0]).class_() - 1) {
         Integer var14 = (Integer)this.break_[1] + 1;
         this.break_[1] = var14;
      }

      if ((Integer)this.break_[1] >= ((a_1)this.break_[0]).class_()) {
         return true;
      } else {
         Ev_1 var1 = (Ev_1)((a_1)this.break_[0]).catch_().get((Integer)this.break_[1]);
         rU_2 var2 = ((Ps_1)this.break_[12]).volatile_();
         if (!var1.volatile_().contains(var2)) {
            for (int var3 = 0; var3 < this.break_[1] && var3 < ((a_1)this.break_[0]).class_(); var3++) {
               if (((Ev_1)((a_1)this.break_[0]).catch_().get(var3)).volatile_().contains(var2)) {
                  int var4 = (Integer)this.break_[1];
                  Integer var15 = var3;
                  this.break_[1] = var15;

                  for (int var5 = (Integer)this.break_[1]; var5 <= var4; var5++) {
                     ((a_1)this.break_[0]).catch_().get(var5).class_();
                  }

                  this.continue_();
                  this.throws_();
                  return false;
               }
            }

            for (int var31 = (Integer)this.break_[1] + 3; var31 < ((a_1)this.break_[0]).class_() - 1; var31++) {
               if (((Ev_1)((a_1)this.break_[0]).catch_().get(var31)).volatile_().contains(var2)) {
                  if (var31 - (Integer)this.break_[1] > 2) {
                     this.byte_("Skipping forward " + (var31 - (Integer)this.break_[1]) + " steps, to " + var31);
                  }

                  Integer var16 = var31 - 1;
                  this.break_[1] = var16;
                  this.continue_();
                  this.throws_();
                  return false;
               }
            }
         }

         rqj_3 var32 = this.class_((a_1)this.break_[0]);
         if (this.class_(var32, 2.0)) {
            Integer var17 = (Integer)this.break_[2] + 1;
            this.break_[2] = var17;
            System.out.println("FAR AWAY FROM PATH FOR " + (Integer)this.break_[2] + " TICKS. Current distance: " + var32.class_() + ". Threshold: 2.0");
            if ((double)((Integer)this.break_[2]).intValue() > 200.0) {
               this.byte_("Too far away from path for too long, cancelling path");
               this.native_();
               return false;
            }
         } else {
            Integer var18 = 0;
            this.break_[2] = var18;
         }

         if (this.class_(var32, 3.0)) {
            this.byte_("too far from path");
            this.native_();
            return false;
         } else {
            bw_3 var33 = new bw_3((Ps_1)this.break_[12]);

            for (int var34 = (Integer)this.break_[1] - 10; var34 < this.break_[1] + 10; var34++) {
               if (var34 >= 0 && var34 < ((a_1)this.break_[0]).catch_().size()) {
                  Ev_1 var6 = (Ev_1)((a_1)this.break_[0]).catch_().get(var34);
                  List var7 = var6.class_(var33);
                  List var8 = var6.break_(var33);
                  List var9 = var6.byte_(var33);
                  var6.private_();
                  if (!var7.equals(var6.class_(var33))) {
                     Boolean var19 = true;
                     this.break_[7] = var19;
                  }

                  if (!var8.equals(var6.break_(var33))) {
                     Boolean var20 = true;
                     this.break_[7] = var20;
                  }

                  if (!var9.equals(var6.byte_(var33))) {
                     Boolean var21 = true;
                     this.break_[7] = var21;
                  }
               }
            }

            if ((Boolean)this.break_[7]) {
               HashSet var35 = new HashSet();
               HashSet var38 = new HashSet();
               HashSet var41 = new HashSet();

               for (int var42 = (Integer)this.break_[1]; var42 < ((a_1)this.break_[0]).catch_().size(); var42++) {
                  Ev_1 var44 = (Ev_1)((a_1)this.break_[0]).catch_().get(var42);
                  var35.addAll(var44.class_(var33));
                  var38.addAll(var44.break_(var33));
                  var41.addAll(var44.byte_(var33));
               }

               this.break_[8] = var35;
               this.break_[9] = var38;
               this.break_[10] = var41;
               Boolean var25 = false;
               this.break_[7] = var25;
            }

            if ((Integer)this.break_[1] < ((a_1)this.break_[0]).catch_().size() - 1) {
               rd_3 var36 = ((a_1)this.break_[0]).catch_().get((Integer)this.break_[1] + 1);
               if (!((bw_3)((C_class)((BO)this.break_[11]).class_[0]).break_[34])
                  .class_((Integer)var36.implements_().break_[0], (Integer)var36.implements_().break_[2])) {
                  this.byte_("Pausing since destination is at edge of loaded chunks");
                  this.this_();
                  return true;
               }
            }

            boolean var37 = var1.protected_();
            if ((Integer)this.break_[5] == null || (Integer)this.break_[5] != (Integer)this.break_[1]) {
               Integer var26 = (Integer)this.break_[1];
               this.break_[5] = var26;
               Double var27 = var1.throws_();
               this.break_[4] = var27;
               if (C_class.instanceof_().case_()) {
                  for (int var39 = 1; var39 < C_class.instanceof_().ru.class_[0] && this.break_[1] + var39 < ((a_1)this.break_[0]).class_() - 1; var39++) {
                     if (((Ev_1)((a_1)this.break_[0]).catch_().get((Integer)this.break_[1] + var39)).class_(((BO)this.break_[11]).continue_()) >= 1000000.0
                        && var37) {
                        this.byte_("Something has changed in the world and a future movement has become impossible. Cancelling.");
                        this.native_();
                        return true;
                     }
                  }
               }
            }

            double var40 = var1.protected_(((BO)this.break_[11]).continue_());
            if (var40 >= 1000000.0 && var37) {
               this.byte_("Something has changed in the world and this movement has become impossible. Cancelling.");
               this.native_();
               return true;
            } else if (!var1.case_() && var40 - (Double)this.break_[4] > (Double)C_class.instanceof_().u.class_[0] && var37) {
               this.byte_("Original cost " + (Double)this.break_[4] + " current cost " + var40 + ". Cancelling.");
               this.native_();
               return true;
            } else if (this.volatile_()) {
               this.byte_("Pausing since current best path is a backtrack");
               this.this_();
               return true;
            } else {
               rk_3 var43 = var1.catch_();
               if (var43 == (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[4] || var43 == (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[5]) {
                  this.byte_("Movement returns status " + var43);
                  this.native_();
                  return true;
               } else if (var43 == (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[3]) {
                  Integer var28 = (Integer)this.break_[1] + 1;
                  this.break_[1] = var28;
                  this.continue_();
                  this.throws_();
                  return true;
               } else {
                  Boolean var29 = this.synchronized_();
                  this.break_[13] = var29;
                  if (!(Boolean)this.break_[13]) {
                     ((Ps_1)this.break_[12]).catch_().c_(false);
                  }

                  Integer var30 = (Integer)this.break_[3] + 1;
                  this.break_[3] = var30;
                  if ((double)((Integer)this.break_[3]).intValue()
                     > (Double)this.break_[4] + (double)((Integer)C_class.instanceof_().default_.class_[0]).intValue()) {
                     this.byte_(
                        "This movement has taken too long (" + (Integer)this.break_[3] + " ticks, expected " + (Double)this.break_[4] + "). Cancelling."
                     );
                     this.native_();
                     return true;
                  } else {
                     return var37;
                  }
               }
            }
         }
      }
   }

   public Set<rfH_2> finally_() {
      return Collections.unmodifiableSet((HashSet)this.break_[10]);
   }

   public Set<rfH_2> catch_() {
      return Collections.unmodifiableSet((HashSet)this.break_[8]);
   }

   private void extends_() {
      if (this.break_ == null) {
         this.break_ = new Object[14];
         Object[] var1 = this.break_;
         var1[1] = 0;
         var1[2] = 0;
         var1[3] = 0;
         var1[6] = false;
         var1[7] = false;
         var1[13] = false;
      }
   }

   public Set<rfH_2> case_() {
      return Collections.unmodifiableSet((HashSet)this.break_[9]);
   }

   private void continue_() {
      this.this_();
      Integer var5 = 0;
      this.break_[3] = var5;
   }

   private static void else_() {
      Object[] var0 = new Object[]{3.0, 2.0, 200.0};
      class_ = var0;
   }

   public boolean implements_() {
      if (!((Ps_1)this.break_[12]).catch_().BL() && ((Ps_1)this.break_[12]).case_().break_(((Ps_1)this.break_[12]).volatile_()).byte_()) {
         return false;
      } else if (((Ps_1)this.break_[12]).catch_().rv().byte_ < -0.1) {
         return false;
      } else {
         int var1 = ((a_1)this.break_[0]).break_().indexOf(((Ps_1)this.break_[12]).volatile_());
         if (var1 == -1) {
            return false;
         } else {
            Integer var6 = var1;
            this.break_[1] = var6;
            this.this_();
            return true;
         }
      }
   }

   private Gh_1 new_() {
      if ((Integer)this.break_[1] > (Integer)C_class.instanceof_().Pk.class_[0]) {
         int var1 = (Integer)C_class.instanceof_().void_.class_[0];
         GO var2 = new GO((a_1)this.break_[0], var1, ((a_1)this.break_[0]).class_() - 1);
         if (!var2.protected_().equals(((a_1)this.break_[0]).protected_())) {
            throw new IllegalStateException();
         } else {
            this.byte_("Discarding earliest segment movements, length cut from " + ((a_1)this.break_[0]).class_() + " to " + var2.class_());
            Gh_1 var3 = new Gh_1((BO)this.break_[11], var2);
            Integer var8 = (Integer)this.break_[1] - var1;
            var3.break_[1] = var8;
            Double var9 = (Double)this.break_[4];
            var3.break_[4] = var9;
            if ((Integer)this.break_[5] != null) {
               Integer var10 = (Integer)this.break_[5] - var1;
               var3.break_[5] = var10;
            }

            Integer var11 = (Integer)this.break_[3];
            var3.break_[3] = var11;
            return var3;
         }
      } else {
         return this;
      }
   }

   private static void package_() {
      private_ = new double[]{2.0, 200.0, 3.0, 1000000.0, 1000000.0, -1.0, -1.0, -0.1, 0.07, 0.4, 0.5, 0.5, 0.5, 0.5, 0.1, 0.5, 0.5, 0.8, 3.0, 2.0, 200.0};
   }

   private static void return_() {
      case_ = new boolean[]{
         true,
         false,
         true,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
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
         true,
         true,
         true,
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
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
         false,
         false,
         true,
         true,
         true,
         false,
         true,
         true,
         true,
         false,
         true,
         true,
         true,
         true,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         true,
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
         true,
         false,
         false,
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
         true
      };
   }

   private static void super_() {
      implements_ = new short[]{
         7,
         8,
         9,
         10,
         11,
         1,
         12,
         0,
         1,
         1,
         0,
         1,
         1,
         1,
         0,
         0,
         1,
         12,
         1,
         0,
         0,
         1,
         1,
         1,
         0,
         1,
         0,
         0,
         1,
         1,
         1,
         0,
         2,
         2,
         2,
         2,
         2,
         12,
         1,
         1,
         0,
         0,
         7,
         7,
         7,
         7,
         1,
         0,
         0,
         8,
         9,
         10,
         7,
         1,
         0,
         0,
         1,
         11,
         0,
         34,
         0,
         2,
         5,
         5,
         1,
         1,
         5,
         4,
         0,
         1,
         0,
         0,
         1,
         11,
         11,
         4,
         0,
         4,
         4,
         5,
         3,
         1,
         1,
         13,
         13,
         12,
         3,
         3,
         3,
         4,
         0,
         3,
         4,
         12,
         11,
         12,
         12,
         12,
         12,
         12,
         12,
         12,
         0,
         1,
         12,
         0,
         1,
         0,
         1,
         12,
         12,
         12,
         12,
         12,
         0,
         12,
         1,
         11,
         0,
         8,
         11,
         0,
         8,
         11,
         0,
         8,
         0,
         1,
         1,
         0,
         0,
         1,
         12,
         0,
         1,
         12,
         1,
         1,
         11,
         0,
         6,
         1,
         0,
         0,
         1,
         12,
         11,
         0,
         1,
         0,
         0,
         1,
         1,
         1,
         12,
         1,
         0,
         0,
         1,
         12,
         12,
         1,
         1,
         1,
         0,
         1,
         12,
         11,
         0,
         6,
         1,
         0,
         12,
         0,
         1,
         0,
         12,
         0,
         1,
         11,
         0,
         12,
         12,
         11,
         0,
         0,
         8,
         1,
         0,
         1,
         0,
         1,
         1,
         0,
         2,
         12,
         12,
         1,
         1,
         0,
         1,
         2,
         1,
         1,
         2,
         0,
         0,
         8,
         0,
         3,
         11,
         0,
         11,
         0,
         0,
         1,
         6,
         1,
         0,
         0,
         1,
         0,
         0,
         0,
         0,
         0,
         0,
         11,
         1,
         1,
         4,
         4,
         5,
         5,
         5,
         3,
         3,
         0,
         6,
         1,
         0,
         8,
         9,
         10,
         13,
         11,
         1,
         1,
         4,
         4,
         5,
         5,
         3,
         3
      };
   }

   public boolean protected_() {
      return this.break_[1] >= ((a_1)this.break_[0]).class_() ? true : case_[112];
   }

   public boolean private_() {
      return (Boolean)this.break_[6];
   }

   private static void final_() {
      throws_ = new String[]{
         new String("Too far away from path for too long, cancelling path"),
         new String("too far from path"),
         new String("Pausing since destination is at edge of loaded chunks"),
         new String("Something has changed in the world and a future movement has become impossible. Cancelling."),
         new String("Something has changed in the world and this movement has become impossible. Cancelling."),
         new String("Pausing since current best path is a backtrack"),
         new String("Skipping traverse to straight ascend"),
         new String("Too far to the side to safely sprint ascend"),
         new String("Sprinting would be unsafe"),
         new String("Skipping descend to straight ascend")
      };
   }

   private boolean volatile_() {
      Optional var1 = ((BO)this.break_[11]).case_();
      if (!var1.isPresent()) {
         return false;
      } else if (!((Ps_1)this.break_[12]).catch_().BL()) {
         return false;
      } else if (!EF.break_((Ps_1)this.break_[12], ((Ps_1)this.break_[12]).volatile_().case_())) {
         return false;
      } else if (!EF.class_((Ps_1)this.break_[12], ((Ps_1)this.break_[12]).volatile_())
         || !EF.class_((Ps_1)this.break_[12], ((Ps_1)this.break_[12]).volatile_().class_())) {
         return case_[36];
      } else if (!((a_1)this.break_[0]).catch_().get((Integer)this.break_[1]).protected_()) {
         return false;
      } else {
         Optional var2 = ((EW)var1.get()).class_();
         if (!var2.isPresent()) {
            return false;
         } else {
            List var3 = ((a_1)var2.get()).break_();
            if (var3.size() < 3) {
               return false;
            } else {
               var3 = var3.subList(1, var3.size());
               return var3.contains(((Ps_1)this.break_[12]).volatile_());
            }
         }
      }
   }

   private boolean synchronized_() {
      boolean var1 = ((C_class)((BO)this.break_[11]).class_[0]).int_().class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[8]);
      ((C_class)((BO)this.break_[11]).class_[0]).int_().class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[8], false);
      if (!(Boolean)(new EZ((C_class)((BO)this.break_[11]).class_[0], false)).break_[8]) {
         return false;
      } else {
         rd_3 var2 = ((a_1)this.break_[0]).catch_().get((Integer)this.break_[1]);
         if (var2 instanceof Gb_1 && (Integer)this.break_[1] < ((a_1)this.break_[0]).class_() - 3) {
            rd_3 var3 = ((a_1)this.break_[0]).catch_().get((Integer)this.break_[1] + 1);
            if (var3 instanceof Gr_1 && class_((Ps_1)this.break_[12], (Gb_1)var2, (Gr_1)var3, ((a_1)this.break_[0]).catch_().get((Integer)this.break_[1] + 2))) {
               if (class_((Ps_1)this.break_[12], var2)) {
                  this.byte_("Skipping traverse to straight ascend");
                  Integer var10 = (Integer)this.break_[1] + 1;
                  this.break_[1] = var10;
                  this.continue_();
                  this.throws_();
                  ((C_class)((BO)this.break_[11]).class_[0]).int_().class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[6], true);
                  return true;
               }

               this.byte_("Too far to the side to safely sprint ascend");
            }
         }

         if (var1) {
            return true;
         } else {
            if (var2 instanceof GP) {
               if ((Integer)this.break_[1] < ((a_1)this.break_[0]).class_() - 2) {
                  rd_3 var14 = ((a_1)this.break_[0]).catch_().get((Integer)this.break_[1] + 1);
                  if (EF.break_((Ps_1)this.break_[12], (rfH_2)var14.implements_().case_()) && (var14 instanceof Gb_1 || var14 instanceof GE)) {
                     boolean var4 = C_class.instanceof_().byte_() && ((C_class)((BO)this.break_[11]).class_[0]).static_().class_() && var14 instanceof GE
                        ? true
                        : case_[60];
                     boolean var5 = !var2.byte_().final_().break_(var14.byte_()).equals(rfH_2.protected_)
                           && var2.byte_().final_().protected_(var14.byte_()).equals(rfH_2.protected_)
                        ? true
                        : case_[62];
                     if (var5 && !var4) {
                        ((GP)var2).int_();
                     }
                  }
               }

               if (((GP)var2).new_() && !((GP)var2).package_()) {
                  this.byte_("Sprinting would be unsafe");
                  return false;
               }

               if ((Integer)this.break_[1] < ((a_1)this.break_[0]).class_() - 2) {
                  rd_3 var15 = ((a_1)this.break_[0]).catch_().get((Integer)this.break_[1] + 1);
                  if (var15 instanceof Gr_1 && var2.byte_().final_().equals(var15.byte_().break_())) {
                     Integer var11 = (Integer)this.break_[1] + 1;
                     this.break_[1] = var11;
                     this.continue_();
                     this.throws_();
                     this.byte_("Skipping descend to straight ascend");
                     return true;
                  }

                  if (class_((Ps_1)this.break_[12], var2, var15)) {
                     if (var15 instanceof GP && (Integer)this.break_[1] < ((a_1)this.break_[0]).class_() - 3) {
                        rd_3 var20 = ((a_1)this.break_[0]).catch_().get((Integer)this.break_[1] + 2);
                        if (var20 instanceof GP && !class_((Ps_1)this.break_[12], var15, var20)) {
                           return false;
                        }
                     }

                     if (((Ps_1)this.break_[12]).volatile_().equals(var2.implements_())) {
                        Integer var12 = (Integer)this.break_[1] + 1;
                        this.break_[1] = var12;
                        this.continue_();
                        this.throws_();
                     }

                     return case_[69];
                  }
               }
            }

            if (var2 instanceof Gr_1 && (Integer)this.break_[1] != 0) {
               rd_3 var16 = ((a_1)this.break_[0]).catch_().get((Integer)this.break_[1] - 1);
               if (var16 instanceof GP && var16.byte_().final_().equals(var2.byte_().break_())) {
                  rU_2 var18 = var2.break_().class_();
                  if (((Ps_1)this.break_[12]).catch_().Ps().byte_ >= (double)var18.c_() - 0.07) {
                     ((C_class)((BO)this.break_[11]).class_[0]).int_().class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[6], false);
                     return true;
                  }
               }

               if ((Integer)this.break_[1] < ((a_1)this.break_[0]).class_() - 2
                  && var16 instanceof Gb_1
                  && class_((Ps_1)this.break_[12], (Gb_1)var16, (Gr_1)var2, ((a_1)this.break_[0]).catch_().get((Integer)this.break_[1] + 1))) {
                  return true;
               }
            }

            if (var2 instanceof Gs_1) {
               rqj_3 var17 = this.class_((Gs_1)var2);
               if (var17 != null) {
                  rU_2 var19 = new rU_2((rfH_2)var17.break_());
                  if (!((a_1)this.break_[0]).break_().contains(var19)) {
                     throw new IllegalStateException();
                  }

                  if (((Ps_1)this.break_[12]).volatile_().equals(var19)) {
                     Integer var13 = ((a_1)this.break_[0]).break_().indexOf(var19);
                     this.break_[1] = var13;
                     this.continue_();
                     this.throws_();
                     return true;
                  }

                  this.this_();
                  ((C_class)((BO)this.break_[11]).class_[0])
                     .private_()
                     .class_(PJ.class_(((Ps_1)this.break_[12]).finally_(), (rjU_2)var17.class_(), ((Ps_1)this.break_[12]).protected_()), false);
                  ((C_class)((BO)this.break_[11]).class_[0]).int_().class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[0], true);
                  return true;
               }
            }

            return case_[79];
         }
      }
   }

   private void native_() {
      this.this_();
      ((C_class)((BO)this.break_[11]).class_[0]).int_().break_().class_();
      Integer var5 = ((a_1)this.break_[0]).class_() + 3;
      this.break_[1] = var5;
      Boolean var6 = true;
      this.break_[6] = var6;
   }
}

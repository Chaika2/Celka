package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.LinkedBlockingQueue;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BO extends Pv_1 implements PP, C_final {
   private static String[] throws_;
   private static byte[] case_;
   public Object[] break_;
   private static short[] catch_;
   private static double[] private_;
   private static boolean[] implements_;

   private static void char_() {
      throws_ = new String[]{
         new String("Discarding next path as it does not contain current position"),
         new String("Continuing on to planned next path"),
         new String("Splicing into planned next path early..."),
         new String("Path almost over. Planning ahead..."),
         new String("Must be called with synchronization on pathCalcLock"),
         new String("Already doing it"),
         new String("Improper context thread safety level"),
         new String("no goal"),
         new String("Warning: discarding orphan path segment with incorrect start"),
         new String("Warning: discarding orphan next segment with incorrect start"),
         new String("Warning: PathingBehaivor illegal state! Discarding invalid path!")
      };
   }

   @Override
   public rP_2 byte_() {
      this.while_();
      return (rP_2)this.break_[2];
   }

   public boolean int_() {
      this.while_();
      return (Boolean)this.break_[11];
   }

   public BO(C_class var1) {
      super(var1);
      this.while_();
      Object var6 = new Object();
      this.break_[13] = var6;
      Object var7 = new Object();
      this.break_[14] = var7;
      LinkedBlockingQueue var8 = new LinkedBlockingQueue();
      this.break_[17] = var8;
   }

   static {
      ntfClinit();
   }

   public void this_() {
      this.while_();
      synchronized ((Object)this.break_[14]) {
         this.case_().ifPresent(EW::catch_);
         if (!this.else_()) {
            return;
         }

         Object var7 = null;
         this.break_[catch_[132]] = var7;
         Object var8 = null;
         this.break_[catch_[133]] = var8;
      }

      Boolean var9 = true;
      this.break_[10] = var9;
   }

   private void interface_() {
      this.while_();
      this.class_((rU_2)this.break_[16]);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5987297784449817445L;
   }

   private void class_(rU_2 var1) {
      this.while_();
      Integer var6 = 0;
      this.break_[4] = var6;
      this.break_[5] = var1;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -939245588;
   }

   public void class_(rP_2 var1) {
      this.while_();
      this.break_[2] = var1;
   }

   private void class_(rfH_2 var1) {
      this.class_(new rU_2(var1));
   }

   @Override
   public void class_(q_1 var1) {
      this.while_();
      if ((Gh_1)this.break_[0] != null) {
         switch (((int[])Bh_1.class_[0])[var1.class_().ordinal()]) {
            case 1:
               Boolean var6 = ((Qw_1)b_.class_[20]).static_;
               this.break_[15] = var6;
               ((Qw_1)b_.class_[20]).static_ = false;
               break;
            case 2:
               ((Qw_1)b_.class_[20]).static_ = (Boolean)this.break_[15];
         }
      }
   }

   @Override
   public void class_(I var1) {
      this.while_();
      if (this.catch_()) {
         var1.class_(((Gh_1)this.break_[0]).byte_());
      }
   }

   @Override
   public void class_(T var1) {
      bg_3.class_(var1, this);
   }

   @Override
   public void class_(j_1 var1) {
      this.while_();
      this.goto_();
      if (var1.class_() == (V)V.staticFields30e1cd8580ce39faa61be3646b7cc079[1]) {
         this.throw_();
         ((C_class)this.class_[0]).void_().case_();
      } else {
         rU_2 var6 = this.super_();
         this.break_[16] = var6;
         ((C_class)this.class_[0]).void_().catch_();
         this.public_();
         Integer var7 = (Integer)this.break_[4] + 1;
         this.break_[4] = var7;
         this.goto_();
      }
   }

   private void class_(rfH_2 var1, boolean var2, EZ var3) {
      this.while_();
      if (!Thread.holdsLock(this.break_[13])) {
         throw new IllegalStateException("Must be called with synchronization on pathCalcLock");
      } else if ((EW)this.break_[12] != null) {
         throw new IllegalStateException("Already doing it");
      } else if (!(Boolean)var3.break_[0]) {
         throw new IllegalStateException("Improper context thread safety level");
      } else {
         rP_2 var4 = (rP_2)this.break_[2];
         if (var4 == null) {
            this.byte_("no goal");
         } else {
            long var5;
            long var7;
            if ((Gh_1)this.break_[0] == null) {
               var5 = (Long)C_class.instanceof_().rh.class_[0];
               var7 = (Long)C_class.instanceof_().PH.class_[0];
            } else {
               var5 = (Long)C_class.instanceof_().w.class_[0];
               var7 = (Long)C_class.instanceof_().rL.class_[0];
            }

            EW var9 = this.class_(var1, var4, (Gh_1)this.break_[0] == null ? null : ((Gh_1)this.break_[0]).class_(), var3);
            if (!Objects.equals(var9.break_(), var4)) {
               this.byte_("Simplifying " + var4.getClass() + " to GoalXZ due to distance");
            }

            this.break_[12] = var9;
            C_class.interface_()
               .execute(
                  () -> {
                     this.while_();
                     if (var2) {
                        this.byte_("Starting to search for path from " + var1 + " to " + var4);
                     }

                     PM var9x = var9.class_(var5, var7);
                     synchronized ((Object)this.break_[14]) {
                        Optional var11 = var9x.class_().map(var1xx -> new Gh_1(this, var1xx));
                        if ((Gh_1)this.break_[catch_[197]] == null) {
                           if (var11.isPresent()) {
                              if (((Gh_1)var11.get()).class_().break_().contains((rU_2)this.break_[catch_[198]])) {
                                 this.class_((p_1)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[catch_[199]]);
                                 Gh_1 var19 = (Gh_1)var11.get();
                                 this.break_[catch_[200]] = var19;
                                 this.class_(var1);
                              } else {
                                 this.byte_(throws_[8]);
                              }
                           } else if (var9x.break_() != (PO)PO.staticFields76a2616475a7392d96bc61fb714cace1[catch_[201]]
                              && var9x.break_() != (PO)PO.staticFields76a2616475a7392d96bc61fb714cace1[catch_[202]]) {
                              this.class_((p_1)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[catch_[203]]);
                           }
                        } else if ((Gh_1)this.break_[catch_[204]] == null) {
                           if (var11.isPresent()) {
                              if (((Gh_1)var11.get()).class_().implements_().equals(((Gh_1)this.break_[catch_[205]]).class_().protected_())) {
                                 this.class_((p_1)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[catch_[206]]);
                                 Gh_1 var20 = (Gh_1)var11.get();
                                 this.break_[catch_[207]] = var20;
                              } else {
                                 this.byte_(throws_[9]);
                              }
                           } else {
                              this.class_((p_1)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[catch_[208]]);
                           }
                        } else {
                           this.case_(throws_[10]);
                        }

                        if (var2 && (Gh_1)this.break_[catch_[209]] != null && ((Gh_1)this.break_[catch_[210]]).class_() != null) {
                           if (var4.break_(((Gh_1)this.break_[catch_[211]]).class_().protected_())) {
                              this.byte_(
                                 "Finished finding a path from "
                                    + var1
                                    + " to "
                                    + var4
                                    + ". "
                                    + ((Gh_1)this.break_[catch_[212]]).class_().case_()
                                    + " nodes considered"
                              );
                           } else {
                              this.byte_(
                                 "Found path segment from "
                                    + var1
                                    + " towards "
                                    + var4
                                    + ". "
                                    + ((Gh_1)this.break_[catch_[213]]).class_().case_()
                                    + " nodes considered"
                              );
                           }
                        }

                        synchronized ((Object)this.break_[catch_[214]]) {
                           Object var21 = null;
                           this.break_[catch_[215]] = var21;
                        }
                     }
                  }
               );
         }
      }
   }

   private void class_(p_1 var1) {
      this.while_();
      ((LinkedBlockingQueue)this.break_[17]).add(var1);
   }

   public boolean class_(rn_3 var1) {
      this.while_();
      this.class_((rP_2)var1.class_[0]);
      if (var1 instanceof bR_2) {
         EZ var10 = (EZ)((bR_2)var1).break_[0];
         this.break_[3] = var10;
      } else {
         EZ var11 = new EZ((C_class)this.class_[0], true);
         this.break_[3] = var11;
      }

      if ((rP_2)this.break_[2] == null) {
         return false;
      } else if (((rP_2)this.break_[2]).break_(((Ps_1)this.class_[1]).volatile_())) {
         return false;
      } else {
         synchronized ((Object)this.break_[14]) {
            if ((Gh_1)this.break_[catch_[115]] != null) {
               return implements_[14];
            } else {
               boolean var10000;
               synchronized ((Object)this.break_[catch_[116]]) {
                  if ((EW)this.break_[catch_[117]] != null) {
                     return implements_[15];
                  }

                  this.class_((p_1)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[catch_[118]]);
                  this.class_((rU_2)this.break_[catch_[119]], implements_[16], (EZ)this.break_[catch_[120]]);
                  var10000 = implements_[17];
               }

               return var10000;
            }
         }
      }
   }

   @Override
   public Optional<Double> class_() {
      this.while_();
      rU_2 var1 = ((Ps_1)this.class_[1]).volatile_();
      if ((rP_2)this.break_[2] != null && var1 != null && (rU_2)this.break_[5] != null) {
         if (((rP_2)this.break_[2]).break_(((Ps_1)this.class_[1]).volatile_())) {
            this.interface_();
            return Optional.of(0.0);
         } else if ((Integer)this.break_[4] == 0) {
            return Optional.empty();
         } else {
            double var2 = ((rP_2)this.break_[2]).class_((Integer)var1.break_[0], (Integer)var1.break_[1], (Integer)var1.break_[2]);
            double var4 = ((rP_2)this.break_[2])
               .class_((Integer)((rU_2)this.break_[5]).break_[0], (Integer)((rU_2)this.break_[5]).break_[1], (Integer)((rU_2)this.break_[5]).break_[2]);
            if (var2 == var4) {
               return Optional.empty();
            } else {
               double var6 = Math.abs(var2 - ((rP_2)this.break_[2]).class_()) * (double)((Integer)this.break_[4]).intValue() / Math.abs(var4 - var2);
               return Optional.of(var6);
            }
         }
      } else {
         return Optional.empty();
      }
   }

   private EW class_(rfH_2 var1, rP_2 var2, a_1 var3, EZ var4) {
      Object var5 = var2;
      if ((Boolean)C_class.instanceof_().r.class_[0] && var2 instanceof PZ) {
         rfH_2 var6 = ((PZ)var2).break_();
         if (!((bw_3)var4.break_[4]).class_(var6.b_(), var6.d_())) {
            var5 = new rX_2(var6.b_(), var6.d_());
         }
      }

      bi_3 var10 = new bi_3(var4.break_().throw_(), var3, var4);
      rU_2 var7 = ((Ps_1)this.class_[1]).volatile_();
      rU_2 var8 = new rU_2(var1);
      rfH_2 var9 = var7.byte_(var8);
      if (var7.c_() == var8.c_() && Math.abs(var9.b_()) <= 1 && Math.abs(var9.d_()) <= 1) {
         var8 = var7;
      }

      return new Ek_1(var8, var1.b_(), var1.c_(), var1.d_(), (rP_2)var5, var10, var4);
   }

   @Override
   public boolean break_() {
      boolean var1 = this.else_();
      if (var1) {
         this.throw_();
      }

      ((C_class)this.class_[0]).void_().case_();
      return var1;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{88, -20, 47, 50, -20, 50, 124, -113}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public boolean catch_() {
      this.while_();
      return this.finally_() && !this.break_[9] ? true : implements_[19];
   }

   private void goto_() {
      this.while_();
      ArrayList var1 = new ArrayList();
      ((LinkedBlockingQueue)this.break_[17]).drainTo(var1);
      Boolean var6 = var1.contains((p_1)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[2]);
      this.break_[11] = var6;
   }

   @Override
   public Optional<EW> case_() {
      this.while_();
      return Optional.ofNullable((EW)this.break_[12]);
   }

   public EZ continue_() {
      this.while_();
      return (EZ)this.break_[3];
   }

   public boolean else_() {
      this.while_();
      return (Gh_1)this.break_[0] != null && !this.break_[6] ? implements_[21] : implements_[20];
   }

   private static void instanceof_() {
      catch_ = new short[]{
         13,
         14,
         17,
         17,
         17,
         2,
         11,
         1,
         0,
         16,
         0,
         4,
         4,
         0,
         9,
         7,
         6,
         7,
         8,
         0,
         0,
         8,
         9,
         8,
         10,
         10,
         0,
         14,
         13,
         12,
         12,
         12,
         0,
         0,
         1,
         16,
         1,
         16,
         12,
         0,
         0,
         6,
         0,
         0,
         0,
         2,
         2,
         1,
         2,
         7,
         1,
         0,
         1,
         1,
         1,
         1,
         1,
         16,
         10,
         1,
         1,
         5,
         1,
         0,
         1,
         0,
         13,
         12,
         8,
         0,
         16,
         3,
         6,
         1,
         1,
         6,
         1,
         0,
         1,
         0,
         0,
         0,
         1,
         0,
         1,
         0,
         1,
         1,
         13,
         12,
         1,
         2,
         2,
         0,
         0,
         3,
         0,
         3,
         0,
         0,
         20,
         15,
         20,
         20,
         15,
         2,
         0,
         0,
         3,
         0,
         3,
         2,
         2,
         1,
         14,
         0,
         13,
         12,
         0,
         16,
         3,
         2,
         9,
         0,
         1,
         12,
         0,
         6,
         7,
         0,
         11,
         14,
         0,
         1,
         10,
         11,
         14,
         0,
         0,
         1,
         0,
         0,
         13,
         12,
         3,
         1,
         2,
         5,
         2,
         1,
         4,
         2,
         0,
         1,
         2,
         2,
         5,
         0,
         5,
         1,
         5,
         2,
         2,
         4,
         16,
         4,
         5,
         1,
         1,
         1,
         1,
         1,
         0,
         1,
         2,
         0,
         2,
         1,
         1,
         1,
         1,
         13,
         12,
         0,
         2,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         12,
         0,
         4,
         1,
         14,
         0,
         16,
         1,
         0,
         3,
         4,
         2,
         1,
         0,
         4,
         1,
         9,
         0,
         0,
         0,
         0,
         0,
         13,
         12,
         0,
         0,
         2,
         2
      };
   }

   public Gh_1 new_() {
      this.while_();
      return (Gh_1)this.break_[0];
   }

   public Gh_1 package_() {
      this.while_();
      return (Gh_1)this.break_[1];
   }

   private static void return_() {
      implements_ = new boolean[]{
         true,
         false,
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
         true,
         true,
         false,
         true,
         false,
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
         false
      };
   }

   public rU_2 super_() {
      rU_2 var1 = ((Ps_1)this.class_[1]).volatile_();
      if (!EF.break_((Ps_1)this.class_[1], var1.case_())) {
         if (((Ps_1)this.class_[1]).catch_().BL()) {
            double var2 = ((Ps_1)this.class_[1]).catch_().Ps().break_;
            double var4 = ((Ps_1)this.class_[1]).catch_().Ps().protected_;
            ArrayList var6 = new ArrayList();

            for (int var7 = -1; var7 <= 1; var7++) {
               for (int var8 = -1; var8 <= 1; var8++) {
                  var6.add(new rU_2((Integer)var1.break_[0] + var7, (Integer)var1.break_[1], (Integer)var1.break_[2] + var8));
               }
            }

            var6.sort(
               Comparator.comparingDouble(
                  var4x -> ((double)((Integer)var4x.break_[0]).intValue() + 0.5 - var2) * ((double)((Integer)var4x.break_[0]).intValue() + 0.5 - var2)
                        + ((double)((Integer)var4x.break_[2]).intValue() + 0.5 - var4) * ((double)((Integer)var4x.break_[2]).intValue() + 0.5 - var4)
               )
            );

            for (int var13 = 0; var13 < 4; var13++) {
               rU_2 var14 = (rU_2)var6.get(var13);
               double var9 = Math.abs((double)((Integer)var14.break_[0]).intValue() + 0.5 - var2);
               double var11 = Math.abs((double)((Integer)var14.break_[2]).intValue() + 0.5 - var4);
               if ((!(var9 > 0.8) || !(var11 > 0.8))
                  && EF.break_((Ps_1)this.class_[1], var14.case_())
                  && EF.class_((Ps_1)this.class_[1], var14)
                  && EF.class_((Ps_1)this.class_[1], var14.class_())) {
                  return var14;
               }
            }
         } else if (EF.break_((Ps_1)this.class_[1], var1.case_().case_())) {
            return var1.case_();
         }
      }

      return var1;
   }

   private void throw_() {
      this.while_();
      this.class_((p_1)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[11]);
      synchronized ((Object)this.break_[14]) {
         this.case_().ifPresent(EW::catch_);
         if ((Gh_1)this.break_[catch_[137]] != null) {
            Object var7 = null;
            this.break_[catch_[138]] = var7;
            Object var8 = null;
            this.break_[catch_[139]] = var8;
            ((C_class)this.class_[catch_[140]]).int_().class_();
            ((C_class)this.class_[catch_[141]]).int_().break_().class_();
         }
      }
   }

   private static void try_() {
      private_ = new double[]{0.0, 0.5, 0.5, 0.8, 0.8, 0.5, 0.5, 0.5, 0.5};
   }

   private void while_() {
      if (this.break_ == null) {
         this.break_ = new Object[18];
         Object[] var1 = this.break_;
         var1[4] = 0;
         var1[6] = false;
         var1[7] = false;
         var1[8] = false;
         var1[9] = false;
         var1[10] = false;
         var1[11] = false;
         var1[15] = false;
      }
   }

   private void public_() {
      this.while_();
      Boolean var13 = false;
      this.break_[9] = var13;
      if ((Boolean)this.break_[7] && (Boolean)this.break_[6]) {
         Boolean var14 = false;
         this.break_[7] = var14;
         if ((Boolean)this.break_[8]) {
            ((C_class)this.class_[0]).int_().class_();
            ((C_class)this.class_[0]).int_().break_().class_();
         }

         Boolean var15 = false;
         this.break_[8] = var15;
         Boolean var16 = true;
         this.break_[9] = var16;
      } else {
         Boolean var17 = true;
         this.break_[8] = var17;
         if ((Boolean)this.break_[10]) {
            Boolean var18 = false;
            this.break_[10] = var18;
            ((C_class)this.class_[0]).int_().class_();
         }

         synchronized ((Object)this.break_[14]) {
            synchronized ((Object)this.break_[catch_[28]]) {
               if ((EW)this.break_[catch_[29]] != null) {
                  rU_2 var3 = ((EW)this.break_[catch_[30]]).case_();
                  Optional var4 = ((EW)this.break_[catch_[31]]).class_();
                  if (((Gh_1)this.break_[catch_[32]] == null || !((Gh_1)this.break_[catch_[33]]).class_().protected_().equals(var3))
                     && !var3.equals(((Ps_1)this.class_[catch_[34]]).volatile_())
                     && !var3.equals((rU_2)this.break_[catch_[35]])
                     && (
                        !var4.isPresent()
                           || !((a_1)var4.get()).break_().contains(((Ps_1)this.class_[catch_[36]]).volatile_())
                              && !((a_1)var4.get()).break_().contains((rU_2)this.break_[catch_[37]])
                     )) {
                     ((EW)this.break_[catch_[38]]).catch_();
                  }
               }
            }

            if ((Gh_1)this.break_[catch_[39]] != null) {
               Boolean var19 = ((Gh_1)this.break_[catch_[40]]).throws_();
               this.break_[catch_[41]] = var19;
               if (((Gh_1)this.break_[catch_[42]]).private_() || ((Gh_1)this.break_[catch_[43]]).protected_()) {
                  Object var20 = null;
                  this.break_[catch_[44]] = var20;
                  if ((rP_2)this.break_[catch_[45]] != null && !((rP_2)this.break_[catch_[46]]).break_(((Ps_1)this.class_[catch_[47]]).volatile_())) {
                     if ((Gh_1)this.break_[catch_[53]] != null
                        && !((Gh_1)this.break_[catch_[54]]).class_().break_().contains(((Ps_1)this.class_[catch_[55]]).volatile_())
                        && !((Gh_1)this.break_[catch_[56]]).class_().break_().contains((rU_2)this.break_[catch_[57]])) {
                        this.byte_(throws_[0]);
                        this.class_((p_1)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[catch_[58]]);
                        Object var22 = null;
                        this.break_[catch_[59]] = var22;
                     }

                     if ((Gh_1)this.break_[catch_[60]] != null) {
                        this.byte_(throws_[1]);
                        this.class_((p_1)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[catch_[61]]);
                        Gh_1 var23 = (Gh_1)this.break_[catch_[62]];
                        this.break_[catch_[63]] = var23;
                        Object var24 = null;
                        this.break_[catch_[64]] = var24;
                        ((Gh_1)this.break_[catch_[65]]).throws_();
                     } else {
                        synchronized ((Object)this.break_[catch_[66]]) {
                           if ((EW)this.break_[catch_[67]] != null) {
                              this.class_((p_1)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[catch_[68]]);
                              return;
                           }

                           this.class_((p_1)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[catch_[69]]);
                           this.class_((rU_2)this.break_[catch_[70]], implements_[7], (EZ)this.break_[catch_[71]]);
                        }
                     }
                  } else {
                     this.byte_("All done. At " + (rP_2)this.break_[catch_[48]]);
                     this.class_((p_1)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[catch_[49]]);
                     Object var21 = null;
                     this.break_[catch_[50]] = var21;
                     if ((Boolean)C_class.instanceof_().char_.class_[catch_[51]]) {
                        ((Ps_1)this.class_[catch_[52]]).case_().catch_();
                     }
                  }
               } else if ((Boolean)this.break_[catch_[72]] && (Gh_1)this.break_[catch_[73]] != null && ((Gh_1)this.break_[catch_[74]]).implements_()) {
                  this.byte_(throws_[2]);
                  this.class_((p_1)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[catch_[75]]);
                  Gh_1 var25 = (Gh_1)this.break_[catch_[76]];
                  this.break_[catch_[77]] = var25;
                  Object var26 = null;
                  this.break_[catch_[78]] = var26;
                  ((Gh_1)this.break_[catch_[79]]).throws_();
               } else {
                  if ((Boolean)C_class.instanceof_().PI.class_[catch_[80]]) {
                     Gh_1 var27 = ((Gh_1)this.break_[catch_[81]]).class_((Gh_1)this.break_[catch_[82]]);
                     this.break_[catch_[83]] = var27;
                  }

                  if ((Gh_1)this.break_[catch_[84]] != null
                     && ((Gh_1)this.break_[catch_[85]]).class_().protected_().equals(((Gh_1)this.break_[catch_[86]]).class_().protected_())) {
                     Object var28 = null;
                     this.break_[catch_[87]] = var28;
                  }

                  synchronized ((Object)this.break_[catch_[88]]) {
                     if ((EW)this.break_[catch_[89]] != null) {
                        return;
                     }

                     if ((Gh_1)this.break_[catch_[90]] != null) {
                        return;
                     }

                     if ((rP_2)this.break_[catch_[91]] == null || ((rP_2)this.break_[catch_[92]]).break_(((Gh_1)this.break_[catch_[93]]).class_().protected_())
                        )
                      {
                        return;
                     }

                     if (this.class_(implements_[8]).get() < (double)((Integer)C_class.instanceof_().H.class_[catch_[94]]).intValue()) {
                        this.byte_(throws_[3]);
                        this.class_((p_1)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[catch_[95]]);
                        this.class_(((Gh_1)this.break_[catch_[96]]).class_().protected_(), implements_[9], (EZ)this.break_[catch_[97]]);
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public void private_() {
      this.while_();
      this.break_();
      this.throw_();
      synchronized ((Object)this.break_[13]) {
         Object var7 = null;
         this.break_[catch_[143]] = var7;
      }
   }

   private static void abstract_() {
      case_ = new byte[]{-1, -1, 4, 18, 4, 6, 7, 8, 9, 10, 11, 15};
   }

   public void final_() {
      this.while_();
      Boolean var5 = true;
      this.break_[7] = var5;
   }

   public boolean synchronized_() {
      if (this.else_()) {
         this.throw_();
         return true;
      } else {
         return implements_[24];
      }
   }
}

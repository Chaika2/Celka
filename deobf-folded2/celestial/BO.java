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
   private static String[] id_throws;
   private static byte[] id_case;
   public Object[] id_break;
   private static short[] id_catch;
   private static double[] id_private;
   private static boolean[] id_implements;

   private static void id_char() {
      id_throws = new String[]{
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
   public rP_2 id_byte() {
      this.id_while();
      return (rP_2)this.id_break[2];
   }

   public boolean id_int() {
      this.id_while();
      return (Boolean)this.id_break[11];
   }

   public BO(C_class var1) {
      super(var1);
      this.id_while();
      Object var6 = new Object();
      this.id_break[13] = var6;
      Object var7 = new Object();
      this.id_break[14] = var7;
      LinkedBlockingQueue var8 = new LinkedBlockingQueue();
      this.id_break[17] = var8;
   }

   static {
      ntfClinit();
   }

   public void id_this() {
      this.id_while();
      synchronized ((Object)this.id_break[14]) {
         this.id_case().ifPresent(EW::id_catch);
         if (!this.id_else()) {
            return;
         }

         Object var7 = null;
         this.id_break[id_catch[132]] = var7;
         Object var8 = null;
         this.id_break[id_catch[133]] = var8;
      }

      Boolean var9 = true;
      this.id_break[10] = var9;
   }

   private void id_interface() {
      this.id_while();
      this.id_class((rU_2)this.id_break[16]);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5987297784449817445L;
   }

   private void id_class(rU_2 var1) {
      this.id_while();
      Integer var6 = 0;
      this.id_break[4] = var6;
      this.id_break[5] = var1;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -939245588;
   }

   public void id_class(rP_2 var1) {
      this.id_while();
      this.id_break[2] = var1;
   }

   private void id_class(rfH_2 var1) {
      this.id_class(new rU_2(var1));
   }

   @Override
   public void id_class(q_1 var1) {
      this.id_while();
      if ((Gh_1)this.id_break[0] != null) {
         switch (((int[])Bh_1.id_class[0])[var1.id_class().ordinal()]) {
            case 1:
               Boolean var6 = ((Qw_1)b_.id_class[20]).id_static;
               this.id_break[15] = var6;
               ((Qw_1)b_.id_class[20]).id_static = false;
               break;
            case 2:
               ((Qw_1)b_.id_class[20]).id_static = (Boolean)this.id_break[15];
         }
      }
   }

   @Override
   public void id_class(I var1) {
      this.id_while();
      if (this.id_catch()) {
         var1.id_class(((Gh_1)this.id_break[0]).id_byte());
      }
   }

   @Override
   public void id_class(T var1) {
      bg_3.id_class(var1, this);
   }

   @Override
   public void id_class(j_1 var1) {
      this.id_while();
      this.id_goto();
      if (var1.id_class() == (V)V.staticFields30e1cd8580ce39faa61be3646b7cc079[1]) {
         this.id_throw();
         ((C_class)this.id_class[0]).id_void().id_case();
      } else {
         rU_2 var6 = this.id_super();
         this.id_break[16] = var6;
         ((C_class)this.id_class[0]).id_void().id_catch();
         this.id_public();
         Integer var7 = (Integer)this.id_break[4] + 1;
         this.id_break[4] = var7;
         this.id_goto();
      }
   }

   private void id_class(rfH_2 var1, boolean var2, EZ var3) {
      this.id_while();
      if (!Thread.holdsLock(this.id_break[13])) {
         throw new IllegalStateException("Must be called with synchronization on pathCalcLock");
      } else if ((EW)this.id_break[12] != null) {
         throw new IllegalStateException("Already doing it");
      } else if (!(Boolean)var3.id_break[0]) {
         throw new IllegalStateException("Improper context thread safety level");
      } else {
         rP_2 var4 = (rP_2)this.id_break[2];
         if (var4 == null) {
            this.id_byte("no goal");
         } else {
            long var5;
            long var7;
            if ((Gh_1)this.id_break[0] == null) {
               var5 = (Long)C_class.id_instanceof().rh.id_class[0];
               var7 = (Long)C_class.id_instanceof().PH.id_class[0];
            } else {
               var5 = (Long)C_class.id_instanceof().w.id_class[0];
               var7 = (Long)C_class.id_instanceof().rL.id_class[0];
            }

            EW var9 = this.id_class(var1, var4, (Gh_1)this.id_break[0] == null ? null : ((Gh_1)this.id_break[0]).id_class(), var3);
            if (!Objects.equals(var9.id_break(), var4)) {
               this.id_byte("Simplifying " + var4.getClass() + " to GoalXZ due to distance");
            }

            this.id_break[12] = var9;
            C_class.id_interface()
               .execute(
                  () -> {
                     this.id_while();
                     if (var2) {
                        this.id_byte("Starting to search for path from " + var1 + " to " + var4);
                     }

                     PM var9x = var9.id_class(var5, var7);
                     synchronized ((Object)this.id_break[14]) {
                        Optional var11 = var9x.id_class().map(var1xx -> new Gh_1(this, var1xx));
                        if ((Gh_1)this.id_break[id_catch[197]] == null) {
                           if (var11.isPresent()) {
                              if (((Gh_1)var11.get()).id_class().id_break().contains((rU_2)this.id_break[id_catch[198]])) {
                                 this.id_class((p_1)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[id_catch[199]]);
                                 Gh_1 var19 = (Gh_1)var11.get();
                                 this.id_break[id_catch[200]] = var19;
                                 this.id_class(var1);
                              } else {
                                 this.id_byte(id_throws[8]);
                              }
                           } else if (var9x.id_break() != (PO)PO.staticFields76a2616475a7392d96bc61fb714cace1[id_catch[201]]
                              && var9x.id_break() != (PO)PO.staticFields76a2616475a7392d96bc61fb714cace1[id_catch[202]]) {
                              this.id_class((p_1)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[id_catch[203]]);
                           }
                        } else if ((Gh_1)this.id_break[id_catch[204]] == null) {
                           if (var11.isPresent()) {
                              if (((Gh_1)var11.get()).id_class().id_implements().equals(((Gh_1)this.id_break[id_catch[205]]).id_class().id_protected())) {
                                 this.id_class((p_1)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[id_catch[206]]);
                                 Gh_1 var20 = (Gh_1)var11.get();
                                 this.id_break[id_catch[207]] = var20;
                              } else {
                                 this.id_byte(id_throws[9]);
                              }
                           } else {
                              this.id_class((p_1)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[id_catch[208]]);
                           }
                        } else {
                           this.id_case(id_throws[10]);
                        }

                        if (var2 && (Gh_1)this.id_break[id_catch[209]] != null && ((Gh_1)this.id_break[id_catch[210]]).id_class() != null) {
                           if (var4.id_break(((Gh_1)this.id_break[id_catch[211]]).id_class().id_protected())) {
                              this.id_byte(
                                 "Finished finding a path from "
                                    + var1
                                    + " to "
                                    + var4
                                    + ". "
                                    + ((Gh_1)this.id_break[id_catch[212]]).id_class().id_case()
                                    + " nodes considered"
                              );
                           } else {
                              this.id_byte(
                                 "Found path segment from "
                                    + var1
                                    + " towards "
                                    + var4
                                    + ". "
                                    + ((Gh_1)this.id_break[id_catch[213]]).id_class().id_case()
                                    + " nodes considered"
                              );
                           }
                        }

                        synchronized ((Object)this.id_break[id_catch[214]]) {
                           Object var21 = null;
                           this.id_break[id_catch[215]] = var21;
                        }
                     }
                  }
               );
         }
      }
   }

   private void id_class(p_1 var1) {
      this.id_while();
      ((LinkedBlockingQueue)this.id_break[17]).add(var1);
   }

   public boolean id_class(rn_3 var1) {
      this.id_while();
      this.id_class((rP_2)var1.id_class[0]);
      if (var1 instanceof bR_2) {
         EZ var10 = (EZ)((bR_2)var1).id_break[0];
         this.id_break[3] = var10;
      } else {
         EZ var11 = new EZ((C_class)this.id_class[0], true);
         this.id_break[3] = var11;
      }

      if ((rP_2)this.id_break[2] == null) {
         return false;
      } else if (((rP_2)this.id_break[2]).id_break(((Ps_1)this.id_class[1]).id_volatile())) {
         return false;
      } else {
         synchronized ((Object)this.id_break[14]) {
            if ((Gh_1)this.id_break[id_catch[115]] != null) {
               return id_implements[14];
            } else {
               boolean var10000;
               synchronized ((Object)this.id_break[id_catch[116]]) {
                  if ((EW)this.id_break[id_catch[117]] != null) {
                     return id_implements[15];
                  }

                  this.id_class((p_1)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[id_catch[118]]);
                  this.id_class((rU_2)this.id_break[id_catch[119]], id_implements[16], (EZ)this.id_break[id_catch[120]]);
                  var10000 = id_implements[17];
               }

               return var10000;
            }
         }
      }
   }

   @Override
   public Optional<Double> id_class() {
      this.id_while();
      rU_2 var1 = ((Ps_1)this.id_class[1]).id_volatile();
      if ((rP_2)this.id_break[2] != null && var1 != null && (rU_2)this.id_break[5] != null) {
         if (((rP_2)this.id_break[2]).id_break(((Ps_1)this.id_class[1]).id_volatile())) {
            this.id_interface();
            return Optional.of(0.0);
         } else if ((Integer)this.id_break[4] == 0) {
            return Optional.empty();
         } else {
            double var2 = ((rP_2)this.id_break[2]).id_class((Integer)var1.id_break[0], (Integer)var1.id_break[1], (Integer)var1.id_break[2]);
            double var4 = ((rP_2)this.id_break[2])
               .id_class(
                  (Integer)((rU_2)this.id_break[5]).id_break[0], (Integer)((rU_2)this.id_break[5]).id_break[1], (Integer)((rU_2)this.id_break[5]).id_break[2]
               );
            if (var2 == var4) {
               return Optional.empty();
            } else {
               double var6 = Math.abs(var2 - ((rP_2)this.id_break[2]).id_class()) * (double)((Integer)this.id_break[4]).intValue() / Math.abs(var4 - var2);
               return Optional.of(var6);
            }
         }
      } else {
         return Optional.empty();
      }
   }

   private EW id_class(rfH_2 var1, rP_2 var2, a_1 var3, EZ var4) {
      Object var5 = var2;
      if ((Boolean)C_class.id_instanceof().r.id_class[0] && var2 instanceof PZ) {
         rfH_2 var6 = ((PZ)var2).id_break();
         if (!((bw_3)var4.id_break[4]).id_class(var6.b_(), var6.d_())) {
            var5 = new rX_2(var6.b_(), var6.d_());
         }
      }

      bi_3 var10 = new bi_3(var4.id_break().id_throw(), var3, var4);
      rU_2 var7 = ((Ps_1)this.id_class[1]).id_volatile();
      rU_2 var8 = new rU_2(var1);
      rfH_2 var9 = var7.id_byte(var8);
      if (var7.c_() == var8.c_() && Math.abs(var9.b_()) <= 1 && Math.abs(var9.d_()) <= 1) {
         var8 = var7;
      }

      return new Ek_1(var8, var1.b_(), var1.c_(), var1.d_(), (rP_2)var5, var10, var4);
   }

   @Override
   public boolean id_break() {
      boolean var1 = this.id_else();
      if (var1) {
         this.id_throw();
      }

      ((C_class)this.id_class[0]).id_void().id_case();
      return var1;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{88, -20, 47, 50, -20, 50, 124, -113}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public boolean id_catch() {
      this.id_while();
      return this.id_finally() && !this.id_break[9] ? true : id_implements[19];
   }

   private void id_goto() {
      this.id_while();
      ArrayList var1 = new ArrayList();
      ((LinkedBlockingQueue)this.id_break[17]).drainTo(var1);
      Boolean var6 = var1.contains((p_1)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[2]);
      this.id_break[11] = var6;
   }

   @Override
   public Optional<EW> id_case() {
      this.id_while();
      return Optional.ofNullable((EW)this.id_break[12]);
   }

   public EZ id_continue() {
      this.id_while();
      return (EZ)this.id_break[3];
   }

   public boolean id_else() {
      this.id_while();
      return (Gh_1)this.id_break[0] != null && !this.id_break[6] ? id_implements[21] : id_implements[20];
   }

   private static void id_instanceof() {
      id_catch = new short[]{
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

   public Gh_1 id_new() {
      this.id_while();
      return (Gh_1)this.id_break[0];
   }

   public Gh_1 id_package() {
      this.id_while();
      return (Gh_1)this.id_break[1];
   }

   private static void id_return() {
      id_implements = new boolean[]{
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

   public rU_2 id_super() {
      rU_2 var1 = ((Ps_1)this.id_class[1]).id_volatile();
      if (!EF.id_break((Ps_1)this.id_class[1], var1.id_case())) {
         if (((Ps_1)this.id_class[1]).id_catch().BL()) {
            double var2 = ((Ps_1)this.id_class[1]).id_catch().Ps().id_break;
            double var4 = ((Ps_1)this.id_class[1]).id_catch().Ps().id_protected;
            ArrayList var6 = new ArrayList();

            for (int var7 = -1; var7 <= 1; var7++) {
               for (int var8 = -1; var8 <= 1; var8++) {
                  var6.add(new rU_2((Integer)var1.id_break[0] + var7, (Integer)var1.id_break[1], (Integer)var1.id_break[2] + var8));
               }
            }

            var6.sort(
               Comparator.comparingDouble(
                  var4x -> ((double)((Integer)var4x.id_break[0]).intValue() + 0.5 - var2) * ((double)((Integer)var4x.id_break[0]).intValue() + 0.5 - var2)
                        + ((double)((Integer)var4x.id_break[2]).intValue() + 0.5 - var4) * ((double)((Integer)var4x.id_break[2]).intValue() + 0.5 - var4)
               )
            );

            for (int var13 = 0; var13 < 4; var13++) {
               rU_2 var14 = (rU_2)var6.get(var13);
               double var9 = Math.abs((double)((Integer)var14.id_break[0]).intValue() + 0.5 - var2);
               double var11 = Math.abs((double)((Integer)var14.id_break[2]).intValue() + 0.5 - var4);
               if ((!(var9 > 0.8) || !(var11 > 0.8))
                  && EF.id_break((Ps_1)this.id_class[1], var14.id_case())
                  && EF.id_class((Ps_1)this.id_class[1], var14)
                  && EF.id_class((Ps_1)this.id_class[1], var14.id_class())) {
                  return var14;
               }
            }
         } else if (EF.id_break((Ps_1)this.id_class[1], var1.id_case().id_case())) {
            return var1.id_case();
         }
      }

      return var1;
   }

   private void id_throw() {
      this.id_while();
      this.id_class((p_1)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[11]);
      synchronized ((Object)this.id_break[14]) {
         this.id_case().ifPresent(EW::id_catch);
         if ((Gh_1)this.id_break[id_catch[137]] != null) {
            Object var7 = null;
            this.id_break[id_catch[138]] = var7;
            Object var8 = null;
            this.id_break[id_catch[139]] = var8;
            ((C_class)this.id_class[id_catch[140]]).id_int().id_class();
            ((C_class)this.id_class[id_catch[141]]).id_int().id_break().id_class();
         }
      }
   }

   private static void id_try() {
      id_private = new double[]{0.0, 0.5, 0.5, 0.8, 0.8, 0.5, 0.5, 0.5, 0.5};
   }

   private void id_while() {
      if (this.id_break == null) {
         this.id_break = new Object[18];
         Object[] var1 = this.id_break;
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

   private void id_public() {
      this.id_while();
      Boolean var13 = false;
      this.id_break[9] = var13;
      if ((Boolean)this.id_break[7] && (Boolean)this.id_break[6]) {
         Boolean var14 = false;
         this.id_break[7] = var14;
         if ((Boolean)this.id_break[8]) {
            ((C_class)this.id_class[0]).id_int().id_class();
            ((C_class)this.id_class[0]).id_int().id_break().id_class();
         }

         Boolean var15 = false;
         this.id_break[8] = var15;
         Boolean var16 = true;
         this.id_break[9] = var16;
      } else {
         Boolean var17 = true;
         this.id_break[8] = var17;
         if ((Boolean)this.id_break[10]) {
            Boolean var18 = false;
            this.id_break[10] = var18;
            ((C_class)this.id_class[0]).id_int().id_class();
         }

         synchronized ((Object)this.id_break[14]) {
            synchronized ((Object)this.id_break[id_catch[28]]) {
               if ((EW)this.id_break[id_catch[29]] != null) {
                  rU_2 var3 = ((EW)this.id_break[id_catch[30]]).id_case();
                  Optional var4 = ((EW)this.id_break[id_catch[31]]).id_class();
                  if (((Gh_1)this.id_break[id_catch[32]] == null || !((Gh_1)this.id_break[id_catch[33]]).id_class().id_protected().equals(var3))
                     && !var3.equals(((Ps_1)this.id_class[id_catch[34]]).id_volatile())
                     && !var3.equals((rU_2)this.id_break[id_catch[35]])
                     && (
                        !var4.isPresent()
                           || !((a_1)var4.get()).id_break().contains(((Ps_1)this.id_class[id_catch[36]]).id_volatile())
                              && !((a_1)var4.get()).id_break().contains((rU_2)this.id_break[id_catch[37]])
                     )) {
                     ((EW)this.id_break[id_catch[38]]).id_catch();
                  }
               }
            }

            if ((Gh_1)this.id_break[id_catch[39]] != null) {
               Boolean var19 = ((Gh_1)this.id_break[id_catch[40]]).id_throws();
               this.id_break[id_catch[41]] = var19;
               if (((Gh_1)this.id_break[id_catch[42]]).id_private() || ((Gh_1)this.id_break[id_catch[43]]).id_protected()) {
                  Object var20 = null;
                  this.id_break[id_catch[44]] = var20;
                  if ((rP_2)this.id_break[id_catch[45]] != null
                     && !((rP_2)this.id_break[id_catch[46]]).id_break(((Ps_1)this.id_class[id_catch[47]]).id_volatile())) {
                     if ((Gh_1)this.id_break[id_catch[53]] != null
                        && !((Gh_1)this.id_break[id_catch[54]]).id_class().id_break().contains(((Ps_1)this.id_class[id_catch[55]]).id_volatile())
                        && !((Gh_1)this.id_break[id_catch[56]]).id_class().id_break().contains((rU_2)this.id_break[id_catch[57]])) {
                        this.id_byte(id_throws[0]);
                        this.id_class((p_1)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[id_catch[58]]);
                        Object var22 = null;
                        this.id_break[id_catch[59]] = var22;
                     }

                     if ((Gh_1)this.id_break[id_catch[60]] != null) {
                        this.id_byte(id_throws[1]);
                        this.id_class((p_1)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[id_catch[61]]);
                        Gh_1 var23 = (Gh_1)this.id_break[id_catch[62]];
                        this.id_break[id_catch[63]] = var23;
                        Object var24 = null;
                        this.id_break[id_catch[64]] = var24;
                        ((Gh_1)this.id_break[id_catch[65]]).id_throws();
                     } else {
                        synchronized ((Object)this.id_break[id_catch[66]]) {
                           if ((EW)this.id_break[id_catch[67]] != null) {
                              this.id_class((p_1)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[id_catch[68]]);
                              return;
                           }

                           this.id_class((p_1)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[id_catch[69]]);
                           this.id_class((rU_2)this.id_break[id_catch[70]], id_implements[7], (EZ)this.id_break[id_catch[71]]);
                        }
                     }
                  } else {
                     this.id_byte("All done. At " + (rP_2)this.id_break[id_catch[48]]);
                     this.id_class((p_1)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[id_catch[49]]);
                     Object var21 = null;
                     this.id_break[id_catch[50]] = var21;
                     if ((Boolean)C_class.id_instanceof().id_char.id_class[id_catch[51]]) {
                        ((Ps_1)this.id_class[id_catch[52]]).id_case().id_catch();
                     }
                  }
               } else if ((Boolean)this.id_break[id_catch[72]]
                  && (Gh_1)this.id_break[id_catch[73]] != null
                  && ((Gh_1)this.id_break[id_catch[74]]).id_implements()) {
                  this.id_byte(id_throws[2]);
                  this.id_class((p_1)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[id_catch[75]]);
                  Gh_1 var25 = (Gh_1)this.id_break[id_catch[76]];
                  this.id_break[id_catch[77]] = var25;
                  Object var26 = null;
                  this.id_break[id_catch[78]] = var26;
                  ((Gh_1)this.id_break[id_catch[79]]).id_throws();
               } else {
                  if ((Boolean)C_class.id_instanceof().PI.id_class[id_catch[80]]) {
                     Gh_1 var27 = ((Gh_1)this.id_break[id_catch[81]]).id_class((Gh_1)this.id_break[id_catch[82]]);
                     this.id_break[id_catch[83]] = var27;
                  }

                  if ((Gh_1)this.id_break[id_catch[84]] != null
                     && ((Gh_1)this.id_break[id_catch[85]]).id_class().id_protected().equals(((Gh_1)this.id_break[id_catch[86]]).id_class().id_protected())) {
                     Object var28 = null;
                     this.id_break[id_catch[87]] = var28;
                  }

                  synchronized ((Object)this.id_break[id_catch[88]]) {
                     if ((EW)this.id_break[id_catch[89]] != null) {
                        return;
                     }

                     if ((Gh_1)this.id_break[id_catch[90]] != null) {
                        return;
                     }

                     if ((rP_2)this.id_break[id_catch[91]] == null
                        || ((rP_2)this.id_break[id_catch[92]]).id_break(((Gh_1)this.id_break[id_catch[93]]).id_class().id_protected())) {
                        return;
                     }

                     if (this.id_class(id_implements[8]).get() < (double)((Integer)C_class.id_instanceof().H.id_class[id_catch[94]]).intValue()) {
                        this.id_byte(id_throws[3]);
                        this.id_class((p_1)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[id_catch[95]]);
                        this.id_class(((Gh_1)this.id_break[id_catch[96]]).id_class().id_protected(), id_implements[9], (EZ)this.id_break[id_catch[97]]);
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public void id_private() {
      this.id_while();
      this.id_break();
      this.id_throw();
      synchronized ((Object)this.id_break[13]) {
         Object var7 = null;
         this.id_break[id_catch[143]] = var7;
      }
   }

   private static void id_abstract() {
      id_case = new byte[]{-1, -1, 4, 18, 4, 6, 7, 8, 9, 10, 11, 15};
   }

   public void id_final() {
      this.id_while();
      Boolean var5 = true;
      this.id_break[7] = var5;
   }

   public boolean id_synchronized() {
      if (this.id_else()) {
         this.id_throw();
         return true;
      } else {
         return id_implements[24];
      }
   }
}

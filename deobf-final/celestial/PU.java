package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PU extends Pv_1 implements PP {
   private static double[] throws_;
   private static String[] case_;
   private static byte[] catch_;
   public Object[] break_;
   private static short[] private_;
   private static boolean[] implements_;

   private static void byte_() {
      private_ = new short[]{
         0,
         1,
         1,
         4,
         1,
         3,
         0,
         0,
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
         1,
         1,
         3,
         0,
         1,
         1,
         1,
         0,
         1,
         1,
         0,
         0,
         0,
         0,
         0,
         34,
         0,
         0,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1
      };
   }

   public PU(C_class var1) {
      super(var1);
      this.protected_();
   }

   static {
      ntfClinit();
   }

   public OptionalInt class_(Predicate<Integer> var1) {
      ArrayList var2 = new ArrayList();

      for (int var3 = 1; var3 < 8; var3++) {
         if (((rhz_3)((Ps_1)this.class_[1]).catch_().implements_[1]).class_.get(var3).class_() && !var1.test(var3)) {
            var2.add(var3);
         }
      }

      if (var2.isEmpty()) {
         for (int var4 = 1; var4 < 8; var4++) {
            if (!var1.test(var4)) {
               var2.add(var4);
            }
         }
      }

      return var2.isEmpty() ? OptionalInt.empty() : OptionalInt.of((Integer)var2.get(new Random().nextInt(var2.size())));
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7669350632924944642L;
   }

   private int class_(xd_3 var1, Class<? extends rkQ_2> var2) {
      rqs_3 var3 = ((rhz_3)((Ps_1)this.class_[1]).catch_().implements_[1]).class_;
      int var4 = -1;
      double var5 = -1.0;

      for (int var7 = 0; var7 < var3.size(); var7++) {
         rdn_3 var8 = (rdn_3)var3.get(var7);
         if (!var8.class_()
            && (
               !(Boolean)C_class.instanceof_().Br.class_[0]
                  || var8.catch_() + (Integer)C_class.instanceof_().V.class_[0] < var8.private_()
                  || var8.private_() <= 1
            )
            && var2.isInstance(var8.break_())) {
            double var9 = bU_2.class_(var8, var1.continue_());
            if (var9 > var5) {
               var5 = var9;
               var4 = var7;
            }
         }
      }

      return var4;
   }

   @Override
   public void class_(j_1 var1) {
      this.protected_();
      if ((Boolean)C_class.instanceof_().z.class_[0]) {
         if (var1.class_() != (V)V.staticFields30e1cd8580ce39faa61be3646b7cc079[1]) {
            if ((rJr_1)((Ps_1)this.class_[1]).catch_().implements_[4] == (rJT)((Ps_1)this.class_[1]).catch_().implements_[3]) {
               Integer var7 = (Integer)this.break_[0] + 1;
               this.break_[0] = var7;
               if (this.throws_() >= 9) {
                  this.class_(this.throws_(), 8);
               }

               int var2 = this.class_(xu_3.break_, rdD_2.class);
               if (var2 >= 9) {
                  this.class_(var2, 0);
               }

               if ((int[])this.break_[1] != null) {
                  this.byte_("Remembering to move " + ((int[])this.break_[1])[0] + " " + ((int[])this.break_[1])[1] + " from a previous tick");
                  this.class_(((int[])this.break_[1])[0], ((int[])this.break_[1])[1]);
               }
            }
         }
      }
   }

   private boolean class_(int var1, int var2) {
      this.protected_();
      int[] var7 = new int[]{var1, var2};
      this.break_[1] = var7;
      if ((Integer)this.break_[0] < (Integer)C_class.instanceof_().PF.class_[0]) {
         this.byte_("Inventory move requested but delaying " + (Integer)this.break_[0] + " " + C_class.instanceof_().PF.class_[0]);
         return false;
      } else if ((Boolean)C_class.instanceof_().class_.class_[0] && !((C_class)this.class_[0]).const_().private_()) {
         this.byte_("Inventory move requested but delaying until stationary");
         return false;
      } else {
         ((Ps_1)this.class_[1])
            .native_()
            .class_(((rJT)((Ps_1)this.class_[1]).catch_().implements_[3]).case_, var1 < 9 ? var1 + 36 : var1, var2, rXa_1.SWAP, true);
         Integer var8 = 0;
         this.break_[0] = var8;
         Object var9 = null;
         this.break_[1] = var9;
         return true;
      }
   }

   public boolean class_(boolean var1, Predicate<? super rdn_3> var2, boolean var3) {
      cb_3 var4 = ((Ps_1)this.class_[1]).catch_();
      rqs_3 var5 = ((rhz_3)var4.implements_[1]).class_;

      for (int var6 = 0; var6 < 9; var6++) {
         rdn_3 var7 = (rdn_3)var5.get(var6);
         if (var2.test(var7)) {
            if (var1) {
               ((rhz_3)var4.implements_[1]).protected_ = var6;
            }

            return implements_[28];
         }
      }

      if (var2.test(((rhz_3)var4.implements_[1]).byte_.get(0))) {
         for (int var8 = 0; var8 < 9; var8++) {
            rdn_3 var10 = (rdn_3)var5.get(var8);
            if (var10.class_() || var10.break_() instanceof rdD_2) {
               if (var1) {
                  ((rhz_3)var4.implements_[1]).protected_ = var8;
               }

               return implements_[31];
            }
         }
      }

      if (var3) {
         for (int var9 = 9; var9 < 36; var9++) {
            if (var2.test(var5.get(var9))) {
               if (var1) {
                  this.class_(var9, 7);
                  ((rhz_3)var4.implements_[1]).protected_ = 7;
               }

               return implements_[32];
            }
         }
      }

      return implements_[33];
   }

   public boolean class_(boolean var1, int var2, int var3, int var4) {
      xc_3 var5 = ((C_class)this.class_[0]).b().class_(var2, var3, var4, ((bw_3)((C_class)this.class_[0]).break_[34]).class_(var2, var3, var4));
      if (var5 != null
         && this.class_(
            var1,
            var2x -> var2x.break_() instanceof rxJ_2
                     && var5.equals(
                        ((rxJ_2)var2x.break_())
                           .catch_()
                           .class_(
                              new rxx_3(
                                 new Pe_1(
                                    this,
                                    ((Ps_1)this.class_[1]).case_(),
                                    ((Ps_1)this.class_[1]).catch_(),
                                    rpm_3.MAIN_HAND,
                                    var2x,
                                    new rff_3(
                                       new rjU_2(
                                          ((Ps_1)this.class_[1]).catch_().Ps().break_,
                                          ((Ps_1)this.class_[1]).catch_().Ps().byte_,
                                          ((Ps_1)this.class_[1]).catch_().Ps().protected_
                                       ),
                                       rpr_3.UP,
                                       ((Ps_1)this.class_[1]).volatile_(),
                                       false
                                    )
                                 )
                              )
                           )
                     )
                  ? true
                  : implements_[38]
         )) {
         return true;
      } else if (var5 != null
         && this.class_(var1, var1x -> var1x.break_() instanceof rxJ_2 && ((rxJ_2)var1x.break_()).catch_().equals(var5.break_()) ? true : implements_[35])) {
         return true;
      } else {
         for (rdb_3 var7 : (List)C_class.instanceof_().PX.class_[0]) {
            if (this.class_(var1, var1x -> var7.equals(var1x.break_()))) {
               return true;
            }
         }

         return implements_[26];
      }
   }

   public boolean class_(int var1, Predicate<Integer> var2) {
      OptionalInt var3 = this.class_(var2);
      return var3.isPresent() && !this.class_(var1, var3.getAsInt()) ? false : implements_[7];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 846506650;
   }

   public boolean class_() {
      for (rdb_3 var2 : (List)C_class.instanceof_().PX.class_[0]) {
         if (this.class_(false, var1 -> var2.equals(var1.break_()))) {
            return true;
         }
      }

      return implements_[22];
   }

   public boolean class_(boolean var1, Predicate<? super rdn_3> var2) {
      return this.class_(var1, var2, (Boolean)C_class.instanceof_().z.class_[0]);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-54, 31, -42, -89, -118, 80, -107, -112}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      throws_ = new double[]{-1.0};
   }

   private int throws_() {
      rqs_3 var1 = ((rhz_3)((Ps_1)this.class_[1]).catch_().implements_[1]).class_;

      for (int var2 = 0; var2 < var1.size(); var2++) {
         if (((List)C_class.instanceof_().PX.class_[0]).contains(((rdn_3)var1.get(var2)).break_())) {
            return var2;
         }
      }

      return catch_[8];
   }

   private static void catch_() {
      implements_ = new boolean[]{
         true,
         false,
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
         false,
         true,
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
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false
      };
   }

   private static void case_() {
      catch_ = new byte[]{9, 8, 9, 8, 8, 2, 9, 36, -1, -1, 9, 9, 9, 36, 7, 7, 2};
   }

   private void protected_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
         var1[0] = 0;
      }
   }

   private static void private_() {
      case_ = new String[]{new String("Inventory move requested but delaying until stationary")};
   }
}

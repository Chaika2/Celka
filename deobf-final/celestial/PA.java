package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PA extends Pv_1 {
   private static boolean[] byte_;
   private static long[] protected_;
   public Object[] break_;
   private static double[] throws_;
   private static byte[] case_;
   private static short[] catch_;
   private static String[] private_;

   private boolean byte_() {
      this.break_();
      PI var1 = C_throws.byte_().native_().protected_();
      rrjx_3 var2 = rrjS_2.class_(var1, (Integer)this.break_[6]);
      if (var2 == null) {
         return false;
      } else {
         String var3 = var2.class_();
         int var4 = var2.break_();
         ((Ps_1)this.class_[1]).catch_().protected_("/" + var3 + var4);
         return true;
      }
   }

   public PA(C_class var1) {
      super(var1);
      this.break_();
      Long var6 = -1L;
      this.break_[2] = var6;
      Long var7 = -1L;
      this.break_[3] = var7;
      rrfw_3 var8 = new rrfw_3();
      this.break_[5] = var8;
      Integer var9 = 1;
      this.break_[6] = var9;
   }

   static {
      ntfClinit();
   }

   private void class_(rrTo_1 var1, boolean var2) {
      this.break_();
      if (!var2) {
         Object var8 = null;
         this.break_[4] = var8;
         ((rrfw_3)this.break_[5]).class_();
         Integer var9 = 1;
         this.break_[6] = var9;
         Long var10 = -1L;
         this.break_[2] = var10;
         Long var11 = -1L;
         this.break_[3] = var11;
         Object var12 = null;
         this.break_[1] = var12;
      } else {
         String var3 = var1.byte_();
         if ((Pn_1)this.break_[4] == (Pn_1)Pn_1.staticFields96e7b83c036d3953981f6df41072b416[0]) {
            if (((rrfw_3)this.break_[5]).class_(1000.0)) {
               if (this.byte_()) {
                  Integer var13 = (Integer)this.break_[6] + 1;
                  this.break_[6] = var13;
               }

               ((rrfw_3)this.break_[5]).class_();
            }
         } else if ((Pn_1)this.break_[4] == (Pn_1)Pn_1.staticFields96e7b83c036d3953981f6df41072b416[1] && ((rrfw_3)this.break_[5]).class_(10000.0)) {
            if ((rrtb_3)this.break_[1] != (rrtb_3)rrtb_3.staticFields37d12a728fd138a98f39979b8f11d1be[0]) {
               var1.break_(new rrtG_2(var3, (rrtb_3)rrtb_3.staticFields37d12a728fd138a98f39979b8f11d1be[0]), true);
               rrtb_3 var14 = (rrtb_3)rrtb_3.staticFields37d12a728fd138a98f39979b8f11d1be[0];
               this.break_[1] = var14;
            }

            Object var15 = null;
            this.break_[4] = var15;
         }
      }
   }

   @Override
   public void class_(rrLu_1 var1) {
      this.break_();
      if (var1.class_() instanceof rvt_3 var3) {
         rqA_2 var4 = var3.break_();
         if (var4 == rqn_3.Mu) {
            if ((PC)this.break_[0] != null) {
            }

            if (this.protected_()) {
               var1.class_(true);
            }
         }
      }
   }

   @Override
   public void class_(rrnG_2 var1) {
      this.break_();
      super.class_(var1);
      rrTo_1 var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().d().continue_();
      if (var2.break_() && (PC)this.break_[0] != null) {
         rrNW var3 = ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).throws_();
         rrNV var4 = var3.switch_();
         if (var4 instanceof rrNq_1) {
            var1.class_(null);
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1920306903820574465L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1429828417;
   }

   @Override
   public void class_(rrAT var1) {
      this.break_();
      rrTo_1 var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().d().continue_();
      if (var2.break_() && (PC)this.break_[0] != null) {
         rrNW var3 = ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).throws_();
         rrNV var4 = var3.switch_();
         if (var4 instanceof rrNq_1) {
            if ((Long)this.break_[2] != -1L) {
               Long var20 = rqR_2.break_() - (Long)this.break_[2];
               this.break_[3] = var20;
               Long var21 = -1L;
               this.break_[2] = var21;
            }

            rdn_3 var5 = ((PC)this.break_[0]).break_();
            rdb_3 var6 = var5.break_();
            String var7 = ((PC)this.break_[0]).class_();
            int var8 = ((PC)this.break_[0]).protected_();
            List var9 = var1.byte_();
            boolean var10 = false;
            boolean var11 = false;

            for (rJY var13 : var9) {
               if (var13.break_() && var13.protected_ <= 44) {
                  rrNt_1 var14 = ((rrNa_1)rrNa_1.staticFields477bc35efba33c1cba244cd88c6fd655[0]).break_(var13);
                  if (var14 != null && var14.case_() != -1 && var14.catch_() != null) {
                     rdn_3 var15 = var13.class_();
                     if (var15.break_() == var6
                        && var14.case_() == var8
                        && var14.catch_().equals(var7)
                        && var15.continue_().byte_().equals(var5.continue_().byte_())) {
                        var10 = true;
                        break;
                     }

                     var11 = byte_[9];
                  }
               }
            }

            var2.break_(
               new rrtS_2(
                  var5,
                  var7,
                  var8,
                  ((Ps_1)this.class_[1]).throws_().while_().byte_(),
                  var10 ? (rrts_3)rrts_3.staticFields7f20647f48ec3d8aae2ee5813ea8ad96[0] : (rrts_3)rrts_3.staticFields7f20647f48ec3d8aae2ee5813ea8ad96[1]
               ),
               true
            );
            ((Ps_1)this.class_[1]).catch_().strictfp_();
            Object var22 = null;
            this.break_[0] = var22;
            if (this.throws_()) {
               Pn_1 var23 = (Pn_1)Pn_1.staticFields96e7b83c036d3953981f6df41072b416[0];
               this.break_[4] = var23;
               ((rrfw_3)this.break_[5]).class_();
            }
         }
      }
   }

   @Override
   public void class_(rrLh_1 var1) {
      this.break_();
      rrTo_1 var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().d().continue_();
      if (var2.break_()) {
         String var3 = var1.class_();
         if (var3.startsWith("[☃] После входа на режим необходимо немного подождать перед использованием аукциона")) {
            if ((PC)this.break_[0] != null) {
            }

            if (this.protected_()) {
               var1.class_(true);
            }
         }
      }
   }

   @Override
   public void class_(rrLc_1 var1) {
      this.break_();
      if (var1.class_() instanceof rrtM_2 var3) {
         PC var14 = new PC(var3.break_(), var3.protected_(), var3.class_(), var3.byte_());
         this.break_[0] = var14;
         C_class var4 = C_throws.byte_();
         PI var5 = var4.native_().protected_();
         PF var6 = var4.try_();
         QY var7 = ((Ps_1)this.class_[1]).throws_();
         cb_3 var8 = ((Ps_1)this.class_[1]).catch_();
         if ((vm_3)var7.class_[73] != null) {
            var8.strictfp_();
         }

         if (var5 == null || var5.class_() != (Pf_1)Pf_1.staticFieldsc81ab00368b8322fb29ceba592eaabc7[0]) {
            this.protected_();
            return;
         }

         if (var6.class_(true)) {
            this.protected_();
            return;
         }

         if (rrfZ_2.byte_()) {
            this.protected_();
            return;
         }

         rrNW var9 = ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).throws_();
         if (var9.switch_() != null) {
            var8.strictfp_();
            this.protected_();
            return;
         }

         var8.case_("/ah search " + var3.class_());
         Long var15 = rqR_2.break_();
         this.break_[2] = var15;
      }
   }

   @Override
   public void class_(rrAM var1) {
      this.break_();
      super.class_(var1);
      if ((Pn_1)this.break_[4] == (Pn_1)Pn_1.staticFields96e7b83c036d3953981f6df41072b416[0]) {
         rrTo_1 var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().d().continue_();
         if (var2.break_() && (rrtb_3)this.break_[1] != (rrtb_3)rrtb_3.staticFields37d12a728fd138a98f39979b8f11d1be[1]) {
            var2.break_(new rrtG_2(var2.byte_(), (rrtb_3)rrtb_3.staticFields37d12a728fd138a98f39979b8f11d1be[1]), true);
            rrtb_3 var7 = (rrtb_3)rrtb_3.staticFields37d12a728fd138a98f39979b8f11d1be[1];
            this.break_[1] = var7;
         }

         Pn_1 var8 = (Pn_1)Pn_1.staticFields96e7b83c036d3953981f6df41072b416[1];
         this.break_[4] = var8;
         ((rrfw_3)this.break_[5]).class_();
         Integer var9 = 1;
         this.break_[6] = var9;
      }

      Long var10 = -1L;
      this.break_[2] = var10;
      Long var11 = -1L;
      this.break_[3] = var11;
      Object var12 = null;
      this.break_[0] = var12;
   }

   private static void class_() {
      catch_ = new short[]{
         2,
         3,
         5,
         6,
         0,
         1,
         1,
         73,
         0,
         0,
         2,
         4,
         0,
         0,
         1,
         1,
         1,
         1,
         1,
         1,
         4,
         5,
         6,
         2,
         3,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         2,
         2,
         3,
         2,
         0,
         0,
         0,
         0,
         1,
         0,
         1,
         1,
         0,
         0,
         4,
         5,
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
         0,
         4,
         5,
         6,
         2,
         3,
         1,
         4,
         0,
         5,
         6,
         6,
         5,
         4,
         1,
         5,
         1,
         0,
         0,
         0,
         1,
         4,
         6,
         1,
         3
      };
   }

   @Override
   public void class_(q_1 var1) {
      super.class_(var1);
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         rrTo_1 var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().d().continue_();
         boolean var3 = var2.break_();
         this.class_(var2, var3);
      }
   }

   private void break_() {
      if (this.break_ == null) {
         this.break_ = new Object[7];
         Object[] var1 = this.break_;
         var1[2] = 0L;
         var1[3] = 0L;
         var1[6] = 0;
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-2, -18, -52, 91, 69, -103, -125, 29}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private boolean throws_() {
      this.break_();
      return this.break_[3] > 300L ? true : byte_[20];
   }

   private static void finally_() {
      byte_ = new boolean[]{
         true, true, true, true, true, true, false, false, true, true, true, true, true, false, true, true, true, false, true, true, false, false
      };
   }

   private static void catch_() {
      throws_ = new double[]{1000.0, 10000.0};
   }

   private static void case_() {
      protected_ = new long[]{-1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, 300L, 0L, 0L};
   }

   private static void implements_() {
      case_ = new byte[]{44, -1, 7, 2, 3, 6};
   }

   private boolean protected_() {
      this.break_();
      rrTo_1 var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().d().continue_();
      if (var1.break_() && (PC)this.break_[0] != null) {
         rdn_3 var2 = ((PC)this.break_[0]).break_();
         String var3 = ((PC)this.break_[0]).class_();
         int var4 = ((PC)this.break_[0]).protected_();
         var1.break_(
            new rrtS_2(var2, var3, var4, ((Ps_1)this.class_[1]).throws_().while_().byte_(), (rrts_3)rrts_3.staticFields7f20647f48ec3d8aae2ee5813ea8ad96[2]),
            true
         );
         Object var9 = null;
         this.break_[0] = var9;
         return true;
      } else {
         return byte_[13];
      }
   }

   private static void private_() {
      private_ = new String[]{new String("[☃] После входа на режим необходимо немного подождать перед использованием аукциона")};
   }
}

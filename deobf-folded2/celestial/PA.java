package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PA extends Pv_1 {
   private static boolean[] id_byte;
   private static long[] id_protected;
   public Object[] id_break;
   private static double[] id_throws;
   private static byte[] id_case;
   private static short[] id_catch;
   private static String[] id_private;

   private boolean id_byte() {
      this.id_break();
      PI var1 = C_throws.id_byte().id_native().id_protected();
      rrjx_3 var2 = rrjS_2.id_class(var1, (Integer)this.id_break[6]);
      if (var2 == null) {
         return false;
      } else {
         String var3 = var2.id_class();
         int var4 = var2.id_break();
         ((Ps_1)this.id_class[1]).id_catch().id_protected("/" + var3 + var4);
         return true;
      }
   }

   public PA(C_class var1) {
      super(var1);
      this.id_break();
      Long var6 = -1L;
      this.id_break[2] = var6;
      Long var7 = -1L;
      this.id_break[3] = var7;
      rrfw_3 var8 = new rrfw_3();
      this.id_break[5] = var8;
      Integer var9 = 1;
      this.id_break[6] = var9;
   }

   static {
      ntfClinit();
   }

   private void id_class(rrTo_1 var1, boolean var2) {
      this.id_break();
      if (!var2) {
         Object var8 = null;
         this.id_break[4] = var8;
         ((rrfw_3)this.id_break[5]).id_class();
         Integer var9 = 1;
         this.id_break[6] = var9;
         Long var10 = -1L;
         this.id_break[2] = var10;
         Long var11 = -1L;
         this.id_break[3] = var11;
         Object var12 = null;
         this.id_break[1] = var12;
      } else {
         String var3 = var1.id_byte();
         if ((Pn_1)this.id_break[4] == (Pn_1)Pn_1.staticFields96e7b83c036d3953981f6df41072b416[0]) {
            if (((rrfw_3)this.id_break[5]).id_class(1000.0)) {
               if (this.id_byte()) {
                  Integer var13 = (Integer)this.id_break[6] + 1;
                  this.id_break[6] = var13;
               }

               ((rrfw_3)this.id_break[5]).id_class();
            }
         } else if ((Pn_1)this.id_break[4] == (Pn_1)Pn_1.staticFields96e7b83c036d3953981f6df41072b416[1] && ((rrfw_3)this.id_break[5]).id_class(10000.0)) {
            if ((rrtb_3)this.id_break[1] != (rrtb_3)rrtb_3.staticFields37d12a728fd138a98f39979b8f11d1be[0]) {
               var1.id_break(new rrtG_2(var3, (rrtb_3)rrtb_3.staticFields37d12a728fd138a98f39979b8f11d1be[0]), true);
               rrtb_3 var14 = (rrtb_3)rrtb_3.staticFields37d12a728fd138a98f39979b8f11d1be[0];
               this.id_break[1] = var14;
            }

            Object var15 = null;
            this.id_break[4] = var15;
         }
      }
   }

   @Override
   public void id_class(rrLu_1 var1) {
      this.id_break();
      if (var1.id_class() instanceof rvt_3 var3) {
         rqA_2 var4 = var3.id_break();
         if (var4 == rqn_3.Mu) {
            if ((PC)this.id_break[0] != null) {
            }

            if (this.id_protected()) {
               var1.id_class(true);
            }
         }
      }
   }

   @Override
   public void id_class(rrnG_2 var1) {
      this.id_break();
      super.id_class(var1);
      rrTo_1 var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().d().id_continue();
      if (var2.id_break() && (PC)this.id_break[0] != null) {
         rrNW var3 = ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).id_throws();
         rrNV var4 = var3.id_switch();
         if (var4 instanceof rrNq_1) {
            var1.id_class(null);
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1920306903820574465L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1429828417;
   }

   @Override
   public void id_class(rrAT var1) {
      this.id_break();
      rrTo_1 var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().d().id_continue();
      if (var2.id_break() && (PC)this.id_break[0] != null) {
         rrNW var3 = ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).id_throws();
         rrNV var4 = var3.id_switch();
         if (var4 instanceof rrNq_1) {
            if ((Long)this.id_break[2] != -1L) {
               Long var20 = rqR_2.id_break() - (Long)this.id_break[2];
               this.id_break[3] = var20;
               Long var21 = -1L;
               this.id_break[2] = var21;
            }

            rdn_3 var5 = ((PC)this.id_break[0]).id_break();
            rdb_3 var6 = var5.id_break();
            String var7 = ((PC)this.id_break[0]).id_class();
            int var8 = ((PC)this.id_break[0]).id_protected();
            List var9 = var1.id_byte();
            boolean var10 = false;
            boolean var11 = false;

            for (rJY var13 : var9) {
               if (var13.id_break() && var13.id_protected <= 44) {
                  rrNt_1 var14 = ((rrNa_1)rrNa_1.staticFields477bc35efba33c1cba244cd88c6fd655[0]).id_break(var13);
                  if (var14 != null && var14.id_case() != -1 && var14.id_catch() != null) {
                     rdn_3 var15 = var13.id_class();
                     if (var15.id_break() == var6
                        && var14.id_case() == var8
                        && var14.id_catch().equals(var7)
                        && var15.id_continue().id_byte().equals(var5.id_continue().id_byte())) {
                        var10 = true;
                        break;
                     }

                     var11 = id_byte[9];
                  }
               }
            }

            var2.id_break(
               new rrtS_2(
                  var5,
                  var7,
                  var8,
                  ((Ps_1)this.id_class[1]).id_throws().id_while().id_byte(),
                  var10 ? (rrts_3)rrts_3.staticFields7f20647f48ec3d8aae2ee5813ea8ad96[0] : (rrts_3)rrts_3.staticFields7f20647f48ec3d8aae2ee5813ea8ad96[1]
               ),
               true
            );
            ((Ps_1)this.id_class[1]).id_catch().id_strictfp();
            Object var22 = null;
            this.id_break[0] = var22;
            if (this.id_throws()) {
               Pn_1 var23 = (Pn_1)Pn_1.staticFields96e7b83c036d3953981f6df41072b416[0];
               this.id_break[4] = var23;
               ((rrfw_3)this.id_break[5]).id_class();
            }
         }
      }
   }

   @Override
   public void id_class(rrLh_1 var1) {
      this.id_break();
      rrTo_1 var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().d().id_continue();
      if (var2.id_break()) {
         String var3 = var1.id_class();
         if (var3.startsWith("[☃] После входа на режим необходимо немного подождать перед использованием аукциона")) {
            if ((PC)this.id_break[0] != null) {
            }

            if (this.id_protected()) {
               var1.id_class(true);
            }
         }
      }
   }

   @Override
   public void id_class(rrLc_1 var1) {
      this.id_break();
      if (var1.id_class() instanceof rrtM_2 var3) {
         PC var14 = new PC(var3.id_break(), var3.id_protected(), var3.id_class(), var3.id_byte());
         this.id_break[0] = var14;
         C_class var4 = C_throws.id_byte();
         PI var5 = var4.id_native().id_protected();
         PF var6 = var4.id_try();
         QY var7 = ((Ps_1)this.id_class[1]).id_throws();
         cb_3 var8 = ((Ps_1)this.id_class[1]).id_catch();
         if ((vm_3)var7.id_class[73] != null) {
            var8.id_strictfp();
         }

         if (var5 == null || var5.id_class() != (Pf_1)Pf_1.staticFieldsc81ab00368b8322fb29ceba592eaabc7[0]) {
            this.id_protected();
            return;
         }

         if (var6.id_class(true)) {
            this.id_protected();
            return;
         }

         if (rrfZ_2.id_byte()) {
            this.id_protected();
            return;
         }

         rrNW var9 = ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).id_throws();
         if (var9.id_switch() != null) {
            var8.id_strictfp();
            this.id_protected();
            return;
         }

         var8.id_case("/ah search " + var3.id_class());
         Long var15 = rqR_2.id_break();
         this.id_break[2] = var15;
      }
   }

   @Override
   public void id_class(rrAM var1) {
      this.id_break();
      super.id_class(var1);
      if ((Pn_1)this.id_break[4] == (Pn_1)Pn_1.staticFields96e7b83c036d3953981f6df41072b416[0]) {
         rrTo_1 var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().d().id_continue();
         if (var2.id_break() && (rrtb_3)this.id_break[1] != (rrtb_3)rrtb_3.staticFields37d12a728fd138a98f39979b8f11d1be[1]) {
            var2.id_break(new rrtG_2(var2.id_byte(), (rrtb_3)rrtb_3.staticFields37d12a728fd138a98f39979b8f11d1be[1]), true);
            rrtb_3 var7 = (rrtb_3)rrtb_3.staticFields37d12a728fd138a98f39979b8f11d1be[1];
            this.id_break[1] = var7;
         }

         Pn_1 var8 = (Pn_1)Pn_1.staticFields96e7b83c036d3953981f6df41072b416[1];
         this.id_break[4] = var8;
         ((rrfw_3)this.id_break[5]).id_class();
         Integer var9 = 1;
         this.id_break[6] = var9;
      }

      Long var10 = -1L;
      this.id_break[2] = var10;
      Long var11 = -1L;
      this.id_break[3] = var11;
      Object var12 = null;
      this.id_break[0] = var12;
   }

   private static void id_class() {
      id_catch = new short[]{
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
   public void id_class(q_1 var1) {
      super.id_class(var1);
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         rrTo_1 var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().d().id_continue();
         boolean var3 = var2.id_break();
         this.id_class(var2, var3);
      }
   }

   private void id_break() {
      if (this.id_break == null) {
         this.id_break = new Object[7];
         Object[] var1 = this.id_break;
         var1[2] = 0L;
         var1[3] = 0L;
         var1[6] = 0;
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-2, -18, -52, 91, 69, -103, -125, 29}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private boolean id_throws() {
      this.id_break();
      return this.id_break[3] > 300L ? true : id_byte[20];
   }

   private static void id_finally() {
      id_byte = new boolean[]{
         true, true, true, true, true, true, false, false, true, true, true, true, true, false, true, true, true, false, true, true, false, false
      };
   }

   private static void id_catch() {
      id_throws = new double[]{1000.0, 10000.0};
   }

   private static void id_case() {
      id_protected = new long[]{-1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, 300L, 0L, 0L};
   }

   private static void id_implements() {
      id_case = new byte[]{44, -1, 7, 2, 3, 6};
   }

   private boolean id_protected() {
      this.id_break();
      rrTo_1 var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().d().id_continue();
      if (var1.id_break() && (PC)this.id_break[0] != null) {
         rdn_3 var2 = ((PC)this.id_break[0]).id_break();
         String var3 = ((PC)this.id_break[0]).id_class();
         int var4 = ((PC)this.id_break[0]).id_protected();
         var1.id_break(
            new rrtS_2(
               var2, var3, var4, ((Ps_1)this.id_class[1]).id_throws().id_while().id_byte(), (rrts_3)rrts_3.staticFields7f20647f48ec3d8aae2ee5813ea8ad96[2]
            ),
            true
         );
         Object var9 = null;
         this.id_break[0] = var9;
         return true;
      } else {
         return id_byte[13];
      }
   }

   private static void id_private() {
      id_private = new String[]{new String("[☃] После входа на режим необходимо немного подождать перед использованием аукциона")};
   }
}

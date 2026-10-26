package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoExplosion extends Module implements rrnF_2 {
   private static long[] id_byte;
   public Object[] id_break;
   private static double[] id_protected;
   private static byte[] id_throws;
   private static boolean[] id_catch;
   private static short[] id_private;
   private static float[] id_implements;
   private static String[] id_finally;

   private rSa_1 id_byte(rfH_2 var1) {
      return var1 == null
         ? null
         : this.id_class((double)var1.b_(), (double)var1.c_(), (double)var1.d_())
            .stream()
            .filter(var0 -> var0 instanceof rSa_1)
            .map(var0 -> (rSa_1)var0)
            .findFirst()
            .orElse(null);
   }

   public AutoExplosion() {
      super(id_finally[0], id_finally[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_private[0]]);
      this.id_return();
      rrIk_1 var5 = new rrIk_1(id_finally[2], id_catch[0]);
      this.id_break[id_private[1]] = var5;
      rrIk_1 var6 = new rrIk_1(id_finally[3], id_catch[1]).id_class(((rrIk_1)this.id_break[id_private[2]])::id_class);
      this.id_break[id_private[3]] = var6;
      rrTT var7 = new rrTT(this);
      this.id_break[id_private[4]] = var7;
      rrnn_3 var8 = new rrnn_3(this);
      this.id_break[id_private[5]] = var8;
      Setting[] var10001 = new Setting[id_throws[0]];
      var10001[id_catch[2]] = (rrIk_1)this.id_break[id_private[6]];
      var10001[id_catch[3]] = (rrIk_1)this.id_break[id_private[7]];
      this.id_class(var10001);
   }

   static {
      ntfClinit();
   }

   private boolean id_this() {
      rLY var1 = ((cb_3)id_import.id_class[id_private[66]]).id_byte(rLD.id_continue);
      rLY var2 = ((cb_3)id_import.id_class[id_private[67]]).id_byte(rLD.id_throws);
      return var1 == null || var2 != null && var2.id_byte() > var1.id_byte() ? id_catch[22] : id_catch[21];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3269477539150907110L;
   }

   @EventTarget
   public void id_class(rrAE var1) {
      this.id_return();
      rfH_2 var6 = var1.id_break();
      this.id_break[id_private[8]] = var6;
   }

   private void id_class(rvG_2 var1) {
      this.id_return();
      int[] var2 = var1.id_break();
      int var3 = var2.length;

      for (int var4 = id_catch[15]; var4 < var3; var4++) {
         int var5 = var2[var4];
         if ((rSa_1)this.id_break[id_private[44]] != null && ((rSa_1)this.id_break[id_private[45]]).V() == var5) {
            this.id_new();
            break;
         }
      }
   }

   private List<an_3> id_class(double var1, double var3, double var5) {
      return ((gm_3)id_import.id_class[id_private[59]])
         .id_class(null, new rfl_3(var1, var3, var5, var1 + id_protected[0], var3 + id_protected[1], var5 + id_protected[2]));
   }

   @EventTarget
   public void id_class(rrAf_1 var1) {
      this.id_return();
      rjG_2 var3 = (rjG_2)id_import.id_class[id_private[9]];
      if (var3 instanceof rff_3 var2 && !var1.id_byte().id_class()) {
         rfH_2 var8 = var2.id_class();
         this.id_break[id_private[10]] = var8;
      }
   }

   private void id_class(rSa_1 var1) {
      this.id_return();
      if (var1 != null) {
         this.id_break[id_private[28]] = var1;
         if (((rrIk_1)this.id_break[id_private[29]]).id_class()) {
            ((rrTT)this.id_break[id_private[30]]).id_class(var1, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_private[31]]);
         }

         this.id_break(var1);
      }
   }

   @EventTarget(
      id_class = 100
   )
   public void id_class(q_1 var1) {
      this.id_return();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_private[12]]) {
         rfH_2 var2 = (rfH_2)this.id_break[id_private[13]];
         if (var2 != null) {
            rSa_1 var3 = this.id_byte(var2);
            if (((gm_3)id_import.id_class[id_private[14]]).id_finally(var2) && var3 == null) {
               this.id_new();
               return;
            }

            if (((cb_3)id_import.id_class[id_private[15]]).id_break((double)var2.b_(), (double)var2.c_(), (double)var2.d_()) > id_implements[0]) {
               this.id_new();
               return;
            }

            if (!this.id_this()) {
               this.id_new();
               return;
            }

            if (var3 == null) {
               int var10002 = (Integer)this.id_break[id_private[16]] + id_catch[4];
               Integer var9 = var10002;
               this.id_break[id_private[17]] = var9;
               if (var10002 > id_throws[1]) {
                  this.id_new();
                  Integer var10 = Integer.valueOf(id_catch[5]);
                  this.id_break[id_private[18]] = var10;
                  return;
               }

               ((rrTT)this.id_break[id_private[19]]).id_class(var2, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_private[20]]);
            } else {
               Integer var11 = Integer.valueOf(id_catch[6]);
               this.id_break[id_private[21]] = var11;
               Boolean var12 = id_catch[7];
               this.id_break[id_private[22]] = var12;
            }

            if ((Boolean)this.id_break[id_private[23]]) {
               ryZ_2 var4 = this.id_continue();
               if (var4 == ryZ_2.SUCCESS) {
                  Boolean var13 = id_catch[8];
                  this.id_break[id_private[24]] = var13;
               }
            }

            this.id_class(var3);
         } else {
            this.id_new();
         }

         if ((rfH_2)this.id_break[id_private[25]] != null) {
            this.id_class((rfH_2)this.id_break[id_private[26]]);
            Object var14 = null;
            this.id_break[id_private[27]] = var14;
         }
      }
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      if (var1.id_class() instanceof rvG_2 var3) {
         this.id_class(var3);
      }
   }

   private boolean id_class(xd_3 var1) {
      return !(var1 instanceof kY_2) && var1 != xd_3.id_break(id_throws[4]) ? id_catch[18] : id_catch[17];
   }

   @EventTarget
   public void id_class(rrAI var1) {
      this.id_return();
      rdn_3 var2 = var1.id_protected();
      rfH_2 var3 = var1.id_class();
      xd_3 var4 = var1.id_byte();
      ryZ_2 var5 = var1.id_break();
      if (var5.id_break()) {
         if (this.id_class(var4)) {
            if (var2.id_break() == rdy_3.kM) {
               this.id_break[id_private[11]] = var3;
            }
         }
      }
   }

   private void id_class(rfH_2 var1) {
      this.id_return();
      xd_3 var2 = rrjc_3.id_protected(var1);
      if (this.id_class(var2)) {
         if (rrfY_2.id_break(rdy_3.kM) != id_throws[2]) {
            if (this.id_break(var1)) {
               this.id_break[id_private[42]] = var1;
               Boolean var8 = id_catch[14];
               this.id_break[id_private[43]] = var8;
            }
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1028875454;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-20, -101, 6, -106, 44, -63, 63, -61}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private boolean id_break(rfH_2 var1) {
      rfH_2 var2 = var1.id_final();
      if (!((gm_3)id_import.id_class[id_private[58]]).id_finally(var2)) {
         return id_catch[16];
      } else {
         double var3 = (double)var2.b_();
         double var5 = (double)var2.c_();
         double var7 = (double)var2.d_();
         List var9 = this.id_class(var3, var5, var7);
         return var9.isEmpty();
      }
   }

   private void id_break(rSa_1 var1) {
      this.id_return();
      if (this.id_super()) {
         an_3 var2 = Ph_1.id_class(
            (rSa_1)this.id_break[id_private[32]],
            ((cb_3)id_import.id_class[id_private[33]]).id_new(id_implements[1]),
            ((rrTT)this.id_break[id_private[34]]).id_throws(),
            id_implements[2],
            id_catch[9]
         );
         if (((rrIk_1)this.id_break[id_private[35]]).id_class() && var2 != (rSa_1)this.id_break[id_private[36]]) {
            return;
         }

         ((Ax_1)id_import.id_class[id_private[37]]).id_class((cb_3)id_import.id_class[id_private[38]], var1, id_catch[10]);
         Long var7 = System.currentTimeMillis();
         this.id_break[id_private[39]] = var7;
      }
   }

   @Override
   public float id_break() {
      return id_implements[4];
   }

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      this.id_new();
   }

   @Override
   public rrTp_1 id_catch() {
      this.id_return();
      return ((rrIk_1)this.id_break[id_private[69]]).id_class()
         ? (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[id_private[70]]
         : (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[id_private[71]];
   }

   private static void id_goto() {
      id_catch = new boolean[]{
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
         false,
         false,
         true,
         false,
         false
      };
   }

   private ryZ_2 id_continue() {
      this.id_return();
      rfH_2 var1 = (rfH_2)this.id_break[id_private[46]];
      if (var1 != null) {
         rjG_2 var3 = (rjG_2)id_import.id_class[id_private[47]];
         if (var3 instanceof rff_3 var2) {
            if (!var2.id_class().equals(var1)) {
               return ryZ_2.FAIL;
            }

            int var7 = ((rhz_3)((cb_3)id_import.id_class[id_private[48]]).id_implements[id_private[49]]).id_protected;
            int var4 = rrfY_2.id_break(rdy_3.kM);
            if (var4 >= 0) {
               ((rhz_3)((cb_3)id_import.id_class[id_private[50]]).id_implements[id_private[51]]).id_protected = var4;
            }

            rpm_3 var5 = var4 == id_throws[3] ? rpm_3.OFF_HAND : rpm_3.MAIN_HAND;
            ryZ_2 var6 = ((Ax_1)id_import.id_class[id_private[52]])
               .id_class((cb_3)id_import.id_class[id_private[53]], (gm_3)id_import.id_class[id_private[54]], var5, var2);
            if (var6 == ryZ_2.SUCCESS) {
               ((cb_3)id_import.id_class[id_private[55]]).id_class(var5);
            }

            ((rhz_3)((cb_3)id_import.id_class[id_private[56]]).id_implements[id_private[57]]).id_protected = var7;
            return var6;
         }
      }

      return ryZ_2.FAIL;
   }

   private static void id_else() {
      id_implements = new float[]{6.0F, 1.0F, 3.0F, 500.0F, -1.0F, -1.0F};
   }

   private static void id_instanceof() {
      id_protected = new double[]{1.0, 2.0, 1.0};
   }

   public void id_new() {
      this.id_return();
      Object var5 = null;
      this.id_break[id_private[60]] = var5;
      Object var6 = null;
      this.id_break[id_private[61]] = var6;
      Boolean var7 = id_catch[19];
      this.id_break[id_private[62]] = var7;
      Integer var8 = Integer.valueOf(id_catch[20]);
      this.id_break[id_private[63]] = var8;
      ((rrTT)this.id_break[id_private[64]]).id_final();
      ((rrTT)this.id_break[id_private[65]]).id_finally();
   }

   private void id_return() {
      if (this.id_break == null) {
         this.id_break = new Object[10];
         this.id_break[5] = false;
         this.id_break[6] = 0L;
         this.id_break[7] = 0;
      }
   }

   private boolean id_super() {
      this.id_return();
      rSa_1 var1 = (rSa_1)this.id_break[id_private[40]];
      if (var1 == null) {
         return id_catch[11];
      } else {
         return (float)(System.currentTimeMillis() - this.id_break[id_private[41]]) >= id_implements[3] && rrfo_3.id_protected() ? id_catch[12] : id_catch[13];
      }
   }

   private static void id_throw() {
      id_private = new short[]{
         0,
         0,
         0,
         1,
         8,
         9,
         0,
         1,
         3,
         64,
         3,
         4,
         0,
         4,
         56,
         57,
         7,
         7,
         7,
         8,
         0,
         7,
         5,
         5,
         5,
         3,
         3,
         3,
         2,
         0,
         8,
         0,
         2,
         57,
         8,
         0,
         2,
         55,
         57,
         6,
         2,
         6,
         4,
         5,
         2,
         2,
         4,
         64,
         57,
         1,
         57,
         1,
         55,
         57,
         56,
         57,
         57,
         1,
         56,
         56,
         2,
         4,
         5,
         7,
         8,
         8,
         57,
         57,
         9,
         1,
         0,
         3
      };
   }

   private static void id_try() {
      id_finally = new String[]{
         new String("Auto Explosion"),
         new String("Автоматически взрывает кристалл\nпосле установки обсидиана"),
         new String("Смотреть на кристалл"),
         new String("Коррекция движения")
      };
   }

   private static void id_while() {
      id_throws = new byte[]{2, 10, -1, -3, 25, 10, 5, 6, 7};
   }

   private static void id_public() {
      id_byte = new long[1];
   }

   @Override
   public float id_private() {
      return id_implements[5];
   }

   @Override
   public rrTf_1 aL_() {
      this.id_return();
      return (rrTf_1)this.id_break[id_private[68]];
   }
}

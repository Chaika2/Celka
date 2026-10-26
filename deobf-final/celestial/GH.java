package celestial;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GH extends bq_3 implements ru_3 {
   private static String[] throws_;
   private static short[] catch_;
   private static byte[] private_;
   public Object[] break_;
   private static boolean[] implements_;

   @Override
   public boolean byte_() {
      this.extends_();
      return (rfH_2)this.break_[0] != null ? true : implements_[1];
   }

   public GH(C_class var1) {
      super(var1);
      this.extends_();
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{85, -23, -63, 82, 31, -30, 115, 19}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void class_(int var1, int var2) {
      this.extends_();
      rfH_2 var7 = new rfH_2(var1, 0, var2);
      this.break_[0] = var7;
      Integer var8 = 0;
      this.break_[2] = var8;
   }

   @Override
   public String class_() {
      this.extends_();
      return "Exploring around "
         + (rfH_2)this.break_[0]
         + ", distance completed "
         + (Integer)this.break_[2]
         + ", currently going to "
         + new rs_3(this.class_((rfH_2)this.break_[0], this.private_()));
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8400867671493055089L;
   }

   @Override
   public void class_(Path var1, boolean var2) throws Exception {
      this.extends_();
      Gw_1 var7 = new Gw_1(this, var1, var2);
      this.break_[1] = var7;
   }

   @Override
   public rn_3 class_(boolean var1, boolean var2) {
      this.extends_();
      if (var1) {
         this.case_("Failed");
         if ((Boolean)C_class.instanceof_().abstract_.class_[0]) {
            this.byte_("Exploration failed", true);
         }

         this.protected_();
         return null;
      } else {
         Gt_1 var3 = this.private_();
         if (!(Boolean)C_class.instanceof_().PN.class_[0] && var3.class_() == 0) {
            this.case_("Explored all chunks");
            if ((Boolean)C_class.instanceof_().abstract_.class_[0]) {
               this.byte_("Explored all chunks", false);
            }

            this.protected_();
            return null;
         } else {
            rP_2[] var4 = this.class_((rfH_2)this.break_[0], var3);
            if (var4 == null) {
               this.byte_("awaiting region load from disk");
               return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
            } else {
               return new rn_3(new rs_3(var4), (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[4]);
            }
         }
      }
   }

   private rP_2[] class_(rfH_2 var1, Gt_1 var2) {
      this.extends_();
      int var3 = var1.b_() >> 4;
      int var4 = var1.d_() >> 4;
      int var5 = Math.min(var2.class_(), (Integer)C_class.instanceof_().rR.class_[0]);
      ArrayList var6 = new ArrayList();
      int var7 = (Integer)C_class.instanceof_().Pm.class_[0];
      int var8 = (Integer)this.break_[2];

      while (true) {
         for (int var9 = -var8; var9 <= var8; var9++) {
            int var10 = var8 - Math.abs(var9);
            int var11 = 0;

            while (var11 < 2) {
               int var12 = (var11 * 2 - 1) * var10;
               int var13 = Math.abs(var9) + Math.abs(var12);
               if (var13 != var8) {
                  throw new IllegalStateException();
               }

               switch (((int[])Gp_1.class_[0])[var2.class_(var3 + var9, var4 + var12).ordinal()]) {
                  case 1:
                     return null;
                  case 2:
                  default:
                     int var14 = (var3 + var9 << 4) + 8;
                     int var15 = (var4 + var12 << 4) + 8;
                     int var16 = var7 << 4;
                     if (var9 < 0) {
                        var14 -= var16;
                     } else {
                        var14 += var16;
                     }

                     if (var12 < 0) {
                        var15 -= var16;
                     } else {
                        var15 += var16;
                     }

                     var6.add(new rfH_2(var14, 0, var15));
                  case 3:
                     var11++;
               }
            }
         }

         if (var8 % 10 == 0) {
            var5 = Math.min(var2.class_(), (Integer)C_class.instanceof_().rR.class_[0]);
         }

         if (var6.size() >= var5) {
            return var6.stream().map(var0 -> break_(var0.b_(), var0.d_())).toArray(rP_2[]::new);
         }

         if (var6.isEmpty()) {
            Integer var21 = var8 + 1;
            this.break_[2] = var21;
         }

         var8++;
      }
   }

   private static rP_2 break_(int var0, int var1) {
      return (rP_2)(C_class.instanceof_().rP.class_[0] == -1 ? new rX_2(var0, var1) : new Gy_1(var0, var1));
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 712789841;
   }

   private static void finally_() {
      catch_ = new short[]{0, 0, 2, 1, 1, 1, 0, 0, 0, 0, 1, 4, 0, 0, 2, 0, 0, 2, 0, 0, 0, 2, 0, 0};
   }

   private void extends_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
         Object[] var1 = this.break_;
         var1[2] = 0;
      }
   }

   private static void implements_() {
      implements_ = new boolean[]{true, false, false, false, true, false, false, true, false, true, false};
   }

   @Override
   public void protected_() {
      this.extends_();
      super.protected_();
      Object var5 = null;
      this.break_[0] = var5;
   }

   public Gt_1 private_() {
      this.extends_();
      Object var1;
      if ((Gt_1)this.break_[1] != null) {
         var1 = new GT(this, (Gt_1)this.break_[1], new Gq_1(this));
      } else {
         var1 = new Gq_1(this);
      }

      return (Gt_1)var1;
   }

   private static void volatile_() {
      private_ = new byte[]{4, 4, 2, 2, 4, 8, 4, 8, 4, 10, -1, 3, 2};
   }

   private static void native_() {
      throws_ = new String[]{
         new String("Failed"),
         new String("Exploration failed"),
         new String("Explored all chunks"),
         new String("Explored all chunks"),
         new String("awaiting region load from disk")
      };
   }
}

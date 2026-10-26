package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrCW extends rrCk_1 {
   private static byte[] byte_;
   public Object[] break_;
   private static short[] protected_;
   private static long[] case_;
   private static boolean[] catch_;

   @Override
   public void byte_() {
      this.private_();
      if ((Integer)this.break_[1] == -1) {
         Pair var1 = this.continue_().this_();
         int var2 = (Integer)var1.getRight();
         if (var2 >= 0) {
            boolean var3 = ((cb_3)import_.class_[57]).Sn().public_();
            int var4 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).case_();
            if (var2 > 8) {
               ((rrfP_2)this.break_[0]).class_(((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_);
               Long var9 = System.currentTimeMillis();
               this.break_[2] = var9;
               ((Ax_1)import_.class_[55]).break_(var2);
               ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rZb_1(rZM.SWAP_ITEM_WITH_OFFHAND, rfH_2.protected_, rpr_3.DOWN));
               ((Ax_1)import_.class_[55]).break_(var2);
               if (var3 || ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var4).class_()) {
                  Integer var10 = var4;
                  this.break_[1] = var10;
                  return;
               }
            } else {
               ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rme_3(var2));
               ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rZb_1(rZM.SWAP_ITEM_WITH_OFFHAND, rfH_2.protected_, rpr_3.DOWN));
               ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rme_3(((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_));
            }

            if ((Integer)this.break_[1] == -1) {
               Integer var11 = var2;
               this.break_[1] = var11;
               Boolean var12 = true;
               this.class_[0] = var12;
            }
         }
      }
   }

   public rrCW(AutoTotem var1) {
      super(var1);
      this.private_();
      rrfP_2 var6 = new rrfP_2();
      this.break_[0] = var6;
      Integer var7 = -1;
      this.break_[1] = var7;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1712092383;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4025807906270743502L;
   }

   @EventTarget
   public void class_(rrLu_1 var1) {
      this.private_();
      ((rrfP_2)this.break_[0]).class_(var1);
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.private_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((rrfP_2)this.break_[0]).class_(System.currentTimeMillis() - this.break_[2] > 200L ? true : catch_[1]);
         if (this.continue_().super_() && ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).implements_(new rdn_3(rdy_3.kL))) {
            this.byte_();
            return;
         }

         this.class_();
      }
   }

   @Override
   public void class_() {
      this.private_();
      if ((Integer)this.break_[1] > -1) {
         if ((Integer)this.break_[1] > 8) {
            ((Ax_1)import_.class_[55]).break_((Integer)this.break_[1]);
            ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rZb_1(rZM.SWAP_ITEM_WITH_OFFHAND, rfH_2.protected_, rpr_3.DOWN));
            ((Ax_1)import_.class_[55]).break_((Integer)this.break_[1]);
         } else {
            ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rme_3((Integer)this.break_[1]));
            ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rZb_1(rZM.SWAP_ITEM_WITH_OFFHAND, rfH_2.protected_, rpr_3.DOWN));
            ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rme_3(((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_));
         }

         this.implements_();
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{101, -77, -57, 103, 95, 116, -112, 41}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      protected_ = new short[]{
         0,
         1,
         0,
         0,
         2,
         57,
         1,
         0,
         1,
         57,
         57,
         1,
         0,
         57,
         1,
         2,
         55,
         57,
         0,
         55,
         57,
         1,
         1,
         57,
         0,
         57,
         0,
         57,
         0,
         57,
         1,
         1,
         1,
         0,
         1,
         1,
         55,
         1,
         57,
         0,
         55,
         1,
         57,
         0,
         1,
         57,
         0,
         57,
         0,
         57,
         1,
         1,
         0
      };
   }

   private static void finally_() {
      byte_ = new byte[]{-1, -1, 8, -1, -1, 8, -1, 3, 2};
   }

   private static void extends_() {
      case_ = new long[]{200L, 0L};
   }

   private static void case_() {
      catch_ = new boolean[]{true, false, true, false, true, false};
   }

   private void implements_() {
      this.private_();
      Integer var5 = -1;
      this.break_[1] = var5;
      Boolean var6 = false;
      this.class_[0] = var6;
   }

   private void private_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
         this.break_[1] = 0;
         this.break_[2] = 0L;
      }
   }

   @Override
   public boolean aK_() {
      this.implements_();
      return super.aK_();
   }
}
